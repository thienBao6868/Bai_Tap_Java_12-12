package baiTap12_12;

import java.util.Scanner;

public class BaiTap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu dai canh goc vuong thu nhat: ");
		a = sc.nextDouble();
		System.out.println("Nhap chieu dai canh goc vuong thu hai: ");
		b = sc.nextDouble();
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println("Chieu dai canh huyen la: " + c);
	}

}
