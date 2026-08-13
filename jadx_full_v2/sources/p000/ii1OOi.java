            package p000;

            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class ii1OOi implements iol0ioiIO1iI {
                public final int I00000oIO;
                public ilIoii01i I00000oOI;
                public Object I0000Il00O;

                public ii1OOi(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture zza(Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 48 */                    ilIoii01i ilioii01i = this.I00000oOI;
/* 52 */                    Iioi0lilII iioi0lilII = (Iioi0lilII) this.I0000Il00O;
/* 54 */                    Integer num = (Integer) obj;
/* 56 */                    int iIntValue = num.intValue();
/* 62 */                    if (iIntValue == 0) {
/* 172 */                       Executor executor = ilioii01i.I0000oI00;
/* 176 */                       iOiIOO1ll ioiioo1llI00000oOI = iOiIOO1ll.I00000oOI(0, "Feature is unavailable.", null);
/* 187 */                       executor.execute(new Iioo110oI(10));
/* 190 */                       return liolilo.I00000oIO(ioiioo1llI00000oOI);
                            }
/* 65 */                    if (iIntValue != 1 && iIntValue != 2) {
/* 71 */                        if (iIntValue != 3) {
/* 87 */                            return liolilo.I00000oIO(iOiIOO1ll.I00000oOI(0, "Unexpected feature status: ".concat(String.valueOf(num)), null));
                                }
/* 119 */                       Log.i("ilIoii01i", "Feature " + ((iOoOoIioii) ilioii01i.I00000oOI).I00000oIO + " is downloaded and ready.");
/* 131 */                       ilioii01i.I0000oI00.execute(new Iioo110oI(8));
/* 134 */                       return l00Il1IoiloI.I00iiI;
                            }
/* 137 */                   iO1110010OI io1110010oi = ilioii01i.I00000oIO;
/* 139 */                   iOioO0lIOo ioioo0lioo = ilioii01i.I00000oOI;
/* 141 */                   il0I1i0Oo1 il0i1i0oo1 = (il0I1i0Oo1) io1110010oi;
/* 147 */                   l0I1O1ii l0i1o1iiI00000oOI = il0i1i0oo1.I00000oIO().I00000oOI();
/* 153 */                   iili0l1l iili0l1lVar = new iili0l1l();
/* 156 */                   iili0l1lVar.I00000oIO = il0i1i0oo1;
/* 158 */                   iili0l1lVar.I00000oOI = ioioo0lioo;
/* 160 */                   iili0l1lVar.I0000Il00O = iioi0lilII;
/* 162 */                   VarHandle.storeStoreFence();
/* 167 */                   return liolilo.I0000O(l0i1o1iiI00000oOI, iili0l1lVar, il0i1i0oo1.I00iOIl);
                        default:
/* 6 */                     il0Oi1i1II il0oi1i1ii = (il0Oi1i1II) obj;
/* 10 */                    ilIoii01i ilioii01i2 = this.I00000oOI;
/* 14 */                    il1l00IOII il1l00ioii = (il1l00IOII) this.I0000Il00O;
/* 18 */                    Oo1ol1ll oo1ol1ll = new Oo1ol1ll(11);
/* 21 */                    oo1ol1ll.I00iiI = ilioii01i2;
/* 23 */                    oo1ol1ll.I00iiO = il0oi1i1ii;
/* 25 */                    oo1ol1ll.I00iio = il1l00ioii;
/* 27 */                    VarHandle.storeStoreFence();
/* 43 */                    return il0oi1i1ii.I00000oOI.I0000Il00O(iOiiloIII0O.I00000oIO(oo1ol1ll), new loilIl10Ii(19));
                    }
                }
            }
