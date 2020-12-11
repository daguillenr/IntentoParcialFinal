
package Model;

/**
 *
 * @author user
 */
public class InsertarInstalacion {
    public static void main(String[] args) {
        Instalacion i = new Instalacion(1, "Cocina", SensorDAO.buscarSensor(1).getTipo());
        boolean x = InstalacionDAO.insertar(i);
        System.out.println(x);

    }
}
