public class Pesquisa {

    private int contarCompara;

    public int getContarCompara(){
        return contarCompara;
    }

    public int buscaBinaria(String [] pessoas, String nome){

        int esquerda =0;
        int direita = pessoas.length-1;
        contarCompara = 0;

        while(esquerda<=direita){
            int meio = esquerda+(direita-1)/2;

            int res= nome.compareTo(pessoas[meio]);

            if(res==0)
                return meio;
            
            if (res>0)
                esquerda=meio+1;

            else
                direita=meio-1;
        }
    return -1;

    }
    
}
