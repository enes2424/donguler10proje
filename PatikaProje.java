import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n1 sayısını giriniz : ");
		int n1 = input.nextInt();
		
		System.out.print("n2 sayısını giriniz : ");
		int n2 = input.nextInt(), ebob = n1, x = n1 - n2;
		if (x < 0) x = -x;
		while (x > 0) {
			if (n1 % x == 0 && n2 % x == 0) {
				ebob = x;
				break;
			}
			x--;
		}
		System.out.println("EBOB : " + ebob + ", EKOK : " + n1 * n2 / ebob);
	}

}
