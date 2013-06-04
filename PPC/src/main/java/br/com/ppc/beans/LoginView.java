/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ppc.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author f31389519880
 */
@ManagedBean(name = "loginViewBean")
public class LoginView implements Serializable{
    
    private String strLogin;
    private String strSenha;
    
    public void apagaCampos(){
        setStrLogin("");
        setStrSenha("");
    }
    
    public String getStrLogin() {
        return strLogin;
    }

    public void setStrLogin(String strLogin) {
        this.strLogin = strLogin;
    }

    public String getStrSenha() {
        return strSenha;
    }

    public void setStrSenha(String strSenha) {
        this.strSenha = strSenha;
    }
    
}
