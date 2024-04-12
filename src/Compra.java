import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compra {
    private String numeroCompra;
    private LocalDate dataCompra;
    private double valorTotalCompra;
    private double valorDesconto;
    private double valorPagar;
    private Vendedor vendedor;
    private Cliente cliente;

    private List <ItemCompra> itens = new ArrayList<>();

    public Compra(String numeroCompra, LocalDate dataCompra, Vendedor vendedor, Cliente cliente) {
        this.numeroCompra = numeroCompra;
        this.dataCompra = dataCompra;
        this.setVendedor(vendedor);
        this.setCliente(cliente);
    }

    public String getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(String numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }
    // vou ter 1 vendedor


    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void calcularValorTotalCompra() {
        double soma=0;
        for(ItemCompra item: itens) {
            soma += item.getValorTotal();
            valorTotalCompra = soma;
             if (soma > 1000) {
                 this.valorDesconto = (5.0/100.0) * soma;
                 this.valorPagar = soma - this.valorDesconto;

             } else {
                 this.valorPagar = soma;
                 this.valorDesconto = 0;
             }
        }

    }

    public void incluirItemCompra(ItemCompra itemCompra) {
        Collections.addAll(this.itens, itemCompra);
        this.calcularValorTotalCompra();
    }

    public void removerItemCompra(ItemCompra itemCompra) {
        this.itens.remove(itemCompra);
        this.calcularValorTotalCompra();
    }


}
