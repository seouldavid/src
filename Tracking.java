
public class Tracking {
	private String EMP_TEL;
	private String privateBRNSHP_NM;
	private int BRNSHP_CD;
	private int SCAN_YMD;;
	private int SCAN_TME;
	private String STATUS;
	private String GODS_STAT_NM;
	private int GODS_STAT_CD;
	private String BRNSHP_TEL;
	private String PTN_BRNSHP_TEL;
	private String EMP_NM;
	private String PTN_BRNSHP_NM;
	private int EMP_NO;
	private int PTN_BRNSHP_CD;
	public String getEMP_TEL() {
		return EMP_TEL;
	}
	public void setEMP_TEL(String eMP_TEL) {
		EMP_TEL = eMP_TEL;
	}
	public String getPrivateBRNSHP_NM() {
		return privateBRNSHP_NM;
	}
	public void setPrivateBRNSHP_NM(String privateBRNSHP_NM) {
		this.privateBRNSHP_NM = privateBRNSHP_NM;
	}
	public int getBRNSHP_CD() {
		return BRNSHP_CD;
	}
	public void setBRNSHP_CD(int bRNSHP_CD) {
		BRNSHP_CD = bRNSHP_CD;
	}
	public int getSCAN_YMD() {
		return SCAN_YMD;
	}
	public void setSCAN_YMD(int sCAN_YMD) {
		SCAN_YMD = sCAN_YMD;
	}
	public int getSCAN_TME() {
		return SCAN_TME;
	}
	public void setSCAN_TME(int sCAN_TME) {
		SCAN_TME = sCAN_TME;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getGODS_STAT_NM() {
		return GODS_STAT_NM;
	}
	public void setGODS_STAT_NM(String gODS_STAT_NM) {
		GODS_STAT_NM = gODS_STAT_NM;
	}
	public int getGODS_STAT_CD() {
		return GODS_STAT_CD;
	}
	public void setGODS_STAT_CD(int gODS_STAT_CD) {
		GODS_STAT_CD = gODS_STAT_CD;
	}
	public String getBRNSHP_TEL() {
		return BRNSHP_TEL;
	}
	public void setBRNSHP_TEL(String bRNSHP_TEL) {
		BRNSHP_TEL = bRNSHP_TEL;
	}
	public String getPTN_BRNSHP_TEL() {
		return PTN_BRNSHP_TEL;
	}
	public void setPTN_BRNSHP_TEL(String pTN_BRNSHP_TEL) {
		PTN_BRNSHP_TEL = pTN_BRNSHP_TEL;
	}
	public String getEMP_NM() {
		return EMP_NM;
	}
	public void setEMP_NM(String eMP_NM) {
		EMP_NM = eMP_NM;
	}
	public String getPTN_BRNSHP_NM() {
		return PTN_BRNSHP_NM;
	}
	public void setPTN_BRNSHP_NM(String pTN_BRNSHP_NM) {
		PTN_BRNSHP_NM = pTN_BRNSHP_NM;
	}
	public int getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(int eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public int getPTN_BRNSHP_CD() {
		return PTN_BRNSHP_CD;
	}
	public void setPTN_BRNSHP_CD(int pTN_BRNSHP_CD) {
		PTN_BRNSHP_CD = pTN_BRNSHP_CD;
	}
	public Tracking(String eMP_TEL, String privateBRNSHP_NM, int bRNSHP_CD, int sCAN_YMD, int sCAN_TME, String sTATUS,
			String gODS_STAT_NM, int gODS_STAT_CD, String bRNSHP_TEL, String pTN_BRNSHP_TEL, String eMP_NM,
			String pTN_BRNSHP_NM, int eMP_NO, int pTN_BRNSHP_CD) {
		super();
		EMP_TEL = eMP_TEL;
		this.privateBRNSHP_NM = privateBRNSHP_NM;
		BRNSHP_CD = bRNSHP_CD;
		SCAN_YMD = sCAN_YMD;
		SCAN_TME = sCAN_TME;
		STATUS = sTATUS;
		GODS_STAT_NM = gODS_STAT_NM;
		GODS_STAT_CD = gODS_STAT_CD;
		BRNSHP_TEL = bRNSHP_TEL;
		PTN_BRNSHP_TEL = pTN_BRNSHP_TEL;
		EMP_NM = eMP_NM;
		PTN_BRNSHP_NM = pTN_BRNSHP_NM;
		EMP_NO = eMP_NO;
		PTN_BRNSHP_CD = pTN_BRNSHP_CD;
	}
	
}
