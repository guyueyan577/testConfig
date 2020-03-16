package com.example.testConfig.db.mybatis.model.enumtype;

public enum FileUrlTypeEnum {
	
	/**
	 * 视频
	 */
	VIDEO(1),
	
	/**
	 * 音频
	 */
	VOICE(2),
	
	/**
	 * 图片
	 */
	IMG(3),
	
	/**
	 * pdf
	 */
	PDF(4);

	private final int fileUrlType;
	
	FileUrlTypeEnum(int fileUrlType){
		this.fileUrlType = fileUrlType;
	}

	public int getFileUrlType() {
		return fileUrlType;
	}
}
