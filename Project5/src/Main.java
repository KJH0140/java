import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int kor = 0, eng = 0, mat = 0, sci = 0, sum = 0, intAvg = 0;
        double doubleAvg = 0.0;
        boolean boolRslt = false;
        System.out.print("점수를 입력하시오. \n국어: ");
        kor = sc.nextInt();
        System.out.print("영어: ");
        eng = sc.nextInt();
        System.out.print("수학: ");
        mat = sc.nextInt();
        System.out.print("과학: ");
        sci = sc.nextInt();
        sum = kor + eng + mat + sci;
        intAvg = sum / 4;
        doubleAvg = sum / 4;
        boolRslt = intAvg == doubleAvg;
        System.out.println(sum);
        System.out.println(intAvg);
        System.out.println(doubleAvg);
        System.out.println(boolRslt);
    }
}