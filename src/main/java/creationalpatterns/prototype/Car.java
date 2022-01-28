package creationalpatterns.prototype;

public class Car implements Prototype {
    private int id;
    private String carName;
    private String carDescription;

    public Car(int id, String carName, String carDescription) {
        this.id = id;
        this.carName = carName;
        this.carDescription = carDescription;
    }

    @Override
    public Object clone() {
        Car copy = new Car(id, carName, carDescription);
        return copy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return carName;
    }

    public void setProjectName(String projectName) {
        this.carName = projectName;
    }

    public String getCarDescription() {
        return carDescription;
    }

    public void setCarDescription(String carDescription) {
        this.carDescription = carDescription;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carName='" + carName + '\'' +
                ", carDescription='" + carDescription + '\'' +
                '}';
    }
}
