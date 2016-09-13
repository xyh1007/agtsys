package org.agtsys.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.agtsys.util.DefaultImageCaptchca;
import org.agtsys.util.DefaultPatchcaService;
import org.junit.Before;
import org.junit.Test;

public class DefaultImageCaptchcaTest {
private DefaultImageCaptchca dic;
	@Before
	public void setUp() throws Exception {
		dic = new DefaultImageCaptchca();
		DefaultPatchcaService dps = new DefaultPatchcaService();
		dps.setWidth(60);
		dps.setHeight(30);
		dic.setDps(dps);
	}

	@Test
	public void test() {
		OutputStream os;
		String cp =null;
		try{
			os=new FileOutputStream(new File("captchca.png"));
			cp = dic.generate_captchca(os);
		}catch (Exception e){
			e.printStackTrace();
		}
		System.out.println(cp);
	}

}
