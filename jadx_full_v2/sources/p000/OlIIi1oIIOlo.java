            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
/* 134 */   public final class OlIIi1oIIOlo implements I1110oO {
                public final Oo0OO1I1i I00000oIO;
                public final long I00000oOI;
                public final IlilIIiIiO I0000Il00O;
                public final Ilil10i I0000O;
                public final Ilil10oOo I0000oI00;
                public final IliO1o11o I0001Ioi1lo;
                public final String I000II;
                public final long I000O01llI0;
                public final I1oi0illolii I000OOo1O;
                public final Oo0OOlO0 I000OiO;
                public final O11oiiOIl0O I000iOII;
                public final long I000l1;
                public final OlooIOI0O I000lI;
                public final OioOII0oI I000o00OoI0I;
                public final OO1O1OI I000oI1ioi;
                public final Iilloo0IOoIo I00100l0;

                public OlIIi1oIIOlo(long j, long j2, IlilIIiIiO ililIIiIiO, Ilil10i ilil10i, Ilil10oOo ilil10oOo, IliO1o11o iliO1o11o, String str, long j3, I1oi0illolii i1oi0illolii, Oo0OOlO0 oo0OOlO0, O11oiiOIl0O o11oiiOIl0O, long j4, OlooIOI0O olooIOI0O, OioOII0oI oioOII0oI, int i) {
/* 132 */           this((i & 1) != 0 ? IOOiio0i.I000o00OoI0I : j, (i & 2) != 0 ? Oo0o1OiIo.I0000Il00O : j2, (i & 4) != 0 ? null : ililIIiIiO, (i & 8) != 0 ? null : ilil10i, (i & 16) != 0 ? null : ilil10oOo, (i & 32) != 0 ? null : iliO1o11o, (i & 64) != 0 ? null : str, (i & Barcode.FORMAT_ITF) != 0 ? Oo0o1OiIo.I0000Il00O : j3, (i & Barcode.FORMAT_QR_CODE) != 0 ? null : i1oi0illolii, (i & Barcode.FORMAT_UPC_A) != 0 ? null : oo0OOlO0, (i & Barcode.FORMAT_UPC_E) != 0 ? null : o11oiiOIl0O, (i & Barcode.FORMAT_PDF417) != 0 ? IOOiio0i.I000o00OoI0I : j4, (i & Barcode.FORMAT_AZTEC) != 0 ? null : olooIOI0O, (i & 8192) != 0 ? null : oioOII0oI, (OO1O1OI) null, (Iilloo0IOoIo) null);
                }

                public static OlIIi1oIIOlo I00000oIO(OlIIi1oIIOlo olIIi1oIIOlo, long j, int i) {
/* 14 */            long jI00000oIO = (i & 1) != 0 ? olIIi1oIIOlo.I00000oIO.I00000oIO() : j;
/* 16 */            long j2 = olIIi1oIIOlo.I00000oOI;
/* 18 */            IlilIIiIiO ililIIiIiO = olIIi1oIIOlo.I0000Il00O;
/* 20 */            Ilil10i ilil10i = olIIi1oIIOlo.I0000O;
/* 22 */            Ilil10oOo ilil10oOo = olIIi1oIIOlo.I0000oI00;
/* 32 */            IliO1o11o iliO1o11o = (i & 32) != 0 ? olIIi1oIIOlo.I0001Ioi1lo : null;
/* 34 */            String str = olIIi1oIIOlo.I000II;
/* 36 */            long j3 = olIIi1oIIOlo.I000O01llI0;
/* 38 */            I1oi0illolii i1oi0illolii = olIIi1oIIOlo.I000OOo1O;
/* 40 */            Oo0OOlO0 oo0OOlO0 = olIIi1oIIOlo.I000OiO;
/* 42 */            O11oiiOIl0O o11oiiOIl0O = olIIi1oIIOlo.I000iOII;
/* 46 */            long j4 = olIIi1oIIOlo.I000l1;
/* 50 */            OlooIOI0O olooIOI0O = olIIi1oIIOlo.I000lI;
/* 52 */            OioOII0oI oioOII0oI = olIIi1oIIOlo.I000o00OoI0I;
/* 56 */            OO1O1OI oo1o1oi = olIIi1oIIOlo.I000oI1ioi;
/* 60 */            Iilloo0IOoIo iilloo0IOoIo = olIIi1oIIOlo.I00100l0;
/* 66 */            Oo0OO1I1i oo0OO1I1i = olIIi1oIIOlo.I00000oIO;
/* 72 */            long jI00000oIO2 = oo0OO1I1i.I00000oIO();
/* 76 */            int i2 = IOOiio0i.I000oI1ioi;
/* 82 */            if (!Ooi0i1.I00000oOI(jI00000oIO, jI00000oIO2)) {
/* 92 */                if (jI00000oIO != 16) {
/* 96 */                    IOOli10 iOOli10 = new IOOli10();
/* 99 */                    iOOli10.I00000oIO = jI00000oIO;
/* 101 */                   if (jI00000oIO == 16) {
/* 110 */                       Ioliol.I00000oIO("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
                            }
/* 103 */                   VarHandle.storeStoreFence();
/* 106 */                   oo0OO1I1i = iOOli10;
                        } else {
/* 114 */                   oo0OO1I1i = Oo0OIIl1i1.I00000oIO;
                        }
                    }
/* 117 */           return new OlIIi1oIIOlo(oo0OO1I1i, j2, ililIIiIiO, ilil10i, ilil10oOo, iliO1o11o, str, j3, i1oi0illolii, oo0OOlO0, o11oiiOIl0O, j4, olooIOI0O, oioOII0oI, oo1o1oi, iilloo0IOoIo);
                }

                public final boolean I00000oOI(OlIIi1oIIOlo olIIi1oIIOlo) {
/* 1 */             if (this == olIIi1oIIOlo) {
/* 143 */               return true;
                    }
/* 13 */            if (!Oo0o1OiIo.I00000oOI(this.I00000oOI, olIIi1oIIOlo.I00000oOI) || !O0000Ioio00.I0000O(this.I0000Il00O, olIIi1oIIOlo.I0000Il00O) || !O0000Ioio00.I0000O(this.I0000O, olIIi1oIIOlo.I0000O) || !O0000Ioio00.I0000O(this.I0000oI00, olIIi1oIIOlo.I0000oI00) || !O0000Ioio00.I0000O(this.I0001Ioi1lo, olIIi1oIIOlo.I0001Ioi1lo) || !O0000Ioio00.I0000O(this.I000II, olIIi1oIIOlo.I000II) || !Oo0o1OiIo.I00000oOI(this.I000O01llI0, olIIi1oIIOlo.I000O01llI0) || !O0000Ioio00.I0000O(this.I000OOo1O, olIIi1oIIOlo.I000OOo1O) || !O0000Ioio00.I0000O(this.I000OiO, olIIi1oIIOlo.I000OiO) || !O0000Ioio00.I0000O(this.I000iOII, olIIi1oIIOlo.I000iOII)) {
/* 141 */               return false;
                    }
/* 118 */           long j = olIIi1oIIOlo.I000l1;
/* 120 */           int i = IOOiio0i.I000oI1ioi;
                    return Ooi0i1.I00000oOI(this.I000l1, j) && O0000Ioio00.I0000O(this.I000oI1ioi, olIIi1oIIOlo.I000oI1ioi);
                }

                public final boolean I0000Il00O(OlIIi1oIIOlo olIIi1oIIOlo) {
                    return O0000Ioio00.I0000O(this.I00000oIO, olIIi1oIIOlo.I00000oIO) && O0000Ioio00.I0000O(this.I000lI, olIIi1oIIOlo.I000lI) && O0000Ioio00.I0000O(this.I000o00OoI0I, olIIi1oIIOlo.I000o00OoI0I) && O0000Ioio00.I0000O(this.I00100l0, olIIi1oIIOlo.I00100l0);
                }

                public final OlIIi1oIIOlo I0000O(OlIIi1oIIOlo olIIi1oIIOlo) {
/* 3 */             if (olIIi1oIIOlo == null) {
/* 5 */                 return this;
                    }
/* 6 */             Oo0OO1I1i oo0OO1I1i = olIIi1oIIOlo.I00000oIO;
/* 68 */            return OlIIii.I00000oIO(this, oo0OO1I1i.I00000oIO(), oo0OO1I1i.I00000oOI(), oo0OO1I1i.I0000Il00O(), olIIi1oIIOlo.I00000oOI, olIIi1oIIOlo.I0000Il00O, olIIi1oIIOlo.I0000O, olIIi1oIIOlo.I0000oI00, olIIi1oIIOlo.I0001Ioi1lo, olIIi1oIIOlo.I000II, olIIi1oIIOlo.I000O01llI0, olIIi1oIIOlo.I000OOo1O, olIIi1oIIOlo.I000OiO, olIIi1oIIOlo.I000iOII, olIIi1oIIOlo.I000l1, olIIi1oIIOlo.I000lI, olIIi1oIIOlo.I000o00OoI0I, olIIi1oIIOlo.I000oI1ioi, olIIi1oIIOlo.I00100l0);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OlIIi1oIIOlo)) {
/* 7 */                 return false;
                    }
/* 11 */            OlIIi1oIIOlo olIIi1oIIOlo = (OlIIi1oIIOlo) obj;
                    return I00000oOI(olIIi1oIIOlo) && I0000Il00O(olIIi1oIIOlo);
                }

                public final int hashCode() {
/* 1 */             Oo0OO1I1i oo0OO1I1i = this.I00000oIO;
/* 3 */             long jI00000oIO = oo0OO1I1i.I00000oIO();
/* 7 */             int i = IOOiio0i.I000oI1ioi;
/* 15 */            int iHashCode = Long.hashCode(jI00000oIO) * 31;
/* 16 */            III11l1I iII11l1II00000oOI = oo0OO1I1i.I00000oOI();
/* 40 */            int iHashCode2 = (Float.hashCode(oo0OO1I1i.I0000Il00O()) + ((iHashCode + (iII11l1II00000oOI != null ? iII11l1II00000oOI.hashCode() : 0)) * 31)) * 31;
/* 41 */            Oo0o1iioOiO[] oo0o1iioOiOArr = Oo0o1OiIo.I00000oOI;
/* 45 */            int iI0000O = IIlIOloOOO.I0000O(this.I00000oOI, iHashCode2, 31);
/* 49 */            IlilIIiIiO ililIIiIiO = this.I0000Il00O;
/* 58 */            int i2 = (iI0000O + (ililIIiIiO != null ? ililIIiIiO.I00iOIl : 0)) * 31;
/* 59 */            Ilil10i ilil10i = this.I0000O;
/* 72 */            int iHashCode3 = (i2 + (ilil10i != null ? Integer.hashCode(ilil10i.I00000oIO) : 0)) * 31;
/* 73 */            Ilil10oOo ilil10oOo = this.I0000oI00;
/* 86 */            int iHashCode4 = (iHashCode3 + (ilil10oOo != null ? Integer.hashCode(ilil10oOo.I00000oIO) : 0)) * 31;
/* 87 */            IliO1o11o iliO1o11o = this.I0001Ioi1lo;
/* 98 */            int iHashCode5 = (iHashCode4 + (iliO1o11o != null ? iliO1o11o.hashCode() : 0)) * 31;
/* 99 */            String str = this.I000II;
/* 113 */           int iI0000O2 = IIlIOloOOO.I0000O(this.I000O01llI0, (iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
/* 117 */           I1oi0illolii i1oi0illolii = this.I000OOo1O;
/* 130 */           int iHashCode6 = (iI0000O2 + (i1oi0illolii != null ? Float.hashCode(i1oi0illolii.I00000oIO) : 0)) * 31;
/* 131 */           Oo0OOlO0 oo0OOlO0 = this.I000OiO;
/* 142 */           int iHashCode7 = (iHashCode6 + (oo0OOlO0 != null ? oo0OOlO0.hashCode() : 0)) * 31;
/* 143 */           O11oiiOIl0O o11oiiOIl0O = this.I000iOII;
/* 159 */           int iI0000O3 = IIlIOloOOO.I0000O(this.I000l1, (iHashCode7 + (o11oiiOIl0O != null ? o11oiiOIl0O.I00iOIl.hashCode() : 0)) * 31, 31);
/* 163 */           OlooIOI0O olooIOI0O = this.I000lI;
/* 172 */           int i3 = (iI0000O3 + (olooIOI0O != null ? olooIOI0O.I00000oIO : 0)) * 31;
/* 173 */           OioOII0oI oioOII0oI = this.I000o00OoI0I;
/* 184 */           int iHashCode8 = (i3 + (oioOII0oI != null ? oioOII0oI.hashCode() : 0)) * 31;
/* 185 */           OO1O1OI oo1o1oi = this.I000oI1ioi;
/* 196 */           int iHashCode9 = (iHashCode8 + (oo1o1oi != null ? oo1o1oi.hashCode() : 0)) * 31;
/* 197 */           Iilloo0IOoIo iilloo0IOoIo = this.I00100l0;
/* 205 */           return iHashCode9 + (iilloo0IOoIo != null ? iilloo0IOoIo.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             Oo0OO1I1i oo0OO1I1i = this.I00000oIO;
/* 7 */             String strI000OOo1O = IOOiio0i.I000OOo1O(oo0OO1I1i.I00000oIO());
/* 11 */            III11l1I iII11l1II00000oOI = oo0OO1I1i.I00000oOI();
/* 15 */            float fI0000Il00O = oo0OO1I1i.I0000Il00O();
/* 21 */            String strI0001Ioi1lo = Oo0o1OiIo.I0001Ioi1lo(this.I00000oOI);
/* 27 */            String strI0001Ioi1lo2 = Oo0o1OiIo.I0001Ioi1lo(this.I000O01llI0);
/* 33 */            String strI000OOo1O2 = IOOiio0i.I000OOo1O(this.I000l1);
/* 41 */            StringBuilder sb = new StringBuilder("SpanStyle(color=");
/* 44 */            sb.append(strI000OOo1O);
/* 49 */            sb.append(", brush=");
/* 52 */            sb.append(iII11l1II00000oOI);
/* 57 */            sb.append(", alpha=");
/* 60 */            sb.append(fI0000Il00O);
/* 65 */            sb.append(", fontSize=");
/* 68 */            sb.append(strI0001Ioi1lo);
/* 73 */            sb.append(", fontWeight=");
/* 78 */            sb.append(this.I0000Il00O);
/* 83 */            sb.append(", fontStyle=");
/* 88 */            sb.append(this.I0000O);
/* 93 */            sb.append(", fontSynthesis=");
/* 98 */            sb.append(this.I0000oI00);
/* 103 */           sb.append(", fontFamily=");
/* 108 */           sb.append(this.I0001Ioi1lo);
/* 113 */           sb.append(", fontFeatureSettings=");
/* 122 */           IIl001iO0Io.I001lIiIIo1O(sb, this.I000II, ", letterSpacing=", strI0001Ioi1lo2, ", baselineShift=");
/* 127 */           sb.append(this.I000OOo1O);
/* 132 */           sb.append(", textGeometricTransform=");
/* 137 */           sb.append(this.I000OiO);
/* 142 */           sb.append(", localeList=");
/* 147 */           sb.append(this.I000iOII);
/* 152 */           sb.append(", background=");
/* 155 */           sb.append(strI000OOo1O2);
/* 160 */           sb.append(", textDecoration=");
/* 165 */           sb.append(this.I000lI);
/* 170 */           sb.append(", shadow=");
/* 175 */           sb.append(this.I000o00OoI0I);
/* 180 */           sb.append(", platformStyle=");
/* 185 */           sb.append(this.I000oI1ioi);
/* 190 */           sb.append(", drawStyle=");
/* 195 */           sb.append(this.I00100l0);
/* 200 */           sb.append(")");
/* 203 */           return sb.toString();
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 135 */       public OlIIi1oIIOlo(III11l1I iII11l1I, float f, long j, IlilIIiIiO ililIIiIiO, Ilil10i ilil10i, Ilil10oOo ilil10oOo, IliO1o11o iliO1o11o, String str, long j2, I1oi0illolii i1oi0illolii, Oo0OOlO0 oo0OOlO0, O11oiiOIl0O o11oiiOIl0O, long j3, OlooIOI0O olooIOI0O, OioOII0oI oioOII0oI, OO1O1OI oo1o1oi, Iilloo0IOoIo iilloo0IOoIo) {
/* 136 */           Oo0OO1I1i oo0OO1I1i = Oo0OIIl1i1.I00000oIO;
                    Oo0OO1I1i iII1lO = oo0OO1I1i;
                    if (iII11l1I != null) {
/* 137 */               if (iII11l1I instanceof OlI00IIlOO) {
/* 139 */                   long jI00000oIO = lOl01i0i00.I00000oIO(f, ((OlI00IIlOO) iII11l1I).I00000oIO);
                            iII1lO = oo0OO1I1i;
                            if (jI00000oIO != 16) {
/* 141 */                       IOOli10 iOOli10 = new IOOli10();
                                iOOli10.I00000oIO = jI00000oIO;
                                if (jI00000oIO == 16) {
/* 144 */                           Ioliol.I00000oIO("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
                                }
/* 142 */                       VarHandle.storeStoreFence();
                                iII1lO = iOOli10;
                            }
                        } else {
/* 145 */                   if (!(iII11l1I instanceof OioIoiOi)) {
/* 147 */                       I000II.I00000oIO();
                                throw null;
                            }
                            iII1lO = new III1lO((OioIoiOi) iII11l1I, f);
                        }
                    }
/* 146 */           this(iII1lO, j, ililIIiIiO, ilil10i, ilil10oOo, iliO1o11o, str, j2, i1oi0illolii, oo0OOlO0, o11oiiOIl0O, j3, olooIOI0O, oioOII0oI, oo1o1oi, iilloo0IOoIo);
                }

/* 147 */       public OlIIi1oIIOlo(Oo0OO1I1i oo0OO1I1i, long j, IlilIIiIiO ililIIiIiO, Ilil10i ilil10i, Ilil10oOo ilil10oOo, IliO1o11o iliO1o11o, String str, long j2, I1oi0illolii i1oi0illolii, Oo0OOlO0 oo0OOlO0, O11oiiOIl0O o11oiiOIl0O, long j3, OlooIOI0O olooIOI0O, OioOII0oI oioOII0oI, OO1O1OI oo1o1oi, Iilloo0IOoIo iilloo0IOoIo) {
/* 149 */           this.I00000oIO = oo0OO1I1i;
/* 150 */           this.I00000oOI = j;
/* 151 */           this.I0000Il00O = ililIIiIiO;
/* 152 */           this.I0000O = ilil10i;
/* 153 */           this.I0000oI00 = ilil10oOo;
/* 154 */           this.I0001Ioi1lo = iliO1o11o;
/* 155 */           this.I000II = str;
/* 156 */           this.I000O01llI0 = j2;
/* 157 */           this.I000OOo1O = i1oi0illolii;
/* 158 */           this.I000OiO = oo0OOlO0;
/* 159 */           this.I000iOII = o11oiiOIl0O;
/* 160 */           this.I000l1 = j3;
/* 161 */           this.I000lI = olooIOI0O;
/* 162 */           this.I000o00OoI0I = oioOII0oI;
/* 163 */           this.I000oI1ioi = oo1o1oi;
/* 164 */           this.I00100l0 = iilloo0IOoIo;
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 164 */       public OlIIi1oIIOlo(long j, long j2, IlilIIiIiO ililIIiIiO, Ilil10i ilil10i, Ilil10oOo ilil10oOo, IliO1o11o iliO1o11o, String str, long j3, I1oi0illolii i1oi0illolii, Oo0OOlO0 oo0OOlO0, O11oiiOIl0O o11oiiOIl0O, long j4, OlooIOI0O olooIOI0O, OioOII0oI oioOII0oI, OO1O1OI oo1o1oi, Iilloo0IOoIo iilloo0IOoIo) {
                    Oo0OIIl1i1 oo0OIIl1i1;
                    if (j != 16) {
/* 166 */               IOOli10 iOOli10 = new IOOli10();
                        iOOli10.I00000oIO = j;
                        if (j == 16) {
/* 169 */                   Ioliol.I00000oIO("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
                        }
/* 167 */               VarHandle.storeStoreFence();
                        oo0OIIl1i1 = iOOli10;
                    } else {
/* 170 */               oo0OIIl1i1 = Oo0OIIl1i1.I00000oIO;
                    }
/* 171 */           this(oo0OIIl1i1, j2, ililIIiIiO, ilil10i, ilil10oOo, iliO1o11o, str, j3, i1oi0illolii, oo0OOlO0, o11oiiOIl0O, j4, olooIOI0O, oioOII0oI, oo1o1oi, iilloo0IOoIo);
                }
            }
