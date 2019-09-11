package listas;

public class TarefeImprimir implements Runnable {

    private Lista lista;

    public TarefeImprimir(Lista lista) {
        this.lista = lista;
    }

    @Override
    public void run() {
        synchronized (lista) {
            try {
                lista.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < lista.tamanho(); i++) {
                System.out.println(lista.pegaElemeto(i));
            }
        }
    }
}
