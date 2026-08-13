            package p000;

            import android.content.Context;
            import android.os.Looper;
            import android.os.SystemClock;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            
            public final class lO0Ol0 {
                public int I00000oIO;
                public O11lIllO I00000oOI;
                public Context I0000Il00O;
                public boolean I0000O;
                public boolean I0000oI00;
                public boolean I0001Ioi1lo;
                public boolean I000II;
                public Executor I000O01llI0;
                public volatile I1OoI1 I000OOo1O;
                public volatile I1OoI1 I000OiO;
                public List I000iOII;
                public iii1IIii I000l1;

                public final void I00000oIO(I1OoI1 i1OoI1, Object obj) {
/* 4 */             if (this.I000OOo1O != i1OoI1) {
/* 8 */                 if (this.I000OiO == i1OoI1) {
/* 10 */                    SystemClock.uptimeMillis();
/* 13 */                    this.I000OiO = null;
/* 15 */                    I00000oOI();
/* 18 */                    return;
                        }
/* 106 */               return;
                    }
/* 21 */            if (this.I0000oI00) {
/* 106 */               return;
                    }
/* 24 */            SystemClock.uptimeMillis();
/* 27 */            this.I000OOo1O = null;
/* 29 */            List list = (List) obj;
/* 31 */            this.I000iOII = list;
/* 33 */            O11lIllO o11lIllO = this.I00000oOI;
/* 35 */            if (o11lIllO != null) {
/* 45 */                if (Looper.myLooper() == Looper.getMainLooper()) {
/* 47 */                    o11lIllO.I000iOII(list);
                        } else {
/* 51 */                    o11lIllO.I000OOo1O(list);
                        }
                    }
                }

                public final void I00000oOI() {
/* 3 */             if (this.I000OiO != null || this.I000OOo1O == null) {
/* 110 */               return;
                    }
/* 11 */            this.I000OOo1O.getClass();
/* 14 */            I1OoI1 i1OoI1 = this.I000OOo1O;
/* 16 */            Executor executor = this.I000O01llI0;
/* 22 */            if (i1OoI1.I00iiO == 1) {
/* 52 */                i1OoI1.I00iiO = 2;
/* 56 */                i1OoI1.I00iOIl.getClass();
/* 61 */                executor.execute(i1OoI1.I00iiI);
/* 110 */               return;
                    }
/* 26 */            int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(i1OoI1.I00iiO);
/* 30 */            if (iI001lIiIIo1O == 1) {
/* 48 */                I000II.I001IO000("Cannot execute task: the task is already running.");
                    } else if (iI001lIiIIo1O != 2) {
/* 36 */                I000II.I001IO000("We should never reach this state");
                    } else {
/* 42 */                I000II.I001IO000("Cannot execute task: the task has already been executed (a task can be executed only once)");
                    }
                }

                public final List I0000Il00O() {
/* 3 */             ArrayList arrayListI00000oIO = ll1IoOi1l.I00000oIO(this.I0000Il00O);
/* 11 */            i0i01Ii0iII i0i01ii0iii = (i0i01Ii0iII) this.I000l1.I00iiI;
/* 19 */            o0IiOl o0iiolI00000oOI = i0i01ii0iii.I00000oOI(0, new i0OloII1(i0i01ii0iii, arrayListI00000oIO));
/* 25 */            lII0I0I000I.I000O01llI0("Task must not be null", o0iiolI00000oOI);
/* 32 */            lII0I0I000I.I000O01llI0("TimeUnit must not be null", TimeUnit.SECONDS);
/* 37 */            iOoIlOOO0 iooilooo0 = new iOoIlOOO0();
/* 42 */            OloIlI0ll oloIlI0ll = new OloIlI0ll(iooilooo0);
/* 52 */            O1oo1il01OoO o1oo1il01OoO = new O1oo1il01OoO(Looper.getMainLooper(), 3);
/* 58 */            i1IOlOO10o0 i1ioloo10o0 = new i1IOlOO10o0(1);
/* 61 */            i1ioloo10o0.I00iiI = oloIlI0ll;
/* 63 */            VarHandle.storeStoreFence();
/* 68 */            o1oo1il01OoO.postDelayed(i1ioloo10o0, 2000L);
/* 75 */            OlilOlOiI olilOlOiI = new OlilOlOiI(10);
/* 78 */            olilOlOiI.I00iiI = o1oo1il01OoO;
/* 80 */            olilOlOiI.I00iiO = oloIlI0ll;
/* 82 */            olilOlOiI.I00iio = iooilooo0;
/* 84 */            VarHandle.storeStoreFence();
/* 87 */            o0iiolI00000oOI.I000OiO(olilOlOiI);
/* 90 */            o0IiOl o0iiol = oloIlI0ll.I00000oIO;
                    try {
/* 92 */                lOio0o.I00000oIO(o0iiol);
                        return o0iiol.I000OOo1O() ? (List) o0iiol.I000II() : arrayListI00000oIO;
                    } catch (InterruptedException | ExecutionException e) {
/* 129 */               Log.w("OssLicensesLoader", "Error getting license list from service: ".concat(String.valueOf(e.getMessage())));
/* 245 */               return arrayListI00000oIO;
                    }
                }

                public final boolean I0000O() {
/* 4 */             if (this.I000OOo1O == null) {
/* 3 */                 return false;
                    }
/* 9 */             if (!this.I0000O) {
/* 11 */                this.I000II = true;
                    }
/* 13 */            I1OoI1 i1OoI1 = this.I000OiO;
/* 15 */            I1OoI1 i1OoI12 = this.I000OOo1O;
/* 18 */            if (i1OoI1 != null) {
/* 20 */                i1OoI12.getClass();
/* 23 */                this.I000OOo1O = null;
/* 3 */                 return false;
                    }
/* 26 */            i1OoI12.getClass();
/* 29 */            I1OoI1 i1OoI13 = this.I000OOo1O;
/* 33 */            i1OoI13.I00iio.set(true);
/* 38 */            boolean zCancel = i1OoI13.I00iiI.cancel(false);
/* 42 */            if (zCancel) {
/* 46 */                this.I000OiO = this.I000OOo1O;
                    }
/* 48 */            this.I000OOo1O = null;
/* 50 */            return zCancel;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(64);
/* 8 */             il0OoI1liO.I00000oIO(this, sb);
/* 13 */            sb.append(" id=");
/* 20 */            return IIl001iO0Io.I000lI(this.I00000oIO, "}", sb);
                }
            }
