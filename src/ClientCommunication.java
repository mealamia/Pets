public class ClientCommunication {
    void TextOut(int situation){
        if (situation == 1) {
            System.out.println("Привет! Это база данных питомцев. Давай с ней поработаем. Что ты хочешь сделать?\n" +
                    "    Введи EXIT, если ты хочешь завершить работу. \n" +
                    "    Введи LIST, если хочешь посмотреть, какие питомцы есть в нашей базе. \n" +
                    "    Введи ADD, если хочешь добавить нового питомца. \n" +
                    "    Введи REMOVE, если хочешь удалить запись из базы. \n" +
                    "    Введи EDIT, если хочешь отредактировать запись в базе.");
        }
        else if (situation == 2){
            System.out.println("Давай прощаться!");
        }
        else if (situation == 3){
            System.out.println("Кажется, ты ошибся при вводе команды. Давай попробуем еще раз.");
        }
        else if (situation == 4){
            System.out.println("Введи порядковый номер записи о питомце: ");
        }

//        if (situation == 2){
//            System.out.println("Давай запишем, что мы знаем о питомце.");
//        }
    }


}
