/**
 * Area Class
 * Developer The_Silver_Kid 
 */
package projectArchive.ISD;

public class Area {
	
	private static String name = "";
	private static String musik = "/Images/null.ogg";
	private static int type = 0;
	
	public Area(String n, String m, int t){
		name = n;
		type = t;
		musik = m;
	}
	
	public static String getMusic(){
		return musik;
	}
	
	public static String getName(){
		return name;
	}
	
	public static int getType(){
		return type;
	}
}
