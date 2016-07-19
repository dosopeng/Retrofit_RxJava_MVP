package com.example.y.mvp.mvp.presenter;


import com.example.y.mvp.ImageListInfo;
import com.example.y.mvp.NewsListInfo;
import com.example.y.mvp.mvp.model.ImageNewInfo;

/**
 * by y on 2016/5/27.
 */
@SuppressWarnings("ALL")
public interface Presenter {


    interface ImageDetailPresenter {
        void requestNetWork(int id);

        void competence(int requestCode, int[] grantResults);

        int getBundle();
    }

    interface ImageListPresenter {
        void requestNetWork(int id, int page, boolean isNull);

        void onClick(ImageListInfo info);
    }

    interface ImageNewPresenter {
        void requestNetWork(String id, String rows);

        void onClick(ImageNewInfo info);
    }

    interface MainViewPresenter {
        void switchPosition(int position);
    }

    interface ToolBarItemPresenter {
        void switchId(int id);
    }


    interface NewsListPresenter {
        void requestNetWork(int id, int page, boolean isNull);

        void onClick(NewsListInfo info);
    }

    interface NewsDetailPresenter {
        void requestNetWork(int id);
    }

    interface TabNamePresenter {
        void requestNetWork();
    }

    interface TabNewsPresenter {
        void requestNetWork();
    }

    interface JokeTextPresenter {
        void requestNetWork(int page, boolean isNull);
    }

    interface JokePicPresenter {
        void requestNetWork(int page, boolean isNull);
    }


}