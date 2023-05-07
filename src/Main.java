public class Main {
    public static void main(String[] args) {

        Woman woman1 = new Woman("Anna", "Kulik", "Kulik", 29, "Walking", null);
        Man man1 = new Man("Nikita", "Sunday", "Sunday", 31, "Fishing", woman1);
        Woman woman2 = new Woman("Helen", "Spring", "Spring", 61, "Running", man1);
        Man man2 = new Man("Steve", "Handriks", "Handriks", 66, "Gardening", woman1);


        woman1.addWoman(woman1);
        woman2.addWoman(woman2);
        man1.addMan(man1);
        man2.addMan(man2);
        System.out.println(man2.getAge());
        System.out.println(man2.isRetired());

        woman1.registerPartnership();
        System.out.println(woman1.getLastName());
        woman2.registerPartnership();
        System.out.println(woman2.getLastName());
        woman2.deregisterPartnership(true);
        System.out.println(woman2.getLastName());

        woman2.getBadgeActive();
        man1.getBadgeActive();
    }
}