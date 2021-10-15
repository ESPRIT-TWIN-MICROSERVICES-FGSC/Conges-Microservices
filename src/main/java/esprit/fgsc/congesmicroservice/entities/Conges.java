package esprit.fgsc.congesmicroservice.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Conges {

private String employeId;
private String start_date;
private String end_date;
private String type;
public String getEmployeId() {
	return employeId;
}
public void setEmployeId(String employeId) {
	this.employeId = employeId;
}
public String getStart_date() {
	return start_date;
}
public void setStart_date(String start_date) {
	this.start_date = start_date;
}
public String getEnd_date() {
	return end_date;
}
public void setEnd_date(String end_date) {
	this.end_date = end_date;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}


}
