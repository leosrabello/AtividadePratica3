interface Workable {

    void work();
    void progress();

}

abstract class Employee implements Workable {

    protected String name;
    protected int id;
    
    public Employee (String name, int id) {

        this.name = name;
        this.id = id;
        
    }
    
    public abstract double SalaryCalc();

}