// Classe principal Main
package org.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        Caixa cx = new Caixa(); // Instanciação de um objeto Caixa

        int op=0;

        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n 1 - Entrada \n 2 - Retirada \n 3 - Consultar Saldo \n 0 - Sair"));

            switch (op) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando programa");
                    break;
                case 1:
                    cx.entrar(); // Chama o método de entrada
                    break;
                case 2:
                    cx.retirar(); // Chama o método de retirada
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "\n O seu saldo atual é de: \n R$ " +cx.getSaldo()); // Concatena a mensagem com a chamada da função getSaldo na classe Caixa = cx
                    break;  
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!"); 
                    break;
            }

        }while(op != 0);
    }
}