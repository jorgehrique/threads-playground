package listas;

public class TarefaAdicionarElemento implements Runnable {

    private Lista lista;
    private int threadNumber;

    public TarefaAdicionarElemento(Lista lista, int threadNumber) {
        this.lista = lista;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                lista.adicionaElemento("Thread " + threadNumber + " value : " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
