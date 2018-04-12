package eu.macq.kimpong.users;

import eu.macq.kimpong.BasePresenter;
import eu.macq.kimpong.BaseView;
import eu.macq.kimpong.profile.AccountContract;

public interface UsersContract {

    interface View extends BaseView<AccountContract.Presenter> {

    }

    interface Presenter extends BasePresenter {

    }
}
