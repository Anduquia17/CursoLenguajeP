
import modelado.Gato;
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
public class TestCasting {

    public static void main(String[] args) {
        Mascota m = new Gato("Michi");

        if (m instanceof Perro) {
            Perro p = (Perro) m;
            p.ladrar();
        } else {
            System.out.println("No es un perro, no se puede ladrar.");
        }
    }
}