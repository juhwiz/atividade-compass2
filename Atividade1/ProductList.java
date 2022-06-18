import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductList {
    private List<Product> listaProduto = new ArrayList<Product>();

    public List<Product> returnList(){
        Product caneca = new Product("Caneca", "Caneca Starbucks", 1, 15.00);
        Product garrafa = new Product("Garrafa", "Garrafa Térmica", 5, 54.69);
        Product oculos = new Product("Óculos", "Óculos RayBan", 6, 317.59);
        Product estojo = new Product("Estojo", "Estojo Preto", 20, 11.29);
        Product funko = new Product("Funko", "Funko Harry Potter", 3, 59.90);
        Product violao = new Product("Violão", "Violão Preto", 1, 69.99);
        Product celular = new Product("Celular", "Celular Samsung", 3, 1400.99);
        Product notebook = new Product("Notebook", "Notebook Samsung", 2, 4059.90);
        Product caneta = new Product("Caneca", "Caneca Esferográfica", 50, 1.99);

        this.listaProduto.add(caneca);
        this.listaProduto.add(garrafa);
        this.listaProduto.add(oculos);
        this.listaProduto.add(estojo);
        this.listaProduto.add(funko);
        this.listaProduto.add(violao);
        this.listaProduto.add(celular);
        this.listaProduto.add(notebook);
        this.listaProduto.add(caneta);

        return this.listaProduto;
    } 
}
