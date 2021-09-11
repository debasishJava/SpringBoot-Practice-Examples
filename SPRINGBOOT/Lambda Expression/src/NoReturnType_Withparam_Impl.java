
public class NoReturnType_Withparam_Impl {

	public static void main(String[] args) {
		NoReturnType_WithParam noReturn= 
				time -> {
			        if(time>12 && time >=24)
			        	System.out.println("PM Time");
			        else
			        	System.out.println("AM Time");
		        };//semi colon mandatory
		        
		        noReturn.message(17);
	}
}
