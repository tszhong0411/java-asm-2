public class PowerUpItem {
  private String name;
  private String dialogue;

  public PowerUpItem(String name, String dialogue) {
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

class OneUpMushroom extends PowerUpItem {
  public OneUpMushroom() {
    super("One-Up Mushroom", "Oh Yeah! I got a life!");
  }
}

class SuperMushroom extends PowerUpItem {
  public SuperMushroom() {
    super("Super Mushroom", "Oh Yeah! I grow bigger!");
  }
}

class Flower extends PowerUpItem {
  public Flower() {
    super("Flower", "Oh Yeah! I got a fire!");
  }
}

class Star extends PowerUpItem {
  public Star() {
    super("Star", "Oh Yeah! I become invincible!");
  }
}
