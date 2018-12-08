package tk.spop.normalization.core;

public @interface NormalizedBy {

	Class<? extends PropertyNormalizer<?>> value();
}
