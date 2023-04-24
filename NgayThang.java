
import java.util.Scanner;

public class NgayThang {
	private int ngay;
	private int thang;
	private int nam;
	public NgayThang(int ngay, int thang, int nam) {
		super();
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	
	public NgayThang() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ngay ,thang,nam");
		ngay=sc.nextInt();
		thang=sc.nextInt();
		nam=sc.nextInt();
		
	}
	@Override
	public String toString() {
		return "NgayThang [ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + "]";
	}
	
	
	

}
