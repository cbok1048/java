// 자바 기초 문제 풀이를 처음으로 한날이다 파이썬 이랑 헷갈리기도 하고 아직 미숙해서 생각대로 
//코드를 잘 짠것같진않다 기초를 다시공부해야할듯;;





import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main0415 {

    public static void main(String[] args) {
      //#3
      // System.out.println("첫자바 프로그램입니다 ");
      // System.out.println("첫자바 프로그램입니다 ");
      // 프린트 뒤에 붙는 단어에 따라 방법이바뀌니 찾아보자

      //4번 홍길동 한글자씩 띄워서찍기
      // System.out.println("홍\n길\n동");

      // //5번 홍과 길사이에 빈칸띄우기
      // System.out.println("홍\n\n길\n동");

      //#2-1 정수 82와 17 합과 차를 구하는방법

      // System.out.println(82+17);
      // System.out.println(82-17);
      //#2-2정수 변수사용 문자열과 같이 나타내기
      // int a =63;
      // int b =18;
      // int sum = a+b;
      // int aver = (a+b)/2;
      // System.out.println("x 값은 "+ a +"입니다");
      // System.out.println("y 값은 "+ b +"입니다");
      // System.out.println("합계는 " + sum +"입니다");
      // System.out.println("평균값은 " + aver +"입니다");
      // #2-3 소수 사용
      // double a =63.4;
      // double b =18.2;
      // double sum = a+b;
      // double aver = (a+b)/2;
      // System.out.println("x 값은 "+ a +"입니다");
      // System.out.println("y 값은 "+ b +"입니다");
      // System.out.println("합계는 " + sum +"입니다");
      // System.out.println("평균값은 " + aver +"입니다");
      // #2-4 xyz 사용 
      // int x =63;
      // int y =18;
      // int z =52;
      // int sum = x+y+z;
      // int aver = (x+y+z)/2;
      // System.out.println("x 값은 "+ x +"입니다");
      // System.out.println("y 값은 "+ y +"입니다");
      // System.out.println("z 값은 "+ z +"입니다");
      // System.out.println("합계는 " + sum +"입니다");
      // System.out.println("평균값은 " + aver +"입니다");
      //# 2-5 키보드에서 입력한 정숫값을 표시하는 프로그램을 작성하자
      // Scanner sc = new Scanner(System.in);
      
      // System.out.print("정숫값:");
      // int x = sc.nextInt();
      // System.out.println(x+"를 입력했습니다");
      // # 2-6 키보드에서 입력한 정숫값에 10을 뺸값을 출력하자.
        //   Scanner sc = new Scanner(System.in);
        //   System.out.print("정숫값:");
        //   int x = sc.nextInt();
        //   int y = 10;
        //   int sum = x+y;
        //   int sub = x-y;
        //   System.out.println(y +"을 더한값은 "+ sum + "입니다");
        //   System.out.println(y + "을 뺀 값은"+sub+"입니다");
        // #2-7 4자리숫자중 3자리 와 마지막숫자만 출력하게 뽑기
        // Scanner sc = new Scanner(System.in);
        // System.out.print("정숫값");
        // int x = sc.nextInt();
        // System.out.println("마지막 자릿수를 제외한 값은" + (x / 10) +"입니다");
        // System.out.println("마지막 자릿수는 " + (x % 10) +"입니다");
      // #2-9 삼각형의밑변과 높이를 입력밭아 넓이 구하자
        // Scanner sc = new Scanner(System.in);
        // System.out.println("삼각형의 넓이를 구합니다");
    
        // System.out.print("밑변: ");
        // Double x = sc.nextDouble();

        // System.out.print("높이: ");
        // Double y = sc.nextDouble();

        // System.out.print("넓이는" + (x * y/2) +"입니다");
        // #2-10 구의 겉넓이와 부피를 구하자
        // Scanner sc = new Scanner(System.in);
        // final Double PI= 3.14;

        // System.out.println("구의 겉넓이와 부피를 구하자");
        // System.out.print("반지름 : ");
        // Double x = sc.nextDouble();
        // Sint x =rd();("겉넓이는" + (4* PI*(x*x)));
        // System.out.println("부피는" + (4*PI)*(x*x*x)/3+"입니다");
        // #2-11 랜덤 생성 한자리 양의정수 1~9,한자리음의정수-1~-9,두자리양의정수

         //import java.util.Random;

        //  Random rd = new Random();

        //  int x =1 + rd.nextInt(9);
        //  int y =-1 -rd.nextInt(9);
        //  int z =10 + rd.nextInt(99);

        //  System.out.println("3개의 난수를 생성했습니다. ");
        //  System.out.println("한 자리 양의 정수 :" + x);
        //  System.out.println("한 자리 음의 정수 :" + y);
        //  System.out.println("두 자리 양의 정수 :" + z);
        //  # 2-12 입력값의 +-5범위
        // Scanner sc = new  Scanner(System.in);

        // // # 2-14 키보드로 입력한 성과 이름으로 인사하는 프로그램을 작성 하자
        // Scanner sc = new Scanner(System.in);
        // System.out.print("성 : ");
        // String x = sc.next();
        // System.out.print("이름 : ");
        // String y = sc.next();
        // String z = x+y;

        // System.out.println("안녕하세요" + z +"씨");


        // # 3-1 입력을 받아서 음수인 값은 확인해주는 코드
          // Scanner sc = new Scanner(System.in);
          // System.out.print("정숫값 : ");
          // int a = sc.nextInt();

          // if (a < 0);{
          //   System.out.println("이값은 음의 값입니다.");
          // }

          // # 3-2 정숫값을 읽어서 절댓값을 구하는 코드
            
          // Scanner sc = new Scanner(System.in);
          // System.out.print("정숫값 : ");
          // int a = sc.nextInt();
          // int y = Math.abs(a);
          
          // if (a < 0);{
          //   System.out.println("절댓값은"+ y + "입니다.");
          // }
          // # 3-3 양의 정숫값을 읽어서 후자가 전자의 약수이면 "b는 A의 약수이다" 표시하고 그렇지 않으면 "B는 A의 약수가아니다"

          // Scanner sc = new Scanner(System.in);
          // System.out.print("변수 A :" );
          // int a = sc.nextInt();
          // System.out.print("변수 B :" );
          // int b = sc.nextInt();
          // if (a % b !=0){
          //   System.out.println("B는 A의 약수가아니다");

          // }else;{
          //   System.out.println("b는 A의 약수이다");
          // }
          // # 3-5 정숫값을 읽어 부호 (양수 / 음수 / 0 ) 를 판정하는 프로그램을 작성하자.

          // Scanner sc = new Scanner(System.in);
          // System.out.print("정숫값 : ");
          // int a = sc.nextInt();
          // if (a == 0){
          //   System.out.println("값이 0입니다.");
          // }else if(a > 0){
          //   System.out.println("값이 양수입니다.");
          // }else if(a < 0){
          //   System.out.println("값이 음수입니다.");
          // }else{
          //   System.out.println("양음수와 0이아닙니다");
          // }
          // # 3-7 변수 a,b 에 값을 읽어서 a,b의 대소관계를 다음과 같이 표시 하는 프로그램을 작성하자.
          // Scanner sc = new Scanner(System.in);
          // System.out.print("변수값 A : ");
          // int a = sc.nextInt();
          // System.out.print("변수값 B : ");
          // int b = sc.nextInt();
          // if (a == b){
          //   System.out.println("A와 B가 같다.");
          // }else if(a > b){
          //   System.out.println("A가 크다.");
          // }else if(a < b){
          //   System.out.println("B가 크다");
          // }
          // # 3-9 정숫값이 10의 배수이면 "이 값은 10의 배수입니다" 라고 표시하고,
          //  그렇지 않으면 '이 값은 10의 배수가 아닙니다' 코드작성해라
          // Scanner sc = new Scanner(System.in);
          // System.out.print("정숫값 : ");
          // int a = sc.nextInt();

          // if (a < 0){
          //   System.out.println("음의 정숫값을 입력 했습니다");
          // }else if (a % 10 == 0){
          //   System.out.println("이 값은 10의 배수입니다.");
          // }else{
          //   System.out.println("이 값은 10의 배수가 아닙니다. ");
          // }
          // # 3 -11 입력한 점수에 따라 수우미양가 코드작성
          // Scanner sc = new Scanner(System.in);
          // System.out.print("정숫값 : ");
          // int a = sc.nextInt();

          // if (a > 100){
          //   System.out.println("잘못된 점수입니다 . ");
          // }else if (a >= 90){
          //   System.out.println("수");
          // }else if (a >= 80){
          //   System.out.println("우");
          // }else if (a >= 70){
          //   System.out.println("미");
          // }else if (a >= 60){
          //   System.out.println("양");
          // }else if(a >0){
          //   System.out.println("가");
          // }
          // # 3 -13 정수 a,b의 값을 읽어서 두 값의 차를 표시하는 프로그램을 작성하자.
          // Scanner sc = new Scanner(System.in);
          // System.out.print("정수 a : ");
          // int a = sc.nextInt();
          // System.out.print("정수 b : ");
          // int b = sc.nextInt();
          // int z =Math.abs(a-b);
          // System.out.println("두 값의 차는"+z+"입니다");
            // // # 3-16 키보드에서 입력한 3개의 정수중 중간값 을 구하는 프로그램을 작성하자.
            // Scanner sc = new Scanner(System.in);

            // int mid = 0;
        
            // System.out.print("정수 a : ");
            // int a = sc.nextInt();
            // System.out.print("정수 b : ");
            // int b = sc.nextInt();
            // System.out.print("정수 c : ");
            // int c = sc.nextInt();
        
            // if ((b > a && c < a) || (b < a && c> a))
            //   mid = a; // b > a > c         c > a > b
            // else if ((a > b && c < b) || (a < b && c> b))
            //   mid = b;
            // else 
            //   mid = c;
        
            // System.out.println("중앙값은 " + mid +"입니다. ");
            // # 3-18 2개의 정숫값을 내림차순으로 정령하는 프로그램을 작성하자
            Scanner sc = new Scanner(System.in);

            System.out.print("정수 a : ");
            int a = sc.nextInt();
            System.out.print("정수 b : ");
            int b = sc.nextInt();
            System.out.print("정수 c : ");
            int c = sc.nextInt();
            int n[]={a,b,c};
            String str[]={"A","B","C"};

            ArrayList.sort(n[]);
            for (int i = 0; i < n[].length; i++) {
              str[i] = n[i];  
            }
      

             
              
            



        


        

      

 

}
}
