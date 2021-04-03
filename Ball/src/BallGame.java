import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	double x = 100;
	double y = 100;
//	boolean right = true;
	double degree = 3.14/3;
	double speed = 10;
	
	public void paint(Graphics g) {
		System.out.println("draw the window!");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
//		if (right){ 
//			x = x + 10;
//		}else {
//			x = x - 10;
//		}
//		
//		if (x > 856-40-30 || x < 0+40) {
//			right = !right;
//		}
		
		x = x + speed * Math.cos(degree);
		y = y + speed * Math.sin(degree);
		if (y > 500-40-30 || y < 0+40+40) {
			degree = -degree;
		}
		if (x > 856-40-30 || x < 0+40) {
			degree = 3.14 - degree;
		}
		if (speed > 0) {
			speed -= 0.05;
			if (speed < 0) {
				speed = 0;
			}
		}
	}
	

	void launchFrame() {
		setSize(856, 500);
		setLocation(300, 300);
		setVisible(true);
		while (speed > 0) {
			repaint();
			try {
				Thread.sleep(40);
			} catch (Exception e) {
				e.printStackTrace();// TODO: handle exception
			}
		}
		System.out.println("Game End!");
		System.exit(0);
	}
	

	public static void main(String[] args) {
		System.out.println("Game Start!");
		BallGame game = new BallGame();
		game.launchFrame();
	}
}