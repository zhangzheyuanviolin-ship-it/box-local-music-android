            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.NoSuchElementException;
            
/* 47 */    public abstract class I011lO1liO1O implements O01IlO, Ii1iO1O, IOl1ii1loO {
                public ArrayList I00000oIO = new ArrayList();
                public boolean I00000oOI;
                public final O011OoiO1 I0000Il00O;
                public final String I0000O;
                public final O01IIOOIO I0000oI00;

                public I011lO1liO1O(O011OoiO1 o011OoiO1, String str) {
/* 11 */            this.I0000Il00O = o011OoiO1;
/* 13 */            this.I0000O = str;
/* 17 */            this.I0000oI00 = o011OoiO1.I00000oIO;
                }

                @Override
                public final i1i0olI I00000oIO() {
/* 3 */             return this.I0000Il00O.I00000oOI;
                }

                @Override
                public IOl1ii1loO I00000oOI(OilOloI oilOloI) {
/* 1 */             O01O0o1iI o01O0o1iII00IO1oi11O = I00IO1oi11O();
/* 5 */             lO1oIl1ii lo1oil1iiI000oI1ioi = oilOloI.I000oI1ioi();
/* 11 */            boolean zI0000O = O0000Ioio00.I0000O(lo1oil1iiI000oI1ioi, Oli00oo0l.I0000Il00O);
/* 15 */            O011OoiO1 o011OoiO1 = this.I0000Il00O;
/* 24 */            String str = null;
/* 25 */            if (zI0000O || (lo1oil1iiI000oI1ioi instanceof OO1l1i)) {
/* 293 */               String strI00000oIO = oilOloI.I00000oIO();
/* 299 */               if (o01O0o1iII00IO1oi11O instanceof O011oi0l1O) {
/* 379 */                   return new O01o0OlOo1o(o011OoiO1, (O011oi0l1O) o01O0o1iII00IO1oi11O);
                        }
/* 303 */               StringBuilder sb = new StringBuilder("Expected ");
/* 306 */               OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 318 */               sb.append(oOoOl1001II.I00000oOI(O011oi0l1O.class).I000oI1ioi());
/* 321 */               sb.append(", but had ");
/* 336 */               sb.append(oOoOl1001II.I00000oOI(o01O0o1iII00IO1oi11O.getClass()).I000oI1ioi());
/* 376 */               throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, IIl001iO0Io.I00100l0(sb, " as the serialized body of ", strI00000oIO), I00OIl(), null, o011OoiO1.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01O0o1iII00IO1oi11O.toString()).toString() : null));
                    }
/* 41 */            if (!O0000Ioio00.I0000O(lo1oil1iiI000oI1ioi, Oli00oo0l.I0000O)) {
/* 199 */               String strI00000oIO2 = oilOloI.I00000oIO();
/* 205 */               if (o01O0o1iII00IO1oi11O instanceof O01ioO1o0i11) {
/* 287 */                   return new O01o0Oi1iO(o011OoiO1, (O01ioO1o0i11) o01O0o1iII00IO1oi11O, this.I0000O, 8);
                        }
/* 209 */               StringBuilder sb2 = new StringBuilder("Expected ");
/* 212 */               OOoOl1001II oOoOl1001II2 = OOoOl0i.I00000oIO;
/* 222 */               sb2.append(oOoOl1001II2.I00000oOI(O01ioO1o0i11.class).I000oI1ioi());
/* 225 */               sb2.append(", but had ");
/* 240 */               sb2.append(oOoOl1001II2.I00000oOI(o01O0o1iII00IO1oi11O.getClass()).I000oI1ioi());
/* 280 */               throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, IIl001iO0Io.I00100l0(sb2, " as the serialized body of ", strI00000oIO2), I00OIl(), null, o011OoiO1.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01O0o1iII00IO1oi11O.toString()).toString() : null));
                    }
/* 50 */            OilOloI oilOloII00000oIO = liIOOi1iIII.I00000oIO(oilOloI.I000O01llI0(0), o011OoiO1.I00000oOI);
/* 54 */            lO1oIl1ii lo1oil1iiI000oI1ioi2 = oilOloII00000oIO.I000oI1ioi();
/* 60 */            if (!(lo1oil1iiI000oI1ioi2 instanceof OOIOoio0iiI) && !O0000Ioio00.I0000O(lo1oil1iiI000oI1ioi2, Oili0Il.I00000oOI)) {
/* 75 */                throw l0I0OO0.I00000oIO(oilOloII00000oIO);
                    }
