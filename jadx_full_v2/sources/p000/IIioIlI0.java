            package p000;

            import android.os.SystemClock;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            
            public final class IIioIlI0 {
                public Ii0110 I00000oIO;
                public Oo10IliO00O I00000oOI;
                public IIliIi1O0OiO I0000Il00O;
                public Io0oi0 I0000O;
                public OlioOlO1 I0000oI00;
                public IIioo1 I0001Ioi1lo;
                public IO0I000 I000II;
                public I1ii1o0 I000O01llI0;
                public OOiOlo1l0I0o I000OOo1O;
                public IIoI1li1o1l I000OiO;
                public Olli1lO0o0i0 I000iOII;
                public IIll0Oilo I000l1;
                public IIil1o0olooo I000lI;
                public OlOO00iI0lI I000o00OoI0I;
                public Object I000oI1ioi;
                public boolean I00100l0;
                public IIlOIi0oI1Io I00100o1O0lo;
                public IIo1i101Il1 I0010I0i;
                public IIlOloloOil I0010o;
                public Oo11iO1 I00111O;
                public OlIl0i I001IIilI0O;
                public IOi10loi I001IO000;
                public OoooIIOo10 I001i1O0Ol;
                public IO0Il0o1OI I001i1lo1io;
                public Map I001iOo1i0O;
                public OlIl0i I001l0I00;
                public OlIl0i I001lIiIIo1O;
                public OlIl0i I001lllioOl;

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IOoilo iOoilo) {
                    IIioIIo1I0l iIioIIo1I0l;
/* 3 */             if (iOoilo instanceof IIioIIo1I0l) {
/* 6 */                 iIioIIo1I0l = (IIioIIo1I0l) iOoilo;
/* 8 */                 int i = iIioIIo1I0l.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iIioIIo1I0l.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iIioIIo1I0l = new IIioIIo1I0l(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = iIioIIo1I0l.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iIioIIo1I0l.I00iiO;
/* 32 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(obj);
/* 50 */                toString();
                        synchronized (this.I000oI1ioi) {
/* 64 */                    if (O0000Ioio00.I0000O(this.I00100o1O0lo, IIlOIi0oI1Io.I00000oIO)) {
/* 66 */                        toString();
/* 69 */                        return Boolean.TRUE;
                            }
/* 83 */                    if (!O0000Ioio00.I0000O(this.I00100o1O0lo, IIlOIi0oI1Io.I00000oOI)) {
/* 104 */                       Log.w("CXCP", this + "#awaitClosed: Controller isn't closing!");
/* 107 */                       return Boolean.FALSE;
                            }
/* 112 */                   IOi10loi iOi10loi = this.I001IO000;
/* 114 */                   iIioIIo1I0l.I00iiO = 1;
/* 120 */                   if (iOi10loi.I0010o(iIioIIo1I0l) == ii0111o) {
/* 122 */                       return ii0111o;
                            }
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 42 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 36 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 123 */           return Boolean.TRUE;
                }

                public final void I00000oOI(IO0Il0o1OI iO0Il0o1OI, OoooIIOo10 ooooIIOo10) {
/* 11 */            OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(this.I00000oIO, null, null, new I1iIil1I(iO0Il0o1OI, ooooIIOo10, null, 7), 3);
/* 23 */            if (O0000Ioio00.I0000O(this.I00100o1O0lo, IIlOIi0oI1Io.I00000oOI)) {
/* 28 */                IIio00Io10 iIio00Io10 = new IIio00Io10(0);
/* 31 */                iIio00Io10.I00iiI = this;
/* 33 */                VarHandle.storeStoreFence();
/* 36 */                olIl0iI0000O.I00iiI(iIio00Io10);
                    }
                }

                public final boolean I0000Il00O() {
                    return O0000Ioio00.I0000O(this.I00100o1O0lo, IIlOIi0oI1Io.I00000oOI) || O0000Ioio00.I0000O(this.I00100o1O0lo, IIlOIi0oI1Io.I00000oIO);
                }

                public final void I0000O(IIo1i101Il1 iIo1i101Il1) {
/* 1 */             toString();
/* 8 */             IIllI0o.I0000Il00O(this.I0000Il00O.I00000oIO);
/* 11 */            Objects.toString(iIo1i101Il1);
                    synchronized (this.I000oI1ioi) {
                        try {
/* 21 */                    if (I0000Il00O()) {
/* 24 */                        return;
                            }
/* 27 */                    if ((iIo1i101Il1 instanceof IIo1Ill1I) || (iIo1i101Il1 instanceof IIo1O0l)) {
/* 38 */                        this.I0010I0i = iIo1i101Il1;
                            } else if (iIo1i101Il1 instanceof IIo1O0) {
/* 45 */                        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
/* 51 */                        Oo11iO1 oo11iO1 = new Oo11iO1();
/* 54 */                        oo11iO1.I00000oIO = jElapsedRealtimeNanos;
/* 56 */                        VarHandle.storeStoreFence();
/* 59 */                        this.I00111O = oo11iO1;
                            }
/* 61 */                    I000II();
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                public final void I0000oI00() {
/* 3 */             Ii0110 ii0110 = this.I00000oIO;
/* 5 */             Io0oi0 io0oi0 = this.I0000O;
/* 7 */             IIliIi1O0OiO iIliIi1O0OiO = this.I0000Il00O;
/* 17 */            if (I0000Il00O()) {
/* 36 */                Log.i("CXCP", "Ignoring start(): " + this + " is already closed");
/* 39 */                return;
                    }
/* 40 */            IIlOIi0oI1Io iIlOIi0oI1Io = this.I00100o1O0lo;
/* 42 */            IIlOIi0oI1Io iIlOIi0oI1Io2 = IIlOIi0oI1Io.I0000oI00;
/* 48 */            if (O0000Ioio00.I0000O(iIlOIi0oI1Io, iIlOIi0oI1Io2)) {
/* 67 */                Log.w("CXCP", "Ignoring start(): " + this + " is already started");
/* 70 */                return;
                    }
/* 71 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 72 */            this.I0010o = null;
/* 74 */            String str = iIliIi1O0OiO.I00000oIO;
/* 80 */            Set setSingleton = Collections.singleton(IIllI0o.I00000oIO(str));
/* 84 */            OOiOlo1l0I0o oOiOlo1l0I0o = this.I000OOo1O;
/* 94 */            List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(Oio0lI.I00000oOI(setSingleton, IIllI0o.I00000oIO(str)));
/* 101 */           IIio00Io10 iIio00Io10 = new IIio00Io10(1);
/* 104 */           iIio00Io10.I00iiI = this;
/* 106 */           VarHandle.storeStoreFence();
/* 111 */           Ii0110 ii01102 = oOiOlo1l0I0o.I0000O;
/* 113 */           OoooIIOo10 ooooIIOo10 = new OoooIIOo10();
/* 116 */           ooooIIOo10.I00000oIO = str;
/* 118 */           ooooIIOo10.I00000oOI = io0oi0;
/* 120 */           ooooIIOo10.I0000Il00O = ii01102;
/* 122 */           I1OollilIo i1OollilIo = OoooII0iI.I00000oIO;
/* 124 */           i1OollilIo.getClass();
/* 127 */           AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = I1OollilIo.I00000oOI;
/* 133 */           ooooIIOo10.I0000O = atomicIntegerFieldUpdater.incrementAndGet(i1OollilIo);
/* 140 */           ooooIIOo10.I0000oI00 = new Object();
/* 144 */           Oiolio oiolioI00000oOI = Oiolio0iO1.I00000oOI(3, 4, null);
/* 148 */           ooooIIOo10.I000O01llI0 = oiolioI00000oOI;
/* 154 */           ooooIIOo10.I000OOo1O = iIOIO0IO0l.I00000oIO(oiolioI00000oOI);
/* 156 */           IIo1II11 iIo1II11 = IIo1II11.I00000oIO;
/* 158 */           ooooIIOo10.I000OiO = iIo1II11;
/* 166 */           if (!oiolioI00000oOI.I0001Ioi1lo(iIo1II11)) {
/* 428 */               I000II.I001IO000("Check failed.");
/* 743 */               return;
                    }
/* 168 */           VarHandle.storeStoreFence();
/* 171 */           iOliil ioliil = oOiOlo1l0I0o.I0000oI00;
/* 175 */           Oi0O01 oi0O01 = new Oi0O01();
/* 178 */           oi0O01.I00000oIO = ooooIIOo10;
/* 180 */           oi0O01.I00000oOI = listI00iIi0i1o;
/* 182 */           oi0O01.I0000Il00O = io0oi0;
/* 184 */           oi0O01.I0000O = iIio00Io10;
/* 186 */           VarHandle.storeStoreFence();
/* 199 */           if (((IIIII1OI1) ioliil.I00iio).I000lI(oi0O01) instanceof IO10l0l0) {
/* 224 */               Log.e("CXCP", "Camera open request failed for " + ((Object) IIllI0o.I0000Il00O(str)) + '!');
/* 235 */               io0oi0.I00000oIO(new Io0oll10il(12, false));
/* 238 */               ooooIIOo10 = null;
                    }
/* 239 */           if (ooooIIOo10 == null) {
/* 260 */               Log.e("CXCP", "Failed to start " + this + ": Open request submission failed");
/* 263 */               return;
                    }
/* 266 */           if (this.I001i1O0Ol != null) {
/* 424 */               I000II.I001IO000("Check failed.");
/* 427 */               return;
                    }
/* 270 */           if (this.I001i1lo1io != null) {
/* 420 */               I000II.I001IO000("Check failed.");
/* 423 */               return;
                    }
/* 272 */           this.I001i1O0Ol = ooooIIOo10;
/* 276 */           IO0I000 io0i000 = this.I000II;
/* 278 */           I1ii1o0 i1ii1o0 = this.I000O01llI0;
/* 280 */           IIoI1li1o1l iIoI1li1o1l = this.I000OiO;
/* 282 */           IIliOiI iIliOiI = iIliIi1O0OiO.I000o00OoI0I;
/* 284 */           OlOO00iI0lI olOO00iI0lI = this.I000o00OoI0I;
/* 286 */           Oo10IliO00O oo10IliO00O = this.I00000oOI;
/* 288 */           IO0Il0o1OI iO0Il0o1OI = new IO0Il0o1OI();
/* 291 */           iO0Il0o1OI.I00000oIO = io0oi0;
/* 293 */           iO0Il0o1OI.I00000oOI = io0i000;
/* 295 */           iO0Il0o1OI.I0000Il00O = i1ii1o0;
/* 297 */           iO0Il0o1OI.I0000O = iIoI1li1o1l;
/* 299 */           iO0Il0o1OI.I0000oI00 = iIliOiI;
/* 301 */           iO0Il0o1OI.I0001Ioi1lo = olOO00iI0lI;
/* 303 */           iO0Il0o1OI.I000II = oo10IliO00O;
/* 305 */           iO0Il0o1OI.I000O01llI0 = ii0110;
/* 307 */           I1OollilIo i1OollilIo2 = IO0IlIOOolOl.I00000oIO;
/* 309 */           i1OollilIo2.getClass();
/* 316 */           iO0Il0o1OI.I000OOo1O = atomicIntegerFieldUpdater.incrementAndGet(i1OollilIo2);
/* 323 */           iO0Il0o1OI.I000OiO = new Object();
/* 331 */           iO0Il0o1OI.I000iOII = iOOOIOoiIlII.I0000O(Boolean.FALSE);
/* 342 */           iO0Il0o1OI.I000l1 = Collections.synchronizedMap(new HashMap());
/* 353 */           iO0Il0o1OI.I000lI = Collections.synchronizedMap(new HashMap());
/* 355 */           iO0Il0o1OI.I000oI1ioi = null;
/* 359 */           iO0Il0o1OI.I00111O = IO0I10o.I00iOIl;
/* 366 */           iO0Il0o1OI.I001IIilI0O = new CountDownLatch(1);
/* 373 */           iO0Il0o1OI.I001i1O0Ol = new CountDownLatch(1);
/* 380 */           iO0Il0o1OI.I001iOo1i0O = new LinkedHashMap();
/* 382 */           VarHandle.storeStoreFence();
/* 385 */           this.I001i1lo1io = iO0Il0o1OI;
/* 387 */           Map map = this.I001iOo1i0O;
/* 389 */           if (map != null) {
/* 391 */               iO0Il0o1OI.I0000O(map);
                    }
/* 394 */           this.I00100o1O0lo = iIlOIi0oI1Io2;
/* 396 */           toString();
/* 399 */           OlIl0i olIl0i = this.I001l0I00;
/* 401 */           if (olIl0i != null) {
/* 403 */               olIl0i.I000II(null);
                    }
/* 417 */           this.I001l0I00 = iOi1II01i0.I0000O(ii0110, null, null, new IIio11lIO(this, iOoil1iiIilo, 2), 3);
                }

                public final void I0001Ioi1lo() {
/* 9 */             if (I0000Il00O()) {
/* 28 */                Log.w("CXCP", "Ignoring stop(): " + this + " is already closed");
/* 31 */                return;
                    }
/* 32 */            IIlOIi0oI1Io iIlOIi0oI1Io = this.I00100o1O0lo;
/* 34 */            IIlOIi0oI1Io iIlOIi0oI1Io2 = IIlOIi0oI1Io.I000II;
/* 40 */            if (O0000Ioio00.I0000O(iIlOIi0oI1Io, iIlOIi0oI1Io2) || O0000Ioio00.I0000O(this.I00100o1O0lo, IIlOIi0oI1Io.I0001Ioi1lo)) {
/* 88 */                Log.w("CXCP", "Ignoring stop(): " + this + " already stopping or stopped");
/* 110 */               return;
                    }
/* 53 */            OoooIIOo10 ooooIIOo10 = this.I001i1O0Ol;
/* 55 */            IO0Il0o1OI iO0Il0o1OI = this.I001i1lo1io;
/* 58 */            this.I001i1O0Ol = null;
/* 60 */            this.I001i1lo1io = null;
/* 62 */            this.I00100o1O0lo = iIlOIi0oI1Io2;
/* 64 */            toString();
/* 67 */            I00000oOI(iO0Il0o1OI, ooooIIOo10);
                }

                public final void I000II() {
/* 1 */             long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
/* 5 */             IIlOIi0oI1Io iIlOIi0oI1Io = this.I00100o1O0lo;
/* 7 */             IIlOloloOil iIlOloloOil = this.I0010o;
/* 9 */             IIo1i101Il1 iIo1i101Il1 = this.I0010I0i;
/* 11 */            Oo11iO1 oo11iO1 = this.I00111O;
/* 16 */            boolean z = false;
/* 30 */            boolean z2 = (iIo1i101Il1 instanceof IIo1Ill1I) && (iIlOloloOil == null || iIlOloloOil.I00000oIO != 3);
/* 31 */            if (oo11iO1 != null) {
/* 36 */                long j = jElapsedRealtimeNanos - oo11iO1.I00000oIO;
/* 43 */                if (j == 200000000 || j < 200000000) {
/* 48 */                    z = true;
                        }
                    }
/* 55 */            if (!iIlOIi0oI1Io.equals(IIlOIi0oI1Io.I0000Il00O) ? iIlOIi0oI1Io.equals(IIlOIi0oI1Io.I0000O) && z2 && ((iIlOloloOil == null || iIlOloloOil.I00000oIO != 9) && (iIlOloloOil == null || iIlOloloOil.I00000oIO != 8)) : z2 || z) {
/* 133 */               toString();
/* 138 */               Objects.toString(this.I00100o1O0lo);
/* 143 */               Objects.toString(this.I0010o);
/* 148 */               Objects.toString(this.I0010I0i);
/* 153 */               Objects.toString(this.I00111O);
/* 156 */               Oo11iO1.I00000oIO(jElapsedRealtimeNanos);
/* 245 */               return;
                    }
/* 106 */           long j2 = this.I0000Il00O.I000o00OoI0I.I0001Ioi1lo ? 700L : 0L;
/* 109 */           OlIl0i olIl0i = this.I001IIilI0O;
/* 111 */           IOoil1iiIilo iOoil1iiIilo = null;
/* 112 */           if (olIl0i != null) {
/* 114 */               olIl0i.I000II(null);
                    }
/* 130 */           this.I001IIilI0O = iOi1II01i0.I0000O(this.I00000oIO, null, null, new I10I1l(j2, this, iOoil1iiIilo, 1), 3);
                }

                public final String toString() {
/* 18 */            return "Camera2CameraController(" + this.I000l1 + ')';
                }
            }
