package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : " );
		int input1 = sc.nextInt();
		
		System.out.print("사탕 개수 : " );
		int input2 = sc.nextInt();
		
		System.out.println();
		
		
		int num1 = input2 / input1;
		int num2 = input2 % input1;
		
		System.out.println("1인당 사탕 개수: " + num1 );
		System.out.println("남는 사탕 개수 : " + num2 );
		
		
		
		
		
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String input1 = sc.next();
		
		System.out.print("학년 : ");
		int input2 = sc.nextInt();
		
		System.out.print("반 : ");
		int input3 = sc.nextInt();
		
		System.out.print("번호 : ");
		int input4 = sc.nextInt();
		
		System.out.print("성별 : ");
		String input5 = sc.next();
		
		System.out.print("성적 : ");
		double input6 = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f ", input2, input3, input4, input1, input5, input6);
		
		
	}
	
	public void practice3() {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		System.out.println();
		
	
		int sum = kor + eng +math; // 합계
		double avg = sum / 3.0; //평균
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f\n", avg);
		
		boolean result = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60);
		
		System.out.println( result ? "합격" : "불합격");
		
	}
	

}
