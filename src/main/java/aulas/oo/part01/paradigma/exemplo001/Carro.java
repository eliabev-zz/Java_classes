package aulas.oo.part01.paradigma.exemplo001;

public class Carro {
    private String modelo = "Etios";
    public String getModelo() {return modelo;}
    public Integer capacidade = 5;
    public String verCapacidade() {return "Você pode colocar " +capacidade+" pessoas.";}
    public String acelerar() { return "VRUMMMM";}
        }