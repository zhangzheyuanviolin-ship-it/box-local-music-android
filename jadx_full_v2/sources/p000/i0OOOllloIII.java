            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class i0OOOllloIII {
                public static final OlOilIlol1 I000OiO = new OlOilIlol1("AssetPackManager");
                public i0Il00O1 I00000oIO;
                public i0Iii1o10 I00000oOI;
                public i0Iio1OiI I0000Il00O;
                public i0II0Oio01IO I0000O;
                public i0O0oOiO11 I0000oI00;
                public i0OI1IOoili1 I0001Ioi1lo;
                public boolean I000II;
                public i0IOo0i0 I000O01llI0;
                public i0IOo0i0 I000OOo1O;

                public final void I00000oIO(boolean z) {
                    I11o1li1O00 i11o1li1O00;
/* 1 */             i0Iii1o10 i0iii1o10 = this.I00000oOI;
                    synchronized (i0iii1o10) {
/* 4 */                 i11o1li1O00 = i0iii1o10.I0000oI00;
                    }
/* 11 */            boolean z2 = i11o1li1O00 != null;
                    synchronized (i0iii1o10) {
/* 13 */                i0iii1o10.I0001Ioi1lo = z;
/* 15 */                i0iii1o10.I00000oIO();
                    }
/* 19 */            if (!z || z2) {
/* 44 */                return;
                    }
/* 29 */            Executor executor = (Executor) this.I000OOo1O.I0000Il00O();
/* 33 */            i0OO1i1 i0oo1i1 = new i0OO1i1();
/* 36 */            i0oo1i1.I00iiI = this;
/* 38 */            VarHandle.storeStoreFence();
/* 41 */            executor.execute(i0oo1i1);
                }

                public final synchronized void I00000oOI(i0OOI1OOo0 i0ooi1ooo0) {
                    boolean z;
/* 2 */             i0Iio1OiI i0iio1oii = this.I0000Il00O;
                    synchronized (i0iio1oii) {
/* 12 */                i0Iio1OiI.I0000Il00O.I0000O("registerListener", new Object[0]);
/* 17 */                i0iio1oii.I00000oIO.add(i0ooi1ooo0);
                    }
/* 21 */            i0Iii1o10 i0iii1o10 = this.I00000oOI;
                    synchronized (i0iii1o10) {
/* 32 */                z = i0iii1o10.I0000oI00 != null;
                    }
                    synchronized (i0iii1o10) {
/* 40 */                i0iii1o10.I00000oIO.I0000O("registerListener", new Object[0]);
/* 45 */                i0iii1o10.I0000O.add(i0ooi1ooo0);
/* 48 */                i0iii1o10.I00000oIO();
                    }
/* 52 */            if (z) {
/* 78 */                return;
                    }
/* 60 */            Executor executor = (Executor) this.I000OOo1O.I0000Il00O();
/* 64 */            i0OO1i1 i0oo1i1 = new i0OO1i1();
/* 67 */            i0oo1i1.I00iiI = this;
/* 69 */            VarHandle.storeStoreFence();
/* 72 */            executor.execute(i0oo1i1);
                }
            }
