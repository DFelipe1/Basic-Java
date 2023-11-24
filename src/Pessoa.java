public class Pessoa extends Ser {

    String sobrenome;

    public Pessoa(String name, int idade, String sobrenome){
        super(name, idade);
        this.sobrenome = sobrenome;
    }

    void criaMain() {
        Main meuMain = new Main();
        System.out.println(meuMain.name);
        System.out.println(meuMain.salary);
        this.idade = 22;
    }

    @Override
    public String saudacao(){
        return "Olá meu nome é " + this.name;
    } //modifica um metodo au seu proprio uso, polimorfismo
}
