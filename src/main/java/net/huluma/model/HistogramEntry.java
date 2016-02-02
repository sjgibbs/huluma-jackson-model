package net.huluma.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * HistogramEntry
 *
 * @author Simon
 */
public class HistogramEntry {

	private int bucket;
	private BigDecimal percent;

	public HistogramEntry(@JsonProperty("bucket") int bucket, @JsonProperty("percent") BigDecimal percent) {
		this.bucket = bucket;
		this.percent = percent;
	}

	@JsonProperty("bucket")
	public int getBucket() {
		return bucket;
	}

	@JsonProperty("percent")
	public BigDecimal getPercent() {
		return percent;
	}
}
