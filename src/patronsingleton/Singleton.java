/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronsingleton;

/**
 *
 * @author Alexander
 */
public class Singleton {

    // Crear una instancia estática privada de la clase Singleton
    private static Singleton instanciaUnica;

    // Constructor privado para evitar que se creen objetos desde fuera de la clase
    private Singleton() {
        System.out.println("Instancia de Singleton creada");
    }

    // Método público estático que retorna la única instancia de la clase
    public static Singleton obtenerInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Singleton();
        }
        return instanciaUnica;
    }

    // Método de ejemplo para usar la instancia
    public void mostrarMensaje() {
        System.out.println("¡Este es un mensaje del Singleton!");
    }
}
