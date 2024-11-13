package comandocondicionais;
import java.util.*;

public class Switch2 {

    public static void main(String[] args) {
        int number;
        String mensagem;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para saber o mês: ");
        number = entrada.nextInt();

        switch (number){
            case 1: mensagem = "O mês selecionado foi Janeiro";
            break;
            case 2: mensagem = "O mês selecionado foi Fevereiro";
                break;
            case 3: mensagem = "O mês selecionado foi Março";
                break;
            case 4: mensagem = "O mês selecionado foi Abril";
                break;
            case 5: mensagem = "O mês selecionado foi Maio";
                break;
            case 6: mensagem = "O mês selecionado foi Junho";
                break;
            case 7: mensagem = "O mês selecionado foi Julho";
                break;
            case 8: mensagem = "O mês selecionado foi Agosto";
                break;
            case 9: mensagem = "O mês selecionado foi Setembro";
                break;
            case 10: mensagem = "O mês selecionado foi Outubro";
                break;
            case 11: mensagem = "O mês selecionado foi Novembro";
                break;
            case 12: mensagem = "O mês selecionado foi Dezembro";
                break;
            default: mensagem = "Digite um número válido";
        }
        System.out.println(mensagem);
    }
}
