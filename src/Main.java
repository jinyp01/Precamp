import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Zoo zoo = new Zoo();

        while (true) {

            System.out.println("\n=== 동물원 관리 시스템 ===");
            System.out.println("1. 동물 등록");
            System.out.println("2. 동물 목록 보기");
            System.out.println("3. 동물과 놀기");
            System.out.println("4. 먹이주기");
            System.out.println("5. 동물 상태 확인");
            System.out.println("6. 울음소리 듣기");
            System.out.println("7. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int menu = scanner.nextInt();

            try {

                switch (menu) {

                    case 1:
                        scanner.nextLine();

                        System.out.print("동물 이름을 입력하세요: ");
                        String name = scanner.nextLine();

                        System.out.print("동물 나이를 입력하세요: ");
                        int age = scanner.nextInt();

                        System.out.print("동물 종류 (1.강아지 2.고양이): ");
                        int type = scanner.nextInt();

                        Animal animal;

                        if (type == 1) {
                            animal = new Dog(name, age);
                        } else if (type == 2){
                            animal = new Cat(name, age);
                        } else {
                            System.out.println("잘못된 입력입니다.");
                            break;
                        }

                        zoo.addAnimal(animal);
                        System.out.println(name + "이(가) 등록되었습니다.");
                        break;

                    case 2:
                        zoo.listAnimals();
                        break;

                    case 3:
                        zoo.listAnimals();
                        System.out.print("선택: ");
                        int playIndex = scanner.nextInt() - 1;
                        zoo.getAnimal(playIndex).play();
                        zoo.hungerPlus(playIndex);
                        break;

                    case 4:
                        zoo.listAnimals();
                        System.out.print("선택: ");
                        int feedIndex = scanner.nextInt() - 1;
                        zoo.getAnimal(feedIndex).feed();
                        zoo.hungerPlus(feedIndex);
                        break;

                    case 5:
                        zoo.listAnimals();
                        System.out.print("선택: ");
                        int statusIndex = scanner.nextInt() - 1;
                        zoo.getAnimal(statusIndex).showStatus();
                        break;

                    case 6:
                        zoo.listAnimals();
                        System.out.print("선택: ");
                        int soundIndex = scanner.nextInt() - 1;
                        zoo.getAnimal(soundIndex).makeSound();
                        break;

                    case 7:
                        System.out.println("프로그램을 종료합니다.");
                        return;

                    default:
                        System.out.println("잘못된 입력입니다.");
                }

            } catch (Exception e) {
                System.out.println("잘못된 입력입니다.");
                scanner.nextLine();
            }
        }
    }
}