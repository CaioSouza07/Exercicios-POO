import javax.sound.midi.SysexMessage;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //EXERCÍCIO 1
        /*
        System.out.println("Digite um numero: ");
        Long numero = leitor.nextLong();

        Long soma = numero + 1L;

        System.out.println("A soma é: " + soma);
        */

        //EXERCÍCIO 2
        /*
        System.out.println("Digite um numero inteiro: ");
        int numero = leitor.nextInt();

        float resto = numero % 2;

        if (resto == 0) {
            System.out.println("É um número par!");
        }else{
            System.out.println("É um número ímpar!");
        }
         */

        //EXERCÍCIO 3
        /*
        System.out.println("Digite um número: ");
        float primNumero = leitor.nextFloat();

        System.out.println("Digite outro número: ");
        float segNumero = leitor.nextFloat();

        float divisao = primNumero / segNumero;

        System.out.println("O resulado da divisão é: " + divisao);
        */

        // EXERCÍCIO 4
        /*
        System.out.println("Digite um texto: ");
        String primTexto = leitor.nextLine();

        System.out.println("Digite outro texto: ");
        String segTexto = leitor.nextLine();

        if (primTexto.intern() == segTexto.intern()){
            System.out.println("São iguais!");
        }else{
            System.out.println("São diferentes!");
        }
        */

        // EXERCÍCIO 5
        /*
        Character numero = 88;

        System.out.println(numero);
        */

        // EXERCÍCIO 6
        /*
        int x = 10;
        int y = 10;
        System.out.println (x++) ;
        System.out.println (++y) ;
        System.out.println ("x="+ x ) ;
        System.out.println ("y="+ y ) ;
        */

        // EXERCÍCIO 7
        /*
        int x = 10;
        int y = 2;
        System.out.println ("x em binario = "+ Integer.toBinaryString ( x ) ) ;
        x = x >> y;
        System.out.println ("x = " + x ) ;
        System.out.println ("x em binario = "+ Integer.toBinaryString ( x ) ) ;
        */
        

    }

}