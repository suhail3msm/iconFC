package model;

import java.util.Date;

public class Client {
	private String NAME;           
	private String ADDRESS;         
	private String CITY;            
	private String STATE;           
	private String PROVINCE;        
	private String COUNTRY;         
	private String EMAIL;           
	private long MOBILE;          
	private String LOAN_ACC_NUM;    
	private String BANK_CODE;       
	private String CLIENT_LIMIT;    
	private String VALID_FROM;
	private String VALID_TO;  
	private String RATE_OF_INTEREST;
	private String CREDIT_PERIOD;
	public Client(){}
	public Client(String nAME, String aDDRESS, String cITY, String sTATE, String pROVINCE, String cOUNTRY, String eMAIL,
			long mOBILE, String lOAN_ACC_NUM, String bANK_CODE, String cLIENT_LIMIT, String vALID_FROM, String vALID_TO,
			String rATE_OF_INTEREST, String cREDIT_PERIOD) {
		super();
		NAME = nAME;
		ADDRESS = aDDRESS;
		CITY = cITY;
		STATE = sTATE;
		PROVINCE = pROVINCE;
		COUNTRY = cOUNTRY;
		EMAIL = eMAIL;
		MOBILE = mOBILE;
		LOAN_ACC_NUM = lOAN_ACC_NUM;
		BANK_CODE = bANK_CODE;
		CLIENT_LIMIT = cLIENT_LIMIT;
		VALID_FROM = vALID_FROM;
		VALID_TO = vALID_TO;
		RATE_OF_INTEREST = rATE_OF_INTEREST;
		CREDIT_PERIOD = cREDIT_PERIOD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public String getCITY() {
		return CITY;
	}
	public void setCITY(String cITY) {
		CITY = cITY;
	}
	public String getSTATE() {
		return STATE;
	}
	public void setSTATE(String sTATE) {
		STATE = sTATE;
	}
	public String getPROVINCE() {
		return PROVINCE;
	}
	public void setPROVINCE(String pROVINCE) {
		PROVINCE = pROVINCE;
	}
	public String getCOUNTRY() {
		return COUNTRY;
	}
	public void setCOUNTRY(String cOUNTRY) {
		COUNTRY = cOUNTRY;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public long getMOBILE() {
		return MOBILE;
	}
	public void setMOBILE(long mOBILE) {
		MOBILE = mOBILE;
	}
	public String getLOAN_ACC_NUM() {
		return LOAN_ACC_NUM;
	}
	public void setLOAN_ACC_NUM(String lOAN_ACC_NUM) {
		LOAN_ACC_NUM = lOAN_ACC_NUM;
	}
	public String getBANK_CODE() {
		return BANK_CODE;
	}
	public void setBANK_CODE(String bANK_CODE) {
		BANK_CODE = bANK_CODE;
	}
	public String getCLIENT_LIMIT() {
		return CLIENT_LIMIT;
	}
	public void setCLIENT_LIMIT(String cLIENT_LIMIT) {
		CLIENT_LIMIT = cLIENT_LIMIT;
	}
	public String getVALID_FROM() {
		return VALID_FROM;
	}
	public void setVALID_FROM(String vALID_FROM) {
		VALID_FROM = vALID_FROM;
	}
	public String getVALID_TO() {
		return VALID_TO;
	}
	public void setVALID_TO(String vALID_TO) {
		VALID_TO = vALID_TO;
	}
	public String getRATE_OF_INTEREST() {
		return RATE_OF_INTEREST;
	}
	public void setRATE_OF_INTEREST(String rATE_OF_INTEREST) {
		RATE_OF_INTEREST = rATE_OF_INTEREST;
	}
	public String getCREDIT_PERIOD() {
		return CREDIT_PERIOD;
	}
	public void setCREDIT_PERIOD(String cREDIT_PERIOD) {
		CREDIT_PERIOD = cREDIT_PERIOD;
	}
	
	
	
}



