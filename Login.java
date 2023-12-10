import java.util.Random;
import java.util.Scanner;

public class Login {
    private static final String USERNAME = "Admin1";
    private static final String PASSWORD = "Sayaadmin";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generate Captcha
        String captcha = generateCaptcha();
        System.out.println("Captcha: " + captcha);

        // Masukkan captcha dari user
        System.out.print("Enter Captcha: ");
        String userInput = scanner.nextLine();

        // Verifikasi Captcha
        if (verifikasiCaptcha(userInput, captcha)) {
            // Captcha benar, lanjutkan ke login
            System.out.print("Enter Username: ");
            String usernameInput = scanner.nextLine();

            System.out.print("Enter Password: ");
            String passwordInput = scanner.nextLine();

            // Verifikasi Login
            if (login(usernameInput, passwordInput)) {
                System.out.println("Login Berhasil!!");
            } else {
                System.out.println("Login gagal. Nama pengguna atau kata sandi salah.");
            }
        } else {
            System.out.println("Verifikasi Captcha gagal.");
        }

        scanner.close();
    }

    private static String generateCaptcha() {
        Random random = new Random();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder captcha = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            captcha.append(chars.charAt(random.nextInt(chars.length())));
        }

        return captcha.toString();
    }

    private static boolean verifikasiCaptcha(String userInput, String captcha) {
        return userInput.equalsIgnoreCase(captcha);
    }

    private static boolean login(String username, String password) {
        return username.equals(USERNAME) && password.equals(PASSWORD);
    }
}
