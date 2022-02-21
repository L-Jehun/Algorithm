import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2941{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] word = br.readLine().toCharArray();
		int cnt=0;
		
		for(int i=0;i<word.length-1;i++) {		
			switch (word[i]) {
			case 'c':
				if(word[i+1]=='=') word[i+1]=' ';
				if(word[i+1]=='-') word[i+1]=' ';	
				break;
			case 'd':
				if(word[i+1]=='z') {
					if (i<word.length-2 && word[i+2]=='=') {
					word[i+1]=' ';
					word[i+2]=' ';
					}
				}
				else if(word[i+1]=='-') word[i+1]=' ';
				break;
			case 'l':
				if(word[i+1]=='j')word[i+1]=' ';
				break;
			case 'n':
				if(word[i+1]=='j')word[i+1]=' ';
				break;
			case 's':
				if(word[i+1]=='=')word[i+1]=' ';
				break;
			case 'z':
				if(word[i+1]=='=')word[i+1]=' ';
				break;

			default:
				break;
			}
		}
		for(int i=0;i<word.length;i++) {
			if(word[i]!=' ') cnt++;
		}
		System.out.println(cnt);
	}
	
}