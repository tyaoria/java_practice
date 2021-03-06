package java_practice;

public class ApprovalVOConverter {

	/**
	 * ApprovalVO型をテキストデータへ変換する
	 * @return ContractorVO
	 */
	public static String convertApprovalVOToText(ApprovalVO approvalVO) {
		// 返却する文字列を作成
		StringBuilder textDataBuilder = new StringBuilder();
		// 契約者情報
		textDataBuilder.append(approvalVO.getContractorSeq());
		// カンマ
		textDataBuilder.append(",");
		// 承認日付
		textDataBuilder.append(approvalVO.getApprovalDate());
		// カンマ
		textDataBuilder.append(",");
		// 承認フラグ
		textDataBuilder.append(approvalVO.getApprovalFlg());
		// 作成した文字列を返却
		return textDataBuilder.toString();

	}
}
