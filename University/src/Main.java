import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        //TODO: В университете есть несколько факультетов, в которых учатся студенты, объединенные в группы.
        // У каждого студента есть несколько учебных предметов по которым он получает оценки.
        // Необходимо реализовать иерархию студентов, групп и факультетов.
        //
        //Посчитать средний балл по всем предметам студента
        //Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
        //Посчитать средний балл по предмету для всего университета
        //Релизовать следующие исключения:
        //
        //Оценка ниже 0 или выше 10
        //Отсутсвие предметов у студента (должен быть хотя бы один)
        //Отсутствие студентов в группе
        //Отсутствие групп на факультете
        //Отсутствие факультетов в университете

      List<Student> students = new ArrayList<>();

      students.add( new Student(FacultyName.BIO, 0001, "Vasya1", new HashMap<Course,
               int[]>(){{
           put(Course.MATH, new int [] {4,5});

           put(Course.CHEMISTRY, new int[]{3,3,3});
       }}
       ));


        students.add( new Student(FacultyName.BIO, 0001, "Vasya2", new HashMap<Course,
                int[]>(){{
            put(Course.MATH, new int [] {5,5});
            put(Course.CHEMISTRY, new int[]{5,5,5});
            put(Course.BIOLOGY, new int[]{5,5,5});
        }}
        ));


        students.add( new Student(FacultyName.PHY, 0002, "Vasya4", new HashMap<Course,
                int[]>(){{
            put(Course.MATH, new int [] {2,3});
            put(Course.PHYSICS, new int[]{2,2,2});
        }}
        ));

        students.add( new Student(FacultyName.PHY, 0003, "Vasya5", new HashMap<Course,
                int[]>(){{
            put(Course.MATH, new int [] {4,4});
            put(Course.PHYSICS, new int[]{2,4,2,5});
        }}
        ));

        students.add( new Student(FacultyName.PHY, 0003, "Vasya6", new HashMap<Course,
                int[]>(){{
            put(Course.MATH, new int [] {4,4,3,3});
           put(Course.PHYSICS, new int[]{2,4,2});
        }}
        ));


// Обработка исключений (можно так же сделать через isEmpty)

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMarks().values().size()<1) {
                throw new Exception("У студента " + students.get(i).getName() + " должен быть хотя бы 1 предмет!");
            }
            }


        for (int i = 0; i < students.size(); i++) {

      System.out.println(students.get(i).getMarks().get(Course.BIOLOGY));

        }


    }
    }


