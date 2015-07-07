package DevTSK.Char;

public class PoniiBreeder {
	
	private static Ponii m;
	private static Ponii f;
	private static Window win;
	
	private static String[] definitionsOC, definitionsAllias, definitionsCannon;
	private static Ponii[] OClist, CannonList;
	
	public  static void main(String[] args){
		guiMode();
	}
	
	private static void guiMode() {
		System.out.println("Loading GUI mode...");
		System.out.println("Getting Latest definitions...");
		definitionsOC = Char.getDefinitions(0);
		definitionsAllias = Char.getDefinitions(1);
		definitionsCannon = Char.getDefinitions(2);
		OClist = Char.getPoniiDefinitions(0);
		CannonList = Char.getPoniiDefinitions(1);
		double ver = Char.getDefVer();
		System.out.println("Successfully fetched definition version : " + ver);
		win = new Window("GUI Ponii Breeder 1.0", 1, 0, 0, 1);
		win.frmBreeder.setVisible(true);
	}

	public static Ponii getMother() {
		String s = win.mother.getText();
		Boolean b = true;
		int p = -1;
		for (int i = 0; i < definitionsOC.length; i++){
			if (s.equalsIgnoreCase(definitionsOC[i])){
				p = i;
			}
			if (s.equalsIgnoreCase(definitionsAllias[i])){
				p = i;
			}
		}
		for (int i = 0; i < definitionsCannon.length; i++) {
			if (s.equalsIgnoreCase(definitionsCannon[i])){
				p = i;
				b = false;
			}
		}
		if (b && p > 0){
			m = OClist[p];
		} else if (!b && p > 0) {
			m = CannonList[p];
		} else if (b && p < 0 && s.length() == 78) {
			m = new Ponii("Inputed Code:", "", "", "", "", 0, "",  "", s);
		}
		return m;
	}

	public static Ponii getFather() {
		String s = win.father.getText();
		Boolean b = true;
		int p = -1;
		for (int i = 0; i < definitionsOC.length; i++){
			if (s.equalsIgnoreCase(definitionsOC[i])){
				p = i;
			}
			if (s.equalsIgnoreCase(definitionsAllias[i])){
				p = i;
			}
		}
		for (int i = 0; i < definitionsCannon.length; i++) {
			if (s.equalsIgnoreCase(definitionsCannon[i])){
				p = i;
				b = false;
			}
		}
		if (b && p > 0){
			f = OClist[p];
		} else if (!b && p > 0) {
			f = CannonList[p];
		} else if (b && p < 0 && s.length() == 78) {
			f = new Ponii("Inputed Code:", "", "", "", "", 0, "", "", s);
		}
		return f;
	}
}
