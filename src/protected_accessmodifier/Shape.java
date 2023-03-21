package protected_accessmodifier;

public class Shape {
	protected int sides;
	
	public Shape() {
		sides=3;
	}
	
	protected void hienThi() {
		System.out.println("Sides = "+sides);
	}
}
