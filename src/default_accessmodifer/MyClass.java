package default_accessmodifer;

public class MyClass {
	private String nameOfClass = "DDT15A";
	
	void hienThiTenLop() {
		System.out.println(nameOfClass);
	}
	
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.hienThiTenLop();
	}
}
