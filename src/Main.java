import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("2587416", "José");
        Produto pro1 = new Produto("limpeza", 25.23);
        Eletrodomestico ele1 = new Eletrodomestico("geladeira", 52, "220");
        LocalDate data1 = LocalDate.of(2023, 9, 22);
        Cliente c1 = new Cliente("24589", "Luisa", "26487", LocalDate.now());
        LocalDate data2 = LocalDate.of(2023, 9, 25);
        Vendedor v1 = new Vendedor("25689", "Pamela", "75189");
        Compra compra1 = new Compra("8451", LocalDate.now(), v1, c1);
        ItemCompra i1 = new ItemCompra(52, 56.24, pro1);
        c1.incluirCompra(compra1);
        c1.mostrarDados();

    }
}


























  /*  public void exibirHistoricoConsultas(LocalDate dataInicio, LocalDate dataFim) {
        System.out.println("Histórico de compras no intervalo de: " + dataInicio + " á " + dataFim + ":");
        for (Consulta c : consultas) {
            LocalDate dataCompra = c.getData();
            if (dataCompra.isAfter(dataInicio) && dataCompra.isBefore(dataFim)) {
                c.mostrarHistorico();
            } else {
                System.out.println("Nenhum resultado encontrado\n");
            }
        }
    }



        Paciente paciente1 = new Paciente("44004070805", "kayky", "Rua jayme bruno 79");
        paciente1.mostrarDados();
        Medico medico1 = new Medico("262261666", "pedro", "262626", "Ortopedista");
        medico1.mostrarDados();
        Medicamento medicamento1 = new Medicamento("Fernobarbital");
        medicamento1.mostrarDados();
        Secretaria secretaria1 = new Secretaria("26216611661", "Juliana", "2616161", 1500.0);
        secretaria1.mostrarDados();
        Exame exame1 = new Exame("Exame de vista");
        exame1.mostrarDados();
        Consulta C1 = new Consulta(LocalDate.now(), LocalTime.now(), paciente1, medico1, secretaria1);
        C1.addExames(exame1);
        C1.addMedicamento(medicamento1);
        C1.mostrarHistorico();
        paciente1.addConsultas(C1);
        paciente1.exibirHistoricoConsultas();
        LocalDate data1 = LocalDate.of(2023, 9, 22);
        LocalDate data2 = LocalDate.of(2023, 9, 25);
        paciente1.exibirHistoricoConsultas(data1, data2);
        LocalDate data3 = LocalDate.of(2023, 9, 22);
        LocalDate data4 = LocalDate.of(2023, 9, 29);
        paciente1.exibirHistoricoConsultas(data3, data4);
        Medico medico2 = new Medico("115161616", "joão", "1611616", "Pediatra");
        paciente1.exibirHistoricoConsultas(medico2);
        paciente1.exibirHistoricoConsultas(medico1);
   */