/* 78 */            String strI00000oIO3 = oilOloI.I00000oIO();
/* 84 */            if (!(o01O0o1iII00IO1oi11O instanceof O01ioO1o0i11)) {
/* 88 */                StringBuilder sb3 = new StringBuilder("Expected ");
/* 91 */                OOoOl1001II oOoOl1001II3 = OOoOl0i.I00000oIO;
/* 101 */               sb3.append(oOoOl1001II3.I00000oOI(O01ioO1o0i11.class).I000oI1ioi());
/* 104 */               sb3.append(", but had ");
/* 119 */               sb3.append(oOoOl1001II3.I00000oOI(o01O0o1iII00IO1oi11O.getClass()).I000oI1ioi());
/* 159 */               throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, IIl001iO0Io.I00100l0(sb3, " as the serialized body of ", strI00000oIO3), I00OIl(), null, o011OoiO1.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01O0o1iII00IO1oi11O.toString()).toString() : null));
                    }
/* 160 */           O01ioO1o0i11 o01ioO1o0i11 = (O01ioO1o0i11) o01O0o1iII00IO1oi11O;
/* 164 */           O01o1IoI1 o01o1IoI1 = new O01o1IoI1(o011OoiO1, o01ioO1o0i11, str, 12);
/* 167 */           o01o1IoI1.I000OiO = o01ioO1o0i11;
/* 177 */           List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(o01ioO1o0i11.I00iOIl.keySet());
/* 181 */           o01o1IoI1.I000iOII = listI00iIi0i1o;
/* 189 */           o01o1IoI1.I000l1 = listI00iIi0i1o.size() * 2;
/* 191 */           o01o1IoI1.I000lI = -1;
/* 193 */           VarHandle.storeStoreFence();
/* 196 */           return o01o1IoI1;
                }

                @Override
                public final Ii1iO1O I0000Il00O(OOIOiioi1IlI oOIOiioi1IlI, int i) {
/* 9 */             return I00IoIO0lI(I00O10llo(oOIOiioi1IlI, i), oOIOiioi1IlI.I000O01llI0(i));
                }

                @Override
                public final boolean I0000O() {
/* 5 */             return I00IOO(I00OIO1());
                }

                @Override
                public final char I0000oI00() {
/* 5 */             return I00IlilI0i0i(I00OIO1());
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0001Ioi1lo(O0O01001OOII o0o01001ooii) {
                    String strI00000oOI;
/* 3 */             if (!(o0o01001ooii instanceof I01IoO)) {
/* 189 */               return o0o01001ooii.I00000oOI(this);
                    }
/* 6 */             I01IoO i01IoO = (I01IoO) o0o01001ooii;
/* 8 */             OilOloI oilOloII0000O = i01IoO.I0000O();
/* 12 */            O011OoiO1 o011OoiO1 = this.I0000Il00O;
/* 14 */            String strI0000Il00O = lI1lOI10li.I0000Il00O(o011OoiO1, oilOloII0000O);
/* 18 */            O01O0o1iI o01O0o1iII00IO1oi11O = I00IO1oi11O();
/* 26 */            String strI00000oIO = i01IoO.I0000O().I00000oIO();
/* 34 */            if (!(o01O0o1iII00IO1oi11O instanceof O01ioO1o0i11)) {
/* 40 */                StringBuilder sb = new StringBuilder("Expected ");
/* 43 */                OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 55 */                sb.append(oOoOl1001II.I00000oOI(O01ioO1o0i11.class).I000oI1ioi());
/* 60 */                sb.append(", but had ");
/* 75 */                sb.append(oOoOl1001II.I00000oOI(o01O0o1iII00IO1oi11O.getClass()).I000oI1ioi());
/* 117 */               throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, IIl001iO0Io.I00100l0(sb, " as the serialized body of ", strI00000oIO), I00OIl(), null, o011OoiO1.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01O0o1iII00IO1oi11O.toString()).toString() : null));
                    }
