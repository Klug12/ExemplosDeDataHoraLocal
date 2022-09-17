import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        //Olá, {nome}. Hoje é (dia-da-semana), BOM DIA.

        /*.toUpperCase  --> coloca em caixa alta.
        ou .toLowerCase  --> coloca em caixa baixa.
        Ex.:
            String nome = "João";

            System.out.println(nome.toUpperCase);
         */

        //System.out.println(nome.lenght());  --> tamanho da String nome
        //System.out.println(nome.equals());  --> Compara se os nomes são exatamente equivalentes
        //System.out.println(nome.equalsIgnoreCase());  --> Compara se os nomes são  equivalentes

        String nome = "Rodrigo Klug";
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt" , "BR");
        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite";
        } else {
            saudacao = "Olá";
        }
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }
}
