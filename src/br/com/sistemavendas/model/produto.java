package br.com.sistemavendas.model;

import java.util.Objects;

public class produto {
    private String descricao;
    private String marca;
    private String modelo;
    private float vlr_compra;
    private float vlr_venda;

    public produto() {
    }

    public produto(String descricao, String marca, String modelo, float vlr_compra, float vlr_venda) {
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
        this.vlr_compra = vlr_compra;
        this.vlr_venda = vlr_venda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVlr_compra() {
        return vlr_compra;
    }

    public void setVlr_compra(float vlr_compra) {
        this.vlr_compra = vlr_compra;
    }

    public float getVlr_venda() {
        return vlr_venda;
    }

    public void setVlr_venda(float vlr_venda) {
        this.vlr_venda = vlr_venda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        produto produto = (produto) o;
        return Float.compare(produto.vlr_compra, vlr_compra) == 0 && Float.compare(produto.vlr_venda, vlr_venda) == 0 && Objects.equals(descricao, produto.descricao) && Objects.equals(marca, produto.marca) && Objects.equals(modelo, produto.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao, marca, modelo, vlr_compra, vlr_venda);
    }

    @Override
    public String toString() {
        return "produto{" +
                "descricao=" + descricao +
                ", marca=" + marca +
                ", modelo=" + modelo +
                ", vlr_compra=" + vlr_compra +
                ", vlr_venda=" + vlr_venda +
                '}';
    }
}
