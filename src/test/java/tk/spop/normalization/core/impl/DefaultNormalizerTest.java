package tk.spop.normalization.core.impl;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import lombok.Data;
import tk.spop.normalization.actions.Normalize;
import tk.spop.normalization.actions.Trim;
import tk.spop.normalization.core.Normalizer;

class DefaultNormalizerTest {

	private final Normalizer normalizer = DefaultNormalizer.getDefault().build();

	@Data
	public static class TestBean {

		@Trim
		private String string;

		@Normalize
		private TestBean bean;

	}

	@Test
	void test() {

		fail("Not yet implemented");
	}

}
