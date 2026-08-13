            package p000;

            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class ii100IIOI1 implements iollIi0II1o {
                public final int I00000oIO;
                public ilOI1I0lloOl I00000oOI;
                public Object I0000Il00O;

                public ii100IIOI1(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture zza(Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 48 */                    ilOI1I0lloOl iloi1i0llool = this.I00000oOI;
/* 52 */                    i1O01oOIoI0I i1o01ooioi0i = (i1O01oOIoI0I) this.I0000Il00O;
/* 54 */                    Integer num = (Integer) obj;
/* 56 */                    int iIntValue = num.intValue();
/* 62 */                    if (iIntValue == 0) {
/* 171 */                       Executor executor = iloi1i0llool.I0000oI00;
/* 175 */                       iOlI0O0iIiO ioli0o0iiioI00000oOI = iOlI0O0iIiO.I00000oOI(0, "Feature is unavailable.", null);
/* 185 */                       executor.execute(new Iioo110oI(6));
/* 188 */                       return lioo0lo01i.I00000oIO(ioli0o0iiioI00000oOI);
                            }
/* 65 */                    if (iIntValue != 1 && iIntValue != 2) {
/* 71 */                        if (iIntValue != 3) {
/* 87 */                            return lioo0lo01i.I00000oIO(iOlI0O0iIiO.I00000oOI(0, "Unexpected feature status: ".concat(String.valueOf(num)), null));
                                }
/* 119 */                       Log.i("ilOI1I0lloOl", "Feature " + ((ii00Il000) iloi1i0llool.I00000oOI).I00000oIO + " is downloaded and ready.");
/* 130 */                       iloi1i0llool.I0000oI00.execute(new Iioo110oI(5));
/* 133 */                       return l00lIloiio.I00iiI;
                            }
/* 136 */                   iOIIl1Oo ioiil1oo = iloi1i0llool.I00000oIO;
/* 138 */                   iOli1OIoI0o ioli1oioi0o = iloi1i0llool.I00000oOI;
/* 140 */                   il00iIOo1 il00iioo1 = (il00iIOo1) ioiil1oo;
/* 146 */                   l0Io11IiO0l l0io11iio0lI0000Il00O = il00iioo1.I00000oIO().I0000Il00O();
/* 152 */                   iilO0I0l0 iilo0i0l0 = new iilO0I0l0();
/* 155 */                   iilo0i0l0.I00000oIO = il00iioo1;
/* 157 */                   iilo0i0l0.I00000oOI = ioli1oioi0o;
/* 159 */                   iilo0i0l0.I0000Il00O = i1o01ooioi0i;
/* 161 */                   VarHandle.storeStoreFence();
/* 166 */                   return lioo0lo01i.I0000O(l0io11iio0lI0000Il00O, iilo0i0l0, il00iioo1.I00iOIl);
                        default:
/* 6 */                     il011ilOliio il011iloliio = (il011ilOliio) obj;
/* 10 */                    ilOI1I0lloOl iloi1i0llool2 = this.I00000oOI;
/* 14 */                    il1l01I0il il1l01i0il = (il1l01I0il) this.I0000Il00O;
/* 18 */                    Oo1ol1ll oo1ol1ll = new Oo1ol1ll(10);
/* 21 */                    oo1ol1ll.I00iiI = iloi1i0llool2;
/* 23 */                    oo1ol1ll.I00iiO = il011iloliio;
/* 25 */                    oo1ol1ll.I00iio = il1l01i0il;
/* 27 */                    VarHandle.storeStoreFence();
/* 43 */                    return il011iloliio.I00000oOI.I0000O(iOiiloIII0O.I00000oIO(oo1ol1ll), new lo1iloiI1(19));
                    }
                }
            }
