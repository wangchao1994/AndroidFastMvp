package com.raisesail.mvp.zf_mvp_article.view.view;

import com.raisesail.mvp.zf_mvp_article.model.bean.ArticleInfo;

public interface ArticleView {
    void setArticleInfo(ArticleInfo articleInfo);
    void showLoading();
    void hideLoading();
    void showError();
}
