
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author user
 */

@Entity
@Table(name = "Trama De Datos")
public class TramaDeDatos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_toma;

    private int valor_tomado,id_instalacion;
    private String fecha_toma;
   
    public TramaDeDatos(int id_instalacion, int valor_tomado, String fecha_toma) {
        this.id_instalacion = id_instalacion;
        this.valor_tomado = valor_tomado;
        this.fecha_toma = fecha_toma;
    }

    public TramaDeDatos() {
    }

    public int getId_instalacion() {
        return id_instalacion;
    }

    public void setId_instalacion(int id_instalacion) {
        this.id_instalacion = id_instalacion;
    }

    public int getValor_tomado() {
        return valor_tomado;
    }

    public void setValor_tomado(int valor_tomado) {
        this.valor_tomado = valor_tomado;
    }

    public String getFecha_toma() {
        return fecha_toma;
    }

    public void setFecha_toma(String fecha_toma) {
        this.fecha_toma = fecha_toma;
    }

    public int getId_toma() {
        return id_toma;
    }

    public void setId_toma(int id_toma) {
        this.id_toma = id_toma;
    }
    
    
}
