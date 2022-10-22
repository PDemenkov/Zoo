public class Birds extends Animals {
    private String livingEnviroment;

    public Birds(String name, int year, String livingEnviroment) {
        super(name, year);
        setLivingEnviroment(livingEnviroment);
    }

    public String getLivingEnviroment() {
        return livingEnviroment;
    }

    public void setLivingEnviroment(String livingEnviroment) {
        this.livingEnviroment = ValidationUtils.validOrDefault(livingEnviroment, "Информация не указана");
    }

    public void hunt() {
        System.out.println(getName() + " охотится");
    }

    @Override
    public void eat() {
        System.out.println("Птица " + getName() + " ест");
    }

    @Override
    public void sleep() {
        System.out.println("Птица " + getName() + " спит");
    }

    @Override
    public void move() {
        System.out.println("Птица " + getName() + " ходит");
    }
}
