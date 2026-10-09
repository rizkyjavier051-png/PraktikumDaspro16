import java.util.Scanner;
public class StudiKasus216 {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);

        System.out.println("nama mahasiswa: ");
        String nama=j.nextLine();
        System.out.println("jenis kegiatan (BELMAWA, BAKORMA, MANDIRI, PKM): ");
        String kegiatan=j.nextLine();
        
        String pesan;

        if (kegiatan.equalsIgnoreCase("BELMAWA") || kegiatan.equalsIgnoreCase("BAKORMA") || kegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.println("jumlah dokumen: ");
            int dokumen=j.nextInt();
            System.out.println("peringkat juara: ");
            int peringkat=j.nextInt();
            
            if (peringkat >= 1 && peringkat <= 3){
                if (dokumen == 4) {
                    pesan=("dokumen lengkap, dana penghargaan diberikan");
                } else {
                    pesan=("dokumen tidak lengkap (kurang ")+ (4-dokumen) +(" dokume). Dana penghargaan tidak diberikan");
                }
            } else {
            pesan="anda bukan juara. Dana tidak diberikan";
            }
        
        } else if (kegiatan.equalsIgnoreCase("PKM")) {
            System.out.println("jumlah dokumen: ");
            int dokumen=j.nextInt();
            System.out.println("Status pendanaan PKM :");
            int PKM=j.nextInt();
            // String pesan;

            if (PKM == 1) {
                if (dokumen == 4) {
                    pesan=("dokumen lengkap. Dana penghargaan diberikan");
                } else {
                    pesan=("dokumen tidak lengkap (kurang ")+ (4-dokumen)+(" dokumen) .Dana penghargaan tidak diberikan");
                }
            } else {
                pesan=("tidak lolos pendanaan PKM. Dana pengahargaan tidak diberikan");
            }
        }else {
           pesan=("Kegiatan termasuk kategori lainnya. Dana tidak diberikan");
        }
        
    System.out.println("Status:"+ pesan);
            
                

            
        
    }
}
