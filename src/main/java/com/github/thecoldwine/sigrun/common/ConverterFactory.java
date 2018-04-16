package com.github.thecoldwine.sigrun.common;

import com.github.thecoldwine.sigrun.converters.IBM360Converter;
import com.github.thecoldwine.sigrun.converters.IEEEConverter;
import com.github.thecoldwine.sigrun.converters.SeismicValuesConverter;

/**
 * Created by maksenov on 16/01/15.
 */
public class ConverterFactory {
    public static SeismicValuesConverter getConverter(DataSample sample) {
        switch (sample) {
            case IBM_FP:
                return new IBM360Converter();
            case IEEE_FP:
                return new IEEEConverter();
            default:
                throw new UnsupportedOperationException("Converter is not implemented yet");
        }
    }
}
