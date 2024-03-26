// Classe Caixa
package org.example;

import javax.swing.JOptionPane;

public class Caixa {
    private Double saldo; // Variável armazenar o saldo

    // Construtor padrão
    public Caixa(){
        this(0.0); // Inicializa o saldo como 0.0
    }
    
    // Construtor
    public Caixa(Double saldo) {
        this.saldo = saldo;
    }

    // Método para obter o saldo
    public Double getSaldo() {
        return saldo;
    }

    // Método para definir o saldo
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // Método para realizar uma entrada de dinheiro
    public void entrar(){
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da entrada:"));

        setSaldo(this.saldo+valor); // Adiciona o valor ao saldo
    }

    // Método para realizar uma retirada de dinheiro
    public void retirar(){
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da retirada:"));

        setSaldo(this.saldo-valor); // Subtrai o valor do saldo
    }
}
