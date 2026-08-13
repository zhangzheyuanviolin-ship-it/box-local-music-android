            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OlOiol1 extends iO1olo1Ii implements O01OOloli {
                public final IIOo1i I00000oIO;
                public final O011OoiO1 I00000oOI;
                public final i01lIlOi I0000Il00O;
                public final O01OOloli[] I0000O;
                public final i1i0olI I0000oI00;
                public final O01IIOOIO I0001Ioi1lo;
                public boolean I000II;
                public String I000O01llI0;
                public String I000OOo1O;

                public OlOiol1(IIOo1i iIOo1i, O011OoiO1 o011OoiO1, i01lIlOi i01liloi, O01OOloli[] o01OOloliArr) {
/* 4 */             this.I00000oIO = iIOo1i;
/* 6 */             this.I00000oOI = o011OoiO1;
/* 8 */             this.I0000Il00O = i01liloi;
/* 10 */            this.I0000O = o01OOloliArr;
/* 14 */            this.I0000oI00 = o011OoiO1.I00000oOI;
/* 18 */            this.I0001Ioi1lo = o011OoiO1.I00000oIO;
/* 20 */            int iOrdinal = i01liloi.ordinal();
/* 24 */            if (o01OOloliArr != null) {
/* 26 */                O01OOloli o01OOloli = o01OOloliArr[iOrdinal];
/* 28 */                if (o01OOloli == null && o01OOloli == this) {
/* 483 */                   return;
                        }
/* 32 */                o01OOloliArr[iOrdinal] = this;
                    }
                }

                @Override
                public final i1i0olI I00000oIO() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final IOl1l0o0i1I0 I00000oOI(OilOloI oilOloI) {
                    O01OOloli o01OOloli;
/* 1 */             O011OoiO1 o011OoiO1 = this.I00000oOI;
/* 3 */             i01lIlOi i01liloiI00000oOI = liIOOi1iIII.I00000oOI(o011OoiO1, oilOloI);
/* 7 */             char c = i01liloiI00000oOI.I00iOIl;
/* 9 */             IIOo1i iIOo1i = this.I00000oIO;
/* 11 */            iIOo1i.I00100o1O0lo(c);
/* 15 */            iIOo1i.I00000oOI = true;
/* 17 */            String str = this.I000O01llI0;
/* 19 */            if (str != null) {
/* 21 */                String strI00000oIO = this.I000OOo1O;
/* 23 */                if (strI00000oIO == null) {
/* 25 */                    strI00000oIO = oilOloI.I00000oIO();
                        }
/* 29 */                iIOo1i.I000lI();
/* 32 */                I001lloI(str);
/* 37 */                iIOo1i.I00100o1O0lo(':');
/* 40 */                I001lloI(strI00000oIO);
/* 44 */                this.I000O01llI0 = null;
/* 46 */                this.I000OOo1O = null;
                    }
/* 50 */            if (this.I0000Il00O == i01liloiI00000oOI) {
/* 52 */                return this;
                    }
/* 53 */            O01OOloli[] o01OOloliArr = this.I0000O;
                    return (o01OOloliArr == null || (o01OOloli = o01OOloliArr[i01liloiI00000oOI.ordinal()]) == null) ? new OlOiol1(iIOo1i, o011OoiO1, i01liloiI00000oOI, o01OOloliArr) : o01OOloli;
                }

                @Override
                public final void I0000Il00O() {
/* 5 */             this.I00000oIO.I00111O("null");
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000O(O0O01001OOII o0o01001ooii, Object obj) {
                    String strI0000Il00O;
                    O0O01001OOII o0o01001ooiiI00000oOI;
/* 1 */             O011OoiO1 o011OoiO1 = this.I00000oOI;
/* 5 */             boolean z = o0o01001ooii instanceof I01IoO;
/* 7 */             IOIOiIloIi0 iOIOiIloIi0 = o011OoiO1.I00000oIO.I000O01llI0;
/* 9 */             if (z) {
/* 66 */                strI0000Il00O = iOIOiIloIi0 != IOIOiIloIi0.I00iOIl ? lI1lOI10li.I0000Il00O(o011OoiO1, o0o01001ooii.I0000O()) : null;
                    } else {
/* 16 */                int iOrdinal = iOIOiIloIi0.ordinal();
/* 20 */                if (iOrdinal != 0) {
/* 23 */                    if (iOrdinal == 1) {
/* 37 */                        lO1oIl1ii lo1oil1iiI000oI1ioi = o0o01001ooii.I0000O().I000oI1ioi();
/* 47 */                        if (O0000Ioio00.I0000O(lo1oil1iiI000oI1ioi, Oli00oo0l.I00000oOI) || O0000Ioio00.I0000O(lo1oil1iiI000oI1ioi, Oli00oo0l.I0000oI00)) {
                                }
                            } else if (iOrdinal != 2) {
/* 29 */                        I000II.I00000oIO();
/* 32 */                        return;
                            }
                        }
                    }
/* 67 */            if (z) {
/* 70 */                I01IoO i01IoO = (I01IoO) o0o01001ooii;
/* 72 */                if (obj == null) {
/* 87 */                    OIiilo1Ool0o.I0010o(i01IoO.I0000O(), "Value for serializer ", " should always be non-null. Please report issue to the kotlinx.serialization tracker.");
/* 90 */                    return;
                        }
/* 74 */                o0o01001ooiiI00000oOI = lI1o0lI.I00000oOI(i01IoO, this, obj);
                    } else {
/* 91 */                o0o01001ooiiI00000oOI = o0o01001ooii;
                    }
/* 92 */            if (strI0000Il00O != null) {
/* 94 */                lI1lOI10li.I00000oIO(o011OoiO1, o0o01001ooii, o0o01001ooiiI00000oOI, strI0000Il00O);
/* 105 */               lI1lOI10li.I00000oOI(o0o01001ooiiI00000oOI.I0000O().I000oI1ioi());
/* 112 */               String strI00000oIO = o0o01001ooiiI00000oOI.I0000O().I00000oIO();
/* 116 */               this.I000O01llI0 = strI0000Il00O;
/* 118 */               this.I000OOo1O = strI00000oIO;
                    }
/* 120 */           o0o01001ooiiI00000oOI.I0000Il00O(this, obj);
                }

                @Override
                public final void I0000oI00() {
/* 1 */             IIOo1i iIOo1i = this.I00000oIO;
/* 3 */             iIOo1i.getClass();
/* 7 */             iIOo1i.I00000oOI = false;
/* 13 */            iIOo1i.I00100o1O0lo(this.I0000Il00O.I00iiI);
                }

                @Override
                public final void I0001Ioi1lo(double d) {
/* 3 */             if (this.I000II) {
/* 9 */                 I001lloI(String.valueOf(d));
                    } else {
/* 23 */                ((O1I1OO) this.I00000oIO.I0000Il00O).I001i1O0Ol(String.valueOf(d));
                    }
/* 37 */            if (Math.abs(d) > Double.MAX_VALUE) {
/* 186 */               throw new O01Oio10O1l(l0I0OO0.I0001Ioi1lo(Double.valueOf(d), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
                    }
                }

                @Override
                public final void I000II(short s) {
/* 3 */             if (this.I000II) {
/* 9 */                 I001lloI(String.valueOf((int) s));
                    } else {
/* 15 */                this.I00000oIO.I001IIilI0O(s);
                    }
                }

                @Override
                public final void I000OOo1O(byte b) {
/* 3 */             if (this.I000II) {
/* 9 */                 I001lloI(String.valueOf((int) b));
                    } else {
/* 15 */                this.I00000oIO.I00100l0(b);
                    }
                }

                @Override
                public final void I000OiO(boolean z) {
/* 3 */             if (this.I000II) {
/* 9 */                 I001lloI(String.valueOf(z));
                    } else {
/* 23 */                ((O1I1OO) this.I00000oIO.I0000Il00O).I001i1O0Ol(String.valueOf(z));
                    }
                }

                @Override
                public final Il0I1ii I000iOII(OilOloI oilOloI) {
/* 1 */             boolean zI00000oIO = OlOl0IIi0OOl.I00000oIO(oilOloI);
/* 6 */             i01lIlOi i01liloi = this.I0000Il00O;
/* 8 */             O011OoiO1 o011OoiO1 = this.I00000oOI;
/* 10 */            IIOo1i iIOo1i = this.I00000oIO;
/* 12 */            if (zI00000oIO) {
/* 14 */                boolean z = iIOo1i instanceof IOl1I01;
                        IIOo1i iIOo1i2 = iIOo1i;
/* 16 */                if (!z) {
/* 21 */                    O1I1OO o1i1oo = (O1I1OO) iIOo1i.I0000Il00O;
/* 23 */                    boolean z2 = this.I000II;
/* 27 */                    IOl1I01 iOl1I01 = new IOl1I01(o1i1oo);
/* 30 */                    iOl1I01.I0001Ioi1lo = z2;
/* 32 */                    VarHandle.storeStoreFence();
                            iIOo1i2 = iOl1I01;
                        }
/* 37 */                return new OlOiol1(iIOo1i2, o011OoiO1, i01liloi, null);
                    }
/* 45 */            if (!oilOloI.I00100o1O0lo() || !oilOloI.equals(O01O1110.I00000oIO)) {
/* 84 */                if (this.I000O01llI0 != null) {
/* 90 */                    this.I000OOo1O = oilOloI.I00000oIO();
                        }
/* 186 */               return this;
                    }
/* 55 */            boolean z3 = iIOo1i instanceof IOl1I0;
                    IIOo1i iIOo1i3 = iIOo1i;
/* 57 */            if (!z3) {
/* 62 */                O1I1OO o1i1oo2 = (O1I1OO) iIOo1i.I0000Il00O;
/* 64 */                boolean z4 = this.I000II;
/* 68 */                IOl1I0 iOl1I0 = new IOl1I0(o1i1oo2);
/* 71 */                iOl1I0.I0001Ioi1lo = z4;
/* 73 */                VarHandle.storeStoreFence();
                        iIOo1i3 = iOl1I0;
                    }
/* 78 */            return new OlOiol1(iIOo1i3, o011OoiO1, i01liloi, null);
                }

                @Override
                public final void I000lI(float f) {
/* 3 */             if (this.I000II) {
/* 9 */                 I001lloI(String.valueOf(f));
                    } else {
/* 23 */                ((O1I1OO) this.I00000oIO.I0000Il00O).I001i1O0Ol(String.valueOf(f));
                    }
/* 35 */            if (Math.abs(f) > Float.MAX_VALUE) {
/* 186 */               throw new O01Oio10O1l(l0I0OO0.I0001Ioi1lo(Float.valueOf(f), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
                    }
                }

                @Override
                public final void I00100l0(char c) {
/* 5 */             I001lloI(String.valueOf(c));
                }

                @Override
                public final void I0010I0i(OilOloI oilOloI, int i) {
/* 5 */             I001lloI(oilOloI.I0001Ioi1lo(i));
                }

                @Override
                public final void I001i1lo1io(int i) {
/* 3 */             if (this.I000II) {
/* 9 */                 I001lloI(String.valueOf(i));
                    } else {
/* 15 */                this.I00000oIO.I0010I0i(i);
                    }
                }

                @Override
                public final void I001iOo1i0O(OilOloI oilOloI, int i, O0O01001OOII o0o01001ooii, Object obj) {
/* 1 */             if (obj != null || this.I0001Ioi1lo.I0000O) {
/* 11 */                super.I001iOo1i0O(oilOloI, i, o0o01001ooii, obj);
                    }
                }

                @Override
                public final void I001l0I00(long j) {
/* 3 */             if (this.I000II) {
/* 9 */                 I001lloI(String.valueOf(j));
                    } else {
/* 15 */                this.I00000oIO.I0010o(j);
                    }
                }

                @Override
                public final boolean I001lIiIIo1O() {
/* 3 */             return this.I0001Ioi1lo.I00000oIO;
                }

                @Override
                public final void I001lloI(String str) {
/* 3 */             this.I00000oIO.I001IO000(str);
                }

                @Override
                public final void I00II0Ol1O0l(OilOloI oilOloI, int i) {
/* 3 */             int iOrdinal = this.I0000Il00O.ordinal();
/* 9 */             IIOo1i iIOo1i = this.I00000oIO;
/* 11 */            boolean z = true;
/* 12 */            if (iOrdinal == 1) {
/* 99 */                if (!iIOo1i.I00000oOI) {
/* 101 */                   iIOo1i.I00100o1O0lo(',');
                        }
/* 104 */               iIOo1i.I000lI();
/* 551 */               return;
                    }
/* 18 */            if (iOrdinal == 2) {
/* 69 */                if (iIOo1i.I00000oOI) {
/* 91 */                    this.I000II = true;
/* 93 */                    iIOo1i.I000lI();
/* 96 */                    return;
                        }
/* 72 */                if (i % 2 == 0) {
/* 74 */                    iIOo1i.I00100o1O0lo(',');
/* 77 */                    iIOo1i.I000lI();
                        } else {
/* 81 */                    iIOo1i.I00100o1O0lo(':');
/* 84 */                    iIOo1i.I001i1lo1io();
/* 87 */                    z = false;
                        }
/* 88 */                this.I000II = z;
/* 90 */                return;
                    }
/* 21 */            if (iOrdinal != 3) {
/* 25 */                if (!iIOo1i.I00000oOI) {
/* 27 */                    iIOo1i.I00100o1O0lo(',');
                        }
/* 30 */                iIOo1i.I000lI();
/* 35 */                O01iI00o.I0000O(this.I00000oOI, oilOloI);
/* 42 */                I001lloI(oilOloI.I0001Ioi1lo(i));
/* 45 */                iIOo1i.I00100o1O0lo(':');
/* 48 */                iIOo1i.I001i1lo1io();
/* 51 */                return;
                    }
/* 52 */            if (i == 0) {
/* 54 */                this.I000II = true;
                    }
/* 56 */            if (i == 1) {
/* 58 */                iIOo1i.I00100o1O0lo(',');
/* 61 */                iIOo1i.I001i1lo1io();
/* 64 */                this.I000II = false;
                    }
                }
            }
