package baiTap12_12;

import java.util.Scanner;

public class BaiTap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double doC;
		double doF;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập độ C vào: ");
		doC = sc.nextDouble();
		doF = (doC * 1.8) + 32;
		System.out.println("Độ F sẽ là: " + doF);
		
		
	}

}
