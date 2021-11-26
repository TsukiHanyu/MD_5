package Entity07341;
/**
 *
 * @author Administrator
 */
public abstract class UserEntityAbstract07341 {
    protected int id;
    protected String nama,password,noTelp;
    public UserEntityAbstract07341(){}
    public UserEntityAbstract07341(String nama,String password,String noTelp){
        this.nama = nama;
        this.password = password;
        this.noTelp = noTelp;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getnoTelp(){
        return noTelp;
    }
    public void setnoTelp(String noTelp){
        this.noTelp = noTelp;
    }
}