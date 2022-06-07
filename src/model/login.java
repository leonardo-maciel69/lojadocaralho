package model;

public class login {

    private long id;
    private String usuario;
    private String senha;
    private String cpf;

    public long getId() {return id;}
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "login{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
