
public class Pattern2 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=4;i++) {
			for(int sp=3;sp>=i;sp--)
				System.out.print(" ");
			System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print(" * ");
			
			System.out.println();
		}
		for(i=1;i<=3;i++) {
			for(int sp=1;sp<=i;sp++)
				System.out.print(" ");
			System.out.print(" ");
			for(j=4-i;j>=1;j--)
				System.out.print(" * ");
			
			System.out.println();
		}

	}

}
