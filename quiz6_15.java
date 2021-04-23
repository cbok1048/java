import java.util.*;
public class quiz6_15 {

    public static void main(String args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("해당월의 영어단어를 입력하시오. \n 첫글자는 대문자 나머지는 소문자로 앞에 3글자만 입력하세요 ");
        int re = 0;



        do{
            int month  = 1 + rand.nextInt();
        while(true){
            System.out.println(month + "월 :");
            String s = sc.next();


        String[] months = { "Jan","Feb","mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
            if (s.equals(months[month-1]))  break; {
                System.out.println("틀렸습니다 . ");
                break;
            }
            System.out.println("정답입니다 . ");
            System.out.println("다시? \n 1..Yes \n 0..No");

        }while (re ==1 );
    
    }
}
}
