package thuoc_tinh_phuong_thuc;

public class MethodCallingInJava {

	public static void nhap() {
		System.out.println("vi du minh hoa cach goi phuong thuc");
	}
	
	public static int tinhTong(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		int c = tinhTong(2,3);
		System.out.println(c);
	}
}
