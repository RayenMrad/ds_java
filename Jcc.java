public class Jcc{
    private Film[] competition;
    private int annee;
    private int NBFMAX=30;
    private int nbF;

    public Jcc(int annee) {
        this.competition = new Film[NBFMAX]; 
        this.annee = annee;                    
        this.nbF = 0;                         
    }

    void ajoutFilm (Film f){
        if (this.nbF<this.NBFMAX) {
            competition[nbF]=f;
            nbF++;
        }
        else{
            System.out.println("La compétition est au complet ");
        }
    }


    void listeFilmsJCC(){
        System.out.println("la liste des films en compétition : \n");
        for(int i=0;i<this.nbF;i++){
            System.out.println(competition[i].toString()    );
        }
    }

    float totalVenteBilletsJCC(int nbEtudiantsFilm1, int nbEtudiantsFilm2){
        float total=0;
        for(int i=0;i<this.nbF;i++){
            total+=competition[i].totalVenteBillets();
        }
        return total;
    }
    
    
}
