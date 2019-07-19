package com.virtustream.emeastatustracker.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="customername")
	private String customername;
	
	@Column(name="gatestatus")
	private int gatestatus;
	
	@Column(name="rid")
	private String rid;
	
	@Column(name="dc1")
	private String dc1;
	
	@Column(name="dc2")
	private String dc2;
	
	@Column(name="startdate")
	private Date startdate;
	
	@Column(name="completepercent")
	private String completepercent;
	
	@Column(name="pm1")
	private String pm1;
	
	@Column(name="pm2")
	private String pm2;
	
	@Column(name="owner")
	private String owner;
	
	@Column(name="coeengineer1")
	private String coeengineer1;
	
	@Column(name="coeengineer2")
	private String coeengineer2;
	
	@Column(name="vmcount")
	private int vmcount;
	
	@Column(name="vmcompletecount")
	private int vmcompletecount;
	
	@Column(name="status")
	private String status;
	
	@Column(name="amstransition")
	private String amstransition;
	
	@Column(name="outstanding")
	private String outstanding;
	
	@Column(name="issues")
	private String issues;
	
	@Column(name="sapbasis")
	private String sapbasis;

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Customer(String customername, int gatestatus, String rid, String dc1, String dc2, Date startdate,
			String completepercent, String pm1, String pm2, String owner, String coeengineer1, String coeengineer2,
			int vmcount, int vmcompletecount, String status, String amstransition, String outstanding, String issues,
			String sapbasis) {
		this.customername = customername;
		this.gatestatus = gatestatus;
		this.rid = rid;
		this.dc1 = dc1;
		this.dc2 = dc2;
		this.startdate = startdate;
		this.completepercent = completepercent;
		this.pm1 = pm1;
		this.pm2 = pm2;
		this.owner = owner;
		this.coeengineer1 = coeengineer1;
		this.coeengineer2 = coeengineer2;
		this.vmcount = vmcount;
		this.vmcompletecount = vmcompletecount;
		this.status = status;
		this.amstransition = amstransition;
		this.outstanding = outstanding;
		this.issues = issues;
		this.sapbasis = sapbasis;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getGatestatus() {
		return gatestatus;
	}

	public void setGatestatus(int gatestatus) {
		this.gatestatus = gatestatus;
	}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getDc1() {
		return dc1;
	}

	public void setDc1(String dc1) {
		this.dc1 = dc1;
	}

	public String getDc2() {
		return dc2;
	}

	public void setDc2(String dc2) {
		this.dc2 = dc2;
	}

	public String getStartdate() {
		if (startdate == null) {
			startdate = new Date();
		}
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(startdate);
	}

	public void setStartdate(String startdate) {
		Date startdate2 = null;
		try {
			startdate2 = new SimpleDateFormat("yyyy-MM-dd").parse(startdate);
		} catch (ParseException e) {
			e.printStackTrace();
		}  
		this.startdate = startdate2;
	}

	public String getCompletepercent() {
		return completepercent;
	}

	public void setCompletepercent(String completepercent) {
		this.completepercent = completepercent;
	}

	public String getPm1() {
		return pm1;
	}

	public void setPm1(String pm1) {
		this.pm1 = pm1;
	}

	public String getPm2() {
		return pm2;
	}

	public void setPm2(String pm2) {
		this.pm2 = pm2;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getCoeengineer1() {
		return coeengineer1;
	}

	public void setCoeengineer1(String coeengineer1) {
		this.coeengineer1 = coeengineer1;
	}

	public String getCoeengineer2() {
		return coeengineer2;
	}

	public void setCoeengineer2(String coeengineer2) {
		this.coeengineer2 = coeengineer2;
	}

	public int getVmcount() {
		return vmcount;
	}

	public void setVmcount(int vmcount) {
		this.vmcount = vmcount;
	}

	public int getVmcompletecount() {
		return vmcompletecount;
	}

	public void setVmcompletecount(int vmcompletecount) {
		this.vmcompletecount = vmcompletecount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAmstransition() {
		return amstransition;
	}

	public void setAmstransition(String amstransition) {
		this.amstransition = amstransition;
	}

	public String getOutstanding() {
		return outstanding;
	}

	public void setOutstanding(String outstanding) {
		this.outstanding = outstanding;
	}

	public String getIssues() {
		return issues;
	}

	public void setIssues(String issues) {
		this.issues = issues;
	}

	public String getSapbasis() {
		return sapbasis;
	}

	public void setSapbasis(String sapbasis) {
		this.sapbasis = sapbasis;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", customername=" + customername + ", gatestatus=" + gatestatus + ", rid=" + rid
				+ ", dc1=" + dc1 + ", dc2=" + dc2 + ", startdate=" + startdate + ", completepercent=" + completepercent
				+ ", pm1=" + pm1 + ", pm2=" + pm2 + ", owner=" + owner + ", coeengineer1=" + coeengineer1
				+ ", coeengineer2=" + coeengineer2 + ", vmcount=" + vmcount + ", vmcompletecount=" + vmcompletecount
				+ ", status=" + status + ", amstransition=" + amstransition + ", outstanding=" + outstanding
				+ ", issues=" + issues + ", sapbasis=" + sapbasis + "]";
	} 
	
	

}
