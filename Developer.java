import java.util.ArrayList;

class Developer extends Employee {
    private ArrayList<String> tech;

    public Developer(String name, int id, ArrayList<String> tech) {

        super(name, id);
        this.tech = tech;

    }

    @Override
    public double SalaryCalc() {

        double salary = 8000.0;
        double devBonus = tech.size() * 100.0;
        double salaryInc = salary + devBonus;
        return salaryInc;

    }

    @Override
    public void work() {

        System.out.println("The Dev is Working.");

    }

    @Override
    public void progress() {

        System.out.println("The Dev reported a progress !.");

    }
}