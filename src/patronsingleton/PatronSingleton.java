/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronsingleton;

/**
 *
 * @author Alexander
 */
public class PatronSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Obtener la única instancia del Singleton
        Singleton instancia1 = Singleton.obtenerInstancia();
        instancia1.mostrarMensaje();
        
        // Intentar obtener otra instancia, pero será la misma
        Singleton instancia2 = Singleton.obtenerInstancia();
        instancia2.mostrarMensaje();
        
        // Comparar ambas instancias
        if (instancia1 == instancia2) {
            System.out.println("Las dos instancias son iguales.");
        } else {
            System.out.println("Las instancias son diferentes.");
        }
    }
    }
    
