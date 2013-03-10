package org.django4j.api;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;

import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;

public class DjangoResponse implements IResponse {
	private final ServletResponse reponse;
	private ServletOutputStream outStream;
	private final String charsetName;

	public DjangoResponse(ServletResponse servletResponse, String charset) {
		reponse = servletResponse;
		try {
			outStream = reponse.getOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		charsetName = charset;
	}

	@Override
	public void write(String str) {
		try {
			outStream.write(str.getBytes(charsetName));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String content() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void status(int status) {
		// TODO Auto-generated method stub

	}

	@Override
	public int status() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String contentType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void contentType(String contentType) {
		reponse.setContentType(contentType);
	}

	@Override
	public void setHeader(String header, String value) {

	}

	@Override
	public void delHeader(String header) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getHeader(String header) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasHeader(String header) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setCookie(String key, String value, int maxAge, Date expires,
			String path, String domain, boolean secure, boolean httponly) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSignedCookie(String key, String value, String salt,
			int maxAge, Date expires, String path, String domain,
			boolean secure, boolean httponly) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCookie(String key, String path, String domain) {
		// TODO Auto-generated method stub

	}

	@Override
	public void flush() {
		try {
			outStream.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void tell() {
		// TODO Auto-generated method stub

	}

}
