
import modelado.Mascota;
import modelado.Perro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author juanjoanduquia
 */
public class Actividad {

    public static void main(String[] args) {
        Mascota m = new Perro("Firulais");

        if (m instanceof Perro) {
            Perro p = (Perro) m;
            p.ladrar();
        } else {
            System.out.println("No es un perro.");
        }
    }
}
