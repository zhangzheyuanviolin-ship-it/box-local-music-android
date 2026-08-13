            package p000;

            import java.lang.invoke.VarHandle;
            
/* 38 */    public final class OloIlI0ll {
                public final o0IiOl I00000oIO = new o0IiOl();

                public OloIlI0ll(iOoIlOOO0 iooilooo0) {
/* 13 */            i0OI1l1Oo i0oi1l1oo = new i0OI1l1Oo();
/* 16 */            i0oi1l1oo.I00iOIl = this;
/* 18 */            VarHandle.storeStoreFence();
/* 24 */            i0O1lIi1O0IO i0o1lii1o0io = new i0O1lIi1O0IO(2);
/* 27 */            i0o1lii1o0io.I00iiI = i0oi1l1oo;
/* 29 */            VarHandle.storeStoreFence();
/* 36 */            iooilooo0.I00000oIO.I0000oI00(OloIo0oOIO0.I00000oIO, i0o1lii1o0io);
                }

                public final void I00000oIO(Exception exc) {
/* 3 */             this.I00000oIO.I000oI1ioi(exc);
                }

                public final void I00000oOI(Object obj) {
/* 3 */             this.I00000oIO.I000lI(obj);
                }

                public final boolean I0000Il00O(Exception exc) {
/* 1 */             o0IiOl o0iiol = this.I00000oIO;
/* 3 */             o0iiol.getClass();
/* 8 */             lII0I0I000I.I000O01llI0("Exception must not be null", exc);
                    synchronized (o0iiol.I00000oIO) {
                        try {
/* 16 */                    if (o0iiol.I0000Il00O) {
/* 19 */                        return false;
                            }
/* 24 */                    o0iiol.I0000Il00O = true;
/* 26 */                    o0iiol.I0001Ioi1lo = exc;
/* 31 */                    o0iiol.I00000oOI.I000o00OoI0I(o0iiol);
/* 23 */                    return true;
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                public final void I0000O(Object obj) {
/* 3 */             this.I00000oIO.I000o00OoI0I(obj);
                }

/* 39 */        public OloIlI0ll() {
                }
            }
