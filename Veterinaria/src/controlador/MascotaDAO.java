
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Mascota;

/**
 *
 * @author koveb
 */
public class MascotaDAO {
    private List <Mascota> mascotas;

    public MascotaDAO() {
        mascotas = new ArrayList<>();
    
    }
    //CRUD
    public Mascota buscarMascota(int codigo){
        for(Mascota m: mascotas){
            if(m.getCodigo() == codigo){
                return m;
            }
        }
        return null;
    }
    
    public boolean agregarMascota(Mascota m){
        if(buscarMascota(m.getCodigo())==null){
            return mascotas.add(m);
        }
        return false;
    }
    
    public boolean eliminarMascota(int codigo){
        for(Mascota m:mascotas){
            if(m.getCodigo()==codigo){
                return mascotas.remove(m);
            }
        }
        return false;
    }
    
    public boolean modificarMascota(Mascota mascota){
        for(Mascota m: mascotas){
            if(m.getCodigo() == mascota.getCodigo()){
                int posicion = mascotas.indexOf(m);
                mascotas.set(posicion,mascota);
                return true;
            }
        }
        return false;
    
    }
    
    public List<Mascota> listarMascotas(){
        return mascotas;
    } 
    
    
    //en la prueba3 puede salir: cantidad de mascotas sin vacunas
    
    
}
