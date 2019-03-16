package cn.ac.iie.stu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class StudentReportApplication {
    public static void main(String[] args){
        SpringApplication.run(StudentReportApplication.class, args);
    }
}
