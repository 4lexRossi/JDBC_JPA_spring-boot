package part3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QueriesExecution {

    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();

        // =========================== 1 - Consulta =================================================
        // List<Student> students = studentDAO.list();

        // students.stream().forEach(System.out::println);


        // ======================= 1.1 - Consulta com filtro ========================================
        // Student studentToConsult = studentDAO.getById(6);

        // System.out.println(studentToConsult);


        // =========================== 2 - Inserção =================================================
        // Student studentToInsert = new Student(
        //         "Elis",
        //         32,
        //         "SP"
        // );

        // studentDAO.create(studentToInsert);


        // // =========================== 3 - Delete ===================================================
        // studentDAO.delete(4);


        // // =========================== 4 - Atualizar ================================================
        // Student studentToUpdate = studentDAO.getById(3);
        // studentToUpdate.setName("Joaquim");
        // studentToUpdate.setAge(18);
        // studentToUpdate.setState("RS");

        // studentDAO.update(studentToUpdate);
    }

}


