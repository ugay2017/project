package testobject;

import java.util.Scanner;

public class CompClub {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите количество компьютеров : ");
        int compCount = scanner.nextInt();

        Computer[] userComps = new Computer[compCount];
        System.out.println("В это зале "+ userComps.length+" компьютеров");

        //создание пользовательских компьютеров
        for(int i = 0; i < compCount; i++) {
            userComps[i] = new Computer("Computer_" + i, false);
            System.out.println(userComps[i].getName());
        }
        System.out.println("-------------------");

        if(userComps.length == 0) {
            System.out.println("Не ни одного компьютера");
            return;
        }

        Computer adminComp = new Computer("Admin comp", true);
        adminComp.setUserComps(userComps);

        userComps[0].rebootUserComps();//нет разрешения, т.к. комп. не админский

        adminComp.switchOnUserComps();
        adminComp.rebootUserComps();

        userComps[0].setStatus("running");
        adminComp.shutdownUserComps();
    }
}
