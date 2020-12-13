
package Model;

/**
 *
 * @author user
 */
public class InsertarSensor {
    
    public static void main(String[] args) {

        Sensor s = new Sensor("KY-017", "Módulo óptico de Mercurio", 0, 1, false, 0);
        boolean x = SensorDAO.insertar(s);
        System.out.println(x);
    }
    
}
