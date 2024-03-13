public class Usuario {

    // Atributos
    private String name;
    private String email;
    private String login;
    private String senha;

    // Contrutores
    public Usuario(){
        this("Hernandes","hernandes@gmail.com","","");
    }

    // Inicializa  os atributos vazios
    public Usuario(String name, String email, String login, String senha) {
        this.name = name;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void provarExistencia(){
        System.out.println("Oi, meu nome é " +this.name +", e meu email é \"" + this.email +"\"");
    }
}