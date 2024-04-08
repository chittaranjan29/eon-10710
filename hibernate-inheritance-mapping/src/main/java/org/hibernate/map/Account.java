package org.hibernate.map;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String owner;
	private double balance;
	private double interestRate;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String owner, double balance, double interestRate) {
		super();
		this.owner = owner;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", owner=" + owner + ", balance=" + balance + ", interestRate=" + interestRate
				+ "]";
	}
	
	
	
}
