package aulas.oo.part02.construtores.exemplo003;

public class ExCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("Honda", "Civic", 2018);

        System.out.println(carro.getVariante());
        System.out.println(carro.getModelo());

    }
}