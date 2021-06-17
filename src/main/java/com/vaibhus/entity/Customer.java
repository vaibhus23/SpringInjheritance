package com.vaibhus.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "customer1")
//@NamedQuery(name = "Customer.getByAmount", query = "Select c from Customer c, Transaction t where t.customer = c And t.transactionamount = ?1")
public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer1_generator")
	@SequenceGenerator(name = "customer1_generator", sequenceName = "customer1_seq", allocationSize = 1)

	@Column(name = "customerid")
	private int customerId;
	
	@Column(name = "customername")
	private String customerName;
	
	@Column(name = "customeraddress")
	private String customerAddress;
	
	@Column(name = "customeremail")
	private String cutomeremail;
	
	//@JoinColumn(name="customerid")
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Transaction.class)
	private Set<Transaction> transaction = new HashSet<>();

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCutomeremail() {
		return cutomeremail;
	}

	public void setCutomeremail(String cutomeremail) {
		this.cutomeremail = cutomeremail;
	}

	public Set<Transaction> getTransaction() {
		return transaction;
	}

	public void settransaction(Set<Transaction> transaction) {
		this.transaction = transaction;
	}
	
	public void addTransaction(Transaction transaction) {
		this.transaction.add(transaction);
	}
}