/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

/**
 *
 * @author Sahani
 */
class User {

    private int t_no;
    private String p_no;

    public User(int t_no, String p_no) {
        this.t_no = t_no;
        this.p_no = p_no;
    }

    public int gett_no() {
        return t_no;
    }

    public String getp_no() {
        return p_no;
    }
}
