            package p000;

            import android.util.Range;
            import android.util.Size;
            import android.view.Surface;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            
            public final class Oll0I0l1i1 {
                public Object I00000oIO;
                public Size I00000oOI;
                public Iio1oiI I0000Il00O;
                public IIllOo0 I0000O;
                public boolean I0000oI00;
                public IIiOiI0il I0001Ioi1lo;
                public IIiOOI I000II;
                public IIiOiI0il I000O01llI0;
                public IIiOOI I000OOo1O;
                public IIiOOI I000OiO;
                public IoilI00 I000iOII;
                public I1lO00 I000l1;
                public Oll01O011O I000lI;
                public Executor I000o00OoI0I;

                static {
/* 1 */             Range range = I1lIoOIi.I000O01llI0;
                }

                public final void I00000oIO(Surface surface, Executor executor, IOo1llI iOo1llI) {
/* 1 */             IIiOiI0il iIiOiI0il = this.I0001Ioi1lo;
/* 7 */             if (!surface.isValid()) {
/* 12 */                Oll00ll oll00ll = new Oll00ll(0);
/* 15 */                oll00ll.I00iiI = iOo1llI;
/* 17 */                oll00ll.I00iiO = surface;
/* 19 */                VarHandle.storeStoreFence();
/* 22 */                executor.execute(oll00ll);
/* 25 */                return;
                    }
/* 32 */            if (this.I000II.I00000oOI(surface) || iIiOiI0il.isCancelled()) {
/* 88 */                IIiOiI0il iIiOiI0il2 = this.I000O01llI0;
/* 94 */                IIlio101Io iIlio101Io = new IIlio101Io(27);
/* 97 */                iIlio101Io.I00iiI = iOo1llI;
/* 99 */                iIlio101Io.I00iiO = surface;
/* 101 */               VarHandle.storeStoreFence();
/* 104 */               iIllIoiiIO.I00000oIO(iIiOiI0il2, iIlio101Io, executor);
/* 408 */               return;
                    }
/* 48 */            lII1OI11o1I.I0000oI00(null, iIiOiI0il.I00iiI.isDone());
                    try {
/* 51 */                iIiOiI0il.get();
/* 57 */                Oll00ll oll00ll2 = new Oll00ll(1);
/* 60 */                oll00ll2.I00iiI = iOo1llI;
/* 62 */                oll00ll2.I00iiO = surface;
/* 64 */                VarHandle.storeStoreFence();
/* 67 */                executor.execute(oll00ll2);
                    } catch (InterruptedException | ExecutionException unused) {
/* 74 */                Oll00ll oll00ll3 = new Oll00ll(2);
/* 77 */                oll00ll3.I00iiI = iOo1llI;
/* 79 */                oll00ll3.I00iiO = surface;
/* 81 */                VarHandle.storeStoreFence();
/* 84 */                executor.execute(oll00ll3);
                    }
                }

                public final void I00000oOI(Executor executor, Oll01O011O oll01O011O) {
                    I1lO00 i1lO00;
                    synchronized (this.I00000oIO) {
/* 4 */                 this.I000lI = oll01O011O;
/* 6 */                 this.I000o00OoI0I = executor;
/* 8 */                 i1lO00 = this.I000l1;
                    }
/* 11 */            if (i1lO00 != null) {
/* 16 */                Oll001o0olO oll001o0olO = new Oll001o0olO(1);
/* 19 */                oll001o0olO.I00iiI = oll01O011O;
/* 21 */                oll001o0olO.I00iiO = i1lO00;
/* 23 */                VarHandle.storeStoreFence();
/* 26 */                executor.execute(oll001o0olO);
                    }
                }

                public final boolean I0000Il00O() {
/* 11 */            return this.I000II.I0000O(new I1o1lOlooI1("Surface request will not complete.", 2));
                }
            }
