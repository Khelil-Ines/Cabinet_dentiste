package Data;

import dbase.bdd;
import java.sql.SQLException;

public class user {
    
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user{" + "username=" + username + ", password=" + password + '}';
    }
    
    public boolean logIn() throws ClassNotFoundException, SQLException{
        
        bdd b=new bdd();
        
        return   b.Chekuserandpass(username, password);

    }
    
}
