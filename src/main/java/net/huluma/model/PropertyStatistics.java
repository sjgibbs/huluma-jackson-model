package net.huluma.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PropertyStatistics
 *
 * @author Simon
 */
public class PropertyStatistics {
	private BigDecimal mean;
	private BlockStatistics[][] rows;

	public PropertyStatistics(@JsonProperty("mean") BigDecimal mean, @JsonProperty("rows")  BlockStatistics[][] rows) {
		this.mean = mean;
		this.rows = rows;
	}

	@JsonProperty
	public BigDecimal getMean() {
		return mean;
	}

	@JsonProperty
	public BlockStatistics[][] getRows() {
		return rows;
	}
}
