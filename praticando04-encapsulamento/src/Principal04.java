public class Principal04 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.setNome("Felipe");

        aluno1.setNota1(10);
        aluno1.setNota2(5);
        aluno1.setNota3(7);

        System.out.println("O nome do aluno é: " + aluno1.getNome());

        System.out.println("As notas são: " + aluno1.getNota1() + "," + aluno1.getNota2() + " e " + aluno1.getNota3());

        aluno1.calcularMedia();
        System.out.println("A média dessas notas são: " + aluno1.calcularMedia() );



    }
}
