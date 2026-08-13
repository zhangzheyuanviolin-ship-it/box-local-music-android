            package p000;

            import android.os.Handler;
            import java.lang.invoke.VarHandle;
            
            public abstract class iOo0iOlili1 {
                public static volatile O1oo1il01OoO I0000O;
                public final l1i11I1I0 I00000oIO;
                public final l0001OI0 I00000oOI;
                public volatile long I0000Il00O;

                public iOo0iOlili1(l1i11I1I0 l1i11i1i0) {
/* 4 */             lII0I0I000I.I000II(l1i11i1i0);
/* 7 */             this.I00000oIO = l1i11i1i0;
/* 12 */            l0001OI0 l0001oi0 = new l0001OI0(4);
/* 15 */            l0001oi0.I00iiI = l1i11i1i0;
/* 17 */            l0001oi0.I00iiO = this;
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            this.I00000oOI = l0001oi0;
                }

                public abstract void I00000oIO();

                public final void I00000oOI(long j) {
/* 1 */             I0000Il00O();
/* 8 */             if (j >= 0) {
/* 10 */                l1i11I1I0 l1i11i1i0 = this.I00000oIO;
/* 16 */                l1i11i1i0.I00IoO0().getClass();
/* 23 */                this.I0000Il00O = System.currentTimeMillis();
/* 35 */                if (I0000O().postDelayed(this.I00000oOI, j)) {
/* 77 */                    return;
                        }
/* 49 */                l1i11i1i0.I00II0oii1o().I00ilO0.I0000Il00O("Failed to schedule delayed post. time", Long.valueOf(j));
                    }
                }

                public final void I0000Il00O() {
/* 3 */             this.I0000Il00O = 0L;
/* 11 */            I0000O().removeCallbacks(this.I00000oOI);
                }

                public final Handler I0000O() {
                    O1oo1il01OoO o1oo1il01OoO;
/* 3 */             if (I0000O != null) {
/* 5 */                 return I0000O;
                    }
                    synchronized (iOo0iOlili1.class) {
                        try {
/* 13 */                    if (I0000O == null) {
/* 31 */                        I0000O = new O1oo1il01OoO(this.I00000oIO.I00iiI().getMainLooper(), 5);
                            }
/* 36 */                    o1oo1il01OoO = I0000O;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 39 */            return o1oo1il01OoO;
                }
            }
