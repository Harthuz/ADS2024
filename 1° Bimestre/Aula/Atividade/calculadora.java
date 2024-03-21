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

    public void somar(){
        result = 0.0;
        double valores[] = new double[2];
        for(int i=0;i<2;i++){
            valores[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " +(i+1) +"° valor:"));
            setNum1(result+=valores[i]);
        }
    }

    public void subtrair(Double val1, Double val2){
        result = 0.0;
        result = val1 - val2;
    }
}