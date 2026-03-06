import java.util.ArrayList;

public class Zoo {

    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    // 행동을 선택하지 않은 동물들의 배고픔수치가 조금씩 증가
    // 테스트를 위해 배고픔 수치가 큰 폭으로 증가함
    public int hungerPlus(int index) {

        for (int i = 0; i < animals.size(); i++) {
            Animal a = animals.get(i);
            if (i != index) {
                a.hunger = a.hunger + 20;
            }
        }
        return 0;
    }

    public void listAnimals() {
        if (animals.size() == 0) {
            System.out.println("등록된 동물이 없습니다.");
            return;
        }

        for (int i = 0; i < animals.size(); i++) {
            Animal a = animals.get(i);
            System.out.println((i + 1) + ". " + a.getName() + " (" + a.getClass().getSimpleName() + ", " + a.getAge() + "살)");
        }
    }

    public Animal getAnimal(int index) {
        if (index < 0 || index >= animals.size()) {
            return null;
        }
        return animals.get(index);
    }

    public int size() {
        return animals.size();
    }
}