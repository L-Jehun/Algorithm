class cos_1_1 {
    public long solution(long num) {
        num++;
        int digit=1;;
        while(num/digit%10==0) {
        	num+=digit;
        	digit*=10;
        }
        
        return num;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
    	cos_1_1 sol = new cos_1_1();
        long num = 9949999;
        long ret = sol.solution(num);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}