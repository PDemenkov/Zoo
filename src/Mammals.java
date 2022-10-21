public class Mammals extends Animals {

    private String livingEnviroment;
    private String moveSpeed;

    public Mammals(String name, int year, String livingEnviroment, String moveSpeed) {
        super(name, year);
        setLivingEnviroment(livingEnviroment);
        setMoveSpeed(moveSpeed);
    }

    public String getLivingEnviroment() {
        return livingEnviroment;
    }

    public void setLivingEnviroment(String livingEnviroment) {
        this.livingEnviroment = ValidationUtils.validOrDefault(livingEnviroment, "Какая-то скорость");
    }

    public String getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(String moveSpeed) {
        this.moveSpeed = ValidationUtils.validOrDefault(moveSpeed, "Скорость не указана");
    }

    public void walk() {
        System.out.println(getName() + " гуляет");
    }

    @Override
    public void eat() {
        System.out.println("Млекопитающее " + getName() + " ест");
    }

    @Override
    public void sleep() {
        System.out.println("Млекопитающее " + getName() + " спит");
    }

    @Override
    public void move() {
        System.out.println("Млекопитающее " + getName() + " двигается");
    }
}
