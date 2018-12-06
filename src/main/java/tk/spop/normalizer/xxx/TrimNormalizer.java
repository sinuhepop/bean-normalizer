package tk.spop.normalizer.xxx;

import tk.spop.normalizer.core.Normalizer;

public class TrimNormalizer implements Normalizer<String> {

    public String normalize(String property) {
        return property == null ? null : property.trim();
    }

}
