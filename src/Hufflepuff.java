public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String fullName, int transgression, int magic, int diligence, int loyalty, int honesty) {
        super(fullName, transgression, magic);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return getFullName() +
                ": магия - "+getMagic() +
                "; трансгрессия - "+getTransgression() +
                "; трудолюбие - " + diligence +
                "; верность - " + loyalty +
                "; честность - " + honesty;
    }

    public int getPoints()
    {
        return diligence + loyalty + honesty;
    }
    public void compareGryffindor(Gryffindor enemy){
        if (this.getPoints() > enemy.getPoints()){
            System.out.println(this.getFullName() + " лучший пуфендуец, чем "+ enemy.getFullName());
        } else if (this.getPoints() > enemy.getPoints()) {
            System.out.println(enemy.getFullName() + " лучший пуфендуец, чем "+ this.getFullName());
        }
        else {
            System.out.println("Студенты равны");
        }
    }
}
