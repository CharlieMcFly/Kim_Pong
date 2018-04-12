package eu.macq.kimpong.profile;


import eu.macq.kimpong.BasePresenter;
import eu.macq.kimpong.BaseView;

/**
 * This specifies the contract between the view and the presenter.
 */
public interface AccountContract {

    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {

    }
}