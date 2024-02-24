import java.util.Arrays;
public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro){
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = new String[2];
    }

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

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if(giro >= 0){
            this.giro = giro;
        } else {
            System.out.println(" Invalid value because it can't be negative. ");
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if(index >= 0 && index < developerNames.length) {
            if(developerNames[index] == null){
                developerNames[index] = name;
                System.out.println("Employee added successfully. ");
            } else {
                System.out.println("Index is already occpied. ");
            }
        } else {
            System.out.println("Invalid index.");
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
