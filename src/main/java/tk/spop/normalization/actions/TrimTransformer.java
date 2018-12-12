package tk.spop.normalization.actions;

import tk.spop.normalization.core.Transformer;

public class TrimTransformer implements Transformer<String> {

    public String transform(String property) {
        return property == null ? null : property.trim();
    }

}
