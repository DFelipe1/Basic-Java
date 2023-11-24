import java.util.ArrayList;

public class Main {

    public String name;

    static String footer = "aprendendo java"; //variavel estatica

    protected int salary; // variavel protegida nem todos tem acesso a ela

    public static void main(String[] args) {
        Ser meuDog = new Cachorro("Spike", 10, "Felipe"); // instancia uma variavel da classe Cahorro
        Ser Eu = new Pessoa("Felipe", 22, "Silva");

        System.out.println(Eu.saudacao() + " e este é meu cachorro, " + meuDog.name);
        System.out.println(meuDog.saudacao());

        System.out.println("-----------");

        meuDog.setName("jake");
        meuDog.setIdade(3);

        System.out.println("Tambem tenho outro cachorro, o " + meuDog.name + " ele tem " + meuDog.idade + " de idade");
        System.out.println(meuDog.saudacao());

        System.out.println(
                "Desenvolvido por " + Eu.name + ", que está " + footer
        );

    }

    private void atualizaSalario(int salario){ // uma classe ou metodo private, faz q so a classe onde ela está seja vista ou usada
        this.salary = salario;
    }
}