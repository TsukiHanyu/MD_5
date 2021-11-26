package Controller07341;
import Entity07341.MahasiswaEntity07341;
import java.util.ArrayList;
/**
 *
 * @author Administrator
 */
public class MahasiswaController07341 {
    public ArrayList<MahasiswaEntity07341> getDataMahasiswa(){
        return AllObjectModel07341.mahasiswaModel.getMahasiswa();   //berfungsi untuk mengembalikan nilai ke dalam fungsi
    }                                                               //tersebut
}