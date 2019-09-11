package buscaTextual;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable {

    private String root;
    private String text;
    private String file;

    public TarefaBuscaTextual(String text, String file) {
        this.root = "D:\\Projetos\\java\\thread-playground\\src\\main\\resources\\nomes\\";
        this.text = text;
        this.file = file;
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(new File( root + file));
            int i = 0;
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                if (linha.toLowerCase().contains(text.toLowerCase()))
                    System.out.println(file + " : " + linha + " - line " + i);
                i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
