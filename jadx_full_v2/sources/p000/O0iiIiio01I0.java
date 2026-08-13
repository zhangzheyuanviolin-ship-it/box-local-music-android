            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class O0iiIiio01I0 extends OIIlIII0Ili {
                public static final I0oiil10Ili I011lO1liO1O;
                public O0iOoioOoI I011iIOio;
                public IOo0oO11ll1O I011iO;
                public O0ii1o I011iiii0i;
                public I1IOl1 I011lIilI0lo;

                static {
/* 1 */             I0oiil10Ili i0oiil10IliI00000oIO = iOIlil0Il1i.I00000oIO();
/* 5 */             int i = IOOiio0i.I000oI1ioi;
/* 9 */             i0oiil10IliI00000oIO.I0010o(IOOiio0i.I000OOo1O);
/* 14 */            i0oiil10IliI00000oIO.I001l0I00(1.0f);
/* 18 */            i0oiil10IliI00000oIO.I001lIiIIo1O(1);
/* 21 */            I011lO1liO1O = i0oiil10IliI00000oIO;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public O0iiIiio01I0(O0iiOioolIi o0iiOioolIi, O0iOoioOoI o0iOoioOoI) {
/* 1 */             super(o0iiOioolIi);
/* 4 */             this.I011iIOio = o0iOoioOoI;
/* 18 */            this.I011iiii0i = o0iiOioolIi.I00l0I0l0lO1 != null ? new O0ii1o(this) : null;
/* 38 */            this.I011lIilI0lo = (((O1ooOo) o0iOoioOoI).I00iOIl.I00iiO & Barcode.FORMAT_UPC_A) != 0 ? new I1IOl1(this, (Oiol1OoI) o0iOoioOoI) : null;
                }

                @Override
                public final int I0000Il00O(int i) {
/* 1 */             I1IOl1 i1IOl1 = this.I011lIilI0lo;
/* 3 */             if (i1IOl1 == null) {
/* 67 */                return this.I011iIOio.I00Ol10(this, this.I00olI, i);
                    }
/* 5 */             Oiol1OoI oiol1OoI = i1IOl1.I00iiI;
/* 7 */             OIIlIII0Ili oIIlIII0Ili = this.I00olI;
/* 21 */            if (!oiol1OoI.I00iOIl.I00ioIO.I01101IOlO().I00oOio10iI1()) {
/* 58 */                return oIIlIII0Ili.I0000Il00O(i);
                    }
/* 53 */            return oiol1OoI.I010l1O(new I1IOi11ooIi(i1IOl1, i1IOl1.getLayoutDirection()), new Ii1olOII0O(oIIlIII0Ili, OIIlio0il1o0.I00iiI, OIIlllOliI.I00iiI, 2), IOo0olo.I00000oOI(0, i, 0, 0, 13)).I0000O();
                }

                @Override
                public final int I000l1(int i) {
/* 1 */             I1IOl1 i1IOl1 = this.I011lIilI0lo;
/* 3 */             if (i1IOl1 == null) {
/* 66 */                return this.I011iIOio.I00li1OI(this, this.I00olI, i);
                    }
/* 5 */             Oiol1OoI oiol1OoI = i1IOl1.I00iiI;
/* 7 */             OIIlIII0Ili oIIlIII0Ili = this.I00olI;
/* 21 */            if (!oiol1OoI.I00iOIl.I00ioIO.I01101IOlO().I00oOio10iI1()) {
/* 57 */                return oIIlIII0Ili.I000l1(i);
                    }
/* 52 */            return oiol1OoI.I010l1O(new I1IOi11ooIi(i1IOl1, i1IOl1.getLayoutDirection()), new Ii1olOII0O(oIIlIII0Ili, OIIlio0il1o0.I00iOIl, OIIlllOliI.I00iOIl, 2), IOo0olo.I00000oOI(0, 0, 0, i, 7)).I0001Ioi1lo();
                }

                @Override
                public final int I001iOo1i0O(int i) {
/* 1 */             I1IOl1 i1IOl1 = this.I011lIilI0lo;
/* 3 */             if (i1IOl1 == null) {
/* 66 */                return this.I011iIOio.I0001Ioi1lo(this, this.I00olI, i);
                    }
/* 5 */             Oiol1OoI oiol1OoI = i1IOl1.I00iiI;
/* 7 */             OIIlIII0Ili oIIlIII0Ili = this.I00olI;
/* 21 */            if (!oiol1OoI.I00iOIl.I00ioIO.I01101IOlO().I00oOio10iI1()) {
/* 57 */                return oIIlIII0Ili.I001iOo1i0O(i);
                    }
/* 52 */            return oiol1OoI.I010l1O(new I1IOi11ooIi(i1IOl1, i1IOl1.getLayoutDirection()), new Ii1olOII0O(oIIlIII0Ili, OIIlio0il1o0.I00iiI, OIIlllOliI.I00iOIl, 2), IOo0olo.I00000oOI(0, 0, 0, i, 7)).I0001Ioi1lo();
                }

                @Override
                public final OO1I0001000i I001lllioOl(long j) {
                    O1iOIo0o0 o1iOIo0o0I0000Il00O;
                    IOo0oO11ll1O iOo0oO11ll1O;
/* 4 */             if (this.I00ol1) {
/* 6 */                 IOo0oO11ll1O iOo0oO11ll1O2 = this.I011iO;
/* 8 */                 if (iOo0oO11ll1O2 == null) {
/* 15 */                    I000II.I000iOII("Lookahead constraints cannot be null in approach pass.");
/* 3 */                     return null;
                        }
/* 10 */                j = iOo0oO11ll1O2.I00000oIO;
                    }
/* 19 */            I00ilO0(j);
/* 22 */            I1IOl1 i1IOl1 = this.I011lIilI0lo;
/* 24 */            if (i1IOl1 != null) {
/* 26 */                Oiol1OoI oiol1OoI = i1IOl1.I00iiI;
/* 32 */                O1iOIo0o0 o1iOIo0o0I00ooIo0 = i1IOl1.I00iOIl.I011iiii0i.I00ooIo0();
/* 36 */                o1iOIo0o0I00ooIo0.I0001Ioi1lo();
/* 39 */                o1iOIo0o0I00ooIo0.I0000O();
/* 92 */                boolean z = (oiol1OoI.I00oII.I000iOII() && oiol1OoI.I00oII.I0001Ioi1lo().I00000oIO() && oiol1OoI.I00oII.I0001Ioi1lo().I00000oOI.I00000oIO()) || (iOo0oO11ll1O = this.I011iO) == null || j != iOo0oO11ll1O.I00000oIO;
/* 93 */                i1IOl1.I00iiO = z;
/* 95 */                if (!z) {
/* 99 */                    this.I00olI.I00ol1 = true;
                        }
/* 103 */               o1iOIo0o0I0000Il00O = oiol1OoI.I010l1O(i1IOl1, this.I00olI, j);
/* 109 */               this.I00olI.I00ol1 = false;
/* 119 */               boolean z2 = o1iOIo0o0I0000Il00O.I0001Ioi1lo() == this.I011iiii0i.I00iOIl && o1iOIo0o0I0000Il00O.I0000O() == this.I011iiii0i.I00iiI;
/* 135 */               if (!i1IOl1.I00iiO) {
/* 137 */                   OIIlIII0Ili oIIlIII0Ili = this.I00olI;
/* 139 */                   long j2 = oIIlIII0Ili.I00iiO;
/* 141 */                   O1IiiOil0o0l o1IiiOil0o0lI01101IOlO = oIIlIII0Ili.I01101IOlO();
/* 159 */                   if (IooOl0ol01.I00000oOI(j2, o1IiiOil0o0lI01101IOlO != null ? IooOl0ol01.I00000oIO(o1IiiOil0o0lI01101IOlO.I010OIo1l()) : null) && !z2) {
/* 165 */                       O0iiI1O o0iiI1O = new O0iiI1O();
/* 168 */                       o0iiI1O.I00000oIO = o1iOIo0o0I0000Il00O;
/* 170 */                       O0ii1o o0ii1o = this.I011iiii0i;
/* 174 */                       o0iiI1O.I00000oOI = o0ii1o.I00iOIl;
/* 178 */                       o0iiI1O.I0000Il00O = o0ii1o.I00iiI;
/* 180 */                       VarHandle.storeStoreFence();
/* 183 */                       o1iOIo0o0I0000Il00O = o0iiI1O;
                            }
                        }
                    } else {
/* 189 */               o1iOIo0o0I0000Il00O = this.I011iIOio.I0000Il00O(this, this.I00olI, j);
                    }
/* 193 */           I01IO0oio(o1iOIo0o0I0000Il00O);
/* 196 */           I011iiii0i();
/* 437 */           return this;
                }

                @Override
                public final int I00OI1(int i) {
/* 1 */             I1IOl1 i1IOl1 = this.I011lIilI0lo;
/* 3 */             if (i1IOl1 == null) {
/* 67 */                return this.I011iIOio.I00iOIl(this, this.I00olI, i);
                    }
/* 5 */             Oiol1OoI oiol1OoI = i1IOl1.I00iiI;
/* 7 */             OIIlIII0Ili oIIlIII0Ili = this.I00olI;
/* 21 */            if (!oiol1OoI.I00iOIl.I00ioIO.I01101IOlO().I00oOio10iI1()) {
/* 58 */                return oIIlIII0Ili.I00OI1(i);
                    }
/* 53 */            return oiol1OoI.I010l1O(new I1IOi11ooIi(i1IOl1, i1IOl1.getLayoutDirection()), new Ii1olOII0O(oIIlIII0Ili, OIIlio0il1o0.I00iOIl, OIIlllOliI.I00iiI, 2), IOo0olo.I00000oOI(0, i, 0, 0, 13)).I0000O();
                }

                @Override
                public final void I00iIO(long j, float f, Io10IOI io10IOI) {
                    O0iiIiio01I0 o0iiIiio01I0;
/* 3 */             if (this.I00oOio10iI1) {
/* 12 */                o0iiIiio01I0 = this;
/* 15 */                o0iiIiio01I0.I01I0Iioooo0(I01101IOlO().I00oOio10iI1, f, null, io10IOI);
                    } else {
/* 19 */                o0iiIiio01I0 = this;
/* 27 */                o0iiIiio01I0.I01I0Iioooo0(j, f, null, io10IOI);
                    }
/* 30 */            o0iiIiio01I0.I01Io001O();
                }

                @Override
                public final void I00iIi0i1o(long j, float f, Function1 function1) {
/* 3 */             if (this.I00oOio10iI1) {
/* 15 */                I01I0Iioooo0(I01101IOlO().I00oOio10iI1, f, function1, null);
                    } else {
/* 24 */                I01I0Iioooo0(j, f, function1, null);
                    }
/* 27 */            I01Io001O();
                }

                @Override
                public final int I00l0I0l0lO1(I0iolili01 i0iolili01) {
/* 1 */             O0ii1o o0ii1o = this.I011iiii0i;
/* 3 */             if (o0ii1o == null) {
/* 21 */                return l0o0i0iOo.I00000oIO(this, i0iolili01);
                    }
/* 5 */             OI0o11I1 oI0o11I1 = o0ii1o.I00oliIiO01i;
/* 7 */             int iI0000O = oI0o11I1.I0000O(i0iolili01);
/* 11 */            if (iI0000O >= 0) {
/* 15 */                return oI0o11I1.I0000Il00O[iI0000O];
                    }
/* 18 */            return Integer.MIN_VALUE;
                }

                @Override
                public final void I010l1ol111() {
/* 3 */             if (this.I011iiii0i == null) {
/* 10 */                this.I011iiii0i = new O0ii1o(this);
                    }
                }

                @Override
                public final O1IiiOil0o0l I01101IOlO() {
/* 1 */             return this.I011iiii0i;
                }

                @Override
                public final O1ooOo I0110OiO() {
/* 5 */             return ((O1ooOo) this.I011iIOio).I00iOIl;
                }

                @Override
                public final void I01I01Oolii(IIolOo iIolOo, Io10IOI io10IOI) {
                    OIIlIII0Ili oIIlIII0Ili;
/* 3 */             this.I00olI.I010l10O(iIolOo, io10IOI);
/* 18 */            if (!((I0lio1O01i01) O0iillo1ol0.I00000oIO(this.I00oO101o)).getShowLayoutBounds() || (oIIlIII0Ili = this.I00olI) == null) {
/* 106 */               return;
                    }
/* 32 */            if (IooOl0ol01.I0000Il00O(this.I00iiO, oIIlIII0Ili.I00iiO) && IooO0O.I0000Il00O(oIIlIII0Ili.I010I0, 0L)) {
/* 106 */               return;
                    }
/* 44 */            long j = this.I00iiO;
/* 73 */            iIolOo.I000OiO(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, I011lO1liO1O);
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I01Io001O() {
/* 3 */             if (this.I00lll10) {
/* 5 */                 return;
                    }
/* 6 */             I011lIilI0lo();
/* 9 */             OIIlIII0Ili oIIlIII0Ili = this.I00olI;
/* 11 */            I1IOl1 i1IOl1 = this.I011lIilI0lo;
/* 14 */            if (i1IOl1 != null) {
/* 18 */                if (!i1IOl1.I00iiO) {
/* 20 */                    long j = this.I00iiO;
/* 22 */                    O0ii1o o0ii1o = this.I011iiii0i;
/* 41 */                    if (IooOl0ol01.I00000oOI(j, o0ii1o != null ? IooOl0ol01.I00000oIO(o0ii1o.I010OIo1l()) : null)) {
/* 43 */                        long j2 = oIIlIII0Ili.I00iiO;
/* 45 */                        O1IiiOil0o0l o1IiiOil0o0lI01101IOlO = oIIlIII0Ili.I01101IOlO();
/* 67 */                        boolean z = IooOl0ol01.I00000oOI(j2, o1IiiOil0o0lI01101IOlO != null ? IooOl0ol01.I00000oIO(o1IiiOil0o0lI01101IOlO.I010OIo1l()) : null);
/* 68 */                        oIIlIII0Ili.I00oOio10iI1 = z;
                            }
                        }
                    }
/* 70 */            boolean z2 = oIIlIII0Ili.I00o0iI0io1;
/* 74 */            oIIlIII0Ili.I00o0iI0io1 = this.I00o0iI0io1;
/* 80 */            I00ooIo0().I00000oIO();
/* 83 */            oIIlIII0Ili.I00o0iI0io1 = z2;
/* 85 */            oIIlIII0Ili.I00oOio10iI1 = false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void I01Io1(O0iOoioOoI o0iOoioOoI) {
/* 7 */             if (!o0iOoioOoI.equals(this.I011iIOio)) {
/* 18 */                if ((((O1ooOo) o0iOoioOoI).I00iOIl.I00iiO & Barcode.FORMAT_UPC_A) != 0) {
/* 21 */                    Oiol1OoI oiol1OoI = (Oiol1OoI) o0iOoioOoI;
/* 23 */                    I1IOl1 i1IOl1 = this.I011lIilI0lo;
/* 25 */                    if (i1IOl1 != null) {
/* 27 */                        i1IOl1.I00iiI = oiol1OoI;
                            } else {
/* 32 */                        i1IOl1 = new I1IOl1(this, oiol1OoI);
                            }
/* 35 */                    this.I011lIilI0lo = i1IOl1;
                        } else {
/* 39 */                    this.I011lIilI0lo = null;
                        }
                    }
/* 41 */            this.I011iIOio = o0iOoioOoI;
                }
            }
