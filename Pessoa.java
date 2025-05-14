/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifsul.trabalho.too;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author PH
 */
public class Pessoa {
private AvaliacaoFisica[] avaliacoes;
String name;
private int i = 0;

public Pessoa(){
}
public Pessoa(String name){
	this.name = name;
        avaliacoes = new AvaliacaoFisica[10];
}

// Métodos de acesso (Getters e Setters)

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

    public void addAvaliacao(AvaliacaoFisica avaliacao) {
        if(i < 10){
            avaliacoes[i] = avaliacao;
            i++;
        } 
        else{
            System.out.println("Sem espaço");
        }
    }

    public String exibirDados(){    
        String aux = "Dados da Pessoa: \n";
        aux += "Nome: "+name+"\n";
        
        if(i == 0){
            aux += "Sem avaliações registradas.\n";
        }
        else{
            aux += "Avaliações:\n";
            for (int j = 0; j < i; j++) {
                aux += "Avaliação " + (j + 1) + ":\n";
                aux += avaliacoes[j].exibirDados() + "\n";
            }
        }
        
    return aux;
    }
}