package com.raisesail.mvp.zf_mvp_article.presenter;


import com.raisesail.mvp.zf_mvp_article.model.bean.ArticleInfo;

public interface OnArticleListener {
    void onSuccess(ArticleInfo articleInfo);
    void onStart();
    void onFailed();
    void onFinish();
}
