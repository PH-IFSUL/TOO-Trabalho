/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifsul.trabalho.too;
import java.time.LocalDate;
/**
 *
 * @author PH
 */
public class Aluno extends Pessoa{
    private final String matricula;
    private final LocalDate dataMatricula;
    private double valorMensalidade;
    private final AvaliacaoFisica[] avaliacoes;
    private int i = 0;
    private Plano plano;

    public Aluno(String nome, String matricula, LocalDate dataMatricula) {
        super(nome);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
        this.avaliacoes = new AvaliacaoFisica[10];
    }

    public void addAvaliacao(AvaliacaoFisica avaliacao) {
        if (i < 10) {
            avaliacoes[i] = avaliacao;
            i++;
        } else {
            System.out.println("Sem espaço");
        }
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
        verificaDesconto(); // já define o valor da mensalidade com ou sem desconto
    }

    public void verificaDesconto() {
    if (plano == null || dataMatricula == null) return;

    LocalDate hoje = LocalDate.now();
    int anos = hoje.getYear() - dataMatricula.getYear();
    int meses = hoje.getMonthValue() - dataMatricula.getMonthValue();
    int totalMeses = anos * 12 + meses;

    if (totalMeses >= 3) {
        valorMensalidade = plano.getValor() * 0.9;
    } else {
        valorMensalidade = plano.getValor();
    }
}

    public String exibirDados() {
        String aux = "Aluno: " + name + "\n";
        aux += "Matrícula: " + matricula + "\n";
        aux += "Data de Matrícula: " + dataMatricula + "\n";
        aux += "Plano: " + (plano != null ? plano.toString() : "Nenhum") + "\n";
        aux += String.format("Valor Mensalidade: R$ %.2f\n", valorMensalidade);

        if (i == 0) {
            aux += "Sem avaliações.\n";
        } else {
            aux += "Avaliações:\n";
            for (int j = 0; j < i; j++) {
                aux += "Avaliação " + (j + 1) + ":\n";
                aux += avaliacoes[j].exibirDados() + "\n";
            }
        }
        return aux;
    }
}
