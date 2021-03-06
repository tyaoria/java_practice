package java_practice;

import java.util.ArrayList;
import java.util.List;

public class ContractorVOConverter {

	/**
	 * テキストデータをContractorVO型へ変換する
	 * @return ContractorVO
	 */
	public static ContractorVO convertTextToContractorVO(String lineData) {
		// 1行のデータをオブジェクトへ変換する
		ContractorVO contractorData = createContractorData(lineData);
		// 作成した契約者情報を返却する
		return contractorData;

	}

	/**
	 * テキストデータをContractorVO型へ変換する(List)
	 * @return ContractorVOのList
	 */
	public static List<ContractorVO> convertTextToContractorVO(List<String> textData) {
		// 返却用オブジェクト
		List<ContractorVO> contractorData = new ArrayList<ContractorVO>();
		// テキストデータを1行ずつ取得する
		for (String lineData : textData) {
			// 1行のデータをオブジェクトへ変換する
			contractorData.add(createContractorData(lineData));
		}
		// 作成した契約者情報を返却する
		return contractorData;

	}

	/**
	 * テキストデータを契約者情報に変換する
	 * @param lineData
	 * @return 契約者情報VO
	 */
	private static ContractorVO createContractorData(String lineData) {
		ContractorVO contractor = new ContractorVO();
		String[] csvData = lineData.split(",");
		// 契約者通番
		contractor.setContractorSeq(csvData[0]);
		// 氏名
		contractor.setFullName(csvData[1]);
		// 氏名(カナ)
		contractor.setKanaName(csvData[2]);
		// システム登録日
		contractor.setSystemRegistrationDate(csvData[3]);
		// 削除済みフラグ
		contractor.setDeleteFlag(csvData[4]);
		// 最終更新日付
		contractor.setLastUpdateDate(csvData[5]);
		// 作成した契約者情報を返却
		return contractor;
	}
}
