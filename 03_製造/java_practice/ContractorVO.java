package java_practice;

public class ContractorVO {

	/** 契約者通番 */
	private String contractorSeq;
	/** 氏名 */
	private String fullName;
	/** 氏名(カナ) */
	private String kanaName;
	/** システム登録日 */
	private String SystemRegistrationDate;
	/** 削除済みフラグ */
	private String DeleteFlag;
	/** 最終更新日付 */
	private String lastUpdateDate;

	/** 契約者通番取得 */
	public String getContractorSeq() {
		return contractorSeq;
	}

	/** 契約者通番設定 */
	public void setContractorSeq(String contractorSeq) {
		this.contractorSeq = contractorSeq;
	}

	/** 氏名取得 */
	public String getFullName() {
		return fullName;
	}

	/** 氏名設定 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/** 氏名(カナ)取得 */
	public String getKanaName() {
		return kanaName;
	}

	/** 氏名(カナ)設定 */
	public void setKanaName(String kanaName) {
		this.kanaName = kanaName;
	}

	/** システム登録日取得 */
	public String getSystemRegistrationDate() {
		return SystemRegistrationDate;
	}

	/** システム登録日設定 */
	public void setSystemRegistrationDate(String systemRegistrationDate) {
		SystemRegistrationDate = systemRegistrationDate;
	}

	/** 削除済みフラグ取得 */
	public String getDeleteFlag() {
		return DeleteFlag;
	}

	/** 削除済みフラグ設定 */
	public void setDeleteFlag(String deleteFlag) {
		DeleteFlag = deleteFlag;
	}

	/** 最終更新日付取得 */
	public String getLastUpdateDate() {
		return lastUpdateDate;
	}

	/** 最終更新日付設定 */
	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

}
