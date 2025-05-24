public abstract class Personagem {
    protected String nome;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public abstract void atacar();
}

public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " ataca com sua espada em um ataque corpo a corpo!");
    }
}

public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " lança uma bola de fogo!");
    }
}

public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " dispara uma flecha precisa de longa distância!");
    }
}

