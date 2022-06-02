package lambda_ex;

public class MyFunctionalInterfaceEx {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		fi=()->{
			String str = "methrod()1 call 1111...";
			System.out.println(str);
		};
		fi.method();
		
		fi=()->{System.out.println("method()1 call 2222...");};
		fi.method();
		fi=()->System.out.println("method()1 call 2222...");
		fi.method();
	}
}
