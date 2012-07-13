package com.openxc.sources;

import android.content.Context;

/**
 * A parent class for data sources that require access to an Android context.
 */
public class ContextualVehicleDataSource extends BaseVehicleDataSource {
    private Context mContext;

    public ContextualVehicleDataSource(Context context) {
        this(null, context);
    }

    public ContextualVehicleDataSource(SourceCallback callback,
            Context context) {
        super(callback);
        mContext = context;
    }

    protected Context getContext() {
        return mContext;
    }
}
