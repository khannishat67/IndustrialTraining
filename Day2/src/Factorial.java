import java.io.*;

public class Factorial {
	public static int fact(int n) {
		if(n==1 || n==0)
			return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String[] args)throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a number: ");
		int n=Integer.parseInt(br.readLine());
		
		int f = fact(n);
		System.out.println("Factorial of 5 : "+f);

	}

}
