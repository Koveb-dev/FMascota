
package modelo;

import java.util.Date;

/**
 *
 * @author koveb
 */
public class Mascota {
    
    private int codigo;
    private String nombre; //minimo 2 letras.
    private Date fechaNacimiento;
    private double peso;
    private char genero;
    private String origen;
    private boolean vacunas;

    public Mascota() {
    }

    public Mascota(int codigo, String nombre, Date fechaNacimiento, double peso, char genero, String origen, boolean vacunas) throws Exception {
        this.codigo = codigo;
        setNombre(nombre);
        this.fechaNacimiento = fechaNacimiento;
        setPeso(peso);
        this.genero = genero;
        this.origen = origen;
        this.vacunas = vacunas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if(nombre.trim().length() >= 2){
            this.nombre = nombre;
        }else{
            throw new Exception("ERROR! el nombre debe tener al menos 2 caracteres!!");
        }
        
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) throws Exception {
        if(peso >0){
            this.peso = peso;
        }else{
         throw new Exception("ERROR! el peso debe ser positivo!");
        }
        
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    @Override
    public String toString() {
        return "Mascota{" + "codigo=" + codigo + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", peso=" + peso + ", genero=" + genero + ", origen=" + origen + ", vacunas=" + vacunas + '}';
    }
    
    
}
