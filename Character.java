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

  // Getters
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

  // Methods
  public void collectCoin() {
    coins += 1;
    // Collecting 5 coins grants an extra life to the game character.
    // Then reset the coins to 0.
    if (coins % 5 == 0) {
      lives += 1;
      coins = 0;
    }
  }

  public void collectPowerUp() {
    PowerUpItems powerUpItem = null;

    System.out.println("Ding! Yeah, collected a coin.");

    // random number between 0 and 3 (inclusive)
    int randomNumber = (int) (Math.random() * 4);

    // switch case to determine which power-up item is collected
    switch (randomNumber) {
      case 0:
        powerUpItem = new OneUpMushroom();
        break;
      case 1:
        powerUpItem = new SuperMushroom();
        break;
      case 2:
        powerUpItem = new Flower();
        break;
      case 3:
        powerUpItem = new Star();
        break;
    }

    System.out.printf("%s collected a %s\n", this.getName(), powerUpItem.getName());
    System.out.println(powerUpItem.getDialogue());
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