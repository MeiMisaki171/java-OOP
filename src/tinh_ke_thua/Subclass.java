package tinh_ke_thua;

public class Subclass extends Superclass {

	int number = 20;
	
	public void hienThi() {
		System.out.println("Day la phuong thuc hienThi() cua lop con");
	}
	
	public void subclassMethod() {
		Subclass subclass = new Subclass();
		
		super.hienThi();
		
		subclass.hienThi();
		
		System.out.println("Gia tri bien number cua lop cha: "+super.number);
		
		System.out.println("Gia tri hien thi cua lop con: "+ subclass.number);
	}
	
	public static void main(String[] args) {
		Subclass objSubclass = new Subclass();
		objSubclass.subclassMethod();
	}
}
