package java_practice;

public class ApprovalVO {

	/** 契約者通番 */
	private String contractorSeq;
	/** 承認日付 */
	private String approvalDate;
	/** 承認フラグ */
	private String approvalFlg;

	/** 契約者通番取得 */
	public String getContractorSeq() {
		return contractorSeq;
	}

	/** 契約者通番設定 */
	public void setContractorSeq(String contractorSeq) {
		this.contractorSeq = contractorSeq;
	}

	/** 承認日付取得 */
	public String getApprovalDate() {
		return approvalDate;
	}

	/** 承認日付設定 */
	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
	}

	/** 承認フラグ取得 */
	public String getApprovalFlg() {
		return approvalFlg;
	}

	/** 承認フラグ設定 */
	public void setApprovalFlg(String approvalFlg) {
		this.approvalFlg = approvalFlg;
	}

}
