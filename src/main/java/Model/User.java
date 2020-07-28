package Model;

public class User {
    private Integer id;
    private String name;

    public Integer getId() {
        System.out.println("Id " + this.id);
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        System.out.println("Name " + this.name);
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printThrowException() {
        System.out.println("Exception Raised");
        throw new IllegalArgumentException();
    }
}
