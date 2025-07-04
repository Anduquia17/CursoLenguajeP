/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModificadoresDeAcceso;

/**
 *
 * @author juanjoanduquia
 */
public class AccesoMismoPaquete {

    public static void main(String[] args) {
        Mascota m = new Mascota();

        System.out.println(m.nombreDefault);
        System.out.println(m.nombreProtegido);
        System.out.println(m.nombrePublico);

        m.metodoDefault();
        m.metodoProtegido();
        m.metodoPublico();
    }
}
