/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.facesbeans.utils;

import br.com.ppc.entities.Usuario;

/**
 *
 * @author f31389519880
 */
public class Teste {
    public static void main(String[] args) {
        Usuario u = (Usuario)PostgresHelper.getObject(Usuario.class, "ricardo");
        System.out.println(u.getStrLogin() + " " + u.getStrSenha());
    }
}
