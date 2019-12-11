package exam;

import java.util.List;

public interface Ex9i {
	public boolean addCity(Ex9city city);
	public Ex9city getCity(int id);
	public List<Ex9city> getAllCities();
	public boolean updateCity(Ex9city city);
	public void deleteCity(int id);
}