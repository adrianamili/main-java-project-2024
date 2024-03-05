public class Student {

    int anulScolar;
    String specializare;
    String denumireFacultate;
    String frecventaCurs;

    Student(int anulScolarParam,String specializareParam,String denumireFacultateParam,String frecventaCursParam){
        this.anulScolar = anulScolarParam;
        this.specializare = specializareParam;
        this.denumireFacultate = denumireFacultateParam;
        this.frecventaCurs = frecventaCursParam;
    }

    Student(){}

    public int getAnulScolar(){
        return anulScolar;
    }

    public void setDenumireFacultate(String denumireFacultateParam){
        this.denumireFacultate = denumireFacultateParam;
    }

}
