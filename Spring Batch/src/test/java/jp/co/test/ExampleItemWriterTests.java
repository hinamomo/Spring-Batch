package jp.co.test;

import jp.co.test.ExampleItemWriter;

import junit.framework.TestCase;

public class ExampleItemWriterTests extends TestCase {

	private ExampleItemWriter writer = new ExampleItemWriter();
	
	public void testWrite() throws Exception {
		writer.write(null); // nothing bad happens
	}

}
