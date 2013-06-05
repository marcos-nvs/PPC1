
import br.com.facesbeans.utils.PostgresHelper;
import br.com.ppc.entities.Usuario;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author f31389519880
 */
public class Teste {
    public static void main(String[] args) {
        Usuario u = (Usuario)PostgresHelper.getObject(Usuario.class, "Ricardo");
        System.out.println(u.getStrLogin());
    }
}
