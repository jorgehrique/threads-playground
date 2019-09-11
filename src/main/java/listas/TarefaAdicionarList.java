package listas;

import java.util.List;

public class TarefaAdicionarList implements Runnable {

    private List<String> list;

    public TarefaAdicionarList(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            list.add(" Convidado " + i + " th :" + Thread.currentThread().getId());
        }
    }
}
