package development.Char;

public class EntityHandler {
	
	private Entity[] Original, NonOriginal;
	//private String[] OName, OAName, NOName, NOAName;
	
	public EntityHandler(Entity[] OcList, Entity[] NonOcList/*, String[] OriginalName, String[] OriginalAltName, String[] NonOriginalName, String[] NonOriginalAltName*/){
		Original = OcList;
		NonOriginal = NonOcList;
		//OName = OriginalName;
		//OAName = OriginalAltName;
		//NOName = NonOriginalName;
		//NOAName = NonOriginalAltName;
	}
	
	public Entity getEntityByNumber(Boolean isOriginalEntity, int location) {
		Entity e = new Entity();
		if (isOriginalEntity) {
			if (location > -1 && location < Original.length)
				e = Original[location];
		} else {
			if (location > -1 && location < NonOriginal.length)
				e = NonOriginal[location];
		}
		return e;
	}
	
	public Entity getEntityByName(Boolean isOriginalEntity, String Nameof) {
		Entity e = new Entity();
		if (isOriginalEntity) {
			for (int i = 0; i < Original.length; i++){
				if (Nameof.equalsIgnoreCase(Original[i].getName()))
					e = Original[i];
			}
		} else {
			for (int i = 0; i < NonOriginal.length; i++){
				if (Nameof.equalsIgnoreCase(NonOriginal[i].getName()))
					e = NonOriginal[i];
			}
		}
		return e;
	}
	
	public String getOriginalString(){
		String end = "";
		for (int i = 0; i < Original.length; i++)
			end = end + "\n" + Original[i].getName();
		return end;
	}
	
	public String getNonOriginalString(){
		String end = "";
		for (int i = 0; i < NonOriginal.length; i++)
			end = end + "\n" + NonOriginal[i].getName();
		return end;
	}
}
