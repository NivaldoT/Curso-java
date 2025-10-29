public class Aluno {
    String nome;
    int idade;
    String cpf;
    boolean formado;

    public Aluno(String nome, String cpf, int idade, boolean formado){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.formado = formado;
    }

    void descrever(){
        System.out.println("\nNome: "+this.nome+"\nCPF: "+this.cpf+"\nIdade: "+this.idade+"\nÉ Formado(a)? "+this.formado+"\n");
    }
    void isFormado(){
        if(this.formado){
            System.out.println("O aluno: "+this.nome+" é formado(a).");
        }
        else{
            System.out.println("O aluno: "+this.nome+" não é formado(a).");
        }
    }
}
