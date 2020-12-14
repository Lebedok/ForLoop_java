package ForLoop;

public class InfiniteLoop {

    public static void main(String[] args) {

        int i =0;

        for (; i < 10; i++){
            System.out.println("test");
        }

        System.out.println(i);  // i will 10. Since int i = 0; is local variable for main method.
    }





}
