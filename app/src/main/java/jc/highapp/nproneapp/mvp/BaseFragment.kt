package jc.highapp.nproneapp.mvp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.fragment.app.Fragment
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware

abstract class BaseFragment<V : BaseView, P : BasePresenter<V>> : Fragment(), KodeinAware, BaseView{

    protected abstract val layoutResId : Int
    protected abstract val presenter : P

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(layoutResId, container, false);
        presenter.attachView(this as V)
        presenter.onCreateView()
        return view
    }

    override val kodein: Kodein by lazy { (activity as KodeinAware).kodein }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.onInit()
    }

    @CallSuper
    override fun onDestroyView() {
        super.onDestroyView()
        presenter.onDestroyView()
    }

    @CallSuper
    override fun onResume() {
        super.onResume()
        presenter.onResume()
    }

    @CallSuper
    override fun onPause() {
        super.onPause()
        presenter.onPause()
    }
}