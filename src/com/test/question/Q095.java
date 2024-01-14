package com.test.question;


public class Q095 {

	public static void main(String[] args) {
		Employee e1 = new Employee();

		e1.setName("홍길동");
		e1.setDepartment("홍보부");
		e1.setPosition("부장");
		e1.setTel("010-1234-5678");
		e1.setBoss(null); // 직속 상사 없음

		e1.info();

		Employee e2 = new Employee();

		e2.setName("아무개");
		e2.setDepartment("홍보부");
		e2.setPosition("부장");
		e2.setTel("010-2541-8569");
		e2.setBoss(e1); // 직속 상사 e1(홍길동)

		e2.info();

	}

}
class Employee {
	private String name;
	private String department;
	private String position;
	private String tel;
	private Employee boss;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 2 || name.length() > 5) {
			return;
		}
		for (int i = 0; i < name.length(); i++) {
			char cha = name.charAt(i);
			if (cha < '가' || cha > '힣') {
				return;
			}
		}
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		if (department.equals("영업부") || department.equals("기획부") || department.equals("총무부") || department.equals("개발부")
				|| department.equals("홍보부")) {
			this.department = department;
		}
		return;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		if (position.equals("부장") || position.equals("과장") || position.equals("대리") || position.equals("사원")) {
			this.position = position;
		}
		return;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		for(int i=0; i<tel.length(); i++) {	//숫자 아닌값
			char cha = tel.charAt(i);
			if(cha<'0' || cha>'9') {
				return;
			}
			if(tel.indexOf("-") == 3 && tel.lastIndexOf("-")==8 && tel.length() == 13) {
				this.tel = tel;
			}else {
				return;
			}
		}
		
		
		
	}

	public Employee getBoss() {
		return boss;
	}

	public void setBoss(Employee boss) {
		if(boss == null) {
			return;
		}
		if(!this.department.equals(boss.getDepartment())) {
			return;
		}else if(this.name.equals(boss.getName())){
			return;
		}
		
		this.boss=boss;
	}

	String tmp = "";

	public void info() {
		tmp += "[" + name + "]\r\n";
		tmp += "- 부서: " + department + "\r\n";
		tmp += "- 직위: " + position + "\r\n";
		tmp += "- 연락처: " + tel + "\r\n";
		if (this.boss == null) {
			tmp += "- 직속상사 : 없음";

		} else {
			tmp += " - 직속상사: " + this.boss.getName() + "(" + this.boss.getDepartment() + " " + this.boss.getPosition()
			+ ")\r\n";
		}
		System.out.println(tmp);

	}

}

