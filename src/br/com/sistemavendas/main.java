package br.com.sistemavendas;

import br.com.sistemavendas.model.produto;

public class main {
    public static void main(String[] args) {
        produto prod1 = new produto();
        prod1.setDescricao("Notebook Gamer");
        prod1.setMarca("Acer");
        prod1.setModelo("Nitro 5");
        prod1.setVlr_compra(5200);
        prod1.setVlr_venda(8000);
        float valor_compra = prod1.getVlr_compra();
        float valor_venda = prod1.getVlr_venda();
        float lucro = valor_venda - valor_compra;
        System.out.println("Dados do produto:");
        /*System.out.println(prod1.getDescricao());
        System.out.println(prod1.getMarca());
        System.out.println(prod1.getModelo());
        System.out.println(prod1.getVlr_compra());
        System.out.println(prod1.getVlr_venda());*/
        System.out.println(prod1);
        System.out.println("Lucro: " + lucro);
        System.out.println("teste");


    }


}
