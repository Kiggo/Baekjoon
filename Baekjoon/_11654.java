import java.io.IOException;
import java.io.InputStream;

public class _11654 {
	public static void main(String[] args) {
		InputStream is = System.in;
		int asciiCode;
		try {
			asciiCode = is.read();
			System.out.println(asciiCode);
		} catch (IOException e) {}
	}
}
