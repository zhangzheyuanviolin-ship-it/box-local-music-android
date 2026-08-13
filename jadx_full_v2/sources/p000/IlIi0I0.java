            package p000;

            import java.util.ArrayList;
            
            public abstract class IlIi0I0 {
                public static boolean I00000oIO(int i) {
/* 3 */             if (i == 1 || i == 2) {
/* 1 */                 return false;
                    }
/* 9 */             if (i == 3 || i == 4) {
/* 2 */                 return true;
                    }
/* 16 */            throw null;
                }

                public static int I00000oOI(int i, int i2, int i3) {
/* 6 */             return IOOOi1I1I1.I000O01llI0(i) + i2 + i3;
                }

                public static int I0000Il00O(int i, int i2, int i3, int i4) {
/* 7 */             return IOOOi1I1I1.I000OOo1O(i) + i2 + i3 + i4;
                }

                public static long I0000O(float f, long j, long j2) {
/* 6 */             return lOlilO1lOIO.I0000oI00(Oo0o1OiIo.I0000O(j) * f, j2);
                }

                public static IOiIIo1l I0000oI00(String str) {
/* 1 */             Ioll0IliO1l.I00000oOI(str);
/* 7 */             return new IOiIIo1l(5);
                }

                public static OIoi0IIoi I0001Ioi1lo(O1IoiiO0o1 o1IoiiO0o1, String str, String str2) {
/* 8 */             return new OIoi0IIoi(str2, new O1IoOOii0Ioi(o1IoiiO0o1, str));
                }

                public static OIoi0IIoi I000II(String str, String str2, Character ch) {
/* 8 */             return new OIoi0IIoi(ch, new OIoi0IIoi(str, str2));
                }

                public static OOiIoli I000O01llI0(Ii110ilOil ii110ilOil, int i) {
/* 7 */             return Iiio0Ii.I00000oIO(new Ii10lO01Oi(ii110ilOil, i, 1));
                }

                public static Olill00lIoo I000OOo1O(ArrayList arrayList, Olill00lIoo olill00lIoo) {
/* 1 */             arrayList.add(olill00lIoo);
/* 6 */             return new Olill00lIoo();
                }

                public static String I000OiO(int i, String str, String str2, String str3) {
/* 15 */            return str + i + str2 + str3;
                }

                public static String I000iOII(long j, String str) {
/* 9 */             return str + j;
                }

                public static String I000l1(long j, String str, String str2) {
/* 12 */            return str + j + str2;
                }

                public static String I000lI(String str, String str2, String str3) {
/* 12 */            return str + str2 + str3;
                }

                public static String I000o00OoI0I(StringBuilder sb, long j, String str) {
/* 1 */             sb.append(j);
/* 4 */             sb.append(str);
/* 7 */             return sb.toString();
                }

                public static String I000oI1ioi(StringBuilder sb, String str, char c) {
/* 1 */             sb.append(str);
/* 4 */             sb.append(c);
/* 7 */             return sb.toString();
                }

                public static StringBuilder I00100l0(String str, float f, String str2, float f2, String str3) {
/* 3 */             StringBuilder sb = new StringBuilder(str);
/* 6 */             sb.append(f);
/* 9 */             sb.append(str2);
/* 12 */            sb.append(f2);
/* 15 */            sb.append(str3);
/* 399 */           return sb;
                }

                public static StringBuilder I00100o1O0lo(String str, int i, String str2) {
/* 3 */             StringBuilder sb = new StringBuilder(str);
/* 6 */             sb.append(i);
/* 9 */             sb.append(str2);
/* 98 */            return sb;
                }

                public static void I0010I0i(int i, int i2, int i3, int i4, int i5) {
/* 1 */             l0lIloi.I00000oIO(i);
/* 4 */             l0lIloi.I00000oIO(i2);
/* 7 */             l0lIloi.I00000oIO(i3);
/* 10 */            l0lIloi.I00000oIO(i4);
/* 13 */            l0lIloi.I00000oIO(i5);
                }

                public static void I0010o(int i, IloI0lOlll1 iloI0lOlll1, IOioOOi0I iOioOOi0I, IloI0lOlll1 iloI0lOlll12) {
/* 5 */             li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, Integer.valueOf(i));
/* 8 */             li01Ooiio01.I00000oOI(iloI0lOlll12);
                }

                public static void I00111O(Olill00lIoo olill00lIoo, Olio00O olio00O, Olilol olilol, Olill0O0OOIO olill0O0OOIO, OlOOI001 olOOI001) {
/* 1 */             olill00lIoo.I00000oIO(olio00O);
/* 8 */             olill00lIoo.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO, olOOI001));
                }

                public static int I001IIilI0O(int i, int i2, int i3, int i4) {
/* 3 */             return ((i * i2) / i3) + i4;
                }

                public static String I001IO000(int i) {
                    switch (i) {
                        case 1:
/* 34 */                    return "BEGIN_ARRAY";
                        case 2:
/* 31 */                    return "END_ARRAY";
                        case 3:
/* 28 */                    return "BEGIN_OBJECT";
                        case 4:
/* 25 */                    return "END_OBJECT";
                        case 5:
/* 22 */                    return "NAME";
                        case 6:
/* 19 */                    return "STRING";
                        case 7:
/* 16 */                    return "NUMBER";
                        case 8:
/* 13 */                    return "BOOLEAN";
                        case 9:
/* 10 */                    return "NULL";
                        case 10:
/* 7 */                     return "END_DOCUMENT";
                        default:
/* 4 */                     return "null";
                    }
                }

                public static int I001i1O0Ol(String str) {
/* 2 */             if (str == null) {
/* 46 */                IOOlIIilOl0.I000II("Name is null");
/* 1 */                 return 0;
                    }
/* 10 */            if (str.equals("TTF")) {
/* 12 */                return 1;
                    }
/* 20 */            if (str.equals("OTF")) {
/* 22 */                return 2;
                    }
/* 30 */            if (str.equals("PFB")) {
/* 32 */                return 3;
                    }
/* 40 */            I000II.I000iOII("No enum constant com.tom_roush.pdfbox.pdmodel.font.FontFormat.".concat(str));
/* 1 */             return 0;
                }
            }
