package builder;

/**
 *
 * @author Miguel Castro
 */
public class Carro {

    private Motor motor;
    private Transmissao trasmissao;
    private Cor cor;

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Transmissao getTrasmissao() {
        return trasmissao;
    }

    public void setTrasmissao(Transmissao trasmissao) {
        this.trasmissao = trasmissao;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carro{" + "motor=" + motor + ", trasmissao=" + trasmissao + ", cor=" + cor + '}';
    }

}
