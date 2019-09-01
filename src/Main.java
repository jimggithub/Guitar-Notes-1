public class Main {

    public static void main(String[] args) {

        String s = "A";

        System.out.println("s value is " + s);

        System.out.println("Start of program");

        String[] t = {"E", "F", "F#", "G", "G#"};


        // Print the array from beginnging to end

        System.out.println("Beginning to end:");
        for (int i=0;i<t.length;i++) {
            System.out.println("Note is :" + t[i]);
        }

        // Print the array from end to beginning

        System.out.println("End to Beginning:");

        for (int i = t.length - 1;i>=0;i--) {
            System.out.println("Note is :" + t[i]);
        }
        System.out.println("End of Program");

    }
}
