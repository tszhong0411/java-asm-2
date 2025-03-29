public class Character {
  private String name;
  private String state;
  private int coins;
  private String message;
  private String specialAbility;
  private int lives;
  private String previousState;
  private int invincibleRounds;

  private static final String INITIAL_STATE = "SMALL";
  private static final int INITIAL_COINS = 0;
  private static final int INITIAL_LIVES = 3;
  private static final int INITIAL_INVINCIBLE_ROUNDS = 3;

  public Character(String name, String message, String specialAbility) {
    this.name = name;
    this.message = message;
    this.specialAbility = specialAbility;

    this.state = INITIAL_STATE;
    this.coins = INITIAL_COINS;
    this.lives = INITIAL_LIVES;
    this.previousState = INITIAL_STATE;
    this.invincibleRounds = INITIAL_INVINCIBLE_ROUNDS;
  }

  // Getters
  public String getName() {
    return this.name;
  }

  public String getState() {
    return this.state;
  }

  public int getCoins() {
    return this.coins;
  }

  public String getMessage() {
    return this.message;
  }

  public String getSpecialAbility() {
    return this.specialAbility;
  }

  public int getLives() {
    return this.lives;
  }

  // Setters
  public void setState(String state) {
    this.state = state;
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
    PowerUpItem powerUpItem = null;

    // random number between 0 and 3 (inclusive)
    int randomNumber = (int) (Math.random() * 4);

    // switch case to determine which power-up item is collected
    switch (randomNumber) {
      case 0:
        powerUpItem = new OneUpMushroom(this);
        break;

      case 1:
        powerUpItem = new SuperMushroom(this);
        break;

      case 2:
        powerUpItem = new Flower(this);
        break;

      case 3:
        powerUpItem = new Star(this);
        break;
    }

    if (powerUpItem != null) {
      System.out.printf("%s collected a %s\n", this.getName(), powerUpItem.getName());
      System.out.println(powerUpItem.getDialogue());

      powerUpItem.applyEffect();
    }
  }

  public void hitEnemy() {
    System.out.println("Oh enemy!");

    switch (this.state) {
      case "SMALL":
        this.previousState = this.state;
        System.out.println("Mama mia! I lost a life!");
        this.lives -= 1;
        break;

      case "BIG":
        this.previousState = this.state;
        System.out.println("Ooops! I become small.");
        this.state = "SMALL";
        break;

      case "FIRE":
        this.previousState = this.state;
        System.out.println("Oh yeah! I kill the enemy!");
        System.out.println("Ooops! I become small.");
        this.state = "SMALL";
        break;

      case "INVINCIBLE":
        System.out.println("Woohoo!");
        this.invincibleRounds -= 1;

        if (this.invincibleRounds == 0) {
          System.out.println("Oh! Star effect has gone!");
          this.state = this.previousState;
          this.invincibleRounds = INITIAL_INVINCIBLE_ROUNDS;
        }
        break;

      default:
        break;
    }
  }

  public void gainLife() {
    lives += 1;
  }

  // Other unused methods
  public void jump() {
    System.out.println("Jump!");
  }

  public void run() {
    System.out.println("Run!");
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
