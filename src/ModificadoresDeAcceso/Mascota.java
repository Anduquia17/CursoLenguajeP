/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModificadoresDeAcceso;

/**
 *
 * @author juanjoanduquia
 */
public class Mascota {

    private String nombrePrivado = "Privado";
    String nombreDefault = "Default";
    protected String nombreProtegido = "Protegido";
    public String nombrePublico = "Público";

    private void metodoPrivado() {
        System.out.println("Método privado");
    }

    void metodoDefault() {
        System.out.println("Método default");
    }

    protected void metodoProtegido() {
        System.out.println("Método protegido");
    }

    public void metodoPublico() {
        System.out.println("Método público");
    }
}
