import java.util.ArrayList;

public class Logistics {
 private ArrayList<Result> result = null;
 private int errorCd = 0;
 private ArrayList<Tracking> tracking = null;
 private ArrayList<User> user = null;
public Logistics(ArrayList<Result> result, int errorCd, ArrayList<Tracking> tracking, ArrayList<User> user) {
	super();
	this.result = result;
	this.errorCd = errorCd;
	this.tracking = tracking;
	this.user = user;
}
public ArrayList<Result> getResult() {
	return result;
}
public void setResult(ArrayList<Result> result) {
	this.result = result;
}
public int getErrorCd() {
	return errorCd;
}
public void setErrorCd(int errorCd) {
	this.errorCd = errorCd;
}
public ArrayList<Tracking> getTracking() {
	return tracking;
}
public void setTracking(ArrayList<Tracking> tracking) {
	this.tracking = tracking;
}
public ArrayList<User> getUser() {
	return user;
}
public void setUser(ArrayList<User> user) {
	this.user = user;
}
 
 
 
 
}
