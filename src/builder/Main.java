package builder;

/**
 *
 * @author Miguel Castro
 */
public class Main {

    public static void main(String[] args) {

        Carro c1, c2;
        CarroBuilder builder = new CarroBuilder();

        c1 = builder.definirMotor(new Motor("2.0"))
                .definirTransmissao(new Transmissao("manual"))
                .definirCor(new Cor("azul"))
                .build();

        c2 = builder.definirMotor(new Motor("1.0"))
                .definirTransmissao(new Transmissao("automatico"))
                .definirCor(new Cor("preto"))
                .build();

        System.out.println(c1);
        System.out.println(c2);
    }
}
