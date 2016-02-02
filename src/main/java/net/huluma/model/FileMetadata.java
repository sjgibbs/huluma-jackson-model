package net.huluma.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FileMetadata
 *
 * @author Simon
 */
public class FileMetadata {

	private String mimeType;
	private int bytes;

	public FileMetadata(String mimeType, int bytes) {
		this.mimeType = mimeType;
		this.bytes = bytes;
	}

	@JsonProperty
	public String getMimeType() {
		return mimeType;
	}

	@JsonProperty
	public int getBytes() {
		return bytes;
	}


}
