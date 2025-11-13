import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pessoa a = new Aluno();
        Professor p = new Professor();


        System.out.println("Escolha o tipo de cadastro:");
        System.out.println("1 - Professor");
        System.out.println("2 - Coordenador");
        System.out.println("3 - Aluno");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        Pessoa p = null; // polimorfismo

        switch (opcao) {
            case 1:
                p = new Professor();
                break;
            case 2:
                p = new Cordenador();
                break;
            case 3:
                a = new Aluno();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.print("Digite o nome: ");
        p.setNome(scanner.nextLine());

        System.out.print("Digite a idade: ");
        p.setIdade(scanner.nextInt());

        System.out.println("\n=== RESULTADO ===");
        p.quemSouEu();
        p.minhaAtividade();
        System.out.println(p);

        // Se for remunerável, executa métodos de remuneração
        if (p instanceof Remuneravel) {
            Remuneravel r = (Remuneravel) p;
            r.calcularSalario();
            r.aplicarBonus();
        } else {
            System.out.println("Alunos não recebem salário.");
        }

        scanner.close();
    }
}
