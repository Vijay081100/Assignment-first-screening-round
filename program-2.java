import java.util.Scanner;

public class GenerateUsingSingleInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			int odd = 2 * i -1;
			System.out.print(odd);
			
			if(i < a) {
				System.out.print(", ");
			}
		}
		sc.close();
	}
}
