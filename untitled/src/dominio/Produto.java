
package dominio;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome inválido");
            return;
        }
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Preço inválido");
            return;
        }
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida");
            return;
        }
        this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public double calcularValorEstoque() {
        return getPreco() * getQuantidade();
    }

    public void dado() {
        System.out.printf("""
                ========== PRODUTO 1 ==========
                Nome: %s
                Preço: R$ %.1f
                Quantidade: %d
                Valor do estoque: R$ %.1f
                
                ========== PRODUTO 2 ==========
                Nome: %s
                Preço: R$ %.1f
                Quantidade: %d
                Valor do estoque: R$ %.1f
                """,
                this.nome,
                this.preco,
                this.quantidade,
                calcularValorEstoque());
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida");
            return;
        }

        this.quantidade += quantidade;
    }
}
