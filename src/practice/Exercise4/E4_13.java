package practice.Exercise4;

 class E4_13 {
     public static void main(String[] args) {
//         [4-13] 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞
//         은 코드를 넣어서 프로그램을 완성하시오.
             String value = "12o34";
             char ch = ' ';
             boolean isNumber = true;  //숫지인지 판별
            // 반복문과 charAt(int i)를 이용해서 문자열의 문자를
            // 하나씩 읽어서 검사한다.
                 for(int i=0; i < value.length() ;i++) {
                     ch =  value.charAt(i);
                     int a = ch;
//                     System.out.println("ch = " + ch);
//                     System.out.println("a = " + a);
                    if(!(a >= 48 && a <= 57)){
                        isNumber = false;
                    }
//                        System.out.println("숫자" + isNumber);
                 }
                 if (isNumber) {
                     System.out.println(value+"는 숫자입니다.");
                 } else {
                     System.out.println(value+"는 숫자가 아닙니다.");
                 }
             } // end of main
         } // end of class

