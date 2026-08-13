            package p000;

            import java.util.Iterator;
            
            public abstract class lIO1i10I1o1o {
                public static OI1Iio0ii1 I00000oIO(OI1Iio0ii1 oI1Iio0ii1, String str, String str2, int i) {
                    char cCharAt;
                    char cCharAt2;
                    Object next;
/* 9 */             boolean z = (i & 4) != 0;
/* 13 */            if ((i & 8) != 0) {
/* 15 */                str2 = null;
                    }
/* 18 */            if (!oI1Iio0ii1.I00iiI) {
/* 22 */                String strI0000Il00O = oI1Iio0ii1.I0000Il00O();
/* 30 */                if (OlOolloIIOl0.I000l1(strI0000Il00O, str, false) && strI0000Il00O.length() != str.length() && ('a' > (cCharAt = strI0000Il00O.charAt(str.length())) || cCharAt >= '{')) {
/* 64 */                    if (str2 != null) {
/* 74 */                        return OI1Iio0ii1.I0000oI00(str2.concat(OlOoOIi0o.I00IOO(str, strI0000Il00O)));
                            }
/* 79 */                    if (!z) {
/* 81 */                        return oI1Iio0ii1;
                            }
/* 82 */                    String strI00IOO = OlOoOIi0o.I00IOO(str, strI0000Il00O);
/* 90 */                    if (strI00IOO.length() != 0 && iOl0l0o0o.I00000oOI(0, strI00IOO)) {
/* 106 */                       if (strI00IOO.length() != 1 && iOl0l0o0o.I00000oOI(1, strI00IOO)) {
/* 125 */                           Iterator it = new IooO11l(0, strI00IOO.length() - 1, 1).iterator();
                                    while (true) {
/* 134 */                               if (!((IooO10lI) it).I00iiO) {
/* 157 */                                   next = null;
                                            break;
                                        }
/* 139 */                               next = ((IooIlO1) it).next();
/* 154 */                               if (!iOl0l0o0o.I00000oOI(((Number) next).intValue(), strI00IOO)) {
                                            break;
                                        }
                                    }
/* 158 */                           Integer num = (Integer) next;
/* 160 */                           if (num != null) {
/* 166 */                               int iIntValue = num.intValue() - 1;
/* 179 */                               strI00IOO = iOl0l0o0o.I0000Il00O(strI00IOO.substring(0, iIntValue)).concat(strI00IOO.substring(iIntValue));
                                    } else {
/* 184 */                               strI00IOO = iOl0l0o0o.I0000Il00O(strI00IOO);
                                    }
                                } else if (strI00IOO.length() != 0 && 'A' <= (cCharAt2 = strI00IOO.charAt(0)) && cCharAt2 < '[') {
/* 227 */                           strI00IOO = Character.toLowerCase(cCharAt2) + strI00IOO.substring(1);
                                }
                            }
/* 235 */                   if (OI1Iio0ii1.I0001Ioi1lo(strI00IOO)) {
/* 238 */                       return OI1Iio0ii1.I0000oI00(strI00IOO);
                            }
                        }
                    }
/* 12 */            return null;
                }
            }
