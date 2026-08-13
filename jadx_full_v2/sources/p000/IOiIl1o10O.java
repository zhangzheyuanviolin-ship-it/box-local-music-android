            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class IOiIl1o10O implements IllOOo00lI {
                public final int I00iOIl;
                public Ill0oOi0 I00iiI;

                public IOiIl1o10O(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    switch (this.I00iOIl) {
                        case 0:
/* 151 */                   this.I00iiI.reportFullyDrawn();
/* 154 */                   return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 128 */                   IllOIi01iOl illOIi01iOl = new IllOIi01iOl();
/* 136 */                   illOIi01iOl.I00000oIO = new Object();
/* 143 */                   illOIi01iOl.I0000Il00O = new ArrayList();
/* 145 */                   VarHandle.storeStoreFence();
/* 148 */                   return illOIi01iOl;
                        case 2:
/* 111 */                   Ill0oOi0 ill0oOi0 = this.I00iiI;
/* 115 */                   Iii11o1 iii11o1 = new Iii11o1();
/* 122 */                   ill0oOi0.I00000oIO().I000OiO(iii11o1);
/* 125 */                   return iii11o1;
                        case 3:
/* 83 */                    Ill0oOi0 ill0oOi02 = this.I00iiI;
/* 107 */                   return new OiIol0o(ill0oOi02.getApplication(), ill0oOi02, ill0oOi02.getIntent() != null ? ill0oOi02.getIntent().getExtras() : null);
                        default:
/* 6 */                     Ill0oOi0 ill0oOi03 = this.I00iiI;
/* 13 */                    IOiIiiliiIo iOiIiiliiIo = new IOiIiiliiIo(1);
/* 16 */                    iOiIiiliiIo.I00iiI = ill0oOi03;
/* 18 */                    VarHandle.storeStoreFence();
/* 21 */                    OIOoO1IOIo oIOoO1IOIo = new OIOoO1IOIo(iOiIiiliiIo);
/* 36 */                    if (O0000Ioio00.I0000O(Looper.myLooper(), Looper.getMainLooper())) {
/* 65 */                        O0oiiOll0O1 o0oiiOll0O1 = ill0oOi03.I00iOIl;
/* 69 */                        IOiIlIll0I iOiIlIll0I = new IOiIlIll0I();
/* 72 */                        iOiIlIll0I.I00iOIl = oIOoO1IOIo;
/* 74 */                        iOiIlIll0I.I00iiI = ill0oOi03;
/* 76 */                        VarHandle.storeStoreFence();
/* 79 */                        o0oiiOll0O1.I00li1OI(iOiIlIll0I);
                            } else {
/* 44 */                        Handler handler = new Handler(Looper.getMainLooper());
/* 51 */                        I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(18);
/* 54 */                        i0iOo0oioiO.I00iiI = ill0oOi03;
/* 56 */                        i0iOo0oioiO.I00iiO = oIOoO1IOIo;
/* 58 */                        VarHandle.storeStoreFence();
/* 61 */                        handler.post(i0iOo0oioiO);
                            }
/* 82 */                    return oIOoO1IOIo;
                    }
                }
            }
