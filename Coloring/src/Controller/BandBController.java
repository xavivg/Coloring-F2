package Controller;

import model.Conf;
import model.Configuracion;

import java.util.Comparator;
import java.util.PriorityQueue;
import static Controller.AuxiliarFunctions.*;
import static model.Main.xMejor;

public class BandBController {

    public static void branchAndBound(Conf conf, int k) throws InterruptedException {
        PriorityQueue<Configuracion> nodosVivos = new PriorityQueue(new Comparator<Configuracion>() {
            @Override
            public int compare(Configuracion o1, Configuracion o2) {
                return o1.getNota() - o2.getNota();
            }
        });
        Configuracion x = new Configuracion();
        x = configuracionRaiz(x, conf);
        nodosVivos.add(x);
        Conf[] hijos = new Conf[MAX_COLORS];
        hijos = expande(x);
        while (nodosVivos.isEmpty()){
           x = nodosVivos.poll();
            for (int i = 0; i < hijos.length; i++) {

            }
        }
        nodosVivos.remove(x);
    }
}
