import javax.swing.JOptionPane;

public class NumeroDecrescente {
    public static void main(String[] args){
        int numInt;

        numInt = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));

        for(int i=numInt;i>=0;i--){
            System.out.println(i);
        }
    }
}