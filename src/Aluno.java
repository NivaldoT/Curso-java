public class Aluno {
    String nome, cpf;
    int idade;
    boolean formado;
    double nota1, nota2;

    public Aluno(String nome, String cpf, int idade, boolean formado, double nota1, double nota2){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.formado = formado;
        this.nota1 = nota1;
        this.nota2 = nota2;
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
    double media(){
        return (nota1 + nota2)/2;
    }
}
