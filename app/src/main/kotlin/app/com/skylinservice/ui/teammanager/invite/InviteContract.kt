package app.com.skylinservice.ui.teammanager.invite

import app.com.skylinservice.data.remote.requestmodel.Imaketeaminfo
import app.com.skylinservice.data.remote.requestmodel.TeamMemeberModel
import app.com.skylinservice.data.remote.requestmodel.VlideNumModel
import app.com.skylinservice.manager.CustomerGsonConvertFactory.ApiException
import app.com.skylinservice.ui.BasePresenter
import app.com.skylinservice.ui.BaseView

interface InviteContract {
    interface View : BaseView {
        fun setLoadingIndicatorVisible(loadingVisible: Boolean)


        fun showNoConnectivityError()
        fun showUnknownError()
        fun showRequestAnswer(posts: Imaketeaminfo) {}

        fun invite(post :VlideNumModel) {}
        fun showAPIExcpetion(exception: ApiException)


    }

    interface Presenter : BasePresenter<View> {
        fun invite(tid: Long, name: String, telphone: String)
    }
}