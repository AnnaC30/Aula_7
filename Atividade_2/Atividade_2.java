package Aula_7.Atividade_2;

public class Atividade_2 {
    public static void main(String[] args) {
        Empregado empregado = new Empregado(123);

        empregado.setNome("João Silva");
        empregado.setSalario(3000.0);

        System.out.println(empregado.toString());

        empregado.aumentarSalario(10);
        System.out.println("Salário após aumento: " + empregado.getSalario());

        empregado.setSalario(-1000);

        empregado.aumentarSalario(-5);
    }
}
