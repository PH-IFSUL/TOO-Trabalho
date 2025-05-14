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
public class TestClass {
  
    public static void main(String[] args) {
                Plano planoBasico = new Plano("Básico", "Uso dos Equipamentos", 100.0);

        //Aluno sem Desconto
        Aluno a2 = new Aluno("Carlos Silva", "2023001", LocalDate.now());
        a2.setPlano(planoBasico);
        a2.verificaDesconto();

        //Aluno com Desconto
        Aluno a1 = new Aluno("Maria Oliveira", "2022002", LocalDate.now().minusMonths(4));
        a1.setPlano(planoBasico);
        a1.verificaDesconto();

        System.out.println("\nAluno I");
        System.out.println(a1.exibirDados());
        
        System.out.println("Aluno II");
        System.out.println(a2.exibirDados());
    }
}
