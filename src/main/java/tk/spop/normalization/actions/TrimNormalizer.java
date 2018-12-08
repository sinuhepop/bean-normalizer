package tk.spop.normalization.actions;

import tk.spop.normalization.core.PropertyNormalizer;

public class TrimNormalizer implements PropertyNormalizer<String> {

    public String normalize(String property) {
        return property == null ? null : property.trim();
    }

}
