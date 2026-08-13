            package p000;

            import android.graphics.PointF;
            import java.io.EOFException;
            import java.io.IOException;
            import java.util.List;
            
            public final class OIlOlI extends OIlOl1I0IliO {
                public IIOO01IIlii I00l0OO0IO;
                public IliIo0lOI I00li1OI;
                public boolean I00ll1;
                public Float I00lli11;
                public O1OoooIi1Ol0 I00lll10;
                public I0i110Oli0 I00o0iI0io1;
                public II1i0i0ilO I00o0l1o1o0;

                @Override
                public final O1OoooIi1Ol0 I00000oIO() {
                    List listI00000oIO;
/* 1 */             O1OoooIi1Ol0 o1OoooIi1Ol0 = this.I00lll10;
/* 3 */             if (o1OoooIi1Ol0 != null) {
/* 541 */               return o1OoooIi1Ol0;
                    }
/* 5 */             IIOO01IIlii iIOO01IIlii = this.I00l0OO0IO;
/* 7 */             if (iIOO01IIlii != null) {
/* 9 */                 listI00000oIO = iIOO01IIlii.I00000oIO();
                    } else {
                        try {
/* 16 */                    listI00000oIO = this.I00li1OI.I00000oIO();
                        } catch (IOException unused) {
/* 133 */                   return new O1OoooIi1Ol0(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
                        }
                    }
/* 20 */            if (listI00000oIO == null || listI00000oIO.size() != 6) {
/* 115 */               O1OoooIi1Ol0 o1OoooIi1Ol02 = new O1OoooIi1Ol0(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
/* 118 */               this.I00lll10 = o1OoooIi1Ol02;
/* 120 */               return o1OoooIi1Ol02;
                    }
/* 97 */            O1OoooIi1Ol0 o1OoooIi1Ol03 = new O1OoooIi1Ol0(((Number) listI00000oIO.get(0)).floatValue(), ((Number) listI00000oIO.get(1)).floatValue(), ((Number) listI00000oIO.get(2)).floatValue(), ((Number) listI00000oIO.get(3)).floatValue(), ((Number) listI00000oIO.get(4)).floatValue(), ((Number) listI00000oIO.get(5)).floatValue());
/* 100 */           this.I00lll10 = o1OoooIi1Ol03;
/* 102 */           return o1OoooIi1Ol03;
                }

                @Override
                public final float I00000oOI(int i) throws EOFException {
                    float fI000O01llI0;
                    int i2;
/* 1 */             IliIo0lOI iliIo0lOI = this.I00li1OI;
/* 3 */             int iI0000O = I0000O(i);
/* 7 */             IIOO01IIlii iIOO01IIlii = this.I00l0OO0IO;
/* 9 */             if (iIOO01IIlii != null) {
/* 11 */                IIOl1o iIOl1oI0000oI00 = iIOO01IIlii.I0000oI00(iI0000O);
/* 17 */                if (iIOl1oI0000oI00.I0000O == null) {
/* 19 */                    iIOl1oI0000oI00.I00000oIO();
                        }
/* 22 */                i2 = iIOl1oI0000oI00.I0000oI00;
                    } else {
/* 28 */                if (!this.I00ll1 || !(iliIo0lOI instanceof IIOiool0I)) {
/* 66 */                    String strI00100l0 = this.I00iOIl.I00100l0(i);
/* 84 */                    fI000O01llI0 = iliIo0lOI.I000O01llI0(strI00100l0 == null ? ".notdef" : li00oIo.I00000oIO(strI00100l0.codePointAt(0)));
/* 91 */                    PointF pointF = new PointF(fI000O01llI0, 0.0f);
/* 94 */                    I0i110Oli0 i0i110Oli0 = this.I00o0iI0io1;
/* 96 */                    i0i110Oli0.getClass();
/* 99 */                    double d = pointF.x;
/* 104 */                   double d2 = i0i110Oli0.I00iOIl * d;
/* 105 */                   double d3 = pointF.y;
/* 127 */                   pointF.set((float) ((i0i110Oli0.I00iiO * d3) + d2 + i0i110Oli0.I00ilI0I1), (float) ((d3 * i0i110Oli0.I00iio) + (d * i0i110Oli0.I00iiI) + i0i110Oli0.I00ilO0));
/* 130 */                   return pointF.x;
                        }
/* 50 */                OoIolOO1 ooIolOO1I0000oI00 = ((IIOiool0I) iliIo0lOI).I0000oI00(iI0000O, "GID+" + iI0000O);
/* 56 */                if (ooIolOO1I0000oI00.I0000O == null) {
/* 58 */                    ooIolOO1I0000oI00.I00000oIO();
                        }
/* 61 */                i2 = ooIolOO1I0000oI00.I0000oI00;
                    }
                    fI000O01llI0 = i2;
/* 91 */            PointF pointF2 = new PointF(fI000O01llI0, 0.0f);
/* 94 */            I0i110Oli0 i0i110Oli02 = this.I00o0iI0io1;
/* 96 */            i0i110Oli02.getClass();
/* 99 */            double d4 = pointF2.x;
/* 104 */           double d22 = i0i110Oli02.I00iOIl * d4;
/* 105 */           double d32 = pointF2.y;
/* 127 */           pointF2.set((float) ((i0i110Oli02.I00iiO * d32) + d22 + i0i110Oli02.I00ilI0I1), (float) ((d32 * i0i110Oli02.I00iio) + (d4 * i0i110Oli02.I00iiI) + i0i110Oli02.I00ilO0));
/* 130 */           return pointF2.x;
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return this.I00ll1;
                }

                @Override
                public final int I0000O(int i) {
/* 5 */             return this.I00iOIl.I00li1OI.I00000oOI(i);
                }

                @Override
                public final int I0000oI00(int i) {
/* 1 */             int iI0000O = I0000O(i);
/* 5 */             IIOO01IIlii iIOO01IIlii = this.I00l0OO0IO;
                    return iIOO01IIlii != null ? iIOO01IIlii.I00iiO.I0000Il00O(iI0000O) : iI0000O;
                }

                @Override
                public final float I0001Ioi1lo() {
/* 1 */             Float fValueOf = this.I00lli11;
/* 3 */             if (fValueOf == null) {
/* 7 */                 fValueOf = Float.valueOf(500.0f);
/* 11 */                this.I00lli11 = fValueOf;
                    }
/* 13 */            return fValueOf.floatValue();
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final II1i0i0ilO getBoundingBox() {
                    II1i0i0ilO iI1i0i0ilO;
/* 1 */             II1i0i0ilO iI1i0i0ilO2 = this.I00o0l1o1o0;
/* 3 */             if (iI1i0i0ilO2 != null) {
/* 113 */               return iI1i0i0ilO2;
                    }
/* 9 */             if (I000OiO() != null) {
/* 15 */                OIloOoil011l oIloOoil011lI00000oIO = I000OiO().I00000oIO();
/* 26 */                if (oIloOoil011lI00000oIO.I00000oIO() == 0.0f && oIloOoil011lI00000oIO.I00000oOI() == 0.0f && oIloOoil011lI00000oIO.I0000Il00O() == 0.0f && oIloOoil011lI00000oIO.I0000O() == 0.0f) {
/* 74 */                    IIOO01IIlii iIOO01IIlii = this.I00l0OO0IO;
/* 76 */                    if (iIOO01IIlii != null) {
/* 78 */                        iI1i0i0ilO = iIOO01IIlii.I0000Il00O();
                            } else {
                                try {
/* 85 */                            iI1i0i0ilO = this.I00li1OI.I0000Il00O();
                                } catch (IOException unused) {
/* 93 */                            iI1i0i0ilO = new II1i0i0ilO(1);
                                }
                            }
                        } else {
/* 70 */                    iI1i0i0ilO = new II1i0i0ilO(oIloOoil011lI00000oIO.I00000oIO(), oIloOoil011lI00000oIO.I00000oOI(), oIloOoil011lI00000oIO.I0000Il00O(), oIloOoil011lI00000oIO.I0000O());
                        }
                    }
/* 96 */            this.I00o0l1o1o0 = iI1i0i0ilO;
/* 98 */            return iI1i0i0ilO;
                }
            }
