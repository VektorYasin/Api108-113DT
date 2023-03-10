package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
    private int id;
    private String name;
    private Object states;

    public Country(int id, String name, Object states) {
        this.id = id;
        this.name = name;
        this.states = states;
    }

    public Country() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Object getStates() {
        return states;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStates(Object states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", states=" + states +
                '}';
    }
}
