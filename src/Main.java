public class Main {
    public static void main(String[] args) {
        {//Задание 1
            System.out.println("//Задание 1");
            int age = 18;

            if (age >= 18) {
                System.out.println("Поздравляем вас с совершенолетием!");
            }

            if (age <= 18) {
                System.out.println("Возраст совершенолетия еще не наступил, нужно немного подождать");
            }
        }

        {//Задание 2
            System.out.println("//Задание 2");
            int ageHuman = 8;

            if (ageHuman >= 7 && ageHuman <= 18) {
                System.out.println("Тебе пора в школу!");
            }

            if (ageHuman >= 18 && ageHuman <= 24) {
                System.out.println("Тебе пора в универ!");
            }

            if (ageHuman >= 24) {
                System.out.println("Тебе пора на работу");
            }
        }

        {//Задание 3
            System.out.println("//Задание 3");
            int totalNumberSeats = 102;
            int seatPlace = 60;
            int standingPlace = 42;

            int seatUsed = 10;
            int standingUsed = 20;

            if (seatUsed < seatPlace) {
                System.out.println("Осталось сидячих мест " + (seatPlace - seatUsed));
            }

            if (standingUsed < standingPlace) {
                System.out.println("Осталось сидячих мест " + (standingPlace - standingUsed));
            }

        }
            //Задание 4
            System.out.println("//Задание 4");
            int age = 18;

            if (age >= 18) {
                System.out.println("Поздравляем вас с совершенолетием!");
            } else {

                System.out.println("Возраст совершенолетия еще не наступил, нужно немного подождать");
            }


        //Задание 5
        System.out.println("//Задание 5");

        int ageHuman = 8;

        if (ageHuman >= 7 && ageHuman <= 18) {
            System.out.println("Тебе пора в школу!");
        } else if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Тебе пора в универ!");
        } else if (ageHuman >= 24) {
            System.out.println("Тебе пора на работу");
        }

        //Задание 6
        System.out.println("//Задание 6");
        int totalNumberSeats = 102;
        int seatPlace = 60;
        int standingPlace = 42;

        int seatUsed = 10;
        int standingUsed = 20;

        if (seatUsed < seatPlace) {
            System.out.println("Осталось сидячих мест " + (seatPlace - seatUsed));
        } else {
            System.out.println("Все сидячие места использованы");
        }

        if (standingUsed < standingPlace) {
            System.out.println("Осталось сидячих мест " + (standingPlace - standingUsed));
        } else {
            System.out.println("Все стоячие места использованы");
        }

        //Задание 7
        System.out.println("//Задание 7");
        int personAge = 25;
        boolean adultHuman = true;

        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека " + personAge + " ему пора в детский сад");
        } else if (personAge >= 7 && personAge <= 18) {
            System.out.println("Если возраст человека " + personAge + " ему пора в школу");
        } else if (personAge >= 18 && personAge <= 24)    {
            System.out.println("Если возраст человека " + personAge + " ему пора в универ");
        } else if (personAge > 24) {
            System.out.println("Если возраст человека " + personAge + " ему пора на работу");
        }

        //Задание 8
        System.out.println("//Задание 8");
        int childAge = 10;
        if (childAge < 5) {
            System.out.println("Детям до 5 лет кататься на карусели запрещено!");
        } else if (childAge > 5 && childAge < 18 ) {
            System.out.println("Необходимо кататься со взрослым человеком!");
            if (adultHuman) {
                System.out.println("Кататься можно");
            } else {
                System.out.println("Кататься запрещено, необходимо присутствие взрослого!");
            }
        } else if (childAge > 14) {
            System.out.println("Кататься можно без сопровождения взрослого!");
        }

        //Задание 9
        int one = -1;
        int two = 20;
        int free = -1;

        if((one - two > 0) && (one - free > 0)) {
            System.out.println("большее число равно " + one);
        } else if ((two - one > 0) && (two - free > 0)) {
            System.out.println("большее число равно " + two);
        }   else if ((free - one > 0) && (free - two > 0)) {
            System.out.println("большее число равно " + free);
        } else if(one == two ) {
            System.out.println("числа one и two равны");
        } else if (one == free) {
            System.out.println("числа one и free равны");
        } else if (free == two) {
            System.out.println("числа two и free равны");
        }

    }
}