public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String fullName, int transgression, int magic, int nobility, int honor, int bravery) {
        super(fullName, transgression, magic);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return getFullName() +
                ": магия - "+getMagic() +
                "; трансгрессия - "+getTransgression() +
                "; благородство - " + nobility +
                "; честь - " + honor +
                "; храбрость - " + bravery ;
    }
    public int getPoints()
    {
        return honor + nobility + bravery;
    }
    public void compareGryffindor(Gryffindor enemy){
        if (this.getPoints() > enemy.getPoints()){
            System.out.println(this.getFullName() + " лучший грифиндорец, чем "+ enemy.getFullName());
        } else if (this.getPoints() > enemy.getPoints()) {
            System.out.println(enemy.getFullName() + " лучший грифиндорец, чем "+ this.getFullName());
        }
        else {
            System.out.println("Студенты равны");
        }
    }
}
