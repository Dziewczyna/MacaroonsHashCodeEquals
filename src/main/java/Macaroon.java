import java.util.Objects;

public class Macaroon {
  Colour colour;
  Ingredients ingredients;

  public Macaroon(Colour colour, Ingredients ingredients) {
    this.colour = colour;
    this.ingredients = ingredients;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null) {
      return false;
    }
    if (object instanceof Macaroon) {
      Macaroon o = (Macaroon) object;
      if (colour.equals(o.colour) && ingredients.equals(o.ingredients)) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + colour.hashCode();
    result = 31 * result + ingredients.hashCode();
    return result;
  }
}