/* 118 */           O01ioO1o0i11 o01ioO1o0i11 = (O01ioO1o0i11) o01O0o1iII00IO1oi11O;
/* 124 */           O01O0o1iI o01O0o1iI = (O01O0o1iI) o01ioO1o0i11.get(strI0000Il00O);
/* 126 */           if (o01O0o1iI != null) {
/* 128 */               O01lO1iO o01lO1iOI0000oI00 = O01O1110.I0000oI00(o01O0o1iI);
/* 142 */               strI00000oOI = o01lO1iOI0000oI00 instanceof O01iI0i0 ? null : o01lO1iOI0000oI00.I00000oOI();
                    }
                    try {
/* 149 */               return lOoI1iI.I00000oIO(o011OoiO1, strI0000Il00O, o01ioO1o0i11, lI1o0lI.I00000oIO((I01IoO) o0o01001ooii, this, strI00000oOI));
                    } catch (Oili1O e) {
/* 188 */               throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, e.getMessage(), null, null, o011OoiO1.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01ioO1o0i11.toString()).toString() : null));
                    }
                }

                @Override
                public final char I000O01llI0(OOIOiioi1IlI oOIOiioi1IlI, int i) {
/* 5 */             return I00IlilI0i0i(I00O10llo(oOIOiioi1IlI, i));
                }

                @Override
                public final float I000OOo1O(OOIOiioi1IlI oOIOiioi1IlI, int i) {
/* 5 */             return I00Io1o110i(I00O10llo(oOIOiioi1IlI, i));
                }

                @Override
                public final O01O0o1iI I000OiO() {
/* 1 */             return I00IO1oi11O();
                }

                @Override
                public final byte I000iOII(OOIOiioi1IlI oOIOiioi1IlI, int i) {
/* 5 */             return I00IioO0OiOi(I00O10llo(oOIOiioi1IlI, i));
                }

                @Override
                public final String I000l1(OilOloI oilOloI, int i) {
/* 5 */             return I00O0i0ii(I00O10llo(oilOloI, i));
                }

                @Override
                public final int I000lI() {
/* 5 */             return I00IoO0(I00OIO1());
                }

                @Override
                public final short I000o00OoI0I(OOIOiioi1IlI oOIOiioi1IlI, int i) {
/* 5 */             return I00Iooi00oi(I00O10llo(oOIOiioi1IlI, i));
                }

                @Override
                public final Ii1iO1O I00100l0(OilOloI oilOloI) {
/* 7 */             if (IOOi0Ool1i.I00IoIO0lI(this.I00000oIO) != null) {
/* 13 */                return I00IoIO0lI(I00OIO1(), oilOloI);
                    }
/* 31 */            return new O01liO(this.I0000Il00O, I00OI1(), this.I0000O).I00100l0(oilOloI);
                }

                @Override
                public final Object I00100o1O0lo(OilOloI oilOloI, int i, O0O01001OOII o0o01001ooii, Object obj) {
/* 7 */             this.I00000oIO.add(I00O10llo(oilOloI, i));
/* 10 */            Object objI0001Ioi1lo = I0001Ioi1lo(o0o01001ooii);
/* 16 */            if (!this.I00000oOI) {
/* 18 */                I00OIO1();
                    }
/* 22 */            this.I00000oOI = false;
/* 483 */           return objI0001Ioi1lo;
                }

                @Override
                public final int I0010I0i(OilOloI oilOloI, int i) {
/* 5 */             return I00IoO0(I00O10llo(oilOloI, i));
                }

                @Override
                public final String I0010o() {
/* 5 */             return I00O0i0ii(I00OIO1());
                }

                @Override
                public final int I00111O(OilOloI oilOloI) {
/* 5 */             String str = (String) I00OIO1();
/* 7 */             O01O0o1iI o01O0o1iII00IO1 = I00IO1(str);
/* 11 */            String strI00000oIO = oilOloI.I00000oIO();
/* 15 */            boolean z = o01O0o1iII00IO1 instanceof O01lO1iO;
/* 17 */            O011OoiO1 o011OoiO1 = this.I0000Il00O;
/* 19 */            if (z) {
/* 113 */               return O01iI00o.I00000oOI(oilOloI, o011OoiO1, ((O01lO1iO) o01O0o1iII00IO1).I00000oOI(), "");
                    }
/* 25 */            StringBuilder sb = new StringBuilder("Expected ");
/* 28 */            OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 40 */            sb.append(oOoOl1001II.I00000oOI(O01lO1iO.class).I000oI1ioi());
/* 45 */            sb.append(", but had ");
/* 60 */            sb.append(oOoOl1001II.I00000oOI(o01O0o1iII00IO1.getClass()).I000oI1ioi());
/* 104 */           throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, IIl001iO0Io.I00100l0(sb, " as the serialized body of ", strI00000oIO), I00OIo(str), null, o011OoiO1.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01O0o1iII00IO1.toString()).toString() : null));
                }

                @Override
                public final long I001IIilI0O() {
/* 5 */             return I00IoiI(I00OIO1());
                }

                @Override
                public boolean I001IO000() {
/* 7 */             return !(I00IO1oi11O() instanceof O01iI0i0);
                }

                @Override
                public final Object I001i1O0Ol(OilOloI oilOloI, int i, O0O01001OOII o0o01001ooii, Object obj) {
/* 7 */             this.I00000oIO.add(I00O10llo(oilOloI, i));
/* 29 */            Object objI0001Ioi1lo = (o0o01001ooii.I0000O().I0000Il00O() || I001IO000()) ? I0001Ioi1lo(o0o01001ooii) : null;
/* 35 */            if (!this.I00000oOI) {
/* 37 */                I00OIO1();
                    }
/* 41 */            this.I00000oOI = false;
/* 483 */           return objI0001Ioi1lo;
                }

                @Override
                public final O011OoiO1 I001i1lo1io() {
/* 1 */             return this.I0000Il00O;
                }

                @Override
                public final boolean I001iOo1i0O(OOIOiioi1IlI oOIOiioi1IlI, int i) {
/* 5 */             return I00IOO(I00O10llo(oOIOiioi1IlI, i));
                }

                @Override
                public final byte I001l0I00() {
/* 5 */             return I00IioO0OiOi(I00OIO1());
                }

                @Override
                public final double I001lIiIIo1O(OilOloI oilOloI, int i) {
/* 5 */             return I00Io1lO(I00O10llo(oilOloI, i));
                }

                @Override
                public final short I001lllioOl() {
/* 5 */             return I00Iooi00oi(I00OIO1());
                }

                @Override
                public final float I001lloI() {
/* 5 */             return I00Io1o110i(I00OIO1());
                }

                @Override
                public final long I00II0Ol1O0l(OilOloI oilOloI, int i) {
/* 5 */             return I00IoiI(I00O10llo(oilOloI, i));
                }

                @Override
                public final double I00II0oii1o() {
/* 5 */             return I00Io1lO(I00OIO1());
                }

                public abstract O01O0o1iI I00IO1(String str);

                public final O01O0o1iI I00IO1oi11O() {
                    O01O0o1iI o01O0o1iII00IO1;
/* 7 */             String str = (String) IOOi0Ool1i.I00IoIO0lI(this.I00000oIO);
                    return (str == null || (o01O0o1iII00IO1 = I00IO1(str)) == null) ? I00OI1() : o01O0o1iII00IO1;
                }

                public final boolean I00IOO(Object obj) {
/* 1 */             String str = (String) obj;
/* 5 */             O01O0o1iI o01O0o1iII00IO1 = I00IO1(str);
/* 12 */            if (!(o01O0o1iII00IO1 instanceof O01lO1iO)) {
/* 18 */                StringBuilder sb = new StringBuilder("Expected ");
/* 21 */                OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 33 */                sb.append(oOoOl1001II.I00000oOI(O01lO1iO.class).I000oI1ioi());
/* 38 */                sb.append(", but had ");
/* 53 */                sb.append(oOoOl1001II.I00000oOI(o01O0o1iII00IO1.getClass()).I000oI1ioi());
/* 58 */                sb.append(" as the serialized body of boolean");
/* 101 */               throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, sb.toString(), I00OIo(str), null, this.I0000Il00O.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01O0o1iII00IO1.toString()).toString() : null));
                    }
