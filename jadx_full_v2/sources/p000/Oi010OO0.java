            package p000;

            import android.content.Context;
            import android.view.View;
            import android.view.ViewGroup;
            import java.util.ArrayList;
            import java.util.Map;
            import java.util.Objects;
            
            public abstract class Oi010OO0 {
                public static final void I00000oIO(View view, int i) {
/* 1 */             int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(i);
/* 6 */             if (iI001lIiIIo1O == 0) {
/* 64 */                ViewGroup viewGroup = (ViewGroup) view.getParent();
/* 66 */                if (viewGroup != null) {
/* 72 */                    if (Ill1OlOOl.I00IOO(2)) {
/* 74 */                        view.toString();
/* 77 */                        viewGroup.toString();
                            }
/* 80 */                    viewGroup.removeView(view);
/* 106 */                   return;
                        }
/* 106 */               return;
                    }
/* 9 */             if (iI001lIiIIo1O == 1) {
/* 50 */                if (Ill1OlOOl.I00IOO(2)) {
/* 52 */                    Objects.toString(view);
                        }
/* 56 */                view.setVisibility(0);
                    } else if (iI001lIiIIo1O == 2) {
/* 35 */                if (Ill1OlOOl.I00IOO(2)) {
/* 37 */                    Objects.toString(view);
                        }
/* 42 */                view.setVisibility(8);
                    } else {
/* 14 */                if (iI001lIiIIo1O != 3) {
/* 106 */                   return;
                        }
/* 21 */                if (Ill1OlOOl.I00IOO(2)) {
/* 23 */                    Objects.toString(view);
                        }
/* 27 */                view.setVisibility(4);
                    }
                }

                public static Number I00000oOI(int i, O01loll1loll o01loll1loll) {
/* 2 */             if (i == 1) {
/* 90 */                return Double.valueOf(o01loll1loll.I00OIl());
                    }
/* 5 */             if (i == 2) {
/* 82 */                return new O0ioIi(o01loll1loll.I00lli11());
                    }
/* 8 */             if (i == 3) {
/* 45 */                String strI00lli11 = o01loll1loll.I00lli11();
/* 55 */                if (strI00lli11.indexOf(46) >= 0) {
/* 57 */                    return I000II(strI00lli11, o01loll1loll);
                        }
                        try {
/* 66 */                    return Long.valueOf(Long.parseLong(strI00lli11));
                        } catch (NumberFormatException unused) {
/* 71 */                    return I000II(strI00lli11, o01loll1loll);
                        }
                    }
/* 10 */            String strI00lli112 = o01loll1loll.I00lli11();
                    try {
/* 14 */                return l1ioi10IIoO0.I00000oOI(strI00lli112);
                    } catch (NumberFormatException e) {
/* 26 */                StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Cannot parse ", strI00lli112, "; at path ");
/* 34 */                sbI001IIilI0O.append(o01loll1loll.I001l0I00(true));
/* 44 */                throw new O01l1oO(sbI001IIilI0O.toString(), e);
                    }
                }

                public static int I0000Il00O(int i) {
/* 1 */             if (i == 0) {
/* 24 */                return 2;
                    }
/* 4 */             if (i == 4) {
/* 3 */                 return 4;
                    }
/* 8 */             if (i == 8) {
/* 10 */                return 3;
                    }
/* 18 */            I000II.I000iOII(I000oI1ioi(i, "Unknown visibility "));
/* 21 */            return 0;
                }

                public static int I0000O(View view) {
/* 8 */             if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
/* 16 */                return 4;
                    }
/* 22 */            return I0000Il00O(view.getVisibility());
                }

                public static final boolean I0000oI00(int i) {
/* 5 */             return !Oo11ii010IIO.I00000oIO();
                }

                public static final boolean I0001Ioi1lo(int i) {
                    Boolean bool;
/* 5 */             if (Oo11ii010IIO.I00000oIO()) {
                        try {
/* 24 */                    bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
                        } catch (Exception unused) {
/* 31 */                    Oo11ii010IIO.I00000oIO.info("Conscrypt is not available or does not support checking for FIPS build.");
/* 34 */                    bool = Boolean.FALSE;
                        }
/* 40 */                if (!bool.booleanValue()) {
/* 43 */                    return false;
                        }
                    }
/* 45 */            return true;
                }

                public static Double I000II(String str, O01loll1loll o01loll1loll) throws NumberFormatException, O1OIO1Ill0 {
                    try {
/* 6 */                 Double dValueOf = Double.valueOf(str);
/* 14 */                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
/* 27 */                    if (o01loll1loll.I00o0iI0io1 != 1) {
/* 57 */                        throw new O1OIO1Ill0("JSON forbids NaN and infinities: " + dValueOf + "; at path " + o01loll1loll.I001l0I00(true));
                            }
                        }
/* 29 */                return dValueOf;
                    } catch (NumberFormatException e) {
/* 62 */                StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Cannot parse ", str, "; at path ");
/* 70 */                sbI001IIilI0O.append(o01loll1loll.I001l0I00(true));
/* 106 */               throw new O01l1oO(sbI001IIilI0O.toString(), e);
                    }
                }

                public static int I000O01llI0(int i, int i2, String str) {
/* 6 */             return (str.hashCode() + i) * i2;
                }

                public static int I000OOo1O(int i, int i2, boolean z) {
/* 6 */             return (Boolean.hashCode(z) + i) * i2;
                }

                public static int I000OiO(Oo0lloOiiIOI oo0lloOiiIOI, int i, int i2) {
/* 6 */             return (oo0lloOiiIOI.hashCode() + i) * i2;
                }

                public static int I000iOII(Map map, int i, int i2) {
/* 6 */             return (map.hashCode() + i) * i2;
                }

                public static O1ooiI111i I000l1(IloI0lOlll1 iloI0lOlll1, boolean z, boolean z2, O1ooIo101ll o1ooIo101ll, float f) {
/* 1 */             iloI0lOlll1.I0010I0i(z);
/* 4 */             iloI0lOlll1.I0010I0i(z2);
/* 7 */             return Ol0iOOO0.I0000oI00(o1ooIo101ll, f);
                }

                public static OO0Ii1 I000lI(float f, float f2, float f3, float f4) {
/* 3 */             OO0Ii1 oO0Ii1 = new OO0Ii1();
/* 6 */             oO0Ii1.I000OiO(f, f2);
/* 9 */             oO0Ii1.I000OOo1O(f3, f4);
/* 204 */           return oO0Ii1;
                }

                public static Olill00lIoo I000o00OoI0I(Olilol olilol, Olill0O0OOIO olill0O0OOIO, Olill00lIoo olill00lIoo, ArrayList arrayList, Olill00lIoo olill00lIoo2) {
/* 7 */             olill00lIoo.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO, Olio00O.I0000oI00));
/* 10 */            arrayList.add(olill00lIoo2);
/* 15 */            return new Olill00lIoo();
                }

                public static String I000oI1ioi(int i, String str) {
/* 9 */             return str + i;
                }

                public static String I00100l0(int i, String str, StringBuilder sb) {
/* 1 */             sb.append(str);
/* 4 */             sb.append(i);
/* 7 */             return sb.toString();
                }

                public static String I00100o1O0lo(OOoOl1001II oOoOl1001II, Class cls, StringBuilder sb) {
/* 5 */             sb.append(oOoOl1001II.I00000oOI(cls));
/* 8 */             return sb.toString();
                }

                public static String I0010I0i(String str, int i, char c) {
/* 12 */            return str + i + c;
                }

                public static String I0010o(String str, int i, String str2, int i2, String str3) {
/* 18 */            return str + i + str2 + i2 + str3;
                }

                public static String I00111O(String str, String str2) {
/* 12 */            return str + str2;
                }

                public static String I001IIilI0O(String str, String str2, String str3, String str4) {
/* 18 */            return str + str2 + str3 + str4;
                }

                public static String I001IO000(String str, String str2, String str3, String str4, String str5) {
/* 18 */            return str + str2 + str3 + str4 + str5;
                }

                public static String I001i1O0Ol(StringBuilder sb, float f, String str) {
/* 1 */             sb.append(f);
/* 4 */             sb.append(str);
/* 7 */             return sb.toString();
                }

                public static String I001i1lo1io(StringBuilder sb, int i, char c) {
/* 1 */             sb.append(i);
/* 4 */             sb.append(c);
/* 7 */             return sb.toString();
                }

                public static StringBuilder I001iOo1i0O(long j, String str, String str2) {
/* 3 */             StringBuilder sb = new StringBuilder(str);
/* 6 */             sb.append(j);
/* 9 */             sb.append(str2);
/* 98 */            return sb;
                }

                public static void I001l0I00(IloI0lOlll1 iloI0lOlll1, boolean z, boolean z2, boolean z3) {
/* 1 */             iloI0lOlll1.I0010I0i(z);
/* 4 */             iloI0lOlll1.I0010I0i(z2);
/* 7 */             iloI0lOlll1.I0010I0i(z3);
                }

                public static void I001lIiIIo1O(Olilol olilol, Olill0O0OOIO olill0O0OOIO, Olill00lIoo olill00lIoo, Olilol olilol2, Olill0O0OOIO olill0O0OOIO2) {
/* 1 */             OlOOI001 olOOI001 = Olio00O.I0000oI00;
/* 7 */             olill00lIoo.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO, olOOI001));
/* 14 */            olill00lIoo.I00000oIO(loIOiIO1O1.I000iOII(olilol2, olill0O0OOIO2, olOOI001));
                }

                public static void I001lllioOl(Context context, String str, int i, String str2, boolean z) {
/* 13 */            context.getSharedPreferences(str, i).edit().putBoolean(str2, z).apply();
                }

                public static String I001lloI(int i) {
                    switch (i) {
                        case 1:
/* 43 */                    return "NONE";
                        case 2:
/* 40 */                    return "STRING";
                        case 3:
/* 37 */                    return "NAME";
                        case 4:
/* 34 */                    return "LITERAL";
                        case 5:
/* 31 */                    return "REAL";
                        case 6:
/* 28 */                    return "INTEGER";
                        case 7:
/* 25 */                    return "START_ARRAY";
                        case 8:
/* 22 */                    return "END_ARRAY";
                        case 9:
/* 19 */                    return "START_PROC";
                        case 10:
/* 16 */                    return "END_PROC";
                        case 11:
/* 13 */                    return "START_DICT";
                        case 12:
/* 10 */                    return "END_DICT";
                        case 13:
/* 7 */                     return "CHARSTRING";
                        default:
/* 4 */                     return "null";
                    }
                }
            }
