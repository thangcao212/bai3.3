import java.util.Scanner;

public class HangDienMay extends HangHoa {
	private int ThoiGianBaoHanh;
	private String DienAp;
	private String CongSuat;

	 public HangDienMay(String maHang, String tenHang, String nhaSanXuat, int gia, int thoiGianBaoHanh, String dienAp,
				String congSuat) {
			super(maHang, tenHang, nhaSanXuat, gia);
			ThoiGianBaoHanh = thoiGianBaoHanh;
			DienAp = dienAp;
			CongSuat = congSuat;
		}

	 HangDienMay() {
		// TODO Auto-generated constructor stub
	}
	public int getThoiGianBaoHanh() {
		return ThoiGianBaoHanh;
	}


	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		ThoiGianBaoHanh = thoiGianBaoHanh;
	}


	public String getDienAp() {
		return DienAp;
	}


	public void setDienAp(String dienAp) {
		DienAp = dienAp;
	}


	public String getCongSuat() {
		return CongSuat;
	}


	public void setCongSuat(String congSuat) {
		CongSuat = congSuat;
	}
	public int laythoigianbaohanh() {
		return ThoiGianBaoHanh;
	}
	public String laydienap() {
		return DienAp;
	}
	public String laycongsuat() {
		return CongSuat;
	}



	public void nhap() {
	 
		
		
		Scanner input= new Scanner(System.in);
		System.out.println("nhap ma hang,ten hang,nha san xuat , gia,thoi gian bao hanh,dien ap ,cong suat : ");
		super.nhap();
		
		
		
		ThoiGianBaoHanh=input.nextInt();
		input.nextLine();
		DienAp =input.nextLine();
		CongSuat=input.nextLine();
	}


	@Override
	public String toString() {
		return "HangDienMay ma hang "+ laymahang()+  " ;ten hang :"+laytenahang()+" ;san xuat: "+ laynhasanxuat()+ ";gia " + laygia()+"[ThoiGianBaoHanh=" + ThoiGianBaoHanh+" nam " + ", DienAp=" + DienAp + ", CongSuat=" + CongSuat
				+ "]";
	}
	 

}
