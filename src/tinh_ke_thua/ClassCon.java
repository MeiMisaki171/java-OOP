package tinh_ke_thua;

public class ClassCon extends ClassCha {
	
	public ClassCon(int number1) {
		super(number1);
		System.out.println("Day la ham tao cua lop con: "+number1);
	}
	
	public static void main(String[] args) {
		ClassCon classCon = new ClassCon(10);
	}
}
