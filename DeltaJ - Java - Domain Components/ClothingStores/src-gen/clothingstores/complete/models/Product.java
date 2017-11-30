package clothingstores.complete.models;

import java.util.List;
import java.util.ArrayList;
/*** added by dProduct
 */
public class Product {
	private String id;
	private String title;
	private String price;
	private String image;
	private String desc;
	public static List<Product> products = new ArrayList<Product>() {
		{
			add(new Product("102", "Super Shoes M1", "99",
					"http://www.danielgara.com/frag_images/img1.jpg", ""));
			add(new Product("120", "Super Shoes k7", "69",
					"http://www.danielgara.com/frag_images/img2.jpg", ""));
			add(new Product("103", "Super Shoes M1", "89",
					"http://www.danielgara.com/frag_images/img3.jpg", ""));
			add(new Product("104", "Super Shoes MT", "99",
					"http://www.danielgara.com/frag_images/img4.jpg", ""));
			add(new Product("105", "Super Shoes M3", "99",
					"http://www.danielgara.com/frag_images/img5.jpg", ""));
			add(new Product("106", "Super Shoes K1", "69",
					"http://www.danielgara.com/frag_images/img6.jpg", ""));
			add(new Product("107", "Super Shoes M8", "79",
					"http://www.danielgara.com/frag_images/img7.jpg", ""));
			add(new Product("108", "Super Shoes J1", "99",
					"http://www.danielgara.com/frag_images/img8.jpg", ""));
		}
	};
	public Product(String id, String t, String p, String i, String d) {
		this.id = id;
		this.title = t;
		this.price = p;
		this.image = i;
		this.desc = d;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public static List<Product> get_all() {
		return products;
	}
}