package aulas.oo.part01.paradigma.exemplo001;

public class exCarro {

    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.getModelo());
        System.out.println(carro.verCapacidade());
        System.out.println(carro.acelerar());
    }
}