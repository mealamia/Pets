import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Boolean exitVar = Boolean.FALSE;
        ClientCommunication screenText = new ClientCommunication();
        Scanner in = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<Pet>();

        do {
            screenText.TextOut(1);
            String textIn = in.nextLine();

            if (textIn.equals("EXIT")) {
                screenText.TextOut(2);
                exitVar = Boolean.TRUE;
            }
            else if (textIn.equals("LIST")) {
                for (int i = 0; i < pets.size(); i++) {
                    System.out.println((i+1) + ". " + pets.get(i));
                }
            }
            else if (textIn.equals("ADD")) {
                Pet currentPet = new Pet();
                currentPet.AddPet(in);
                pets.add(currentPet);
                System.out.println("Питомец " + currentPet.petName + " добавлен.");
            }
            else if (textIn.equals("REMOVE")) {
                screenText.TextOut(4);
                int petIndex = Integer.parseInt(in.nextLine()) - 1;
                pets.remove(petIndex);
                System.out.println("Запись удалена.\n");
            }
            else if (textIn.equals("EDIT")) {
                screenText.TextOut(4);
                int petIndex = Integer.parseInt(in.nextLine()) - 1;
                pets.get(petIndex).EditPet(in);
                System.out.println("Запись отредактирована.\n");
            }
            else {
                screenText.TextOut(3);
            }
        }
        while (exitVar != Boolean.TRUE);
        in.close();
    }
}