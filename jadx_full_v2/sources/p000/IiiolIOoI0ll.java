            package p000;

            import android.content.Context;
            
            public final class IiiolIOoI0ll implements IllOOo00lI {
                public final int I00iOIl;
                public boolean I00iiI;
                public IllOOo00lI I00iiO;
                public OI10i0Il I00iio;
                public OI10i0Il I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;

                public IiiolIOoI0ll(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 55 */                    boolean z = this.I00iiI;
/* 59 */                    O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00ilO0;
/* 63 */                    OoI01iiOoo01 ooI01iiOoo01 = (OoI01iiOoo01) this.I00io1l;
/* 65 */                    IllOOo00lI illOOo00lI = this.I00iiO;
/* 67 */                    OI10i0Il oI10i0Il = this.I00iio;
/* 69 */                    OI10i0Il oI10i0Il2 = this.I00ilI0I1;
/* 71 */                    if (z && !((Boolean) oI10i0Il.getValue()).booleanValue()) {
/* 95 */                        if (OlOoOIi0o.I000oI1ioi(o1oIOiI11o0.I00000oIO, "Gemma", true)) {
/* 97 */                            Ii1liIllli0 ii1liIllli0 = ooI01iiOoo01.I00000oOI;
/* 99 */                            ii1liIllli0.getClass();
/* 122 */                           if (!((Boolean) iOi1IOoIO0l.I00000oIO(Il00o11.I00iOIl, new Ii1l100(ii1liIllli0, null, 11))).booleanValue()) {
/* 126 */                               oI10i0Il2.setValue(Boolean.TRUE);
                                        break;
                                    } else {
/* 130 */                               illOOo00lI.invoke();
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
/* 8 */                     boolean z2 = this.I00iiI;
/* 10 */                    IllOOo00lI illOOo00lI2 = this.I00iiO;
/* 14 */                    Context context = (Context) this.I00ilO0;
/* 18 */                    O1OIi1 o1OIi1 = (O1OIi1) this.I00io1l;
/* 20 */                    OI10i0Il oI10i0Il3 = this.I00iio;
/* 22 */                    OI10i0Il oI10i0Il4 = this.I00ilI0I1;
/* 25 */                    if (!z2) {
/* 40 */                        if (iOI10i0I11.I00000oIO(context, "android.permission.CAMERA") != 0) {
/* 51 */                            o1OIi1.I00000oIO("android.permission.CAMERA");
                                    break;
                                } else {
/* 42 */                            l1O0o1.I0000Il00O(oI10i0Il3, false);
/* 47 */                            oI10i0Il4.setValue(Boolean.TRUE);
                                    break;
                                }
                            } else {
/* 27 */                        illOOo00lI2.invoke();
/* 30 */                        l1O0o1.I0000Il00O(oI10i0Il3, false);
                                break;
                            }
                    }
/* 54 */            return ooiIlOl1iI;
                }
            }
