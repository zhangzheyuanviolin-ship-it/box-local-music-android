            package p000;
            
/* 71 */    public final class OIoioI0OIiI implements I1110oO {
                public final int I00000oIO;
                public final int I00000oOI;
                public final long I0000Il00O;
                public final Oo0OOliO01o I0000O;
                public final OO1Il0I1 I0000oI00;
                public final O0oo0I00 I0001Ioi1lo;
                public final int I000II;
                public final int I000O01llI0;
                public final Oo0l0I I000OOo1O;

                public OIoioI0OIiI(int i, int i2, long j, Oo0OOliO01o oo0OOliO01o, OO1Il0I1 oO1Il0I1, O0oo0I00 o0oo0I00, int i3, int i4, Oo0l0I oo0l0I) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
/* 8 */             this.I0000Il00O = j;
/* 10 */            this.I0000O = oo0OOliO01o;
/* 12 */            this.I0000oI00 = oO1Il0I1;
/* 14 */            this.I0001Ioi1lo = o0oo0I00;
/* 16 */            this.I000II = i3;
/* 18 */            this.I000O01llI0 = i4;
/* 20 */            this.I000OOo1O = oo0l0I;
/* 22 */            Oo0o1iioOiO[] oo0o1iioOiOArr = Oo0o1OiIo.I00000oOI;
/* 30 */            if (Oo0o1OiIo.I00000oOI(j, Oo0o1OiIo.I0000Il00O)) {
/* 1821 */              return;
                    }
/* 44 */            if (Oo0o1OiIo.I0000O(j) >= 0.0f) {
/* 1821 */              return;
                    }
/* 69 */            Ioliol.I0000Il00O("lineHeight can't be negative (" + Oo0o1OiIo.I0000O(j) + ")");
                }

                public final OIoioI0OIiI I00000oIO(OIoioI0OIiI oIoioI0OIiI) {
                    return oIoioI0OIiI == null ? this : OIoioOil.I00000oIO(this, oIoioI0OIiI.I00000oIO, oIoioI0OIiI.I00000oOI, oIoioI0OIiI.I0000Il00O, oIoioI0OIiI.I0000O, oIoioI0OIiI.I0000oI00, oIoioI0OIiI.I0001Ioi1lo, oIoioI0OIiI.I000II, oIoioI0OIiI.I000O01llI0, oIoioI0OIiI.I000OOo1O);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 90 */                return true;
                    }
/* 6 */             if (!(obj instanceof OIoioI0OIiI)) {
/* 92 */                return false;
                    }
/* 9 */             OIoioI0OIiI oIoioI0OIiI = (OIoioI0OIiI) obj;
                    return this.I00000oIO == oIoioI0OIiI.I00000oIO && this.I00000oOI == oIoioI0OIiI.I00000oOI && Oo0o1OiIo.I00000oOI(this.I0000Il00O, oIoioI0OIiI.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oIoioI0OIiI.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, oIoioI0OIiI.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, oIoioI0OIiI.I0001Ioi1lo) && this.I000II == oIoioI0OIiI.I000II && this.I000O01llI0 == oIoioI0OIiI.I000O01llI0 && O0000Ioio00.I0000O(this.I000OOo1O, oIoioI0OIiI.I000OOo1O);
                }

                public final int hashCode() {
/* 12 */            int iI0000O = IIl001iO0Io.I0000O(this.I00000oOI, Integer.hashCode(this.I00000oIO) * 31, 31);
/* 16 */            Oo0o1iioOiO[] oo0o1iioOiOArr = Oo0o1OiIo.I00000oOI;
/* 20 */            int iI0000O2 = IIlIOloOOO.I0000O(this.I0000Il00O, iI0000O, 31);
/* 25 */            Oo0OOliO01o oo0OOliO01o = this.I0000O;
/* 36 */            int iHashCode = (iI0000O2 + (oo0OOliO01o != null ? oo0OOliO01o.hashCode() : 0)) * 31;
/* 37 */            OO1Il0I1 oO1Il0I1 = this.I0000oI00;
/* 48 */            int iHashCode2 = (iHashCode + (oO1Il0I1 != null ? oO1Il0I1.hashCode() : 0)) * 31;
/* 49 */            O0oo0I00 o0oo0I00 = this.I0001Ioi1lo;
/* 69 */            int iI0000O3 = IIl001iO0Io.I0000O(this.I000O01llI0, IIl001iO0Io.I0000O(this.I000II, (iHashCode2 + (o0oo0I00 != null ? o0oo0I00.hashCode() : 0)) * 31, 31), 31);
/* 73 */            Oo0l0I oo0l0I = this.I000OOo1O;
/* 81 */            return iI0000O3 + (oo0l0I != null ? oo0l0I.hashCode() : 0);
                }

                public final String toString() {
/* 3 */             String strI00000oOI = OloOOIoO1ii1.I00000oOI(this.I00000oIO);
/* 9 */             String strI00000oIO = OlooIlII1.I00000oIO(this.I00000oOI);
/* 15 */            String strI0001Ioi1lo = Oo0o1OiIo.I0001Ioi1lo(this.I0000Il00O);
/* 21 */            String strI00000oIO2 = O0olI0Oiili.I00000oIO(this.I000II);
/* 27 */            String strI00000oIO3 = IoOiIO.I00000oIO(this.I000O01llI0);
/* 37 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("ParagraphStyle(textAlign=", strI00000oOI, ", textDirection=", strI00000oIO, ", lineHeight=");
/* 41 */            sbI00111O.append(strI0001Ioi1lo);
/* 46 */            sbI00111O.append(", textIndent=");
/* 51 */            sbI00111O.append(this.I0000O);
/* 56 */            sbI00111O.append(", platformStyle=");
/* 61 */            sbI00111O.append(this.I0000oI00);
/* 66 */            sbI00111O.append(", lineHeightStyle=");
/* 71 */            sbI00111O.append(this.I0001Ioi1lo);
/* 76 */            sbI00111O.append(", lineBreak=");
/* 83 */            IIl001iO0Io.I001lIiIIo1O(sbI00111O, strI00000oIO2, ", hyphens=", strI00000oIO3, ", textMotion=");
/* 88 */            sbI00111O.append(this.I000OOo1O);
/* 93 */            sbI00111O.append(")");
/* 96 */            return sbI00111O.toString();
                }

/* 72 */        public OIoioI0OIiI(int i, Oo0OOliO01o oo0OOliO01o, int i2) {
/* 74 */            this((i2 & 1) != 0 ? 0 : i, 0, Oo0o1OiIo.I0000Il00O, (i2 & 8) != 0 ? null : oo0OOliO01o, null, null, 0, 0, null);
                }
            }
