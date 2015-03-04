public class MakeBox {
	private float l = 1, w = 1, h = 1, sA, v;
	
	public MakeBox (float tl, float tw, float th) {
		l = tl;
		w = tw;
		h = th;
	}
	
	public void getSA(){
		sA = 2 * (w * l + h * l + h * w);
		System.out.println(sA);
	}
	public void getV(){
		v = l * w * h;
		System.out.println(v);
	}
}