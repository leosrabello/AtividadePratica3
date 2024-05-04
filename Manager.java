public class Manager extends Employee{

        private double YearlyBonus;
        private String team;
    
        public Manager(String name, int id, double YearlyBonus, String team) {
    
            super(name, id);
            this.YearlyBonus = YearlyBonus;
            this.team = team;
        }
    
        @Override
        public double SalaryCalc() {
    
            double salary = 3500.0;
            double salaryInc = salary + YearlyBonus;
            return salaryInc;
        }
    
        @Override
        public void work() {
    
            System.out.println("The Manager is Working.");
        }
    
        @Override
        public void progress() {
    
            System.out.println("The Manager reported a progress !");
    
        }
    }