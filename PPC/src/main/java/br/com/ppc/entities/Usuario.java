/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ppc.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author f31389519880
 */
@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable{
    @Id
    @Column(name = "USU_ST_LOGIN")
    private String strLogin;
    @Column(name = "USU_ST_SENHA")
    private String strSenha;
    @Column(name = "USU_BL_ATIVO")
    private boolean blAtivo;
    @Column(name = "USU_ST_EMPRESA")
    private String strEmpresa;//TODO objeto
    
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

    public boolean isBlAtivo() {
        return blAtivo;
    }

    public void setBlAtivo(boolean blAtivo) {
        this.blAtivo = blAtivo;
    }

    public String getStrEmpresa() {
        return strEmpresa;
    }

    public void setStrEmpresa(String strEmpresa) {
        this.strEmpresa = strEmpresa;
    }
    
}
