package cn.sun.code.nine;

/**
 * 简历可复制
 */
public class Resume2 implements Cloneable {

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

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void display() {
		System.out.println(name + "  " + sex + "  ");
		System.out.println("工作经历： " + company + "  " + level);
	}

	// 客户端代码
	public static void main(String[] args) throws CloneNotSupportedException {
		Resume2 a = new Resume2();
		a.setName("卡卡西");
		a.setSex("男");
		a.setCompany("木叶");
		a.setLevel("上忍");

		Resume2 b = (Resume2)a.clone();
		b.setLevel("六代目火影");
		System.out.println(a.clone().equals(a));

		a.display();
		b.display();

	}

}
