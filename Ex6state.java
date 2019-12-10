package exam;

import java.io.Serializable;

public class Ex6state implements Serializable{

	private static final long serialVersionUID = 1L;
	private int state_id;
	private String description;
	private String shipping_zone_id;
	
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
	public String getShipping_zone_id() {
		return shipping_zone_id;
	}
	public void setShipping_zone_id(String shipping_zone_id) {
		this.shipping_zone_id = shipping_zone_id;
	}
}