package classes;

public class paciente {
    public String nome;
    public int cpf;
    public int telefone;
    public String genero;
    public int idade;

    public void cadastrar(){
     //cadastrar os dados
    }
    public void consultar(){
        System.out.printf("Nome: %s%n cpf: %d%n telefone: %d%n genero: %s%n idade: %d%n " , nome, cpf, telefone, genero, idade);
    }

}