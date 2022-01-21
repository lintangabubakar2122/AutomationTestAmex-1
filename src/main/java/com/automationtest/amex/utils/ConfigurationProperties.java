package com.automationtest.amex.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.txt")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${myusername}")
	private String userName;
	
	@Value("${password}")
	private String password;
	
//	@Value("${displayname}")
//	private String displayName;
	
	//=================FUNGSI SEARCH AREA=================\\
			@Value("${txtnomer}")
			private String txtNomer;
			@Value("${txtArea}")
			private String txtArea;
			@Value("${txtmerchan}")
			private String txtMerchan;
			@Value("${txtalamat}")
			private String txtAlamat;
			@Value("${txtofficer}")
			private String txtOfficer;
			@Value("${txtfilterbekasi}")
			private String txtfilterBEKASI;
			@Value("${txtfilterallarea}")
			private String txtfilterALLAREA;
			@Value("${txtkontrol}")
			private String txtKontrol;
			@Value("${txtreject}")
			private String txtReject;
			@Value("${txtretrune}")
			private String txtRetrune;

		//PEmbatas

	public String getBrowser() {
		return browser;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

//	public String getDisplayName() {
//		return displayName;
//	}
	
	//=================VALIDASI PAGE=================\\
	
			public String getTxtNomerData() {
				return txtNomer;
			}	
			public String getTxtJAKARTA() {
				return txtArea;
			}
			public String getTxtMerchan() {
				return txtMerchan;
			}
			public String getTxtAlamat() {
				return txtAlamat;
			}
			public String getTxtOfficer() {
				return txtOfficer;
			}
			public String getTxtFilterBEKASI() {
				return txtfilterBEKASI;
			}
			public String getTxtFilterAllArea() {
				return txtfilterALLAREA;
			}
			public String getTxtKontrol() {
				return txtKontrol;
			}
			public String getTxtreject() {
				return txtReject;
			}
			public String getTxtretrune() {
				return txtRetrune;
			}
}

