public abstract class Animal {

    protected String name;
    protected int age;
    protected int hunger;
    protected int happiness;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.hunger = 50;
        this.happiness = 50;
    }

    public void feed() {
        hunger = 0;
        System.out.println(name + "에게 먹이를 주었습니다.");
    }

    public void play() {
        happiness += 10;
        hunger += 10;
        if (happiness > 100) happiness = 100;

        System.out.println(name + "와(과) 놀아주었습니다.");
    }

    public void showStatus() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("배고픔: " + hunger);
        System.out.println("행복도: " + happiness);
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}