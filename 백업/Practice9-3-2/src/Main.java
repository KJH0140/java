import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 하시오.");
        int score = scanner.nextInt();
        String score2 = "";
        switch (score/10) {
            case 10:
                score2 = "A";
                break;
            case 9:
                score2 = "A";
                break;
            case 8:
                score2 = "B";
                break;
            case 7:
                score2 = "C";
                break;
            case 6:
                score2 = "D";
                break;
            default:
                score2 = "F";
                break;
        }
        System.out.println("학점은 " + score2 + "입니다.");
    }
}