package ex01;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CarrinhoDeCompras {
    private List<Produto> produtos;
    private double valorTotal;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarAoCarrinho(Produto produto) {
        produtos.add(produto);
        valorTotal += produto.getValor();
    }

    public double getTotal(){
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getValor();
        }
        return valorTotal;
    }

    public void listarProdutos() {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.println("Produtos no Carrinho:");
        for (Produto produto : produtos) {
            System.out.println(" - " + produto.getNome() + " | " + numberFormat.format(produto.getValor()) + " | " + produto.getDescricao());
        }
    }
}
