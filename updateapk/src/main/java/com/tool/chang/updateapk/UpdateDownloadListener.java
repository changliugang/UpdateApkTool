package com.tool.chang.updateapk;

/**
 * 下载事件监听
 * Created by JustChang on 2016/8/14.
 */
public interface UpdateDownloadListener {

    /**
     * 下载开始
     */
    void onStart();

    /**
     * 进度更新
     * @param progress 进度值
     * @param downloadUrl 下载地址url
     */
      void onProgressChanged(int progress,String downloadUrl);

    /**
     * 下载完成
     * @param completeSize 下载文件大小
     * @param downloadUrl 下载地址url
     */
      void onFinish(int completeSize,String downloadUrl);

    /**
     * 下载失败
     */
      void onFail();
}
