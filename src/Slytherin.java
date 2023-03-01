public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String fullName, int transgression, int magic, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, transgression, magic);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return getFullName() +
                ": магия - "+getMagic() +
                "; трансгрессия - "+getTransgression() +
                "; хитрость - " + cunning +
                "; решительность - " + determination +
                "; амбициозность - " + ambition +
                "; находчивость - " + resourcefulness +
                "; жажда власти - " + lustForPower;
    }

    public int getPoints()
    {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }
    public void compareSlytherin(Slytherin enemy){
        if (this.getPoints() > enemy.getPoints()){
            System.out.println(this.getFullName() + " лучший слизеринец, чем "+ enemy.getFullName());
        } else if (this.getPoints() > enemy.getPoints()) {
            System.out.println(enemy.getFullName() + " лучший слизеринец, чем "+ this.getFullName());
        }
        else {
            System.out.println("Студенты равны");
        }
    }
}
