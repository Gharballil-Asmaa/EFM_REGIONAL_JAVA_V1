public class Main {
    public static void main(String[] args) throws Exception {
        Magasin m1 = new Magasin();
        m1.ajouter(new Article(1, 20000.2));
        m1.ajouter(new Article(10, 1000.0));
        m1.ajouter(new ArticleEnSolde(2, 200.0, 20.0));
        m1.ajouter(new ArticleEnSolde(3, 89.99, 5.99));
        m1.ajouter(new ArticleEnSolde(9, 100.0, 95.0));
        System.out.println(m1.nombreArticlesEnSolde());
        System.out.println(m1.supprimer(2));
        System.out.println(m1.indiceDe(2));
        m1.enregistrer("src\\fichier.txt");
    }
}