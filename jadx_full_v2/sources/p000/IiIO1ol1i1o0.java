            package p000;

            import android.util.Log;
            import android.util.Size;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public abstract class IiIO1ol1i1o0 {
                public static final boolean I000iOII;
                public static final AtomicInteger I000l1;
                public static final AtomicInteger I000lI;
                public final Object I00000oIO = new Object();
                public int I00000oOI = 0;
                public boolean I0000Il00O = false;
                public IIiOOI I0000O;
                public final IIiOiI0il I0000oI00;
                public IIiOOI I0001Ioi1lo;
                public final IIiOiI0il I000II;
                public final Size I000O01llI0;
                public final int I000OOo1O;
                public Class I000OiO;

                static {
/* 4 */             new Size(0, 0);
/* 14 */            I000iOII = l11I11lO.I0000O(3, "DeferrableSurface");
/* 21 */            I000l1 = new AtomicInteger(0);
/* 28 */            I000lI = new AtomicInteger(0);
                }

                public IiIO1ol1i1o0(int i, Size size) {
/* 16 */            this.I000O01llI0 = size;
/* 18 */            this.I000OOo1O = i;
/* 22 */            IiIO1I1I1 iiIO1I1I1 = new IiIO1I1I1(0);
/* 25 */            iiIO1I1I1.I00iiI = this;
/* 27 */            VarHandle.storeStoreFence();
/* 30 */            IIiOiI0il iIiOiI0ilI00000oIO = iOiiloIII0O.I00000oIO(iiIO1I1I1);
/* 34 */            this.I0000oI00 = iIiOiI0ilI00000oIO;
/* 39 */            IiIO1I1I1 iiIO1I1I12 = new IiIO1I1I1(1);
/* 42 */            iiIO1I1I12.I00iiI = this;
/* 44 */            VarHandle.storeStoreFence();
/* 51 */            this.I000II = iOiiloIII0O.I00000oIO(iiIO1I1I12);
/* 60 */            if (l11I11lO.I0000O(3, "DeferrableSurface")) {
/* 64 */                I000lI.incrementAndGet();
/* 69 */                I000l1.get();
/* 72 */                I0000oI00();
/* 80 */                String stackTraceString = Log.getStackTraceString(new Exception());
/* 88 */                I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(26);
/* 91 */                i0iOo0oioiO.I00iiI = this;
/* 93 */                i0iOo0oioiO.I00iiO = stackTraceString;
/* 95 */                VarHandle.storeStoreFence();
/* 104 */               iIiOiI0ilI00000oIO.I00iiI.addListener(i0iOo0oioiO, Iii11l.I00000oIO());
                    }
                }

                public void I00000oIO() {
                    IIiOOI iIiOOI;
                    synchronized (this.I00000oIO) {
                        try {
/* 7 */                     if (this.I0000Il00O) {
/* 47 */                        iIiOOI = null;
                            } else {
/* 10 */                        this.I0000Il00O = true;
/* 14 */                        this.I0001Ioi1lo.I00000oOI(null);
/* 19 */                        if (this.I00000oOI == 0) {
/* 21 */                            iIiOOI = this.I0000O;
/* 23 */                            this.I0000O = null;
                                } else {
/* 28 */                            iIiOOI = null;
                                }
/* 36 */                        if (l11I11lO.I0000O(3, "DeferrableSurface")) {
/* 40 */                            toString();
/* 43 */                            l11I11lO.I0000O(3, "DeferrableSurface");
                                }
                            }
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
/* 49 */            if (iIiOOI != null) {
/* 51 */                iIiOOI.I00000oOI(null);
                    }
                }

                public final void I00000oOI() {
                    IIiOOI iIiOOI;
                    synchronized (this.I00000oIO) {
                        try {
/* 4 */                     int i = this.I00000oOI;
/* 6 */                     if (i == 0) {
/* 75 */                        throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                            }
                            int i2 = i - 1;
/* 10 */                    this.I00000oOI = i2;
/* 13 */                    if (i2 == 0 && this.I0000Il00O) {
/* 19 */                        iIiOOI = this.I0000O;
/* 21 */                        this.I0000O = null;
                            } else {
/* 26 */                        iIiOOI = null;
                            }
/* 34 */                    if (l11I11lO.I0000O(3, "DeferrableSurface")) {
/* 38 */                        toString();
/* 41 */                        l11I11lO.I0000O(3, "DeferrableSurface");
/* 46 */                        if (this.I00000oOI == 0) {
/* 50 */                            I000lI.get();
/* 55 */                            I000l1.decrementAndGet();
/* 58 */                            I0000oI00();
                                }
                            }
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
/* 62 */            if (iIiOOI != null) {
/* 64 */                iIiOOI.I00000oOI(null);
                    }
                }

                public final ListenableFuture I0000Il00O() {
                    synchronized (this.I00000oIO) {
                        try {
/* 6 */                     if (this.I0000Il00O) {
/* 18 */                        return new Ioil1IIo(new IiIO1IliI1Ol("DeferrableSurface already closed.", this), 1);
                            }
/* 25 */                    return I0001Ioi1lo();
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                public final void I0000O() {
                    synchronized (this.I00000oIO) {
                        try {
/* 4 */                     int i = this.I00000oOI;
/* 6 */                     if (i == 0 && this.I0000Il00O) {
/* 20 */                        throw new IiIO1IliI1Ol("Cannot begin use on a closed surface.", this);
                            }
/* 25 */                    this.I00000oOI = i + 1;
/* 34 */                    if (l11I11lO.I0000O(3, "DeferrableSurface")) {
/* 38 */                        if (this.I00000oOI == 1) {
/* 42 */                            I000lI.get();
/* 47 */                            I000l1.incrementAndGet();
/* 50 */                            I0000oI00();
                                }
/* 55 */                        toString();
/* 58 */                        l11I11lO.I0000O(3, "DeferrableSurface");
                            }
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
                }

                public final void I0000oI00() {
/* 6 */             if (!I000iOII && l11I11lO.I0000O(3, "DeferrableSurface")) {
/* 14 */                l11I11lO.I0000O(3, "DeferrableSurface");
                    }
/* 17 */            toString();
/* 20 */            l11I11lO.I0000O(3, "DeferrableSurface");
                }

                public abstract ListenableFuture I0001Ioi1lo();
            }
