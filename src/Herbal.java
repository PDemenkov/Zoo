public class Herbal extends Mammals {
    public String foodType;

    public Herbal(String name, int year, String livingEnviroment, String moveSpeed, String foodType) {
        super(name, year, livingEnviroment, moveSpeed);
        setFoodType(foodType);
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = ValidationUtils.validOrDefault(foodType, "Информация не указана");
    }

    public void graze() { // пастись
        System.out.println(getName() + " пасётся");
    }

    @Override
    public String toString() {
        return "Травоядные: " +
                "Имя: " + getName() +
                ", Среда обитания: " + getLivingEnviroment() +
                ", Количество лет: " + getYear() +
                ", Скороcть: " + getMoveSpeed() +
                ", тип пищи: " + getFoodType();
    }

}
