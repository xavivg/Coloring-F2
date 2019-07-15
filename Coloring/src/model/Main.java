package model;

import view.BoardGUI;

/**
 * Clase con un procedimiento principal que ilustra el funcionamiento de la clase "BoardGUI".
 *
 * @author Xavi Solé (xavier.sole@salle.url.edu) - La Salle, Universitat Ramon Llull
 * @version 10/04/2019
 */
public class Main {

    /**
     * Procedimiento principal que crea una ventana y pinta 6 celdas de color distinto.
     */
    public static void main(String[] args) {
        // Crear la GUI en función de la dimensión y las regiones
        BoardGUI vista = new BoardGUI(10, 6);
        // Mostrar la vista
        vista.setVisible(true);
        // Pintar celdas
        vista.setCellColor(0,0, 1);
        vista.setCellColor(1,1, 2);
        vista.setCellColor(2,2, 3);
        vista.setCellColor(3,3, 4);
        vista.setCellColor(4,4, 5);
        vista.setCellColor(5,5, 6);
        // ...




    }
}
