package com.One2Many;

import java.util.List;

public class Artist {

	private Integer aid;
	private String aname;
	private List Child;
	public Integer getAid() {
		return aid;
	}
	
	public List getChild() {
		return Child;
	}

	public void setChild(List child) {
		Child = child;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
}
