            package p000;

            import com.google.firebase.messaging.FirebaseMessaging;
            
            public final class IlO0lI01iol implements OIi0Oi1lOoo {
                public final int I00iOIl;
                public FirebaseMessaging I00iiI;

                public IlO0lI01iol(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void I0001Ioi1lo(Object obj) {
                    boolean z;
/* 1 */             int i = this.I00iOIl;
/* 3 */             FirebaseMessaging firebaseMessaging = this.I00iiI;
                    switch (i) {
                        case 0:
/* 21 */                    Oo1oo01i oo1oo01i = (Oo1oo01i) obj;
/* 29 */                    if (!firebaseMessaging.I0001Ioi1lo.I0000oI00() || oo1oo01i.I000II.I00000oIO() == null) {
/* 54 */                        return;
                            }
                            synchronized (oo1oo01i) {
/* 40 */                        z = oo1oo01i.I0001Ioi1lo;
                            }
/* 43 */                    if (z) {
/* 54 */                        return;
                            }
/* 47 */                    oo1oo01i.I0000Il00O(0L);
/* 54 */                    return;
                        default:
/* 8 */                     IOO1o0 iOO1o0 = (IOO1o0) obj;
/* 10 */                    if (iOO1o0 != null) {
/* 14 */                        l1OO1oIO0i1o.I00000oOI(iOO1o0.I00iOIl);
/* 17 */                        firebaseMessaging.I0000oI00();
/* 20 */                        return;
                            }
/* 20 */                    return;
                    }
                }
            }
