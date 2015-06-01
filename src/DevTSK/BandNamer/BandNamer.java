/* Gabe Hill working on the file IO for the words
 * Zack Arbanas is working on collecting and organizing words to use
 * The_Silver_Kid overall project
 */

package DevTSK.BandNamer;


import java.io.*;
import java.net.*;
//import java.nio.*;




public class BandNamer {

	public static void main(String[] args){
		String end;
		int n, v, av, aj;
		
		
		String noun = getLst("/images/nounList.bnn");
		String verb = getLst("/images/verbList.bnn");
		String adv = getLst("/images/advList.bnn");
		String adj = getLst("/images/adjList.bnn");
		
		String[] nouns = noun.split("\\s+");
		String[] verbs = verb.split("\\s+");
		String[] adverbs = adv.split("\\s+");
		String[] adjectives = adj.split("\\s+");
		
		System.out.println();
	}
	
	public static String getLst(String path){
		String temp = "",s;
		URL uri = BandNamer.class.getResource(path);
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
