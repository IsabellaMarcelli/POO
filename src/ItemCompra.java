public class ItemCompra {
    private int quantidadeCompra;
    private double valorTotal;
    private Produto produto;

    public ItemCompra(int quantidadeCompra, double valorTotal, Produto produto) {
        this.quantidadeCompra = quantidadeCompra;
        this.setProduto(produto);
    }

    public int getQuantidadeCompra() {
        return quantidadeCompra;
    }

    public void setQuantidadeCompra(int quantidadeCompra) {
        this.quantidadeCompra = quantidadeCompra;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void calcularValorTotal() {
        this.setValorTotal(this.produto.getPrecoUnitario() * this.quantidadeCompra);
    }

}
