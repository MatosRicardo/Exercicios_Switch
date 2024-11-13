package comandocondicionais;
import java.util.Scanner;

public class Switch4 {
    public static void main(String[] args) {
        int number;
        String mensagem;

        System.out.println("Cargos atuais: \n - 0001 programador estagiário - salário = 1.400 reais; \n - 0002 programador junior - salário = 3.000 reais; \n - 0003 programador pleno - salário = 5.500 reais; \n - 0004 programador senior - salário = 8.000 reais; \n - 0005 programador master - salário = 12.000 reais;");
        System.out.println();
        System.out.println("Digite o número do seu cargo para saber o quanto de aumento salarial teve: ");

        Scanner cargo = new Scanner(System.in);
        number = cargo.nextInt();

        switch (number){
            case 0001: mensagem = "O seu cargo atual é: 0001 programador estagiário - salário = 1.400 reais com o reajuste de 10% o salário atual é: R$ 1.540";
            break;
            case 0002: mensagem = "O seu cargo atual é: 0002 programador júnior - salário = 3.000 reais com o reajuste de 12% o salário atual é: R$ 3.360";
                break;
            case 0003: mensagem = "O seu cargo atual é: 0003 programador pleno - salário = 5.500 reais com o reajuste de 13% o salário atual é: R$ 6.215";
                break;
            case 0004: mensagem = "O seu cargo atual é: 0004 programador senior - salário = 8.000 reais com o reajuste de 15% o salário atual é: R$ 9.200";
                break;
            case 0005: mensagem = "O seu cargo atual é: 0005 programador master - salário = 12.000 reais com o reajuste de 18% o salário atual é: R$ 14.160";
                break;
            default: mensagem = "Digite um número de cargo válido";
        }
        System.out.println(mensagem);
    }
}
