import java.util.Scanner;

public class Pemilihan2Percobaan220 {
    public static void main(String[] args) {

        Scanner input20 = new Scanner(System.in);

        int totalSudut;

        System.out.print("Masukkan sudut1: ");
        int sudut1 = input20.nextInt();
        System.out.print("Masukkan sudut2: ");
        int sudut2 = input20.nextInt();
        System.out.print("Masukkan sudut3: ");
        int sudut3 = input20.nextInt();

        totalSudut = sudut1 + sudut2+ sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        } else
            System.out.println("Bukan Segitiga");
    }
}