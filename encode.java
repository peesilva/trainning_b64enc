import java.util.Base64;
import java.util.Scanner;

public class encode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write a phrase: ");
        String mensagem = sc.nextLine();
        sc.close();

        String base64 = encodeToBase64(mensagem);

        System.out.println("Your phrase Base64: " + base64);
    }
    public static String encodeToBase64(String input) {
        byte[] bytes = input.getBytes();
        byte[] encodedBytes = Base64.getEncoder().encode(bytes);
        return new String(encodedBytes);
    }
}