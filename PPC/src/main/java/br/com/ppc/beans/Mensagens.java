/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ppc.beans;

import br.com.ppc.entities.Usuario;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author f31389519880
 */
@ManagedBean(name = "mensagensBeans")
public class Mensagens {
    
    public static void info(ActionEvent actionEvent, String str1, String str2){
        FacesContext context = FacesContext.getCurrentInstance();
        
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, str1, str2));
    }
    
    public static void error(ActionEvent actionEvent, String str1, String str2){
        FacesContext context = FacesContext.getCurrentInstance();
        
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, str1, str2));
    }
    
    public static void fatal(ActionEvent actionEvent, String str1, String str2){
        FacesContext context = FacesContext.getCurrentInstance();
        
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, str1, str2));
    }
    
    public static void warn(ActionEvent actionEvent, String str1, String str2){
        FacesContext context = FacesContext.getCurrentInstance();
        
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, str1, str2));
    }
}
