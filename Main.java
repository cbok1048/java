import java.util.*;
class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(" 두 자리 정수를 입력해주세요 .>");
    String input = sc.nextLine();
    int num = Integer.parseInt(input);

    System.out.println("입력내용 :" + input);
    System.out.printf("num:%d%n",num);

    }
}