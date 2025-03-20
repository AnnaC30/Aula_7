package Aula_7.Atividade_2;

public class Empregado {
    private int matricula;
    private String nome;
    private double salario;

    public Empregado(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Erro: O salário não pode ser negativo.");
        }
    }

    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            this.salario += this.salario * (percentual / 100);
        } else {
            System.out.println("Erro: O percentual de aumento deve ser positivo.");
        }
    }

    @Override
    public String toString() {
        return "Empregado [Matrícula: " + matricula + ", Nome: " + nome + ", Salário: " + salario + "]";
    }
}
