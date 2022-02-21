import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_5622 {
	public static void main(String[] args) throws IOException{
		String [] num = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int sum=0;
		for(int i=0;i<word.length();i++) {
			char chr = word.charAt(i);
			for(int j=0;j<8;j++) {
				if(num[j].contains(Character.toString(chr))) {
					sum+=(j+3);
				}
			}
		}
		System.out.println(sum);
	}		
}