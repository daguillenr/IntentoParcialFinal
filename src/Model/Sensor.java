
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
@Table(name = "Tipo De Sensor")
public class Sensor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sensor;
    
    
    private String tipo, nombre;
    private int min_permitido, max_permitido, num_horas;
    private boolean promedio;
    
    public Sensor() {
    }
    
    public Sensor(String tipo, String nombre, int min_permitido, int max_permitido, boolean promedio, int num_horas) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.min_permitido = min_permitido;
        this.max_permitido = max_permitido;
        this.promedio = promedio;
        this.num_horas = num_horas;
        }

    public int getId_sensor() {
        return id_sensor;
    }

    public void setId_sensor(int id_sensor) {
        this.id_sensor = id_sensor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMin_permitido() {
        return min_permitido;
    }

    public void setMin_permitido(int min_permitido) {
        this.min_permitido = min_permitido;
    }

    public int getMax_permitido() {
        return max_permitido;
    }

    public void setMax_permitido(int max_permitido) {
        this.max_permitido = max_permitido;
    }

    public int getNum_horas() {
        return num_horas;
    }

    public void setNum_horas(int num_horas) {
        this.num_horas = num_horas;
    }

    public boolean isPromedio() {
        return promedio;
    }

    public void setPromedio(boolean promedio) {
        this.promedio = promedio;
    }
    
    
}
