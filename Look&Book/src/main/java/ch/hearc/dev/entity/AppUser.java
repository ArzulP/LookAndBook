package ch.hearc.dev.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="user", uniqueConstraints = { @UniqueConstraint(name = "APP_USER_UK", columnNames = "User_Name") })
public class AppUser {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "User_Id", nullable = false)
    private Long userId;
	
	@Column(name = "User_Name", length = 36, nullable = false)
	private String userName;
	
	@Column(name = "Encrypted_Password", length = 128, nullable = false)
    private String encryptedPassword;
	
	@Column(name = "Enabled", length = 1, nullable = false)
    private boolean enabled;
	
	public AppUser() {
		
	}

	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long id) {
		this.userId = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String name) {
		this.userName = name;
	}

	public String getEncrytedPassword() {
		return encryptedPassword;
	}
	 
	public void setEncrytedPassword(String encrytedPassword) {
		this.encryptedPassword = encrytedPassword;
	}
	
	public boolean isEnabled() {
		return enabled;
	}
	 
	public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
