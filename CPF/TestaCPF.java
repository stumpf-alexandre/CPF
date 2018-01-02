package CPF;

import java.util.Scanner;

/*Crie uma classe CPF, para validar CPFS válidos, essa classe precisa de dois construtores para CPF, um que recebe um
int, e outro que recebe uma strings. Crie métodos para poder exibir o cpf de 3 formas:
“006.594.220-50”
“00659422050”
“659422050"
#dica use uma StringBuilder pra manipular a string
#dica2 só podem ser criados cpfs se esses forem válidos(ja tem função pronta para isso na classe)
#dica3 o usuário poderá informar o cpf,  assim “006.594.220-50” ou “00659422050” ou “659422050”, entretanto a função
isCPF só funciona se for informado assim “00659422050" efetue o tratamento disso. Teste num Main*/

public class TestaCPF {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        String CPF;

        System.out.printf("Informe um CPF: ");
        CPF = tc.next();

        System.out.println("Resultado: ");
// usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
        if (ValidaCPF.isCPF(CPF) == true) {
            System.out.println(ValidaCPF.imprimeCPFConcatenado(CPF));
            System.out.println(ValidaCPF.imprimeCPF(CPF));
            long cpf=Long.parseLong(String.valueOf(ValidaCPF.imprimeCPF(CPF)));
            System.out.println(cpf);
        }
        else System.out.println("Erro, CPF invalido !!!");
    }

}
