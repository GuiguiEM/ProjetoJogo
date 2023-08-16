package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Register {

    int validaPrint = 0;
    /**
     * Instancia Scanner
     */
    Scanner teclado = new Scanner(System.in);

    /**
     * Instancia Player
     */
    Player player = new Player();

    /**
     * Instancia Player
     */
    Enemy enemy = new Enemy();

    /**
     * Instancia Output
     */
    Output output = new Output();

    public void BothRegister() {
        validaPrint = 1;
        PlayerRegister();
        EnemyRegister();
        output.PrintPlayer(player);
        output.PrintEnemy(enemy);

    }

    public void PlayerRegister() {

        /** coleta dados do Player-1 */
        System.out.println("-------------- Cadastro Player --------------");
        System.out.println("Nome de usuário: ");
        player.nome = teclado.nextLine();
        System.out.println("Escolha sua skin (Red - Blue - Purple): ");
        player.skin = teclado.nextLine();
        System.out.println("-------------- Cadastrado com Sucesso --------------");

        if (validaPrint != 1) {
            /** Printa as informações Cadastradas */
            output.PrintPlayer(player);
        }
        System.out.println("Deseja cadastrar outro Player? (S/N)");
    }

    public void EnemyRegister() {

        /** coleta dados do Enemy-1 */
        System.out.println("-------------- Cadastro Enemy --------------");
        System.out.println("Nome de usuário: ");
        enemy.nome = teclado.nextLine();
        System.out.println("Escolha sua skin (Red - Blue - Purple): ");
        enemy.skin = teclado.nextLine();
        System.out.println("-------------- Enemy Cadastrado com Sucesso --------------");

        if (validaPrint != 1) {
            /** Printa as informações Cadastradas */
            output.PrintEnemy(enemy);
        }

    }

    public void RegisterDescision() {

        String descision;
        System.out.println("Seja Bem Vindo!!! ");
        System.out.println("Deseja Cadastrar [Player - Enemy - Ambos: ");
        descision = teclado.nextLine();

        switch (descision.toUpperCase()) {
            case "Player":
                PlayerRegister();

            case "Enemy":
                EnemyRegister();

            case "Ambos":
                BothRegister();

        }
        System.out.println("Deseja retornafr ao cadastro [1 - Sim 2 - Não: ");
        int continuar = teclado.nextInt();

        if (continuar == 1) {
            RegisterDescision();
        }
    }
}
