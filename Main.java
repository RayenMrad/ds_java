public class Main {
    public static void main(String[] args) {

        Jcc jcc2021 = new Jcc(2021);

        Documentaire film1 = new Documentaire("Le dernier refuge", "Ousman", "Mali", 86, 30, "La guerre civile");
        Film film2 = new Film("Insurrection", "Jilani Saadi", "Tunisie", 105);
        film2.setNb_places(45); 

        jcc2021.ajoutFilm(film1); 
        jcc2021.ajoutFilm(film2); 

        jcc2021.listeFilmsJCC();

        int nbEtudiantsFilm1 = 9; 
        int nbEtudiantsFilm2 = 17;

        float totalVentes = jcc2021.totalVenteBilletsJCC(nbEtudiantsFilm1, nbEtudiantsFilm2);
        System.out.println("Montant total des ventes de billets pour les JCC 2021 : " + totalVentes + " DT");
    }    
}
