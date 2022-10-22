public class Amphibians extends Animals {
    private String livingEnviroment;


    public Amphibians(String name, int year, String livingEnviroment) {
        super(name, year);
        setLivingEnviroment(livingEnviroment);

    }

    public String getLivingEnviroment() {
        return livingEnviroment;
    }

    public void setLivingEnviroment(String livingEnviroment) {
        this.livingEnviroment = ValidationUtils.validOrDefault(livingEnviroment, "По всему миру");
    }

    public void hunt() {
        System.out.println(getName() + " охотится");
    }


    @Override
    public void eat() {
        System.out.println("Земноводное " + getName() + " ест");
    }

    @Override
    public void sleep() {
        System.out.println("Земноводное " + getName() + " спит");
    }

    @Override
    public void move() {
        System.out.println("Земноводное " + getName() + " двигается");
    }

    @Override
    public String toString() {
        return "Земноводные: " +
                "Среда обитания: " + getLivingEnviroment() +
                ", Имя: " + getName() +
                ", Количество лет: " + getYear();
    }
}
