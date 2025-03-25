package com.coffee.factory.serialization;

import java.io.Serializable;

public interface Serializer extends Serializable {
	
	public void serialize(Object object, String filePathName);
	
	public Object deSerialize(String filePathName);

}
