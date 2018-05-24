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
		
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str);
		
		System.out.println(str.substring(5));  //nogriezh pirmos 5 simbolus
		System.out.println(str.substring(5, 9));  // izgriezh un izvada simbolus starp 5. un 9. simbolu
		System.out.println(str.substring(5, str.length())); // izgriezh un izvada simbolus saakot no 5. liidz beigaam.
		System.out.println(str.substring(5, str.length()-10)); // izgriezh un izvada simbolus saakot no 5. 
		//liidz beigaam + nogriezh arii peedeejos 10 simbolus no beigaam.
		System.out.println("teksts sastaav no: " + str.length()+ " simboliem."); // paraada kopeejo stringag garumu
		
		System.out.println(str.contains("kruts")); //boolean vai stringaa ir "kruts"
		System.out.println(str.contains("KRUTS")); // burtu lielums ir svariigs
		System.out.println("kruts".equalsIgnoreCase("KRUTS")); // saliidzina stringus lai nenjem veeraa lielos burtus
		




	

	}

}
