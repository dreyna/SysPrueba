/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.InterfaceDistrito;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Distrito;
import pe.edu.upeu.rrhh.Factory.ConexionBD;
import pe.edu.upeu.rrhh.Factory.FactoryConnectionDB;

/**
 *
 * @author admin-david.orrego
 */
public class DistritoDAO implements InterfaceDistrito{
    private ConexionBD bD;

    @Override
    public List<Distrito> listarDistrito() {
        this.bD = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder builder = new StringBuilder();
        builder.append("SELECT *FROM distrito");
        List<Distrito> list = new ArrayList<>();
        
        try {
            
            ResultSet rs = this.bD.query(builder.toString());
            while(rs.next()){
                Distrito d = new Distrito();
                d.setIdd(rs.getInt("iddistrito"));
                d.setIdr(rs.getInt("idregion"));
                d.setDistrito(rs.getString("distrito"));
                list.add(d);
            }
            
        } catch (Exception e) {
            
        }        
       return list;
    }

    @Override
    public boolean guardarDistrito(Distrito d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarDistrito(Distrito d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarDistrito(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
