public class SomaMultipl {
    public static void main(String[] args){
        int somaInpar=0, num=0, multiPar = 2; //No contexto não vou considerar 0 como um número par, porque é um número especial que não possui uma paridade definida e quero que o resultado seja diferente de 0. Portanto, começamos com 2 como o primeiro número par.

        for(int i=0;i<=30;i++){
            if(i%2!=0){ 
                num = i;
                somaInpar += num;
            }
            if(i%2==0 && i>0){
                num = i;
                multiPar = multiPar*num;
            }
        }
        System.out.println(somaInpar);
        System.out.println(multiPar);
    }
}
