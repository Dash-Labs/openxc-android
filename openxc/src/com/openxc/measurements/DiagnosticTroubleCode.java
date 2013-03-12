package com.openxc.measurements;

import com.openxc.units.*;

/**
 * User: blangel
 * Date: 3/11/13
 * Time: 4:13 PM
 */
public class DiagnosticTroubleCode extends BaseMeasurement<Code> {

    public final static String ID = "diagnostic_trouble_code";

    public DiagnosticTroubleCode(String dtc) {
        this(new Code(dtc));
    }

    public DiagnosticTroubleCode(Code value) {
        super(value);
    }

    @Override
    public String getGenericName() {
        return ID;
    }

}
