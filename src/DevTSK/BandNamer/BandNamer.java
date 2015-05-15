/* Gabe Hill working on the file IO for the words
 * Zack Arbanas is working on collecting and organizing words to use
 * Tim Austin is working on the GUI; making buttons and text boxes and dropdown menuss
 */

package DevTSK.BandNamer;


import java.io.*;
import java.net.*;
//import java.nio.*;




public class BandNamer {

	public static void main(String[] args){
		String end;
		
		//System.out.println(BandNamer.class.getResource("/images/nounList.bnn"));
		
		String noun = getLst("/images/nounList.bnn");
		String verb = getLst("/images/verbList.bnn");
		String adv = getLst("/images/advList.bnn");
		String adj = getLst("/images/adjList.bnn");
	}
	
	public static String getLst(String path){
		String temp = "",s;
		URL uri = BandNamer.class.getResource(path);
		//System.out.println(path);
		//System.out.println(uri);
		try {
			BufferedReader br = new BufferedReader(new FileReader(uri.getPath()));
		
			while ((s = br.readLine()) != null) {
				System.out.print(s);
				temp = temp + s;
			}
		
			br.close();
		} catch (Exception e){
			e.printStackTrace();
		}
		return temp;
	}

}
