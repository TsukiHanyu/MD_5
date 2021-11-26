package si_verifikasipendaftaran;
import Controller07341.MahasiswaController07341;
import Entity07341.MahasiswaEntity07341;
/**
 *
 * @author Administrator
 */
public class SI_verifikasipendaftaran {
    public static MahasiswaController07341 mahasiswa = new MahasiswaController07341();    
    public static void main(String[] args) {
        showData();
    }
    /**
     * Method showdata berfungsi untuk menampilkan data seluruh data mahasiswa
     */
    static void showData(){
        for (MahasiswaEntity07341 mahasiswaEntity:mahasiswa.getDataMahasiswa()){
            System.out.println("-------------------");
            System.out.println("id          :" + mahasiswaEntity.getId());
            System.out.println("nama        :" + mahasiswaEntity.getNama());
            System.out.println("npm         :" + mahasiswaEntity.getNpm());
            System.out.println("password    :" + mahasiswaEntity.getPassword());
            System.out.println("noTelp      :" + mahasiswaEntity.getnoTelp());
            System.out.println("status      :");
            if (mahasiswaEntity.getStatus()== 0 ){
                System.out.println("Unverified");
            }else{
                System.out.println("Verified");
            }
        }
    }
}
