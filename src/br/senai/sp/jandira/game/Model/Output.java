package br.senai.sp.jandira.game.Model;

public class Output {
    public String player;
    public String enemy;

    public void PrintPlayer(Player player) {
        /** Printar informações */

        System.out.println("");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("-------------------------Player------------------------");
        System.out.println("O nome do Player é: " + player.nome);
        System.out.println("A skin do seu player é: " + player.skin);
        System.out.println("A vida do seu player é: " + player.getLife());
        System.out.println("-------------------------Player------------------------");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("");

    }

    public void PrintEnemy(Enemy enemy) {
        /** Printar informações */

        System.out.println("");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("-------------------------Enemy------------------------");
        System.out.println("O nome do Enemy é: " + enemy.nome);
        System.out.println("A skin do seu Enemy é: " + enemy.skin);
        System.out.println("A vida do seu enemy é: " + enemy.getLife());
        System.out.println("-------------------------Enemy------------------------");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("");
    }
}
