package baiTap12_12;

import java.util.Scanner;

public class Baitap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int hangChuc;
		int hangDonvi;
		int tongHaiKySo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen co hai chu so: ");
		a = sc.nextInt();
		hangChuc = a / 10;
		hangDonvi = a % 10;
		tongHaiKySo = hangChuc + hangDonvi;
		System.out.println("Tong hai ky so la: " + tongHaiKySo);
	}

}
