package lambda_ex;

public class MyFunctionalInterfaceEx2 {
	public static void main(String[] args) {
		MyFunctionalInterface2 fi;
		fi=(x)->{
			int res = x*100;
			System.out.println(res);
		};
		fi.method(5);
		fi=(x)->{System.out.println(x*100);};
		fi.method(6);
		fi=x->System.out.println(x*100);
		fi.method(6);
	}
}
