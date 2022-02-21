import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_2941_2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String words = br.readLine();
		char [] alph = new char [words.length()];
		int sum = words.length();
		for(int i=0;i<words.length();i++) {
			alph[i] = words.charAt(i);
		}
		for(int i=0;i<words.length();i++) {
			switch (alph[i]) {
			case 'c':
				if(i+1<words.length() && (alph[i+1] == '=' || alph[i+1] == '-')) {
					sum--;
				}
				break;
			case 'd':
				if( (i+1<words.length() && alph[i+1] == '-') ) {
					sum--;
				}
				if((i+2<words.length() && ( alph[i+1] == 'z' && alph[i+2] == '='))) {
					sum--;
				}
				break;
			case 'l':
				if(i+1<words.length() && alph[i+1] == 'j' ) {
					sum--;
				}
				break;
			case 'n':
				if(i+1<words.length() && alph[i+1] == 'j' ) {
					sum--;
				}
				break;
			case 's':
				if(i+1<words.length() && alph[i+1] == '=') {
					sum--;
				}
				break;
			case 'z':
				if(i+1<words.length() && alph[i+1] == '=' ) {
					sum--;
				}
				break;			
			}			
		}
		System.out.println(sum);
	}		
}