import java.util.Scanner;
public class Film {
    private String titre;
    private String realisateur;
    private String pays_origine;
    private int duree;
    private int nb_places;


    int getNb_places(){
        return nb_places;
    }

    void setNb_places(int n){
        this.nb_places=n;
    }

    public String toString() {
        return this.titre + " de " + this.realisateur + " (" + this.pays_origine + ") - " + this.duree + " min";
    }        


    public Film (String titre, String r, String pays, int d){
        this.titre=titre;
        this.realisateur=r;
        this.pays_origine=pays;
        this.duree=d;
    }
    Scanner scanner = new Scanner(System.in);
    float totalVenteBillets (){
        int tarif_etudiant=2;
        int tarif_public=3;
        System.out.println("saisir le nombre des places d'etudiants : ");
        int nb_etudiant=scanner.nextInt();
        return ((nb_etudiant*tarif_etudiant)+(this.nb_places-nb_etudiant)*tarif_public);
    }

    
}
