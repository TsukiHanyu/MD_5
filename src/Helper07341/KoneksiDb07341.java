package Helper07341;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Administrator
 */
public class KoneksiDb07341 {
    public static Connection getConnection(){
        Connection conn = null;
        String driver = "com.mysql.cj.jdbc.Driver"; //memanggil driver dari mysql
        String url = "jdbc:mysql://localhost:3306/db_verifikasipendaftaran";    //memanggil database yang akan digunakan
        String user = "root";
        String pass = "";
        //membuat sebuah statment untuk mengurung eksekusi yang menampilkan error dan dapat membuat program
        //tetap berjalan tanpa dihentikan secara langsung
        try{
            Class.forName(driver);                              //memanggil driver dan
            conn = DriverManager.getConnection(url,user,pass);  //mengkoneksikan dengan database
            System.out.println("Berhasil Koneksi database");
        }catch(Exception e){    //Exception digunakan sebagai penanganan dari sebuah statment try catch
            System.out.println("Gagal Koneksi database");
            e.printStackTrace();    //membantu memahami dimana kesalahan yang sebenarnya terjadi
        }
        return conn;
    }
}