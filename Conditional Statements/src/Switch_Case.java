public class Switch_Case {
    public static void main(String[] args) {
        int n = 1;
        /*
        Using else if ladder

        if (n==1){
            System.out.println("One");
        } else if (n==2) {
            System.out.println("Two");
        } else if (n==3) {
            System.out.println("Three");
        } else {
            System.out.println("Not a valid number");
        }
         */

        // Using Switch case method
        // Switch case if faster than else if ladder

        switch (n){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Not a valid number");
                break;
        }

    }
}
