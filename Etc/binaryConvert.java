
public class binaryConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 25 ;
		System.out.println("10 -> 2");
		System.out.println(Integer.toString(a,2));
		System.out.println("10 -> 3");
		System.out.println(Integer.toString(a,3));
		System.out.println("10 -> 4");
		System.out.println(Integer.toString(a,4));
		System.out.println("---------------------");
		
		String b = "1111";
		String c = "1011";
		System.out.println("2 -> 10");
		System.out.println(Integer.parseInt(b,2));
		System.out.println("3 -> 10");
		System.out.println(Integer.parseInt(b,3));
		System.out.println("---------------------");
		int num1 = Integer.parseInt(b,2);
		int num2 = Integer.parseInt(c,2);
		
		System.out.println(Integer.toString(num1+num2,2));
	}

}
