public class Capuccino extends Coffee{

    public Capuccino (){
        super(30,85,85,"Capuccino");
    }

    @Override
    public void prepare(){
        System.out.println("-----Preparando um "+super.name+" -----");
        System.out.println("Primeiro, coloque " + super.coffeeRequired + "ml de café");
        System.out.println("Em seguida, adicione "+ super.waterRequired +"ml de água quente");
        System.out.println("Adicione, então, "+ super.milkRequired + " ml de leite quente");
        System.out.println("Por último, mexa e adicione quanto acucar e canela desejar");

    }

    public static void main (String[] args){
        Capuccino capuccino = new Capuccino();
        capuccino.prepare();
    }


}

