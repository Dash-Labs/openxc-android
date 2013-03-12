package com.openxc.units;

import com.google.common.base.Objects;

/**
 * User: blangel
 * Date: 3/11/13
 * Time: 4:09 PM
 *
 * A code type of Unit.
 *
 */
public class Code extends Unit {

    private String mValue;

    public Code(String value) {
        this.mValue = value;
    }

    @Override public String getSerializedValue() {
        return mValue;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("value", mValue)
                .toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)) {
            return false;
        }
        final Code other = (Code) obj;
        return (mValue == null ? other.mValue == null : mValue.equals(other.mValue));
    }

    @Override
    public int hashCode() {
        return mValue != null ? mValue.hashCode() : 0;
    }
}
