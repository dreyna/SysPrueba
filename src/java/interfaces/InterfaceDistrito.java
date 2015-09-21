/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.Distrito;

/**
 *
 * @author admin-david.orrego
 */
public interface InterfaceDistrito {
    public List<Distrito> listarDistrito();
    public boolean guardarDistrito(Distrito d);
    public boolean editarDistrito(Distrito d);
    public boolean eliminarDistrito(int id);
}
