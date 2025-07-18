import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1330_B5_104ms {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		if (a < b) {
			System.out.println("<");
		} else if (a > b) {
			System.out.println(">");
		} else {
			System.out.println("==");
		}
	}
}
