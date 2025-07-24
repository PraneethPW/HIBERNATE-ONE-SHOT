package in.praneeth.Entity;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity(name = "EMPLOYEE")
public class Employee {
	@Id
	@Column(name = "NAME")
	private String Name;
	@Column(name = "AGE")
	private Integer Age;
	@Column(name = "COMPANY")
	private String Company;
	@Column(name = "CITY")
	private String City;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Temporal(TemporalType.TIME)
	private Date time;
	@Temporal(TemporalType.TIMESTAMP)
	private Date timeStamps;
	
	@Lob
     @Column(name = "IMAGE", columnDefinition = "LONGBLOB")
	private byte[] CompanyImage;
	@Lob
	 @Column(name = "TEXT", columnDefinition = "BLOB")
	private char[] CompanyText;
	
	/**
	 * @return the companyImage
	 */
	public byte[] getCompanyImage() {
		return CompanyImage;
	}
	/**
	 * @param companyImage the companyImage to set
	 */
	public void setCompanyImage(byte[] companyImage) {
		CompanyImage = companyImage;
	}
	/**
	 * @return the companyText
	 */
	public char[] getCompanyText() {
		return CompanyText;
	}
	/**
	 * @param companyText the companyText to set
	 */
	public void setCompanyText(char[] companyText) {
		CompanyText = companyText;
	}
	static {
		System.out.println("ENTITY CLASS CREATED");
	}
	
	public Employee() {
		System.out.println("ENTITY OBJECT CREATED");
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Age=" + Age + ", Company=" + Company + ", City=" + City + ", date=" + date
				+ ", time=" + time + ", timeStamps=" + timeStamps + ", CompanyImage=" + Arrays.toString(CompanyImage)
				+ ", CompanyText=" + Arrays.toString(CompanyText) + "]";
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return Age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		Age = age;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return Company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		Company = company;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return City;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		City = city;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}
	/**
	 * @return the timeStamps
	 */
	public Date getTimeStamps() {
		return timeStamps;
	}
	/**
	 * @param timeStamps the timeStamps to set
	 */
	public void setTimeStamps(Date timeStamps) {
		this.timeStamps = timeStamps;
	}
	
	
   
}
