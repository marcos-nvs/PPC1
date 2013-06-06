/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ppc.beans;

import br.com.facesbeans.utils.PostgresHelper;
import br.com.ppc.entities.Usuario;
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
    private Usuario usuario;
    
    public void apagaCampos(){
        setStrLogin("");
        setStrSenha("");
    }
    
    private Usuario grabUsuario(String strLogin){
        Usuario u = (Usuario) PostgresHelper.getObject(Usuario.class, strLogin);
        if(u != null){
            return u;
        }
        return null;
    }
    private boolean autenticaSenha(){
        Usuario u = grabUsuario(strLogin);
        if(strSenha.equals(u.getStrSenha())){
            return true;
        }else{
            return false;
        }
    }
    public void logar(){
        System.out.println("tentando login.......");
        if(autenticaSenha()){
            usuario = grabUsuario(strLogin);
            System.out.println("logou");
        }else{
            System.out.println("nao logou");
        }
        
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
