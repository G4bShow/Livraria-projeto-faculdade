package br.com.livraria.model;

public class Livro {

    private String titulo;
    private String isbn;
    private String preco;
    private int quantidadeEstoque;
    private Autor autor;


    public Livro(String titulo, String isbn, String preco, int quantidadeEstoque, Autor autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEstoque += quantidade;
        }
    }

    public  bloean vender() {
        if (quantidadeEstoque > 0 {
            quantidadeEstoque--;
            return true;
        }
        return false;
    }
}


