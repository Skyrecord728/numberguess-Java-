import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    Random r = new Random();
    int number = r.nextInt(100);
    int count = 0;
    while (count <= 10){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a < 100){
            if(a > number){
                System.out.println("太大了！");
            }else if(a < number){
                System.out.println("太小了！");
            }else {
                System.out.println("您猜对了！");
                break;
            }
        }else{
            System.out.println("非法输入");
        }

        count++;
        if(count == 5){
            System.out.println("输入次数超过五次，您输了！");
        }
    }

    }
}
