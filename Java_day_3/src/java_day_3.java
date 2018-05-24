import java.util.Scanner;

public class java_day_3 {

	public static void main(String[] args) {
		
		System.out.println("ievadi savu vaardu: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		System.out.println("Tavs vaards ir ir: " + str);
		
		str = str.concat(" tu esi kruts!");
		System.out.println(str);

		str = str + " Tiesham ljoti kruts!";
		System.out.println(str);
		
		if (str.length()> 10) {
			str = str.concat(" YEP, KRUTAIS!!!");
		}

		System.out.println(str);
		
	

	}

}
