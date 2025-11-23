import java.util.Scanner;

public class GenerateUsingSingleInput2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		  int count;

	        if (a % 2 == 0) {
	            count = a - 1;
	        } else {
	            count = a;
	        }

	        int odd = 1;

	        for (int i = 1; i <= count; i++) {
	            System.out.print(odd);
	            if (i < count) {
	                System.out.print(", ");
	            }
	            odd += 2;
	        }
	}
}
