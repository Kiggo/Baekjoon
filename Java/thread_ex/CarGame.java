package thread_ex;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {
	private JLabel label1;
	private JLabel label2; //레이블 하나가 자동차 한 대를 나타낸다
	private JLabel label3;
	
	int x1 = 100, x2 = 100, x3 = 100; //자동차의 x좌표
	
	class MyThread extends Thread{
		public void run() {
			for(int i = 0; i<120; i++) {
				try {
					Thread.sleep(100);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				x1 += (int)(Math.random()*10);
				label1.setBounds(x1, 0, 100, 100);
				x2+= (int)(Math.random()*10);
				label2.setBounds(x2, 100, 100, 100);
				x3 += (int)(Math.random()*10);
				label3.setBounds(x3, 200, 100, 100);
			}
		}
	}
	
	public CarGame() {
		setTitle("CarRace");
		setSize(600,400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		label1 = new JLabel();
		label1.setIcon(new ImageIcon("C:\\dev\\eclipse-workspace\\webtest\\src\\thread_ex\\car1.png"));
		label2 = new JLabel();
		label2.setIcon(new ImageIcon("C:\\dev\\eclipse-workspace\\webtest\\src\\thread_ex\\car2.jpg"));
		label3 = new JLabel();
		label3.setIcon(new ImageIcon("C:\\dev\\eclipse-workspace\\webtest\\src\\thread_ex\\car3.png"));
		add(label1);
		add(label2);
		add(label3);
		label1.setBounds(100, 0, 100, 100);
		label2.setBounds(100, 100, 100, 100);
		label3.setBounds(100, 200, 100, 100);
		(new MyThread()).start();
		setVisible(true);
		
	}
	public static void main(String[] args) {
		CarGame t = new CarGame();
	}
}
