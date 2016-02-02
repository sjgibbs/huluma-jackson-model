package net.huluma.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * BlockStatistics
 *
 * @author Simon
 */
public class BlockStatistics {

	private int width;
	private int height;
	private final BigDecimal median;
	private final BigDecimal mean;
	private final BigDecimal stdDev;

	public BlockStatistics(
			@JsonProperty("width") int width,
			@JsonProperty("height") int height,
			@JsonProperty("median") double median,
			@JsonProperty("mean") double mean,
			@JsonProperty("stdDev") double stdDev) {
		this.width = width;
		this.height = height;
		this.median = BigDecimal.valueOf(median).setScale(2, BigDecimal.ROUND_HALF_UP);
		this.mean = BigDecimal.valueOf(mean).setScale(2, BigDecimal.ROUND_HALF_UP);
		this.stdDev =   BigDecimal.valueOf(stdDev).setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public BigDecimal getMedian() {
		return median;
	}

	public BigDecimal getMean() {
		return mean;
	}

	public BigDecimal getStdDev() {
		return stdDev;
	}
}
