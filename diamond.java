import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        int loop, basamak=0, space, star;
        Scanner inp = new Scanner(System.in);

        System.out.print("Basamak Sayısını Giriniz: ");
        loop = inp.nextInt();
        for (int i = 0; i <= loop ; i++) {
            for (int j = 0; j < (loop - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (basamak = loop; basamak > 1; basamak--) {
            for (space = basamak - 1; space < loop; space++) {
                System.out.print(" ");
            }
            for (star = (basamak - 1) * 2 - 1; star > 0; star--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
