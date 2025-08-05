package model;

public class Usuario {
    protected int id;
    protected String nome;
    protected String email;
    protected String senha;
    protected String codigo;
    protected String tipo;

    public Usuario(int id, String nome, String email, String senha, String codigo, String tipo){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.codigo = codigo;
        this.tipo = tipo;
        setSenha(senha);
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void setSenha(String senha){
        this.senha = hashSenha(senha);
    }

    public void setcodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return this.codigo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }


    private String hashSenha(String senha){
        return senha;
        //Adicionar criptografia como SHA-256, BCrypy e etc..
    }

    public boolean autenticator(String senhaTentativa){
        return this.senha.equals(hashSenha(senhaTentativa));
    }
}
