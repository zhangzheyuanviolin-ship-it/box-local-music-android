            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class O0lllOII implements Function1 {
                public O0o0101i I00iOIl;
                public int I00iiI;
                public float I00iiO;
                public OOo0lO I00iio;
                public OOo0l0ii10l I00ilI0I1;
                public boolean I00ilO0;
                public float I00io1l;
                public OOo0ll111 I00ioIO;
                public int I00l0I0l0lO1;
                public int I00l0OO0IO;
                public OOo0ooi I00li1OI;

                /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[PHI: r10
                  0x0037: PHI (r10v12 float) = (r10v6 float), (r10v16 float) binds: [B:11:0x0047, B:7:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    float fFloatValue;
                    float f;
                    float fI00000oIO;
/* 1 */             O0o0101i o0o0101i = this.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 5 */             float f2 = this.I00iiO;
/* 7 */             OOo0lO oOo0lO = this.I00iio;
/* 9 */             OOo0l0ii10l oOo0l0ii10l = this.I00ilI0I1;
/* 11 */            boolean z = this.I00ilO0;
/* 13 */            float f3 = this.I00io1l;
/* 15 */            OOo0ll111 oOo0ll111 = this.I00ioIO;
/* 17 */            int i2 = this.I00l0I0l0lO1;
/* 19 */            int i3 = this.I00l0OO0IO;
/* 21 */            OOo0ooi oOo0ooi = this.I00li1OI;
/* 23 */            I110IIooo i110IIooo = (I110IIooo) obj;
/* 25 */            boolean zI0000Il00O = l100Il0I1l1l.I0000Il00O(o0o0101i, i);
/* 29 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 32 */            if (!zI0000Il00O) {
/* 37 */                if (f2 > 0.0f) {
/* 47 */                    fFloatValue = ((Number) i110IIooo.I0000oI00.getValue()).floatValue();
/* 53 */                    if (fFloatValue <= f2) {
/* 56 */                        f2 = fFloatValue;
                            }
/* 76 */                    f = f2 - oOo0lO.I00iOIl;
/* 77 */                    fI00000oIO = o0o0101i.I00000oIO(f);
/* 85 */                    if (!l100Il0I1l1l.I0000Il00O(o0o0101i, i) && !l100Il0I1l1l.I00000oOI(z, o0o0101i, i, i3)) {
/* 96 */                        if (f == fI00000oIO) {
/* 182 */                           i110IIooo.I00000oIO();
/* 185 */                           oOo0l0ii10l.I00iOIl = false;
/* 187 */                           return ooiIlOl1iI;
                                }
                                oOo0lO.I00iOIl += f;
/* 103 */                       if (z) {
/* 119 */                           if (((Number) i110IIooo.I0000oI00.getValue()).floatValue() > f3) {
/* 121 */                               i110IIooo.I00000oIO();
                                    }
                                } else if (((Number) i110IIooo.I0000oI00.getValue()).floatValue() < (-f3)) {
/* 142 */                           i110IIooo.I00000oIO();
                                }
/* 146 */                       if (z) {
/* 150 */                           if (oOo0ll111.I00iOIl >= 2 && i - o0o0101i.I0000oI00() > i2) {
/* 162 */                               o0o0101i.I0001Ioi1lo(i - i2, 0);
                                    }
                                } else if (oOo0ll111.I00iOIl >= 2 && o0o0101i.I0000Il00O() - i > i2) {
/* 178 */                           o0o0101i.I0001Ioi1lo(i2 + i, 0);
                                }
                            }
                        } else {
/* 66 */                    fFloatValue = ((Number) i110IIooo.I0000oI00.getValue()).floatValue();
/* 72 */                    if (fFloatValue >= f2) {
                            }
/* 76 */                    f = f2 - oOo0lO.I00iOIl;
/* 77 */                    fI00000oIO = o0o0101i.I00000oIO(f);
/* 85 */                    if (!l100Il0I1l1l.I0000Il00O(o0o0101i, i)) {
/* 96 */                        if (f == fI00000oIO) {
                                }
                            }
                        }
                    }
/* 192 */           if (!l100Il0I1l1l.I00000oOI(z, o0o0101i, i, i3)) {
/* 207 */               if (l100Il0I1l1l.I0000Il00O(o0o0101i, i)) {
/* 437 */                   throw new O00O0I(o0o0101i.I00000oOI(i), (I110IiI1I1) oOo0ooi.I00iOIl);
                        }
/* 209 */               return ooiIlOl1iI;
                    }
/* 194 */           o0o0101i.I0001Ioi1lo(i, i3);
/* 197 */           oOo0l0ii10l.I00iOIl = false;
/* 199 */           i110IIooo.I00000oIO();
/* 202 */           return ooiIlOl1iI;
                }
            }
