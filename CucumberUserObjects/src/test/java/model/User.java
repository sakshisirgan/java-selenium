package model;

public class User {
    private final String name;
    private final int age;
    private final String email;

    public User(String name, int age, String email) {
        this.name  = name;
        this.age   = age;
        this.email = email;
    }

    public String getName()  { return name; }
    public int getAge()      { return age; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return name + " (" + age + ") - " + email;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        return this.name.equals(other.name)
            && this.age == other.age
            && this.email.equals(other.email);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age + email.hashCode();
    }
}
