import java.util.Scanner;

public class pemilihan2percobaan125 {

    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        System.out.println("masukan tahun");
        int tahun = input25.nextInt();

        if ((tahun % 4) == 0){
             if ((tahun % 100) == 0) 
            if ((tahun % 400) == 0)
            
            System.out.println("Tahun Kabisat");
         else
        System.out.println("Bukan Tahun Kabisat");
        }

        input25.close();
    }
}
    