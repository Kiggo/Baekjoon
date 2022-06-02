package class_ex.anonymous;

public class Anonymous {
	//필드 값에 대입
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다");
		}
		@Override
		void wake() {
			System.out.println("6에 일어남");
			work();
		}
	};
	void method1() {
		Person localVal = new Person() {
			void walk() {
				System.out.println("산책합니다");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어남");
				walk();
			}
		};
		localVal.wake();
	}
	void method2(Person person) {
		person.wake();
	}
}