/* 102 */           O01lO1iO o01lO1iO = (O01lO1iO) o01O0o1iII00IO1;
                    try {
/* 104 */               Iolii1loo1 iolii1loo1 = O01O1110.I00000oIO;
/* 106 */               String strI00000oOI = o01lO1iO.I00000oOI();
/* 110 */               String[] strArr = OlOllioI11o1.I00000oIO;
/* 134 */               Boolean bool = strI00000oOI.equalsIgnoreCase("true") ? Boolean.TRUE : strI00000oOI.equalsIgnoreCase("false") ? Boolean.FALSE : null;
/* 135 */               if (bool != null) {
/* 137 */                   return bool.booleanValue();
                        }
/* 142 */               I00OOll1(o01lO1iO, "boolean", str);
/* 145 */               throw null;
                    } catch (IllegalArgumentException unused) {
/* 146 */               I00OOll1(o01lO1iO, "boolean", str);
/* 186 */               throw null;
                    }
                }

                public final byte I00IioO0OiOi(Object obj) {
/* 1 */             String str = (String) obj;
/* 5 */             O01O0o1iI o01O0o1iII00IO1 = I00IO1(str);
/* 12 */            if (!(o01O0o1iII00IO1 instanceof O01lO1iO)) {
/* 18 */                StringBuilder sb = new StringBuilder("Expected ");
/* 21 */                OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 33 */                sb.append(oOoOl1001II.I00000oOI(O01lO1iO.class).I000oI1ioi());
/* 38 */                sb.append(", but had ");
/* 53 */                sb.append(oOoOl1001II.I00000oOI(o01O0o1iII00IO1.getClass()).I000oI1ioi());
/* 58 */                sb.append(" as the serialized body of byte");
/* 101 */               throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, sb.toString(), I00OIo(str), null, this.I0000Il00O.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01O0o1iII00IO1.toString()).toString() : null));
                    }
