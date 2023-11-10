public class Latte extends Coffee{
    public Latte (){
        super(25,125,50,"Latte");
    }

    @Override
    public void prepare(){
        System.out.println("-----Preparando um "+super.name+" -----");
        System.out.println("Primeiro, coloque " + super.coffeeRequired + "ml de café");
        System.out.println("Em seguida, adicione "+ super.waterRequired +"ml de água quente");
        System.out.println("Adicione, então, "+ super.milkRequired + " ml de leite quente");
        System.out.println("Por último, mexa e adicione quanto acucar desejar");

    }

    public static void main (String[] args){
        Latte latte = new Latte();
        latte.prepare();
    }


}

