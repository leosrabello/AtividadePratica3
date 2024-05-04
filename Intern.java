class Intern extends Employee {

    private String supervisor;
    private int wrkdHrs;

    public Intern(String name, int id, String supervisor, int wrkdHrs) {

        super(name, id);
        this.wrkdHrs = wrkdHrs;
        this.supervisor = supervisor;
    }

    @Override
    public double SalaryCalc() {

        double baseValueHr = 20.0;
        double finalSalary = baseValueHr * wrkdHrs;
        return baseValueHr;
    }

    @Override
    public void work() {

        System.out.println("The Intern Is Working.");
        
    }

    @Override
    public void progress() {

        System.out.println("The Intern reported a progress !");

    }
}