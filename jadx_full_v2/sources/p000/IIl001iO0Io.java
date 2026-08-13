            package p000;

            import android.database.Cursor;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.TimeUnit;
            
            public abstract class IIl001iO0Io {
                public static final int I00000oIO(int i) {
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
                        case 1:
/* 34 */                    return 4;
                        case 2:
                        case 7:
/* 32 */                    return 1;
                        case 3:
/* 29 */                    return 8;
                        case 4:
                        case 5:
/* 27 */                    return -1;
                        case 6:
/* 25 */                    return 2;
                        default:
/* 20 */                    I000II.I000iOII(IlIi0I0.I000lI("DataType error: DataType ", I001lloI(i), " is not supported yet"));
/* 23 */                    return 0;
                    }
                }

                public static String I00000oOI(String str, char c) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             int length = str.length();
/* 11 */            for (int i = 0; i < length; i++) {
/* 13 */                char cCharAt = str.charAt(i);
/* 21 */                if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
/* 29 */                    sb.append(c);
                        }
/* 32 */                sb.append(cCharAt);
                    }
/* 38 */            return sb.toString();
                }

                public static String I0000Il00O(String str) {
/* 1 */             int length = str.length();
/* 6 */             int i = 0;
                    while (true) {
/* 7 */                 if (i >= length) {
                            break;
                        }
/* 9 */                 char cCharAt = str.charAt(i);
/* 17 */                if (!Character.isLetter(cCharAt)) {
/* 78 */                    i++;
                        } else if (!Character.isUpperCase(cCharAt)) {
/* 26 */                    char upperCase = Character.toUpperCase(cCharAt);
/* 31 */                    if (i == 0) {
/* 48 */                        return upperCase + str.substring(1);
                            }
/* 73 */                    return str.substring(0, i) + upperCase + str.substring(i + 1);
                        }
                    }
/* 186 */           return str;
                }

                public static int I0000O(int i, int i2, int i3) {
/* 6 */             return (Integer.hashCode(i) + i2) * i3;
                }

                public static int I0000oI00(int i, int i2, List list) {
/* 6 */             return (list.hashCode() + i) * i2;
                }

                public static O0Iooi0Io11I I0001Ioi1lo(Class cls, String str, String str2, int i, OOoOl1001II oOoOl1001II) {
/* 6 */             return oOoOl1001II.I000O01llI0(new OOOOIO0i(cls, str, str2, i));
                }

                public static OO0Ii1 I000II(float f, float f2) {
/* 3 */             OO0Ii1 oO0Ii1 = new OO0Ii1();
/* 6 */             oO0Ii1.I000OiO(f, f2);
/* 89 */            return oO0Ii1;
                }

                public static OOiIoli I000O01llI0(Ii10Ioo00l ii10Ioo00l, Ii10i0iO1 ii10i0iO1, int i) {
/* 7 */             return Iiio0Ii.I00000oIO(new Ii10Oil1(ii10Ioo00l, i, 0, ii10i0iO1));
                }

                public static OOiIoli I000OOo1O(Ii10oo ii10oo, int i) {
/* 7 */             return Iiio0Ii.I00000oIO(new Ii10lO01Oi(ii10oo, i, 0));
                }

                public static Object I000OiO(int i, ArrayList arrayList) {
/* 6 */             return arrayList.get(arrayList.size() - i);
                }

                public static String I000iOII(char c, String str, String str2) {
/* 12 */            return str + str2 + c;
                }

                public static String I000l1(int i, int i2, String str, String str2) {
/* 15 */            return str + i + str2 + i2;
                }

                public static String I000lI(int i, String str, StringBuilder sb) {
/* 1 */             sb.append(i);
/* 4 */             sb.append(str);
/* 7 */             return sb.toString();
                }

                public static String I000o00OoI0I(String str, String str2) {
/* 9 */             return str + str2;
                }

                public static String I000oI1ioi(String str, String str2, String str3, String str4) {
/* 15 */            return str + str2 + str3 + str4;
                }

                public static String I00100l0(StringBuilder sb, String str, String str2) {
/* 1 */             sb.append(str);
/* 4 */             sb.append(str2);
/* 7 */             return sb.toString();
                }

                public static String I00100o1O0lo(StringBuilder sb, String str, String str2, String str3, String str4) {
/* 1 */             sb.append(str);
/* 4 */             sb.append(str2);
/* 7 */             sb.append(str3);
/* 10 */            sb.append(str4);
/* 13 */            return sb.toString();
                }

                public static StringBuilder I0010I0i(String str, int i, String str2, int i2, String str3) {
/* 3 */             StringBuilder sb = new StringBuilder(str);
/* 6 */             sb.append(i);
/* 9 */             sb.append(str2);
/* 12 */            sb.append(i2);
/* 15 */            sb.append(str3);
/* 966 */           return sb;
                }

                public static StringBuilder I0010o(String str, OoOIi1lliil ooOIi1lliil, String str2) {
/* 3 */             StringBuilder sb = new StringBuilder(str);
/* 6 */             sb.append(ooOIi1lliil);
/* 9 */             sb.append(str2);
/* 215 */           return sb;
                }

                public static StringBuilder I00111O(String str, String str2, String str3, String str4, String str5) {
/* 3 */             StringBuilder sb = new StringBuilder(str);
/* 6 */             sb.append(str2);
/* 9 */             sb.append(str3);
/* 12 */            sb.append(str4);
/* 15 */            sb.append(str5);
/* 966 */           return sb;
                }

                public static void I001IIilI0O(int i, IloI0lOlll1 iloI0lOlll1, IOioOOi0I iOioOOi0I, IloI0lOlll1 iloI0lOlll12) {
/* 5 */             li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, Integer.valueOf(i));
/* 8 */             li01Ooiio01.I00000oOI(iloI0lOlll12);
                }

                public static void I001IO000(I00O0i0ii i00O0i0ii, String str, String str2, String str3, String str4) {
/* 1 */             i00O0i0ii.I001i1O0Ol(str);
/* 4 */             i00O0i0ii.I001i1O0Ol(str2);
/* 7 */             i00O0i0ii.I001i1O0Ol(str3);
/* 10 */            i00O0i0ii.I001i1O0Ol(str4);
                }

                public static void I001i1O0Ol(OO0Ii1 oO0Ii1, float f, float f2, float f3, float f4) {
/* 1 */             oO0Ii1.I0000Il00O();
/* 4 */             oO0Ii1.I000OiO(f, f2);
/* 7 */             oO0Ii1.I000O01llI0(f3, f4);
                }

                public static void I001i1lo1io(Cursor cursor) throws Exception {
                    boolean zIsTerminated;
/* 3 */             if (cursor instanceof AutoCloseable) {
/* 5 */                 cursor.close();
/* 8 */                 return;
                    }
/* 11 */            if (!(cursor instanceof ExecutorService)) {
/* 60 */                OIiilo1Ool0o.I00100o1O0lo();
/* 186 */               return;
                    }
/* 13 */            ExecutorService executorService = (ExecutorService) cursor;
/* 19 */            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
/* 59 */                return;
                    }
