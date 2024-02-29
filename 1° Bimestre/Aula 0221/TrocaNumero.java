import javax.swing.JOptionPane;

public class TrocaNumero {
    public static void main(String[] args) throws InterruptedException{
        int NumA= 0, NumB=0, Troca=0;

        NumA = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        NumB = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:"));

        System.out.println("\n Numeros digitados: \n NumA: " +NumA +"\n NumB: " +NumB);
        
        Troca = NumA;
        NumA = NumB;
        NumB = Troca;

        System.out.println("\n Trocando");

        for (int i = 0; i < 10; i++) {
            Thread.sleep(500);
            System.out.print(".");
        }

        System.out.println("\n \n NumA agora é: " +NumA +"\n NumB agora é: " +NumB);
    }
}
