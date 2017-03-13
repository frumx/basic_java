package SQL;

import java.lang.reflect.Field;
import java.util.HashMap;

public class Connector {

	public static String generateCreateTableSQL(Class c){
		
		HashMap<String, String> typeSQL = new HashMap<String, String>();
		typeSQL.put("String", "TEXT");		
		String sql="CREATE TABLE ";
		sql+=c.getSimpleName();
		sql+="(";
		Field[] fields=c.getDeclaredFields();
		System.out.println(fields.length);
		for(int i=0; i<fields.length; i++){
			Field f=fields[i];
			sql+=f.getName();
			sql+=" "+f.getType().getSimpleName();			
			if(i!=fields.length-1)
			sql+=", ";
		}
	sql+=")";
	return sql;	
	}	
}
