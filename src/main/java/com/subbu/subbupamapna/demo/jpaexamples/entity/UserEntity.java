package com.subbu.subbupamapna.demo.jpaexamples.entity;


import javax.persistence.*;  

@Entity  
@Table(name="user")  
public class UserEntity {
	
    @Id  
    private int userId;  
    
	private String userName;  
    private String phone; 
    private String email; 
    
    public UserEntity(int userId, String userName, String  phone,String email) {  
        super();  
        this.userId = userId;  
        this.userName = userName;  
        this.phone = phone;  
        this.email=email;
    }  
  
    public UserEntity() {  
        super();  
    } 
    
    public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
	public int getUserId() {
		return userId;
	}

}
