package test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.util.ArrayList;
import java.util.List;
import network.*;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class pongRev extends JFrame implements KeyListener {
	
	private static final int CIRCLE_X = 50;
	private static final int CIRCLE_Y = 50;
	private static final int CIRCLE_DIAMETER = 500;
	private static final int CIRCLE_CENTER = CIRCLE_X + (CIRCLE_DIAMETER / 2);
	public double paddleRotation = 0;
	Rectangle paddle = new Rectangle(540, 280, 20, 40);
	Shape shape = new Rectangle(540, 280, 20, 40);
	boolean blah = false;
	private Image dbImage;
	private Graphics dbg; 
	private int otherColor = 240;
	private int change = 0;
	int rotate = 0;
	int rotateChange = 0;
	int rotateZ = 10;
	int rotateChangeZ = 0;
	private int otherColorZ = 0;
	private int changeZ = 0;
	int explode = 0;
	int shardN=15;
	int shardX[] = new int[shardN];
	int shardY[] = new int[shardN];
	int shardXZ[] = new int[shardN];
	int shardYZ[] = new int[shardN];
	int shardXS[] = new int[shardN];
	int shardYS[] = new int[shardN];
	int shardS[] = new int[shardN];
	Color shardC[] = new Color[shardN];
	Image backG = Toolkit.getDefaultToolkit().getImage("assets/backS.gif");
	Image score = Toolkit.getDefaultToolkit().getImage("assets/score.png");
	private boolean a;
	private boolean d;
	List<TPosition> positions;
	TBall ball1;
	
    
	@SuppressWarnings("deprecation")
	public pongRev()
	{
		super( "Pong Revolution" );
		positions = new ArrayList<TPosition>();
		positions.add(new TPosition(100, 300));
		positions.add(new TPosition(320, 320));
		ball1 = new TBall(positions, TPowerUp.NONE, TPlayer.NONE, false);
		System.out.println(ball1.positions.get(0).xPos);
        setBackground(Color.black );
        setForeground(Color.white);
        setSize( 900, 600 );
        //paddle = new Rectangle(540, 280, 20, 40);
        this.addKeyListener(this);
        show();

	}
	
	public void paint(Graphics g)
	{	
		if (dbImage == null) 
		{
			dbImage = createImage (this.getSize().width, this.getSize().height); 
			dbg = dbImage.getGraphics (); 
		} 
		
		dbg.drawLine(600, 0, 600, 600);
		
		//Graphics2D g2d = ( Graphics2D ) g;
		//dbg.setColor(Color.black);
		//dbg.fillOval(CIRCLE_X, CIRCLE_Y, CIRCLE_DIAMETER, CIRCLE_DIAMETER);
		//dbg.fillRect(601,0,300,600);
		//dbg.setColor (getBackground ()); 
		//dbg.fillRect (0, 0, this.getSize().width, this.getSize().height); 
		
		dbg.drawImage(backG,6,6,this);
		dbg.drawImage(score,600,0,this);
		if(explode ==205)
		{		
			for(int z =0; z<shardN; z++)
			{
				shardX[z]=300+(int)(Math.random()*10);
				shardY[z]=300+(int)(Math.random()*10);
				shardXZ[z]=(int)(Math.random()*3);
				shardYZ[z]=(int)(Math.random()*3);
				shardXS[z]=(int)(Math.random()*5);
				shardYS[z]=(int)(Math.random()*5);
				shardS[z]=4;
				shardC[z]=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
			}
		}
		if(explode>=100)
		{
			explode--;
			for(int z =0; z<shardN; z++)
			{
				if(shardXZ[z]==0)
					shardX[z]+=shardXS[z];
				else
					shardX[z]-=shardXS[z];
				if(shardYZ[z]==0)
					shardY[z]+=shardYS[z];
				else
					shardY[z]-=shardYS[z];
			
				dbg.setColor(shardC[z]);
				if(explode%50==0)
					shardS[z]--;
				dbg.fillOval(shardX[z], shardY[z], shardS[z], shardS[z]);
			}
		}
		
		/*else
		{
			dbg.setColor(Color.green);
			dbg.fillOval(300, 300, 10, 10);
			
			dbg.setColor(new Color(otherColorZ,255,otherColorZ));
			dbg.drawOval(305-rotate/2, 295, rotate, 20);
			
			dbg.setColor(new Color(otherColor,255,otherColor));
			dbg.drawOval(295, 305-rotateZ/2, 20, rotateZ);
			if(rotateChange == 0)
				rotate ++;
			if(rotateChange == 1)
				rotate --;
			
			if(rotate >= 20)
				rotateChange = 1;
			if(rotate <= 0)
				rotateChange = 0;
				
			if(rotateChangeZ == 0)
				rotateZ ++;
			if(rotateChangeZ == 1)
				rotateZ --;
			
			if(rotateZ >= 20)
				rotateChangeZ = 1;
			if(rotateZ <= 0)
				rotateChangeZ = 0;
			
			if(changeZ == 0)
				otherColorZ +=1;
			if(changeZ == 1)
				otherColorZ -= 1; 
			
			if(otherColorZ>=255)
				changeZ = 1;
			if(otherColorZ<=0)
				changeZ = 0;
		}*/
		
		
		dbg.setColor(Color.green);
		dbg.fillOval((int)ball1.positions.get(0).xPos, (int)ball1.positions.get(0).yPos, 10, 10);
		
		if(change == 0)
			otherColor +=1;
		if(change == 1)
			otherColor -= 1; 
		
		if(otherColor>=255)
			change = 1;
		if(otherColor<=0)
			change = 0;
		
		dbg.setColor(new Color(otherColor,otherColor,255));
		
		
		if(shape != null) {
			//dbg.draw(shape);
			((Graphics2D) dbg).fill(shape);
		}
		//paint(dbg); 		
		//dbg.setColor(Color.white);
		//dbg.drawOval(CIRCLE_X, CIRCLE_Y, CIRCLE_DIAMETER, CIRCLE_DIAMETER);
		g.drawImage(dbImage, 0, 0, this);
	}
	
	public void update(Graphics g)
	{
		repaint();
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		char c = arg0.getKeyChar();
		if(c == 'a') 
		{
			/*AffineTransform tx = new AffineTransform();
			paddleRotation += 3;
			tx.rotate(Math.toRadians(paddleRotation), CIRCLE_CENTER, CIRCLE_CENTER);
			//double x = 240 * Math.cos(Math.toRadians(paddleRotation)) + CIRCLE_CENTER;
			//double y = 240 * Math.sin(Math.toRadians(paddleRotation)) + CIRCLE_CENTER;
			shape = (Path2D) tx.createTransformedShape(paddle);*/
			a = true;
		} 
		else if (c == 'd') 
		{
			/*AffineTransform tx = new AffineTransform();
			paddleRotation -= 3;
			tx.rotate(Math.toRadians(paddleRotation), CIRCLE_CENTER, CIRCLE_CENTER);
			//double x = 240 * Math.cos(Math.toRadians(paddleRotation)) + CIRCLE_CENTER;
			//double y = 240 * Math.sin(Math.toRadians(paddleRotation)) + CIRCLE_CENTER;
			shape = (Path2D) tx.createTransformedShape(paddle);
			this.repaint();*/
			d = true;
		}
		else if (c == 'w')
		{
			//explode = 205;
		}
		else if (c == 's')
		{
			explode = 205;
		}
	}
	
	private void movePaddle() throws InterruptedException {
	    while (true) {
	        Thread.sleep(15);
	        this.repaint();
	        if (a && d) {
	        } else if (a) {
	            moveA();
	        } else if (d) {
	            moveD();
	        }
	    }
	}
	
	private void moveA() {
        AffineTransform tx = new AffineTransform();
        paddleRotation += 1.5;
        tx.rotate(Math.toRadians(paddleRotation), CIRCLE_CENTER, CIRCLE_CENTER);
        //double x = 240 * Math.cos(Math.toRadians(paddleRotation)) + CIRCLE_CENTER;
        //double y = 240 * Math.sin(Math.toRadians(paddleRotation)) + CIRCLE_CENTER;
        shape = (Path2D) tx.createTransformedShape(paddle); 
	}

	private void moveD() {
	    AffineTransform tx = new AffineTransform();
        paddleRotation -= 1.5;
        tx.rotate(Math.toRadians(paddleRotation), CIRCLE_CENTER, CIRCLE_CENTER);
        //double x = 240 * Math.cos(Math.toRadians(paddleRotation)) + CIRCLE_CENTER;
        //double y = 240 * Math.sin(Math.toRadians(paddleRotation)) + CIRCLE_CENTER;
        shape = (Path2D) tx.createTransformedShape(paddle);
	}

	public static void main(String[] args) {
		final pongRev pr = new pongRev();
		(new Thread() {
            public void run() {
                try {
                	while(true)
                	{
                		pr.movePaddle();
                	}
                }
                catch(InterruptedException e) {}
            }
        }).start();

		pr.addWindowListener(new WindowAdapter()
		{
			 public void windowClosing( WindowEvent e )
             {
             System.exit( 0 );
             }
		});
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		char c = arg0.getKeyChar();
		if(c == 'a') {
			a = false;
		} else if (c == 'd') {
			d = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}