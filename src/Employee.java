public class Employee extends Person {
    int salary;
    Employee(String firstName,String lastName, int salary) {
        super(firstName,lastName);
        this.salary = salary;
    }

    void showSalary (){
        System.out.println("The employed "+this.firstName+" "+this.lastName+ " Has "+salary +" CFA per month");
    }
}
