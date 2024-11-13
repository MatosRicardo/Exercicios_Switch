package comandocondicionais;
import java.util.Scanner;

public class Switch3 {

    public static void main(String[] args) {
        int combo;
        String mensagem;

        Scanner in = new Scanner(System.in);

        System.out.println("Selecione o seu combo: (1)Mc Lanche Feliz, (2)Big Mc \n (3)Quarteirão com queijo, (4)McChicken e (5)Chedar mcMelt.");

        System.out.println("Selecione um combo de 1 a 5: ");
        combo = in.nextInt();

        switch (combo) {
            case 1:
                mensagem = "Você selecionou o Mc Lanche Feliz: \n  Inclui: Hambúrguer, cheeseburguer ou nuggets, batata pequena, suco ou refrigerante, e uma sobremesa de fruta ou Danoninho. Acompanha um brinquedo exclusivo.";
                break;
            case 2:
                mensagem = "Você selecionou o Big Mc: \n  Inclui: Big Mac, batata média ou grande, e refrigerante ou suco.";
                break;
            case 3:
                mensagem = "Você selecionou o Quarteirão com Queijo : \n  Inclui: Inclui: Quarterão com Queijo, batata média ou grande, e refrigerante ou suco.";
                break;
            case 4:
                mensagem = "Você selecionou o McChicken: \n  Inclui: McChicken, batata média ou grande, e refrigerante ou suco.";
                break;
            case 5:
                mensagem = "Você selecionou o Cheddar McMelt: \n  Inclui: Cheddar McMelt, batata média ou grande, e refrigerante ou suco.";
                break;
            default: mensagem = "Digite um combo válido";
        }
        System.out.println(mensagem);
    }
}
