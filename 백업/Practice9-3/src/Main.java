import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("음료를 선택하세요: 1-아메리카노, 2-카페라떼, 3-카푸치노");
        int drinkType = scanner.nextInt();
        System.out.println("크기를 선택하세요: 1-s, 2-m, 3-l");
        int sizeType = scanner.nextInt();
        System.out.println("옵션을 선택하세요: 1-x, 2-샷, 3-시럽, 4-샷&시럽");
        int optionType = scanner.nextInt();
        int basePrice = 0;
        int price = 0;

        switch (drinkType) {
            case 1:
                basePrice = 3000;
                break;
            case 2:
                basePrice = 4000;
                break;
            case 3:
                basePrice = 4500;
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                return;
        }
        switch (sizeType)
        {
            case 1:
                price = basePrice + 0;
                break;
            case 2:
                price = basePrice + 500;
                break;
            case 3:
                price = basePrice + 1000;
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                return;
        }
        switch (optionType)
        {
            case 1:
                price = price + 0;
                break;
            case 2:
                price = price + 500;
                break;
            case 3:
                price = price + 300;
                break;
            case 4:
                price = price + 800;
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                return;
        }
        System.out.println("음료의 가격은" + price + "원 입니다.");
    }
}