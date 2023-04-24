import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		System.out.println("hang thuc pham");
		//HangHoa hh =new HangHoa();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ngay san xuat :");
		NgayThang nt=new NgayThang();
		System.out.println("nhap ngay het han :");
		NgayThang nt2=new NgayThang();
		HangThucPham htp1= new HangThucPham();
		htp1.nhap();
		HangThucPham htp= new HangThucPham(htp1.laymahang(), htp1.laytenahang(), htp1.laynhasanxuat(), htp1.laygia(), nt, nt2);
		
		System.out.println("hang dien may :");
		
		HangDienMay hdm1= new HangDienMay();
		hdm1.nhap();
		
		HangDienMay hdm= new HangDienMay(hdm1.laymahang(), hdm1.laytenahang(), hdm1.laynhasanxuat(), hdm1.laygia(), hdm1.laythoigianbaohanh(), hdm1.laydienap(), hdm1.laycongsuat());
		System.out.println("hang sanh su ");
		
		HangSanhSu hss1= new HangSanhSu();
		hss1.nhap();
		HangSanhSu hss =new HangSanhSu(hss1.laymahang(), hss1.laytenahang(), hss1.laynhasanxuat(), hss1.laygia(), hss1.layloainguyenlieu());
		System.out.println(htp);
		System.out.println(hdm);
		System.out.println(hss);
		
		
	}

}
