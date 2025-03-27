public class PowerUpItems {
  private String name;
  private String dialogue;

  public PowerUpItems(String name, String dialogue) {
    this.name = name;
    this.dialogue = dialogue;
  }

  // Getters
  public String getName() {
    return name;
  }

  public String getDialogue() {
    return dialogue;
  }

  // Methods
  public void applyEffect(Character character) {
    // TODO: Implement the effect of the power-up item
  }
}

class OneUpMushroom extends PowerUpItems {
  public OneUpMushroom() {
    super("One-Up Mushroom", "Oh Yeah! I got a life!");
  }
}

class SuperMushroom extends PowerUpItems {
  public SuperMushroom() {
    super("Super Mushroom", "Oh Yeah! I grow bigger!");
  }
}

class Flower extends PowerUpItems {
  public Flower() {
    super("Flower", "Oh Yeah! I got a fire!");
  }
}

class Star extends PowerUpItems {
  public Star() {
    super("Star", "Oh Yeah! I become invincible!");
  }
}
