package recursion;

public class App {
public static void main(String[] args) {
		
		int num = 7;
    	Fibo a = new Fibo();
    	Factorial b = new Factorial();

    	
        for (int i = 1; i <= num; i++)
            System.out.println("Fibo-> "+ i + ": " + a.fibonacci(i));
        for (int i = 1; i <= num; i++)
        	System.out.println("Fact-> "+ i + ": " + b.fact(i));
    }

}
