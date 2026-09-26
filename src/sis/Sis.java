package sis;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class Sis {

    public static void main(String[] args) {
        // 1. Faculty creation
        Faculty engineeringFaculty = new Faculty(
                "FAC-01",
                "ENG",
                "Faculty of Engineering and Natural Sciences",
                null,
                "0212-000-0000",
                "eng@atlas.edu.tr",
                true,
                OffsetDateTime.now()
        );

        // 2. Department creation
        Department seDepartment = new Department(
                "DEP-01",
                "SE",
                "Software Engineering",
                engineeringFaculty,
                null,
                "0212-000-0001",
                "se@atlas.edu.tr",
                true
        );

        // 3. Instructor creation
        Instructor instructor = new Instructor(
                "INS-01",
                "EMP-001",
                "11111111110",
                "Ali",
                "Gunes",
                "ali.gunes@atlas.edu.tr",
                InstructorTitle.PROF,
                seDepartment,
                "Software Design and Architecture",
                LocalDate.of(2020, 9, 1),
                true
        );
        engineeringFaculty.setDean(instructor);
        seDepartment.setHeadInstructor(instructor);

        // 4. Program creation
        Program seProgram = new Program(
                "PRG-01",
                "SE-BSc",
                "Software Engineering Bachelor Program",
                seDepartment,
                DegreeLevel.BACHELOR,
                240,
                4,
                "TR/EN",
                true
        );

        // 5. Student list (ArrayList) creation
        List<Student> studentList = new ArrayList<>();

        // 6. Student registration simulation
        Student student1 = new Student(
                "STU-01",
                "240504021",
                "11111111111",
                "Ceylin",
                "Kucuk",
                LocalDate.of(2005, 7, 30),
                Gender.FEMALE,
                "240504021@st.atlas.edu.tr",
                "05551112233",
                "Sisli, Istanbul",
                seProgram,
                2024,
                2,
                StudentStatus.ACTIVE,
                "https://sis.atlas.edu.tr/photos/240504021.jpg",
                OffsetDateTime.now()
        );

        studentList.add(student1);

        // 7. Print registered students to the console
        System.out.println("=== REGISTERED STUDENT LIST ===");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}