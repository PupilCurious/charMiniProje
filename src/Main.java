public class Main {
    public static void main(String[] args) {
        char sesliHarf='Ö';
      /*  char[] kalinSesli={'A','I','O','U'};
        char[] inceSesli={'E','İ','Ö','Ü'};

        for(char karakter:kalinSesli){
            if(karakter==sesliHarf){
                System.out.println(karakter + " kalın sesli bir harftir.");
            }
        }
        for(char karakter:inceSesli){
            if(karakter==sesliHarf){
                System.out.println(karakter + " ince sesli bir harftir.");
            }
        }*/

        switch (sesliHarf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(sesliHarf + " Kalın Sesli");
                break;
            default:
                System.out.println(sesliHarf + " ince sesli");
        }
    }
}