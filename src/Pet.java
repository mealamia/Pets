import java.util.Scanner;

public class Pet {
    enum Sex{
        male,
        female
    }
    int petID;
    String petKind;
    String petName;
    Sex petSex;
    String birthDate;
    String comment;

    void AddPet(Scanner in){

        System.out.println("Давай введем информацию о новом питомце.\n" +
                "Что за животное: ");
        this.petKind = in.nextLine();
        System.out.println("Кличка: ");
        this.petName = in.nextLine();
        System.out.println("Пол (введите цифру: 1-жен, 2-муж): ");
        int numSex = Integer.parseInt(in.nextLine());
        if (numSex == 1) {
            this.petSex = Sex.female;
        }
        else if (numSex == 2) {
            this.petSex = Sex.male;
        }
        System.out.println("Дата рождения: ");
        this.birthDate = in.nextLine(); //по-хорошему надо сделать ввод даты, а не строки
        System.out.println("Комментарий или описание: ");
        this.comment = in.nextLine();

    }

    String ShowPet(){
        String petSex;
        if (this.petSex == Sex.male){
            petSex = "самец";
        } else if (this.petSex == Sex.female) {
            petSex = "самка";
        }
        return(this.petKind + " " + this.petName + " (" + this.petSex+ "), "
                + this.birthDate + this.comment);
    }

    void EditPet(Scanner in){
        System.out.println("Начнем редактирование. Придется заполнить каждое поле заново. \n" +
                "Что за животное? Старое значение: " + this.petKind + ". Новое значение: ");
        this.petKind = in.nextLine();
        System.out.println("Кличка. Старое значение: " + this.petName + ". Новое значение: ");
        this.petName = in.nextLine();
        System.out.println("Пол (введите цифру: 1-жен, 2-муж). Старое значение: " + this.petSex + ". Новое значение: ");
        int numSex = Integer.parseInt(in.nextLine());
        if (numSex == 1) {
            this.petSex = Sex.female;
        }
        else if (numSex == 2) {
            this.petSex = Sex.male;
        }
        System.out.println("Дата рождения. Старое значение: "+ this.birthDate + ". Новое значение: ");
        this.birthDate = in.nextLine(); //по-хорошему надо сделать ввод даты, а не строки
        System.out.println("Комментарий или описание. Старое значение: " + this.comment + ". Новое значение: ");
        this.comment = in.nextLine();
    }


    @Override
    public String toString() {
        return ShowPet();
    }
}
