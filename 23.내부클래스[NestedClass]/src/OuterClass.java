
public class OuterClass {
	/*
	 * 인스턴스 멤버 필드
	 */
	public int outer_member_field = 8888;
	/*
	 * 인스턴스 멤버 메서드
	 */
	public void outer_member_method() {
		System.out.println("OuterClass.outer_member_method()");
	}
	/*
	 * 인스턴스 멤버 클래스
	 */
	public class InnerClass {
		public int inner_member_field = 3333;
	}
	
}
