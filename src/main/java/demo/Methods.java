package demo;

public class Methods {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Methods person = new Methods();


        person.setId(1);
        person.setName("John");


        System.out.println("id " + person.getId());
        System.out.println("name " + person.getName());
    }
}
