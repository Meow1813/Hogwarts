public class Ravenclaw extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String fullName, int transgression, int magic, int mind, int wisdom, int wit, int creativity) {
        super(fullName, transgression, magic);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return getFullName() +
                ": магия - "+getMagic() +
                "; трансгрессия - "+getTransgression() +
                "; ум - " + mind +
                "; мудрость - " + wisdom +
                "; остроумность - " + wit +
                "; творчество - " + creativity;
    }

    public int getPoints()
    {
        return mind + wit + wisdom + creativity;
    }
    public void compareGryffindor(Gryffindor enemy){
        if (this.getPoints() > enemy.getPoints()){
            System.out.println(this.getFullName() + " лучший когтевранец, чем "+ enemy.getFullName());
        } else if (this.getPoints() > enemy.getPoints()) {
            System.out.println(enemy.getFullName() + " лучший когтевранец, чем "+ this.getFullName());
        }
        else {
            System.out.println("Студенты равны");
        }
    }
}
