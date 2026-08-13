            package p000;

            import java.util.concurrent.Executor;
            
            public final class IIiOOI {
                public Object I00000oIO;
                public IIiOiI0il I00000oOI;
                public Oi0OoOoOI1li I0000Il00O;
                public boolean I0000O;

                public final void I00000oIO(Runnable runnable, Executor executor) {
/* 1 */             Oi0OoOoOI1li oi0OoOoOI1li = this.I0000Il00O;
/* 3 */             if (oi0OoOoOI1li != null) {
/* 5 */                 oi0OoOoOI1li.addListener(runnable, executor);
                    }
                }

                public final boolean I00000oOI(Object obj) {
/* 2 */             this.I0000O = true;
/* 4 */             IIiOiI0il iIiOiI0il = this.I00000oOI;
/* 6 */             boolean z = iIiOiI0il != null && iIiOiI0il.I00iiI.I000OOo1O(obj);
/* 18 */            if (z) {
/* 21 */                this.I00000oIO = null;
/* 23 */                this.I00000oOI = null;
/* 25 */                this.I0000Il00O = null;
                    }
/* 29 */            return z;
                }

                public final void I0000Il00O() {
/* 2 */             this.I0000O = true;
/* 4 */             IIiOiI0il iIiOiI0il = this.I00000oOI;
/* 6 */             if (iIiOiI0il == null || !iIiOiI0il.I00iiI.cancel(true)) {
/* 55 */                return;
                    }
/* 17 */            this.I00000oIO = null;
/* 19 */            this.I00000oOI = null;
/* 21 */            this.I0000Il00O = null;
                }

                public final boolean I0000O(Throwable th) {
/* 2 */             this.I0000O = true;
/* 4 */             IIiOiI0il iIiOiI0il = this.I00000oOI;
/* 6 */             boolean z = iIiOiI0il != null && iIiOiI0il.I00iiI.I000OiO(th);
/* 18 */            if (z) {
/* 21 */                this.I00000oIO = null;
/* 23 */                this.I00000oOI = null;
/* 25 */                this.I0000Il00O = null;
                    }
/* 29 */            return z;
                }

                public final void finalize() {
                    Oi0OoOoOI1li oi0OoOoOI1li;
/* 1 */             IIiOiI0il iIiOiI0il = this.I00000oOI;
/* 3 */             if (iIiOiI0il != null) {
/* 5 */                 IIiOOoOOll11 iIiOOoOOll11 = iIiOiI0il.I00iiI;
/* 11 */                if (!iIiOOoOOll11.isDone()) {
/* 35 */                    iIiOOoOOll11.I000OiO(new I010l1O("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.I00000oIO, 2));
                        }
                    }
/* 40 */            if (this.I0000O || (oi0OoOoOI1li = this.I0000Il00O) == null) {
/* 55 */                return;
                    }
/* 47 */            oi0OoOoOI1li.I000OOo1O(null);
                }
            }
