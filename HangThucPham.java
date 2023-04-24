import java.util.Scanner;

public class HangThucPham extends HangHoa{
	private NgayThang ngaySanXuat;
	private NgayThang ngayHetHan;
	public HangThucPham(String maHang, String tenHang, String nhaSanXuat, int gia, NgayThang ngaySanXuat,
			NgayThang ngayHetHan) {
		super(maHang, tenHang, nhaSanXuat, gia);
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}
	public HangThucPham() {
		// TODO Auto-generated constructor stub
	}
	public NgayThang getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(NgayThang ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	public NgayThang getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(NgayThang ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	
	public void nhap() {
		Scanner input = new Scanner(System.in);
		System.out.println("nhap ma hang,ten hang,nha san xuat , gia,: ");
		super.nhap();
	}
	
	@Override
	public String toString() {
		return "HangThucPham : ma hang "+ laymahang()+"   ;ten hang :"+laytenahang()+" ;san xuat: "+ laynhasanxuat()+ ";gia " + laygia()+"[ngaySanXuat=" + ngaySanXuat + ", ngayHetHan=" + ngayHetHan + "]";
	}
	
	
	
	
	
	
	
	

}
