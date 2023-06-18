import java.io.InputStream;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Project01_C {
	public static void main(String[] args) {
		String src = "info.json"; // Json ���� ���� �޾ƿ�
		// IO -> Stream(��Ʈ��)
		InputStream is = Project01_C.class.getResourceAsStream(src);
		if(is==null) {
			throw new NullPointerException("cannot find resource file");
		}
		
		JSONTokener tokener = new JSONTokener(is); // �޸𸮿� �ø�
		JSONObject object = new JSONObject(tokener); // Object�� ����
		JSONArray students = object.getJSONArray("students"); // Array�� ����
		
		for(int i =0; i<students.length(); i++) {
			JSONObject student = (JSONObject)students.get(i);
			System.out.print(student.get("name")+"\t");
			System.out.print(student.get("address")+"\t");
			System.out.println(student.get("phone")+"\t");
		}
		
		System.out.println(object);
		
	}

}
