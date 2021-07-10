package aulas.oo.part02.construtores.exemplo003;

public class Carro {
    public Carro(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano; }
    private String marca;
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca;}

    private String modelo;
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    private Integer ano;
    public Integer getAno() { return ano;}
    public void setAno(Integer ano) { this.ano = ano;}

    private String variante = "qualquer";
    public String getVariante() { return variante;}
    public void setVariante(String variante) { this.variante = variante;}

}