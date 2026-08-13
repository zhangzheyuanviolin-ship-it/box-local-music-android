            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.math.BigDecimal;
            import java.math.BigInteger;
            import java.util.ArrayList;
            import java.util.BitSet;
            import java.util.Formattable;
            import java.util.Formatter;
            import java.util.Locale;
            
            public final class iOlI10l {
                public int I00000oIO;
                public int I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;
                public int I0000oI00;

                public static void I00100l0(Object obj, String str, StringBuilder sb) {
/* 3 */             sb.append("[INVALID: format=");
/* 6 */             sb.append(str);
/* 11 */            sb.append(", type=");
/* 22 */            sb.append(obj.getClass().getCanonicalName());
/* 27 */            sb.append(", value=");
/* 34 */            sb.append(ii0iOOOo.I00000oIO(obj));
/* 39 */            sb.append("]");
                }

                public static void I00100o1O0lo(Object obj, String str, StringBuilder sb) {
/* 3 */             sb.append("[INVALID: format=");
/* 6 */             sb.append(str);
/* 11 */            sb.append(", type=");
/* 22 */            sb.append(obj.getClass().getCanonicalName());
/* 27 */            sb.append(", value=");
/* 34 */            sb.append(o11I00.I00000oIO(obj));
/* 39 */            sb.append("]");
                }

                public void I00000oIO(int i, int i2) {
/* 3 */             ArrayList arrayList = (ArrayList) this.I0000Il00O;
/* 5 */             if (i < 0 || i >= arrayList.size()) {
/* 60 */                OIiilo1Ool0o.I000o00OoI0I(arrayList.size(), IlIi0I0.I00100o1O0lo("Line index ", i, " out of range, number of lines: "));
/* 106 */               return;
                    }
/* 17 */            OlII0Io1 olII0Io1 = (OlII0Io1) arrayList.get(i);
/* 19 */            if (i2 < 0 || i2 > olII0Io1.I00000oIO.length()) {
/* 44 */                OIiilo1Ool0o.I000o00OoI0I(olII0Io1.I00000oIO.length(), IlIi0I0.I00100o1O0lo("Index ", i2, " out of range, line length: "));
                    }
                }

                public int I00000oOI(char c) {
/* 1 */             int i = 0;
                    while (true) {
/* 2 */                 char cI000OiO = I000OiO();
/* 6 */                 if (cI000OiO == 0) {
/* 8 */                     return -1;
                        }
/* 10 */                if (cI000OiO == c) {
/* 12 */                    return i;
                        }
/* 13 */                i++;
/* 15 */                I000II();
                    }
                }

                public OlII11110Iol I0000Il00O(IIOOoI iIOOoI, IIOOoI iIOOoI2) {
/* 3 */             ArrayList arrayList = (ArrayList) this.I0000Il00O;
/* 5 */             int i = iIOOoI.I00000oOI;
/* 7 */             int i2 = iIOOoI.I0000Il00O;
/* 9 */             int i3 = iIOOoI2.I00000oOI;
/* 11 */            int i4 = iIOOoI2.I0000Il00O;
/* 13 */            if (i == i3) {
/* 19 */                OlII0Io1 olII0Io1 = (OlII0Io1) arrayList.get(i);
/* 23 */                CharSequence charSequenceSubSequence = olII0Io1.I00000oIO.subSequence(i2, i4);
/* 27 */                OlIIOI0o olIIOI0o = olII0Io1.I00000oOI;
/* 46 */                OlII0Io1 olII0Io1I00000oIO = OlII0Io1.I00000oIO(charSequenceSubSequence, olIIOI0o != null ? OlIIOI0o.I00000oIO(olIIOI0o.I00000oIO, olIIOI0o.I00000oOI + i2, charSequenceSubSequence.length()) : null);
/* 52 */                OlII11110Iol olII11110Iol = new OlII11110Iol();
/* 57 */                olII11110Iol.I00iOIl.add(olII0Io1I00000oIO);
/* 60 */                return olII11110Iol;
                    }
/* 63 */            OlII11110Iol olII11110Iol2 = new OlII11110Iol();
/* 66 */            ArrayList arrayList2 = olII11110Iol2.I00iOIl;
/* 72 */            OlII0Io1 olII0Io12 = (OlII0Io1) arrayList.get(i);
/* 84 */            arrayList2.add(olII0Io12.I00000oOI(i2, olII0Io12.I00000oIO.length()));
                    while (true) {
/* 87 */                i++;
/* 89 */                if (i >= i3) {
/* 112 */                   arrayList2.add(((OlII0Io1) arrayList.get(i3)).I00000oOI(0, i4));
/* 332 */                   return olII11110Iol2;
                        }
/* 97 */                arrayList2.add((OlII0Io1) arrayList.get(i));
                    }
                }

                public boolean I0000O() {
                    return this.I00000oOI < this.I0000oI00 || this.I00000oIO < ((ArrayList) this.I0000Il00O).size() - 1;
                }

                public int I0000oI00(IIloOI iIloOI) {
/* 1 */             int i = 0;
/* 14 */            while (((BitSet) iIloOI.I00iiI).get(I000OiO())) {
/* 16 */                i++;
/* 18 */                I000II();
                    }
/* 29 */            return i;
                }

                public int I0001Ioi1lo(char c) {
/* 1 */             int i = 0;
/* 6 */             while (I000OiO() == c) {
/* 8 */                 i++;
/* 10 */                I000II();
                    }
/* 29 */            return i;
                }

                public void I000II() {
/* 3 */             ArrayList arrayList = (ArrayList) this.I0000Il00O;
/* 7 */             int i = this.I00000oOI + 1;
/* 9 */             this.I00000oOI = i;
/* 13 */            if (i > this.I0000oI00) {
/* 17 */                int i2 = this.I00000oIO + 1;
/* 19 */                this.I00000oIO = i2;
/* 25 */                if (i2 < arrayList.size()) {
/* 33 */                    OlII0Io1 olII0Io1 = (OlII0Io1) arrayList.get(this.I00000oIO);
/* 35 */                    this.I0000O = olII0Io1;
/* 43 */                    this.I0000oI00 = olII0Io1.I00000oIO.length();
                        } else {
/* 49 */                    OlII0Io1 olII0Io1I00000oIO = OlII0Io1.I00000oIO("", null);
/* 53 */                    this.I0000O = olII0Io1I00000oIO;
/* 61 */                    this.I0000oI00 = olII0Io1I00000oIO.I00000oIO.length();
                        }
/* 64 */                this.I00000oOI = 0;
                    }
                }

                public boolean I000O01llI0(char c) {
/* 5 */             if (I000OiO() != c) {
/* 12 */                return false;
                    }
/* 7 */             I000II();
/* 10 */            return true;
                }

                public boolean I000OOo1O(String str) {
/* 1 */             int i = this.I00000oOI;
/* 6 */             if (i < this.I0000oI00 && str.length() + i <= this.I0000oI00) {
/* 22 */                for (int i2 = 0; i2 < str.length(); i2++) {
/* 41 */                    if (((OlII0Io1) this.I0000O).I00000oIO.charAt(this.I00000oOI + i2) == str.charAt(i2)) {
                            }
                        }
/* 54 */                this.I00000oOI = str.length() + this.I00000oOI;
/* 56 */                return true;
                    }
/* 5 */             return false;
                }

                public char I000OiO() {
/* 1 */             int i = this.I00000oOI;
                    return i < this.I0000oI00 ? ((OlII0Io1) this.I0000O).I00000oIO.charAt(i) : this.I00000oIO < ((ArrayList) this.I0000Il00O).size() + (-1) ? '\n' : (char) 0;
                }

                public IIOOoI I000iOII() {
/* 3 */             int i = this.I00000oIO;
/* 5 */             int i2 = this.I00000oOI;
/* 9 */             IIOOoI iIOOoI = new IIOOoI(3, (byte) 0);
/* 12 */            iIOOoI.I00000oOI = i;
/* 14 */            iIOOoI.I0000Il00O = i2;
/* 16 */            VarHandle.storeStoreFence();
/* 20 */            return iIOOoI;
                }

                public void I000l1(IIOOoI iIOOoI) {
/* 1 */             int i = iIOOoI.I00000oOI;
/* 3 */             int i2 = iIOOoI.I0000Il00O;
/* 5 */             I00000oIO(i, i2);
/* 8 */             this.I00000oIO = i;
/* 10 */            this.I00000oOI = i2;
/* 20 */            OlII0Io1 olII0Io1 = (OlII0Io1) ((ArrayList) this.I0000Il00O).get(i);
/* 22 */            this.I0000O = olII0Io1;
/* 30 */            this.I0000oI00 = olII0Io1.I00000oIO.length();
                }

                public int I000lI() {
/* 1 */             int i = 0;
                    while (true) {
/* 2 */                 char cI000OiO = I000OiO();
/* 8 */                 if (cI000OiO != ' ') {
                            switch (cI000OiO) {
                                case '\t':
                                case '\n':
                                case 11:
                                case '\f':
                                case '\r':
                                    break;
                                default:
/* 13 */                            return i;
                            }
                        }
/* 14 */                i++;
/* 16 */                I000II();
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:106:0x012a  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0092  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I000o00OoI0I(Object obj, o10lIo101o o10lio101o, o10o1Oo o10o1oo) throws IOException {
                    String simpleName;
                    boolean zIsValidCodePoint;
/* 3 */             StringBuilder sb = (StringBuilder) this.I0000O;
/* 5 */             int i = o10lio101o.I00iiI;
/* 7 */             String string = o10lio101o.I00iio;
/* 9 */             int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(i);
/* 18 */            if (iI001lIiIIo1O != 0) {
/* 20 */                if (iI001lIiIIo1O == 1) {
/* 96 */                    zIsValidCodePoint = obj instanceof Boolean;
                        } else if (iI001lIiIIo1O != 2) {
/* 24 */                    if (iI001lIiIIo1O != 3) {
/* 26 */                        if (iI001lIiIIo1O != 4) {
/* 45 */                            throw null;
                                }
/* 42 */                        zIsValidCodePoint = (obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal);
                            } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger)) {
                            }
                        } else if (!(obj instanceof Character)) {
/* 74 */                    if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
/* 91 */                        zIsValidCodePoint = Character.isValidCodePoint(((Number) obj).intValue());
                            }
                        }
/* 98 */                if (!zIsValidCodePoint) {
/* 101 */                   I00100o1O0lo(obj, string, sb);
/* 104 */                   return;
                        }
                    }
/* 105 */           int iOrdinal = o10lio101o.ordinal();
/* 109 */           if (iOrdinal != 0) {
/* 111 */               if (iOrdinal == 1) {
/* 303 */                   if (o10o1oo.I00000oIO()) {
/* 305 */                       sb.append(obj);
/* 308 */                       return;
                            }
                        } else if (iOrdinal != 2) {
/* 115 */                   if (iOrdinal != 3) {
/* 118 */                       if (iOrdinal == 5) {
/* 126 */                           if (!o10o1oo.I00000oIO()) {
/* 129 */                               int i2 = o10o1oo.I00000oIO;
/* 131 */                               int i3 = i2 & Barcode.FORMAT_ITF;
/* 155 */                               o10o1Oo o10o1oo2 = i3 != 0 ? (i3 == i2 && o10o1oo.I00000oOI == -1 && o10o1oo.I0000Il00O == -1) ? o10o1oo : new o10o1Oo(i3, -1, -1) : o10o1Oo.I0000oI00;
/* 161 */                               if (o10o1oo2.equals(o10o1oo)) {
/* 163 */                                   Number number = (Number) obj;
/* 165 */                                   Locale locale = o11I00.I00000oIO;
/* 167 */                                   boolean zI0000Il00O = o10o1oo.I0000Il00O();
/* 171 */                                   long jLongValue = number.longValue();
/* 177 */                                   if (number instanceof Long) {
/* 179 */                                       o11I00.I00000oOI(sb, jLongValue, zI0000Il00O);
/* 182 */                                       return;
                                            }
/* 185 */                                   if (number instanceof Integer) {
/* 193 */                                       o11I00.I00000oOI(sb, jLongValue & 4294967295L, zI0000Il00O);
/* 196 */                                       return;
                                            }
/* 199 */                                   if (number instanceof Byte) {
/* 204 */                                       o11I00.I00000oOI(sb, jLongValue & 255, zI0000Il00O);
/* 207 */                                       return;
                                            }
/* 210 */                                   if (number instanceof Short) {
/* 216 */                                       o11I00.I00000oOI(sb, jLongValue & 65535, zI0000Il00O);
/* 219 */                                       return;
                                            }
/* 222 */                                   if (!(number instanceof BigInteger)) {
/* 258 */                                       I000II.I001IO000("unsupported number type: ".concat(String.valueOf(number.getClass())));
/* 261 */                                       return;
                                            }
/* 228 */                                   String string2 = ((BigInteger) number).toString(16);
/* 232 */                                   if (zI0000Il00O) {
/* 236 */                                       string2 = string2.toUpperCase(o11I00.I00000oIO);
                                            }
/* 240 */                                   sb.append(string2);
/* 243 */                                   return;
                                        }
                                    }
                                }
                            }
                        } else if (o10o1oo.I00000oIO()) {
/* 270 */                   if (obj instanceof Character) {
/* 272 */                       sb.append(obj);
/* 275 */                       return;
                            }
/* 278 */                   int iIntValue = ((Number) obj).intValue();
/* 284 */                   if ((iIntValue >>> 16) == 0) {
/* 287 */                       sb.append((char) iIntValue);
/* 290 */                       return;
                            } else {
/* 295 */                       sb.append(Character.toChars(iIntValue));
/* 298 */                       return;
                            }
                        }
                    } else {
/* 311 */               if (obj instanceof Formattable) {
/* 377 */                   Formattable formattable = (Formattable) obj;
/* 379 */                   Locale locale2 = o11I00.I00000oIO;
/* 381 */                   int i4 = o10o1oo.I00000oIO;
/* 383 */                   int i5 = i4 & 162;
/* 385 */                   if (i5 != 0) {
/* 407 */                       i5 = ((i4 & 32) == 0 ? 0 : 1) | ((i4 & Barcode.FORMAT_ITF) != 0 ? 2 : 0) | ((i4 & 2) == 0 ? 0 : 4);
                            }
/* 409 */                   int length = sb.length();
/* 417 */                   Formatter formatter = new Formatter(sb, o11I00.I00000oIO);
                            try {
/* 424 */                       formattable.formatTo(formatter, i5, o10o1oo.I00000oOI, o10o1oo.I0000Il00O);
/* 427 */                       return;
                            } catch (RuntimeException e) {
/* 429 */                       sb.setLength(length);
                                try {
/* 432 */                           Appendable appendableOut = formatter.out();
                                    try {
/* 436 */                               simpleName = e.toString();
                                    } catch (RuntimeException e2) {
/* 446 */                               simpleName = e2.getClass().getSimpleName();
                                    }
/* 454 */                           appendableOut.append(o11I00.I0000Il00O(simpleName, formattable));
/* 1638 */                          return;
                                } catch (IOException unused) {
/* 1638 */                          return;
                                }
                            }
                        }
/* 317 */               if (o10o1oo.I00000oIO()) {
/* 323 */                   sb.append(o11I00.I00000oIO(obj));
/* 326 */                   return;
                        }
                    }
/* 331 */           if (!o10o1oo.I00000oIO()) {
/* 333 */               int i6 = o10lio101o.I00iOIl;
/* 339 */               if (o10o1oo.I0000Il00O()) {
/* 344 */                   i6 &= 65503;
                        }
/* 349 */               StringBuilder sb2 = new StringBuilder("%");
/* 352 */               o10o1oo.I0000O(sb2);
/* 356 */               sb2.append((char) i6);
/* 359 */               string = sb2.toString();
                    }
/* 373 */           sb.append(String.format(o11I00.I00000oIO, string, obj));
                }

                /* JADX WARN: Removed duplicated region for block: B:106:0x012a  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0092  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I000oI1ioi(Object obj, iOliO0I iolio0i, iOloO1 ioloo1) throws IOException {
                    String simpleName;
                    boolean zIsValidCodePoint;
/* 3 */             StringBuilder sb = (StringBuilder) this.I0000O;
/* 5 */             int i = iolio0i.I00iiI;
/* 7 */             String string = iolio0i.I00iio;
/* 9 */             int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(i);
/* 18 */            if (iI001lIiIIo1O != 0) {
/* 20 */                if (iI001lIiIIo1O == 1) {
/* 96 */                    zIsValidCodePoint = obj instanceof Boolean;
                        } else if (iI001lIiIIo1O != 2) {
/* 24 */                    if (iI001lIiIIo1O != 3) {
/* 26 */                        if (iI001lIiIIo1O != 4) {
/* 45 */                            throw null;
                                }
/* 42 */                        zIsValidCodePoint = (obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal);
                            } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger)) {
                            }
                        } else if (!(obj instanceof Character)) {
/* 74 */                    if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
/* 91 */                        zIsValidCodePoint = Character.isValidCodePoint(((Number) obj).intValue());
                            }
                        }
