            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class O1IiOiiol extends OO11o0IO {
                public final int I00iiI;
                public Object I00iiO;

                public O1IiOiiol(int i) {
/* 1 */             this.I00iiI = i;
                }

                @Override
                public final float I00000oIO() {
                    switch (this.I00iiI) {
                        case 0:
/* 23 */                    return ((O1IiO0l) this.I00iiO).I00000oIO();
                        default:
/* 14 */                    return ((I0lio1O01i01) this.I00iiO).getDensity().I00000oIO();
                    }
                }

                @Override
                public float I00000oOI(IoI1O1i1 ioI1O1i1) {
                    Function1 function1;
                    int iI001l0I00;
                    OIlOIi0 snapshotObserver;
                    int iI001l0I002;
                    switch (this.I00iiI) {
                        case 0:
/* 11 */                    IlliIl1l11O illiIl1l11O = ioI1O1i1.I00000oIO;
/* 15 */                    if (illiIl1l11O != null) {
/* 27 */                        return ((Number) illiIl1l11O.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                            }
/* 35 */                    O1IiO0l o1IiO0l = (O1IiO0l) this.I00iiO;
/* 39 */                    if (o1IiO0l.I00o0iI0io1) {
/* 13 */                        return Float.NaN;
                            }
/* 45 */                    OOo0ooi oOo0ooi = new OOo0ooi();
/* 48 */                    oOo0ooi.I00iOIl = o1IiO0l;
                            while (true) {
/* 54 */                        I11l01l i11l01l = ((O1IiO0l) oOo0ooi.I00iOIl).I00o101lO;
/* 76 */                        float f = (i11l01l == null || (iI001l0I002 = I1IoiO1l.I001l0I00((IoI1O1i1[]) i11l01l.I0000Il00O, ioI1O1i1)) < 0) ? Float.NaN : ((float[]) i11l01l.I0000O)[iI001l0I002];
/* 77 */                        boolean zIsNaN = Float.isNaN(f);
/* 81 */                        Object obj = oOo0ooi.I00iOIl;
/* 83 */                        if (!zIsNaN) {
/* 91 */                            ((O1IiO0l) obj).I00ioIO(o1IiO0l.I00olI(), ioI1O1i1);
/* 106 */                           return ioI1O1i1.I00000oIO(f, ((O1IiO0l) oOo0ooi.I00iOIl).I00oIiI10(), o1IiO0l.I00oIiI10());
                                }
/* 112 */                       O1IiO0l o1IiO0l2 = (O1IiO0l) obj;
/* 114 */                       IlliIl1l11O illiIl1l11O2 = o1IiO0l2.I00ioIO;
/* 116 */                       if (illiIl1l11O2 != null && (function1 = o1IiO0l2.I00l0I0l0lO1) != null && ((Boolean) function1.invoke(ioI1O1i1)).booleanValue()) {
/* 137 */                           O1IiO0l o1IiO0l3 = (O1IiO0l) oOo0ooi.I00iOIl;
/* 139 */                           OI10I1IoI0Ol oI10I1IoI0Ol = o1IiO0l3.I00li1OI;
/* 141 */                           if (oI10I1IoI0Ol == null) {
/* 143 */                               long[] jArr = OiO10oio.I00000oIO;
/* 147 */                               oI10I1IoI0Ol = new OI10I1IoI0Ol();
/* 150 */                               o1IiO0l3.I00li1OI = oI10I1IoI0Ol;
                                    }
/* 152 */                           Object objI000II = oI10I1IoI0Ol.I000II(ioI1O1i1);
/* 156 */                           if (objI000II == null) {
/* 164 */                               objI000II = new OO1I01i(o1IiO0l3.I00ooIo0(), o1IiO0l3, ioI1O1i1);
/* 167 */                               oI10I1IoI0Ol.I000lI(ioI1O1i1, objI000II);
                                    }
/* 170 */                           OO1I01i oO1I01i = (OO1I01i) objI000II;
/* 176 */                           oO1I01i.I00iOIl = o1IiO0l3.I00ooIo0();
/* 182 */                           OIlO000O01 oIlO000O01 = o1IiO0l.I00olI().I00o0iI0io1;
/* 184 */                           if (oIlO000O01 != null && (snapshotObserver = ((I0lio1O01i01) oIlO000O01).getSnapshotObserver()) != null) {
/* 198 */                               I0iI0O1IoIoI i0iI0O1IoIoI = new I0iI0O1IoIoI(26);
/* 201 */                               i0iI0O1IoIoI.I00iiI = illiIl1l11O2;
/* 203 */                               i0iI0O1IoIoI.I00iiO = oOo0ooi;
/* 205 */                               i0iI0O1IoIoI.I00iio = ioI1O1i1;
/* 207 */                               VarHandle.storeStoreFence();
/* 214 */                               snapshotObserver.I00000oIO.I0000oI00(oO1I01i, O1IiO0l.I00oIiI10, i0iI0O1IoIoI);
                                    }
/* 225 */                           ((O1IiO0l) oOo0ooi.I00iOIl).I00ioIO(o1IiO0l.I00olI(), ioI1O1i1);
/* 232 */                           I11l01l i11l01l2 = ((O1IiO0l) oOo0ooi.I00iOIl).I00o101lO;
/* 254 */                           float f2 = (i11l01l2 == null || (iI001l0I00 = I1IoiO1l.I001l0I00((IoI1O1i1[]) i11l01l2.I0000Il00O, ioI1O1i1)) < 0) ? Float.NaN : ((float[]) i11l01l2.I0000O)[iI001l0I00];
/* 259 */                           if (!Float.isNaN(f2)) {
/* 273 */                               return ioI1O1i1.I00000oIO(f2, ((O1IiO0l) oOo0ooi.I00iOIl).I00oIiI10(), o1IiO0l.I00oIiI10());
                                    }
                                }
/* 282 */                       O1IiO0l o1IiO0lI00ooiO1I = ((O1IiO0l) oOo0ooi.I00iOIl).I00ooiO1I();
/* 286 */                       if (o1IiO0lI00ooiO1I == null) {
/* 296 */                           ((O1IiO0l) oOo0ooi.I00iOIl).I00ioIO(o1IiO0l.I00olI(), ioI1O1i1);
/* 13 */                            return Float.NaN;
                                }
/* 300 */                       oOo0ooi.I00iOIl = o1IiO0lI00ooiO1I;
                            }
                            break;
                        default:
/* 6 */                     return super.I00000oOI(ioI1O1i1);
                    }
                }

                @Override
                public final O0iOOo0Ii I0000Il00O() {
                    switch (this.I00iiI) {
                        case 0:
/* 23 */                    O1IiO0l o1IiO0l = (O1IiO0l) this.I00iiO;
/* 31 */                    O0iOOo0Ii o0iOOo0IiI00oIiI10 = o1IiO0l.I00o0iI0io1 ? null : o1IiO0l.I00oIiI10();
/* 35 */                    if (o0iOOo0IiI00oIiI10 == null) {
/* 43 */                        o1IiO0l.I00olI().I010I0.I00000oOI();
                            }
/* 46 */                    return o0iOOo0IiI00oIiI10;
                        default:
/* 18 */                    return (OIIlIII0Ili) ((I0lio1O01i01) this.I00iiO).getRoot().I010101Oo1lO.I00ilI0I1;
                    }
                }

                @Override
                public final O0iOOoiioO I0000O() {
                    switch (this.I00iiI) {
                        case 0:
/* 19 */                    return ((O1IiO0l) this.I00iiO).getLayoutDirection();
                        default:
/* 10 */                    return ((I0lio1O01i01) this.I00iiO).getLayoutDirection();
                    }
                }

                @Override
                public final int I0001Ioi1lo() {
                    switch (this.I00iiI) {
                        case 0:
/* 25 */                    return ((O1IiO0l) this.I00iiO).I00Ol10();
                        default:
/* 18 */                    return ((I0lio1O01i01) this.I00iiO).getRoot().I010I0.I00100l0.I00iOIl;
                    }
                }

                @Override
                public final float I00Ol00() {
                    switch (this.I00iiI) {
                        case 0:
/* 23 */                    return ((O1IiO0l) this.I00iiO).I00Ol00();
                        default:
/* 14 */                    return ((I0lio1O01i01) this.I00iiO).getDensity().I00Ol00();
                    }
                }
            }
