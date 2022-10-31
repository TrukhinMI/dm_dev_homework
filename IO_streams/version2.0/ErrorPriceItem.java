package csv;


import java.util.Objects;

public class ErrorPriceItem {
    private int id;

    public ErrorPriceItem() {
    }

    public ErrorPriceItem(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Error{" +
                "id=" + id +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErrorPriceItem error = (ErrorPriceItem) o;
        return id == error.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
