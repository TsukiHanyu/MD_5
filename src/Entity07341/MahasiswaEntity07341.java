package Entity07341;
/**
 *
 * @author Administrator
 */
public class MahasiswaEntity07341 extends UserEntityAbstract07341 {
    private String npm;
    private int status;
    public MahasiswaEntity07341(){}
    public String getNpm(){
        return npm;
    }
    public void setNpm(String npm){
        this.npm = npm;
    }
    public int getStatus(){
        return status;
    }
    public void setStatus(int status){
        this.status = status;
    }
}