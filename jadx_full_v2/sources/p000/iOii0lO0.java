            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public final class iOii0lO0 implements liI0OilOI1I1 {
                public final int I00000oIO;
                public AutoCloseable I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;

                public iOii0lO0(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture zza(Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 51 */                    ioii01Ii100 ioii01ii100 = (ioii01Ii100) obj;
/* 63 */                    Object objI000O01llI0 = ((iOil1lO10l) this.I00000oOI).I000O01llI0(this.I0000Il00O, (iOi1Olo) this.I0000O);
/* 67 */                    liIOoOi1Ii1 liioooi1ii1I0001Ioi1lo = ioii01ii100.I0001Ioi1lo();
/* 74 */                    ioIl010 ioil010 = new ioIl010(0);
/* 77 */                    ioil010.I00000oOI = ioii01ii100;
/* 79 */                    ioil010.I0000Il00O = objI000O01llI0;
/* 81 */                    VarHandle.storeStoreFence();
/* 86 */                    return ll0li01oO0li.I0000Il00O(liioooi1ii1I0001Ioi1lo, ioil010, ioii01ii100.I0000O);
                        default:
/* 8 */                     l00Iil l00iil = (l00Iil) this.I00000oOI;
/* 10 */                    ilOi00IOiII iloi00ioiii = (ilOi00IOiII) obj;
/* 16 */                    ilOiOOII0I0 iloiooii0i0 = (ilOiOOII0I0) this.I0000Il00O;
/* 20 */                    ili0l0oo0 ili0l0oo0Var = (ili0l0oo0) this.I0000O;
/* 24 */                    iOliil ioliil = new iOliil(18);
/* 27 */                    ioliil.I00iiI = l00iil;
/* 29 */                    ioliil.I00iiO = iloi00ioiii;
/* 31 */                    ioliil.I00iio = iloiooii0i0;
/* 33 */                    ioliil.I00ilI0I1 = ili0l0oo0Var;
/* 35 */                    VarHandle.storeStoreFence();
/* 46 */                    return iloi00ioiii.I00000oOI.I0000oI00(iOiiloIII0O.I00000oIO(ioliil), O1oO0lOoI1.I00o0iI0io1);
                    }
                }
            }
