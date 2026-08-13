            package p000;

            import android.hardware.camera2.CameraDevice;
            import android.os.SystemClock;
            import android.os.Trace;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.concurrent.CountDownLatch;
            
            public final class I0lIllO extends CameraDevice.StateCallback {
                public String I00000oIO;
                public IIlo0i0ll I00000oOI;
                public int I0000Il00O;
                public long I0000O;
                public Olli1lO0o0i0 I0000oI00;
                public IIl0l10l I0001Ioi1lo;
                public IIl0O0iioOO I000II;
                public IIl10I1 I000O01llI0;
                public Oo10IliO00O I000OOo1O;
                public I1iIilO0io01 I000OiO;
                public CameraDevice.StateCallback I000iOII;
                public I1I0i0Ilo1Oi I000l1;
                public int I000lI;
                public Object I000o00OoI0I;
                public boolean I000oI1ioi;
                public I0lIliiI I00100l0;
                public CountDownLatch I00100o1O0lo;
                public long I0010I0i;
                public Oo11iO1 I0010o;
                public OlO0OIIl1 I00111O;

                public final void I00000oIO() {
/* 7 */             IIo0l10O01O0 iIo0l10O01O0 = (IIo0l10O01O0) this.I00111O.getValue();
/* 19 */            IIlOl1oOlo1o iIlOl1oOlo1o = iIo0l10O01O0 instanceof IIo0olOi0li ? ((IIo0olOi0li) iIo0l10O01O0).I00000oIO : null;
/* 47 */            I00000oOI(iIlOl1oOlo1o != null ? (CameraDevice) iIlOl1oOlo1o.I00l0I0l0lO1(OOoOl0i.I00000oIO.I00000oOI(CameraDevice.class)) : null, new I0lIliiI(IOO1iloOl.I00iOIl, null, null, 14));
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oOI(CameraDevice cameraDevice, I0lIliiI i0lIliiI) {
/* 7 */             IIo0l10O01O0 iIo0l10O01O0 = (IIo0l10O01O0) this.I00111O.getValue();
/* 19 */            IIlOl1oOlo1o iIlOl1oOlo1o = iIo0l10O01O0 instanceof IIo0olOi0li ? ((IIo0olOi0li) iIo0l10O01O0).I00000oIO : null;
                    synchronized (this.I000o00OoI0I) {
/* 25 */                if (this.I00100l0 == null) {
/* 27 */                    this.I00100l0 = i0lIliiI;
/* 31 */                    if (this.I000oI1ioi) {
/* 36 */                        i0lIliiI = null;
                            }
                        }
                    }
/* 38 */            if (i0lIliiI != null) {
/* 40 */                IIlOloloOil iIlOloloOil = i0lIliiI.I0000Il00O;
/* 42 */                if (iIlOloloOil != null && i0lIliiI.I00000oIO != IOO1iloOl.I00ilO0) {
/* 57 */                    this.I0001Ioi1lo.I00000oIO(false, this.I00000oIO, iIlOloloOil.I00000oIO);
                        }
/* 60 */                OlO0OIIl1 olO0OIIl1 = this.I00111O;
/* 66 */                IIo0oOllO iIo0oOllO = new IIo0oOllO(i0lIliiI.I0000Il00O);
/* 69 */                olO0OIIl1.getClass();
/* 72 */                olO0OIIl1.I000lI(null, iIo0oOllO);
/* 79 */                if (i0lIliiI.I00000oIO != IOO1iloOl.I00iiO) {
/* 83 */                    OlOl1I olOl1I = this.I000O01llI0.I00000oOI;
/* 89 */                    this.I000II.I00000oIO(iIlOl1oOlo1o, cameraDevice, this, this.I000OiO);
                        }
/* 92 */                OlO0OIIl1 olO0OIIl12 = this.I00111O;
/* 94 */                IIo0oOi01o1 iIo0oOi01o1I0000Il00O = I0000Il00O(i0lIliiI);
/* 98 */                olO0OIIl12.getClass();
/* 101 */               olO0OIIl12.I000lI(null, iIo0oOi01o1I0000Il00O);
                    }
                }

                public final IIo0oOi01o1 I0000Il00O(I0lIliiI i0lIliiI) {
/* 7 */             this.I0000oI00.getClass();
/* 10 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
/* 14 */            Oo11iO1 oo11iO1 = this.I0010o;
/* 16 */            long j = i0lIliiI.I00000oOI;
/* 32 */            Iio1ilIOl10o iio1ilIOl10oI00000oIO = oo11iO1 != null ? Iio1ilIOl10o.I00000oIO(oo11iO1.I00000oIO - this.I0000O) : null;
/* 46 */            Iio1ilIOl10o iio1ilIOl10oI00000oIO2 = oo11iO1 != null ? Iio1ilIOl10o.I00000oIO(oo11iO1.I00000oIO - this.I0010I0i) : null;
/* 56 */            Iio1ilIOl10o iio1ilIOl10oI00000oIO3 = oo11iO1 != null ? Iio1ilIOl10o.I00000oIO(j - oo11iO1.I00000oIO) : null;
/* 86 */            return new IIo0oOi01o1(this.I00000oIO, i0lIliiI.I00000oIO, Integer.valueOf(this.I0000Il00O - 1), iio1ilIOl10oI00000oIO, i0lIliiI.I0000O, iio1ilIOl10oI00000oIO2, iio1ilIOl10oI00000oIO3, Iio1ilIOl10o.I00000oIO(jElapsedRealtimeNanos - j), i0lIliiI.I0000Il00O);
                }

                @Override
                public final void onClosed(CameraDevice cameraDevice) {
/* 11 */            if (!O0000Ioio00.I0000O(cameraDevice.getId(), this.I00000oIO)) {
/* 82 */                I000II.I001IO000("Check failed.");
/* 168 */               return;
                    }
/* 15 */            IIllI0o.I0000Il00O(this.I00000oIO);
/* 20 */            this.I00100o1O0lo.countDown();
                    synchronized (this.I000o00OoI0I) {
                    }
/* 50 */            Trace.beginSection(((Object) IIllI0o.I0000Il00O(this.I00000oIO)) + "#onFinalized");
/* 53 */            toString();
/* 66 */            I00000oOI(cameraDevice, new I0lIliiI(IOO1iloOl.I00iiO, null, null, 14));
/* 69 */            CameraDevice.StateCallback stateCallback = this.I000iOII;
/* 71 */            if (stateCallback != null) {
/* 73 */                stateCallback.onClosed(cameraDevice);
                    }
/* 76 */            Trace.endSection();
                }

                @Override
                public final void onDisconnected(CameraDevice cameraDevice) {
/* 1 */             String id = cameraDevice.getId();
/* 5 */             String str = this.I00000oIO;
/* 11 */            if (!O0000Ioio00.I0000O(id, str)) {
/* 76 */                I000II.I001IO000("Check failed.");
/* 168 */               return;
                    }
/* 34 */            Trace.beginSection(((Object) IIllI0o.I0000Il00O(str)) + "#onDisconnected");
/* 37 */            IIllI0o.I0000Il00O(str);
/* 42 */            this.I00100o1O0lo.countDown();
/* 60 */            I00000oOI(cameraDevice, new I0lIliiI(IOO1iloOl.I00iio, IIlOloloOil.I00000oIO(6), null, 10));
/* 63 */            CameraDevice.StateCallback stateCallback = this.I000iOII;
/* 65 */            if (stateCallback != null) {
/* 67 */                stateCallback.onDisconnected(cameraDevice);
                    }
/* 70 */            Trace.endSection();
                }

                @Override
                public final void onError(CameraDevice cameraDevice, int i) {
/* 1 */             String id = cameraDevice.getId();
/* 5 */             String str = this.I00000oIO;
/* 11 */            if (!O0000Ioio00.I0000O(id, str)) {
/* 104 */               I000II.I001IO000("Check failed.");
/* 332 */               return;
                    }
/* 37 */            Trace.beginSection(((Object) IIllI0o.I0000Il00O(str)) + "#onError-" + i);
/* 40 */            IIllI0o.I0000Il00O(str);
/* 45 */            this.I00100o1O0lo.countDown();
/* 50 */            IOO1iloOl iOO1iloOl = IOO1iloOl.I00ilI0I1;
/* 52 */            int i2 = 1;
/* 53 */            if (i != 1) {
/* 55 */                i2 = 2;
/* 56 */                if (i != 2) {
/* 58 */                    i2 = 3;
/* 59 */                    if (i != 3) {
/* 61 */                        i2 = 4;
/* 62 */                        if (i != 4) {
/* 64 */                            i2 = 5;
/* 65 */                            if (i != 5) {
/* 74 */                                I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "Unexpected StateCallback error code: "));
/* 77 */                                return;
                                    }
                                }
                            }
                        }
                    }
/* 88 */            I00000oOI(cameraDevice, new I0lIliiI(iOO1iloOl, IIlOloloOil.I00000oIO(i2), null, 10));
/* 91 */            CameraDevice.StateCallback stateCallback = this.I000iOII;
/* 93 */            if (stateCallback != null) {
/* 95 */                stateCallback.onError(cameraDevice, i);
                    }
/* 98 */            Trace.endSection();
                }

                @Override
                public final void onOpened(CameraDevice cameraDevice) {
                    String strI000lI;
                    I0lIliiI i0lIliiI;
                    I0lIliiI i0lIliiI2;
/* 11 */            if (!O0000Ioio00.I0000O(cameraDevice.getId(), this.I00000oIO)) {
/* 407 */               I000II.I001IO000("Check failed.");
/* 437 */               return;
                    }
/* 15 */            this.I0000oI00.getClass();
/* 18 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
/* 24 */            Oo11iO1 oo11iO1 = new Oo11iO1();
/* 27 */            oo11iO1.I00000oIO = jElapsedRealtimeNanos;
/* 29 */            VarHandle.storeStoreFence();
/* 32 */            this.I0010o = oo11iO1;
/* 57 */            Trace.beginSection(((Object) IIllI0o.I0000Il00O(this.I00000oIO)) + "#onOpened");
/* 64 */            long j = jElapsedRealtimeNanos - this.I0010I0i;
/* 68 */            long j2 = jElapsedRealtimeNanos - this.I0000O;
/* 69 */            int i = this.I0000Il00O;
/* 71 */            String str = this.I00000oIO;
/* 79 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 80 */            if (i == 1) {
/* 124 */               strI000lI = "Opened " + ((Object) IIllI0o.I0000Il00O(str)) + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000000.0d)}, 1));
                    } else {
/* 133 */               StringBuilder sb = new StringBuilder("Opened ");
/* 140 */               sb.append((Object) IIllI0o.I0000Il00O(str));
/* 145 */               sb.append(" in ");
/* 168 */               sb.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000000.0d)}, 1)));
/* 173 */               sb.append(" (");
/* 196 */               sb.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j2 / 1000000.0d)}, 1)));
/* 201 */               sb.append(" total) after ");
/* 208 */               strI000lI = IIl001iO0Io.I000lI(this.I0000Il00O, " attempts.", sb);
                    }
