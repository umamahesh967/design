package com.designPatterns.creationalDesignPattern.abstractfactory.gcp;

import com.designPatterns.creationalDesignPattern.abstractfactory.Instance;
import com.designPatterns.creationalDesignPattern.abstractfactory.Instance.Capacity;
import com.designPatterns.creationalDesignPattern.abstractfactory.ResourceFactory;
import com.designPatterns.creationalDesignPattern.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
