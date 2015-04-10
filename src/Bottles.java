public class Bottles {
	
	 public static void main(String args[]) {
	
		for( int a = 99; a > 0 ; a = a-1)
		{
			if ( a != 1){
				System.out.println(a + " wood logs in the shed.");
				System.out.println(a + " wooden logs.");
				System.out.println("Take one out, burn it up");
				System.out.println(a-1 + " wooden logs in the shed.");
				System.out.println("");
			} else {
				System.out.println(a + " wood log in the shed.");
				System.out.println(a + " wooden log.");
				System.out.println("Take it out, burn it up");
				System.out.println("no more wooden logs in the shed.");
			}
		}
	}
}