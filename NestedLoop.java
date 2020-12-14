package ForLoop;

public class NestedLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++){       // outer loop

            for (char ch = 'b'; ch<='d'; ch++){    // inner loop
                System.out.print(i+ " ");
                System.out.println(ch);
            }
        }
    }

    // when you start with outer loop first you need to finish the inner loop then
    // you need to come back to the outer loop


}
