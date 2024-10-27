//package Threads_alien_code;
//
//import com.google.common.collect.ForwardingSet;
//
//import java.util.ArrayList;
//import java.util.Set;
//
//
//// Broken - invokes alien method from synchronized block !
//public class ObservableSet<E> extends ForwardingSet<E> {
//    public ObservableSet(Set<E> set) {
//        super(set);
//    }
//
//    private final List<SetObserver<E>> observers = new
//            ArrayList<>();
//
//    public void addObserver(SetObserver<E> observer) {
//        synchronized (observers) {
//            observers.add(observer);
//        }
//    }
//
//    public boolean removeObs
//
//    erver(SetObserver<E> observer) {
//        synchronized (observers) {
//            return observers.remove(observer);
//        }
//    }
//
//    private void notifyElementAdd(E element) {
//        synchronized (observers) {
//            for (SetObserver<E> observer : observers)
//                observer.added(this, element);
//        }
//    }