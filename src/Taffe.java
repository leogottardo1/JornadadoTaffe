public class Taffe {

    public int numeracao;
    public String versao;

    public int posicaoAtual = 0;

    public String dizerOi(){
        return "Oi pessoal";
    }
    public void falar (String oqueFalar){
        System.out.println(oqueFalar);
    }

   public void  andar(int quantidadepassos, boolean paraFrente){
        for(int i = 0; i <= quantidadepassos; i++){
            System.out.println("passo: " + i);
        }
        if(paraFrente == true) {
            posicaoAtual += quantidadepassos;
        }else {
            posicaoAtual -= quantidadepassos;
        }


    }

    public void  retornarPosicao(){
        System.out.println("Minha posição é: " + posicaoAtual);
    }





    //andar
    // falar
    // dizer oi
    //mandar mensagem bravo
    //limpar casa
    //cantar musica
    //mudar idioma




}
