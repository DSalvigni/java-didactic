package polimorfismo;

public class Tree extends Plant{

	@Override
	public void Grow() {
		// TODO Auto-generated method stub
		System.out.println("Tree now is growing...");
	}
	
	public void tagliaFoglie() {
		System.out.println("Taglio le foglie dell´alberello...");
	}

}
