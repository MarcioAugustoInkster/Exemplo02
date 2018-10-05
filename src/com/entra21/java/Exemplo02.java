package com.entra21.java;

import java.util.HashMap;
import java.util.Map;

public class Exemplo02 {
    public static void main(String[] args) {
        HashMap<Integer, Produto> produto = new HashMap<>();

        Produto quarto = new Produto();
        quarto.setId(1);
        quarto.setNome("Nome do Kleiton");
        quarto.setPreco(40_000);

        produto.put(quarto.getId(), quarto);

        Produto quartoDaKleita = new Produto();
        quartoDaKleita.setId(2);
        quartoDaKleita.setNome("Quarto da Kleita");
        quartoDaKleita.setPreco(40_001);
        produto.put(quartoDaKleita.getId(), quartoDaKleita);

        for (Map.Entry<Integer, Produto> produtoEntry : produto.entrySet()) {
            int id = produtoEntry.getKey();
            Produto produtoNome = produtoEntry.getValue();

            System.out.println(produtoNome.getNome());
        }

        double soma = 0;

        for (Map.Entry<Integer, Produto> entry : produto.entrySet()) {
            soma += entry.getValue().getPreco();
        }
        System.out.print("Soma: " + soma);
    }
}