/* 98 */                if (!zIsValidCodePoint) {
/* 101 */                   I00100l0(obj, string, sb);
/* 104 */                   return;
                        }
                    }
/* 105 */           int iOrdinal = iolio0i.ordinal();
/* 109 */           if (iOrdinal != 0) {
/* 111 */               if (iOrdinal == 1) {
/* 303 */                   if (ioloo1.I00000oOI()) {
/* 305 */                       sb.append(obj);
/* 308 */                       return;
                            }
                        } else if (iOrdinal != 2) {
/* 115 */                   if (iOrdinal != 3) {
/* 118 */                       if (iOrdinal == 5) {
/* 126 */                           if (!ioloo1.I00000oOI()) {
/* 129 */                               int i2 = ioloo1.I00000oIO;
/* 131 */                               int i3 = i2 & Barcode.FORMAT_ITF;
/* 155 */                               iOloO1 ioloo12 = i3 != 0 ? (i3 == i2 && ioloo1.I00000oOI == -1 && ioloo1.I0000Il00O == -1) ? ioloo1 : new iOloO1(i3, -1, -1) : iOloO1.I0000oI00;
/* 161 */                               if (ioloo12.equals(ioloo1)) {
/* 163 */                                   Number number = (Number) obj;
/* 165 */                                   Locale locale = ii0iOOOo.I00000oIO;
/* 167 */                                   boolean zI0000Il00O = ioloo1.I0000Il00O();
/* 171 */                                   long jLongValue = number.longValue();
/* 177 */                                   if (number instanceof Long) {
/* 179 */                                       ii0iOOOo.I0000Il00O(sb, jLongValue, zI0000Il00O);
/* 182 */                                       return;
                                            }
/* 185 */                                   if (number instanceof Integer) {
/* 193 */                                       ii0iOOOo.I0000Il00O(sb, jLongValue & 4294967295L, zI0000Il00O);
/* 196 */                                       return;
                                            }
/* 199 */                                   if (number instanceof Byte) {
/* 204 */                                       ii0iOOOo.I0000Il00O(sb, jLongValue & 255, zI0000Il00O);
/* 207 */                                       return;
                                            }
/* 210 */                                   if (number instanceof Short) {
/* 216 */                                       ii0iOOOo.I0000Il00O(sb, jLongValue & 65535, zI0000Il00O);
/* 219 */                                       return;
                                            }
/* 222 */                                   if (!(number instanceof BigInteger)) {
/* 258 */                                       I000II.I001IO000("unsupported number type: ".concat(String.valueOf(number.getClass())));
/* 261 */                                       return;
                                            }
/* 228 */                                   String string2 = ((BigInteger) number).toString(16);
/* 232 */                                   if (zI0000Il00O) {
/* 236 */                                       string2 = string2.toUpperCase(ii0iOOOo.I00000oIO);
                                            }
/* 240 */                                   sb.append(string2);
/* 243 */                                   return;
                                        }
                                    }
                                }
                            }
                        } else if (ioloo1.I00000oOI()) {
/* 270 */                   if (obj instanceof Character) {
/* 272 */                       sb.append(obj);
/* 275 */                       return;
                            }
/* 278 */                   int iIntValue = ((Number) obj).intValue();
/* 284 */                   if ((iIntValue >>> 16) == 0) {
/* 287 */                       sb.append((char) iIntValue);
/* 290 */                       return;
                            } else {
/* 295 */                       sb.append(Character.toChars(iIntValue));
/* 298 */                       return;
                            }
                        }
                    } else {
/* 311 */               if (obj instanceof Formattable) {
/* 377 */                   Formattable formattable = (Formattable) obj;
/* 379 */                   Locale locale2 = ii0iOOOo.I00000oIO;
/* 381 */                   int i4 = ioloo1.I00000oIO;
/* 383 */                   int i5 = i4 & 162;
/* 385 */                   if (i5 != 0) {
/* 407 */                       i5 = ((i4 & 32) == 0 ? 0 : 1) | ((i4 & Barcode.FORMAT_ITF) != 0 ? 2 : 0) | ((i4 & 2) == 0 ? 0 : 4);
                            }
/* 409 */                   int length = sb.length();
/* 417 */                   Formatter formatter = new Formatter(sb, ii0iOOOo.I00000oIO);
                            try {
/* 424 */                       formattable.formatTo(formatter, i5, ioloo1.I00000oOI, ioloo1.I0000Il00O);
/* 427 */                       return;
                            } catch (RuntimeException e) {
/* 429 */                       sb.setLength(length);
                                try {
/* 432 */                           Appendable appendableOut = formatter.out();
                                    try {
/* 436 */                               simpleName = e.toString();
                                    } catch (RuntimeException e2) {
/* 446 */                               simpleName = e2.getClass().getSimpleName();
                                    }
/* 454 */                           appendableOut.append(ii0iOOOo.I00000oOI(simpleName, formattable));
/* 1638 */                          return;
                                } catch (IOException unused) {
/* 1638 */                          return;
                                }
                            }
                        }
/* 317 */               if (ioloo1.I00000oOI()) {
/* 323 */                   sb.append(ii0iOOOo.I00000oIO(obj));
/* 326 */                   return;
                        }
                    }
/* 331 */           if (!ioloo1.I00000oOI()) {
/* 333 */               int i6 = iolio0i.I00iOIl;
/* 339 */               if (ioloo1.I0000Il00O()) {
/* 344 */                   i6 &= 65503;
                        }
/* 349 */               StringBuilder sb2 = new StringBuilder("%");
/* 352 */               ioloo1.I00000oIO(sb2);
/* 356 */               sb2.append((char) i6);
/* 359 */               string = sb2.toString();
                    }
/* 373 */           sb.append(String.format(ii0iOOOo.I00000oIO, string, obj));
                }
            }
