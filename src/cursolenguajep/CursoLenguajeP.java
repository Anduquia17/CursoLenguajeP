/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursolenguajep;

import modelado.ClinicaVeterinaria;
import modelado.Gato;
import modelado.Mascota;
import modelado.Perro;

/**
 *
 * @author juanjoanduquia
 */
public class CursoLenguajeP { 
    public static void main(String[] args) {
        ClinicaVeterinaria c = new ClinicaVeterinaria();

        Mascota m1 = new Perro("Toby");
        Mascota m2 = new Gato("Pelusa");

        c.recibirMascota(m1);
        c.recibirMascota(m2);
    }
    
}