/* 102 */           O01lO1iO o01lO1iO = (O01lO1iO) o01O0o1iII00IO1;
                    try {
/* 104 */               long jI0001Ioi1lo = O01O1110.I0001Ioi1lo(o01lO1iO);
/* 127 */               Byte bValueOf = (-128 > jI0001Ioi1lo || jI0001Ioi1lo > 127) ? null : Byte.valueOf((byte) jI0001Ioi1lo);
/* 128 */               if (bValueOf != null) {
/* 130 */                   return bValueOf.byteValue();
                        }
/* 135 */               I00OOll1(o01lO1iO, "byte", str);
/* 138 */               throw null;
                    } catch (IllegalArgumentException unused) {
/* 139 */               I00OOll1(o01lO1iO, "byte", str);
/* 186 */               throw null;
                    }
                }

                public final char I00IlilI0i0i(Object obj) {
/* 1 */             String str = (String) obj;
/* 3 */             O01O0o1iI o01O0o1iII00IO1 = I00IO1(str);
/* 10 */            if (!(o01O0o1iII00IO1 instanceof O01lO1iO)) {
/* 16 */                StringBuilder sb = new StringBuilder("Expected ");
/* 19 */                OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 31 */                sb.append(oOoOl1001II.I00000oOI(O01lO1iO.class).I000oI1ioi());
/* 36 */                sb.append(", but had ");
/* 51 */                sb.append(oOoOl1001II.I00000oOI(o01O0o1iII00IO1.getClass()).I000oI1ioi());
/* 56 */                sb.append(" as the serialized body of char");
/* 99 */                throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, sb.toString(), I00OIo(str), null, this.I0000Il00O.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01O0o1iII00IO1.toString()).toString() : null));
                    }
/* 100 */           O01lO1iO o01lO1iO = (O01lO1iO) o01O0o1iII00IO1;
                    try {
/* 102 */               String strI00000oOI = o01lO1iO.I00000oOI();
/* 106 */               int length = strI00000oOI.length();
/* 110 */               if (length == 0) {
/* 136 */                   throw new NoSuchElementException("Char sequence is empty.");
                        }
/* 113 */               if (length == 1) {
/* 116 */                   return strI00000oOI.charAt(0);
                        }
/* 128 */               throw new IllegalArgumentException("Char sequence has more than one element.");
                    } catch (IllegalArgumentException unused) {
/* 139 */               I00OOll1(o01lO1iO, "char", str);
/* 186 */               throw null;
                    }
                }

                public final double I00Io1lO(Object obj) throws NumberFormatException {
/* 1 */             String str = (String) obj;
/* 3 */             O01O0o1iI o01O0o1iII00IO1 = I00IO1(str);
/* 7 */             boolean z = o01O0o1iII00IO1 instanceof O01lO1iO;
/* 9 */             O011OoiO1 o011OoiO1 = this.I0000Il00O;
/* 13 */            if (!z) {
/* 19 */                StringBuilder sb = new StringBuilder("Expected ");
/* 22 */                OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 34 */                sb.append(oOoOl1001II.I00000oOI(O01lO1iO.class).I000oI1ioi());
/* 39 */                sb.append(", but had ");
/* 54 */                sb.append(oOoOl1001II.I00000oOI(o01O0o1iII00IO1.getClass()).I000oI1ioi());
/* 59 */                sb.append(" as the serialized body of double");
/* 99 */                throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, sb.toString(), I00OIo(str), null, o011OoiO1.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01O0o1iII00IO1.toString()).toString() : null));
                    }
