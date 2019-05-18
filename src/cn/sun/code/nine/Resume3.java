package cn.sun.code.nine;

/**
 * 简历类深复制
 */

/**
 * 工作经历
 */
class WorkExperience implements Cloneable {

	/**
	 * 时间
	 */
	private String time;

	/**
	 * 单位
	 */
	private String company;

	public WorkExperience(String time, String company) {
		this.time = time;
		this.company = company;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "WorkExperience{" +
				"time='" + time + '\'' +
				", company='" + company + '\'' +
				'}';
	}

}

public class Resume3 implements Cloneable {

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 性别
	 */
	private String sex;

	/**
	 * 工作经历
	 */
	private WorkExperience workExperience;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public WorkExperience getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(WorkExperience workExperience) {
		this.workExperience = workExperience;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void display() {
		System.out.println(name + "  " + sex + "  ");
		System.out.println("工作经历： " + workExperience);
	}

	// 客户端代码
	public static void main(String[] args) throws CloneNotSupportedException {
		Resume3 a = new Resume3();
		a.setName("卡卡西");
		a.setSex("男");
		WorkExperience workExperience = new WorkExperience("初期", "忍者学校");
		a.setWorkExperience(workExperience);

		Resume3 b = (Resume3) a.clone();
		WorkExperience workExperienceb = (WorkExperience) workExperience.clone();
		workExperienceb.setTime("中期");
		workExperienceb.setCompany("四代直属暗部");
		b.setWorkExperience(workExperienceb);

		a.display();
		b.display();

	}

}
