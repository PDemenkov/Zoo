public class Flightless extends Birds {
    String movingType;

    public Flightless(String name, int year, String livingEnviroment, String movingType) {
        super(name, year, livingEnviroment);
        setMovingType(movingType);
    }

    public String getMovingType() {
        return movingType;
    }

    public void setMovingType(String movingType) {
        this.movingType = ValidationUtils.validOrDefault(movingType, "Не указано");
    }

    public void walk() {
        System.out.println(getName() + " гуляет");
    }

    @Override
    public String toString() {
        return "Нелетающие: " +
                "Имя: " + getName() +
                ", Среда обитания: " + getLivingEnviroment() +
                ", Количество лет: " + getYear() +
                ", Тип передвижения: " + getMovingType();
    }
}
