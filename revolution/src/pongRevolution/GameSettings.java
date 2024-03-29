package pongRevolution;

import network.TPlayer;
import network.TPower;
import network.TPowerUp;

public class GameSettings {
	/* Unchangeable */
	public static final int CLOCK_INTERVAL = 15;
	
	public static final int COLLISION_DECAY_TIME = 20;
	public static final int BALL_DECAY_TIME = 20;
	
	// Arena settings
	public static final int ARENA_RADIUS = 278;
	public static final double BALL_OUT_BUFFER = 22;
	public static final double STARTING_POSITIONS[] = {0, 0, 180, 90, 270};
	
	// Paddle settings
	public static final double PADDLE_LENGTH = 84;
	public static final double PADDLE_TOP = 40;
	public static final double PADDLE_HEIGHT = 14;
	public static final double PADDLE_VELOCITY = 1.5;
	public static final double PADDLE_SPEEDUP = PADDLE_VELOCITY * 1.5;
	
	public static final double PADDLE_JUMP_INIT_VELOCITY = 8;
	public static final double PADDLE_JUMP_ACCEL = 0.3;
	
	public static final double PADDLE_BOUNCE_ANGLE = 9;
	
	// Ball settings
	public static final int BALL_SPAWN_WARNING = 30;
	public static final double RANDOM_DIRECTION = -1;
	public static final double BALL_SPAWN_DIRECTION = RANDOM_DIRECTION;
	public static final int BALL_RADIUS = 5;
	public static final int COMBO_SCORE[] = {0, 10, 25, 45, 70, 100};
	public static final double INITIAL_SPEED = 3.5;
	public static final double COMBO_SPEED[] = {INITIAL_SPEED, 
												INITIAL_SPEED + .75, 
												INITIAL_SPEED + .75 * 2, 
												INITIAL_SPEED + .75 * 3,
												INITIAL_SPEED + .75 * 4,
												INITIAL_SPEED + .75 * 5,};
	
	public static final int COMBO_SLOTS[][] = {		{0, 0, 0, 0, 0},
													{0, 0, 0, 0, 0},
													{0, 4, 0, 0, 0},
													{0, 4, 7, 0, 0},
													{0, 3, 6, 9, 0},
													{0, 3, 6, 9, 12} };
	
	public static final int BALL_REHIT_TIME = 20;
	
	// Powerup settings
	public static final int[] POWERUP_TIME = {0, 5000 / CLOCK_INTERVAL, 5000 / CLOCK_INTERVAL, 15, 2000 / CLOCK_INTERVAL};
	public static final double HORIZONTAL_STUN_RANGE = 16; // in degrees
	public static final double VERTICAL_STUN_RANGE = 15; // in pixel widths
	public static final double STUN_SPEED = PADDLE_VELOCITY * 0.5;
	
	
	
	/* User Changeable */
	public static final int SERVER_PORT = 12020;
	
	public static boolean ENABLE_POWERUPS = true;
	public static int POINTS_FOR_WIN = 600;
	
	public static final int GAME_START_DELAY = 5000 / CLOCK_INTERVAL;	// delay is in game clock cycles
	public static final int BALL_RELEASE_INTERVAL = 2000 / CLOCK_INTERVAL;	// interval is in game clock cycles
	
	public static boolean SPAWN_BALL_TOWARDS_LOSER = true;
	public static final double BALL_SPAWN_RANGE = 15; // In degrees
	
	public static double POWERUP_SPAWN_RATE = 0.5;
	
	
	
	
	public static boolean isRed(TPlayer player) {
		return player == TPlayer.RED_ONE || player == TPlayer.RED_TWO;
	}

	public static boolean isBlue(TPlayer player) {
		return player == TPlayer.BLUE_ONE || player == TPlayer.BLUE_TWO;
	}
	
	public static TPower getNullPower() {
		return new TPower(0, TPowerUp.NONE, -1);
	}
}
