package net.huluma.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * ImageMetaData
 *
 * @author Simon
 */
public class ImageMetaData extends FileMetadata {

	private int width;
	private int height;
	private Map<String,PropertyStatistics> properties;
	private List<HistogramEntry>[][] huesByRow;

	public ImageMetaData(
			@JsonProperty("mimeType") String mimeType,
			@JsonProperty("bytes") int bytes,
			@JsonProperty("width") int width,
			@JsonProperty("height") int height,
			@JsonProperty("properties") Map<String,PropertyStatistics> properties,
			@JsonProperty("huesByRow")  List<HistogramEntry>[][] huesByRow
	)
	{
		super(mimeType, bytes);
		this.width = width;
		this.height = height;
		this.properties = properties;
		this.huesByRow = huesByRow;
	}

	@JsonProperty
	public int getWidth() {
		return width;
	}

	@JsonProperty
	public int getHeight() {
		return height;
	}

	@JsonProperty
	public Map<String, PropertyStatistics> getProperties() {
		return properties;
	}

	@JsonProperty
	@Deprecated /* TODO move to a comprehensive colour clustering approach */
	public List<HistogramEntry>[][] getHuesByRow() {
		return huesByRow;
	}
}