/* 100 */           O01lO1iO o01lO1iO = (O01lO1iO) o01O0o1iII00IO1;
                    try {
/* 102 */               Iolii1loo1 iolii1loo1 = O01O1110.I00000oIO;
/* 108 */               double d = Double.parseDouble(o01lO1iO.I00000oOI());
/* 123 */               if (Math.abs(d) <= Double.MAX_VALUE) {
/* 125 */                   return d;
                        }
/* 169 */               throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, l0I0OO0.I0001Ioi1lo(Double.valueOf(d), str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", o011OoiO1.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, I00IO1oi11O().toString()).toString() : null));
                    } catch (IllegalArgumentException unused) {
/* 172 */               I00OOll1(o01lO1iO, "double", str);
/* 186 */               throw null;
                    }
                }

                public final float I00Io1o110i(Object obj) throws NumberFormatException {
/* 1 */             String str = (String) obj;
/* 3 */             O01O0o1iI o01O0o1iII00IO1 = I00IO1(str);
/* 7 */             boolean z = o01O0o1iII00IO1 instanceof O01lO1iO;
/* 9 */             O011OoiO1 o011OoiO1 = this.I0000Il00O;
/* 13 */            if (!z) {
/* 19 */                StringBuilder sb = new StringBuilder("Expected ");
/* 22 */                OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 34 */                sb.append(oOoOl1001II.I00000oOI(O01lO1iO.class).I000oI1ioi());
/* 39 */                sb.append(", but had ");
/* 54 */                sb.append(oOoOl1001II.I00000oOI(o01O0o1iII00IO1.getClass()).I000oI1ioi());
/* 59 */                sb.append(" as the serialized body of float");
/* 99 */                throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, sb.toString(), I00OIo(str), null, o011OoiO1.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01O0o1iII00IO1.toString()).toString() : null));
                    }
/* 100 */           O01lO1iO o01lO1iO = (O01lO1iO) o01O0o1iII00IO1;
                    try {
/* 102 */               Iolii1loo1 iolii1loo1 = O01O1110.I00000oIO;
/* 108 */               float f = Float.parseFloat(o01lO1iO.I00000oOI());
/* 121 */               if (Math.abs(f) <= Float.MAX_VALUE) {
/* 123 */                   return f;
                        }
/* 167 */               throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, l0I0OO0.I0001Ioi1lo(Float.valueOf(f), str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", o011OoiO1.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, I00IO1oi11O().toString()).toString() : null));
                    } catch (IllegalArgumentException unused) {
/* 170 */               I00OOll1(o01lO1iO, "float", str);
/* 186 */               throw null;
                    }
                }

                public final Ii1iO1O I00IoIO0lI(Object obj, OilOloI oilOloI) {
/* 1 */             String str = (String) obj;
/* 7 */             if (!OlOl0IIi0OOl.I00000oIO(oilOloI)) {
/* 125 */               this.I00000oIO.add(str);
/* 551 */               return this;
                    }
/* 9 */             O01O0o1iI o01O0o1iII00IO1 = I00IO1(str);
/* 13 */            String strI00000oIO = oilOloI.I00000oIO();
/* 17 */            boolean z = o01O0o1iII00IO1 instanceof O01lO1iO;
/* 19 */            O011OoiO1 o011OoiO1 = this.I0000Il00O;
/* 21 */            if (z) {
/* 119 */               return new O01Io1010OiI(lOOoOlo1ili.I00000oIO(o011OoiO1, ((O01lO1iO) o01O0o1iII00IO1).I00000oOI()), o011OoiO1);
                    }
/* 27 */            StringBuilder sb = new StringBuilder("Expected ");
/* 30 */            OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 42 */            sb.append(oOoOl1001II.I00000oOI(O01lO1iO.class).I000oI1ioi());
/* 47 */            sb.append(", but had ");
/* 62 */            sb.append(oOoOl1001II.I00000oOI(o01O0o1iII00IO1.getClass()).I000oI1ioi());
/* 106 */           throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, IIl001iO0Io.I00100l0(sb, " as the serialized body of ", strI00000oIO), I00OIo(str), null, o011OoiO1.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01O0o1iII00IO1.toString()).toString() : null));
                }

                public final int I00IoO0(Object obj) {
/* 1 */             String str = (String) obj;
/* 5 */             O01O0o1iI o01O0o1iII00IO1 = I00IO1(str);
/* 12 */            if (!(o01O0o1iII00IO1 instanceof O01lO1iO)) {
/* 18 */                StringBuilder sb = new StringBuilder("Expected ");
/* 21 */                OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 33 */                sb.append(oOoOl1001II.I00000oOI(O01lO1iO.class).I000oI1ioi());
/* 38 */                sb.append(", but had ");
/* 53 */                sb.append(oOoOl1001II.I00000oOI(o01O0o1iII00IO1.getClass()).I000oI1ioi());
/* 58 */                sb.append(" as the serialized body of int");
/* 101 */               throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, sb.toString(), I00OIo(str), null, this.I0000Il00O.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01O0o1iII00IO1.toString()).toString() : null));
                    }
