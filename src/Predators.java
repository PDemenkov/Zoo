public class Predators extends Mammals {
    public String foodType;

    public Predators(String name, int year, String livingEnviroment, String moveSpeed, String foodType) {
        super(name, year, livingEnviroment, moveSpeed);
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = ValidationUtils.validOrDefault(foodType, "Информация не указана");
    }

    public void hunt() { // охотиться
        System.out.println(getName() + " охотится");
    }

    @Override
    public String toString() {
        return "Хищники: " +
                "Имя: " + getName() +
                ", Среда обитания: " + getLivingEnviroment() +
                ", Количество лет: " + getYear() +
                ", Скороcть: " + getMoveSpeed() +
                ", тип пищи: " + getFoodType();
    }
}
