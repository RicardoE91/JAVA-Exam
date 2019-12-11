package exam;

public class Ex9shipping_zone {
	private String shipping_zone_id;
	private String description;
	private int delivery_time;
	private double shipping_cost;
	
	public Ex9shipping_zone() {}
	
	public String getShipping_zone_id() {
		return shipping_zone_id;
	}
	public void setShipping_zone_id(String shipping_zone_id) {
		this.shipping_zone_id = shipping_zone_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDelivery_time() {
		return delivery_time;
	}
	public void setDelivery_time(int delivery_time) {
		this.delivery_time = delivery_time;
	}
	public double getShipping_cost() {
		return shipping_cost;
	}
	public void setShipping_cost(double shipping_cost) {
		this.shipping_cost = shipping_cost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + delivery_time;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		long temp;
		temp = Double.doubleToLongBits(shipping_cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((shipping_zone_id == null) ? 0 : shipping_zone_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ex9shipping_zone other = (Ex9shipping_zone) obj;
		if (delivery_time != other.delivery_time)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (Double.doubleToLongBits(shipping_cost) != Double.doubleToLongBits(other.shipping_cost))
			return false;
		if (shipping_zone_id == null) {
			if (other.shipping_zone_id != null)
				return false;
		} else if (!shipping_zone_id.equals(other.shipping_zone_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ex9shipping_zone [shipping_zone_id=" + shipping_zone_id + ", description=" + description
				+ ", delivery_time=" + delivery_time + ", shipping_cost=" + shipping_cost + "]";
	}
}