            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.List;
            
            public abstract class OlOoOIi0o extends OlOolloIIOl0 {
                public static boolean I000oI1ioi(CharSequence charSequence, String str, boolean z) {
                    return I001i1lo1io(charSequence, str, 0, z, 2) >= 0;
                }

                public static boolean I00100l0(CharSequence charSequence, char c) {
                    return I001i1O0Ol(charSequence, c, 0, 2) >= 0;
                }

                public static String I00100o1O0lo(int i, String str) {
/* 1 */             if (i < 0) {
/* 24 */                I000II.I0010I0i(IIlIOloOOO.I00100l0("Requested character count ", i, " is less than zero."));
/* 27 */                return null;
                    }
/* 7 */             int length = str.length() - i;
/* 8 */             if (length < 0) {
/* 10 */                length = 0;
                    }
/* 11 */            return I00OIl(length, str);
                }

                public static boolean I0010I0i(CharSequence charSequence, char c) {
                    return charSequence.length() > 0 && iOlI1lIi0.I00000oOI(charSequence.charAt(I00111O(charSequence)), c, false);
                }

                public static boolean I0010o(CharSequence charSequence, String str) {
                    return charSequence instanceof String ? OlOolloIIOl0.I000II((String) charSequence, str, false) : I00IO1oi11O(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
                }

                public static int I00111O(CharSequence charSequence) {
/* 5 */             return charSequence.length() - 1;
                }

                public static final int I001IIilI0O(CharSequence charSequence, String str, int i, boolean z) {
                    return (z || !(charSequence instanceof String)) ? I001IO000(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
                }

                public static final int I001IO000(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
                    IooO0oO00I iooO0oO00I;
/* 1 */             CharSequence charSequence3 = charSequence2;
/* 3 */             int i3 = i;
/* 5 */             int i4 = i2;
/* 9 */             if (z2) {
/* 28 */                int iI00111O = I00111O(charSequence);
/* 32 */                if (i3 > iI00111O) {
/* 34 */                    i3 = iI00111O;
                        }
/* 35 */                if (i4 < 0) {
/* 37 */                    i4 = 0;
                        }
/* 40 */                iooO0oO00I = new IooO0oO00I(i3, i4, -1);
                    } else {
/* 13 */                if (i3 < 0) {
/* 15 */                    i3 = 0;
                        }
/* 16 */                int length = charSequence.length();
/* 20 */                if (i4 > length) {
/* 22 */                    i4 = length;
                        }
/* 24 */                iooO0oO00I = new IooO11l(i3, i4, 1);
                    }
/* 43 */            boolean z3 = charSequence instanceof String;
/* 45 */            int i5 = iooO0oO00I.I00iiO;
/* 47 */            int i6 = iooO0oO00I.I00iiI;
/* 49 */            int i7 = iooO0oO00I.I00iOIl;
/* 51 */            if (z3 && (charSequence3 instanceof String)) {
/* 57 */                if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
/* 65 */                    int i8 = i7;
                            while (true) {
/* 67 */                        String str = (String) charSequence3;
/* 70 */                        String str2 = (String) charSequence;
/* 72 */                        int length2 = str.length();
/* 90 */                        if (!(!z ? str.regionMatches(0, str2, i8, length2) : str.regionMatches(z, 0, str2, i8, length2))) {
/* 93 */                            if (i8 == i6) {
                                        break;
                                    }
/* 95 */                            i8 += i5;
                                } else {
/* 92 */                            return i8;
                                }
                            }
                        }
                    } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
/* 105 */               int i9 = i7;
/* 118 */               while (!I00IO1oi11O(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
/* 121 */                   if (i9 != i6) {
/* 123 */                       i9 += i5;
/* 124 */                       charSequence3 = charSequence2;
                            }
                        }
/* 120 */               return i9;
                    }
/* 7 */             return -1;
                }

                public static int I001i1O0Ol(CharSequence charSequence, char c, int i, int i2) {
/* 4 */             if ((i2 & 2) != 0) {
/* 6 */                 i = 0;
                    }
                    return !(charSequence instanceof String) ? I001iOo1i0O(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
                }

                public static int I001i1lo1io(CharSequence charSequence, String str, int i, boolean z, int i2) {
/* 4 */             if ((i2 & 2) != 0) {
/* 6 */                 i = 0;
                    }
/* 9 */             if ((i2 & 4) != 0) {
/* 11 */                z = false;
                    }
/* 12 */            return I001IIilI0O(charSequence, str, i, z);
                }

                public static final int I001iOo1i0O(CharSequence charSequence, char[] cArr, int i, boolean z) {
/* 2 */             if (!z && cArr.length == 1 && (charSequence instanceof String)) {
/* 12 */                int length = cArr.length;
/* 13 */                if (length == 0) {
/* 34 */                    OIiilo1Ool0o.I000II("Array is empty.");
/* 1 */                     return 0;
                        }
/* 15 */                if (length == 1) {
/* 21 */                    return ((String) charSequence).indexOf(cArr[0], i);
                        }
/* 28 */                I000II.I000iOII("Array has more than one element.");
/* 1 */                 return 0;
                    }
/* 38 */            if (i < 0) {
/* 40 */                i = 0;
                    }
/* 41 */            int iI00111O = I00111O(charSequence);
/* 45 */            if (i > iI00111O) {
/* 72 */                return -1;
                    }
                    while (true) {
/* 47 */                char cCharAt = charSequence.charAt(i);
/* 53 */                for (char c : cArr) {
/* 61 */                    if (iOlI1lIi0.I00000oOI(c, cCharAt, z)) {
/* 63 */                        return i;
                            }
                        }
/* 67 */                if (i == iI00111O) {
/* 72 */                    return -1;
                        }
/* 69 */                i++;
                    }
                }

                public static boolean I001l0I00(CharSequence charSequence) {
/* 7 */             for (int i = 0; i < charSequence.length(); i++) {
/* 17 */                if (!iOlI1lIi0.I0000Il00O(charSequence.charAt(i))) {
/* 1 */                     return false;
                        }
                    }
/* 23 */            return true;
                }

                public static char I001lIiIIo1O(CharSequence charSequence) {
/* 5 */             if (charSequence.length() != 0) {
/* 11 */                return charSequence.charAt(I00111O(charSequence));
                    }
/* 18 */            OIiilo1Ool0o.I000II("Char sequence is empty.");
/* 21 */            return (char) 0;
                }

                public static int I001lllioOl(CharSequence charSequence, char c, int i, int i2) {
/* 3 */             if ((i2 & 2) != 0) {
/* 5 */                 i = I00111O(charSequence);
                    }
/* 11 */            if (charSequence instanceof String) {
/* 61 */                return ((String) charSequence).lastIndexOf(c, i);
                    }
/* 14 */            char[] cArr = {c};
/* 21 */            if (charSequence instanceof String) {
/* 27 */                return ((String) charSequence).lastIndexOf(cArr[0], i);
                    }
/* 32 */            int iI00111O = I00111O(charSequence);
/* 36 */            if (i > iI00111O) {
/* 38 */                i = iI00111O;
                    }
/* 40 */            while (-1 < i) {
/* 52 */                if (iOlI1lIi0.I00000oOI(cArr[0], charSequence.charAt(i), false)) {
/* 54 */                    return i;
                        }
                        i--;
                    }
/* 39 */            return -1;
                }

                public static int I001lloI(CharSequence charSequence, String str, int i, int i2) {
/* 3 */             if ((i2 & 2) != 0) {
/* 5 */                 i = I00111O(charSequence);
                    }
/* 9 */             int i3 = i;
                    return !(charSequence instanceof String) ? I001IO000(charSequence, str, i3, 0, false, true) : ((String) charSequence).lastIndexOf(str, i3);
                }

                public static List I00II0Ol1O0l(CharSequence charSequence) {
/* 3 */             O0ooOO o0ooOO = new O0ooOO();
/* 6 */             o0ooOO.I00iOIl = charSequence;
/* 8 */             VarHandle.storeStoreFence();
/* 15 */            if (!o0ooOO.hasNext()) {
/* 17 */                return Il01100l.I00iOIl;
                    }
/* 20 */            Object next = o0ooOO.next();
/* 28 */            if (!o0ooOO.hasNext()) {
/* 30 */                return Collections.singletonList(next);
                    }
/* 37 */            ArrayList arrayList = new ArrayList();
/* 40 */            arrayList.add(next);
/* 47 */            while (o0ooOO.hasNext()) {
/* 53 */                arrayList.add(o0ooOO.next());
                    }
/* 57 */            return arrayList;
                }

                public static String I00II0oii1o(int i, String str) {
                    CharSequence charSequenceSubSequence;
/* 1 */             if (i < 0) {
/* 59 */                I000II.I000iOII(IIlIOloOOO.I00100l0("Desired length ", i, " is less than zero."));
/* 62 */                return null;
                    }
/* 7 */             if (i <= str.length()) {
/* 14 */                charSequenceSubSequence = str.subSequence(0, str.length());
                    } else {
/* 21 */                StringBuilder sb = new StringBuilder(i);
/* 24 */                sb.append((CharSequence) str);
/* 31 */                int length = i - str.length();
/* 32 */                int i2 = 1;
/* 33 */                if (1 <= length) {
                            while (true) {
/* 37 */                        sb.append(' ');
/* 40 */                        if (i2 == length) {
                                    break;
                                }
/* 42 */                        i2++;
                            }
                        }
/* 45 */                charSequenceSubSequence = sb;
                    }
/* 46 */            return charSequenceSubSequence.toString();
                }

                public static String I00IO1(int i, String str) {
                    CharSequence charSequenceSubSequence;
/* 1 */             if (i < 0) {
/* 59 */                I000II.I000iOII(IIlIOloOOO.I00100l0("Desired length ", i, " is less than zero."));
/* 62 */                return null;
                    }
/* 7 */             if (i <= str.length()) {
/* 14 */                charSequenceSubSequence = str.subSequence(0, str.length());
                    } else {
/* 21 */                StringBuilder sb = new StringBuilder(i);
/* 28 */                int length = i - str.length();
/* 29 */                int i2 = 1;
/* 30 */                if (1 <= length) {
                            while (true) {
/* 34 */                        sb.append('0');
/* 37 */                        if (i2 == length) {
                                    break;
                                }
/* 39 */                        i2++;
                            }
                        }
/* 42 */                sb.append((CharSequence) str);
/* 45 */                charSequenceSubSequence = sb;
                    }
/* 46 */            return charSequenceSubSequence.toString();
                }

                public static final boolean I00IO1oi11O(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
/* 2 */             if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
/* 1 */                 return false;
                    }
/* 22 */            for (int i4 = 0; i4 < i3; i4++) {
/* 40 */                if (!iOlI1lIi0.I00000oOI(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
/* 1 */                     return false;
                        }
                    }
/* 46 */            return true;
                }

                public static String I00IOO(CharSequence charSequence, String str) {
                    return I00IoO0(charSequence, str, false) ? str.substring(charSequence.length()) : str;
                }

                public static String I00IioO0OiOi(String str, String str2) {
                    return I0010o(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
                }

                public static final void I00IlilI0i0i(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 return;
                    }
/* 10 */            I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "Limit must be non-negative, but was "));
                }

                public static final List I00Io1lO(CharSequence charSequence, String str, int i) {
/* 1 */             I00IlilI0i0i(i);
/* 5 */             int iI001IIilI0O = I001IIilI0O(charSequence, str, 0, false);
/* 10 */            if (iI001IIilI0O == -1 || i == 1) {
/* 87 */                return Collections.singletonList(charSequence.toString());
                    }
/* 20 */            boolean z = i > 0;
/* 23 */            int i2 = 10;
/* 25 */            if (z && i <= 10) {
/* 30 */                i2 = i;
                    }
/* 31 */            ArrayList arrayList = new ArrayList(i2);
/* 34 */            int length = 0;
/* 65 */            do {
/* 43 */                arrayList.add(charSequence.subSequence(length, iI001IIilI0O).toString());
/* 50 */                length = str.length() + iI001IIilI0O;
/* 51 */                if (z && arrayList.size() == i - 1) {
                            break;
                        }
/* 61 */                iI001IIilI0O = I001IIilI0O(charSequence, str, length, false);
/* 65 */            } while (iI001IIilI0O != -1);
/* 79 */            arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
/* 82 */            return arrayList;
                }

                public static List I00Io1o110i(CharSequence charSequence, char[] cArr) {
/* 4 */             if (cArr.length == 1) {
/* 12 */                return I00Io1lO(charSequence, String.valueOf(cArr[0]), 0);
                    }
/* 17 */            I00IlilI0i0i(0);
/* 25 */            Ol0Oo0 ol0Oo0 = new Ol0Oo0(3);
/* 28 */            ol0Oo0.I00iiI = cArr;
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            IiIoiOio<IooO11l> iiIoiOio = new IiIoiOio(charSequence, 0, ol0Oo0);
/* 39 */            I1IollOi01 i1IollOi01 = new I1IollOi01(2);
/* 42 */            i1IollOi01.I00iiI = iiIoiOio;
/* 44 */            VarHandle.storeStoreFence();
/* 55 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(i1IollOi01, 10));
/* 66 */            for (IooO11l iooO11l : iiIoiOio) {
/* 87 */                arrayList.add(charSequence.subSequence(iooO11l.I00iOIl, iooO11l.I00iiI + 1).toString());
                    }
/* 551 */           return arrayList;
                }

                public static List I00IoIO0lI(CharSequence charSequence, String[] strArr, int i) {
/* 3 */             int i2 = 2;
/* 9 */             int i3 = (i & 4) != 0 ? 0 : 2;
/* 12 */            if (strArr.length == 1) {
/* 14 */                String str = strArr[0];
/* 20 */                if (str.length() != 0) {
/* 23 */                    return I00Io1lO(charSequence, str, i3);
                        }
                    }
/* 28 */            I00IlilI0i0i(i3);
/* 31 */            List listAsList = Arrays.asList(strArr);
/* 39 */            IlI0i0I1l ilI0i0I1l = new IlI0i0I1l(i2);
/* 42 */            ilI0i0I1l.I00iiI = listAsList;
/* 44 */            VarHandle.storeStoreFence();
/* 47 */            IiIoiOio<IooO11l> iiIoiOio = new IiIoiOio(charSequence, i3, ilI0i0I1l);
/* 52 */            I1IollOi01 i1IollOi01 = new I1IollOi01(i2);
/* 55 */            i1IollOi01.I00iiI = iiIoiOio;
/* 57 */            VarHandle.storeStoreFence();
/* 68 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(i1IollOi01, 10));
/* 79 */            for (IooO11l iooO11l : iiIoiOio) {
/* 100 */               arrayList.add(charSequence.subSequence(iooO11l.I00iOIl, iooO11l.I00iiI + 1).toString());
                    }
/* 215 */           return arrayList;
                }

                public static boolean I00IoO0(CharSequence charSequence, String str, boolean z) {
                    return (z || !(charSequence instanceof String)) ? I00IO1oi11O(str, 0, charSequence, 0, charSequence.length(), z) : OlOolloIIOl0.I000l1(str, (String) charSequence, false);
                }

                public static boolean I00IoiI(String str, char c) {
                    return str.length() > 0 && iOlI1lIi0.I00000oOI(str.charAt(0), c, false);
                }

                public static String I00Iooi00oi(String str, String str2, String str3) {
/* 3 */             int iI001i1lo1io = I001i1lo1io(str, str2, 0, false, 6);
                    return iI001i1lo1io == -1 ? str3 : str.substring(str2.length() + iI001i1lo1io, str.length());
                }

                public static String I00O0i0ii(char c, String str, String str2) {
/* 3 */             int iI001lllioOl = I001lllioOl(str, c, 0, 6);
                    return iI001lllioOl == -1 ? str2 : str.substring(iI001lllioOl + 1, str.length());
                }

                public static String I00O0o1oo(String str) {
/* 5 */             int iI001lloI = I001lloI(str, ".", 0, 6);
                    return iI001lloI == -1 ? str : str.substring(1 + iI001lloI, str.length());
                }

                public static String I00O10llo(String str, char c) {
/* 3 */             int iI001i1O0Ol = I001i1O0Ol(str, c, 0, 6);
                    return iI001i1O0Ol == -1 ? str : str.substring(0, iI001i1O0Ol);
                }

                public static String I00OI1(String str, String str2) {
/* 3 */             int iI001i1lo1io = I001i1lo1io(str, str2, 0, false, 6);
                    return iI001i1lo1io == -1 ? str : str.substring(0, iI001i1lo1io);
                }

                public static CharSequence I00OIO1(int i, CharSequence charSequence) {
/* 1 */             if (i < 0) {
/* 24 */                I000II.I0010I0i(IIlIOloOOO.I00100l0("Requested character count ", i, " is less than zero."));
/* 27 */                return null;
                    }
/* 3 */             int length = charSequence.length();
/* 7 */             if (i > length) {
/* 9 */                 i = length;
                    }
/* 11 */            return charSequence.subSequence(0, i);
                }

                public static String I00OIl(int i, String str) {
/* 1 */             if (i < 0) {
/* 24 */                I000II.I0010I0i(IIlIOloOOO.I00100l0("Requested character count ", i, " is less than zero."));
/* 27 */                return null;
                    }
/* 3 */             int length = str.length();
/* 7 */             if (i > length) {
/* 9 */                 i = length;
                    }
/* 11 */            return str.substring(0, i);
                }

                public static CharSequence I00OIo(CharSequence charSequence) {
/* 6 */             int length = charSequence.length() - 1;
/* 7 */             int i = 0;
/* 8 */             boolean z = false;
/* 9 */             while (i <= length) {
/* 20 */                boolean zI0000Il00O = iOlI1lIi0.I0000Il00O(charSequence.charAt(!z ? i : length));
/* 24 */                if (z) {
/* 33 */                    if (!zI0000Il00O) {
                                break;
                            }
                            length--;
                        } else if (zI0000Il00O) {
/* 30 */                    i++;
                        } else {
/* 28 */                    z = true;
                        }
                    }
/* 40 */            return charSequence.subSequence(i, length + 1);
                }

                public static String I00OOll1(String str, char... cArr) {
                    CharSequence charSequenceSubSequence;
                    int length = str.length() - 1;
/* 7 */             if (length >= 0) {
                        while (true) {
                            int i = length - 1;
/* 11 */                    char cCharAt = str.charAt(length);
/* 15 */                    int length2 = cArr.length;
/* 17 */                    int i2 = 0;
                            while (true) {
/* 18 */                        if (i2 >= length2) {
/* 28 */                            i2 = -1;
                                    break;
                                }
/* 22 */                        if (cCharAt == cArr[i2]) {
                                    break;
                                }
/* 25 */                        i2++;
                            }
/* 29 */                    if (i2 < 0) {
/* 38 */                        charSequenceSubSequence = str.subSequence(0, length + 1);
                                break;
                            }
/* 31 */                    if (i < 0) {
                                break;
                            }
/* 34 */                    length = i;
                        }
/* 43 */                charSequenceSubSequence = "";
                    } else {
/* 43 */                charSequenceSubSequence = "";
                    }
/* 45 */            return charSequenceSubSequence.toString();
                }
            }
