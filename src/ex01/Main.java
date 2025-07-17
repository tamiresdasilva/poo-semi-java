package ex01;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto ("Kindle 16 GB (Última Geração)", 584.10, "Tonalidade preta. Leve e compacto, com tela antirreflexo, trocas de página mais rápidas, luz frontal ajustável e bateria de longa duração.");
        Produto p2 = new Produto("Robô Aspirador de Pó Inteligente S20 Xiaomi", 1.970, "Tonaldiade branca. Possui mapeamento inteligente com navegação lógica a laser de precisão, acoplamento automático, aspiração e limpezas simultâneas.");
        Produto p3 = new Produto("Câmera Veicular Duo Intelbras DC 3201 2K", 677.10, "Tonalidade preta. Possui duas câmeras em um único produto, gravação de áudio e em loop, resolução 2K+ (2560 x 1440p) 30fps, com amplo campo de visão.");

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarAoCarrinho(p1);
        carrinhoDeCompras.adicionarAoCarrinho(p2);
        carrinhoDeCompras.adicionarAoCarrinho(p3);

        carrinhoDeCompras.listarProdutos();
        NumberFormat numberFormat = NumberFormat.getInstance(new Locale("pt", "BR"));
        System.out.println(" - Valor Total: R$ " + numberFormat.format(carrinhoDeCompras.getTotal()));
    }

}