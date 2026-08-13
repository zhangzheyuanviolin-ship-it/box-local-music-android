            package p000;

            import java.util.List;
            
            public final class O0o0101i implements OiOiliiO {
                public final int I00000oIO;
                public OiOiliiO I00000oOI;
                public OiOoi0I0o0i I0000Il00O;

                public O0o0101i(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final float I00000oIO(float f) {
                    switch (this.I00000oIO) {
                    }
/* 8 */             return this.I00000oOI.I00000oIO(f);
                }

                public final int I00000oOI(int i) {
                    Object obj;
                    switch (this.I00000oIO) {
                        case 0:
/* 62 */                    O0o0I1i0O o0o0I1i0O = (O0o0I1i0O) this.I0000Il00O;
/* 64 */                    O0o00O1Oi00 o0o00O1Oi00I000OiO = o0o0I1i0O.I000OiO();
/* 75 */                    if (o0o00O1Oi00I000OiO.I000l1.isEmpty()) {
/* 74 */                        return 0;
                            }
/* 78 */                    int iI000O01llI0 = o0o0I1i0O.I000O01llI0();
/* 86 */                    if (i > I0000oI00() || iI000O01llI0 > i) {
/* 139 */                       return ((i - o0o0I1i0O.I000O01llI0()) * l101lII0l1ol.I00000oIO(o0o00O1Oi00I000OiO)) - o0o0I1i0O.I000OOo1O();
                            }
/* 90 */                    List list = o0o00O1Oi00I000OiO.I000l1;
/* 95 */                    int size = list.size();
/* 99 */                    int i2 = 0;
                            while (true) {
/* 100 */                       if (i2 < size) {
/* 102 */                           obj = list.get(i2);
/* 111 */                           if (((O0o0100I) obj).I00000oIO != i) {
/* 114 */                               i2++;
                                    }
                                } else {
/* 117 */                           obj = null;
                                }
                            }
/* 118 */                   O0o0100I o0o0100I = (O0o0100I) obj;
/* 120 */                   if (o0o0100I != null) {
/* 122 */                       return o0o0100I.I000o00OoI0I;
                            }
/* 74 */                    return 0;
                        default:
/* 8 */                     OIoIoIO0oI1O oIoIoIO0oI1O = (OIoIoIO0oI1O) this.I0000Il00O;
/* 58 */                    return (int) (lIiioliIlo.I0000O(l1o0oO.I00000oIO(oIoIoIO0oI1O) + O1OooO0IlOo.I000II(((oIoIoIO0oI1O.I00100l0() * (i - oIoIoIO0oI1O.I000iOII())) - (oIoIoIO0oI1O.I000l1() * oIoIoIO0oI1O.I00100l0())) + 0.0f), oIoIoIO0oI1O.I000O01llI0, oIoIoIO0oI1O.I000II) - l1o0oO.I00000oIO(oIoIoIO0oI1O));
                    }
                }

                public final int I0000Il00O() {
                    switch (this.I00000oIO) {
                        case 0:
/* 17 */                    return ((O0o0I1i0O) this.I0000Il00O).I000O01llI0();
                        default:
/* 10 */                    return ((OIoIoIO0oI1O) this.I0000Il00O).I0000oI00;
                    }
                }

                public final int I0000O() {
                    switch (this.I00000oIO) {
                        case 0:
/* 17 */                    return ((O0o0I1i0O) this.I0000Il00O).I000OOo1O();
                        default:
/* 10 */                    return ((OIoIoIO0oI1O) this.I0000Il00O).I0001Ioi1lo;
                    }
                }

                public final int I0000oI00() {
                    switch (this.I00000oIO) {
                        case 0:
/* 39 */                    O0o0100I o0o0100I = (O0o0100I) IOOi0Ool1i.I00IoIO0lI(((O0o0I1i0O) this.I0000Il00O).I000OiO().I000l1);
/* 41 */                    if (o0o0100I != null) {
/* 43 */                        return o0o0100I.I00000oIO;
                            }
/* 46 */                    return 0;
                        default:
/* 22 */                    return ((O1iOii1) IOOi0Ool1i.I00Io1o110i(((OIoIoIO0oI1O) this.I0000Il00O).I000lI().I00000oIO)).I00000oIO;
                    }
                }

                public final void I0001Ioi1lo(int i, int i2) {
                    switch (this.I00000oIO) {
                        case 0:
/* 33 */                    ((O0o0I1i0O) this.I0000Il00O).I000l1(i, i2);
                            break;
                        default:
/* 8 */                     OIoIoIO0oI1O oIoIoIO0oI1O = (OIoIoIO0oI1O) this.I0000Il00O;
/* 10 */                    float fI00100l0 = oIoIoIO0oI1O.I00100l0();
/* 25 */                    oIoIoIO0oI1O.I001IIilI0O(i, fI00100l0 != 0.0f ? i2 / fI00100l0 : 0.0f, true);
                            break;
                    }
                }
            }
