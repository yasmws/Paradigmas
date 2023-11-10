public class Expresso extends Coffee{

    public Expresso (){
        super(50,0,150,"Expresso");
    }

    @Override
    public void prepare(){
        System.out.println("-----Preparando um "+super.name+" -----");
        System.out.println("Primeiro, coloque " + super.coffeeRequired + "ml de café");
        System.out.println("Em seguida, adicione "+ super.waterRequired +"ml de água quente");
        System.out.println("Por último, mexa e adicione quanto acucar desejar");
        System.out.println("Não é preciso adicionar leite, ou seja, adicionamos "+ super.milkRequired + " ml de leite");
    }

    public static void main (String[] args){
        Expresso expresso = new Expresso();
        expresso.prepare();
    }

}
