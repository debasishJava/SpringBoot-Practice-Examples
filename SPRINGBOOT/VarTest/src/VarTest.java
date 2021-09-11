
public class VarTest {

	//static var v=boo();
	public static boolean boo() {
		return true;
	}
	
	public static int i1() {
		return 10;
	}
	public static String string() {
		return "abc";
	} 
	public static void main(String[] args) {
		var v=boo();
		var v1=i1();
		v1=10;
	}
}
