            package p000;

            import android.os.SystemClock;
            import java.lang.invoke.VarHandle;
            
            public final class lOollI implements Runnable {
                public final int I00iOIl;
                public long I00iiI;
                public li10O1l0 I00iiO;

                public lOollI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x00ba  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 96 */                    li10O1l0 li10o1l0 = this.I00iiO;
/* 98 */                    long j = this.I00iiI;
/* 100 */                   OooI11loO0I oooI11loO0I = li10o1l0.I00ilO0;
/* 102 */                   li10o1l0.I010II();
/* 105 */                   li10o1l0.I010ioo();
/* 110 */                   l0olllO1i l0olllo1i = (l0olllO1i) li10o1l0.I00iOIl;
/* 112 */                   l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 114 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 125 */                   l01o0io1ooo0.I00lll10.I0000Il00O("Activity resumed, time", Long.valueOf(j));
/* 128 */                   iIl1iil iil1iil = l0olllo1i.I00iio;
/* 137 */                   if (iil1iil.I01101IOlO(null, iol1II1ii1i.I010II)) {
/* 143 */                       if (iil1iil.I0111i() || li10o1l0.I00iio) {
/* 153 */                           ((li10O1l0) oooI11loO0I.I00iio).I010II();
/* 160 */                           ((li0O100iO01) oooI11loO0I.I00iiO).I0000Il00O();
/* 163 */                           oooI11loO0I.I00iOIl = j;
/* 165 */                           oooI11loO0I.I00iiI = j;
                                }
                            } else if (!iil1iil.I0111i()) {
/* 174 */                       l0Oi0o l0oi0o = l0olllo1i.I00ilI0I1;
/* 176 */                       l0olllO1i.I0000oI00(l0oi0o);
/* 185 */                       if (l0oi0o.I00oII.I00000oIO()) {
/* 191 */                           ((li10O1l0) oooI11loO0I.I00iio).I010II();
/* 198 */                           ((li0O100iO01) oooI11loO0I.I00iiO).I0000Il00O();
/* 201 */                           oooI11loO0I.I00iOIl = j;
/* 203 */                           oooI11loO0I.I00iiI = j;
                                }
                            }
/* 205 */                   OoIOol ooIOol = li10o1l0.I00io1l;
/* 209 */                   li10O1l0 li10o1l02 = (li10O1l0) ooIOol.I00iiO;
/* 211 */                   li10o1l02.I010II();
/* 216 */                   li01Ol0i0I li01ol0i0i = (li01Ol0i0I) ooIOol.I00iiI;
/* 218 */                   if (li01ol0i0i != null) {
/* 222 */                       li10o1l02.I00iiO.removeCallbacks(li01ol0i0i);
                            }
/* 229 */                   l0Oi0o l0oi0o2 = ((l0olllO1i) li10o1l02.I00iOIl).I00ilI0I1;
/* 231 */                   l0olllO1i.I0000oI00(l0oi0o2);
/* 237 */                   l0oi0o2.I00oII.I00000oOI(false);
/* 240 */                   li10o1l02.I010II();
/* 243 */                   li10o1l02.I00iio = false;
/* 245 */                   iii1IIii iii1iiii = li10o1l0.I00ilI0I1;
/* 249 */                   li10O1l0 li10o1l03 = (li10O1l0) iii1iiii.I00iiI;
/* 251 */                   li10o1l03.I010II();
/* 256 */                   l0olllO1i l0olllo1i2 = (l0olllO1i) li10o1l03.I00iOIl;
/* 258 */                   boolean zI00000oIO = l0olllo1i2.I00000oIO();
/* 262 */                   Iioi0lilII iioi0lilII = l0olllo1i2.I00li1OI;
/* 264 */                   if (zI00000oIO) {
/* 267 */                       iioi0lilII.getClass();
/* 291 */                       iii1iiii.I0000oI00(System.currentTimeMillis(), l0olllo1i2.I00iio.I01101IOlO(null, iol1II1ii1i.I01101olii) ? SystemClock.elapsedRealtime() : 0L);
                                break;
                            }
                            break;
                        default:
/* 6 */                     li10O1l0 li10o1l04 = this.I00iiO;
/* 8 */                     long j2 = this.I00iiI;
/* 10 */                    li10o1l04.I010II();
/* 13 */                    li10o1l04.I010ioo();
/* 18 */                    l0olllO1i l0olllo1i3 = (l0olllO1i) li10o1l04.I00iOIl;
/* 20 */                    l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i3.I00ilO0;
/* 22 */                    l0olllO1i.I000II(l01o0io1ooo02);
/* 33 */                    l01o0io1ooo02.I00lll10.I0000Il00O("Activity paused, time", Long.valueOf(j2));
/* 36 */                    OoIOol ooIOol2 = li10o1l04.I00io1l;
/* 42 */                    li10O1l0 li10o1l05 = (li10O1l0) ooIOol2.I00iiO;
/* 50 */                    ((l0olllO1i) li10o1l05.I00iOIl).I00li1OI.getClass();
/* 53 */                    long jCurrentTimeMillis = System.currentTimeMillis();
/* 57 */                    li01Ol0i0I li01ol0i0i2 = new li01Ol0i0I();
/* 60 */                    li01ol0i0i2.I00iiO = ooIOol2;
/* 62 */                    li01ol0i0i2.I00iOIl = jCurrentTimeMillis;
/* 64 */                    li01ol0i0i2.I00iiI = j2;
/* 66 */                    VarHandle.storeStoreFence();
/* 69 */                    ooIOol2.I00iiI = li01ol0i0i2;
/* 75 */                    li10o1l05.I00iiO.postDelayed(li01ol0i0i2, 2000L);
/* 84 */                    if (l0olllo1i3.I00iio.I0111i()) {
/* 92 */                        ((li0O100iO01) li10o1l04.I00ilO0.I00iiO).I0000Il00O();
                                break;
                            }
                            break;
                    }
                }
            }
