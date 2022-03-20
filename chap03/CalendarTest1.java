package chap03;

public class CalendarTest1 {

	public static void main(String[] args) {
		int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year=0, month=0, daysOfMonth=0, firstDay=0;
		int monthDays=0;
		int totalDays;
		
		int daysOfWeek = 0;
		if(args.length!=2) {
			//System.out.println("[사용법] java CalendarTest 년 월");
			year = 2015;
			month = 3;
		}else {
			year = Integer.parseInt(args[0]);
			month = Integer.parseInt(args[1]);
		}
		
		totalDays = (year*365); // 2014년도 까지의 일수를 윤년을 고래해서 구한다
		totalDays += year/4;
		totalDays -= year/100;
		totalDays += year/400;
		//////////////////////////////
		
		for(int i = 1; i<month; i++) {// 해당 년도에서 입력한 달 전까지의
			                          // 일수를 해당 년도가 윤년인지를 고려해서 계산한다.
			
			if(i==2) {
				if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
					monthDays=29;
				}else
					monthDays=days[i-1];
			}
			totalDays+=monthDays;
		}//end for
		firstDay=totalDays%7; //7로 나누어서 나머지를 이용해서 해당
		                      //월 첫 번째 날의 요일을 구한다
		///////////////////////
		if(month==2) {//윤년 여부를 판단해서 입력한 달의 날수를 정한다.
			
			if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
				daysOfMonth=29;
			}else {
				daysOfMonth=28;
			}
		}else {
			daysOfMonth=days[month-1];
		}
		
		System.out.println(" "+year+"년"+month+"월");
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------");
	}

}
