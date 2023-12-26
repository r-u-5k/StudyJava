abstract class AbstractParent {
	public void method1() {
		System.out.println("AbstractParent.method1() 난 구상(concrete) 메서드");
	}
	public abstract void method2();
}

class AbstractChild extends AbstractParent {

	@Override
	public void method2() {
		System.out.println("AbstractChild에서 AbstractParent의 추상 메서드 method2() 재정의(implement(구현))");
	}
	
}


public class AbstractParentChildMain {

	public static void main(String[] args) {
		/*
		AbstractParent abstractParent = new AbstractParent();
		*/
		AbstractChild abstractChild1 = new AbstractChild();
		abstractChild1.method1();
		abstractChild1.method2();
		
		AbstractParent abstractChild2 = new AbstractChild();
		abstractChild2.method1();
		abstractChild2.method2();
	}

}
