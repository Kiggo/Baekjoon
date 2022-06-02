package lambda_ex;

public class MyFunctionalInterfaceEx3 {
	public static void main(String[] args) {
		MyFunctionalInterface3 fi;
		fi=(x,y)->{
			int res = x+y;
			return res; //값을 return
		};
		int res = fi.method(100, 200);
		System.out.println(res);
		fi=(x,y)->{return x+y;};
		fi.method(100, 200);
		System.out.println(res);
		fi=(x,y)->x+y;
		System.out.println(fi.method(100, 200));
		fi=(x,y)->sum(x,y);
		
		System.out.println(fi.method(100, 200));
	}
	
	public static int sum(int x, int y) {
		return x+y;
	}
}
