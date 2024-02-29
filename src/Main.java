import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean selesai = false;

        while (!selesai) {
            System.out.println("===== Library System =====");
            System.out.println("1. Login Sebagai Pelajar ");
            System.out.println("2. Login Sebagai Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your NIM: ");
                    String studentNIM = scanner.next();
                    if (studentNIM.length() == 15 && studentNIM.equals("202310370311384")) {
                        System.out.println("Sukses login sebagai pelajar");
                    } else {
                        System.out.println("Pelajar Tidak ditemukan ");
                    }
                    break;
                case 2:
                    System.out.print("Masukan username : ");
                    String username = scanner.next();
                    System.out.print("Masukan Password : ");
                    String password = scanner.next();
                    if (username.equals("admin") && password.equals("admin")) {
                        System.out.println("Sukses login sebagai admin");
                    } else {
                        System.out.println("Admin tidak ditemukan!!");
                    }
                    break;
                case 3:
                    selesai = true;
                    System.out.println("Kerja Bagus!! :)");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        }

        scanner.close();
    }
}
