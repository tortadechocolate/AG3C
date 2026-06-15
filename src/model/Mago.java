package model;

import enums.Elemento;
import enums.Raridade;

/*
 * Classe que representa um Mago.
 * Herda características da classe Personagem
 * e adiciona atributos específicos relacionados à magia.
 */
// HERANCA
public class Mago extends Personagem {

    // Atributos próprios da subclasse
    private int mana;
    private int qtdMagias;

    /*
     * Construtor da subclasse.
     * Chama o construtor da superclasse através de super().
     */
    public Mago(String nome, int vida, int nivel,
                Elemento elemento, Raridade raridade,
                int mana, int qtdMagias) {

        super(nome, vida, nivel, elemento, raridade);

        this.mana = mana;
        this.qtdMagias = qtdMagias;
    }

    /*
     * Implementação obrigatória do método abstrato.
     */
    // OVERRIDE
    @Override
    public void atacar() {

        double dano =
                getNivel() * 10 *
                getRaridade().getMultiplicador();

        System.out.println(
                getNome() + " lançou uma magia causando "
                        + dano + " de dano.");
    }

    /*
     * Sobrescrita do método concreto da superclasse.
     * Primeiro exibe os dados herdados e depois os próprios.
     */
    // OVERRIDE
    @Override
    public void exibirFicha() {

        super.exibirFicha();

        System.out.println("Mana: " + mana);
        System.out.println("Quantidade de Magias: " + qtdMagias);
    }

    /*
     * Método sobrecarregado.
     * Permite atacar um alvo específico.
     */
    // OVERLOAD
    public void atacar(String alvo) {
        System.out.println(
                getNome() + " lançou uma magia contra " + alvo + ".");
    }

    // Getters

    public int getMana() {
        return mana;
    }

    public int getQtdMagias() {
        return qtdMagias;
    }
}