/* 28 */            executorService.shutdown();
/* 31 */            boolean z = false;
/* 32 */            while (!zIsTerminated) {
                        try {
/* 38 */                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
/* 43 */                    if (!z) {
/* 45 */                        executorService.shutdownNow();
/* 48 */                        z = true;
                            }
                        }
                    }
/* 50 */            if (z) {
/* 56 */                Thread.currentThread().interrupt();
                    }
                }

                public static void I001iOo1i0O(Object obj) throws Exception {
                    boolean zIsTerminated;
/* 3 */             if (obj instanceof AutoCloseable) {
/* 7 */                 ((AutoCloseable) obj).close();
/* 10 */                return;
                    }
/* 13 */            if (!(obj instanceof ExecutorService)) {
/* 62 */                OIiilo1Ool0o.I00100o1O0lo();
/* 186 */               return;
                    }
/* 15 */            ExecutorService executorService = (ExecutorService) obj;
/* 21 */            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
/* 61 */                return;
                    }
/* 30 */            executorService.shutdown();
/* 33 */            boolean z = false;
/* 34 */            while (!zIsTerminated) {
                        try {
/* 40 */                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
/* 45 */                    if (!z) {
/* 47 */                        executorService.shutdownNow();
/* 50 */                        z = true;
                            }
                        }
                    }
/* 52 */            if (z) {
/* 58 */                Thread.currentThread().interrupt();
                    }
                }

                public static void I001l0I00(String str, IOi10loi iOi10loi) {
/* 7 */             iOi10loi.I00iIO(new I1o1lOlooI1(str, 1));
                }

                public static void I001lIiIIo1O(StringBuilder sb, String str, String str2, String str3, String str4) {
/* 1 */             sb.append(str);
/* 4 */             sb.append(str2);
/* 7 */             sb.append(str3);
/* 10 */            sb.append(str4);
                }

                public static String I001lllioOl(int i) {
                    return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "CLOSING" : "OPEN" : "OPENING" : "PENDING_OPEN";
                }

                public static String I001lloI(int i) {
                    switch (i) {
                        case 1:
/* 28 */                    return "FLOAT32";
                        case 2:
/* 25 */                    return "INT32";
                        case 3:
/* 22 */                    return "UINT8";
                        case 4:
/* 19 */                    return "INT64";
                        case 5:
/* 16 */                    return "STRING";
                        case 6:
/* 13 */                    return "BOOL";
                        case 7:
/* 10 */                    return "INT16";
                        case 8:
/* 7 */                     return "INT8";
                        default:
/* 4 */                     return "null";
                    }
                }
            }
