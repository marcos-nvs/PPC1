/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ppc.beans;

import br.com.facesbeans.utils.PostgresHelper;
import br.com.ppc.entities.Usuario;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author f31389519880
 */
@ManagedBean(name = "loginViewBean")
@SessionScoped
public class LoginView implements Serializable{
    
    private String strLogin;
    private String strSenha;
    private String strLogoTipo = "img/logo.bmp";
    private Usuario usuario;
    
    public void apagaCampos(){
        setStrLogin("");
        setStrSenha("");
    }
    
    private Usuario grabUsuario(String strLogin){
        Usuario u = (Usuario) PostgresHelper.getObject(Usuario.class, strLogin);
        return u;
    }
    
    private boolean autenticaSenha() {
        Usuario u = grabUsuario(strLogin);
        if (u != null) {
            if (strSenha.equals(u.getStrSenha())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    public void login(ActionEvent event){
        if(autenticaSenha()){
            usuario = grabUsuario(strLogin);
            selecionaLogotipo();
            Mensagens.info(event, "Você está logado", "Bem Vindo!!!");
        }else{
            Mensagens.warn(event, "Você não logou", "Usuário ou Senha Errada!!");
        }
        
    }
    
    public void logout(ActionEvent event){
        Mensagens.info(event, "Você está saindo", "Vaza!!!");
        usuario = null;
    }
    
    private void selecionaLogotipo(){
        if(usuario.getStrEmpresa().equalsIgnoreCase("omni")){
            strLogoTipo = "img/logoomn.png";
        }else if(usuario.getStrEmpresa().equalsIgnoreCase("lavoisier")){
            strLogoTipo = "img/logolv.jpg";
        }else{
            strLogoTipo = "img/logo.bmp";
        }
            
    }
    
    public String getStrLogin() {
        return strLogin;
    }

    public void setStrLogin(String strLogin) {
        this.strLogin = strLogin.toUpperCase();
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

    public String getStrLogoTipo() {
        return strLogoTipo;
    }

    public void setStrLogoTipo(String strLogoTipo) {
        this.strLogoTipo = strLogoTipo;
    }
    
}
