package pongRevolution;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import network.TGameState;
import network.TPaddle;
import network.TPlayer;

public class Game {	
	private List<ServerBall> ballList;
	private ServerPaddle[] paddleArray;
	private int redScore, blueScore;
	private int ballSpawnTime;
	
	public Game() {
		ballList = new ArrayList<ServerBall>();
		paddleArray = new ServerPaddle[5];
	}
	
	public void resetGame() {
		ballList.clear();
		redScore = 0;
		blueScore = 0;
		ballSpawnTime = GameSettings.GAME_START_DELAY;
		// TODO: wipe any paddle attributes
	}
	
	public void movePaddle(TPlayer requester, boolean clockwise) {
		paddleArray[requester.getValue()].move(clockwise);
	}
	
	public void jumpPaddle(TPlayer requester) {
		paddleArray[requester.getValue()].jump();
	}
	
	public void usePowerup(TPlayer requester) {
		// TODO: check which powerup the player has, apply effects, some sort of timer
	}
	
	public TPlayer registerPlayer(TPlayer team) {
		TPlayer player = team;
		if(team == TPlayer.RED_ONE || team == TPlayer.RED_TWO) {
			if(paddleArray[TPlayer.RED_ONE.getValue()] == null) {
				player = TPlayer.RED_ONE;
				paddleArray[player.getValue()] = new ServerPaddle(player);
				return player;
			}
			else if(paddleArray[TPlayer.RED_TWO.getValue()] == null) {
				player = TPlayer.RED_TWO;
				paddleArray[player.getValue()] = new ServerPaddle(player);
				return player;
			}
			else {
				return TPlayer.NONE;
			}
		}
		else if(team == TPlayer.BLUE_ONE || team == TPlayer.BLUE_TWO){
			if(paddleArray[TPlayer.BLUE_ONE.getValue()] == null) {
				player = TPlayer.BLUE_ONE;
				paddleArray[player.getValue()] = new ServerPaddle(player);
				return player;
			}
			else if(paddleArray[TPlayer.RED_TWO.getValue()] == null) {
				player = TPlayer.BLUE_TWO;
				paddleArray[player.getValue()] = new ServerPaddle(player);
				return player;
			}
			else {
				return TPlayer.NONE;
			}
		}
		else {
			return TPlayer.NONE;
		}
	}
	
	/**
	 * Updates the balls to their next position
	 */
	public void moveBalls() {
		for(ServerBall ball : ballList) {
			ball.move();
		}
		checkCollision();
	}
	
	/**
	 * Updates the paddles to their next position (up/down-wise)
	 */
	public void movePaddles() {
		
	}
	
	/**
	 * Checks for collision
	 */
	public void checkCollision() {
		for (int i = 1; i < 5; i++) {
			for (ServerBall ball : ballList) {
				Point2D[] points = paddleArray[i].getConnectionPoints(new Point2D.Double(ball.getX(), ball.getY()));
				double paddleDiagonal = Math.sqrt(Math.pow(GameSettings.PADDLE_HEIGHT / 2, 2) + Math.pow(GameSettings.PADDLE_LENGTH / 2, 2));
				if (ball.contains(points[0])) {
					if (points[0].distance(new Point2D.Double(paddleArray[i].getX(), paddleArray[i].getY())) <= paddleDiagonal) {
						ball.setT(Math.PI + 2 * paddleArray[i].getT() - ball.getT());
					}
				}
				if (ball.contains(points[1])) {
					if (points[1].distance(new Point2D.Double(paddleArray[i].getX(), paddleArray[i].getY())) <= paddleDiagonal) {
						ball.setT(Math.PI + 2 * paddleArray[i].getT() - ball.getT());
					}
				}
				if (ball.contains(points[2])) {
					if (points[2].distance(new Point2D.Double(paddleArray[i].getX(), paddleArray[i].getY())) <= paddleDiagonal) {
						ball.setT(2 * paddleArray[i].getT() - ball.getT());
					}
				}
				if (ball.contains(points[3])) {
					if (points[3].distance(new Point2D.Double(paddleArray[i].getX(), paddleArray[i].getY())) <= paddleDiagonal) {
						ball.setT(2 * paddleArray[i].getT() - ball.getT());
					}
				}
			}
		}
	}
	
	public TGameState getState() {
		List<TPaddle> paddleList = new ArrayList<TPaddle>();
		for(int i = 1; i < 5; i++) {
			ServerPaddle paddle = paddleArray[i];
			if(paddle != null) {
				paddleList.add(paddle.getTPaddle());
			}
		}
		return new TGameState(paddleList,null,0,0,false,false,false,null,null);
	}
}
