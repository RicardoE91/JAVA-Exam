package exam;

public class Ex9city {
	private int city_id;
	private String description;
	private Ex9state ex9State;
	
	public Ex9city() {}

	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Ex9state getEx9State() {
		return ex9State;
	}
	public void setEx9State(Ex9state ex9State) {
		this.ex9State = ex9State;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + city_id;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((ex9State == null) ? 0 : ex9State.hashCode());
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
		Ex9city other = (Ex9city) obj;
		if (city_id != other.city_id)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (ex9State == null) {
			if (other.ex9State != null)
				return false;
		} else if (!ex9State.equals(other.ex9State))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ex9city [city_id=" + city_id + ", description=" + description + ", ex9State=" + ex9State + "]";
	}
}
