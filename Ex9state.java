package exam;

public class Ex9state {
	private int state_id;
	private String description;
	private Ex9shipping_zone ex9Shipping_zone;
	
	public Ex9state() {}

	public int getState_id() {
		return state_id;
	}
	public void setState_id(int state_id) {
		this.state_id = state_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Ex9shipping_zone getEx9Shipping_zone() {
		return ex9Shipping_zone;
	}
	public void setEx9Shipping_zone(Ex9shipping_zone ex9Shipping_zone) {
		this.ex9Shipping_zone = ex9Shipping_zone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((ex9Shipping_zone == null) ? 0 : ex9Shipping_zone.hashCode());
		result = prime * result + state_id;
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
		Ex9state other = (Ex9state) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (ex9Shipping_zone == null) {
			if (other.ex9Shipping_zone != null)
				return false;
		} else if (!ex9Shipping_zone.equals(other.ex9Shipping_zone))
			return false;
		if (state_id != other.state_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ex9state [state_id=" + state_id + ", description=" + description + ", ex9Shipping_zone="
				+ ex9Shipping_zone + "]";
	}
}