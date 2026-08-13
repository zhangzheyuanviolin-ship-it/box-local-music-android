            package p000;

            import android.os.IBinder;
            import android.os.RemoteException;
            import java.util.Iterator;
            
            public final class OOoolll implements IBinder.DeathRecipient {
                public final int I00iOIl;
                public Object I00iiI;

                @Override
                public final void binderDied() {
                    switch (this.I00iOIl) {
                        case 0:
/* 119 */                   ((OiIOol0) this.I00iiI).resumeWith(lIoii1l01l0i.I00000oIO(new RuntimeException("Binder died")));
/* 122 */                   return;
                        default:
/* 8 */                     i0Oii0oo1i i0oii0oo1i = (i0Oii0oo1i) this.I00iiI;
/* 17 */                    i0oii0oo1i.I00000oOI.I0000O("reportBinderDeath", new Object[0]);
/* 26 */                    if (i0oii0oo1i.I000OOo1O.get() != null) {
/* 100 */                       OIiilo1Ool0o.I00000oIO();
/* 103 */                       return;
                            }
/* 38 */                    i0oii0oo1i.I00000oOI.I0000O("%s : Binder has died.", i0oii0oo1i.I0000Il00O);
/* 43 */                    Iterator it = i0oii0oo1i.I0000O.iterator();
/* 51 */                    while (it.hasNext()) {
/* 57 */                        i0Oi011IO0 i0oi011io0 = (i0Oi011IO0) it.next();
/* 73 */                        RemoteException remoteException = new RemoteException(String.valueOf(i0oii0oo1i.I0000Il00O).concat(" : Binder has died."));
/* 76 */                        OloIlI0ll oloIlI0ll = i0oi011io0.I00iOIl;
/* 78 */                        if (oloIlI0ll != null) {
/* 80 */                            oloIlI0ll.I0000Il00O(remoteException);
                                }
                            }
/* 86 */                    i0oii0oo1i.I0000O.clear();
                            synchronized (i0oii0oo1i.I0001Ioi1lo) {
/* 92 */                        i0oii0oo1i.I0000oI00();
                            }
/* 103 */                   return;
                    }
                }
            }
