package com.hspedu.poly_.polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager milan = new Manager("milan", 5000, 200000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(milan);
        polyParameter.testWork(tom);
        polyParameter.testWork(milan);
    }

    public void showEmpAnnual(Empolyee empolyee) {
        System.out.println(empolyee.getAnnual());
    }
    public void testWork(Empolyee empolyee){
        if (empolyee instanceof Worker){
            ((Worker) empolyee).work();
        }else if (empolyee instanceof Manager){
            ( (Manager) empolyee).manager();
        }
    }
}
