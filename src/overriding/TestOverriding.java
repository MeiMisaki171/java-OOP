package overriding;

public class TestOverriding {

	public static void main(String[] args) {
		Superclass superclass = new Superclass();
		superclass.hienThi();
		
		Superclass subclass = new Subclass();
		subclass.hienThi();
	}
}
