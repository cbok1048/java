import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){

 //import java.util.Random;
    //import java.util.Scanner;

    // Random rand = new Random();
    // Scanner sc = new Scanner(System.in);

    // int no = 10 + rand.nextInt(90); //정답 생성
    // System.out.print("숫자 맞추기 게임 시작! ");
    // System.out.print("10부터 99사이의 숫자를 맞추세요. ");
    // int x;

    // do {
    //   System.out.print("어떤 숫자일까? : ");
    //   x = sc.nextInt();

    //   if(x > no){
    //     System.out.print("더 작은 숫자입니다.");
    //   } else if ( x < no) {
    //     System.out.print("더 큰 숫자입니다.");
    //   }
    // } while (x != no);
  
    // System.out.print("정답입니다. ");
    


    // # 4-4 두개의정수값 사이에숫자찍기
    // Scanner sc = new Scanner(System.in);

    // System.out.print("정수 A :");
    // int a = sc.nextInt();
    // System.out.print("정수 B :");
    // int b = sc.nextInt();

    // if (a > b ){
    //     int t = a;
    //     a = b;
    //     b = t;
    // }

    // do{
    //     System.out.print(a + " ");
    //     a +=1;

    // }while( a <= b);


    // # 4-5 입력받은 정숫값부터 0까지 카운트다운 하는 프로그램을 작성하라 카운트다운 종료후의 변숫값을 확인할수있게할것
    // Scanner sc = new Scanner(System.in);

    // int x;
    
    // do{    
    // System.out.print("정숫값:");
    // x = sc.nextInt();

    // }while (x <=0);

    // while (x>=0)
    // System.out.println(x--);

    // System.out.println("x의 값이" + x +"이 됬습니다");
    
    // # 4-7입력한 값의 개수만큼 *를 표시하는 프로그램을 작성하자
    // Scanner sc= new Scanner(System.in);

    // System.out.print("몇게의 *을 표시할까요? :");
    // int a = sc.nextInt();
    // int b = 0;
    // while(b <= a ){
        
        
    //     System.out.print("*");
    //     b++;
    // }if(a >= 1){
    //     System.out.println();
    // }

    // # 4-8 입력한 개수만큼 번걸아가면서찍는 코드

    // Scanner sc= new Scanner(System.in);

    // System.out.print("몇게의 *을 표시할까요? :");
    // int a = sc.nextInt();
    // int b = 0;
    // while(b < a ){
    //     if(b % 2 == 0)
    //     System.out.print("*");
    //     else
    //     System.out.print("+");
    

    //     b++;
    // }if(a >= 1){
    //     System.out.println();
    // }

        // # 4-9 정숫값을 읽어서 그 자릿수를 출력하는 프로그램을 작성하자

        // Scanner sc= new Scanner(System.in);
        // System.out.print("양의 정숫값의 가릿수를 표시합니다. \n 양의 정숫값 :");
        // int x = sc.nextInt();
        // int y = 0;

        // while(x >0){
        //     y++;
        //     x = x /10;
        // }






        // System.out.print("입력한 숫자는 4자리입니다");


        // # 4-10 1부터 n 까지의 곱을 구하는 프로그램을 작성하자

        // Scanner sc= new Scanner(System.in);
        // System.out.print("양의 정숫값 :");
        // int x = sc.nextInt();
        // int y=1;
        // int sum=1;
        // while (y <= x){
            
        //     sum = sum*y;
        //     y++;
        // }
        // System.out.print("1부터"+x+"까지의 곱은"+ sum+"입니다");


        // # for문 연습

        // 4-14

        // Scanner sc = new Scanner(System.in);
        // System.out.print("1부터 n의까지의 값을구합니다 \nn의값 : ");
        // int n = sc.nextInt();
        // int sum =0;
   

        // for ( int i =1; i < n ;i++){

        //     sum = sum + i;
        //     System.out.print(i+"+");


        // }
        // System.out.print(n + " = "+ (sum+n)); 

        // # 4_16 표준체중대응표 코드
        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("몇 cm부터 : ");
        // int a = sc.nextInt();
        
        // System.out.print("몇 cm까지 : ");
        // int b = sc.nextInt();
        
        // System.out.print("몇 cm 단위 : ");
        // int c = sc.nextInt();
        // Double aver;

        // for (int i = a; i <= b ;){
        //     aver = (i - 100) * 0.9;
        //     System.out.println(i);
        //     System.out.print(aver);
        //     i = i + c;
    
        // }

        // # 4-18 약수
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수값 :");
        // int a = sc.nextInt();
        // int c = 0;

        // for (int i = 1; i<=a ; i++);{

        //     if (a % i ==0){
        //         System.out.print(i+" ");
        //         c++;
        // }
        // }
        // System.out.println("\n 의 약수는 "+ c + "개입니다.");

        // 4-19 입력한수까지의 숫자 들을 제곱근

        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수값 :");
        // int a = sc.nextInt();

        // for (int i= 1; i<= a;i++){
        //     System.out.println(i+"의 제곱근은"+(i*i)+"입니다.");

        // }

        // # 4-20 정숫값으로 읽어서 해당하는 달의 계절을 표시하는 프로그램을 작성하자. 원하는 만큼 입력 및 출력할수있게하며 

        // Scanner sc = new Scanner(System.in);
        // System.out.println("계절을 찾습니다.");
        //   int a = 0;
        //   int b = 0;
        // do {
        // do {
        //   System.out.print("몇 월입니까?: ");
        //   a = sc.nextInt();
        // } while (a < 1 || a >= 13);
    
        // if (a <= 3) {
        //         System.out.print("봄 입니다. ");
        // }
        // else if (a<=6) {
        //         System.out.print("여름 입니다. ");
        // }
        // else if (a <= 9) {
        //         System.out.print("가을 입니다. ");
        // }
        // else {
        //         System.out.print("겨울 입니다. ");
        // }
        // System.out.print("다시 하겠습니까? 1...Yes/0...No : ");      
        // b = sc.nextInt();
        // }while(b == 1);
    
        
        // # 4- 21  기호문자 *를 나열해서 n단의 정방형을 표시하는 프로그램을작성 하자
        // Scanner sc = new Scanner(System.in);
        // System.out.println("정방형을 표시합니다. \n 단수는 : ");
        // int a = sc.nextInt();

        // for(int k = 1; k <= a ; k++){
        // for(int i =1; i <= k-1 ;i++){
        //     System.out.print(" ");
        // }for(int j = 1 ; j <= a - k +1 ; j++){
        //     System.out.print("*");
        // }
        //     System.out.println();
        // }
        // 4-23 숫자피라미드
        
        // // 4-25 프라임넘버 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("2이상의 정숫값 : ");
        // int a = sc.nextInt();
        // int i;
        // for(i = 2; i < a ;i++ ){
        //     if(a % i == 0)
        //     break;
        // }
        //     if(i == a)
        //         System.out.print("소수입니다");
        //     else
        //         System.out.print("소수가아닙니다");

        // # 4-26 정숫값을 연속해서 입력받아 합계와 평균을 구하는 프로그램을 작성하자 0입력시 종료
        Scanner sc =new Scanner(System.in);
        System.out.print("정수를 더합니다");
        System.out.print("몇개를 더할까요? : ");
        int a = sc.nextInt();
        int i;
        int sum=0;
       
        for (i=0; i < a ;i++){
            System.out.print("정수(0으로 종료):");
            int t = sc.nextInt();
            if (t == 0) break;
            sum = sum + t;
        }System.out.println("합계는"+sum +"입니다 \n 평균은"+(sum/i) +"입니다");

        
      
        







    }
}

