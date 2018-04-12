package eu.macq.kimpong.ranking;

import eu.macq.kimpong.BasePresenter;
import eu.macq.kimpong.BaseView;
import eu.macq.kimpong.profile.AccountContract;

public interface RankingContract {

    interface View extends BaseView<AccountContract.Presenter> {

    }

    interface Presenter extends BasePresenter {

    }
}
