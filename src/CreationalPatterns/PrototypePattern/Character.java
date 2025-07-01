package CreationalPatterns.PrototypePattern;

public class Character implements Cloneable {
    public String name;
    public Address address;

    public Character(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepCopy() throws CloneNotSupportedException {
        Character cloned = (Character) super.clone();
        cloned.address = new Address(cloned.address.street);
        return cloned;
    }

    @Override
    public String toString() {
        return "Name : " + name + ", Address : " + this.address.street;
    }
}
