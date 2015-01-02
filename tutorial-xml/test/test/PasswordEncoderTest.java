/**
 * Copyright(c) http://www.open-v.com
 */
package test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * <pre>
 * ������������ơ�
 * </pre>
 * @author http://www.open-v.com
 * @version 1.00.00
 * <pre>
 * �޸ļ�¼
 *    �޸ĺ�汾:     �޸��ˣ�  �޸�����:     �޸�����: 
 * </pre>
 */
public class PasswordEncoderTest {

	private static final Log log = LogFactory.getLog(PasswordEncoderTest.class);
	
	public static void main(String[] args) {
		PasswordEncoder pe = new BCryptPasswordEncoder();
		log.info(pe.encode("koala"));
	}

}
