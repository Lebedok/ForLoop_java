package ForLoop;

public class PrintLetters {
    public static void main(String[] args) {

        /*
        1 - print the numbers between 0 to length of the string
        2 - print all the letters from this string using for loop
        3 - if the char is equals to 'o' then
        print only the char which is "o
        */
        String str = "For loop practice class";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o')
                System.out.println(i);
        }


        for (int i = 0; i < str.length(); i++) {
            int charValue = str.charAt(i);
            if (charValue == 111)
                System.out.println(str.charAt(i));
        }


    }
}