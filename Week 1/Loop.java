public class Loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + " squared = " + (i * i));
        }
        System.out.println("Whoo!");

        // Another example

        System.out.println("+----+");
        for (int i = 1; i <= 3; i++) {
            System.out.println("\\    /");
            System.out.println("/    \\");
        }
        System.out.println("+----+");

        // hightemp for loop with PRINTLN to print in new line

        int highTemp = 5;
        for (int i = -3; i <= highTemp / 2; i++) {
            System.out.println(i * 1.8 + 32);
        }

        // hightemp for loop with PRINT in one line
        int highestTemp = 5;
        for (int i = -3; i <= highestTemp / 2; i++) {
            System.out.print((i * 1.8 + 32) + "  ");
        }


    }
    
    
}
