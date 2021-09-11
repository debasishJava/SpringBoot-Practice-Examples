package deb.lip.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student_02")
public class Student_02 {
	
	@Id
	private Integer stdId;
	private String stdName;
	private String subject;
	private Double fee;
}
