package innerclass;

class CPU {
	class Processor {
		double cores;
		String manufacture;
		
		double getCashe() {
			return 4.3;
		}
	}
	class RAM {
		double memory;
		String manufacture;
		
		double getClockSpeed() {
			return 5.5;
		}
	}
}
public class InnerTest {
	public static void main(String[] args) {
		CPU cpu = new CPU();
		CPU.Processor processor = cpu.new Processor();
		CPU.RAM ram = cpu.new RAM();
		System.out.println("Processor Cache: "+processor.getCashe());
		System.out.println("Ram Clock Speed: "+ram.getClockSpeed());
	}
}
