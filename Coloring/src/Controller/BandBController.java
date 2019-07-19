package Controller;

import model.Conf;

import java.util.Comparator;
import java.util.PriorityQueue;

import static Controller.AuxiliarFunctions.*;
import static model.Main.xMejor;

public class BandBController {

    public static void branchAndBound(Conf x, int k) throws InterruptedException {
        PriorityQueue nodosVivos = new PriorityQueue(new Comparator<Conf>() {
            @Override
            public int compare(Conf o1, Conf o2) {
                return o1.getNota() - o2.getNota();
            }
        });
        x = configuracionRaiz(x);
        nodosVivos.add(x);
        Conf[] hijos = new Conf[MAX_COLORS];
        hijos = expande(x);
        while (nodosVivos.isEmpty()){
           //x = nodosVivos.peek();
        }
    }
}
