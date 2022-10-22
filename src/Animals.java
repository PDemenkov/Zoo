import java.time.LocalDate;
import java.util.Objects;

public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name, int year) {
        setName(name);
        setYear(year);
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = ValidationUtils.validOrDefault(name, "animal");
    }

    public int getYear() {
        return age;
    }

    public void setYear(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = LocalDate.now().getYear() - Math.abs(age);
        }
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
