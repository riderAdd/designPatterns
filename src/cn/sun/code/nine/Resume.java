package cn.sun.code.nine;

/**
 * 简历
 */
public class Resume {

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 性别
	 */
	private String sex;

	/**
	 * 级别
	 */
	private String level;

	/**
	 * 公司
	 */
	private String company;

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

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void display() {
		System.out.println(name + "  " + sex + "  ");
		System.out.println("工作经历： " + company + "  " + level);
	}

	// 客户端代码
	public static void main(String[] args) {
		Resume a = new Resume();
		a.setName("卡卡西");
		a.setSex("男");
		a.setCompany("木叶");
		a.setLevel("上忍");

		Resume b = new Resume();
		b.setName("卡卡西");
		b.setSex("男");
		b.setCompany("木叶");
		b.setLevel("上忍");

		Resume c = new Resume();
		c.setName("卡卡西");
		c.setSex("男");
		c.setCompany("木叶");
		c.setLevel("上忍");

		a.display();
		b.display();
		c.display();
	}

}
