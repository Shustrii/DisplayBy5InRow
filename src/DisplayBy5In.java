/***
 * *
 * * Description: This program show you numbers from 1000 to 2000 5 times in a row.
 */
public class DisplayBy5In {
    public static void main(String[] args) {
        int max = 2000;
            for (int min = 1000;min<=max;min++ ){
                System.out.print(min+",");
            if (min % 5 == 0 ) {
                System.out.println();
            }

        }
    }
}
