/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ppc.entities;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author f31389519880
 */
public class Empresa implements Serializable{
    
    private String strNome;
    private Endereco endereço;//TODO objeto
    private List listPlantas;//TODO objeto
    private List<Usuario> listUsuario;
    private String strLogo;

    public String getStrNome() {
        return strNome;
    }

    public void setStrNome(String strNome) {
        this.strNome = strNome;
    }

    public Endereco getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }

    public List getListPlantas() {
        return listPlantas;
    }

    public void setListPlantas(List listPlantas) {
        this.listPlantas = listPlantas;
    }

    public List<Usuario> getListUsuario() {
        return listUsuario;
    }

    public void setListUsuario(List<Usuario> listUsuario) {
        this.listUsuario = listUsuario;
    }

    public String getStrLogo() {
        return strLogo;
    }

    public void setStrLogo(String strLogo) {
        this.strLogo = strLogo;
    }
    
    
}
