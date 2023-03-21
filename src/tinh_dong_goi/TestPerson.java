package tinh_dong_goi;

public class TestPerson {
	public static void main(String[] args) {
		Person person = new Person();
		person.setHoTen("Nguyen Thanh Nam");
		person.setCmnd("123456789");
		
		System.out.println("Ten: "+person.getHoTen());
	}
}
