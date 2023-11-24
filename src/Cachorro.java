public class Cachorro extends Ser {
    String nomeDoDono;

    public Cachorro(String name, int idade, String nomeDoDono){ //cria um constructor
        super(name, idade); // seta o construtor da sua super classe q no caso é Ser
        this.nomeDoDono = nomeDoDono;
    }

    @Override
    public String saudacao(){
        return "au au!";
    } //modifica um metodo au seu proprio uso, polimorfismo
}
