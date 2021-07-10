package aulas.oo.part03.heranca.exercicio;

public class Teste {

    public static void main(String[] args) {

        Gerente jose = new Gerente();
        jose.setSalario(10000);
        System.out.println(jose.calculaImposto());

        Supervisor andressa = new Supervisor();
        andressa.setSalario(5000);
        System.out.println(andressa.calculaImposto());

        Atendente vitor = new Atendente();
        vitor.setSalario(2500);
        System.out.println(vitor.calculaImposto());
    }
}