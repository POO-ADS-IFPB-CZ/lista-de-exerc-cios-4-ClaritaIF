public class Main1 {
    public static void main(String[] args) {
        Personagem[] personagens = {
            new Guerreiro("Thorin"),
            new Mago("Gandalf"),
            new Arqueiro("Legolas")
        };

        System.out.println("Início do turno de combate:\n");

        for (Personagem p : personagens) {
            p.atacar();
        }

        System.out.println("\nFim do turno.");
    }
}
