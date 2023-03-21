package public_accessmodifier;
import java.util.Scanner;
public class ClassOfStudent {

	//thuoc tinh
	private String name;
	private int numberOfPupils;
	
	public void inputYourClass() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten lop");
		name = scanner.next();
		System.out.println("Nhap so thanh vien cua lop");
		numberOfPupils = scanner.nextInt();
	}
	
	public void showInformation() {
		System.out.println("Ten lop la "+name+", so sinh vien la "+numberOfPupils);
	}
}
