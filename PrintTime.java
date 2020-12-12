package ForLoop;

public class PrintTime {

    public static void main(String[] args) {

        for (int h = 1; h <= 12; h++){
            System.out.println(h);

            for (int m = 1; m <= 60; m++){
                System.out.print(m + " ");
            }

            System.out.print("min");
            System.out.println();
        }


    }
}
