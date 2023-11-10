public class Tarefa<T> {
    private String descricaoTarefa;
    private T responsavelTarefa;

    public Tarefa (String descricaoTarefa, T responsavelTarefa){
        this.descricaoTarefa = descricaoTarefa;
        this.responsavelTarefa = responsavelTarefa;
    }

    public T getResponsavelTarefa() {
        return this.responsavelTarefa;
    }

    public String getDescricaoTarefa(){
        return this.descricaoTarefa;
    }

    public static void main(String[] args){
        Tarefa<String> tarefa = new Tarefa<>("Um dia", "Yasmin");
        System.out.println(tarefa.getDescricaoTarefa());
        System.out.println(tarefa.getResponsavelTarefa());
    }
}
