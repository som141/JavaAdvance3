package umlD.socar.product;

public class car {
    private Long carId;
    private String carName;
    private status carStatus;

    public car(Long carId, String carName, status carStatus) {
        this.carId = carId;
        this.carName = carName;
        this.carStatus = carStatus;
    }

    // getter & setter
    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public status getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(status carStatus) {
        this.carStatus = carStatus;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carName='" + carName + '\'' +
                ", carStatus=" + carStatus +
                '}';
    }
}
