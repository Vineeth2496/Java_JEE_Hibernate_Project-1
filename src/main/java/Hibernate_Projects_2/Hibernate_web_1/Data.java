package Hibernate_Projects_2.Hibernate_web_1;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.stereotype.Component;

@Component
public class Data {
	private Integer id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String stdcode;
	private String phoneno;
	private String gender;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String Email) {
		this.email = Email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStdcode() {
		return stdcode;
	}
	public void setStdcode(String stdcode) {
		this.stdcode = stdcode;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Data [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", stdcode=" + stdcode + ", phoneno=" + phoneno + ", gender=" + gender
				+ "]";
	}
	
	
	
	
}
