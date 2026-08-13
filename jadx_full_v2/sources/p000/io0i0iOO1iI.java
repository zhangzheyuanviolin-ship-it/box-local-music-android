            package p000;

            import java.io.IOException;
            import java.util.Hashtable;
            
            public abstract class io0i0iOO1iI {
                public static void I00000oIO(StringBuffer stringBuffer, I1i000Io i1i000Io, Hashtable hashtable) {
/* 7 */             String str = (String) hashtable.get(i1i000Io.I00iOIl);
/* 9 */             if (str == null) {
/* 17 */                str = i1i000Io.I00iOIl.I00iOIl;
                    }
/* 11 */            stringBuffer.append(str);
/* 22 */            stringBuffer.append('=');
/* 31 */            stringBuffer.append(I0000O(i1i000Io.I00iiI));
                }

                public static String I00000oOI(I00IO1oi11O i00IO1oi11O) {
/* 1 */             String strI0000O = I0000O(i00IO1oi11O);
/* 11 */            if (strI0000O.length() > 0 && strI0000O.charAt(0) == '#') {
                        try {
                            try {
/* 32 */                        Object objI00111O = I00OIO1.I00111O(Io1i1OIoO.I00000oIO.I000lI(strI0000O.length() - 1, strI0000O));
/* 38 */                        if (objI00111O instanceof I00Ol10) {
/* 42 */                            strI0000O = ((I00Ol10) objI00111O).I0000oI00();
                                }
                            } catch (Exception e) {
/* 68 */                        I00OI1 i00oi1 = new I00OI1("exception decoding Hex string: " + e.getMessage(), 1);
/* 71 */                        i00oi1.I00iiI = e;
/* 73 */                        throw i00oi1;
                            }
                        } catch (IOException e2) {
/* 77 */                    IoOOl0iOl1io.I000OOo1O("unknown encoding in name: ", e2);
/* 80 */                    return null;
                        }
                    }
/* 82 */            int i = OlOoIoi11.I00000oIO;
/* 84 */            char[] charArray = strI0000O.toCharArray();
/* 89 */            boolean z = false;
/* 91 */            for (int i2 = 0; i2 != charArray.length; i2++) {
/* 93 */                char c = charArray[i2];
/* 97 */                if ('A' <= c && 'Z' >= c) {
/* 106 */                   charArray[i2] = (char) (c + ' ');
/* 108 */                   z = true;
                        }
                    }
/* 112 */           if (z) {
/* 116 */               strI0000O = new String(charArray);
                    }
/* 119 */           int length = strI0000O.length();
/* 124 */           if (length < 2) {
/* 126 */               return strI0000O;
                    }
/* 127 */           int i3 = length - 1;
/* 128 */           int i4 = 0;
/* 133 */           while (i4 < i3 && strI0000O.charAt(i4) == '\\' && strI0000O.charAt(i4 + 1) == ' ') {
/* 149 */               i4 += 2;
                    }
/* 152 */           int i5 = i4 + 1;
/* 154 */           int i6 = i3;
/* 155 */           while (i6 > i5 && strI0000O.charAt(i6 - 1) == '\\' && strI0000O.charAt(i6) == ' ') {
                        i6 -= 2;
                    }
/* 174 */           if (i4 > 0 || i6 < i3) {
/* 179 */               strI0000O = strI0000O.substring(i4, i6 + 1);
                    }
/* 189 */           if (strI0000O.indexOf("  ") < 0) {
/* 191 */               return strI0000O;
                    }
/* 194 */           StringBuffer stringBuffer = new StringBuffer();
/* 197 */           char cCharAt = strI0000O.charAt(0);
/* 201 */           stringBuffer.append(cCharAt);
/* 208 */           for (int i7 = 1; i7 < strI0000O.length(); i7++) {
/* 210 */               char cCharAt2 = strI0000O.charAt(i7);
/* 214 */               if (cCharAt != ' ' || cCharAt2 != ' ') {
/* 218 */                   stringBuffer.append(cCharAt2);
/* 221 */                   cCharAt = cCharAt2;
                        }
                    }
/* 225 */           return stringBuffer.toString();
                }

                public static boolean I0000Il00O(OOiliIii oOiliIii, OOiliIii oOiliIii2) {
/* 12 */            if (oOiliIii.I00iOIl.I00iOIl.length != oOiliIii2.I00iOIl.I00iOIl.length) {
/* 11 */                return false;
                    }
/* 15 */            I1i000Io[] i1i000IoArrI000oI1ioi = oOiliIii.I000oI1ioi();
/* 19 */            I1i000Io[] i1i000IoArrI000oI1ioi2 = oOiliIii2.I000oI1ioi();
/* 25 */            if (i1i000IoArrI000oI1ioi.length != i1i000IoArrI000oI1ioi2.length) {
/* 11 */                return false;
                    }
/* 30 */            for (int i = 0; i != i1i000IoArrI000oI1ioi.length; i++) {
/* 32 */                I1i000Io i1i000Io = i1i000IoArrI000oI1ioi[i];
/* 34 */                I1i000Io i1i000Io2 = i1i000IoArrI000oI1ioi2[i];
/* 36 */                if (i1i000Io != i1i000Io2 && (i1i000Io == null || i1i000Io2 == null || !i1i000Io.I00iOIl.I0010o(i1i000Io2.I00iOIl) || !I00000oOI(i1i000Io.I00iiI).equals(I00000oOI(i1i000Io2.I00iiI)))) {
/* 11 */                    return false;
                        }
                    }
/* 78 */            return true;
                }

                public static String I0000O(I00IO1oi11O i00IO1oi11O) {
/* 3 */             StringBuffer stringBuffer = new StringBuffer();
/* 12 */            int i = 0;
/* 13 */            if (!(i00IO1oi11O instanceof I00Ol10) || (i00IO1oi11O instanceof Ii10000i)) {
                        try {
/* 44 */                    stringBuffer.append('#');
/* 51 */                    byte[] bArrI000lI = i00IO1oi11O.I0000O().I000lI();
/* 55 */                    OlOO1i11110 olOO1i11110 = Io1i1OIoO.I00000oIO;
/* 66 */                    stringBuffer.append(OlOoIoi11.I00000oIO(Io1i1OIoO.I00000oIO(bArrI000lI.length, bArrI000lI)));
                        } catch (IOException unused) {
/* 183 */                   I000II.I000iOII("Other value has no encoded form");
/* 186 */                   return null;
                        }
                    } else {
/* 21 */                String strI0000oI00 = ((I00Ol10) i00IO1oi11O).I0000oI00();
/* 29 */                if (strI0000oI00.length() > 0 && strI0000oI00.charAt(0) == '#') {
/* 37 */                    stringBuffer.append('\\');
                        }
/* 40 */                stringBuffer.append(strI0000oI00);
                    }
/* 69 */            int length = stringBuffer.length();
/* 79 */            int i2 = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 2 : 0;
/* 97 */            while (i2 != length) {
/* 99 */                char cCharAt = stringBuffer.charAt(i2);
/* 105 */               if (cCharAt != '\"' && cCharAt != '\\' && cCharAt != '+' && cCharAt != ',') {
                            switch (cCharAt) {
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                    break;
                                default:
/* 120 */                           i2++;
                            }
                        }
/* 123 */               stringBuffer.insert(i2, "\\");
/* 126 */               i2 += 2;
/* 128 */               length++;
                    }
/* 137 */           if (stringBuffer.length() > 0) {
/* 143 */               while (stringBuffer.length() > i && stringBuffer.charAt(i) == ' ') {
/* 151 */                   stringBuffer.insert(i, "\\");
/* 154 */                   i += 2;
                        }
                    }
/* 162 */           for (int length2 = stringBuffer.length() - 1; length2 >= i && stringBuffer.charAt(length2) == ' '; length2--) {
/* 170 */               stringBuffer.insert(length2, '\\');
                    }
/* 176 */           return stringBuffer.toString();
                }
            }
