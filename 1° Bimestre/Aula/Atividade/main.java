import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        calculadora calc = new calculadora();

        int op;

        op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma das seguintes opções: \n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n  4 - Divisão \n 0 - Sair"));

        do{
            switch (op) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando programa");
                    break;
                case 1:
                    calc.somar();
                    JOptionPane.showMessageDialog(null, calc.getResult());
                    break;
                case 2:
                    calc.subtrair();
                    JOptionPane.showMessageDialog(null, calc.getResult());
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;                    
                
                default:
                    break;
            }
        }while(op != 0);
    }
}