/* 212 */           Log.i("CXCP", strI000lI);
                    synchronized (this.I000o00OoI0I) {
/* 218 */               i0lIliiI = this.I00100l0;
/* 220 */               if (i0lIliiI == null) {
/* 222 */                   this.I000oI1ioi = true;
                        }
                    }
/* 229 */           CameraDevice.StateCallback stateCallback = this.I000iOII;
/* 231 */           if (stateCallback != null) {
/* 233 */               stateCallback.onOpened(cameraDevice);
                    }
/* 236 */           if (i0lIliiI != null) {
/* 238 */               IIl0O0iioOO iIl0O0iioOO = this.I000II;
/* 240 */               I1iIilO0io01 i1iIilO0io01 = this.I000OiO;
/* 244 */               OlOl1I olOl1I = this.I000O01llI0.I00000oOI;
/* 246 */               iIl0O0iioOO.I00000oIO(null, cameraDevice, this, i1iIilO0io01);
/* 249 */               return;
                    }
/* 252 */           IIlo0i0ll iIlo0i0ll = this.I00000oOI;
/* 254 */           String str2 = this.I00000oIO;
/* 256 */           IIl0l10l iIl0l10l = this.I0001Ioi1lo;
/* 258 */           I1I0i0Ilo1Oi i1I0i0Ilo1Oi = this.I000l1;
/* 260 */           Oo10IliO00O oo10IliO00O = this.I000OOo1O;
/* 262 */           I0lIi00oO i0lIi00oO = new I0lIi00oO();
/* 265 */           i0lIi00oO.I00iOIl = iIlo0i0ll;
/* 267 */           i0lIi00oO.I00iiI = cameraDevice;
/* 269 */           i0lIi00oO.I00iiO = str2;
/* 271 */           i0lIi00oO.I00iio = iIl0l10l;
/* 273 */           i0lIi00oO.I00ilI0I1 = i1I0i0Ilo1Oi;
/* 275 */           i0lIi00oO.I00ilO0 = oo10IliO00O;
/* 277 */           int i2 = 0;
/* 282 */           i0lIi00oO.I00io1l = iOOOIOoiIlII.I00000oIO(false);
/* 288 */           i0lIi00oO.I00ioIO = iOOOIOoiIlII.I0000O(null);
/* 290 */           VarHandle.storeStoreFence();
/* 293 */           I1iIilO0io01 i1iIilO0io012 = this.I000OiO;
                    synchronized (i1iIilO0io012.I0000Il00O) {
/* 300 */               i1iIilO0io012.I0000oI00.add(i0lIi00oO);
/* 303 */               I1iIilil i1iIililI00000oIO = i1iIilO0io012.I00000oIO();
/* 307 */               if (i1iIililI00000oIO != null) {
/* 326 */                   iOi1II01i0.I0000O(i1iIilO0io012.I00000oIO, null, Ii01I10.I00iio, new O1o1iI(i1iIilO0io012.I00000oOI, new I1iIil1I(i0lIi00oO, i1iIililI00000oIO, iOoil1iiIilo, i2), iOoil1iiIilo, 2), 1);
                        }
                    }
