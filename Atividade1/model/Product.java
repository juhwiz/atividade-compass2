package model;

public class Product {
    private Integer id;
    private String nome;
    private String descricao;
    private Integer quantidade;
    private double preco;
    
    public Product(String nome, String descricao, Integer quantidade, double preco){
        super();
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
