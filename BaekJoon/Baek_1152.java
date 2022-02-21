import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_1152 {
 
	public static void main(String[] args) throws IOException{
		System.out.print(new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine()," ").countTokens());
	}
}