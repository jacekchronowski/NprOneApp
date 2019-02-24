package jc.highapp.nproneapp.mvp

import io.reactivex.disposables.CompositeDisposable

abstract class BasePresenter<T : BaseView> {

    protected var view : T? = null
    protected var compositeDisposable : CompositeDisposable? = null

    fun onResume() {
        compositeDisposable = CompositeDisposable()
    }

    fun onPause() {
        compositeDisposable?.clear()
    }

    fun onCreateView() {

    }

    fun onDestroyView() {
        this.view = null
    }

    abstract fun onInit()

    fun attachView(view : T?) {
        this.view = view
    }
}