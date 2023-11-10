public class Main {

    public static void main(String[] args) throws NotEnoughException {

        ////////////////////////////////
        // Primeira Máquina de Café

        CoffeeMachine coffeeMachine = new CoffeeMachine(1000,1000,1000);

        // Prepara um café de cada tipo

        Expresso expresso = new Expresso();
        coffeeMachine.makeCoffee(expresso);

        Latte latte = new Latte();
        coffeeMachine.makeCoffee(latte);

        Capuccino capuccino = new Capuccino();
        coffeeMachine.makeCoffee(capuccino);

        // Imprime o que sobrou na máquina de café
        System.out.println(coffeeMachine.getResources());

        ////////////////////////////////
        // Segunda Máquina de Café

        CoffeeMachine coffeeMachine2 = new CoffeeMachine(10,10,10);

        //Prepara dois lattes

        //Order
        int orderDone = 0;
        Latte latte1 = new Latte();
        Latte latte2 = new Latte();

        while(orderDone <2) {
            try {
                coffeeMachine2.makeCoffee(latte1);
                orderDone = 1;
                coffeeMachine2.makeCoffee(latte2);
                orderDone = 2;
            } catch (NotEnoughException n) {
                System.out.println(n.getMessage());
                System.out.println("RECURSOS DA MÁQUINA:::\n" + coffeeMachine2.getResources());
                coffeeMachine2.setResources(1000, 1000, 1000);
                System.out.println("ADICIONANDO RECURSOS NA MÁQUINA:::\n" + coffeeMachine2.getResources());
            }
        }

    }
}
