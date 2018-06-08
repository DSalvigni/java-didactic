
public class App {

	public static void main(String[] args) {
		Amici amici = Amici.ANIMALE01;
		
		switch(amici) {
		case ANIMALE01:
			System.out.println("Sono "+amici.getName());
			break;
		case ANIMALE02:
			System.out.println("Sono "+amici.toString());
			break;
		case ANIMALE03:
			System.out.println("Sono "+amici.toString());
			break;
		case ANIMALE04:
			System.out.println("Sono "+amici.toString());
			break;  
		default:
			break;
		
		}
		
		
		System.out.println(Amici.ANIMALE01.name());

	}

}
