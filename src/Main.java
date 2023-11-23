import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.print("Hello and welcome!");

        //Syntax basica

        // primetives types

        //numbers interge
        byte idade = 22; // esse tipo tem o espaço de 8 bits
        short num2 = 22; // esse tipo tem o espaço de 16 bits
        int num3 = 22; // esse tipo tem o espaço de 32 bits
        long num4 = 22; // esse tipo tem o espaço de 64 bits

        //booleanos
        boolean isBrazil = true;

        //caracteres
        char letra = 'a'; //esse tipo so aceita um unico caractere e so pode ser intanciado com aspas simples
        String name = "Felipe"; //String é o recomendado para usar em frases, porém ele nçao é considerado um tipo primitivo no java e sim uma classe

        //Numbers decimals
        double peso = 78.804512; //esse tipo define com mais precisão o valor contendo mais numeros após a virgula
        float altura = 1.80F; //ja o float ele tem uma precisão menor, por não ter tantos numeros apos a virgula e sua declaração deve haver um F ao final para identificar que é um float


        //Condicionais
        if(idade < 18){
            System.out.println("Menor de idade");
        } else if (idade == 22) {
            System.out.println("Você tem a mesma idade do q a minha");
        } else {
            System.out.println("Maior de idade");
        }

        //Vetores
        // o array precisa ser inicializado antes de usar
        int[] vector1 = {1,2,3}; // assim inicializamos, porém setamos um valor padrão para ele, e setamos o length(tamanho) e isso não pode ser alterado
        int[] vector2 = new int[10]; // dessa forma setamos o tamanho mas n passamos valores para o array

        //Arraylist
        ArrayList<Integer> array = new ArrayList<Integer>(); //essa declaração não limita o tamanho do array
        array.add(22);
        array.add(24);
        array.add(25);
        array.remove(1);
        array.get(0);
        array.size();

        //Loops
        for(var i = 0; i < idade; i++){
            System.out.println("oi");
        }

        int j = 0;
        while(j < idade){
            System.out.println(j);
        }

        //Casting
        int idade1 = 10;
        double idade2 = idade1;

        idade1 = (int) idade2;

        char letra2 = 'a';
        String nome5 = String.valueOf(letra2);

        letra2 = nome5.charAt(0);

    }
}