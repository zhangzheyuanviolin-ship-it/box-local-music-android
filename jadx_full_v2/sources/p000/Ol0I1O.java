            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.os.IBinder;
            import android.view.Window;
            import android.view.WindowManager;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.locks.ReentrantLock;
            
            public final class Ol0I1O implements i00I1il0 {
                public static volatile Ol0I1O I0000Il00O;
                public static final ReentrantLock I0000O = new ReentrantLock();
                public Ol0I0o1OI1i I00000oIO;
                public CopyOnWriteArrayList I00000oOI;

                @Override
                public final void I00000oIO(Context context, I1Ii1lIoOI i1Ii1lIoOI, Olioo011il1 olioo011il1) {
                    Object next;
                    WindowManager.LayoutParams attributes;
/* 1 */             CopyOnWriteArrayList copyOnWriteArrayList = this.I00000oOI;
/* 5 */             iBinder = null;
/* 5 */             IBinder iBinder = null;
/* 11 */            Activity activity = context instanceof Activity ? (Activity) context : null;
/* 12 */            Il01100l il01100l = Il01100l.I00iOIl;
/* 14 */            if (activity == null) {
/* 204 */               olioo011il1.accept(new i00lliOilOo(il01100l));
/* 408 */               return;
                    }
/* 16 */            ReentrantLock reentrantLock = I0000O;
/* 18 */            reentrantLock.lock();
                    try {
/* 21 */                Ol0I0o1OI1i ol0I0o1OI1i = this.I00000oIO;
/* 23 */                if (ol0I0o1OI1i == null) {
/* 30 */                    olioo011il1.accept(new i00lliOilOo(il01100l));
/* 36 */                    return;
                        }
/* 41 */                boolean z = false;
/* 42 */                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
/* 51 */                    Iterator it = copyOnWriteArrayList.iterator();
                            while (true) {
/* 59 */                        if (!it.hasNext()) {
                                    break;
                                } else if (O0000Ioio00.I0000O(((Ol0I1101) it.next()).I00000oIO, activity)) {
/* 75 */                            z = true;
                                    break;
                                }
                            }
                        }
/* 78 */                Ol0I1101 ol0I1101 = new Ol0I1101();
/* 81 */                ol0I1101.I00000oIO = activity;
/* 83 */                ol0I1101.I00000oOI = i1Ii1lIoOI;
/* 85 */                ol0I1101.I0000Il00O = olioo011il1;
/* 87 */                VarHandle.storeStoreFence();
/* 90 */                copyOnWriteArrayList.add(ol0I1101);
/* 93 */                if (z) {
/* 144 */                   Iterator it2 = copyOnWriteArrayList.iterator();
                            while (true) {
/* 152 */                       if (!it2.hasNext()) {
/* 170 */                           next = null;
                                    break;
                                } else {
/* 154 */                           next = it2.next();
/* 167 */                           if (activity.equals(((Ol0I1101) next).I00000oIO)) {
                                        break;
                                    }
                                }
                            }
/* 171 */                   Ol0I1101 ol0I11012 = (Ol0I1101) next;
/* 175 */                   i00lliOilOo i00llioiloo = ol0I11012 != null ? ol0I11012.I0000O : null;
/* 177 */                   if (i00llioiloo != null) {
/* 179 */                       ol0I1101.I0000O = i00llioiloo;
/* 183 */                       ol0I1101.I00000oOI.getClass();
/* 188 */                       ol0I1101.I0000Il00O.accept(i00llioiloo);
                            }
                        } else {
/* 95 */                    Window window = activity.getWindow();
/* 99 */                    if (window != null && (attributes = window.getAttributes()) != null) {
/* 107 */                       iBinder = attributes.token;
                            }
/* 109 */                   if (iBinder != null) {
/* 111 */                       ol0I0o1OI1i.I0000Il00O(iBinder, activity);
                            } else {
/* 117 */                       Ill0oo1l1 ill0oo1l1 = new Ill0oo1l1(1);
/* 120 */                       ill0oo1l1.I00iiI = ol0I0o1OI1i;
/* 127 */                       ill0oo1l1.I00iiO = new WeakReference(activity);
/* 129 */                       VarHandle.storeStoreFence();
/* 140 */                       activity.getWindow().getDecorView().addOnAttachStateChangeListener(ill0oo1l1);
                            }
                        }
                    } finally {
/* 195 */               reentrantLock.unlock();
                    }
                }

                @Override
                public final void I00000oOI(Olioo011il1 olioo011il1) {
                    synchronized (I0000O) {
                        try {
/* 6 */                     if (this.I00000oIO == null) {
/* 9 */                         return;
                            }
/* 12 */                    ArrayList arrayList = new ArrayList();
/* 17 */                    Iterator it = this.I00000oOI.iterator();
/* 25 */                    while (it.hasNext()) {
/* 31 */                        Ol0I1101 ol0I1101 = (Ol0I1101) it.next();
/* 35 */                        if (ol0I1101.I0000Il00O == olioo011il1) {
/* 37 */                            arrayList.add(ol0I1101);
                                }
                            }
/* 45 */                    this.I00000oOI.removeAll(arrayList);
/* 48 */                    Iterator it2 = arrayList.iterator();
/* 56 */                    while (it2.hasNext()) {
/* 64 */                        Activity activity = ((Ol0I1101) it2.next()).I00000oIO;
/* 66 */                        CopyOnWriteArrayList copyOnWriteArrayList = this.I00000oOI;
/* 68 */                        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
/* 77 */                            Iterator it3 = copyOnWriteArrayList.iterator();
/* 85 */                            while (it3.hasNext()) {
/* 99 */                                if (O0000Ioio00.I0000O(((Ol0I1101) it3.next()).I00000oIO, activity)) {
                                            break;
                                        }
                                    }
                                }
/* 102 */                       Ol0I0o1OI1i ol0I0o1OI1i = this.I00000oIO;
/* 104 */                       if (ol0I0o1OI1i != null) {
/* 106 */                           ol0I0o1OI1i.I00000oOI(activity);
                                }
                            }
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
                }
            }
