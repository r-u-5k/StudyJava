/*
public class InterfaceA {

}
*/

public interface InterfaceA {
//	public (static final) int CONSTANT1; -> The blank final field CONSTANT1 may not have been initialized
	public int CONSTANT1 = 1;
	int CONSTANT2 = 2;
	
	public abstract void method1(); // public abstract 생략 가능. 
									// 인터페이스 안에 정의되는 메서드는 추상 메서드여야 함.
//	void method2() {} -> Abstract methods do not specify a body
	void method2();
}