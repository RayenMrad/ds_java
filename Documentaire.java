public class Documentaire extends Film {
    private String  sujet;
    private float tarif = 2.0f; 

    public Documentaire(String titre,String realisateur,String pays_origine,int duree,int nb_places,String sujet){
        super(titre, realisateur, pays_origine, duree);
        this.sujet=sujet;
    }

    public String toString(){
        return super.toString()+" - sujet : "+this.sujet;
    }

    float totalVenteBillets(){
        return getNb_places()*tarif;
    }

}
