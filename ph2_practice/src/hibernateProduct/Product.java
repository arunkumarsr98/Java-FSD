package hibernateProduct;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity

	@Table(name="Product")
	public class Product {
		
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int product_id;
		
		@Column(name="name", nullable=false, unique=true)
		private String product_name;
		
		@Column(name="stocks", nullable=false)
		private int stocks;
		
		public int getProduct_id() {
			return product_id;
		}
		public void setProduct_id(int product_id) {
			this.product_id = product_id;
		}
		public String getProduct_name() {
			return product_name;
		}
		public void setProduct_name(String product_name) {
			this.product_name = product_name;
		}
		public int getStocks() {
			return stocks;
		}
		public void setStocks(int stocks) {
			this.stocks = stocks;
		}
		
		
	}


