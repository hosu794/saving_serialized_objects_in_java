public class Work {

    @Override
    public String toString() {
        return "Work{" +
                "description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Work(String description, String name) {
        this.description = description;
        this.name = name;
    }

    private String description;
    private String name;


}
