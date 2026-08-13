            package p000;

            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.Callable;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.locks.ReentrantLock;
            
            public abstract class Oi1oIiOiIi0 {
                public IIOlO1ii I00000oIO;
                public Ii00l101O I00000oOI;
                public Executor I0000Il00O;
                public OilOol I0000O;
                public I0Oi111ii I0000oI00;
                public O00IOI11 I0001Ioi1lo;
                public final IIlio101Io I000II;
                public boolean I000O01llI0;
                public final ThreadLocal I000OOo1O;
                public final LinkedHashMap I000OiO;
                public boolean I000iOII;

                public Oi1oIiOiIi0() {
/* 7 */             IIlio101Io iIlio101Io = new IIlio101Io(7);
/* 16 */            iIlio101Io.I00iiI = new AtomicInteger(0);
/* 23 */            iIlio101Io.I00iiO = new AtomicBoolean(false);
/* 25 */            VarHandle.storeStoreFence();
/* 28 */            this.I000II = iIlio101Io;
/* 35 */            this.I000OOo1O = new ThreadLocal();
/* 42 */            this.I000OiO = new LinkedHashMap();
/* 45 */            this.I000iOII = true;
                }

                public final void I00000oIO() {
/* 3 */             if (this.I000O01llI0) {
/* 25 */                return;
                    }
/* 23 */            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
/* 28 */                I000II.I001IO000("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
                    }
                }

                public final void I00000oOI() {
/* 1 */             I00000oIO();
/* 4 */             I00000oIO();
/* 11 */            Olil0l0 olil0l0I00Oio = I000II().I00Oio();
/* 19 */            if (!olil0l0I00Oio.I00li1OI()) {
/* 32 */                lO00OiilOI0l.I00000oIO(new O00IIolO0(I0001Ioi1lo(), null, 2));
                    }
/* 39 */            if (olil0l0I00Oio.I00o0l1o1o0()) {
/* 41 */                olil0l0I00Oio.I00OI1();
                    } else {
/* 45 */                olil0l0I00Oio.I0010o();
                    }
                }

                public List I0000Il00O(LinkedHashMap linkedHashMap) {
/* 11 */            LinkedHashMap linkedHashMap2 = new LinkedHashMap(O1Oii0o0Oi.I00000oIO(linkedHashMap.size()));
/* 28 */            for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 52 */                linkedHashMap2.put(((IOIO10iOi1) ((O0IOli0o0) entry.getKey())).I001l0I00(), entry.getValue());
                    }
/* 56 */            return Il01100l.I00iOIl;
                }

                public abstract O00IOI11 I0000O();

                public IioliO10l I0000oI00() {
/* 20 */            throw new OIO01O();
                }

                public final O00IOI11 I0001Ioi1lo() {
/* 1 */             O00IOI11 o00ioi11 = this.I0001Ioi1lo;
/* 3 */             if (o00ioi11 != null) {
/* 5 */                 return o00ioi11;
                    }
/* 8 */             O0000Ioio00.I000OOo1O("internalTracker");
/* 20 */            throw null;
                }

                public final Olil10OiIi1l I000II() {
/* 1 */             I0Oi111ii i0Oi111ii = this.I0000oI00;
/* 4 */             if (i0Oi111ii == null) {
/* 21 */                O0000Ioio00.I000OOo1O("connectionManager");
/* 55 */                throw null;
                    }
/* 8 */             Olil10OiIi1l olil10OiIi1l = (Olil10OiIi1l) i0Oi111ii.I00ilO0;
/* 10 */            if (olil10OiIi1l != null) {
/* 12 */                return olil10OiIi1l;
                    }
/* 15 */            I000II.I001IO000("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
/* 3 */             return null;
                }

                public final Ii00l101O I000O01llI0() {
/* 1 */             IIOlO1ii iIOlO1ii = this.I00000oIO;
/* 3 */             if (iIOlO1ii != null) {
/* 5 */                 return iIOlO1ii.I00iiI;
                    }
/* 10 */            O0000Ioio00.I000OOo1O("coroutineScope");
/* 20 */            throw null;
                }

                public Set I000OOo1O() {
/* 14 */            return IOOi0Ool1i.I00iio(new ArrayList(IOOi1I.I0000O(Il01llIol0.I00iOIl, 10)));
                }

                public LinkedHashMap I000OiO() {
/* 9 */             int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(Il01llIol0.I00iOIl, 10));
/* 15 */            if (iI00000oIO < 16) {
/* 17 */                iI00000oIO = 16;
                    }
/* 20 */            return new LinkedHashMap(iI00000oIO);
                }

                public final boolean I000iOII() {
/* 1 */             I0Oi111ii i0Oi111ii = this.I0000oI00;
/* 3 */             if (i0Oi111ii != null) {
                        return ((Olil10OiIi1l) i0Oi111ii.I00ilO0) != null;
                    }
/* 17 */            O0000Ioio00.I000OOo1O("connectionManager");
/* 55 */            throw null;
                }

                public final boolean I000l1() {
                    return I000oI1ioi() && I000II().I00Oio().I00li1OI();
                }

                public final void I000lI() {
/* 9 */             I000II().I00Oio().I00OloOo();
/* 16 */            if (I000l1()) {
/* 55 */                return;
                    }
/* 18 */            O00IOI11 o00ioi11I0001Ioi1lo = I0001Ioi1lo();
/* 28 */            o00ioi11I0001Ioi1lo.I00000oOI.I000II(o00ioi11I0001Ioi1lo.I0000oI00, o00ioi11I0001Ioi1lo.I0001Ioi1lo);
                }

                public final void I000o00OoI0I(Olil0III olil0III) {
/* 1 */             O00IOI11 o00ioi11I0001Ioi1lo = I0001Ioi1lo();
/* 5 */             OoIlIoo1oiOo ooIlIoo1oiOo = o00ioi11I0001Ioi1lo.I00000oOI;
/* 7 */             ooIlIoo1oiOo.getClass();
/* 12 */            OiIIl0O1l0l oiIIl0O1l0lI00000oIO = olil0III.I00000oIO("PRAGMA query_only");
                    try {
/* 16 */                oiIIl0O1l0lI00000oIO.I00ol1();
/* 19 */                boolean zI00O0i0ii = oiIIl0O1l0lI00000oIO.I00O0i0ii();
/* 24 */                iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, null);
/* 27 */                if (!zI00O0i0ii) {
/* 31 */                    lO0I0Io.I00000oIO(olil0III, "PRAGMA temp_store = MEMORY");
/* 36 */                    lO0I0Io.I00000oIO(olil0III, "PRAGMA recursive_triggers = 1");
/* 41 */                    lO0I0Io.I00000oIO(olil0III, "DROP TABLE IF EXISTS room_table_modification_log");
/* 46 */                    if (ooIlIoo1oiOo.I00iiI) {
/* 50 */                        lO0I0Io.I00000oIO(olil0III, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                            } else {
/* 64 */                        lO0I0Io.I00000oIO(olil0III, OlOolloIIOl0.I000iOII("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                            }
/* 69 */                    OIOiiiloOio oIOiiiloOio = (OIOiiiloOio) ooIlIoo1oiOo.I00ioIO;
/* 71 */                    ReentrantLock reentrantLock = oIOiiiloOio.I00000oIO;
/* 73 */                    reentrantLock.lock();
                            try {
/* 77 */                        oIOiiiloOio.I0000O = true;
                            } finally {
/* 84 */                        reentrantLock.unlock();
                            }
                        }
                        synchronized (o00ioi11I0001Ioi1lo.I000O01llI0) {
                        }
                    } finally {
                    }
                }

                public final boolean I000oI1ioi() {
/* 1 */             I0Oi111ii i0Oi111ii = this.I0000oI00;
/* 3 */             if (i0Oi111ii == null) {
/* 20 */                O0000Ioio00.I000OOo1O("connectionManager");
/* 55 */                throw null;
                    }
/* 7 */             Olil0l0 olil0l0 = (Olil0l0) i0Oi111ii.I00io1l;
/* 9 */             if (olil0l0 != null) {
/* 11 */                return olil0l0.isOpen();
                    }
/* 16 */            return false;
                }

                public final Object I00100l0(IllOOo00lI illOOo00lI) {
/* 5 */             if (!I000iOII()) {
/* 30 */                I11i0ol0l0 i11i0ol0l0 = new I11i0ol0l0(11);
/* 33 */                i11i0ol0l0.I00iiI = illOOo00lI;
/* 35 */                VarHandle.storeStoreFence();
/* 40 */                return il01ioIoI.I00000oOI(this, false, true, i11i0ol0l0);
                    }
/* 7 */             I00000oOI();
                    try {
/* 10 */                Object objInvoke = illOOo00lI.invoke();
/* 14 */                I0010o();
/* 20 */                return objInvoke;
                    } finally {
/* 22 */                I000lI();
                    }
                }

                public final Object I00100o1O0lo(Callable callable) {
/* 5 */             OIOo1iiI oIOo1iiI = new OIOo1iiI(15);
/* 8 */             oIOo1iiI.I00iiI = callable;
/* 10 */            VarHandle.storeStoreFence();
/* 13 */            return I00100l0(oIOo1iiI);
                }

                public final void I0010I0i(Runnable runnable) {
/* 5 */             OIOo1iiI oIOo1iiI = new OIOo1iiI(16);
/* 8 */             oIOo1iiI.I00iiI = runnable;
/* 10 */            VarHandle.storeStoreFence();
/* 13 */            I00100l0(oIOo1iiI);
                }

                public final void I0010o() {
/* 9 */             I000II().I00Oio().I00O10llo();
                }

                public final Object I00111O(boolean z, IlliIl1l11O illiIl1l11O, IOoilo iOoilo) {
/* 1 */             I0Oi111ii i0Oi111ii = this.I0000oI00;
/* 3 */             IOoil1iiIilo iOoil1iiIilo = null;
/* 4 */             if (i0Oi111ii == null) {
/* 92 */                O0000Ioio00.I000OOo1O("connectionManager");
/* 98 */                throw null;
                    }
/* 8 */             OO01l1 oO01l1 = (OO01l1) i0Oi111ii.I00ilI0I1;
/* 10 */            oO01l1.getClass();
/* 23 */            OO01iO010O oO01iO010O = (OO01iO010O) iOoilo.getContext().I00lli11(OO01iO010O.I00iiI);
/* 30 */            OO01Ol oO01Ol = oO01iO010O != null ? oO01iO010O.I00iOIl : null;
/* 31 */            if (oO01Ol != null) {
/* 33 */                return illiIl1l11O.invoke(oO01Ol, iOoilo);
                    }
/* 40 */            IliI1Ii1II iliI1Ii1II = oO01l1.I00iiO;
/* 48 */            Olil0III olil0III = (Olil0III) oO01l1.I00iio.getValue();
/* 50 */            OO01Ol oO01Ol2 = new OO01Ol();
/* 53 */            oO01Ol2.I00000oIO = iliI1Ii1II;
/* 55 */            oO01Ol2.I00000oOI = olil0III;
/* 63 */            oO01Ol2.I0000Il00O = new AtomicInteger(0);
/* 65 */            VarHandle.storeStoreFence();
/* 70 */            OO01iO010O oO01iO010O2 = new OO01iO010O();
/* 73 */            oO01iO010O2.I00iOIl = oO01Ol2;
/* 75 */            VarHandle.storeStoreFence();
/* 85 */            return iOi1II01i0.I0000oI00(oO01iO010O2, new O1iIlllIoo(illiIl1l11O, oO01Ol2, iOoil1iiIilo, 9), iOoilo);
                }
            }
