package baiTap12_12;

import java.util.Scanner;

public class BaiTap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, d, e, tong = 0;
		int giaTriTrungBinh;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so thu nhat: ");
		a = sc.nextDouble();
		System.out.println("Nhap so thu hai: ");
		b = sc.nextDouble();
		System.out.println("Nhap so thu ba: ");
		c = sc.nextDouble();
		System.out.println("Nhap so thu tu: ");
		d = sc.nextDouble();
		System.out.println("Nhap so thu nam: ");
		e = sc.nextDouble();
		tong += a;
		tong += b;
		tong += c;
		tong += d;
		tong += e;
		
		giaTriTrungBinh = (int) (tong/5);
		
		System.out.println("Gia tri trung binh cua nam so duoc nhap la: " + giaTriTrungBinh);

	}

}