/* 102 */           O01lO1iO o01lO1iO = (O01lO1iO) o01O0o1iII00IO1;
                    try {
/* 104 */               long jI0001Ioi1lo = O01O1110.I0001Ioi1lo(o01lO1iO);
/* 128 */               Integer numValueOf = (-2147483648L > jI0001Ioi1lo || jI0001Ioi1lo > 2147483647L) ? null : Integer.valueOf((int) jI0001Ioi1lo);
/* 129 */               if (numValueOf != null) {
/* 131 */                   return numValueOf.intValue();
                        }
/* 136 */               I00OOll1(o01lO1iO, "int", str);
/* 139 */               throw null;
                    } catch (IllegalArgumentException unused) {
/* 140 */               I00OOll1(o01lO1iO, "int", str);
/* 186 */               throw null;
                    }
                }

                public final long I00IoiI(Object obj) {
/* 1 */             String str = (String) obj;
/* 3 */             O01O0o1iI o01O0o1iII00IO1 = I00IO1(str);
/* 10 */            if (o01O0o1iII00IO1 instanceof O01lO1iO) {
/* 100 */               O01lO1iO o01lO1iO = (O01lO1iO) o01O0o1iII00IO1;
                        try {
/* 102 */                   return O01O1110.I0001Ioi1lo(o01lO1iO);
                        } catch (IllegalArgumentException unused) {
/* 109 */                   this.I00OOll1(o01lO1iO, "long", str);
/* 186 */                   throw null;
                        }
                    }
/* 16 */            StringBuilder sb = new StringBuilder("Expected ");
/* 19 */            OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 31 */            sb.append(oOoOl1001II.I00000oOI(O01lO1iO.class).I000oI1ioi());
/* 36 */            sb.append(", but had ");
/* 51 */            sb.append(oOoOl1001II.I00000oOI(o01O0o1iII00IO1.getClass()).I000oI1ioi());
/* 56 */            sb.append(" as the serialized body of long");
/* 99 */            throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, sb.toString(), I00OIo(str), null, this.I0000Il00O.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01O0o1iII00IO1.toString()).toString() : null));
                }

                public final short I00Iooi00oi(Object obj) {
/* 1 */             String str = (String) obj;
/* 5 */             O01O0o1iI o01O0o1iII00IO1 = I00IO1(str);
/* 12 */            if (!(o01O0o1iII00IO1 instanceof O01lO1iO)) {
/* 18 */                StringBuilder sb = new StringBuilder("Expected ");
/* 21 */                OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 33 */                sb.append(oOoOl1001II.I00000oOI(O01lO1iO.class).I000oI1ioi());
/* 38 */                sb.append(", but had ");
/* 53 */                sb.append(oOoOl1001II.I00000oOI(o01O0o1iII00IO1.getClass()).I000oI1ioi());
/* 58 */                sb.append(" as the serialized body of short");
/* 101 */               throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, sb.toString(), I00OIo(str), null, this.I0000Il00O.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01O0o1iII00IO1.toString()).toString() : null));
                    }
