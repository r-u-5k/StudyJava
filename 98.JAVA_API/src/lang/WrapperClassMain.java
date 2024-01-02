package lang;
/*
- Wrapper 클래스
자바데이타형은 기본데이타형과 레퍼런스 데이타 형으로 구분됩니다.
기본데이타형으로는 int,boolean,double 등이 제공됩니다.
이런기본 데이타형을 객체로 사용할수있는 방법으로 
Wrapper 클래스가 제공됩니다.
Wrapper 클래스는 각종유용한 기능들을 메서드로 제공받을수있다는
장점이있습니다.
Integer,Boolean,Double,Character,Float,Long,Byte,Short
*/
public class WrapperClassMain {

	public static void main(String[] args) {
		System.out.println("- Boxing, Unboxing -");
		/*
		 * Boxing [기본형 -> Wrapper 객체]
		 */
		Character wc1 = new Character('김');
		Integer wi1 = new Integer(1234);
		Double wd1 = new Double(1.1);
		Boolean wb1 = new Boolean(true);
		
		/*
		 * Unboxing [Wrapper 객체 -> 기본형]
		 */
		char c1 = wc1.charValue();
		int i1 = wi1.intValue();
		double d1 = wd1.doubleValue();
		boolean b1 = wb1.booleanValue();
		
		System.out.println("- AutoBoxing, AutoUnboxing -");
		/*
		 * Auto Boxing [기본형 -> Wrapper 객체]
		 */
		Character wc2 = '김';
		Integer wi2 = 1234;
		Double wd2 = 1.1;
		Boolean wb2 = true;
		
		
		
	}

}
