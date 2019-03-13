package demo.model;

public class User {

    private Integer numberOfPoints;

    public User() {
        numberOfPoints = 0;
    }

    public Integer getNumberOfPoints() {
        return numberOfPoints;
    }


    public void addPoints() {
        numberOfPoints++;
    }

}
