public abstract class PowerUpItem {
  private String name;
  private String dialogue;
  protected Character character;

  public PowerUpItem(String name, String dialogue, Character character) {
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
  public abstract void applyEffect();
}

class OneUpMushroom extends PowerUpItem {
  public OneUpMushroom(Character character) {
    super("One-Up Mushroom", "Oh Yeah! I got a life!", character);
  }

  public void applyEffect() {
    character.gainLife();
  }
}

class SuperMushroom extends PowerUpItem {
  public SuperMushroom(Character character) {
    super("Super Mushroom", "Oh Yeah! I grow bigger!", character);
  }

  public void applyEffect() {
    character.setState("BIG");
  }
}

class Flower extends PowerUpItem {
  public Flower(Character character) {
    super("Flower", "Oh Yeah! I got a fire!", character);
  }

  public void applyEffect() {
    character.setState("FIRE");
  }
}

class Star extends PowerUpItem {
  public Star(Character character) {
    super("Star", "Oh Yeah! I become invincible!", character);
  }

  public void applyEffect() {
    character.setState("INVINCIBLE");
  }
}
