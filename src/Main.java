//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Inteiros
        //byte b = 1;
        short s = 10000;
        int i = 100;
        long l = 100L;

        // FLOATS
        float f = 3.1416f;
        double d = 3.14;

        int soma = 10+10;
        int mult = 10*10;
        int div = 10/3;

        int mod = 10%5; //RESTO DA DIVISÃO
        //System.out.println(div);

        //BOOLEAN
        boolean maior = true;
        boolean vdd = !maior;

        System.out.println(vdd);

        //Char
        char x = 'A';
        char y = 'B';
        System.out.println(y+1);

        int a = 1;
        int b = 10;
        int temp;
        System.out.println("antes: a:"+a+" b:"+b);
        //System.out.println(b);

        //a , b = b , a;
        //b = a;
        temp = a;
        a = b;
        b = temp;

        System.out.println("depois: a:"+a+" b:"+b);

        //Comparações
        boolean maiorQ = 10>5;
        boolean menorQ = 5<10;
        boolean igual = 5==5;
        boolean diferente = 5!=10;

        System.out.println(!maiorQ);


        //IF ELSE

        int maiorDeIdade = 18;
        int idadePessoa = 19;
        if(idadePessoa>=maiorDeIdade){
            System.out.println("Idade: "+idadePessoa);
            System.out.println("Pode ir no Quinta Aula!");
        }else{
            System.out.println("Estude para o ENEM!");
        }

        //LAÇOS
        //;int count = 1;
        //System.out.println("Vamos contar até 10:");
        //while(count < 11){
        //    System.out.println("contador = "+count);
        //    count ++;
        //}
        //System.out.println("Vamos contar de 10 a 0:");
        //for(count = 10; count >0;count--){
        //    System.out.println("contador = "+count);
        //}

        //tabuada
        System.out.println("Vamos Fazer a Tabuada do 0 ao 10:");
        for(int n1=0; n1<11; n1++){
            System.out.println("Tabuada do: "+n1+"\n");
            for(int n2=0;n2<11;n2++){
                System.out.println(n1+"*"+n2+"="+n1*n2);
            }
            System.out.println("====================");
        }
    }
}