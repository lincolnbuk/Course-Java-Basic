import java.lang.annotation.Target;
import java.nio.charset.Charset;

public class TestCar {

    public static void main(String[] args) {

        Car van = new Car();

        System.out.println("A marca do carro é: ");
        van.setMarca("Fiat");

        System.out.println(van.getMarca());

        System.out.println("O ano do carro é: ");
        van.setAno(2025);

        System.out.println(van.getAno());
    }
}
