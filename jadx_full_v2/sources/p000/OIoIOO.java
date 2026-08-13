            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class OIoIOO implements Function1 {
                public final int I00iOIl;
                public IiI0O1Io I00iiI;

                public OIoIOO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
                /* JADX WARN: Type inference failed for: r0v4 */
                /* JADX WARN: Type inference failed for: r0v5 */
                /* JADX WARN: Type inference failed for: r0v7 */
                /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
                /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
                /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    OIoI1lIli oIoI1lIli;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             OIoI1lIli oIoI1lIli2 = null;
/* 6 */             IiI0O1Io iiI0O1Io = this.I00iiI;
                    switch (i) {
                        case 0:
/* 42 */                    ?? ValueOf = (Float) obj;
/* 44 */                    float fFloatValue = ValueOf.floatValue();
/* 48 */                    long jI00000oIO = l1o0oO.I00000oIO(iiI0O1Io);
/* 54 */                    float f = iiI0O1Io.I000OOo1O + fFloatValue;
/* 56 */                    long jI000O01llI0 = O1OooO0IlOo.I000O01llI0(f);
/* 62 */                    iiI0O1Io.I000OOo1O = f - jI000O01llI0;
/* 73 */                    if (Math.abs(fFloatValue) >= 1.0E-4f) {
/* 77 */                        long j = jI00000oIO + jI000O01llI0;
/* 83 */                        long jI0000O = lIiioliIlo.I0000O(j, iiI0O1Io.I000O01llI0, iiI0O1Io.I000II);
/* 95 */                        ?? r0 = j != jI0000O;
/* 96 */                        long j2 = jI0000O - jI00000oIO;
                                float f2 = j2;
/* 98 */                        iiI0O1Io.I000OiO = f2;
/* 109 */                       if (Math.abs(j2) != 0) {
/* 124 */                           iiI0O1Io.I00II0oii1o.setValue(Boolean.valueOf(f2 > 0.0f));
/* 138 */                           iiI0O1Io.I00IO1.setValue(Boolean.valueOf(f2 < 0.0f));
                                }
/* 149 */                       int i2 = (int) j2;
/* 150 */                       int i3 = -i2;
/* 151 */                       OIoI1lIli oIoI1lIliI000O01llI0 = ((OIoI1lIli) iiI0O1Io.I000lI.getValue()).I000O01llI0(i3);
/* 155 */                       if (oIoI1lIliI000O01llI0 == null || (oIoI1lIli = iiI0O1Io.I00000oOI) == null) {
/* 169 */                           oIoI1lIli2 = oIoI1lIliI000O01llI0;
/* 170 */                           if (oIoI1lIli2 == null) {
/* 174 */                               iiI0O1Io.I000O01llI0(oIoI1lIli2, iiI0O1Io.I00000oIO, true);
/* 179 */                               iiI0O1Io.I001lIiIIo1O.setValue(ooiIlOl1iI);
                                    } else {
/* 183 */                               OIoIIOIioo oIoIIOIioo = iiI0O1Io.I0000O;
/* 187 */                               IiI0O1Io iiI0O1Io2 = (IiI0O1Io) oIoIIOIioo.I00iiI;
/* 191 */                               OIooO1iiliI oIooO1iiliI = (OIooO1iiliI) oIoIIOIioo.I00iio;
/* 213 */                               oIooO1iiliI.I000O01llI0(oIooO1iiliI.I000II() + (iiI0O1Io2.I00100l0() != 0 ? i2 / iiI0O1Io2.I00100l0() : 0.0f));
/* 222 */                               O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) iiI0O1Io.I001i1lo1io.getValue();
/* 224 */                               if (o0iiOioolIi != null) {
/* 226 */                                   o0iiOioolIi.I000iOII();
                                        }
                                    }
/* 229 */                           if (r0 != false) {
/* 231 */                               ValueOf = Long.valueOf(j2);
                                    }
/* 235 */                           fFloatValue = ValueOf.floatValue();
                                } else {
/* 161 */                           OIoI1lIli oIoI1lIliI000O01llI02 = oIoI1lIli.I000O01llI0(i3);
/* 165 */                           if (oIoI1lIliI000O01llI02 != null) {
/* 167 */                               iiI0O1Io.I00000oOI = oIoI1lIliI000O01llI02;
/* 169 */                               oIoI1lIli2 = oIoI1lIliI000O01llI0;
                                    }
/* 170 */                           if (oIoI1lIli2 == null) {
                                    }
/* 229 */                           if (r0 != false) {
                                    }
/* 235 */                           fFloatValue = ValueOf.floatValue();
                                }
                            }
/* 239 */                   return Float.valueOf(fFloatValue);
                        default:
/* 11 */                    O0llO0 o0llO0 = (O0llO0) obj;
/* 13 */                    Ol1il1o1 ol1il1o1I000OOo1O = iOl0lOIi11.I000OOo1O();
/* 19 */                    Function1 function1I0000oI00 = ol1il1o1I000OOo1O != null ? ol1il1o1I000OOo1O.I0000oI00() : null;
/* 23 */                    Ol1il1o1 ol1il1o1I000iOII = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O);
                            try {
/* 29 */                        o0llO0.I00000oIO(iiI0O1Io.I0000oI00);
/* 35 */                        return ooiIlOl1iI;
                            } finally {
/* 38 */                        iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
                            }
                    }
                }
            }
