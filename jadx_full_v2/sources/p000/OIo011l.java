            package p000;

            import android.util.Log;
            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            
            public final class OIo011l extends OIll100 {
                public OIlOl1I0IliO I00l0OO0IO;
                public IIOo0liIi I00li1OI;
                public IIOo0liIi I00ll1;
                public boolean I00lli11;
                public boolean I00lll10;
                public HashSet I00o0iI0io1;

                @Override
                public final O1OoooIi1Ol0 I00000oIO() {
/* 3 */             return this.I00l0OO0IO.I00000oIO();
                }

                @Override
                public final float I00000oOI(int i) {
/* 3 */             return this.I00l0OO0IO.I00000oOI(i);
                }

                @Override
                public final boolean I0000Il00O() {
/* 3 */             return this.I00l0OO0IO.I0000Il00O();
                }

                @Override
                public final float I0000O() {
/* 3 */             return this.I00l0OO0IO.I0001Ioi1lo();
                }

                @Override
                public final Ooo0OIOI I0000oI00(int i) {
/* 5 */             if (!I000lI()) {
/* 50 */                return super.I0000oI00(i);
                    }
/* 9 */             OIlOl1I0IliO oIlOl1I0IliO = this.I00l0OO0IO;
/* 25 */            Float fValueOf = (Float) oIlOl1I0IliO.I00ilI0I1.get(Integer.valueOf(oIlOl1I0IliO.I0000O(i)));
/* 27 */            if (fValueOf == null) {
/* 34 */                fValueOf = Float.valueOf(oIlOl1I0IliO.I00io1l[1]);
                    }
/* 46 */            return new Ooo0OIOI(0.0f, fValueOf.floatValue() / 1000.0f);
                }

                @Override
                public final OIll1lio I0001Ioi1lo() {
/* 3 */             return this.I00l0OO0IO.I000OiO();
                }

                @Override
                public final Ooo0OIOI I000II(int i) {
/* 1 */             OIlOl1I0IliO oIlOl1I0IliO = this.I00l0OO0IO;
/* 3 */             int iI0000O = oIlOl1I0IliO.I0000O(i);
/* 17 */            Ooo0OIOI ooo0OIOI = (Ooo0OIOI) oIlOl1I0IliO.I00ilO0.get(Integer.valueOf(iI0000O));
/* 19 */            if (ooo0OIOI == null) {
/* 33 */                Float fValueOf = (Float) oIlOl1I0IliO.I00iiI.get(Integer.valueOf(iI0000O));
/* 35 */                if (fValueOf == null) {
/* 41 */                    fValueOf = Float.valueOf(oIlOl1I0IliO.I000OOo1O());
                        }
/* 57 */                ooo0OIOI = new Ooo0OIOI(fValueOf.floatValue() / 2.0f, oIlOl1I0IliO.I00io1l[0]);
                    }
/* 71 */            return new Ooo0OIOI(ooo0OIOI.I00000oIO * (-0.001f), ooo0OIOI.I00000oOI * (-0.001f));
                }

                @Override
                public final float I000OOo1O(int i) {
/* 49 */            throw new UnsupportedOperationException("not supported");
                }

                @Override
                public final float I000OiO(int i) {
/* 1 */             OIlOl1I0IliO oIlOl1I0IliO = this.I00l0OO0IO;
/* 17 */            Float fValueOf = (Float) oIlOl1I0IliO.I00iiI.get(Integer.valueOf(oIlOl1I0IliO.I0000O(i)));
/* 19 */            if (fValueOf == null) {
/* 25 */                fValueOf = Float.valueOf(oIlOl1I0IliO.I000OOo1O());
                    }
/* 29 */            return fValueOf.floatValue();
                }

                @Override
                public final boolean I000l1() {
/* 1 */             return false;
                }

                @Override
                public final boolean I000lI() {
/* 1 */             IIOo0liIi iIOo0liIi = this.I00li1OI;
                    return iIOo0liIi != null && iIOo0liIi.I00000oIO == 1;
                }

                @Override
                public final int I000oI1ioi(ByteArrayInputStream byteArrayInputStream) throws IOException {
/* 1 */             IIOo0liIi iIOo0liIi = this.I00li1OI;
/* 4 */             if (iIOo0liIi == null) {
/* 204 */               IioIoO10iOiI.I000OOo1O("required cmap is null");
/* 3 */                 return 0;
                    }
/* 8 */             byte[] bArr = new byte[iIOo0liIi.I0001Ioi1lo];
/* 12 */            byteArrayInputStream.read(bArr, 0, iIOo0liIi.I0000oI00);
/* 17 */            byteArrayInputStream.mark(iIOo0liIi.I0001Ioi1lo);
                    int i = iIOo0liIi.I0000oI00 - 1;
/* 26 */            while (i < iIOo0liIi.I0001Ioi1lo) {
/* 28 */                i++;
/* 32 */                Iterator it = iIOo0liIi.I000II.iterator();
/* 40 */                while (it.hasNext()) {
/* 46 */                    IOOOiol1I1O iOOOiol1I1O = (IOOOiol1I1O) it.next();
/* 48 */                    int i2 = iOOOiol1I1O.I0000Il00O;
/* 50 */                    if (i2 == i) {
/* 54 */                        for (int i3 = 0; i3 < i2; i3++) {
/* 58 */                            int i4 = bArr[i3] & 255;
/* 64 */                            if (i4 < iOOOiol1I1O.I00000oIO[i3] || i4 > iOOOiol1I1O.I00000oOI[i3]) {
                                        break;
                                    }
                                }
/* 76 */                        return IIOo0liIi.I0000Il00O(i, bArr);
                            }
                        }
/* 83 */                if (i < iIOo0liIi.I0001Ioi1lo) {
/* 90 */                    bArr[i] = (byte) byteArrayInputStream.read();
                        }
                    }
/* 95 */            StringBuilder sb = new StringBuilder();
/* 100 */           for (int i5 = 0; i5 < iIOo0liIi.I0001Ioi1lo; i5++) {
/* 124 */               sb.append(String.format("0x%02X (%04o) ", Byte.valueOf(bArr[i5]), Byte.valueOf(bArr[i5])));
                    }
/* 156 */           Log.w("PdfBox-Android", "Invalid character code sequence " + ((Object) sb) + "in CMap " + iIOo0liIi.I00000oOI);
/* 163 */           if (byteArrayInputStream.markSupported()) {
/* 165 */               byteArrayInputStream.reset();
                    } else {
/* 173 */               StringBuilder sb2 = new StringBuilder("mark() and reset() not supported, ");
/* 180 */               sb2.append(iIOo0liIi.I0001Ioi1lo - 1);
/* 185 */               sb2.append(" bytes have been skipped");
/* 192 */               Log.w("PdfBox-Android", sb2.toString());
                    }
/* 197 */           return IIOo0liIi.I0000Il00O(iIOo0liIi.I0000oI00, bArr);
                }

                @Override
                public final String I00100l0(int i) {
                    OoIllIioi1l ooIllIioi1l;
/* 1 */             HashSet hashSet = this.I00o0iI0io1;
/* 3 */             OIlOl1I0IliO oIlOl1I0IliO = this.I00l0OO0IO;
/* 5 */             String strI00100l0 = super.I00100l0(i);
/* 9 */             if (strI00100l0 != null) {
/* 11 */                return strI00100l0;
                    }
/* 14 */            if ((this.I00lli11 || this.I00lll10) && this.I00ll1 != null) {
/* 40 */                return (String) this.I00ll1.I000O01llI0.get(Integer.valueOf(oIlOl1I0IliO.I0000O(i)));
                    }
/* 47 */            if ((oIlOl1I0IliO instanceof OIlOll0O000) && (ooIllIioi1l = ((OIlOll0O000) oIlOl1I0IliO).I00l0OO0IO) != null) {
                        try {
/* 56 */                    IOOI0i0Io iOOI0i0IoI00Io1lO = ooIllIioi1l.I00Io1lO();
/* 60 */                    if (iOOI0i0IoI00Io1lO != null) {
/* 80 */                        ArrayList arrayListI0001Ioi1lo = iOOI0i0IoI00Io1lO.I0001Ioi1lo(((OIlOll0O000) oIlOl1I0IliO).I00ll1 ? oIlOl1I0IliO.I0000oI00(i) : oIlOl1I0IliO.I0000O(i));
/* 84 */                        if (arrayListI0001Ioi1lo != null && !arrayListI0001Ioi1lo.isEmpty()) {
/* 104 */                           return Character.toString((char) ((Integer) arrayListI0001Ioi1lo.get(0)).intValue());
                                }
                            }
                        } catch (IOException e) {
/* 111 */                   Log.w("PdfBox-Android", "get unicode from font cmap fail", e);
                        }
                    }
/* 122 */           if (hashSet.contains(Integer.valueOf(i))) {
/* 177 */               return null;
                    }
/* 148 */           StringBuilder sbI00111O = IIlIOloOOO.I00111O(i, "No Unicode mapping for ", "CID+" + oIlOl1I0IliO.I0000O(i), " (", ") in font ");
/* 160 */           sbI00111O.append(this.I00iOIl.I010101Oo1lO(IIi0I0I0o.I00ol1));
/* 167 */           Log.w("PdfBox-Android", sbI00111O.toString());
/* 174 */           hashSet.add(Integer.valueOf(i));
/* 177 */           return null;
                }

                @Override
                public final II1i0i0ilO getBoundingBox() {
/* 3 */             return this.I00l0OO0IO.getBoundingBox();
                }

                @Override
                public final String getName() {
/* 5 */             return this.I00iOIl.I010101Oo1lO(IIi0I0I0o.I00ol1);
                }

                @Override
                public final String toString() {
/* 1 */             OIlOl1I0IliO oIlOl1I0IliO = this.I00l0OO0IO;
/* 50 */            return OIo011l.class.getSimpleName() + "/" + (oIlOl1I0IliO != null ? oIlOl1I0IliO.getClass().getSimpleName() : null) + ", PostScript name: " + this.I00iOIl.I010101Oo1lO(IIi0I0I0o.I00ol1);
                }
            }
