public class Voyageur {
    private String nom;
    private int age;
    private String categorie;

    public Voyageur(String nom, int age) {
        setNom(nom);
        setAge(age);
        setCategorie(determinerCategorie());
    }

    public void setAge(int age) {
        // Vérifier que l'âge est positif
        if (age >= 0) {
            this.age = age;
            setCategorie(determinerCategorie());
        } else {
            System.out.println("L'âge doit être positif.");
        }
    }

    private void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    // ...
}
