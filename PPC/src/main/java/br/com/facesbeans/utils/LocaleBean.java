package br.com.facesbeans.utils;

/*
 * Version: MPL 1.1
 *
 * "The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations under
 * the License.
 *
 * The Original Code is ICEfaces 1.5 open source software code, released
 * November 5, 2006. The Initial Developer of the Original Code is ICEsoft
 * Technologies Canada, Corp. Portions created by ICEsoft are Copyright (C)
 * 2004-2010 ICEsoft Technologies Canada, Corp. All Rights Reserved.
 *
 * Contributor(s): _____________________.
 *
 */





import javax.faces.event.ValueChangeEvent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import java.io.IOException;
import java.io.Serializable;
import java.util.Locale;
import java.util.ArrayList;
import java.util.ResourceBundle;


//import com.sun.faces.facelets.tag.jsf.core.LoadBundleHandler;
import javax.faces.component.UIViewRoot;
/**
 * <p>The LocaleBean is responsible for keeping track of the current application
 * locale.  The locale of the application can be changed using the a
 * selectOneMenu located in the languageThemeControl.xhtml.  The application
 * currently support English, German and Spanish</p>
 *
 * @author ICEsoft Technologies Inc.
 * @since 1.8
 *
 */
@ManagedBean(name= "localeBean")
@SessionScoped
public class LocaleBean implements Serializable{

//    private static final Log logger =
//            LogFactory.getLog(LocaleBean.class);

    // current language selection
    private String currentLanguage;
    // current local
    private Locale usedLocale;

    // available locals to choose from.
    private static final ArrayList AVAILABLE_LOCALES = new ArrayList();
    static{
        // setup our list of supported languages.
        AVAILABLE_LOCALES.add(new SelectItem("pt_BR","Brasil"));
//        AVAILABLE_LOCALES.add(new SelectItem("pt","Portuguese"));
        AVAILABLE_LOCALES.add(new SelectItem("en","English"));
//        AVAILABLE_LOCALES.add(new SelectItem("es","Spanish"));
//        AVAILABLE_LOCALES.add(new SelectItem("de","German"));
        
        
    }

    /**
     * Creates an instance of the LocalBean.  The default language type is
     * specified by the initial request.  The availableLocales is
     */
    public LocaleBean() {
        // get default language type.
//        currentLanguage = FacesContext.getCurrentInstance().getViewRoot()
//                .getLocale().getLanguage();
//        usedLocale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
        
        currentLanguage="pt_BR";
        usedLocale = new Locale(currentLanguage);
        
    }

    /**
     * Changes the view roots language type.
     * @param event jsf value change event.
     */
    public void changeLanguage(ValueChangeEvent event){
        FacesContext ctx = FacesContext.getCurrentInstance();
        // find out view roots current local
        Locale locale = ctx.getViewRoot().getLocale();
        String newLanguage = (String) event.getNewValue();
        // see if matches any of our translations.
        
        if ("pt_BR".equals(newLanguage)) {
            currentLanguage="pt_BR";
        }
        
//        if ("pt".equals(newLanguage)) {
//            currentLanguage="pt";
//        }
        else if ("en".equals(newLanguage))  {
            currentLanguage = "en";
        }
//        else if ("es".equals(newLanguage)) {
//            currentLanguage="es";
//        }
//        else if ("de".equals(newLanguage)) {
//            currentLanguage="de";
//        }
        
        // finally change the local for the view root.
        if (!currentLanguage.equals(locale.getLanguage())) 
        {
            usedLocale = new Locale(currentLanguage);
            ctx.getViewRoot().setLocale(usedLocale); 
        }
    }

    public String getCurrentLanguage() {
        return currentLanguage;
    }

    public void setCurrentLanguage(String currentLanguage) {
        this.currentLanguage = currentLanguage;
    }

    public ArrayList getAvailableLocales() {
        return AVAILABLE_LOCALES;
    }

    public Locale getUsedLocale() {
        return usedLocale;
    }
}
