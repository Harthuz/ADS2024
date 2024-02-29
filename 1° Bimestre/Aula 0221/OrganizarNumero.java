import javax.swing.JOptionPane;

public class OrganizarNumero{
    public static void main(String[] args){
        int numero[] = new int[3];
        int ordem[] = new int[3];

        JOptionPane.showMessageDialog(null, "Digite 3 números.");
        for (int i = 0; i < 3; i++){
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "° número inteiro:"));
        }

        if (numero[0] == numero[1] && numero[2] == numero[0]){
            JOptionPane.showMessageDialog(null, "Os números digitados são iguais.");
        } else{
            if (numero[0] >= numero[1] && numero[0] >= numero[2]){
                ordem[0] = numero[0];
                if (numero[1] >= numero[2]){
                    ordem[1] = numero[1];
                    ordem[2] = numero[2];
                } else {
                    ordem[1] = numero[2];
                    ordem[2] = numero[1];
                }
            } else if (numero[1] >= numero[0] && numero[1] >= numero[2]){
                ordem[0] = numero[1];
                if (numero[0] >= numero[2]){
                    ordem[1] = numero[0];
                    ordem[2] = numero[2];
                } else {
                    ordem[1] = numero[2];
                    ordem[2] = numero[0];
                }
            } else {
                ordem[0] = numero[2];
                if (numero[0] >= numero[1]){
                    ordem[1] = numero[0];
                    ordem[2] = numero[1];
                } else{
                    ordem[1] = numero[1];
                    ordem[2] = numero[0];
                }
            }
            for (int i = 0; i < 3; i++){
                System.out.println(ordem[i]);
            }
        }
    }
}
