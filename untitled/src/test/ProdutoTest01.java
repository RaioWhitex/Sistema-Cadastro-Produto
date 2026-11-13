
package test;

import dominio.Produto;

public class ProdutoTest01 {

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.setNome("Teclado");
        produto1.setPreco(150.0);
        produto1.setQuantidade(5);

        produto2.setNome("Mouse");
        produto2.setPreco(80.0);
        produto2.setQuantidade(10);

        produto1.dado();
        produto2.dado();
    }
}
