package Q2;

public class Course {

    public String name, letterGrade;
    int mtG, hwG, finG;
    double mtW, finW, hwW;

    public Course() {
        mtW = 0.3;
        hwW = 0.2;
        finW = 0.5;
    }

    public Course(String _cname, double _mtW, double _hwW, double _finW) {
        name = _cname;
        mtW = _mtW;
        hwW = _hwW;
        finW = _finW;
    }

    public String print() {
        double total = (mtG * mtW) + (hwG * hwW) + (finG * finW);

        letterGrade = null;
        if (total < 60) {
            letterGrade = "F";
        } else if (total >= 60 & total < 70) {
            letterGrade = "D";
        } else if (total >= 70 & total < 80) {
            letterGrade = "C";
        } else if (total >= 80 & total < 90) {
            letterGrade = "B";
        } else {
            letterGrade = "A";
        }
        return letterGrade;
    }
}