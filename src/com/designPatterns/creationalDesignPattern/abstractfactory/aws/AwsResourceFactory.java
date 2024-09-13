package com.designPatterns.creationalDesignPattern.abstractfactory.aws;

import com.designPatterns.creationalDesignPattern.abstractfactory.Instance;
import com.designPatterns.creationalDesignPattern.abstractfactory.ResourceFactory;
import com.designPatterns.creationalDesignPattern.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Instance.Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
