            package p000;

            import android.app.Activity;
            import android.content.Context;
            import androidx.window.extensions.layout.WindowLayoutComponent;
            import androidx.window.extensions.layout.WindowLayoutInfo;
            import androidx.window.layout.adapter.extensions.MulticastConsumer;
            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.concurrent.locks.ReentrantLock;
            
            public class Il1oIo00 extends Il1oI1Oo0O {
                public final WindowLayoutComponent I00000oIO;
                public final IOoI0IIOlolO I00000oOI;
                public final ReentrantLock I0000Il00O = new ReentrantLock();
                public final LinkedHashMap I0000O = new LinkedHashMap();
                public final LinkedHashMap I0000oI00 = new LinkedHashMap();
                public final LinkedHashMap I0001Ioi1lo = new LinkedHashMap();

                public Il1oIo00(WindowLayoutComponent windowLayoutComponent, IOoI0IIOlolO iOoI0IIOlolO) {
/* 4 */             this.I00000oIO = windowLayoutComponent;
/* 6 */             this.I00000oOI = iOoI0IIOlolO;
                }

                @Override
                public void I00000oIO(Context context, I1Ii1lIoOI i1Ii1lIoOI, Olioo011il1 olioo011il1) {
/* 1 */             LinkedHashMap linkedHashMap = this.I0000O;
/* 3 */             ReentrantLock reentrantLock = this.I0000Il00O;
/* 5 */             reentrantLock.lock();
                    try {
/* 12 */                MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
/* 14 */                LinkedHashMap linkedHashMap2 = this.I0000oI00;
/* 16 */                if (multicastConsumer != null) {
/* 18 */                    multicastConsumer.I00000oIO(olioo011il1);
/* 21 */                    linkedHashMap2.put(olioo011il1, context);
                        } else {
/* 30 */                    MulticastConsumer multicastConsumer2 = new MulticastConsumer();
/* 33 */                    multicastConsumer2.I00000oIO = context;
/* 40 */                    multicastConsumer2.I00000oOI = new ReentrantLock();
/* 47 */                    multicastConsumer2.I0000O = new LinkedHashSet();
/* 49 */                    VarHandle.storeStoreFence();
/* 52 */                    linkedHashMap.put(context, multicastConsumer2);
/* 55 */                    linkedHashMap2.put(olioo011il1, context);
/* 58 */                    multicastConsumer2.I00000oIO(olioo011il1);
/* 63 */                    if (!(context instanceof Activity)) {
/* 112 */                       multicastConsumer2.accept(new WindowLayoutInfo(Il01100l.I00iOIl));
/* 115 */                       reentrantLock.unlock();
/* 118 */                       return;
                            } else {
/* 98 */                        this.I0001Ioi1lo.put(multicastConsumer2, this.I00000oOI.I00000oIO(this.I00000oIO, OOoOl0i.I00000oIO.I00000oOI(WindowLayoutInfo.class), (Activity) context, new Il1oIOO0l(1, 0, MulticastConsumer.class, multicastConsumer2, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V")));
                            }
                        }
/* 101 */               reentrantLock.unlock();
                    } catch (Throwable th) {
/* 119 */               reentrantLock.unlock();
/* 408 */               throw th;
                    }
                }

                @Override
                public void I00000oOI(Olioo011il1 olioo011il1) {
/* 1 */             LinkedHashMap linkedHashMap = this.I0000O;
/* 3 */             LinkedHashMap linkedHashMap2 = this.I0000oI00;
/* 5 */             ReentrantLock reentrantLock = this.I0000Il00O;
/* 7 */             reentrantLock.lock();
                    try {
/* 14 */                Context context = (Context) linkedHashMap2.get(olioo011il1);
/* 16 */                if (context == null) {
/* 21 */                    return;
                        }
/* 26 */                MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
/* 28 */                if (multicastConsumer == null) {
/* 33 */                    return;
                        }
/* 34 */                LinkedHashSet linkedHashSet = multicastConsumer.I0000O;
/* 36 */                ReentrantLock reentrantLock2 = multicastConsumer.I00000oOI;
/* 38 */                reentrantLock2.lock();
                        try {
/* 41 */                    linkedHashSet.remove(olioo011il1);
/* 44 */                    reentrantLock2.unlock();
/* 47 */                    linkedHashMap2.remove(olioo011il1);
/* 54 */                    if (linkedHashSet.isEmpty()) {
/* 56 */                        linkedHashMap.remove(context);
/* 65 */                        IOo1o10il iOo1o10il = (IOo1o10il) this.I0001Ioi1lo.remove(multicastConsumer);
/* 67 */                        if (iOo1o10il != null) {
/* 79 */                            iOo1o10il.I00000oIO.invoke(iOo1o10il.I00000oOI, iOo1o10il.I0000Il00O);
                                }
                            }
                        } catch (Throwable th) {
/* 90 */                    reentrantLock2.unlock();
/* 93 */                    throw th;
                        }
                    } finally {
/* 94 */                reentrantLock.unlock();
                    }
                }
            }
