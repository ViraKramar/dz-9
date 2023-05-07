import java.util.ArrayList;
import java.util.List;
public class Woman extends Person{
    public Woman(String firstName, String lastName, String previousLastName, int age, String hobby, Person partner) {
        super(firstName, lastName, previousLastName, age, hobby, partner);
    }
    private final List<Person> women = new ArrayList<>();
    public void addWoman(Person woman){
        women.add(woman);
    }
    @Override
    public boolean isRetired() {
        boolean isRetired = true;
        for(Person person: women){
            if(person.getAge() > 60){
                isRetired = true;
            } else {
                isRetired = false;
            }
        } return isRetired;
    }
    @Override
    public void registerPartnership() {
        for(Person person : women){
            if(person.getPartner() != null){
                person.setLastName(getPartner().getLastName());
            }
        }
    }
    @Override
    public void getBadgeActive() {
        for(Person person: women){
            if(person.getHobby().equals("Running")){
                System.out.println(person.getFirstName() + " have got Active Badge!");
            } else System.out.println(person.getFirstName() + " have not Active Badge yet");
        }

    }
    public void deregisterPartnership(boolean deregisterPartnership) {
        for(Person person : women){
            if(deregisterPartnership){
                person.setLastName(getPreviousLastName());}
        }
    }
}


