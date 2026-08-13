            package p000;

            import android.os.Build;
            import android.view.View;
            import android.view.Window;
            
            public final class Iiii11o0 implements IllOOo00lI {
                public final int I00iOIl;
                public boolean I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public Iiii11o0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    switch (this.I00iOIl) {
                        case 0:
/* 139 */                   boolean z = this.I00iiI;
/* 143 */                   I1I0i0Ilo1Oi i1I0i0Ilo1Oi = (I1I0i0Ilo1Oi) this.I00iiO;
/* 147 */                   String str = (String) this.I00iio;
/* 149 */                   if (z) {
/* 153 */                       II1oo0l11IOI iI1oo0l11IOI = (II1oo0l11IOI) i1I0i0Ilo1Oi.I00iiI;
                                synchronized (((lolOiIoiillI) iI1oo0l11IOI.I0001Ioi1lo)) {
                                }
                            }
/* 175 */                   return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 112 */                   boolean z2 = this.I00iiI;
/* 116 */                   IOO0i0o1O0l iOO0i0o1O0l = (IOO0i0o1O0l) this.I00iiO;
/* 120 */                   OI1O0o0 oI1O0o0 = (OI1O0o0) this.I00iio;
/* 122 */                   if (!z2) {
/* 133 */                       ((I0lOl0I0) iOO0i0o1O0l).I00000oOI(new I1111OO10i(oI1O0o0.I00000oOI));
                            }
/* 136 */                   return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 70 */                    boolean z3 = this.I00iiI;
/* 74 */                    IiloOlIoIool iiloOlIoIool = (IiloOlIoIool) this.I00iiO;
/* 78 */                    Ii0110 ii0110 = (Ii0110) this.I00iio;
/* 80 */                    if (z3 && ((Boolean) iiloOlIoIool.I00000oIO.invoke(IiloiO.I00iOIl)).booleanValue()) {
/* 106 */                       iOi1II01i0.I0000O(ii0110, null, null, new IoI0iiIi(iiloOlIoIool, null, 6), 3);
                            }
/* 109 */                   return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 64 */                    ((Oi0iOio) this.I00iiO).I0000Il00O(((OloooOlO10oI) this.I00iio).I00000oIO(this.I00iiI, false, true));
/* 67 */                    return OoiIlOl1iI.I00000oIO;
                        default:
/* 10 */                    Window window = (Window) this.I00iiO;
/* 14 */                    View view = (View) this.I00iio;
/* 16 */                    boolean z4 = this.I00iiI;
/* 18 */                    liIIO0.I00000oIO(window, false);
/* 23 */                    new Oi00IilOloo0(view);
/* 44 */                    (Build.VERSION.SDK_INT >= 35 ? new i00ioooO11i(window) : new OoOlO1O0o(window)).I0000oI00(!z4);
/* 47 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }
