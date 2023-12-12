package baiTap12_12;

import java.util.Scanner;

public class BaiTap6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tiGia = 23500;
		double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số USD mà bạn muốn đổi sang tiền việt nam: ");
		a = sc.nextDouble();
		b = a*tiGia;
		System.out.println("Số tiền việt nam bạn có là:  " + b  );
	}

}
