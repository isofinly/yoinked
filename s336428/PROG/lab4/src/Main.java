import com.company.additionals.*;
import com.company.creatures.*;
import com.company.exceptions.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("**Предыстория**");
        Moon moon = new Moon();
        Spaceship NIP = new Spaceship("НИП");
        NIP.spacesuitContainer.add(new Spacesuit("Скафандр1", "Скафандр для крутых"));
        NIP.spacesuitContainer.add(new Spacesuit("Скафандр2", "Скафандр для не очень крутых"));
        NIP.spacesuitContainer.add(new Spacesuit("Скафандр3", "Просто скафандр"));
        NIP.foodContainer.add(new Food("Сникерс", 10));
        NIP.foodContainer.add(new Food("Чипсы", 15));
        NIP.foodContainer.add(new Food("Кола", 8));
        NIP.toLand(moon);
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
        try {
            while (true) {
                neznayka.eat(NIP.foodContainer.getSomeFood());
                ponchik.eat(NIP.foodContainer.getSomeFood());
            }
        } catch (GetNonExistentItem g) {
            System.out.println(g.getMassage());
        }
        try {
            neznayka.wearSuit(NIP.spacesuitContainer.getSomeSuit());
            ponchik.wearSuit(NIP.spacesuitContainer.getSomeSuit());
        } catch (GetNonExistentItem g){
            System.out.println(g.getMassage());
        }

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
            try {
                FIS.AddToCrew(sh);
            } catch (ExceedingTheMaxCapacity e) {
                e.getMassage();
            }
        }

        System.out.println("**Конец предыстории**\n");
        System.out.println(FIS.getCrewList());
        System.out.println("Начинается полет");
        FIS.toTakeOff();
        for (int i = 0; i < 3; i++) {
            System.out.println("Скорость корабля: " + FIS.getCurrentSpeed());
            FIS.increaseSpeed();
        }
        FIS.reduceSpeed();
        System.out.println("\nЧтобы разрядить обстановку, Гусли решил поиграть");
        gusli.playMusic("5 симфония", "Автор: Людвиг ван Бетховен");
        System.out.println("\n");
        FIS.toMoonOrbit(moon);
        FIS.MakeOrbitLoop();
        FIS.MakeOrbitLoop();
        stekliashkin.InspectSurface(NIP, moon);
        FIS.fromMoonOrbit(moon);
        FIS.toLand(moon);
        System.out.println("\n");


        Squad otryad = new Squad("Команда А", SquadType.SCOUTING, 10);
        otryad.AddToSquad(vintik);
        otryad.AddToSquad(shpuntik);
        otryad.AddToSquad(fuksia);
        otryad.AddToSquad(seledochka);
        otryad.AddToSquad(znayka);
        System.out.println(otryad.getStrSquadList());
        System.out.println("Тип отряда: " + otryad.getSquadType() + "\n");

        znayka.giveTask(otryad, "Надеть скафандры");
        Shorty[] A = otryad.getSquadList();
        for (Shorty ot : A) {
            if (ot != null) ot.wearSuit(zvezdochkin.reserchSuit());
        }
        System.out.println("\n");
        znayka.giveTask(otryad, "Обследовать ракету НИП");
        try {
            NIP.getInside(otryad);
        } catch (ExceedingTheMaxCapacity e) {
            System.out.println(e.getMassage());
        }
        if (NIP.foodContainer.isEmpty() && !NIP.seekOutInside(neznayka, znayka) &&
                !NIP.seekOutInside(ponchik, znayka) && NIP.spacesuitContainer.getSuitCount() != 0){
            System.out.println("Пищевой отсек пуст, нет нескольких скафандров, значит Незнайка и Пончик съели всю еду и отправились на поиски новой!");
        }
        System.out.println("\n");
    }
}
