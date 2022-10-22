public class Main {
    public static void main(String[] args) {
//Земноводные
        Amphibians frog = new Amphibians("Прудовая лягушка", 3, "Водоемы");
        Amphibians snake = new Amphibians("Уж пресноводный", 1, "Реки,водоемы,леса");
        System.out.println(snake);
        System.out.println(frog);
        snake.hunt();

        //травоядные млек
        Herbal gazelle = new Herbal("Песчаная газель", 5, "Африка", "50-60 км/ч", "трава");
        Herbal giraffe = new Herbal("Южный жираф", 6, "ЮАР", "от 32 до 60 км/ч", "листья");
        Herbal horse = new Herbal("Домашняя лошадь", 4, "степи", "88 км/ч", "Овес,сено,солома");
        System.out.println(gazelle);
        gazelle.graze();

        //хищники млек
        Predators hyena = new Predators("Пятнистая гиена", 2, "Восточная Африка", "64 км/ч", "мясо");
        Predators tiger = new Predators("Амурский тигр", 6, "Дальний Восток", "до 80 км/ч", "мясо");
        Predators bear = new Predators("Бурый медведь", 7, "От лесных массивов до тундры", "до 56 км/ч", "ягоды, жёлуди, орехи, корни, клубни и стебли трав");
        System.out.println(hyena);
        tiger.hunt();
        bear.walk();

        //птици нелет
        Flightless penguin = new Flightless("Антарктический пингвин", 5, "субантарктическиt острова", "переваливаясь с боку на бок,плавает");
        Flightless peacock = new Flightless("Зеленый павлин", 1, "тропики и субтропики", "На лапах");
        Flightless dodo = new Flightless("Додо", 1, "остров Маврикий", "Медленно по земле");
        System.out.println(peacock);
        penguin.walk();
        penguin.hunt();

        //птицы лет
        Flying gull = new Flying("Озерная чайка", 2, "Евразия,канада", "короткими шажками, летает");
        Flying albatross = new Flying("Черноногий альбатрос", 1, "Острова Гавайских и Торисима", "ходит,плавает,летает");
        Flying falcon = new Flying("Сокол-кобчик", 2, "от европейских стран до Казахстана, Урала, Западной Сибири", "ходит, летает");
        System.out.println(gull);
        albatross.fly();
        falcon.hunt();

        // вызов абстрактных методов
        gazelle.eat();
        frog.sleep();
        penguin.move();

        //проверка на класс
        checkCLass(penguin); //проверка на кдасс

    }

    public static void checkCLass(Animals animal) {
        if (animal instanceof Herbal) {
            ((Herbal) animal).graze();
        } else if (animal instanceof Predators) {
            ((Predators) animal).hunt();
        } else if (animal instanceof Amphibians) {
            animal.sleep();
        } else if (animal instanceof Flightless) {
            ((Flightless) animal).walk();
        } else if (animal instanceof Flying) {
            ((Flying) animal).fly();
        }
    }
}