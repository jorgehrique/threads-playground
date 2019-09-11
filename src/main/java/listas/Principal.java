package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Principal {
    public static void main(String[] args) throws InterruptedException {

        Lista lista = new Lista();

        for (int i = 0; i < 10; i++) {
            new Thread(new TarefaAdicionarElemento(lista, i)).start();
        }

        new Thread(new TarefeImprimir(lista)).start();

//        List<String> list = Collections.synchronizedList(new ArrayList<>());
//        List<String> list = new Vector<>();
//        for (int i = 0; i < 10; i++) {
//            new Thread(new TarefaAdicionarList(list)).start();
//        }
//        Thread.sleep(2000);
//        list.stream().forEach(System.out::println);
    }
}
