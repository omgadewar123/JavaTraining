package com.practice;

public class JavaTraining {
	private String pen;
	
	private String 	book;
	
	private String laptop;
	
	private String bag;
	
	

	public String getPen() {
		return pen;
	}

	public void setPen(String pen) {
		this.pen = pen;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getLaptop() {
		return laptop;
	}

	public void setLaptop(String laptop) {
		this.laptop = laptop;
	}

	public String getBag() {
		return bag;
	}

	public void setBag(String bag) {
		this.bag = bag;
	}
	
	public static void main(String[] args) {
		
		JavaTraining jt = new JavaTraining();
		
		jt.setBag("fancy");
		jt.setBook("javaBook");
		jt.setLaptop("hp");
		jt.setPen("yash");
		
		System.out.println("Bag:"+jt.getBag());
		
		System.out.println("Book: "+jt.getBook());
		
		System.out.println("Laptop: "+jt.getLaptop());
		
		System.out.println("Pen: "+jt.getPen());
		
	}
	
	

	
}
