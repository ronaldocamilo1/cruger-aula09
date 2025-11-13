public class Professor extends Pessoa implements Remuneravel{

    @Override
    public void quemSouEu() {
        System.out.println("Sou um Professor");
    }

    @Override
    protected void minhaAtividade() {
        System.out.println("Ministrar aulas");
    }

    @Override
    public String toString() {
        return "Professor: " + nome + " | Idade: " + idade;
    }

    @Override
    public void calcularSalario() {

    }

    @Override
    public void aplicarBonus() {

    }
}
