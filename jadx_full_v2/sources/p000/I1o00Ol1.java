            package p000;

            import android.app.Activity;
            import android.app.Application;
            import android.content.ComponentCallbacks2;
            import android.content.res.Configuration;
            import android.os.Bundle;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.concurrent.atomic.AtomicBoolean;
            
/* 18 */    public final class I1o00Ol1 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
                public static final I1o00Ol1 I00ilI0I1;
                public AtomicBoolean I00iOIl;
                public AtomicBoolean I00iiI;
                public ArrayList I00iiO;
                public boolean I00iio;

                static {
/* 3 */             I1o00Ol1 i1o00Ol1 = new I1o00Ol1();
/* 11 */            i1o00Ol1.I00iOIl = new AtomicBoolean();
/* 18 */            i1o00Ol1.I00iiI = new AtomicBoolean();
/* 25 */            i1o00Ol1.I00iiO = new ArrayList();
/* 28 */            i1o00Ol1.I00iio = false;
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            I00ilI0I1 = i1o00Ol1;
                }

                public static void I00000oIO(Application application) {
/* 1 */             I1o00Ol1 i1o00Ol1 = I00ilI0I1;
                    synchronized (i1o00Ol1) {
                        try {
/* 6 */                     if (!i1o00Ol1.I00iio) {
/* 8 */                         application.registerActivityLifecycleCallbacks(i1o00Ol1);
/* 11 */                        application.registerComponentCallbacks(i1o00Ol1);
/* 15 */                        i1o00Ol1.I00iio = true;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
                }

                public final void I00000oOI(boolean z) {
                    synchronized (I00ilI0I1) {
                        try {
/* 6 */                     Iterator it = this.I00iiO.iterator();
/* 14 */                    while (it.hasNext()) {
/* 22 */                        ((I1looi1iO1il) it.next()).I00000oIO(z);
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                @Override
                public final void onActivityCreated(Activity activity, Bundle bundle) {
/* 1 */             AtomicBoolean atomicBoolean = this.I00iiI;
/* 7 */             boolean zCompareAndSet = this.I00iOIl.compareAndSet(true, false);
/* 11 */            atomicBoolean.set(true);
/* 14 */            if (zCompareAndSet) {
/* 16 */                I00000oOI(false);
                    }
                }

                @Override
                public final void onActivityResumed(Activity activity) {
/* 1 */             AtomicBoolean atomicBoolean = this.I00iiI;
/* 7 */             boolean zCompareAndSet = this.I00iOIl.compareAndSet(true, false);
/* 11 */            atomicBoolean.set(true);
/* 14 */            if (zCompareAndSet) {
/* 16 */                I00000oOI(false);
                    }
                }

                @Override
                public final void onTrimMemory(int i) {
/* 3 */             if (i == 20 && this.I00iOIl.compareAndSet(false, true)) {
/* 17 */                this.I00iiI.set(true);
/* 20 */                I00000oOI(true);
                    }
                }

                @Override
/* 19 */        public final void onLowMemory() {
                }

                @Override
/* 28 */        public final void onActivityDestroyed(Activity activity) {
                }

                @Override
/* 28 */        public final void onActivityPaused(Activity activity) {
                }

                @Override
/* 28 */        public final void onActivityStarted(Activity activity) {
                }

                @Override
/* 28 */        public final void onActivityStopped(Activity activity) {
                }

                @Override
/* 28 */        public final void onConfigurationChanged(Configuration configuration) {
                }

                @Override
/* 36 */        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }
            }
