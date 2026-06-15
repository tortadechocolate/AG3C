package enums;

/*
 * ENUM COMPLETO
 * Representa o nível de raridade de um personagem.
 * Cada raridade possui um multiplicador de dano.
 */
// ENUM
public enum Raridade {

    COMUM(1, 1.0),
    RARO(2, 1.5),
    LENDARIO(3, 2.0);

    // Atributos de cada constante
    private final int nivel;
    private final double multiplicadorDano;

    /*
     * Construtor do enum.
     */
    Raridade(int nivel, double multiplicadorDano) {
        this.nivel = nivel;
        this.multiplicadorDano = multiplicadorDano;
    }

    /*
     * Retorna o nível da raridade.
     */
    public int getNivel() {
        return nivel;
    }

    /*
     * Retorna o multiplicador de dano.
     */
    public double getMultiplicador() {
        return multiplicadorDano;
    }
}