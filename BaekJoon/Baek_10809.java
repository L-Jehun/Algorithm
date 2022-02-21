import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_10809{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		char alpa='a';
		ArrayList<Character> word = new ArrayList<>();
		for(int i=0;i<n.length();i++) {
			word.add(n.charAt(i));			
		}
		int [] arr = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		//System.out.println(word.get(2));
		for(int i=0;i<n.length();i++) {
			for(int j=0;j<26;j++) {
				if(word.get(i)==alpa) {
					if(arr[j]==-1) {
						arr[j]=i;
						
					}
				}
				alpa++;
			}	
			alpa='a';
		}
		for(int i=0;i<26;i++) {
			System.out.print(arr[i]+" ");
		}
	    }		
}
