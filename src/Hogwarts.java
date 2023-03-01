public class Hogwarts {
    private String fullName;
    private int transgression;
    private int magic;

    public Hogwarts(String fullName, int transgression, int magic) {
        this.fullName = fullName;
        this.transgression = transgression;
        this.magic = magic;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void printStudent(){
        System.out.println(this.toString());
    }

    public int getMainPoints()
    {
        return magic + transgression;
    }
    public void compareStudent(Hogwarts enemy){
        if (this.getMainPoints() > enemy.getMainPoints()){
            System.out.println(this.getFullName() + " обладает большей мощностью магии, чем "+ enemy.getFullName());
        } else if (this.getMainPoints() > enemy.getMainPoints()) {
            System.out.println(enemy.getFullName() + " обладает большей мощностью магии, чем "+ this.getFullName());
        }
        else {
            System.out.println("Студенты равны");
        }
    }
}
