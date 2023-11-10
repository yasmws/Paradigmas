import java.util.ArrayList;
import java.util.List;

public class Main {

    public static <T> double calcularCargaDeTrabalho(List<Tarefa<T>> tarefas, T membro) {
        int carga = 0;
        for (Tarefa<T> tarefa : tarefas) {
            if (tarefa.getResponsavelTarefa().equals(membro)) {
                carga++;
            }
        }
        return carga;
    }

    public static void main(String[] args){

        ///// Teste 0 

        MembroEquipe membro1 = new MembroEquipe("Yas");
        MembroEquipe membro2 = new MembroEquipe("Min");

        LiderEquipe lider1 = new LiderEquipe("Lucinda");

        Tarefa<MembroEquipe> tarefa1 = new Tarefa<>("Desenvolvimento de codigo", membro1);
        Tarefa<MembroEquipe> tarefa2 = new Tarefa<>("Correção de bugs", membro2);
        Tarefa<LiderEquipe> tarefa3 = new Tarefa<>("Revisao de código", lider1);

        List<Tarefa<MembroEquipe>> tarefas = new ArrayList<>();
        tarefas.add(tarefa1);
        tarefas.add(tarefa2);

        double cargaYas = calcularCargaDeTrabalho(tarefas, membro1);
        double cargaMin = calcularCargaDeTrabalho(tarefas, membro2);

        System.out.println("Carga de trabalho de Yas: " + cargaYas + " tarefa(s).");
        System.out.println("Carga de trabalho de Min: " + cargaMin + " tarefa(s).");

        ///// Teste 1

        MembroEquipe membro3 = new MembroEquipe("Pichu");
        MembroEquipe membro4 = new MembroEquipe("Pikachu");
        LiderEquipe lider2 = new LiderEquipe("Raichu");

        MembroEquipe membro5 = new MembroEquipe("Vaporeon");
        MembroEquipe membro6 = new MembroEquipe("Glaceon");
        MembroEquipe membro7 = new MembroEquipe("Espeon");
        MembroEquipe membro8 = new MembroEquipe("Jolteon");
        MembroEquipe membro9 = new MembroEquipe("Flareon");
        MembroEquipe membro10 = new MembroEquipe("Umbreon");
        MembroEquipe membro11 = new MembroEquipe("Leafeon");
        MembroEquipe membro12 = new MembroEquipe("Sylveon");
        LiderEquipe lider3 = new LiderEquipe("Eevee");

        Tarefa<MembroEquipe> tarefa4 = new Tarefa<>("Desenvolvimento de codigo", membro3);
        Tarefa<MembroEquipe> tarefa5 = new Tarefa<>("Correção de bugs", membro4);
        Tarefa<MembroEquipe> tarefa6 = new Tarefa<>("Desenvolvimento de codigo", membro5);
        Tarefa<MembroEquipe> tarefa7 = new Tarefa<>("Correção de bugs", membro3);
        Tarefa<LiderEquipe> tarefa8 = new Tarefa<>("Revisao de código", lider2);
        Tarefa<MembroEquipe> tarefa9 = new Tarefa<>("Desenvolvimento de codigo", membro5);
        Tarefa<MembroEquipe> tarefa10 = new Tarefa<>("Correção de bugs", membro12);
        Tarefa<MembroEquipe> tarefa11 = new Tarefa<>("Desenvolvimento de codigo", membro5);
        Tarefa<MembroEquipe> tarefa12 = new Tarefa<>("Correção de bugs", membro3);
        Tarefa<LiderEquipe> tarefa13 = new Tarefa<>("Revisao de código", lider3);
        Tarefa<MembroEquipe> tarefa14 = new Tarefa<>("Correção de bugs", membro11);
        Tarefa<LiderEquipe> tarefa15 = new Tarefa<>("Revisao de código", lider2);
        Tarefa<MembroEquipe> tarefa16 = new Tarefa<>("Correção de bugs", membro10);
        Tarefa<LiderEquipe> tarefa17 = new Tarefa<>("Revisao de código", lider2);
        Tarefa<MembroEquipe> tarefa18 = new Tarefa<>("Correção de bugs", membro12);
        Tarefa<LiderEquipe> tarefa19 = new Tarefa<>("Revisao de código", lider3);
        Tarefa<MembroEquipe> tarefa20 = new Tarefa<>("Correção de bugs", membro8);
        Tarefa<MembroEquipe> tarefa21 = new Tarefa<>("Correção de bugs", membro9);
        Tarefa<MembroEquipe> tarefa22 = new Tarefa<>("Correção de bugs", membro7);
        Tarefa<MembroEquipe> tarefa23 = new Tarefa<>("Correção de bugs", membro6);
        Tarefa<MembroEquipe> tarefa24 = new Tarefa<>("Correção de bugs", membro8);
        Tarefa<MembroEquipe> tarefa25 = new Tarefa<>("Correção de bugs", membro9);

        List<Tarefa<MembroEquipe>> tarefasPokemon = new ArrayList<>();
        List<Tarefa<LiderEquipe>> tarefasLiderPokemon = new ArrayList<>();
        tarefasPokemon.add(tarefa4);
        tarefasPokemon.add(tarefa5);
        tarefasPokemon.add(tarefa6);
        tarefasPokemon.add(tarefa9);
        tarefasPokemon.add(tarefa10);
        tarefasPokemon.add(tarefa11);
        tarefasPokemon.add(tarefa12);
        tarefasPokemon.add(tarefa14);
        tarefasPokemon.add(tarefa16);
        tarefasPokemon.add(tarefa18);
        tarefasPokemon.add(tarefa20);
        tarefasPokemon.add(tarefa21);
        tarefasPokemon.add(tarefa22);
        tarefasPokemon.add(tarefa23);
        tarefasPokemon.add(tarefa24);
        tarefasPokemon.add(tarefa25);
        tarefasLiderPokemon.add(tarefa8);
        tarefasLiderPokemon.add(tarefa13);
        tarefasLiderPokemon.add(tarefa15);
        tarefasLiderPokemon.add(tarefa17);
        tarefasLiderPokemon.add(tarefa19);

        double cargaSylveon = calcularCargaDeTrabalho(tarefasPokemon, membro12);
        double cargaFlareon = calcularCargaDeTrabalho(tarefasPokemon, membro9);
        double cargaRaichu = calcularCargaDeTrabalho(tarefasLiderPokemon, lider2);
        double cargaEevee = calcularCargaDeTrabalho(tarefasLiderPokemon, lider3);

        System.out.println("Carga de trabalho de Sylveon: " + cargaSylveon + " tarefa(s).");
        System.out.println("Carga de trabalho de Flareon: " + cargaFlareon + " tarefa(s).");
        System.out.println("Carga de trabalho de Eevee: " + cargaEevee + " tarefa(s).");
        System.out.println("Carga de trabalho de Raichu: " + cargaRaichu + " tarefa(s).");
    }
}
