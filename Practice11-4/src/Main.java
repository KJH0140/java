import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("좌석의 행 수를 입력하세요: ");
        int row = scanner.nextInt();
        System.out.print("좌석의 열 수를 입력하세요: ");
        int column = scanner.nextInt();
        int[][] seats = new int[row][column];
        while (true)
        {
            System.out.println("\n좌석 예약을 진행하시오. (종료하려면 0 0 입력)");
            System.out.print("예약할 좌석의 행 번호 입력 (1~" + row + "): ");
            int r = scanner.nextInt();
            System.out.print("예약할 좌석의 열 번호 입력 (1~" + column + "): ");
            int c = scanner.nextInt();
            if (r == 0 && c == 0)
            {
                break;
            }
            if (r < 1 || r > row || c < 1 || c > column)
            {
                System.out.println("다시 입력하시오.");
                continue;
            }
            int rowSS = r - 1;
            int columnSS = c - 1;
            if (seats[rowSS][columnSS] == 1) {
                System.out.println("이미 예약된 좌석");
            } else
            {
                seats[rowSS][columnSS] = 1;
                System.out.println("좌석 예약 완료");
            }
        }

        System.out.println("\n--- 현재 좌석 배치도 (0:비어있음, 1:예약됨) ---");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}