package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Register {
    /** Instancia Scanner */
    Scanner teclado = new Scanner(System.in);

    /** Instancia Player */
    Player player = new Player();

    /** Instancia Player */
    Enemy enemy = new Enemy();
    public void BothRegister(){
        PlayerRegister();
        EnemyRegister();
    }
    public void PlayerRegister(){

        /** coleta dados do Player-1 */
        System.out.println("-------------- Cadastro Player --------------");
        System.out.println("Nome de usuário: ");
        player.nome = teclado.nextLine();
        System.out.println("Escolha sua skin (Red - Blue - Purple): ");
        player.skin = teclado.nextLine();
        System.out.println("-------------- Cadastrado com Sucesso --------------");
    }
    public void EnemyRegister(){

        /** coleta dados do Enemy-1 */
        System.out.println("-------------- Cadastro Enemy --------------");
        System.out.println("Nome de usuário: ");
        enemy.nome = teclado.nextLine();
        System.out.println("Escolha sua skin (Red - Blue - Purple): ");
        enemy.skin = teclado.nextLine();
        System.out.println("-------------- Enemy Cadastrado com Sucesso --------------");
    }
    public void RegisterDescision(){

        String descision;
        System.out.println("Seja Bem Vindo!!! ");
        System.out.println("Deseja Cadastrar [Player - Enemy - Ambos: ");
        descision = teclado.nextLine();

        switch(descision){
            case "Player":
                PlayerRegister();
                break;

            case "Enemy":
                EnemyRegister();
                break;

            case "Ambos":
                BothRegister();
                break;
        }
    }
}