/* 102 */           O01lO1iO o01lO1iO = (O01lO1iO) o01O0o1iII00IO1;
                    try {
/* 104 */               long jI0001Ioi1lo = O01O1110.I0001Ioi1lo(o01lO1iO);
/* 127 */               Short shValueOf = (-32768 > jI0001Ioi1lo || jI0001Ioi1lo > 32767) ? null : Short.valueOf((short) jI0001Ioi1lo);
/* 128 */               if (shValueOf != null) {
/* 130 */                   return shValueOf.shortValue();
                        }
/* 135 */               I00OOll1(o01lO1iO, "short", str);
/* 138 */               throw null;
                    } catch (IllegalArgumentException unused) {
/* 139 */               I00OOll1(o01lO1iO, "short", str);
/* 186 */               throw null;
                    }
                }

                public final String I00O0i0ii(Object obj) {
/* 1 */             String str = (String) obj;
/* 3 */             O01O0o1iI o01O0o1iII00IO1 = I00IO1(str);
/* 7 */             boolean z = o01O0o1iII00IO1 instanceof O01lO1iO;
/* 9 */             O011OoiO1 o011OoiO1 = this.I0000Il00O;
/* 13 */            if (!z) {
/* 19 */                StringBuilder sb = new StringBuilder("Expected ");
/* 22 */                OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 34 */                sb.append(oOoOl1001II.I00000oOI(O01lO1iO.class).I000oI1ioi());
/* 39 */                sb.append(", but had ");
/* 54 */                sb.append(oOoOl1001II.I00000oOI(o01O0o1iII00IO1.getClass()).I000oI1ioi());
/* 59 */                sb.append(" as the serialized body of string");
/* 99 */                throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, sb.toString(), I00OIo(str), null, o011OoiO1.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01O0o1iII00IO1.toString()).toString() : null));
                    }
/* 100 */           O01lO1iO o01lO1iO = (O01lO1iO) o01O0o1iII00IO1;
/* 104 */           if (!(o01lO1iO instanceof O01i0Iiil)) {
/* 151 */               throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, IlIi0I0.I000lI("Expected string value for a non-null key '", str, "', got null literal instead"), I00OIo(str), "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", o011OoiO1.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, I00IO1oi11O().toString()).toString() : null));
                    }
/* 152 */           O01i0Iiil o01i0Iiil = (O01i0Iiil) o01lO1iO;
/* 156 */           if (o01i0Iiil.I00iOIl || o011OoiO1.I00000oIO.I0000Il00O) {
/* 210 */               return o01i0Iiil.I00iiO;
                    }
/* 209 */           throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, IlIi0I0.I000lI("String literal for value of key '", str, "' should be quoted"), I00OIo(str), "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", o011OoiO1.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, I00IO1oi11O().toString()).toString() : null));
                }

                public String I00O0o1oo(OilOloI oilOloI, int i) {
/* 1 */             return oilOloI.I0001Ioi1lo(i);
                }

                public final String I00O10llo(OilOloI oilOloI, int i) {
/* 1 */             String strI00O0o1oo = I00O0o1oo(oilOloI, i);
/* 89 */            return strI00O0o1oo;
                }

                public abstract O01O0o1iI I00OI1();

                public final Object I00OIO1() {
/* 1 */             ArrayList arrayList = this.I00000oIO;
/* 7 */             Object objRemove = arrayList.remove(IOOi1I.I000II(arrayList));
/* 12 */            this.I00000oOI = true;
/* 29 */            return objRemove;
                }

                public final String I00OIl() {
/* 1 */             ArrayList arrayList = this.I00000oIO;
                    return arrayList.isEmpty() ? "$" : IOOi0Ool1i.I00IlilI0i0i(arrayList, ".", "$.", null, null, 60);
                }

                public final String I00OIo(String str) {
/* 18 */            return I00OIl() + '.' + str;
                }

                public final void I00OOll1(O01lO1iO o01lO1iO, String str, String str2) {
/* 215 */           throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, "Failed to parse literal '" + o01lO1iO + "' as " + (OlOolloIIOl0.I000l1(str, "i", false) ? "an " : "a ").concat(str) + " value", I00OIo(str2), null, this.I0000Il00O.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, I00IO1oi11O().toString()).toString() : null));
                }

                @Override
/* 48 */        public void I000oI1ioi(OilOloI oilOloI) {
                }
            }
