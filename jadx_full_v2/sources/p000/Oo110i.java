            package p000;

            import java.text.ParseException;
            import java.util.TimeZone;
            
            public final class Oo110i extends I00IoO0 implements I00IO1 {
                public final I00OIO1 I00iOIl;

                public Oo110i(I00OIO1 i00oio1) {
/* 6 */             if ((i00oio1 instanceof I00OloOo) || (i00oio1 instanceof I00Io1lO)) {
/* 20 */                this.I00iOIl = i00oio1;
                    } else {
/* 15 */                I000II.I000iOII("unknown object passed to Time");
/* 19 */                throw null;
                    }
                }

                public static Oo110i I000o00OoI0I(I00IO1oi11O i00IO1oi11O) {
/* 1 */             if (i00IO1oi11O == null || (i00IO1oi11O instanceof Oo110i)) {
/* 51 */                return (Oo110i) i00IO1oi11O;
                    }
/* 10 */            if (i00IO1oi11O instanceof I00OloOo) {
/* 16 */                return new Oo110i((I00OloOo) i00IO1oi11O);
                    }
/* 22 */            if (i00IO1oi11O instanceof I00Io1lO) {
/* 28 */                return new Oo110i((I00Io1lO) i00IO1oi11O);
                    }
/* 46 */            I000II.I000iOII("unknown object in factory: ".concat(i00IO1oi11O.getClass().getName()));
/* 49 */            return null;
                }

                @Override
                public final I00OIO1 I0000O() {
/* 1 */             return this.I00iOIl;
                }

                public final String toString() {
                    String str;
                    StringBuilder sb;
                    String strSubstring;
                    String string;
/* 1 */             I00OIO1 i00oio1 = this.I00iOIl;
/* 16 */            if (i00oio1 instanceof I00OloOo) {
/* 22 */                String strI00000oIO = OlOoIoi11.I00000oIO(((I00OloOo) i00oio1).I00iOIl);
/* 34 */                if (strI00000oIO.indexOf(45) >= 0 || strI00000oIO.indexOf(43) >= 0) {
/* 70 */                    int iIndexOf = strI00000oIO.indexOf(45);
/* 74 */                    if (iIndexOf < 0) {
/* 76 */                        iIndexOf = strI00000oIO.indexOf(43);
                            }
/* 86 */                    if (iIndexOf == strI00000oIO.length() - 3) {
/* 90 */                        strI00000oIO = strI00000oIO.concat("00");
                            }
/* 96 */                    if (iIndexOf == 10) {
/* 104 */                       sb = new StringBuilder(strI00000oIO.substring(0, 10));
/* 109 */                       sb.append("00GMT");
/* 118 */                       sb.append(strI00000oIO.substring(10, 13));
/* 121 */                       sb.append(":");
/* 124 */                       strSubstring = strI00000oIO.substring(13, 15);
                            } else {
/* 142 */                       sb = new StringBuilder(strI00000oIO.substring(0, 12));
/* 145 */                       sb.append("GMT");
/* 152 */                       sb.append(strI00000oIO.substring(12, 15));
/* 155 */                       sb.append(":");
/* 160 */                       strSubstring = strI00000oIO.substring(15, 17);
                            }
/* 128 */                   sb.append(strSubstring);
/* 131 */                   string = sb.toString();
                        } else {
/* 65 */                    string = strI00000oIO.length() == 11 ? strI00000oIO.substring(0, 10).concat("00GMT+00:00") : strI00000oIO.substring(0, 12).concat("GMT+00:00");
                        }
                        return string.charAt(0) < '5' ? "20".concat(string) : "19".concat(string);
                    }
/* 187 */           I00Io1lO i00Io1lO = (I00Io1lO) i00oio1;
/* 191 */           String strI00000oIO2 = OlOoIoi11.I00000oIO(i00Io1lO.I00iOIl);
/* 207 */           if (strI00000oIO2.charAt(strI00000oIO2.length() - 1) == 'Z') {
/* 218 */               return strI00000oIO2.substring(0, strI00000oIO2.length() - 1).concat("GMT+00:00");
                    }
/* 223 */           int length = strI00000oIO2.length();
/* 229 */           char cCharAt = strI00000oIO2.charAt(length - 6);
/* 233 */           if ((cCharAt == '-' || cCharAt == '+') && strI00000oIO2.indexOf("GMT") == length - 9) {
/* 245 */               return strI00000oIO2;
                    }
/* 246 */           int length2 = strI00000oIO2.length();
                    int i = length2 - 5;
/* 252 */           char cCharAt2 = strI00000oIO2.charAt(i);
/* 256 */           if (cCharAt2 == '-' || cCharAt2 == '+') {
/* 457 */               StringBuilder sb2 = new StringBuilder(strI00000oIO2.substring(0, i));
/* 460 */               sb2.append("GMT");
                        int i2 = length2 - 2;
/* 469 */               sb2.append(strI00000oIO2.substring(i, i2));
/* 472 */               sb2.append(":");
/* 479 */               sb2.append(strI00000oIO2.substring(i2));
/* 482 */               return sb2.toString();
                    }
                    int length3 = strI00000oIO2.length() - 3;
/* 268 */           char cCharAt3 = strI00000oIO2.charAt(length3);
/* 272 */           if (cCharAt3 == '-' || cCharAt3 == '+') {
/* 446 */               return strI00000oIO2.substring(0, length3) + "GMT" + strI00000oIO2.substring(length3) + ":00";
                    }
/* 280 */           StringBuilder sb3 = new StringBuilder(strI00000oIO2);
/* 283 */           TimeZone timeZone = TimeZone.getDefault();
/* 287 */           int rawOffset = timeZone.getRawOffset();
/* 293 */           if (rawOffset < 0) {
/* 295 */               rawOffset = -rawOffset;
/* 296 */               str = "-";
                    } else {
/* 291 */               str = "+";
                    }
/* 303 */           int i3 = rawOffset / 3600000;
/* 310 */           int i4 = (rawOffset - (3600000 * i3)) / 60000;
                    try {
/* 315 */               if (timeZone.useDaylightTime()) {
/* 321 */                   if (i00Io1lO.I001lllioOl()) {
/* 323 */                       strI00000oIO2 = I00Io1lO.I00II0Ol1O0l(strI00000oIO2);
                            }
/* 374 */                   if (timeZone.inDaylightTime(i00Io1lO.I001i1O0Ol().parse(strI00000oIO2 + "GMT" + str + I00Io1lO.I001iOo1i0O(i3) + ":" + I00Io1lO.I001iOo1i0O(i4)))) {
/* 384 */                       i3 += str.equals("+") ? 1 : -1;
                            }
                        }
                    } catch (ParseException unused) {
                    }
/* 414 */           sb3.append("GMT" + str + I00Io1lO.I001iOo1i0O(i3) + ":" + I00Io1lO.I001iOo1i0O(i4));
/* 417 */           return sb3.toString();
                }
            }
