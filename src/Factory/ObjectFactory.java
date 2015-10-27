package Factory;

import java.util.HashMap;

public class ObjectFactory {
	
	
	private static HashMap<Long, String> ObjectMap = new HashMap<Long, String>();
	private static HashMap<Long, String> reportMap = new HashMap<Long, String>();
	
	public static String getObjectID()
	{
		long threadId = Thread.currentThread().getId();
		if(!ObjectMap.containsKey(threadId))
		{
			ObjectMap.put(threadId, "Obj_" + threadId);
		}
		return ObjectMap.get(threadId);
	}
	
	public static String getReporter()
	{
		long threadId = Thread.currentThread().getId();
		if(!reportMap.containsKey(threadId))
		{
			reportMap.put(threadId, "Reporter_" + threadId);
		}
		return reportMap.get(threadId);
	}

}
