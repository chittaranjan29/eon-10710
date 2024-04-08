package onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class InstructorDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String linkedIn;
	private String youtube;
	@OneToOne
	private Instructor instructor;
	public InstructorDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InstructorDetail(String linkedIn, String youtube, Instructor instructor) {
		super();
		this.linkedIn = linkedIn;
		this.youtube = youtube;
		this.instructor = instructor;
	}
	public String getLinkedIn() {
		return linkedIn;
	}
	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}
	public String getYoutube() {
		return youtube;
	}
	public void setYoutube(String youtube) {
		this.youtube = youtube;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", linkedIn=" + linkedIn + ", youtube=" + youtube + ", instructor="
				+ instructor + "]";
	} 
	

}
