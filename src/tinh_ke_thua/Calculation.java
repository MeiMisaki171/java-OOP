package tinh_ke_thua;

public class Calculation {
	
	protected int c;
	
	public void phepCong(int a, int b) {
		c=a+b;
		System.out.println("Tong hai so = "+c);
	}
	
	public void phepTru(int a, int b) {
		c=a-b;
		System.out.println("Hieu hai so = "+c);
	}
}

//tao thuoc tinh c
//tao 2 phuong thuc cong va tru