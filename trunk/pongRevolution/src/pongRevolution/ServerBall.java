package pongRevolution;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;

public class ServerBall {
	private double vx, vy;
	private int x, y;
	
	private int combo;
	
	public ServerBall() {
		x = 0;
		y = 0;
		combo = 0;
		
		// Create a random direction for the ball
		double vSq = Math.pow(GameSettings.COMBO_SPEED[0], 2);
		double vxSq = Math.random() * vSq;
		double vySq = vSq - vxSq;
		vx = Math.sqrt(vxSq);
		vy = Math.sqrt(vySq);
		if(Math.random() > 0.5) {
			vx = -vx;
		}
		if(Math.random() > 0.5) {
			vy = -vy;
		}
	}
	
	/**
	 * Translate the ball.
	 */
	public void translate(double dx, double dy) {
		x += dx;
		y += dy;
	}
	
	/**
	 * Sets the horizontal velocity.
	 * @param vx the new horizontal velocity
	 */
	public void setVX(double vx) {
		this.vx = vx;
	}
	
	/**
	 * Sets the vertical velocity.
	 * @param vy the new vertical velocity
	 */
	public void setVY(double vy) {
		this.vy = vy;
	}
	
	/**
	 * Gets the horizontal velocity.
	 * @return the current horizontal velocity
	 */
	public double getVX() {
		return vx;
	}
	
	/**
	 * Gets the vertical velocity.
	 * @return the current vertical velocity
	 */
	public double getVY() {
		return vy;
	}
	
	public void move() {
		x += vx;
		y += vy;
		// TODO: check for collisions
	}
	
	public void increaseCombo() {
		combo++;
		// TODO: Adjust vx and vy
		
	}
	
	public void resetCombo() {
		combo = 1;
		// TODO: Adjust vx and vy
	}

	/**
	 * Checks if the ball contains a point
	 * @param p the point
	 */
	public boolean contains(Point2D p) {
		Ellipse2D circle = new Ellipse2D.Double(x, y, 2 * GameSettings.BALL_RADIUS, 2 * GameSettings.BALL_RADIUS);
		return circle.contains(p);
	}

	/**
	 * Gets the bounds of the ball
	 * 
	 * @return the rectangle containing the bounds
	 */
	public Rectangle2D getBounds() {
		return new Rectangle2D.Double(x, y, 2 * GameSettings.BALL_RADIUS, 2 * GameSettings.BALL_RADIUS);
	}
	
	/**
	 * Gets the optimal connection point on the ball.
	 * @param other the other point that connects to the ball
	 */
	public Point2D getConnectionPoint(Point2D other) {
		double dx = other.getX() - x;
		double dy = other.getY() - y;
		double distance = Math.sqrt(dx * dx + dy * dy);
		if (distance == 0) {
			return other;
		} else {
			return new Point2D.Double(x + dx * GameSettings.BALL_RADIUS / distance, y + dy * GameSettings.BALL_RADIUS / distance);
		}
	}
}