package Iterator;

import java.io.Serializable;

public class Course implements Serializable {
    private String _prefix;
    private int _number;
    private String _title;
    private String _grade;

    public Course (String prefix, int number, String title, String grade) {
        _prefix = prefix;
        _number = number;
        _title = title;
        if (grade == null)
            _grade = " ";
        else
            _grade = grade;
    }

    public Course (String prefix, int number, String title) {
        this(prefix, number, title, " ");
    }

    public String getPrefix() {
        return _prefix;
    }

    public int getNumber() {
        return _number;
    }

    public String getTitle() {
        return _title;
    }

    public String getGrade() {
        return _grade;
    }

    public void setGrade(String grade) {
        _grade = grade;
    }

    public boolean taken() {
        return !_grade.equals(" ");
    }

    public boolean equals(Object other) {
        boolean result = false;
        if (other instanceof Course) {
            Course otherCourse = (Course) other;
            if (_prefix.equals(otherCourse.getPrefix()) && _number == otherCourse.getNumber())
                result = true;
        }
        return result;
    }

    public String toString() {
        String result = _prefix + " " + _number + ": " + _title;
        if (!_grade.equals(" "))
            result += " [" + _grade + "]";
        return result;
    }
}
