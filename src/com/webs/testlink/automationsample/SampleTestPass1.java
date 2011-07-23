package com.webs.testlink.automationsample;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import br.eti.kinoshita.tap4j.ext.testng.TestTAPReporter;

@Listeners(value={TestTAPReporter.class})
public class SampleTestPass1 {
	@Test
	public void PassTest(){
		assertEquals("TESTLINKSAMPLEPASS","TESTLINKSAMPLEPASS");
	}
}
