/**
 * Method getMahasiswa berfungsi untuk mengambil seluruh data mahasiswa dari database
 * @return mengembalikan kumpulan data yang telah didapat ke dalam arraylistMahasiswa
 */
package Model07341;
import Entity07341.MahasiswaEntity07341;
import Helper07341.KoneksiDb07341;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Administrator
 */
public class MahasiswaModel07341 {
    private String sql;
    public Connection conn = KoneksiDb07341.getConnection();
    public ArrayList<MahasiswaEntity07341> getMahasiswa(){
        ArrayList<MahasiswaEntity07341> arraylistMahasiswa = new ArrayList<>();
        try{
            Statement stat = conn.createStatement();
            sql = "select * from mahasiswa";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                MahasiswaEntity07341 mahasiswaEntity = new MahasiswaEntity07341();
                mahasiswaEntity.setId(rs.getInt("Id"));
                mahasiswaEntity.setNama(rs.getString("Nama"));
                mahasiswaEntity.setNpm(rs.getString("Npm"));
                mahasiswaEntity.setPassword(rs.getString("Password"));
                mahasiswaEntity.setnoTelp(rs.getString("noTelp"));
                mahasiswaEntity.setStatus(rs.getInt("Status"));
                arraylistMahasiswa.add(mahasiswaEntity);
            }
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return arraylistMahasiswa;
    }
}