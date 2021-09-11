
public class FunctionalInterface01_Impl {

	public static void main(String[] args) {
		FunctionalInterface01 fi01=()->"good morning";
		
		System.out.println(fi01.message());
	}
}
