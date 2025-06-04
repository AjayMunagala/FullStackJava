public class TestEmployeePerformnceEvaluation {
    public static void main(String[] args){
        EmployeePerformnceEvaluation epe = new EmployeePerformnceEvaluation();
        epe.setEmployeeName("Ajay");
        epe.setDepartment("CSE");
        epe.setBaseSalary(10000);
        epe.setPerformanceScore(8);
        
        System.out.println(epe);
        System.out.println("Bonus       :"+epe.calculateBonus());
        


        }
    
    
}
