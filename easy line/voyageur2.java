public class Voyageur {
    private String nom;
    private int age;

    public Voyageur(String nom, int age) {
        setNom(nom);
        setAge(age);
    }

    public Voyageur() {
        // Constructeur par défaut
    }

    public void afficherInformations() {
        System.out.println("Nom: " + nom + ", Age: " + age);
    }

    private void setNom(String nom) {
        // Vérifier que le nom comporte au moins 2 caractères
        if (nom.length() >= 2) {
            this.nom = nom;
        } else {
            System.out.println("Le nom doit comporter au moins 2 caractères.");
        }
    }

    public void setAge(int age) {
        // Vérifier que l'âge est positif
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("L'âge doit être positif.");
        }
    }

    public int getAge() {
        return age;
    }
}
