package com.raisesail.mvp.zf_mvp_article.presenter.impl;

import com.raisesail.mvp.zf_mvp_article.model.bean.ArticleInfo;
import com.raisesail.mvp.zf_mvp_article.model.impl.ArticleModelImpl;
import com.raisesail.mvp.zf_mvp_article.model.model.ArticleModel;
import com.raisesail.mvp.zf_mvp_article.presenter.ArticlePresenter;
import com.raisesail.mvp.zf_mvp_article.presenter.OnArticleListener;
import com.raisesail.mvp.zf_mvp_article.view.view.ArticleView;

public class ArticlePresenterImpl implements ArticlePresenter, OnArticleListener {
    private ArticleView mArticleView;
    private ArticleModel mArticleModel;

    public ArticlePresenterImpl(ArticleView mArticleView){
        this.mArticleView=mArticleView;
        mArticleModel=new ArticleModelImpl();
    }
    @Override
    public void getArticle() {
        mArticleModel.getArtcle(this);
    }



    @Override
    public void onSuccess(ArticleInfo articleInfo) {
        mArticleView.setArticleInfo(articleInfo);
    }

    @Override
    public void onStart() {
        mArticleView.showLoading();
    }

    @Override
    public void onFailed() {
        mArticleView.showError();
    }

    @Override
    public void onFinish() {
        mArticleView.hideLoading();
    }
}
