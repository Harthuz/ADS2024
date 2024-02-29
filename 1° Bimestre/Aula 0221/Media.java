import javax.swing.JOptionPane;

public class Media {
    public static void main(String[] args){
        String nome;
        double media=0;
        Double [] notas = new Double[4];

        nome = JOptionPane.showInputDialog("Digite o nome do aluno:");

        for(int i=0;i<notas.length;i++){
            notas[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do "+(i+1)+"° bimestre."));
            media+=notas[i];
        }

        media = media/4;
        System.out.println("Nome do aluno: "+nome);

        System.out.println("Notas:");
        for(int i=0;i<notas.length;i++){
            System.out.println((i+1) +"° Bimestre: " +notas[i]);
        }
        System.out.println("Média: "+media);
    }
}
