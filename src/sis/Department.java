package sis;

public class Department {
    private String id;
    private String code;
    private String name;
    private Faculty faculty;
    private Instructor headInstructor;
    private String phone;
    private String email;
    private boolean isActive;

    public Department() {
    }

    public Department(String id, String code, String name, Faculty faculty,
                      Instructor headInstructor, String phone, String email, boolean isActive) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.faculty = faculty;
        this.headInstructor = headInstructor;
        this.phone = phone;
        this.email = email;
        this.isActive = isActive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Instructor getHeadInstructor() {
        return headInstructor;
    }

    public void setHeadInstructor(Instructor headInstructor) {
        this.headInstructor = headInstructor;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", faculty=" + (faculty != null ? faculty.getName() : "None") +
                ", headInstructor=" + (headInstructor != null ? headInstructor.getFirstName() + " " + headInstructor.getLastName() : "None") +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}