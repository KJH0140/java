import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        String grade = "";

        System.out.println("점수를 입력하시오.");
        score = sc.nextInt();
        if (score <= 100 && score >= 90) {
            grade = "A";
        } else if (score <= 100 && score >= 80) {
            grade = "B";
        } else if (score <= 100 && score >= 70) {
            grade = "C";
        } else if (score <= 100 && score >= 60) {
            grade = "D";
        } else if (score <= 100 && score >= 0) {
            grade = "F";
        } else {
            System.out.println("잘못된 입력.");
        }
        System.out.println("학점: " + grade);
    }
}