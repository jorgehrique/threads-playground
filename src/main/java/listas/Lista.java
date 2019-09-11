package listas;

public class Lista {

    private String[] elementos = new String[1000];
    private int indice = 0;

    public synchronized void adicionaElemento(String elemento) throws InterruptedException {
        this.elementos[indice] = elemento;
        this.indice++;
        Thread.sleep(10);
    }

    public int tamanho() {
        return this.elementos.length;
    }

    public String pegaElemeto(int posicao) {
        return this.elementos[posicao];
    }

}
