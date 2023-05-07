import java.util.ArrayList;
import java.util.List;

public class Man extends Person{
    public Man(String firstName, String lastName, String previousLastName, int age, String hobby, Person partner) {
        super(firstName, lastName, previousLastName, age, hobby, partner);
    }
    private final List<Person> men = new ArrayList<>();
    public void addMan(Person man){
        men.add(man);
    }

    @Override
    public boolean isRetired() {
        boolean isRetired = true;
        for(Person person: men){
            if(person.getAge() > 65){
                isRetired = true;
            } else {
                isRetired = false;
            }
        } return isRetired;
    }
    @Override
    public void registerPartnership() {
        for(Person person : men){
            if(person.getPartner() != null){
                person.setLastName(getPartner().getLastName());
            }
        }
    }
    @Override
    public void getBadgeActive() {
        for(Person person: men){
            if(person.getHobby().equals("Fishing")){
                System.out.println(person.getFirstName() + " have got Relax Badge!");
            } else System.out.println(person.getFirstName() + " have not Relax Badge yet");
        }
    }
    public void deregisterPartnership(boolean deregisterPartnership) {

        for(Person person : men){
            if(deregisterPartnership){
                person.setLastName(getPreviousLastName());}
        }
    }
}

