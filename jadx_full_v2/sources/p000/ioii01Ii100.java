            package p000;

            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public abstract class ioii01Ii100 {
                public static final int I000OiO = 0;
                public final l00Iil I00000oIO;
                public final ilOiOOII0I0 I00000oOI;
                public final ili0l0oo0 I0000Il00O;
                public final lil11i I0000O;
                public final Executor I0000oI00;
                public final Object I0001Ioi1lo = new Object();
                public liIOoOi1Ii1 I000II;
                public li10Io11 I000O01llI0;
                public liIOoOi1Ii1 I000OOo1O;

                public ioii01Ii100(l00Iil l00iil, ilOiOOII0I0 iloiooii0i0, ili0l0oo0 ili0l0oo0Var) {
/* 11 */            this.I00000oIO = l00iil;
/* 13 */            this.I00000oOI = iloiooii0i0;
/* 15 */            this.I0000Il00O = ili0l0oo0Var;
/* 19 */            this.I0000O = l00iil.I00iOIl;
/* 23 */            this.I0000oI00 = l00iil.I00iiO;
                }

                public final ListenableFuture I00000oIO() {
                    ListenableFuture listenableFutureI0000Il00O;
                    liIOoOi1Ii1 liioooi1ii1;
                    synchronized (this.I0001Ioi1lo) {
                        try {
/* 4 */                     li10Io11 li10io11 = this.I000O01llI0;
/* 6 */                     l00Iil l00iil = this.I00000oIO;
/* 12 */                    if (li10io11 == l00iil.I00000oIO() && (liioooi1ii1 = this.I000OOo1O) != null) {
/* 19 */                        return liioooi1ii1;
                            }
/* 23 */                    ili0l0oo0 ili0l0oo0Var = this.I0000Il00O;
/* 27 */                    if (l00iil.I00ioIO) {
/* 39 */                        ilOiOOII0I0 iloiooii0i0 = this.I00000oOI;
/* 41 */                        l00iil.I000II();
/* 56 */                        li1l1liO1i0l li1l1lio1i0lI0000O = ll0li01oO0li.I0000O(liIOoOi1Ii1.I000o00OoI0I(l00iil.I00000oIO()), ioo0I10ilio.I00000oIO, liI1iIi1IllO.I00iOIl);
/* 62 */                        int i = 2;
/* 63 */                        iOiOO11l ioioo11l = new iOiOO11l(i);
/* 66 */                        ioioo11l.I00000oOI = iloiooii0i0;
/* 68 */                        VarHandle.storeStoreFence();
/* 77 */                        liIOoOi1Ii1 liioooi1ii1I000o00OoI0I = liIOoOi1Ii1.I000o00OoI0I(ll0li01oO0li.I0000Il00O(li1l1lio1i0lI0000O, ioioo11l, l00iil.I00iOIl));
/* 83 */                        iOiOl0Oi0 ioiol0oi0 = new iOiOl0Oi0(i);
/* 86 */                        ioiol0oi0.I00000oOI = this;
/* 88 */                        ioiol0oi0.I0000Il00O = ili0l0oo0Var;
/* 90 */                        VarHandle.storeStoreFence();
/* 95 */                        listenableFutureI0000Il00O = ll0li01oO0li.I0000Il00O(liioooi1ii1I000o00OoI0I, ioiol0oi0, this.I0000O);
                            } else {
/* 33 */                        Log.i("ioii01Ii100", "Auto-download is disabled, skipping download.");
/* 36 */                        listenableFutureI0000Il00O = lii1I01.I00iiI;
                            }
/* 99 */                    liIOoOi1Ii1 liioooi1ii1I000o00OoI0I2 = liIOoOi1Ii1.I000o00OoI0I(listenableFutureI0000Il00O);
/* 106 */                   io0o0011 io0o0011Var = new io0o0011(3);
/* 109 */                   io0o0011Var.I00000oOI = this;
/* 111 */                   VarHandle.storeStoreFence();
/* 114 */                   lil11i lil11iVar = this.I0000O;
/* 116 */                   li1ii1 li1ii1VarI0000Il00O = ll0li01oO0li.I0000Il00O(liioooi1ii1I000o00OoI0I2, io0o0011Var, lil11iVar);
/* 123 */                   io0o0011 io0o0011Var2 = new io0o0011(4);
/* 126 */                   io0o0011Var2.I00000oOI = this;
/* 128 */                   VarHandle.storeStoreFence();
/* 131 */                   li1ii1 li1ii1VarI0000Il00O2 = ll0li01oO0li.I0000Il00O(li1ii1VarI0000Il00O, io0o0011Var2, lil11iVar);
/* 135 */                   this.I000OOo1O = li1ii1VarI0000Il00O2;
/* 141 */                   this.I000O01llI0 = l00iil.I00000oIO();
/* 145 */                   i0OI1l1Oo i0oi1l1oo = new i0OI1l1Oo();
/* 148 */                   i0oi1l1oo.I00iOIl = this;
/* 150 */                   VarHandle.storeStoreFence();
/* 153 */                   liI1iIi1IllO lii1iii1illo = liI1iIi1IllO.I00iOIl;
/* 158 */                   liOO1i1 lioo1i1 = new liOO1i1(0);
/* 161 */                   lioo1i1.I00iiI = li1ii1VarI0000Il00O2;
/* 163 */                   lioo1i1.I00iiO = i0oi1l1oo;
/* 165 */                   VarHandle.storeStoreFence();
/* 168 */                   li1ii1VarI0000Il00O2.addListener(lioo1i1, lii1iii1illo);
/* 172 */                   return li1ii1VarI0000Il00O2;
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
                }

                public abstract Object I00000oOI(iIolOi01l0o iioloi01l0o);

                public abstract iOio1i0 I0000Il00O(Object obj, Object obj2, IlloIo0O illoIo0O);

                public abstract iOio1i0 I0000O(Object obj, io0O1l io0o1l);

                public iOio1i0 I0000oI00(Object obj, Object obj2, io0O1l io0o1l) {
/* 5 */             Log.w("ioii01Ii100", "getTokenInfo() is not supported.");
/* 22 */            io0o1l.I000OOo1O.I0000O(new ilIoOl(5, 8, "Tokenization failed.", null, null));
/* 27 */            return new l01iOolo();
                }

                public final liIOoOi1Ii1 I0001Ioi1lo() {
                    liIOoOi1Ii1 liioooi1ii1I0000Il00O;
                    synchronized (this.I0001Ioi1lo) {
                        try {
/* 4 */                     li10Io11 li10io11 = this.I000O01llI0;
/* 6 */                     l00Iil l00iil = this.I00000oIO;
/* 12 */                    if (li10io11 != l00iil.I00000oIO() || (liioooi1ii1I0000Il00O = this.I000II) == null) {
/* 25 */                        liIOoOi1Ii1 liioooi1ii1I000o00OoI0I = liIOoOi1Ii1.I000o00OoI0I(l00iil.I00000oIO());
/* 32 */                        io0o0011 io0o0011Var = new io0o0011(2);
/* 35 */                        io0o0011Var.I00000oOI = this;
/* 37 */                        VarHandle.storeStoreFence();
/* 42 */                        liioooi1ii1I0000Il00O = ll0li01oO0li.I0000Il00O(liioooi1ii1I000o00OoI0I, io0o0011Var, this.I0000O);
/* 46 */                        this.I000II = liioooi1ii1I0000Il00O;
                            }
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
/* 49 */            liIOoOi1Ii1 liioooi1ii1I000o00OoI0I2 = liIOoOi1Ii1.I000o00OoI0I(liioooi1ii1I0000Il00O);
/* 56 */            io0o0011 io0o0011Var2 = new io0o0011(1);
/* 59 */            io0o0011Var2.I00000oOI = this;
/* 61 */            VarHandle.storeStoreFence();
/* 66 */            return ll0li01oO0li.I0000Il00O(liioooi1ii1I000o00OoI0I2, io0o0011Var2, this.I0000O);
                }
            }
