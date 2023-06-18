import java.io.InputStream;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Project01_C {
	public static void main(String[] args) {
		String src = "info.json"; // Json 파일 내용 받아옴
		// IO -> Stream(스트림)
		InputStream is = Project01_C.class.getResourceAsStream(src);
		if(is==null) {
			throw new NullPointerException("cannot find resource file");
		}
		
		JSONTokener tokener = new JSONTokener(is); // 메모리에 올림
		JSONObject object = new JSONObject(tokener); // Object로 변경
		JSONArray students = object.getJSONArray("students"); // Array로 뽑음
		
		for(int i =0; i<students.length(); i++) {
			JSONObject student = (JSONObject)students.get(i);
			System.out.print(student.get("name")+"\t");
			System.out.print(student.get("address")+"\t");
			System.out.println(student.get("phone")+"\t");
		}
		
		System.out.println(object);
		
	}

}
