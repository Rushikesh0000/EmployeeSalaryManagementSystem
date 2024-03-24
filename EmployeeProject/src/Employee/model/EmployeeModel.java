package Employee.model;

import java.util.Date;

public class EmployeeModel
{
	private int eid;
	private String ename;
	private int contact;
	private String email;
	private String gender;
	private String adress;
	private String username;
	private String password;
	private int pid;

	public EmployeeModel()
	{

	}

	public EmployeeModel(int eid,String ename, int contact, String email, String gender, String adress, String username,String password,int pid) 
	{

		this.eid=eid;
		this.ename = ename;
		this.contact = contact;
		this.email = email;
		this.gender = gender;
		this.adress = adress;
		this.username = username;
		this.password = password;
		this.pid=pid;
	}

	
	public int getEid() 
	{
		return eid;
	}

	public void setEid(int eid)
	{
		this.eid = eid;
	}
	
	public String getEname() 
	{
		return ename;
	}

	public void setEname(String ename)
	{
		this.ename = ename;
	}

	public int getContact()
	{
		return contact;
	}

	public void setContact(int contact)
	{
		this.contact = contact;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public String getAdress() 
	{
		return adress;
	}

	public void setAdress(String adress) 
	{
		this.adress = adress;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public int getPid()
	{
		return pid;
	}

	public void setPid(int pid)
	{
		this.pid = pid;
	}

	
//	public String toString() 
//	{
//		return "EmployeeModel [eid=" + eid + ", ename=" + ename + ", contact=" + contact + ", email=" + email
//				+ ", gender=" + gender + ", adress=" + adress + ", username=" + username + ", password=" + password
//				+ "]";
//	}

}