/* 333 */           OlO0OIIl1 olO0OIIl1 = this.I00111O;
/* 337 */           IIo0olOi0li iIo0olOi0li = new IIo0olOi0li(i0lIi00oO);
/* 340 */           olO0OIIl1.getClass();
/* 343 */           olO0OIIl1.I000lI(null, iIo0olOi0li);
                    synchronized (this.I000o00OoI0I) {
/* 349 */               this.I000oI1ioi = false;
/* 351 */               i0lIliiI2 = this.I00100l0;
                    }
/* 354 */           if (i0lIliiI2 != null) {
/* 356 */               OlO0OIIl1 olO0OIIl12 = this.I00111O;
/* 362 */               IIo0oOllO iIo0oOllO = new IIo0oOllO(i0lIliiI2.I0000Il00O);
/* 365 */               olO0OIIl12.getClass();
/* 368 */               olO0OIIl12.I000lI(null, iIo0oOllO);
/* 371 */               IIl0O0iioOO iIl0O0iioOO2 = this.I000II;
/* 373 */               I1iIilO0io01 i1iIilO0io013 = this.I000OiO;
/* 377 */               OlOl1I olOl1I2 = this.I000O01llI0.I00000oOI;
/* 379 */               iIl0O0iioOO2.I00000oIO(i0lIi00oO, cameraDevice, this, i1iIilO0io013);
/* 382 */               OlO0OIIl1 olO0OIIl13 = this.I00111O;
/* 384 */               IIo0oOi01o1 iIo0oOi01o1I0000Il00O = I0000Il00O(i0lIliiI2);
/* 388 */               olO0OIIl13.getClass();
/* 391 */               olO0OIIl13.I000lI(null, iIo0oOi01o1I0000Il00O);
                    }
/* 394 */           Trace.endSection();
                }

                public final String toString() {
/* 13 */            return "CameraState-" + this.I000lI;
                }
            }
