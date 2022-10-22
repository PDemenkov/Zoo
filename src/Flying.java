public class Flying extends Birds {
    String movingType;

    public Flying(String name, int year, String livingEnviroment, String movingType) {
        super(name, year, livingEnviroment);
        this.movingType = movingType;
    }

    public String getMovingType() {
        return movingType;
    }

    public void setMovingType(String movingType) {
        this.movingType = ValidationUtils.validOrDefault(movingType, "Не указано");
    }

    public void fly() {
        System.out.println(getName() + " летает");
    }

    @Override
    public String toString() {
        return "Летающие: " +
                "Имя: " + getName() +
                ", Среда обитания: " + getLivingEnviroment() +
                ", Количество лет: " + getYear() +
                ", Тип передвижения: " + getMovingType();
    }
}
