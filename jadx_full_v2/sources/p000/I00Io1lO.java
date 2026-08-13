            package p000;

            import java.text.SimpleDateFormat;
            import java.util.Arrays;
            import java.util.SimpleTimeZone;
            
            public class I00Io1lO extends I00OIO1 {
                public static final I001lllioOl I00iiI = new I001lllioOl(2, I00Io1lO.class);
                public final byte[] I00iOIl;

                public I00Io1lO(byte[] bArr) {
/* 7 */             if (bArr.length < 4) {
/* 48 */                I000II.I000iOII("GeneralizedTime string too short");
/* 186 */               throw null;
                    }
/* 9 */             this.I00iOIl = bArr;
/* 16 */            if (I001lloI(0) && I001lloI(1) && I001lloI(2) && I001lloI(3)) {
/* 39 */                return;
                    }
/* 42 */            I000II.I000iOII("illegal characters in GeneralizedTime string");
/* 45 */            throw null;
                }

                public static String I001iOo1i0O(int i) {
                    return i < 10 ? Oi010OO0.I000oI1ioi(i, OIllioIilO.I01OO1I) : Integer.toString(i);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static I00Io1lO I001lIiIIo1O(I00IO1oi11O i00IO1oi11O) {
/* 1 */             if (i00IO1oi11O == 0 || (i00IO1oi11O instanceof I00Io1lO)) {
/* 78 */                return (I00Io1lO) i00IO1oi11O;
                    }
/* 8 */             I00OIO1 i00oio1I0000O = i00IO1oi11O.I0000O();
/* 14 */            if (i00oio1I0000O instanceof I00Io1lO) {
/* 16 */                return (I00Io1lO) i00oio1I0000O;
                    }
/* 21 */            if (!(i00IO1oi11O instanceof byte[])) {
/* 73 */                I000II.I000iOII("illegal object in getInstance: ".concat(i00IO1oi11O.getClass().getName()));
/* 76 */                return null;
                    }
                    try {
/* 31 */                return (I00Io1lO) I00iiI.I0000Il00O((byte[]) i00IO1oi11O);
                    } catch (Exception e) {
/* 58 */                throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
                    }
                }

                public static String I00II0Ol1O0l(String str) {
                    StringBuilder sb;
                    String str2;
                    String string;
                    char cCharAt;
/* 3 */             String strSubstring = str.substring(14);
/* 8 */             int i = 1;
/* 13 */            while (i < strSubstring.length() && '0' <= (cCharAt = strSubstring.charAt(i)) && cCharAt <= '9') {
/* 28 */                i++;
                    }
                    int i2 = i - 1;
/* 35 */            if (i2 > 3) {
/* 46 */                string = strSubstring.substring(0, 4).concat(strSubstring.substring(i));
                    } else {
/* 59 */                if (i2 == 1) {
/* 67 */                    sb = new StringBuilder(strSubstring.substring(0, i));
/* 70 */                    str2 = "00";
                        } else {
/* 88 */                    if (i2 != 2) {
/* 186 */                       return str;
                            }
/* 96 */                    sb = new StringBuilder(strSubstring.substring(0, i));
/* 99 */                    str2 = OIllioIilO.I01OO1I;
                        }
/* 72 */                sb.append(str2);
/* 79 */                sb.append(strSubstring.substring(i));
/* 82 */                string = sb.toString();
                    }
/* 54 */            return str.substring(0, 14).concat(string);
                }

                @Override
                public final boolean I000o00OoI0I(I00OIO1 i00oio1) {
/* 3 */             if (!(i00oio1 instanceof I00Io1lO)) {
/* 5 */                 return false;
                    }
/* 13 */            return Arrays.equals(this.I00iOIl, ((I00Io1lO) i00oio1).I00iOIl);
                }

                @Override
                public void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) {
/* 5 */             o1OIll00i.I00Ol10(24, z, this.I00iOIl);
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 1 */             return false;
                }

                @Override
                public int I0010I0i(boolean z) {
/* 4 */             return O1OIll00i.I00O10llo(this.I00iOIl.length, z);
                }

                @Override
                public I00OIO1 I001IIilI0O() {
/* 5 */             return new Ii0o1i(this.I00iOIl);
                }

                public final SimpleDateFormat I001i1O0Ol() {
/* 67 */            SimpleDateFormat simpleDateFormat = I001lllioOl() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : (I001lloI(12) && I001lloI(13)) ? new SimpleDateFormat("yyyyMMddHHmmssz") : (I001lloI(10) && I001lloI(11)) ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
/* 78 */            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
/* 113 */           return simpleDateFormat;
                }

                public final boolean I001lllioOl() {
/* 2 */             int i = 0;
                    while (true) {
/* 3 */                 byte[] bArr = this.I00iOIl;
/* 6 */                 if (i == bArr.length) {
/* 1 */                     return false;
                        }
/* 12 */                if (bArr[i] == 46 && i == 14) {
/* 18 */                    return true;
                        }
/* 20 */                i++;
                    }
                }

                public final boolean I001lloI(int i) {
                    byte b;
/* 1 */             byte[] bArr = this.I00iOIl;
                    return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
                }

                @Override
                public final int hashCode() {
/* 3 */             return iOO1iOiOl.I00000oOI(this.I00iOIl);
                }
            }
