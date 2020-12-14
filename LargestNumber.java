package ForLoop;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        /*
        Using ask user to enter the number between 1 to 10.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("enter the number between 1 to 10:");
        int num =input.nextInt();

        System.out.println("num - 1:");
        int firstNum= input.nextInt();
        int biggestNum = firstNum; //integer.MIN_VALUE;

        for (int i = 2; i <= num; i++) {

            System.out.println("num - " + i);
            int secondNum = input.nextInt();

            if (secondNum>biggestNum){
                biggestNum = secondNum;


            }

        }

        System.out.println(biggestNum);



    }
}
