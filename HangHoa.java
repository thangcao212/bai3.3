import java.util.Scanner;

public class HangHoa  {
	
	private String maHang;
	private String tenHang;
	private String nhaSanXuat;
	private int gia;
	
	
	public HangHoa(String maHang, String tenHang, String nhaSanXuat, int gia) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.nhaSanXuat = nhaSanXuat;
		this.gia = gia;
	}
	public HangHoa() {
		// TODO Auto-generated constructor stub
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public String laymahang() {
		return maHang;
	}
	public String laytenahang() {
		return tenHang;
	}
	public String laynhasanxuat() {
		return nhaSanXuat;
	}
	public int laygia() {
		return gia;
	}
	public void nhap(){
		Scanner s=new Scanner(System.in);
		//System.out.println("nhap ma hang,ten hang,nha san xuat ,gia tien");
		maHang=s.nextLine();
		tenHang=s.nextLine();
		nhaSanXuat=s.nextLine();
		gia=s.nextInt();
	}
	@Override
	public String toString() {
		return "HangHoa [maHang=" + maHang + ", tenHang=" + tenHang + ", nhaSanXuat=" + nhaSanXuat + ", gia=" + gia
				+ "]";
	}
	

}
