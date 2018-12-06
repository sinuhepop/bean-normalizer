package tk.spop.normalizer.core;

public @interface NormalizedBy {

    Class<? extends Normalizer> value();
}
