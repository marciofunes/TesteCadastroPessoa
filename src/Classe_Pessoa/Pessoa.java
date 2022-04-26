package Classe_Pessoa;

import virandoocapetanomercadodetrabalho.Contato;

public class Pessoa extends Contato{
    private String nome;
    private String endereco;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

    //construtor vazio (coitado)
    public Pessoa() {
       
    }
     

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    public void imprimePessoa(){
        System.out.println("Nome: " + nome);
    }

    
    
    
    
}
