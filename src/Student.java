public class Student implements Comparable<Student> {
    private String name;
    private float score;
    Student(String name, float score) {
        this.name=name;
        this.score=score;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
            return Float.compare(this.score,s.score);
    }
}
