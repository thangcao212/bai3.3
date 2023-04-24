import java.util.Scanner;

public class HangSanhSu extends HangHoa {
	private String loaiNguyenLieu;

	
	public HangSanhSu(String maHang, String tenHang, String nhaSanXuat, int gia, String loaiNguyenLieu) {
		super(maHang, tenHang, nhaSanXuat, gia);
		this.loaiNguyenLieu = loaiNguyenLieu;
	}

	public HangSanhSu() {
		// TODO Auto-generated constructor stub
	}

	public String getLoaiNguyenLieu() {
		return loaiNguyenLieu;
	}

	public void setLoaiNguyenLieu(String loaiNguyenLieu) {
		this.loaiNguyenLieu = loaiNguyenLieu;
	}
	public void nhap() {
		
		Scanner input =new Scanner(System.in);
		System.out.println("nhap ma hang,ten hang,nha san xuat , gia,loainguyenlieu : ");
		super.nhap();
		loaiNguyenLieu=input.nextLine();
		
	}
	public String layloainguyenlieu() {
		return loaiNguyenLieu;
	}
	@Override
	public String toString() {
		return "HangSanhSu : " +" ma hang : "+laymahang()+" ;ten hang : "+ laytenahang()+";nha san xuat : "+laynhasanxuat()+";gia :"+laygia()+"[loaiNguyenLieu=" + loaiNguyenLieu + "]";
	}
	
	
	
	

	

	
	
	
	

}
