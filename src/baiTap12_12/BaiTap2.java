package baiTap12_12;

import java.util.Scanner;

public class BaiTap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8;
		double a;
		int n;
		double P;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		a = sc.nextDouble();
		System.out.println("Nhap n la so nguyen khong am: ");
		n = sc.nextInt();
		P = a * Math.pow(x, n);
		
		System.out.println("Ket Qua cua don thuc la: " + P);
	}

}
