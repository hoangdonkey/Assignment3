package entities;

public class Student {
    private String name;
    private String cl;
    private double maths;
    private double physics;
    private double chemistry;

    public Student() {
    }

    public Student(String name, String cl, double maths, double physics, double chemistry) {
        this.setName(name);
        this.setCl(cl);
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCl() {
        return cl;
    }

    public void setCl(String cl) {
        this.cl = cl;
    }

    public double getMaths() {
        return maths;
    }

    public void setMaths(double maths) throws Exception {
        if (maths >= 0 && maths <= 10) {
            this.maths = maths;
        } else {
            throw new Exception("Maths must be 1 - 10");
        }
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) throws Exception {
        if (physics >= 0 && physics <= 10) {
            this.physics = physics;
        } else {
            throw new Exception("Physics must be 1 - 10");
        }
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setchemistry(double chemistry) throws Exception {
        if (chemistry >= 0 && chemistry <= 10) {
            this.chemistry = chemistry;
        } else {
            throw new Exception("Chemistry must be 1 - 10");
        }
    }

    public double getAVG() {
        return (maths + physics + chemistry) / 3;
    }

    public String getGrade() {
        double average = getAVG();
        if (average < 4) {
            return "D";
        } else if (average >= 4 && average < 6) {
            return "C";
        } else if (average >= 6 && average <= 7.5) {
            return "B";

        } else if (average > 7.5) {
            return "A";
        }
        return "";
    }
}