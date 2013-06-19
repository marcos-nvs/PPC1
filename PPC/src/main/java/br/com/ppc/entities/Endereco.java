/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ppc.entities;

/**
 *
 * @author f31389519880
 */
public class Endereco {
    
    private String strLogradouro;
    private int iNumero;
    private String strBairro;
    private String strCidade;
    private String strPais;
    private String strComplemento;

    public String getStrLogradouro() {
        return strLogradouro;
    }

    public void setStrLogradouro(String strLogradouro) {
        this.strLogradouro = strLogradouro;
    }

    public int getiNumero() {
        return iNumero;
    }

    public void setiNumero(int iNumero) {
        this.iNumero = iNumero;
    }

    public String getStrBairro() {
        return strBairro;
    }

    public void setStrBairro(String strBairro) {
        this.strBairro = strBairro;
    }

    public String getStrCidade() {
        return strCidade;
    }

    public void setStrCidade(String strCidade) {
        this.strCidade = strCidade;
    }

    public String getStrPais() {
        return strPais;
    }

    public void setStrPais(String strPais) {
        this.strPais = strPais;
    }

    public String getStrComplemento() {
        return strComplemento;
    }

    public void setStrComplemento(String strComplemento) {
        this.strComplemento = strComplemento;
    }
    
    
}
