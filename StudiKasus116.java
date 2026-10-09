import java.util.Scanner;
public class StudiKasus116 {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);

        int hargapercup=18000;
        int jumlahcup, uangbayar, totalharga, diskon;
        int totalbayar, kembalian, kurang;

        System.out.println("masukkan jumlah cup: ");
        jumlahcup=j.nextInt();
        System.out.println("masukkan uang bayar: ");
        uangbayar=j.nextInt();

        totalharga=jumlahcup*hargapercup;
        diskon=0;

        if (totalharga >= 100000) {
            diskon=totalharga*10/100;
        }  
            totalbayar=totalharga-diskon;
        

        System.out.println("total harga: "+totalharga);
        System.out.println("diskon: "+diskon);
        System.out.println("total bayar: "+totalbayar);

        if (uangbayar >= totalbayar) {
            kembalian=uangbayar-totalbayar;
            System.out.println("kembali "+kembalian);
        } else{
            kurang=totalbayar-uangbayar;
            System.out.println("uang tidak cukup, kurang Rp"+kurang);
        }


    }
}