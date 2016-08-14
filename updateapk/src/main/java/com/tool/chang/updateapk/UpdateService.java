package com.tool.chang.updateapk;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * 下载服务
 * Created by JustChang on 2016/8/14.
 */
public class UpdateService extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
