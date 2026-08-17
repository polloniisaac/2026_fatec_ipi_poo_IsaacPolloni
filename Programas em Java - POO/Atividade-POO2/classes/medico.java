package classes;

public class medico {
   public String nome;
   public int crm;
   public int telefone;
   public String especialidade;
   public String senha;

   public void mostrar(){
       System.out.println("nome: " + nome);
       System.out.println("crm: "+ crm);
       System.out.println("telefone: "+ telefone);
       System.out.println("especiialidade: "+ especialidade);
       System.out.println("senha: "+ senha);
   }
}