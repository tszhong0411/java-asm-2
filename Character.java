public class Character {
  private String name;
  private String state;
  private int coins;
  private String message;
  private String specialAbility;
  private int lives;

  public Character(String name, String message, String specialAbility) {
    this.name = name;
    this.state = "SMALL";
    this.coins = 0;
    this.message = message;
    this.specialAbility = specialAbility;
    this.lives = 3;
  }

  public String getName() {
    return name;
  }

  public String getState() {
    return state;
  }

  public int getCoins() {
    return coins;
  }

  public String getMessage() {
    return message;
  }

  public String getSpecialAbility() {
    return specialAbility;
  }

  public int getLives() {
    return lives;
  }
}

class Mario extends Character {
  public Mario() {
    super("Mario", "Let's-a go!", "");
  }
}

class Luigi extends Character {
  public Luigi() {
    super("Luigi", "I'm-a Luigi", "");
  }
}

class Peach extends Character {
  public Peach() {
    super("Peach", "Please be careful!", "Float in air");
  }
}

class Toad extends Character {
  public Toad() {
    super("Toad", "Yay!", "Reveal hidden item");
  }
}