package com.test.question.obj;

public class Employee {
	private String name;
	private String department;
	private String position;
	private String tel;
	private Employee boss;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()<2 || name.length()>5) {
			return;
		}
		for(int i=0; i<name.length(); i++) {
			char cha = name.charAt(i);
			if(cha<'가' || cha>'힣') {
				return;
			}
		}
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		if(this.department == "영업부" || "기획부" || "총무부" || "개발부" || "홍보부") {
			return;
		}
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Employee getBoss() {
		return boss;
	}
	public void setBoss(Employee boss) {
		this.boss = boss;
	}


	String tmp ="";
	public void info() {
		tmp += "[" + name + "]\r\n";
		tmp += "- 부서: " + department + "\r\n";
		tmp += "- 직위: "	 + position + "\r\n";
		tmp += "- 연락처: " + tel + "\r\n";
		
		System.out.println(tmp);
		
		
	}
	
	

}
