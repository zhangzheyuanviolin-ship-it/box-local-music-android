            package p000;

            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class O11lIllO extends OI0lOii0I {
                public int I000l1;
                public lO0Ol0 I000lI;
                public O0oiOi I000o00OoI0I;
                public O11li1ooio I000oI1ioi;

                @Override
                public final void I000II() {
/* 1 */             lO0Ol0 lo0ol0 = this.I000lI;
/* 3 */             int i = 1;
/* 4 */             lo0ol0.I0000O = true;
/* 7 */             lo0ol0.I0001Ioi1lo = false;
/* 9 */             lo0ol0.I0000oI00 = false;
/* 11 */            List list = lo0ol0.I000iOII;
/* 13 */            if (list != null) {
/* 15 */                O11lIllO o11lIllO = lo0ol0.I00000oOI;
/* 17 */                if (o11lIllO != null) {
/* 27 */                    if (Looper.myLooper() == Looper.getMainLooper()) {
/* 29 */                        o11lIllO.I000iOII(list);
/* 32 */                        return;
                            } else {
/* 33 */                        o11lIllO.I000OOo1O(list);
/* 36 */                        return;
                            }
                        }
/* 36 */                return;
                    }
/* 37 */            lo0ol0.I0000O();
/* 42 */            I1OoI1 i1OoI1 = new I1OoI1();
/* 45 */            i1OoI1.I00io1l = lo0ol0;
/* 47 */            i1OoI1.I00iiO = 1;
/* 54 */            i1OoI1.I00iio = new AtomicBoolean();
/* 61 */            i1OoI1.I00ilI0I1 = new AtomicBoolean();
/* 65 */            Io11llo0i io11llo0i = new Io11llo0i(i);
/* 68 */            io11llo0i.I00000oOI = i1OoI1;
/* 70 */            VarHandle.storeStoreFence();
/* 73 */            i1OoI1.I00iOIl = io11llo0i;
/* 80 */            i1OoI1.I00iiI = new O1oo1I0il(i1OoI1, io11llo0i);
/* 87 */            i1OoI1.I00ilO0 = new CountDownLatch(1);
/* 89 */            VarHandle.storeStoreFence();
/* 92 */            lo0ol0.I000OOo1O = i1OoI1;
/* 94 */            lo0ol0.I00000oOI();
                }

                @Override
                public final void I000O01llI0() {
/* 1 */             lO0Ol0 lo0ol0 = this.I000lI;
/* 4 */             lo0ol0.I0000O = false;
/* 6 */             lo0ol0.I0000O();
                }

                @Override
                public final void I000OiO(OIOilII0IlO oIOilII0IlO) {
/* 1 */             super.I000OiO(oIOilII0IlO);
/* 5 */             this.I000o00OoI0I = null;
/* 7 */             this.I000oI1ioi = null;
                }

                public final void I000l1() {
/* 1 */             lO0Ol0 lo0ol0 = this.I000lI;
/* 3 */             lo0ol0.I0000O();
/* 7 */             lo0ol0.I0000oI00 = true;
/* 9 */             O11li1ooio o11li1ooio = this.I000oI1ioi;
/* 11 */            if (o11li1ooio != null) {
/* 13 */                I000OiO(o11li1ooio);
/* 18 */                if (o11li1ooio.I00iiI) {
/* 20 */                    liii0ioI liii0ioi = o11li1ooio.I00iOIl;
/* 24 */                    liii0ioi.I0110o.clear();
/* 29 */                    liii0ioi.I0110o.notifyDataSetChanged();
                        }
                    }
/* 32 */            O11lIllO o11lIllO = lo0ol0.I00000oOI;
/* 34 */            if (o11lIllO == null) {
/* 63 */                I000II.I001IO000("No listener register");
/* 110 */               return;
                    }
/* 36 */            if (o11lIllO != this) {
/* 57 */                I000II.I000iOII("Attempting to unregister the wrong listener");
/* 60 */                return;
                    }
/* 39 */            lo0ol0.I00000oOI = null;
/* 41 */            if (o11li1ooio != null) {
/* 43 */                boolean z = o11li1ooio.I00iiI;
                    }
/* 45 */            lo0ol0.I0001Ioi1lo = true;
/* 48 */            lo0ol0.I0000O = false;
/* 50 */            lo0ol0.I0000oI00 = false;
/* 52 */            lo0ol0.I000II = false;
                }

                public final void I000lI() {
/* 1 */             O0oiOi o0oiOi = this.I000o00OoI0I;
/* 3 */             O11li1ooio o11li1ooio = this.I000oI1ioi;
/* 5 */             if (o0oiOi == null || o11li1ooio == null) {
/* 20 */                return;
                    }
/* 9 */             super.I000OiO(o11li1ooio);
/* 12 */            I0000oI00(o0oiOi, o11li1ooio);
                }

                public final lO0Ol0 I000o00OoI0I(O0oiOi o0oiOi, liii0ioI liii0ioi) {
/* 3 */             lO0Ol0 lo0ol0 = this.I000lI;
/* 5 */             O11li1ooio o11li1ooio = new O11li1ooio();
/* 9 */             o11li1ooio.I00iiI = false;
/* 11 */            o11li1ooio.I00iOIl = liii0ioi;
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            I0000oI00(o0oiOi, o11li1ooio);
/* 19 */            OIOilII0IlO oIOilII0IlO = this.I000oI1ioi;
/* 21 */            if (oIOilII0IlO != null) {
/* 23 */                I000OiO(oIOilII0IlO);
                    }
/* 26 */            this.I000o00OoI0I = o0oiOi;
/* 28 */            this.I000oI1ioi = o11li1ooio;
/* 37 */            return lo0ol0;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(64);
/* 10 */            sb.append("LoaderInfo{");
/* 21 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 26 */            sb.append(" #");
/* 31 */            sb.append(this.I000l1);
/* 36 */            sb.append(" : ");
/* 41 */            il0OoI1liO.I00000oIO(this.I000lI, sb);
/* 46 */            sb.append("}}");
/* 49 */            return sb.toString();
                }
            }
