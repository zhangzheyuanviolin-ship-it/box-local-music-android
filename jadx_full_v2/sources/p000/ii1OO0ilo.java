            package p000;

            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class ii1OO0ilo implements iol0i0iOol {
                public final int I00000oIO;
                public ilIoi0 I00000oOI;
                public Object I0000Il00O;

                public ii1OO0ilo(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture zza(Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 48 */                    ilIoi0 ilioi0 = this.I00000oOI;
/* 52 */                    IOO0o0I1l iOO0o0I1l = (IOO0o0I1l) this.I0000Il00O;
/* 54 */                    Integer num = (Integer) obj;
/* 56 */                    int iIntValue = num.intValue();
/* 62 */                    if (iIntValue == 0) {
/* 171 */                       Executor executor = ilioi0.I0000oI00;
/* 175 */                       iOiI1oOo1l ioii1ooo1lI00000oOI = iOiI1oOo1l.I00000oOI(0, "Feature is unavailable.", null);
/* 186 */                       executor.execute(new Iioo110oI(9));
/* 189 */                       return lioli1IO.I00000oIO(ioii1ooo1lI00000oOI);
                            }
/* 65 */                    if (iIntValue != 1 && iIntValue != 2) {
/* 71 */                        if (iIntValue != 3) {
/* 87 */                            return lioli1IO.I00000oIO(iOiI1oOo1l.I00000oOI(0, "Unexpected feature status: ".concat(String.valueOf(num)), null));
                                }
/* 119 */                       Log.i("ilIoi0", "Feature " + ((iOoOlIOOi) ilioi0.I00000oOI).I00000oIO + " is downloaded and ready.");
/* 130 */                       ilioi0.I0000oI00.execute(new Iioo110oI(7));
/* 133 */                       return l00Il111lO1I.I00iiI;
                            }
/* 136 */                   iO110O11Ii io110o11ii = ilioi0.I00000oIO;
/* 138 */                   iOioIII1i ioioiii1i = ilioi0.I00000oOI;
/* 140 */                   il0I11I011 il0i11i011 = (il0I11I011) io110o11ii;
/* 146 */                   l0I1O010oooi l0i1o010oooiI00000oIO = il0i11i011.I00000oIO().I00000oIO();
/* 152 */                   iili0OOio iili0ooio = new iili0OOio();
/* 155 */                   iili0ooio.I00000oIO = il0i11i011;
/* 157 */                   iili0ooio.I00000oOI = ioioiii1i;
/* 159 */                   iili0ooio.I0000Il00O = iOO0o0I1l;
/* 161 */                   VarHandle.storeStoreFence();
/* 166 */                   return lioli1IO.I0000O(l0i1o010oooiI00000oIO, iili0ooio, il0i11i011.I00iOIl);
                        default:
/* 6 */                     il0Oi10O1 il0oi10o1 = (il0Oi10O1) obj;
/* 10 */                    ilIoi0 ilioi02 = this.I00000oOI;
/* 14 */                    il1ioo0oooi il1ioo0oooiVar = (il1ioo0oooi) this.I0000Il00O;
/* 18 */                    OlilOlOiI olilOlOiI = new OlilOlOiI(12);
/* 21 */                    olilOlOiI.I00iiI = ilioi02;
/* 23 */                    olilOlOiI.I00iiO = il0oi10o1;
/* 25 */                    olilOlOiI.I00iio = il1ioo0oooiVar;
/* 27 */                    VarHandle.storeStoreFence();
/* 43 */                    return il0oi10o1.I00000oOI.I00000oOI(iOiiloIII0O.I00000oIO(olilOlOiI), new loIOiIO1O1(19));
                    }
                }
            }
