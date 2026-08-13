            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class lO1Iil00OO1o {
                public static final OiiOlI0I I00000oIO(Oiil1o0OIi oiil1o0OIi, II1Oo1IiO iI1Oo1IiO) {
/* 13 */            boolean z = oiil1o0OIi.I000OOo1O() == Ii0OiIIl00OO.I00iOIl;
/* 40 */            return new OiiOlI0I(I00000oOI(oiil1o0OIi.I000OiO(), z, true, oiil1o0OIi.I000iOII(), iI1Oo1IiO), I00000oOI(oiil1o0OIi.I000O01llI0(), z, false, oiil1o0OIi.I000II(), iI1Oo1IiO), z);
                }

                public static final OiiOOli I00000oOI(OiiO01I11iI oiiO01I11iI, boolean z, boolean z2, int i, II1Oo1IiO iI1Oo1IiO) {
                    long j;
/* 6 */             int i2 = z2 ? oiiO01I11iI.I0000Il00O : oiiO01I11iI.I0000O;
/* 10 */            if (i != oiiO01I11iI.I00000oOI) {
/* 12 */                return oiiO01I11iI.I00000oIO(i2);
                    }
/* 17 */            long jI0001Ioi1lo = iI1Oo1IiO.I0001Ioi1lo(oiiO01I11iI, i2);
/* 22 */            if (z ^ z2) {
/* 24 */                int i3 = Oo0lI00l.I0000Il00O;
/* 28 */                j = jI0001Ioi1lo >> 32;
                    } else {
/* 32 */                int i4 = Oo0lI00l.I0000Il00O;
/* 39 */                j = 4294967295L & jI0001Ioi1lo;
                    }
/* 41 */            return oiiO01I11iI.I00000oIO((int) j);
                }

                public static final OiiOOli I0000Il00O(OiiOOli oiiOOli, OiiO01I11iI oiiO01I11iI, int i) {
/* 11 */            return new OiiOOli(oiiO01I11iI.I0001Ioi1lo.I00000oIO(i), i, oiiOOli.I0000Il00O);
                }

                public static final OiiOOli I0000O(Oiil1o0OIi oiil1o0OIi, OiiO01I11iI oiiO01I11iI, OiiOOli oiiOOli) {
/* 10 */            int i = oiil1o0OIi.I00000oIO() ? oiiO01I11iI.I0000Il00O : oiiO01I11iI.I0000O;
/* 23 */            int iI000iOII = oiil1o0OIi.I00000oIO() ? oiil1o0OIi.I000iOII() : oiil1o0OIi.I000II();
/* 27 */            int i2 = oiiO01I11iI.I00000oOI;
/* 29 */            Oo0iil0o0oI oo0iil0o0oI = oiiO01I11iI.I0001Ioi1lo;
/* 31 */            int i3 = oiiO01I11iI.I0000oI00;
/* 33 */            if (iI000iOII != i2) {
/* 35 */                return oiiO01I11iI.I00000oIO(i);
                    }
/* 40 */            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iiI;
/* 45 */            O1lIIliooi o1lIIliooi = new O1lIIliooi(2);
/* 48 */            o1lIIliooi.I00iiO = oiiO01I11iI;
/* 50 */            o1lIIliooi.I00iiI = i;
/* 52 */            VarHandle.storeStoreFence();
/* 55 */            O0ioIllo0i1 o0ioIllo0i1I00000oIO = l0oi0lOi11i.I00000oIO(o0oI01I0oo, o1lIIliooi);
/* 68 */            int i4 = oiil1o0OIi.I00000oIO() ? oiiO01I11iI.I0000O : oiiO01I11iI.I0000Il00O;
/* 72 */            OiiOol10Ioo oiiOol10Ioo = new OiiOol10Ioo();
/* 75 */            oiiOol10Ioo.I00iOIl = oiiO01I11iI;
/* 77 */            oiiOol10Ioo.I00iiI = i;
/* 79 */            oiiOol10Ioo.I00iiO = i4;
/* 81 */            oiiOol10Ioo.I00iio = oiil1o0OIi;
/* 83 */            oiiOol10Ioo.I00ilI0I1 = o0ioIllo0i1I00000oIO;
/* 85 */            VarHandle.storeStoreFence();
/* 88 */            O0ioIllo0i1 o0ioIllo0i1I00000oIO2 = l0oi0lOi11i.I00000oIO(o0oI01I0oo, oiiOol10Ioo);
/* 98 */            if (oiiO01I11iI.I00000oIO != oiiOOli.I0000Il00O) {
/* 104 */               return (OiiOOli) o0ioIllo0i1I00000oIO2.getValue();
                    }
/* 107 */           if (i == i3) {
/* 109 */               return oiiOOli;
                    }
/* 126 */           if (((Number) o0ioIllo0i1I00000oIO.getValue()).intValue() != oo0iil0o0oI.I00000oOI.I0000O(i3)) {
/* 132 */               return (OiiOOli) o0ioIllo0i1I00000oIO2.getValue();
                    }
/* 135 */           int i5 = oiiOOli.I00000oOI;
/* 137 */           long jI000iOII = oo0iil0o0oI.I000iOII(i5);
/* 141 */           boolean zI00000oIO = oiil1o0OIi.I00000oIO();
/* 146 */           if (i3 != -1) {
/* 149 */               if (i != i3) {
/* 164 */                   if (!(zI00000oIO ^ (oiiO01I11iI.I00000oOI() == Ii0OiIIl00OO.I00iOIl))) {
                            }
                        }
/* 202 */               return oiiO01I11iI.I00000oIO(i);
                    }
/* 171 */           int i6 = Oo0lI00l.I0000Il00O;
                    return (i5 == ((int) (jI000iOII >> 32)) || i5 == ((int) (jI000iOII & 4294967295L))) ? (OiiOOli) o0ioIllo0i1I00000oIO2.getValue() : oiiO01I11iI.I00000oIO(i);
                }
            }
