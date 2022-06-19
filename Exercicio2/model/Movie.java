package model;

public class Movie {
    private Integer id;
    private String name;
    private String description;
    private Integer year;

    public Movie(String name, String description, int year){
        this.name = name;
        this.description = description;
        this.year = year;
    }
    @Override
    public String toString() { // Reescreveu o metodo toString só para conseguir retornar um teste do produto criado
        return String.format("%s - %s, %d", this.name, this.description, this.year);
    }

}
