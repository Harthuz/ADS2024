import javax.swing.JOptionPane;

public class Pessoa {
    private String nome;
    private String endereco;
    private Double salario;
    private String telefone;
    private String email;

    public Pessoa(){
        this("","",0.0,"","");
    }

    public Pessoa(String nome, String endereco, Double salario, String telefone, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void inserirDadosPessoa(){
        JOptionPane.showMessageDialog(null, "Digite as seguintes informações da pessoa:");
        setNome(JOptionPane.showInputDialog("Nome:"));
        setEndereco(JOptionPane.showInputDialog("Endereço:"));
        setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salário:")));
        setTelefone(JOptionPane.showInputDialog("Telefone:"));
        setEmail(JOptionPane.showInputDialog("Email:"));
    }

    public void apresentarPessoa(){
        String info =   "Informações Da Pessoa \n" +
                        "\n Nome: " + getNome() +
                        "\n Endereço: " + getEndereco() +
                        "\n Salário: " + getSalario() +
                        "\n Telefone: " + getTelefone() +
                        "\n Email: " + getEmail() +
                        "\n";

        JOptionPane.showMessageDialog(null, info);
    }
}