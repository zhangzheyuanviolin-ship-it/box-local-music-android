            package p000;

            import android.util.Size;
            import android.view.Surface;
            import android.view.SurfaceHolder;
            import java.lang.invoke.VarHandle;
            import java.util.Objects;
            import java.util.concurrent.Executor;
            
            public final class Oll0IoIOoi1 implements SurfaceHolder.Callback {
                public Size I00000oIO;
                public Oll0I0l1i1 I00000oOI;
                public Oll0I0l1i1 I0000Il00O;
                public IiI0oIlol0 I0000O;
                public Size I0000oI00;
                public boolean I0001Ioi1lo;
                public boolean I000II;
                public Oll0OO0O I000O01llI0;

                public final void I00000oIO() {
                    IiI0oIlol0 iiI0oIlol0;
/* 1 */             Oll0I0l1i1 oll0I0l1i1 = this.I00000oOI;
/* 3 */             if (oll0I0l1i1 != null) {
/* 5 */                 Objects.toString(oll0I0l1i1);
/* 11 */                l11I11lO.I0000O(3, "SurfaceViewImpl");
/* 20 */                if (!this.I00000oOI.I0000Il00O() || (iiI0oIlol0 = this.I0000O) == null) {
/* 55 */                    return;
                        }
/* 26 */                iiI0oIlol0.I00000oIO();
                    }
                }

                public final boolean I00000oOI() {
/* 1 */             Oll0OO0O oll0OO0O = this.I000O01llI0;
/* 9 */             Surface surface = oll0OO0O.I0000oI00.getHolder().getSurface();
/* 15 */            if (this.I0001Ioi1lo || this.I00000oOI == null || !Objects.equals(this.I00000oIO, this.I0000oI00)) {
/* 76 */                return false;
                    }
/* 34 */            l11I11lO.I0000O(3, "SurfaceViewImpl");
/* 37 */            IiI0oIlol0 iiI0oIlol0 = this.I0000O;
/* 39 */            Oll0I0l1i1 oll0I0l1i1 = this.I00000oOI;
/* 41 */            Objects.requireNonNull(oll0I0l1i1);
/* 50 */            Executor mainExecutor = oll0OO0O.I0000oI00.getContext().getMainExecutor();
/* 57 */            Olioo011il1 olioo011il1 = new Olioo011il1(1);
/* 60 */            olioo011il1.I00000oOI = iiI0oIlol0;
/* 62 */            VarHandle.storeStoreFence();
/* 65 */            oll0I0l1i1.I00000oIO(surface, mainExecutor, olioo011il1);
/* 68 */            this.I0001Ioi1lo = true;
/* 70 */            oll0OO0O.I0000O = true;
/* 72 */            oll0OO0O.I0001Ioi1lo();
/* 56 */            return true;
                }

                @Override
                public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
/* 4 */             l11I11lO.I0000O(3, "SurfaceViewImpl");
/* 12 */            this.I0000oI00 = new Size(i2, i3);
/* 14 */            I00000oOI();
                }

                @Override
                public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                    Oll0I0l1i1 oll0I0l1i1;
/* 4 */             l11I11lO.I0000O(3, "SurfaceViewImpl");
/* 9 */             if (!this.I000II || (oll0I0l1i1 = this.I0000Il00O) == null) {
/* 29 */                return;
                    }
/* 15 */            oll0I0l1i1.I0000Il00O();
/* 21 */            oll0I0l1i1.I000OOo1O.I00000oOI(null);
/* 24 */            this.I0000Il00O = null;
/* 27 */            this.I000II = false;
                }

                @Override
                public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
/* 4 */             l11I11lO.I0000O(3, "SurfaceViewImpl");
/* 9 */             if (this.I0001Ioi1lo) {
/* 11 */                Oll0I0l1i1 oll0I0l1i1 = this.I00000oOI;
/* 13 */                if (oll0I0l1i1 != null) {
/* 15 */                    Objects.toString(oll0I0l1i1);
/* 18 */                    l11I11lO.I0000O(3, "SurfaceViewImpl");
/* 25 */                    this.I00000oOI.I000iOII.I00000oIO();
                        }
                    } else {
/* 29 */                I00000oIO();
                    }
/* 33 */            this.I000II = true;
/* 35 */            Oll0I0l1i1 oll0I0l1i12 = this.I00000oOI;
/* 37 */            if (oll0I0l1i12 != null) {
/* 39 */                this.I0000Il00O = oll0I0l1i12;
                    }
/* 42 */            this.I0001Ioi1lo = false;
/* 45 */            this.I00000oOI = null;
/* 47 */            this.I0000O = null;
/* 49 */            this.I0000oI00 = null;
/* 51 */            this.I00000oIO = null;
                }
            }
