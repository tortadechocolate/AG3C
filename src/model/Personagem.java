package model;

import enums.Elemento;
import enums.Raridade;

/*
 * CLASSE ABSTRATA
 * Serve como base para todos os personagens do jogo.
 * Define atributos comuns e comportamentos compartilhados.
 */
// CLASSE ABSTRATA
public abstract class Personagem {

    // Atributos privados obrigatórios
    private String nome;
    private int vida;
    private int nivel;

    // Uso dos ENUMS na superclasse
    private Elemento elemento;
    private Raridade raridade;

    /*
     * Construtor da classe abstrata.
     */
    public Personagem(String nome, int vida, int nivel,
                      Elemento elemento, Raridade raridade) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
        this.elemento = elemento;
        this.raridade = raridade;
    }

    /*
     * Método abstrato.
     * Cada subclasse deve implementar sua própria forma de ataque.
     */
    public abstract void atacar();

    /*
     * Método concreto.
     * Exibe as informações básicas do personagem.
     */
    public void exibirFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Nivel: " + nivel);
        System.out.println("Elemento: " + elemento);
        System.out.println("Raridade: " + raridade);
    }

    /*
     * Método concreto.
     * Exibe uma mensagem de descanso.
     */
    public void descansar() {
        System.out.println(nome + " esta descansando.");
    }

    // Getters

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public Raridade getRaridade() {
        return raridade;
    }

    // Setter apenas onde faz sentido

    public void setVida(int vida) {
        this.vida = vida;
    }
}