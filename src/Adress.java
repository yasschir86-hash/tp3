public class Adress {
    private int numero;
    private String rue;
    private String codePoste;
    private String ville;


    // construteur

    @Override
    public String toString() {
        return numero  + ", rue='" + rue + '\'' + ", codePoste='" + codePoste + '\'' + ", ville='" + ville + '\'';
    }

    public int getNumero() {
        return numero;
    }

    public String getRue() {
        return rue;
    }

    public String getCodePoste() {
        return codePoste;
    }

    public String getVille() {
        return ville;
    }

    //overside
    public Adress(int numero , String rue , String codepostal , String ville){
        this.ville = ville;
        this.rue = rue ;
        this.numero = numero;
        this.codePoste = codepostal;

        // GET




    }
}
