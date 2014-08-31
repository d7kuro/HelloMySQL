package hello.filter;

import org.apache.camel.Exchange;
import org.apache.camel.spi.HeaderFilterStrategy;

/**
 * HTTP戻りヘッダをフィルタリング
 */
public class AllFilter implements HeaderFilterStrategy {

	/** 戻り値フィルタ */
	@Override
	public boolean applyFilterToCamelHeaders(String headerName,
			Object headerValue, Exchange exchange) {
		return true;
	}

	/** 受信フィルタ */
	@Override
	public boolean applyFilterToExternalHeaders(String headerName,
			Object headerValue, Exchange exchange) {
		return false;
	}

}
