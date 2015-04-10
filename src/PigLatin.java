import java.util.*;

public class PigLatin {
	public static void main(String args[]) {
		String begin = "";
		char tchar;
		int sptx = -1;
		String cvtd = "";
		
		Scanner keyboard = new Scanner(System.in);
		begin = keyboard.nextLine();
		String[] slated = begin.split("\\s+");
		
		System.out.println("");
		
		for (int i = 0; i < slated.length; i++) {
			String temp = slated[i];
			for (int o = 0; o < temp.length(); o++){
				tchar = temp.charAt(o);
				if (sptx == -1){
					switch (tchar){
						case 'a' :
						case 'A' :
						case 'e' :
						case 'E' :
						case 'i' :
						case 'I' :
						case 'o' :
						case 'O' :
						case 'u' :
						case 'U' :
							sptx = o;
							break;
					}
				}
			}
			for (int o = 0; o < temp.length(); o++){
				cvtd = temp.substring(sptx, temp.length()) + temp.substring(0, sptx) + "ay";
			}
			System.out.println("");
			for (int o = 0; o < cvtd.length(); o++){
				tchar = cvtd.charAt(o);
				System.out.print(tchar);
			}
		}
	}
}