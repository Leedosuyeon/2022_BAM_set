package com.KoreaIT.java.BAm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====프로그램 시작");
		
		Scanner sc = new Scanner(System.in);
		 
		while (true ) {
			System.out.println("명령어 )");
			String cmd = sc.nextLine();
			
			if(cmd.equals("exit")) {
				break;
			}
		}
		System.out.println("입력된 명령어: %s/n");
		sc.close();
		
	}

}
