public class Bitwise {
    public static void main(String[] args) {

        int a = 10, b = 6, z;

        // z = a & b; // And operation
        // z = a | b; // Or operation
        // z = a ^ b; // Xor operation
        // z = a << 1; // Left shift
        // z = a >> 1; // Right shift
        z = ~a; // Not operation

        System.out.println(z);
    }
}
