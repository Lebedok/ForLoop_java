package ForLoop;

public class PrintMonths {

    public static void main(String[] args) {

        for (int i= 2015; i < 2020; i++){
            System.out.println(i);
            for (int month =1; month <= 12; month++){
                System.out.print(month +" ");
            }

            System.out.println();
        }

    }


}
