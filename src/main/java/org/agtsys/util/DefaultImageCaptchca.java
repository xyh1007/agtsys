package org.agtsys.util;

import java.io.OutputStream;

import com.github.bingoohuang.patchca.utils.encoder.EncoderHelper;

public class DefaultImageCaptchca implements ImageCaptchca {
	protected String imagetype = "png";
	protected DefaultPatchcaService dps = new DefaultPatchcaService();
	@Override
	public String generate_captchca(OutputStream os) throws Exception {
		// TODO Auto-generated method stub
		return EncoderHelper.getChallangeAndWriteImage(dps,imagetype,os);
	}

	@Override
	public void setImageType(String type) {
		// TODO Auto-generated method stub
		this.imagetype = type;
	}
	public void setDps(DefaultPatchcaService dps){
		this.dps = dps;
	}
}
