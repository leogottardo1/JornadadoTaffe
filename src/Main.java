public class Main {
    public static void main(String[] args) {
        Taffe taffe = new Taffe();
        String fala = taffe.dizerOi();
        System.out.println(fala);

        taffe.falar("Gremio melhor que inter");
        taffe.falar("Aprendendo classes em java");

        taffe.andar(10, true);
        taffe.andar(50, false);
        taffe.retornarPosicao();

        Taffe patrick = new Taffe();
        patrick.andar(20, true);
        patrick.retornarPosicao();



    }
}