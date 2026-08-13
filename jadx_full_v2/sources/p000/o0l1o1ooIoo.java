            package p000;

            import com.google.mlkit.vision.barcode.internal.zze;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class o0l1o1ooIoo {
                public static final Io0Ool I0010o = new Io0Ool("AutoZoom", null);
                public o0il1lO01O0 I00000oIO;
                public AtomicBoolean I00000oOI;
                public Object I0000Il00O;
                public iii1IlooII I0000O;
                public ScheduledExecutorService I0000oI00;
                public iO11101I I0001Ioi1lo;
                public o0OiOio I000II;
                public String I000O01llI0;
                public Executor I000OOo1O;
                public float I000OiO;
                public float I000iOII;
                public long I000l1;
                public long I000lI;
                public ScheduledFuture I000o00OoI0I;
                public String I000oI1ioi;
                public boolean I00100l0;
                public int I00100o1O0lo;
                public zze I0010I0i;

                public final long I00000oIO() {
                    long jI00000oIO;
                    synchronized (this.I0000Il00O) {
/* 16 */                jI00000oIO = (this.I0001Ioi1lo.I00000oIO() - this.I000l1) / 1000000;
                    }
/* 18 */            return jI00000oIO;
                }

                public final void I00000oOI(float f, lliOo1oo llioo1oo, o0iloil o0iloilVar) {
                    ili1II ili1ii;
                    synchronized (this.I0000Il00O) {
                        try {
/* 6 */                     if (this.I000OOo1O != null && this.I0010I0i != null && this.I00100o1O0lo == 2) {
/* 22 */                        int i = 0;
/* 27 */                        if (this.I00000oOI.compareAndSet(false, true)) {
/* 33 */                            float f2 = this.I000OiO;
/* 37 */                            o0ioiOl00i o0ioiol00i = new o0ioiOl00i();
/* 40 */                            o0ioiol00i.I00000oIO = this;
/* 42 */                            o0ioiol00i.I00000oOI = f;
/* 44 */                            VarHandle.storeStoreFence();
/* 49 */                            io0Oi10oi io0oi10oi = new io0Oi10oi();
/* 57 */                            io0oi10oi.I00ioIO = new ii1000i10O(io0oi10oi, o0ioiol00i);
/* 59 */                            io0oi10oi.run();
/* 64 */                            o0l1Ii o0l1ii = new o0l1Ii();
/* 67 */                            o0l1ii.I00000oIO = llioo1oo;
/* 69 */                            o0l1ii.I00000oOI = f2;
/* 71 */                            o0l1ii.I0000Il00O = o0iloilVar;
/* 73 */                            o0l1ii.I0000O = f;
/* 75 */                            o0l1ii.I0000oI00 = this;
/* 77 */                            VarHandle.storeStoreFence();
/* 82 */                            illioiliioi illioiliioiVar = new illioiliioi(i);
/* 85 */                            illioiliioiVar.I00iiI = io0oi10oi;
/* 87 */                            illioiliioiVar.I00iiO = o0l1ii;
/* 89 */                            VarHandle.storeStoreFence();
/* 92 */                            ill1100Oii ill1100oii = ill1100Oii.I00iOIl;
/* 98 */                            if (io0oi10oi.isDone() || (ili1ii = io0oi10oi.I00iiI) == ili1II.I0000O) {
/* 132 */                               iliIlI0o00ii.I0000oI00(illioiliioiVar, ill1100oii);
                                    } else {
/* 108 */                               ili1II ili1ii2 = new ili1II();
/* 111 */                               ili1ii2.I00000oIO = illioiliioiVar;
/* 113 */                               ili1ii2.I00000oOI = ill1100oii;
/* 130 */                               do {
/* 115 */                                   ili1ii2.I0000Il00O = ili1ii;
/* 123 */                                   if (!iliIlI0o00ii.I00ilO0.I0000oI00(io0oi10oi, ili1ii, ili1ii2)) {
/* 126 */                                       ili1ii = io0oi10oi.I00iiI;
                                            }
/* 130 */                               } while (ili1ii != ili1II.I0000O);
/* 132 */                               iliIlI0o00ii.I0000oI00(illioiliioiVar, ill1100oii);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }

                public final void I0000Il00O(boolean z) {
                    synchronized (this.I0000Il00O) {
                        try {
/* 4 */                     int i = this.I00100o1O0lo;
/* 7 */                     if (i != 1 && i != 4) {
/* 13 */                        I0000oI00(true);
/* 17 */                        if (z) {
/* 21 */                            if (!this.I00100l0) {
/* 23 */                                lliOo1oo llioo1oo = lliOo1oo.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
/* 25 */                                float f = this.I000OiO;
/* 27 */                                I0000O(llioo1oo, f, f, null);
                                    }
/* 33 */                            lliOo1oo llioo1oo2 = lliOo1oo.SCANNER_AUTO_ZOOM_SCAN_SUCCESS;
/* 35 */                            float f2 = this.I000OiO;
/* 37 */                            I0000O(llioo1oo2, f2, f2, null);
                                } else {
/* 41 */                            lliOo1oo llioo1oo3 = lliOo1oo.SCANNER_AUTO_ZOOM_SCAN_FAILED;
/* 43 */                            float f3 = this.I000OiO;
/* 45 */                            I0000O(llioo1oo3, f3, f3, null);
                                }
/* 49 */                        this.I00100l0 = false;
/* 51 */                        this.I00100o1O0lo = 1;
/* 53 */                        this.I000oI1ioi = null;
                            }
                        } finally {
                        }
                    }
                }

                public final void I0000O(lliOo1oo llioo1oo, float f, float f2, o0iloil o0iloilVar) {
                    long jI00000oIO;
                    looo00lIIIIl looo00liiiil;
/* 1 */             String str = this.I000oI1ioi;
/* 3 */             if (str != null) {
/* 5 */                 String str2 = this.I000O01llI0;
/* 7 */                 Float fValueOf = Float.valueOf(f);
/* 11 */                Float fValueOf2 = Float.valueOf(f2);
                        synchronized (this.I0000Il00O) {
/* 30 */                    jI00000oIO = (this.I0001Ioi1lo.I00000oIO() - this.I000lI) / 1000000;
                        }
/* 32 */                Long lValueOf = Long.valueOf(jI00000oIO);
/* 36 */                if (o0iloilVar != null) {
/* 40 */                    Float fValueOf3 = Float.valueOf(o0iloilVar.I00000oIO);
/* 46 */                    Float fValueOf4 = Float.valueOf(o0iloilVar.I00000oOI);
/* 52 */                    Float fValueOf5 = Float.valueOf(o0iloilVar.I0000Il00O);
/* 58 */                    Float fValueOf6 = Float.valueOf(o0iloilVar.I0000O);
/* 64 */                    looo00liiiil = new looo00lIIIIl();
/* 67 */                    looo00liiiil.I00000oIO = fValueOf3;
/* 69 */                    looo00liiiil.I00000oOI = fValueOf4;
/* 71 */                    looo00liiiil.I0000Il00O = fValueOf5;
/* 73 */                    looo00liiiil.I0000O = fValueOf6;
/* 75 */                    VarHandle.storeStoreFence();
                        } else {
/* 79 */                    looo00liiiil = null;
                        }
/* 80 */                o0OiOio o0oioio = this.I000II;
/* 86 */                IOiOol0 iOiOol0 = new IOiOol0(15);
/* 91 */                loool1Oolli loool1oolli = new loool1Oolli();
/* 94 */                loool1oolli.I00000oIO = str2;
/* 96 */                loool1oolli.I00000oOI = str;
/* 98 */                loool1oolli.I0000Il00O = fValueOf;
/* 100 */               loool1oolli.I0000O = fValueOf2;
/* 102 */               loool1oolli.I0000oI00 = lValueOf;
/* 104 */               loool1oolli.I0001Ioi1lo = looo00liiiil;
/* 106 */               VarHandle.storeStoreFence();
/* 109 */               iOiOol0.I00ioIO = loool1oolli;
/* 121 */               o0oioio.I00000oOI(new o0Oll1li(iOiOol0, 0), llioo1oo, o0oioio.I0000O());
                    }
                }

                public final void I0000oI00(boolean z) {
                    ScheduledFuture scheduledFuture;
                    synchronized (this.I0000Il00O) {
                        try {
/* 6 */                     this.I0000O.I0000Il00O();
/* 15 */                    this.I000l1 = this.I0001Ioi1lo.I00000oIO();
/* 17 */                    if (z && (scheduledFuture = this.I000o00OoI0I) != null) {
/* 24 */                        scheduledFuture.cancel(false);
/* 28 */                        this.I000o00OoI0I = null;
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }
            }
