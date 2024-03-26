import javax.swing.JOptionPane;

public class calculadora {
    private Double num1;
    private Double num2;
    private Double result;
    
    public calculadora(){
        this(0.0,0.0,0.0);
    }

    public calculadora(Double num1, Double num2, Double result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    // Método operação de soma
    // Sem parâmetros, sem retorno
    public void somar(){
        result = 0.0;
        double valores[] = new double[2];
        for(int i=0;i<2;i++){
            valores[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " +(i+1) +"° valor:"));
            setNum1(result+=valores[i]);
        }
    }

    // Método operação de subtração
    // Com parâmetros, sem retorno
    public void subtrair(Double val1, Double val2){
        result = 0.0;
        result = val1 - val2;
    }

    // Método operação de multiplicação
    // Sem parâmetros, com retorno
    public Double multiplicar(){
        result = 0.0;
        double valores[] = new double[2];
        for(int i=0;i<2;i++){
            valores[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " +(i+1) +"° valor:"));
        }
        result = valores[0] * valores[1];
        return result;
    }

    // Método operação de divisão
    // Com parâmetros, com retorno
    public Double dividir(Double val1, Double val2){
        result = val1 / val2;
        return result;
    }
}