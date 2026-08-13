            package p000;

            import android.content.Context;
            import androidx.window.extensions.layout.WindowLayoutComponent;
            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.concurrent.locks.ReentrantLock;
            
            public class Il1oO0oii extends Il1oIo00 {
                public final ReentrantLock I000II;
                public final LinkedHashMap I000O01llI0;
                public final LinkedHashMap I000OOo1O;

                public Il1oO0oii(WindowLayoutComponent windowLayoutComponent, IOoI0IIOlolO iOoI0IIOlolO) {
/* 1 */             super(windowLayoutComponent, iOoI0IIOlolO);
/* 9 */             this.I000II = new ReentrantLock();
/* 16 */            this.I000O01llI0 = new LinkedHashMap();
/* 23 */            this.I000OOo1O = new LinkedHashMap();
                }

                @Override
                public final void I00000oIO(Context context, I1Ii1lIoOI i1Ii1lIoOI, Olioo011il1 olioo011il1) {
/* 1 */             LinkedHashMap linkedHashMap = this.I000O01llI0;
/* 3 */             ReentrantLock reentrantLock = this.I000II;
/* 5 */             reentrantLock.lock();
                    try {
/* 12 */                OI0iIOI11 oI0iIOI11 = (OI0iIOI11) linkedHashMap.get(context);
/* 14 */                LinkedHashMap linkedHashMap2 = this.I000OOo1O;
/* 16 */                if (oI0iIOI11 != null) {
/* 18 */                    oI0iIOI11.I00000oIO(olioo011il1);
/* 21 */                    linkedHashMap2.put(olioo011il1, context);
                        } else {
/* 29 */                    OI0iIOI11 oI0iIOI112 = new OI0iIOI11();
/* 32 */                    oI0iIOI112.I00000oIO = context;
/* 39 */                    oI0iIOI112.I00000oOI = new ReentrantLock();
/* 46 */                    oI0iIOI112.I0000O = new LinkedHashSet();
/* 48 */                    VarHandle.storeStoreFence();
/* 51 */                    linkedHashMap.put(context, oI0iIOI112);
/* 54 */                    linkedHashMap2.put(olioo011il1, context);
/* 57 */                    oI0iIOI112.I00000oIO(olioo011il1);
/* 64 */                    this.I00000oIO.addWindowLayoutInfoListener(context, oI0iIOI112);
                        }
/* 67 */                reentrantLock.unlock();
                    } catch (Throwable th) {
/* 71 */                reentrantLock.unlock();
/* 98 */                throw th;
                    }
                }

                @Override
                public final void I00000oOI(Olioo011il1 olioo011il1) {
/* 1 */             LinkedHashMap linkedHashMap = this.I000O01llI0;
/* 3 */             LinkedHashMap linkedHashMap2 = this.I000OOo1O;
/* 5 */             ReentrantLock reentrantLock = this.I000II;
/* 7 */             reentrantLock.lock();
                    try {
/* 14 */                Context context = (Context) linkedHashMap2.get(olioo011il1);
/* 16 */                if (context == null) {
/* 21 */                    return;
                        }
/* 26 */                OI0iIOI11 oI0iIOI11 = (OI0iIOI11) linkedHashMap.get(context);
/* 28 */                if (oI0iIOI11 == null) {
/* 33 */                    return;
                        }
/* 34 */                ReentrantLock reentrantLock2 = oI0iIOI11.I00000oOI;
/* 36 */                reentrantLock2.lock();
                        try {
/* 41 */                    oI0iIOI11.I0000O.remove(olioo011il1);
/* 44 */                    reentrantLock2.unlock();
/* 47 */                    linkedHashMap2.remove(olioo011il1);
/* 56 */                    if (oI0iIOI11.I0000O.isEmpty()) {
/* 58 */                        linkedHashMap.remove(context);
/* 65 */                        this.I00000oIO.removeWindowLayoutInfoListener(oI0iIOI11);
                            }
                        } catch (Throwable th) {
/* 76 */                    reentrantLock2.unlock();
/* 79 */                    throw th;
                        }
                    } finally {
/* 80 */                reentrantLock.unlock();
                    }
                }
            }
