import javax.swing.JOptionPane;

public class ComparaNumero {
    public static void main(String[] args){
        int num1, num2;

        System.out.println("Comparando Números:");
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));

        if(num1!=num2){
            if(num1>num2){
                System.out.println("Os números são diferentes.");
                System.out.println("O primeiro número digitado ("+num1+") é maior do que o segundo número digitado ("+num2+")");
            }
            if(num2>num1){
                System.out.println("Os números são diferentes.");
                System.out.println("O segundo número digitado ("+num2+") é maior do que o primeiro número digitado ("+num1+")");
            }
        }else{
            System.out.println("Os números digitados são iguais.");
        }
    }
}