import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("0부터 100 사이의 숫자를 입력하세요: ");
        for (int i = 0; i <= 10;)
        {
            int num = sc.nextInt();
            if (num <= 100 && num >= 0)
            {
                System.out.println(num);
                break;
            }
        }
    }
}