public abstract class Person {
    private String firstName;
    private String lastName;
    private String previousLastName;
    private int age;
    private String hobby;

    private Person partner;

    public String getPreviousLastName() {
        return previousLastName;
    }

    public void setPreviousLastName(String previousLastName) {
        this.previousLastName = previousLastName;
    }

    public Person(String firstName, String lastName, String previousLastName, int age, String hobby, Person partner){
        this.firstName = firstName;
        this.lastName = lastName;
        this.previousLastName = previousLastName;
        this.age = age;
        this.hobby = hobby;
        this.partner = partner;
    }
    public abstract boolean isRetired();
    public abstract void registerPartnership();
    public abstract void getBadgeActive();

    //public abstract void deregisterPartnership();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }
}
