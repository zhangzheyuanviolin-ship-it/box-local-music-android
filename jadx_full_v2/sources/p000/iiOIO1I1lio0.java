            package p000;

            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class iiOIO1I1lio0 implements l0OI000IIIi {
                public final int I00000oIO;
                public iiI11l01l I00000oOI;
                public Object I0000Il00O;

                public iiOIO1I1lio0(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture zza(Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 48 */                    iiI11l01l iii11l01l = this.I00000oOI;
/* 52 */                    Iioi0lilII iioi0lilII = (Iioi0lilII) this.I0000Il00O;
/* 54 */                    Integer num = (Integer) obj;
/* 56 */                    int iIntValue = num.intValue();
/* 62 */                    if (iIntValue == 0) {
/* 172 */                       Executor executor = iii11l01l.I0000oI00;
/* 176 */                       iOIIOoOoii ioiiooooiiI00000oOI = iOIIOoOoii.I00000oOI(0, "Feature is unavailable.", null);
/* 187 */                       executor.execute(new Iioo110oI(12));
/* 190 */                       return ll00lliII.I00000oIO(ioiiooooiiI00000oOI);
                            }
/* 65 */                    if (iIntValue != 1 && iIntValue != 2) {
/* 71 */                        if (iIntValue != 3) {
/* 87 */                            return ll00lliII.I00000oIO(iOIIOoOoii.I00000oOI(0, "Unexpected feature status: ".concat(String.valueOf(num)), null));
                                }
/* 119 */                       Log.i("iiI11l01l", "Feature " + ((iOli1OIiO1I0) iii11l01l.I00000oOI).I00000oIO + " is downloaded and ready.");
/* 131 */                       iii11l01l.I0000oI00.execute(new Iioo110oI(11));
/* 134 */                       return l0lI0IOIl000.I00iiI;
                            }
/* 137 */                   iIloli iiloli = iii11l01l.I00000oIO;
/* 139 */                   iOIoil ioioil = iii11l01l.I00000oOI;
/* 141 */                   il1OOI0 il1ooi0 = (il1OOI0) iiloli;
/* 147 */                   l10i0Oio l10i0oioI0000O = il1ooi0.I00000oIO().I0000O();
/* 153 */                   iioil0OolIIi iioil0ooliii = new iioil0OolIIi();
/* 156 */                   iioil0ooliii.I00000oIO = il1ooi0;
/* 158 */                   iioil0ooliii.I00000oOI = ioioil;
/* 160 */                   iioil0ooliii.I0000Il00O = iioi0lilII;
/* 162 */                   VarHandle.storeStoreFence();
/* 167 */                   return ll00lliII.I00000oOI(l10i0oioI0000O, iioil0ooliii, il1ooi0.I00iOIl);
                        default:
/* 6 */                     il1iII1Oo il1iii1oo = (il1iII1Oo) obj;
/* 10 */                    iiI11l01l iii11l01l2 = this.I00000oOI;
/* 14 */                    iOolO1ll1I ioolo1ll1i = (iOolO1ll1I) this.I0000Il00O;
/* 18 */                    OlilOlOiI olilOlOiI = new OlilOlOiI(13);
/* 21 */                    olilOlOiI.I00iiI = iii11l01l2;
/* 23 */                    olilOlOiI.I00iiO = il1iii1oo;
/* 25 */                    olilOlOiI.I00iio = ioolo1ll1i;
/* 27 */                    VarHandle.storeStoreFence();
/* 43 */                    return il1iii1oo.I00000oOI.I00000oIO(iOiiloIII0O.I00000oIO(olilOlOiI), new i1i0olI(20));
                    }
                }
            }
