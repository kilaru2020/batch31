package tutorial.classes.pojo;

public class Worker {
    private String name;
    private int id;
    private String workDetails;

    private String hobbies;

    public Worker(){}

    public Worker(int id) { // Constructor
        this.id = id;
    }

    public Worker(int id, String name) { // Constructor
        this.id = id;
        this.name = name;
    }

    public Worker(int id, String name, String workDetails) { // Constructor
        this(id,name);
        this.workDetails = workDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWorkDetails() {
        return workDetails;
    }

    public void setWorkDetails(String workDetails) {
        this.workDetails = workDetails;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public void details(){
        System.out.print(this.name +" ");
        System.out.print(hobbies +" ");
        System.out.print (getId()+" ");
        System.out.print(this.getWorkDetails()+" ");
    }

    public String toString() {
        return this.name +" " + hobbies +" " + getId() +" " + this.getWorkDetails();
    }
}
