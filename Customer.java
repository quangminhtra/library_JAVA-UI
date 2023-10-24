/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

/**
 *
 * @author vguru
 */
public class Customer {
    String user, pass, status;
    int pts;

    
    public Customer(String user, String pass, int pts) {
        this.user = user;
        this.pass = pass;
        this.pts = pts;
        setStatus(pts);
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getStatus() {
        return status;
    }
    private void setStatus(int pts) {
        if(pts>1000){
            status = "GOLD";
        }
        else status = "SILVER";
    }

}
    
