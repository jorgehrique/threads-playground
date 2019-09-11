package buscaTextual;

public class Principal {

    public static void main(String[] args) {
        String nome = "da";

        Thread threadAssinaturas1 = new Thread(new TarefaBuscaTextual(nome, "assinaturas1.txt"));
        Thread threadAssinaturas2 = new Thread(new TarefaBuscaTextual(nome, "assinaturas2.txt"));
        Thread threadAutores = new Thread(new TarefaBuscaTextual(nome, "autores.txt"));

        threadAssinaturas1.start();
        threadAssinaturas2.start();
        threadAutores.start();

    }
}
