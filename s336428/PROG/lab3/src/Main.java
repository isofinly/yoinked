import com.company.additionals.*;
import com.company.creatures.*;

public class Main {
    public static void main(String[] args){
        Commander znayka = new Commander("Знайка");
        Constructor fuksia = new Constructor("Фуксия");
        Constructor seledochka = new Constructor("Селедочка");
        Mechanic vintik = new Mechanic("Винтик");
        Mechanic shpuntik = new Mechanic("Шпунтик");
        Professor zvezdochkin = new Professor("Звездочкин");
        Astronomer stekliashkin = new Astronomer("Стекляшкин");
        Engineer klepka = new Engineer("Клепка");
        Architect kubik = new Architect("Кубик");
        Painter tiubik = new Painter("Тюбик");
        Musician gusli = new Musician("Гусли");
        Doctor piliulkin = new Doctor("Пилюлькин");
        Shorty neznayka = new Shorty("Незнайка");
        Shorty ponchik = new Shorty("Пончик");

        double chislo = Math.random();
        if (chislo < 0.33) {
            System.out.println("Вам выпал стандартный сюжет" + "\n----------------------------");
            Spaceship FIS = fuksia.construct("ФИС", "Фуксия и Селедочка", 20);
            Shorty[] a = new Shorty[12];
            a[0] = znayka;
            a[1] = fuksia;
            a[2] = seledochka;
            a[3] = vintik;
            a[4] = shpuntik;
            a[5] = zvezdochkin;
            a[6] = stekliashkin;
            a[7] = klepka;
            a[8] = kubik;
            a[9] = tiubik;
            a[10] = gusli;
            a[11] = piliulkin;
            for (Shorty sh : a) {
                sh.becomeCosmonaut();
                FIS.AddToCrew(sh);
            }
            System.out.println(FIS.getCrewList() + "\n");

            System.out.println("Начинается полет");
            FIS.toTakeOff();
            for (int i = 0; i < 4; i++) {
                System.out.println(FIS.getCurrentSpeed());
                FIS.increaseSpeed();
            }
            for (int i = 3; i >= 0; i--) {
                System.out.println(FIS.getCurrentSpeed());
                FIS.reduceSpeed();
            }
            FIS.toLand();
            System.out.println("\n");

            Squad otryad = new Squad("Команда А", SquadType.SCOUTING, 10);
            otryad.AddToSquad(vintik);
            otryad.AddToSquad(shpuntik);
            otryad.AddToSquad(fuksia);
            otryad.AddToSquad(seledochka);
            System.out.println(otryad.getStrSquadList());
            System.out.println("Тип отряда: " + otryad.getSquadType() + "\n");

            znayka.giveTask(otryad, "Надеть скафандры");
            Shorty[] A = otryad.getSquadList();
            for (Shorty ot : A) {
                if (ot != null) ot.wearSuit(zvezdochkin.reserchSuit());
            }
            System.out.println("\n");
            znayka.giveTask(otryad, "Обследовать ракету НИП");

            Spaceship NIP = new Spaceship("НИП");
            System.out.println("\n");
            NIP.seekOutInside(neznayka);
            NIP.seekOutInside(ponchik);
        }
         else if (chislo >= 0.33 && chislo < 0.66){
            System.out.println("Вам выпал сюжет: боевик" + "\n----------------------------");
            Spaceship FIS = fuksia.construct("ФИС", "Фуксия и Селедочка", 20);
            Shorty[] a = new Shorty[12];
            a[0] = znayka;
            a[1] = fuksia;
            a[2] = seledochka;
            a[3] = vintik;
            a[4] = shpuntik;
            a[5] = zvezdochkin;
            a[6] = stekliashkin;
            a[7] = klepka;
            a[8] = kubik;
            a[9] = tiubik;
            a[10] = gusli;
            a[11] = piliulkin;
            for (Shorty sh : a) {
                sh.becomeCosmonaut();
                FIS.AddToCrew(sh);
            }
            System.out.println(FIS.getCrewList() + "\n");
            System.out.println("Начинается полет");
            FIS.toTakeOff();
            for (int i = 0; i < 4; i++) {
                System.out.println(FIS.getCurrentSpeed());
                FIS.increaseSpeed();
            }
            for (int i = 3; i >= 0; i--) {
                System.out.println(FIS.getCurrentSpeed());
                FIS.reduceSpeed();
            }
            FIS.toLand();
            System.out.println("\n");

            Squad otryad = new Squad("Команда А", SquadType.SCOUTING, 10);
            otryad.AddToSquad(vintik);
            otryad.AddToSquad(shpuntik);
            otryad.AddToSquad(fuksia);
            otryad.AddToSquad(seledochka);
            System.out.println(otryad.getStrSquadList());
            System.out.println("Тип отряда: " + otryad.getSquadType() + "\n");

            znayka.giveTask(otryad, "Надеть скафандры");
            Shorty[] A = otryad.getSquadList();
            for (Shorty ot : A) {
                if (ot != null) ot.wearSuit(zvezdochkin.reserchSuit());
            }
            System.out.println("\n");
            znayka.giveTask(otryad, "Обследовать ракету НИП");

            Spaceship NIP = new Spaceship("НИП");
            System.out.println("\n");

            NIP.seekOutInside(neznayka);
            NIP.seekOutInside(ponchik);
            Shorty pirat1 = new Shorty("Черная борода", 30);
            Shorty pirat2 = new Shorty("Одноглазый Боб", 30);
            NIP.getInside(pirat1);
            NIP.getInside(pirat2);
            NIP.seekOutInside(pirat1);
            NIP.seekOutInside(pirat2);
            System.out.println("\n" + "Космические пираты атакуют!!!" + "\n");

            Squad oborona = new Squad("Команда Б", SquadType.DEFENCE, 10);
            oborona.AddToSquad(vintik);
            oborona.AddToSquad(shpuntik);
            oborona.AddToSquad(klepka);
            oborona.AddToSquad(znayka);
            oborona.AddToSquad(piliulkin);
            System.out.println(oborona.getStrSquadList());
            System.out.println("Тип отряда: " + oborona.getSquadType() + "\n");

            znayka.giveTask(oborona, "Защищать ракету НИП");System.out.println("\n");
            pirat1.damage(shpuntik, 10);
            pirat2.damage(vintik, 15);
            vintik.damage(pirat1, 35);
            pirat2.damage(vintik, 15);
            shpuntik.damage(pirat2, 35);
            System.out.println("\n");
            znayka.giveTask(piliulkin, "Помочь раненым");System.out.println("\n");
            piliulkin.Heal(vintik);
            piliulkin.Heal(shpuntik);
        }
        else{
            System.out.println("Вам выпал сюжет: долгое путешествие" + "\n----------------------------");
            Spaceship FIS = fuksia.construct("ФИС", "Фуксия и Селедочка", 20);
            Shorty[] a = new Shorty[12];
            a[0] = znayka;
            a[1] = fuksia;
            a[2] = seledochka;
            a[3] = vintik;
            a[4] = shpuntik;
            a[5] = zvezdochkin;
            a[6] = stekliashkin;
            a[7] = klepka;
            a[8] = kubik;
            a[9] = tiubik;
            a[10] = gusli;
            a[11] = piliulkin;
            for (Shorty sh : a) {
                sh.becomeCosmonaut();
                FIS.AddToCrew(sh);
            }
            System.out.println(FIS.getCrewList() + "\n");

            System.out.println("Начинается полет");
            FIS.toTakeOff();
            FIS.increaseSpeed();System.out.println(FIS.getCurrentSpeed());
            FIS.increaseSpeed();System.out.println(FIS.getCurrentSpeed());

            System.out.println("\n" + "Путь лежит через пояс астероидов, поэтому лететь еще долго");
            znayka.giveTask(gusli, "Поднять всем настроение или заняться полезным делом");
            System.out.println("\n");
            gusli.playMusic("5 симфония", "Автор: Людвиг ван Бетховен");
            System.out.println("\n");
            kubik.design("Очень высокий небоскреб", "такое здание еще никто никогда не проектировал");
            System.out.println("\n");
            klepka.drawBlueprints("Механизированная курица", "очень полезное изобретение");
            System.out.println("\n");
            vintik.TurnGears("128-ми конечная шестеренка", "с помощью нее можно завести механизированную курицу");
            System.out.println("\n");
            tiubik.Paint("\"Утро в сосновом лесу\"", "копия известной картины И.И.Шишкина");
            System.out.println("\n" + "Корабль прошел пояс астероидов!");

            FIS.reduceSpeed();System.out.println(FIS.getCurrentSpeed());
            FIS.reduceSpeed();System.out.println(FIS.getCurrentSpeed());
            FIS.toLand();
            System.out.println("\n");

            Squad otryad = new Squad("Команда А", SquadType.SCOUTING, 10);
            otryad.AddToSquad(vintik);
            otryad.AddToSquad(shpuntik);
            otryad.AddToSquad(fuksia);
            otryad.AddToSquad(seledochka);
            System.out.println(otryad.getStrSquadList());
            System.out.println("Тип отряда: " + otryad.getSquadType() + "\n");

            znayka.giveTask(otryad, "Надеть скафандры");
            Shorty[] A = otryad.getSquadList();
            for (Shorty ot : A) {
                if (ot != null) ot.wearSuit(zvezdochkin.reserchSuit());
            }
            System.out.println("\n");
            znayka.giveTask(otryad, "Обследовать ракету НИП");

            Spaceship NIP = new Spaceship("НИП");
            System.out.println("\n");

            NIP.seekOutInside(neznayka);
            NIP.seekOutInside(ponchik);
        }
    }
}