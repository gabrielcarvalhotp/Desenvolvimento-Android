public class Employee {
    public String name;
    public Double salary;

    private Double inss () {
        double porcInss;
        if (this.salary < 1.100)
            porcInss = 7.5;
        else if (this.salary < 2203.48 )
            porcInss = 9;
        else if (this.salary < 3305.22 )
            porcInss = 12;
        else
            porcInss = 14;

        return porcInss;
    };

    private Double irrf() {
        double porcIrrf;
        if (this.salary < 1693.72)
            porcIrrf = 8;
        else if (this.salary < 2822.90)
            porcIrrf = 9;
        else
            porcIrrf = 11;

        return  porcIrrf;
    };
    public Double netSalary() {
        return this.salary - (this.salary / 100 * this.inss()) - (this.salary / 100 * this.irrf());
    };

}
