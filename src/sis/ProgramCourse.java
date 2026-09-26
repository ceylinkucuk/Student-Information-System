package sis;

public class ProgramCourse {
    private String id;
    private Program program;
    private Course course;
    private int semesterOrder;
    private CourseType courseType;
    private boolean isActive;

    public ProgramCourse() {
    }

    public ProgramCourse(String id, Program program, Course course,
                         int semesterOrder, CourseType courseType, boolean isActive) {
        this.id = id;
        this.program = program;
        this.course = course;
        this.semesterOrder = semesterOrder;
        this.courseType = courseType;
        this.isActive = isActive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getSemesterOrder() {
        return semesterOrder;
    }

    public void setSemesterOrder(int semesterOrder) {
        this.semesterOrder = semesterOrder;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "ProgramCourse{" +
                "id='" + id + '\'' +
                ", program=" + (program != null ? program.getName() : "None") +
                ", course=" + (course != null ? course.getName() : "None") +
                ", semesterOrder=" + semesterOrder +
                ", courseType=" + courseType +
                ", isActive=" + isActive +
                '}';
    }
}