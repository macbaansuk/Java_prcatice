package ch2;

import java.util.Scanner;

class ScannerEx {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

   System.out.println("두자리 정수를 하나 입력해주세요.>");
   String input = sc.nextLine();  //한줄씩 저장
   int num = Integer.parseInt(input);// 입력받은 문자열을 숫자로 변환 - 숫자가아니면 NumberFormatException발생, 공백도 주의

   System.out.println("입력내용: " +input);
   System.out.printf("num=%d%n",num);

  }
}
