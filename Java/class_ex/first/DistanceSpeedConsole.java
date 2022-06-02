package class_ex.first;

import java.util.Scanner;

public class DistanceSpeedConsole {

	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("거리(Km)와 속력(Km/h)을 입력하세요.\n");
		System.out.print("거리(Km) : ");
		int interval = sc.nextInt();
		System.out.print("속력(Km/h) : ");
		int speed = sc.nextInt();
		
		
		DistanceSpeed ds = new DistanceSpeed();
		int hour, over;
		hour = ds.hour(interval, speed);
		over = ds.over(interval, speed);
		System.out.printf("\n%d시간 걸리고 %d(km)가 남습니다",hour,over);
	}
}
