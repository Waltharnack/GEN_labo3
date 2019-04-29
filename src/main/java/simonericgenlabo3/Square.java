package simonericgenlabo3;

import java.util.Objects;

public class Square {

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Objects.equals(name, square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Square(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
