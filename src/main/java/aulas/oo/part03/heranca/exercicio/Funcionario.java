package aulas.oo.part03.heranca.exercicio;

public class Funcionario {
    private String nome;
    private Integer salario;

    public String getNome() { return this.nome;}
    public void setNome(String nome) { this.nome = nome;}

    public Integer getSalario() { return this.salario;}
    public void setSalario(Integer salario) { this.salario = salario;}

    public double calculaImposto() { return getSalario() * 0.001;}

        }