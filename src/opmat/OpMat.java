
package opmat;

import java.util.Scanner;

public class OpMat {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a, b, soma, subtracao;
        System.out.println("Digite um número inteiro: ");
        a = leia.nextInt();
        System.out.println("Digite outro número inteiro: ");
        b = leia.nextInt();
        
        if(a > 10 && b > 10){
            soma = a + b;
            System.out.println(soma);
            subtracao = a - b;
            System.out.println(subtracao);
        } else{
            System.out.println("Impossível realizar operação");
        }
    }
    
}
