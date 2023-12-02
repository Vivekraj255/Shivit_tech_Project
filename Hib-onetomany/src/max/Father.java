package max;

import java.util.List;

public class Father {
int fid;
String name;
String add;
List<Child> list;


public List<Child> getList() {
	return list;
}
public void setList(List<Child> list) {
	this.list = list;
}
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}

}
