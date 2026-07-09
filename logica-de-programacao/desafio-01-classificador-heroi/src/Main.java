import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criando o Scanner para ler o que você digita no teclado
        Scanner teclado = new Scanner(System.in);

        System.out.print(" ☠️ Digite o nome de um Chapéu de Palha para consultar: ");
        String nomeDigitado = teclado.nextLine().trim();

        //Variáveis que vão armazenar os dados do personagem escolhido
        String nomeHeroi = "";
        long xp = 0; // Alterado para long para aceitar os bilhões

        //Estrutura para buscar o personagem e atribuir sua recompensa real como XP
        //Usamos .equalsIgnoreCase para aceitar letras maiúsculas ou minúsculas
        if (nomeDigitado.equalsIgnoreCase("Luffy")) {
            nomeHeroi = "Monkey D. Luffy";
            xp = 3000000000L;
        } else if (nomeDigitado.equalsIgnoreCase("Zoro")) {
            nomeHeroi = "Roronoa Zoro";
            xp = 1111000000L;
        } else if (nomeDigitado.equalsIgnoreCase("Jinbe")) {
            nomeHeroi = "Jinbe";
            xp = 1100000000L;
        } else if (nomeDigitado.equalsIgnoreCase("Sanji")) {
            nomeHeroi = "Vinsmoke Sanji";
            xp = 1032000000L;
        } else if (nomeDigitado.equalsIgnoreCase("Robin")) {
            nomeHeroi = "Nico Robin";
            xp = 930000000L;
        } else if (nomeDigitado.equalsIgnoreCase("Usopp")) {
            nomeHeroi = "God Usopp";
            xp = 500000000L;
        } else if (nomeDigitado.equalsIgnoreCase("Franky")) {
            nomeHeroi = "Franky";
            xp = 394000000L;
        } else if (nomeDigitado.equalsIgnoreCase("Brook")) {
            nomeHeroi = "Brook";
            xp = 383000000L;
        } else if (nomeDigitado.equalsIgnoreCase("Nami")) {
            nomeHeroi = "Nami";
            xp = 366000000L;
        } else if (nomeDigitado.equalsIgnoreCase("Chopper")) {
            nomeHeroi = "Tony Tony Chopper";
            xp = 1000L;
        } else {
            System.out.println("❌ Esse pirata não navega no Sunny!");
            teclado.close();
            return; //Encerra o programa se digitar nome do personagem errado
        }

        //Estrutura de decisão baseada no XP de cada faixa (Apenas valida os intervalos numéricos)
        if (xp <= 1000) {
            // Faixa do Chopper
        } else if (xp > 1000 && xp <= 370000000L) {
            // Faixa da Nami
        } else if (xp > 370000000L && xp <= 390000000L) {
            // Faixa do Brook
        } else if (xp > 390000000L && xp <= 400000000L) {
            // Faixa do Franky
        } else if (xp > 400000000L && xp <= 600000000L) {
            // Faixa do Usopp
        } else if (xp > 600000000L && xp <= 950000000L) {
            // Faixa da Robin
        } else if (xp > 950000000L && xp <= 1050000000L) {
            // Faixa do Sanji
        } else if (xp > 1050000000L && xp <= 1105000000L) {
            // Faixa do Jinbe
        } else if (xp > 1105000000L && xp <= 2000000000L) {
            // Faixa do Zoro
        } else if (xp > 2000000000L) {
            // Faixa do Luffy
        }

        //Formatação do XP em moedas
        NumberFormat formatoMoeda = NumberFormat.getInstance(new Locale("pt", "BR"));
        String xpFormatado = formatoMoeda.format(xp);

        //Saída
        System.out.println("\n=============================================");
        System.out.println("         ☠️ BANDO DO CHAPÉU DE PALHA ☠️ ");
        System.out.println("       W A N T E D  /  P R O C U R A D O     ");
        System.out.println("=============================================");
        System.out.println(" PIRATA: " + nomeHeroi);
        System.out.println(" RECOMPENSA ATUAL: ฿ " + xpFormatado);
        System.out.println(" CONDIÇÃO: DEAD OR ALIVE");
        System.out.println("=============================================");

        teclado.close();
    }
}
