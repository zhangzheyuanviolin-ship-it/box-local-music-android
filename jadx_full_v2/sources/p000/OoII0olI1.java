            package p000;

            import android.content.Context;
            
            public final class OoII0olI1 implements IllOOo00lI {
                public final int I00iOIl;
                public OoIO11oiiiil I00iiI;
                public OI10i0Il I00iiO;
                public Context I00iio;
                public O1oIOiI11o0 I00ilI0I1;
                public O1OIi1 I00ilO0;
                public OI10i0Il I00io1l;

                @Override
                public final Object invoke() throws Exception {
                    switch (this.I00iOIl) {
                        case 0:
/* 71 */                    OoIO11oiiiil ooIO11oiiiil = this.I00iiI;
/* 73 */                    OI10i0Il oI10i0Il = this.I00iiO;
/* 75 */                    Context context = this.I00iio;
/* 77 */                    O1oIOiI11o0 o1oIOiI11o0 = this.I00ilI0I1;
/* 79 */                    O1OIi1 o1OIi1 = this.I00ilO0;
/* 81 */                    OI10i0Il oI10i0Il2 = this.I00io1l;
/* 89 */                    OoII00OiO ooII00OiO = ((OoIIo0oOI1) oI10i0Il.getValue()).I0000Il00O;
/* 91 */                    OoII00OiO ooII00OiO2 = OoII00OiO.I00iiI;
/* 93 */                    if (ooII00OiO != ooII00OiO2) {
/* 112 */                       OoIIOoO ooIIOoO = OoIIOoO.I00iOIl;
/* 118 */                       if (iOI10i0I11.I00000oIO(context, "android.permission.RECORD_AUDIO") == 0) {
/* 120 */                           ooIO11oiiiil.I0001Ioi1lo(context, o1oIOiI11o0, ooIIOoO);
                                } else {
/* 124 */                           oI10i0Il2.setValue(ooIIOoO);
/* 127 */                           o1OIi1.I00000oIO("android.permission.RECORD_AUDIO");
                                }
                            } else if (((OoIIo0oOI1) ooIO11oiiiil.I00000oOI.getValue()).I0000Il00O == ooII00OiO2) {
/* 109 */                       ooIO11oiiiil.I0000O.I00000oIO = true;
                            }
                            break;
                        default:
/* 9 */                     OoIO11oiiiil ooIO11oiiiil2 = this.I00iiI;
/* 11 */                    OI10i0Il oI10i0Il3 = this.I00iiO;
/* 13 */                    Context context2 = this.I00iio;
/* 15 */                    O1oIOiI11o0 o1oIOiI11o02 = this.I00ilI0I1;
/* 17 */                    O1OIi1 o1OIi12 = this.I00ilO0;
/* 19 */                    OI10i0Il oI10i0Il4 = this.I00io1l;
/* 27 */                    OoII00OiO ooII00OiO3 = ((OoIIo0oOI1) oI10i0Il3.getValue()).I0000Il00O;
/* 29 */                    OoII00OiO ooII00OiO4 = OoII00OiO.I00iiI;
/* 31 */                    if (ooII00OiO3 != ooII00OiO4) {
/* 50 */                        OoIIOoO ooIIOoO2 = OoIIOoO.I00iiI;
/* 56 */                        if (iOI10i0I11.I00000oIO(context2, "android.permission.RECORD_AUDIO") == 0) {
/* 58 */                            ooIO11oiiiil2.I0001Ioi1lo(context2, o1oIOiI11o02, ooIIOoO2);
                                } else {
/* 62 */                            oI10i0Il4.setValue(ooIIOoO2);
/* 65 */                            o1OIi12.I00000oIO("android.permission.RECORD_AUDIO");
                                }
                            } else if (((OoIIo0oOI1) ooIO11oiiiil2.I00000oOI.getValue()).I0000Il00O == ooII00OiO4) {
/* 47 */                        ooIO11oiiiil2.I0000O.I00000oIO = true;
                            }
                            break;
                    }
/* 68 */            return OoiIlOl1iI.I00000oIO;
                }
            }
