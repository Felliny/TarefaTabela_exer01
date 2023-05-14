package View;

import Controller.TabelaController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        TabelaController tabelaController= new TabelaController();

        try {
            tabelaController.lerArquivo();
            tabelaController.CriarArquivo();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
