import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        calculadora calc = new calculadora();
        double valores[] = new double[2];

        int op;

        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma das seguintes opções: \n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão \n 0 - Sair"));
            switch (op) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando programa");
                    break;
                case 1:
                    calc.somar(); // Chamando o método somar() da calculadora
                    JOptionPane.showMessageDialog(null, calc.getResult());
                    break;
                case 2:
                    for(int i=0;i<2;i++){
                        valores[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " +(i+1) +"° valor:"));
                    }
                    calc.subtrair(valores[0], valores[1]); // Chamando o método subtrair() da calculadora com parâmetros
                    JOptionPane.showMessageDialog(null, calc.getResult());
                    break;
                case 3:
                    Double resultado = calc.multiplicar(); // Chamando o método multiplicar() da calculadora com retorno
                    JOptionPane.showMessageDialog(null, resultado);
                    break;
                case 4:
                    for(int i=0;i<2;i++){
                        valores[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " +(i+1) +"° valor:"));
                    }
                    resultado = calc.dividir(valores[0], valores[1]); // Chamando o método dividir() da calculadora com parâmetros e retorno
                    JOptionPane.showMessageDialog(null, resultado);
                    break;                    
                
                default:
                    break;
            }
        }while(op != 0);
    }
}
