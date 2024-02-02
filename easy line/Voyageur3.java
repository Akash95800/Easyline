public class Voyageur {
    // ...

    public String determinerCategorie() {
        if (age < 1) {
            return "Nourrisson";
        } else if (age <= 18) {
            return "Enfant";
        } else if (age <= 60) {
            return "Adulte";
        } else {
            return "Senior";
        }
    }
}
