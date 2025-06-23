import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("심장박동수를 입력하시오.");
        int heartRate = sc.nextInt();;
        if (heartRate <= 0)
        {
            System.out.println("심정지.");
        } else
        {
            System.out.println("정상.");
        }
    }
}