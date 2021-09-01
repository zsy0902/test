import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int b = 0,i=0;
        System.out.println("input:\n");
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        for(i=a;i<a+100;i++)
            if((i%4==0&&i%100!=0)||i%400==0)
                b++;
        System.out.println("b="+b);
    }
}
