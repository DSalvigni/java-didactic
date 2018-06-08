package polimorfismo;

public class App {

	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		Plant plant2 = plant1;
		Plant plant3 = tree;
		
		if(plant2.equals(plant1)) {
			System.out.println(plant2.hashCode()+" is the same OBJ of "+plant2.hashCode());
			} else
			{
				System.out.println("OBJs are different");
			}
	plant1.Grow();
	tree.Grow();
	//Overriden method which is growing our plant like a tree...
	plant3.Grow();
	
	//Ma non posso chiamare tale metodo per l´istanza plant3: infatti tree diventa un oggetto plant
	tree.tagliaFoglie();

	
		
	}
}
