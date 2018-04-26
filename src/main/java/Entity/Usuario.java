package Entity;

import javax.enterprise.inject.Default;
import javax.persistence.*;
import javax.ws.rs.DefaultValue;

@Entity
public class Usuario {

    @Id
    @SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1)
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "seq_usuario" )
    @Column(name = "id")
    private int id;

    private String login;
    private String senha;

    @Column(name = "acesso_aplicativo",nullable = false, columnDefinition="boolean default false")
    private boolean acesso_aplicativo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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




}
