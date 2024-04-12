import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private String telefone;

    private LocalDate data;

    private List <Compra> compras = new ArrayList<>();

    public Cliente(String cpf, String nome, String telefone, LocalDate data) {
        super(cpf, nome);
        this.telefone = telefone;
        this.data = data;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    public void exibirHistoricoCompras(LocalDate dataInicial, LocalDate dataFinal) {
        for (Compra c: this.compras) {
            if ((c.getDataCompra().isAfter(dataInicial) && c.getDataCompra().isBefore(dataFinal))){
                this.mostrarDados();
            }
        }

    }

    public void incluirCompra(Compra compras) {
        this.compras.add(compras);
    }

    public void removerCompra(Compra compras) {
        this.compras.remove(compras);
    }

    public void mostrarDados() {
        System.out.println("\nDados do cliente: " +
                "\nNome: " + getNome() +
                "\nCPF: " + getCpf() +
                "\nTelefone: " + getTelefone() +
                "\nCompras: ");

        for (Compra c : this.compras) {
            System.out.println(c.getNumeroCompra());
        }
    }
}
