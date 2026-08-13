            package p000;

            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.WeakHashMap;
            
/* 18 */    public abstract class O110lI {
                public static final Object I000iOII = new Object();
                public final Object I00000oIO;
                public final OiIi1OI I00000oOI;
                public int I0000Il00O;
                public boolean I0000O;
                public volatile Object I0000oI00;
                public volatile Object I0001Ioi1lo;
                public int I000II;
                public boolean I000O01llI0;
                public boolean I000OOo1O;
                public final I0lil01 I000OiO;

                public O110lI() {
/* 9 */             this.I00000oIO = new Object();
/* 16 */            this.I00000oOI = new OiIi1OI();
/* 19 */            this.I0000Il00O = 0;
/* 21 */            Object obj = I000iOII;
/* 23 */            this.I0001Ioi1lo = obj;
/* 30 */            this.I000OiO = new I0lil01(this);
/* 32 */            this.I0000oI00 = obj;
/* 35 */            this.I000II = -1;
                }

                public static void I00000oIO(String str) {
/* 7 */             I1IiIl.I00000oIO().I00000oIO.getClass();
/* 22 */            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
/* 24 */                return;
                    }
/* 33 */            I000II.I001IO000(IlIi0I0.I000lI("Cannot invoke ", str, " on a background thread"));
                }

                public final void I00000oOI(O110ioill o110ioill) {
/* 3 */             if (o110ioill.I00iiI) {
/* 10 */                if (!o110ioill.I0000O()) {
/* 13 */                    o110ioill.I00000oIO(false);
/* 16 */                    return;
                        }
/* 17 */                int i = o110ioill.I00iiO;
/* 19 */                int i2 = this.I000II;
/* 21 */                if (i >= i2) {
/* 23 */                    return;
                        }
/* 24 */                o110ioill.I00iiO = i2;
/* 30 */                o110ioill.I00iOIl.I00000oOI(this.I0000oI00);
                    }
                }

                public final void I0000Il00O(O110ioill o110ioill) {
/* 4 */             if (this.I000O01llI0) {
/* 6 */                 this.I000OOo1O = true;
/* 8 */                 return;
                    }
/* 9 */             this.I000O01llI0 = true;
/* 69 */            do {
/* 12 */                this.I000OOo1O = false;
/* 14 */                if (o110ioill != null) {
/* 16 */                    I00000oOI(o110ioill);
/* 19 */                    o110ioill = null;
                        } else {
/* 23 */                    OiIi0lIOl oiIi0lIOl = new OiIi0lIOl();
/* 26 */                    OiIi1OI oiIi1OI = this.I00000oOI;
/* 28 */                    oiIi0lIOl.I00iiO = oiIi1OI;
/* 30 */                    oiIi0lIOl.I00iiI = true;
/* 32 */                    VarHandle.storeStoreFence();
/* 39 */                    oiIi1OI.I00iiO.put(oiIi0lIOl, Boolean.FALSE);
/* 46 */                    while (oiIi0lIOl.hasNext()) {
/* 60 */                        I00000oOI((O110ioill) ((Map.Entry) oiIi0lIOl.next()).getValue());
/* 65 */                        if (this.I000OOo1O) {
                                    break;
                                }
                            }
                        }
/* 69 */            } while (this.I000OOo1O);
/* 71 */            this.I000O01llI0 = false;
                }

                public final Object I0000O() {
/* 1 */             Object obj = this.I0000oI00;
/* 5 */             if (obj != I000iOII) {
/* 7 */                 return obj;
                    }
/* 8 */             return null;
                }

                public final void I0000oI00(O0oiOi o0oiOi, OIOilII0IlO oIOilII0IlO) {
/* 3 */             I00000oIO("observe");
/* 16 */            if (o0oiOi.I000iOII().I00ol1() == O0oOi0I.I00iOIl) {
/* 49 */                return;
                    }
/* 21 */            O110iIo0 o110iIo0 = new O110iIo0(this, o0oiOi, oIOilII0IlO);
/* 30 */            O110ioill o110ioill = (O110ioill) this.I00000oOI.I00000oOI(oIOilII0IlO, o110iIo0);
/* 32 */            if (o110ioill != null && !o110ioill.I0000Il00O(o0oiOi)) {
/* 43 */                I000II.I000iOII("Cannot add the same observer with different lifecycles");
                    } else {
/* 47 */                if (o110ioill != null) {
/* 49 */                    return;
                        }
/* 54 */                o0oiOi.I000iOII().I00li1OI(o110iIo0);
                    }
                }

                public final void I0001Ioi1lo(OIOilII0IlO oIOilII0IlO) {
/* 3 */             I00000oIO("observeForever");
/* 8 */             O110OoIl0I0 o110OoIl0I0 = new O110OoIl0I0(this, oIOilII0IlO);
/* 17 */            O110ioill o110ioill = (O110ioill) this.I00000oOI.I00000oOI(oIOilII0IlO, o110OoIl0I0);
/* 21 */            if (o110ioill instanceof O110iIo0) {
/* 33 */                I000II.I000iOII("Cannot add the same observer with different lifecycles");
                    } else {
/* 23 */                if (o110ioill != null) {
/* 25 */                    return;
                        }
/* 27 */                o110OoIl0I0.I00000oIO(true);
                    }
                }

                public void I000OOo1O(Object obj) {
                    boolean z;
                    synchronized (this.I00000oIO) {
/* 12 */                z = this.I0001Ioi1lo == I000iOII;
/* 13 */                this.I0001Ioi1lo = obj;
                    }
/* 16 */            if (z) {
/* 25 */                I1IiIl.I00000oIO().I00000oOI(this.I000OiO);
                    }
                }

                public void I000OiO(OIOilII0IlO oIOilII0IlO) {
/* 3 */             I00000oIO("removeObserver");
/* 6 */             OiIi1OI oiIi1OI = this.I00000oOI;
/* 8 */             WeakHashMap weakHashMap = oiIi1OI.I00iiO;
/* 10 */            OiIi0Oilo oiIi0Oilo = oiIi1OI.I00iOIl;
/* 12 */            while (oiIi0Oilo != null && !oiIi0Oilo.I00iOIl.equals(oIOilII0IlO)) {
/* 23 */                oiIi0Oilo = oiIi0Oilo.I00iiO;
                    }
/* 26 */            Object obj = null;
/* 27 */            if (oiIi0Oilo != null) {
                        oiIi1OI.I00iio--;
/* 40 */                if (!weakHashMap.isEmpty()) {
/* 46 */                    Iterator it = weakHashMap.keySet().iterator();
/* 54 */                    while (it.hasNext()) {
/* 62 */                        ((OiIi1O) it.next()).I00000oIO(oiIi0Oilo);
                            }
                        }
/* 66 */                OiIi0Oilo oiIi0Oilo2 = oiIi0Oilo.I00iio;
/* 68 */                OiIi0Oilo oiIi0Oilo3 = oiIi0Oilo.I00iiO;
/* 70 */                if (oiIi0Oilo2 != null) {
/* 72 */                    oiIi0Oilo2.I00iiO = oiIi0Oilo3;
                        } else {
/* 75 */                    oiIi1OI.I00iOIl = oiIi0Oilo3;
                        }
/* 77 */                OiIi0Oilo oiIi0Oilo4 = oiIi0Oilo.I00iiO;
/* 79 */                if (oiIi0Oilo4 != null) {
/* 81 */                    oiIi0Oilo4.I00iio = oiIi0Oilo2;
                        } else {
/* 84 */                    oiIi1OI.I00iiI = oiIi0Oilo2;
                        }
/* 86 */                oiIi0Oilo.I00iiO = null;
/* 88 */                oiIi0Oilo.I00iio = null;
/* 90 */                obj = oiIi0Oilo.I00iiI;
                    }
/* 92 */            O110ioill o110ioill = (O110ioill) obj;
/* 94 */            if (o110ioill == null) {
/* 96 */                return;
                    }
/* 97 */            o110ioill.I00000oOI();
/* 101 */           o110ioill.I00000oIO(false);
                }

                public void I000iOII(Object obj) {
/* 3 */             I00000oIO("setValue");
                    this.I000II++;
/* 12 */            this.I0000oI00 = obj;
/* 15 */            I0000Il00O(null);
                }

/* 19 */        public void I000II() {
                }

/* 19 */        public void I000O01llI0() {
                }

/* 37 */        public O110lI(Object obj) {
/* 39 */            this.I00000oIO = new Object();
/* 40 */            this.I00000oOI = new OiIi1OI();
/* 41 */            this.I0000Il00O = 0;
/* 42 */            this.I0001Ioi1lo = I000iOII;
/* 43 */            this.I000OiO = new I0lil01(this);
/* 44 */            this.I0000oI00 = obj;
/* 45 */            this.I000II = 0;
                }
            }
