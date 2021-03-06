package com.pratamawijaya.recyclerviewinaction.utils;

import rx.Observable;
import rx.subjects.PublishSubject;
import rx.subjects.SerializedSubject;
import rx.subjects.Subject;

/**
 * Created by pratama on 5/29/16.
 */
public class RxBus {

  private final Subject<Object, Object> _bus = new SerializedSubject<>(PublishSubject.create());

  public void send(Object o) {
    _bus.onNext(o);
  }

  public Observable<Object> toObserverable() {
    return _bus;
  }

  public boolean hasObservers() {
    return _bus.hasObservers();
  }
}
