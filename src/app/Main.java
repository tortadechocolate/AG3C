package app;

import enums.Elemento;
import enums.Raridade;
import model.Mago;

/*
 * Classe principal responsável pelos testes do sistema.
 * Demonstra herança, sobrescrita, sobrecarga,
 * classe abstrata e enums.
 */
public class Main {

    public static void main(String[] args) {

        // Criação do primeiro objeto
        Mago mago1 = new Mago(
                "Merlin",
                100,
                10,
                Elemento.FOGO,
                Raridade.RARO,
                200,
                15
        );

        // Criação do segundo objeto
        Mago mago2 = new Mago(
                "Gandalf",
                120,
                15,
                Elemento.GELO,
                Raridade.LENDARIO,
                300,
                25
        );

        System.out.println("===== MAGO 1 =====");
        mago1.exibirFicha();
        mago1.atacar();
        mago1.atacar("Dragao");
        mago1.descansar();

        System.out.println("\n===== MAGO 2 =====");
        mago2.exibirFicha();
        mago2.atacar();
        mago2.atacar("Orc");
        mago2.descansar();

        System.out.println("\n===== COMPARACAO =====");

        /*
         * Comparação utilizando getters.
         * Verifica qual personagem possui mais mana.
         */
        if (mago1.getMana() > mago2.getMana()) {
            System.out.println(
                    mago1.getNome() + " possui mais mana."
            );
        } else if (mago2.getMana() > mago1.getMana()) {
            System.out.println(
                    mago2.getNome() + " possui mais mana."
            );
        } else {
            System.out.println(
                    "Os dois possuem a mesma quantidade de mana."
            );
        }
    }
}