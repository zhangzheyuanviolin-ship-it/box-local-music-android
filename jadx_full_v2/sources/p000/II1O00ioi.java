            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class II1O00ioi implements Function1 {
                public final int I00iOIl;
                public float I00iiI;
                public Object I00iiO;

                public II1O00ioi(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    boolean z;
/* 1 */             int i = this.I00iOIl;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 6 */             boolean z2 = false;
                    switch (i) {
                        case 0:
/* 205 */                   Ol010000lo00 ol010000lo00 = (Ol010000lo00) this.I00iiO;
/* 207 */                   float f = this.I00iiI;
/* 209 */                   Oi11lOiIoi oi11lOiIoi = (Oi11lOiIoi) obj;
/* 217 */                   float fI000II = ((OIooO1iiliI) ol010000lo00.I0000oI00.I000l1).I000II();
/* 230 */                   float fIntBitsToFloat = Float.intBitsToFloat((int) (oi11lOiIoi.I00oI0i & 4294967295L));
/* 238 */                   if (!Float.isNaN(fI000II) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
/* 255 */                       oi11lOiIoi.I000iOII(iOi0ilOl10I.I0000Il00O(oi11lOiIoi, f));
/* 262 */                       oi11lOiIoi.I000l1(iOi0ilOl10I.I0000O(oi11lOiIoi, f));
/* 273 */                       oi11lOiIoi.I001iOo1i0O(lOo0o0.I00000oIO(0.5f, (fI000II + fIntBitsToFloat) / fIntBitsToFloat));
                                break;
                            }
                            break;
                        case 1:
/* 130 */                   float f2 = this.I00iiI;
/* 134 */                   OOo0l0ii10l oOo0l0ii10l = (OOo0l0ii10l) this.I00iiO;
/* 136 */                   Iill1Iloi0 iill1Iloi0 = (Iill1Iloi0) obj;
/* 144 */                   boolean zI0000O = O0000Ioio00.I0000O(iill1Iloi0.I00O0i0ii(), "waiting");
/* 152 */                   if (iill1Iloi0.I00Oio() == null) {
/* 154 */                       z = false;
                            } else {
/* 156 */                       OIilII oIilIII00Oio = iill1Iloi0.I00Oio();
/* 160 */                       IillI1lo11l0 iillI1lo11l0 = IillIi1.I00000oIO;
/* 166 */                       if (oIilIII00Oio != OIilII.I00iiI ? !(f2 <= 30.0f || f2 > 90.0f) : f2 <= 30.0f) {
/* 172 */                           z = true;
                                }
                            }
/* 187 */                   if (oOo0l0ii10l.I00iOIl || (zI0000O && z)) {
/* 193 */                       z2 = true;
                            }
/* 194 */                   oOo0l0ii10l.I00iOIl = z2;
                            break;
                        case 2:
/* 101 */                   Function1 function1 = (Function1) this.I00iiO;
/* 105 */                   I10l1l11 i10l1l11 = (I10l1l11) obj;
                            break;
                        case 3:
/* 89 */                    OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 95 */                    oO11o0IO.I000O01llI0((OO1I0001000i) this.I00iiO, oO11o0IO.I00l0OO0IO(this.I00iiI), 0, 0.0f);
                            break;
                        default:
/* 13 */                    OoI1Oi0l1I0o ooI1Oi0l1I0o = (OoI1Oi0l1I0o) this.I00iiO;
/* 15 */                    float f3 = this.I00iiI;
/* 19 */                    long jLongValue = ((Long) obj).longValue();
/* 23 */                    boolean zI000OOo1O = ooI1Oi0l1I0o.I000OOo1O();
/* 27 */                    OIool0l11 oIool0l11 = ooI1Oi0l1I0o.I000O01llI0;
/* 29 */                    if (!zI000OOo1O) {
/* 39 */                        if (oIool0l11.I000II() == Long.MIN_VALUE) {
/* 41 */                            oIool0l11.I000O01llI0(jLongValue);
/* 52 */                            ((OIooliIO0) ooI1Oi0l1I0o.I00000oIO.I00iOIl).setValue(Boolean.TRUE);
                                }
/* 59 */                        long jI000II = jLongValue - oIool0l11.I000II();
/* 62 */                        if (f3 != 0.0f) {
/* 68 */                            jI000II = O1OooO0IlOo.I000O01llI0(jI000II / f3);
                                }
/* 72 */                        ooI1Oi0l1I0o.I00100l0(jI000II);
/* 79 */                        ooI1Oi0l1I0o.I000OiO(jI000II, f3 == 0.0f);
                                break;
                            }
                            break;
                    }
/* 82 */            return ooiIlOl1iI;
                }
            }
