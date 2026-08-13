            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public final class ioIl010 implements liI0OilOI1I1 {
                public final int I00000oIO;
                public ioii01Ii100 I00000oOI;
                public Object I0000Il00O;

                public ioIl010(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture zza(Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 41 */                    ioii01Ii100 ioii01ii100 = this.I00000oOI;
/* 43 */                    l00Oi001i1l l00oi001i1l = (l00Oi001i1l) obj;
/* 47 */                    Object obj2 = this.I0000Il00O;
/* 51 */                    Oo1ol1ll oo1ol1ll = new Oo1ol1ll(25);
/* 54 */                    oo1ol1ll.I00iiI = ioii01ii100;
/* 56 */                    oo1ol1ll.I00iiO = l00oi001i1l;
/* 58 */                    oo1ol1ll.I00iio = obj2;
/* 60 */                    VarHandle.storeStoreFence();
/* 71 */                    return l00oi001i1l.I00000oOI.I0000oI00(iOiiloIII0O.I00000oIO(oo1ol1ll), IOO0o0I1l.I00lli11);
                        default:
/* 6 */                     l00Oi001i1l l00oi001i1l2 = (l00Oi001i1l) obj;
/* 10 */                    ioii01Ii100 ioii01ii1002 = this.I00000oOI;
/* 12 */                    Object obj3 = this.I0000Il00O;
/* 16 */                    OlilOlOiI olilOlOiI = new OlilOlOiI(26);
/* 19 */                    olilOlOiI.I00iiI = ioii01ii1002;
/* 21 */                    olilOlOiI.I00iiO = obj3;
/* 23 */                    olilOlOiI.I00iio = l00oi001i1l2;
/* 25 */                    VarHandle.storeStoreFence();
/* 36 */                    return l00oi001i1l2.I00000oOI.I0000oI00(iOiiloIII0O.I00000oIO(olilOlOiI), iOloo0O0O.I00o101lO);
                    }
                }
            }
