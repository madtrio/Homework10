package Homework10;

import java.util.Objects;

public class Author {
    private String surname;

    public Author(String surname) {

        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(surname);
    }
}
