
public class TwoParam_Impl {

	public static void main(String[] args) {
		TwoParamInterface twoParam=
				                  (i1,i2)->{
				                	  int sum=i1+i2;
				                	  return sum;
		                           };
		System.out.println(twoParam.add(5, 6));
	}
}
