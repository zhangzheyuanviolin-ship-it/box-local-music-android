            package p000;

            import android.os.SystemClock;
            import android.os.Trace;
            import android.util.Log;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public abstract class IIlIOloOOO {
                public static final int[] I00000oIO = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};

                public static int I00000oIO(int i, int i2) {
/* 1 */             if (i == 0 || i2 == 0) {
/* 89 */                throw null;
                    }
/* 5 */             return i - i2;
                }

                public static boolean I00000oOI(int i, int i2) {
/* 1 */             if (i != 0) {
                        return i == i2;
                    }
/* 89 */            throw null;
                }

                public static int I0000Il00O(int i, int i2, int i3, int i4) {
/* 3 */             return i + i2 + i3 + i4;
                }

                public static int I0000O(long j, int i, int i2) {
/* 6 */             return (Long.hashCode(j) + i) * i2;
                }

                public static long I0000oI00(long j) {
/* 1 */             Trace.endSection();
/* 8 */             return SystemClock.elapsedRealtimeNanos() - j;
                }

                public static I00O0i0ii I0001Ioi1lo(String str) {
/* 6 */             return new I00O0i0ii(str).I00II0Ol1O0l();
                }

                public static IIi0I0I0o I000II(String str, String str2) {
/* 4 */             new IIi0I0I0o(str, true);
/* 9 */             return new IIi0I0I0o(str2, true);
                }

                public static IIi0I0I0o I000O01llI0(String str, String str2, String str3) {
/* 4 */             new IIi0I0I0o(str, true);
/* 9 */             new IIi0I0I0o(str2, true);
/* 14 */            return new IIi0I0I0o(str3, true);
                }

                public static IOiIIo1l I000OOo1O(String str) {
/* 1 */             IolioOO1.I0000O(str);
/* 7 */             return new IOiIIo1l(5);
                }

                public static O0Io0Io I000OiO(Class cls, String str, String str2, int i, OOoOl1001II oOoOl1001II) {
/* 6 */             return oOoOl1001II.I0001Ioi1lo(new OI100OO1(cls, str, str2, i));
                }

                public static OO0Ii1 I000iOII(float f, float f2, float f3, float f4) {
/* 3 */             OO0Ii1 oO0Ii1 = new OO0Ii1();
/* 6 */             oO0Ii1.I000OiO(f, f2);
/* 9 */             oO0Ii1.I000O01llI0(f3, f4);
/* 483 */           return oO0Ii1;
                }

                public static ClassCastException I000l1(Object obj) {
/* 1 */             obj.getClass();
/* 6 */             return new ClassCastException();
                }

                public static ClassCastException I000lI(Iterator it) {
/* 5 */             it.next().getClass();
/* 10 */            return new ClassCastException();
                }

                public static Object I000o00OoI0I(int i, ArrayList arrayList) {
/* 6 */             return arrayList.remove(arrayList.size() - i);
                }

                public static String I000oI1ioi(char c, String str, String str2) {
/* 12 */            return str + c + str2;
                }

                public static String I00100l0(String str, int i, String str2) {
/* 12 */            return str + i + str2;
                }

                public static String I00100o1O0lo(StringBuilder sb, String str, int i, String str2) {
/* 1 */             sb.append(str);
/* 4 */             sb.append(i);
/* 7 */             sb.append(str2);
/* 10 */            return sb.toString();
                }

                public static String I0010I0i(StringBuilder sb, String str, String str2, String str3) {
/* 1 */             sb.append(str);
/* 4 */             sb.append(str2);
/* 7 */             sb.append(str3);
/* 10 */            return sb.toString();
                }

                public static String I0010o(StringBuilder sb, boolean z, String str) {
/* 1 */             sb.append(z);
/* 4 */             sb.append(str);
/* 7 */             return sb.toString();
                }

                public static StringBuilder I00111O(int i, String str, String str2, String str3, String str4) {
/* 3 */             StringBuilder sb = new StringBuilder(str);
/* 6 */             sb.append(str2);
/* 9 */             sb.append(str3);
/* 12 */            sb.append(i);
/* 15 */            sb.append(str4);
/* 966 */           return sb;
                }

                public static StringBuilder I001IIilI0O(String str, String str2, String str3) {
/* 3 */             StringBuilder sb = new StringBuilder(str);
/* 6 */             sb.append(str2);
/* 9 */             sb.append(str3);
/* 215 */           return sb;
                }

                public static void I001IO000(IOO000ilo iOO000ilo, long j) {
/* 5 */             iOO000ilo.I0010o().I00100l0();
/* 8 */             iOO000ilo.I00Io1lO(j);
                }

                public static void I001i1O0Ol(OO0Ii1 oO0Ii1, float f, float f2, float f3, float f4) {
/* 1 */             oO0Ii1.I000OiO(f, f2);
/* 4 */             oO0Ii1.I000II(f3);
/* 7 */             oO0Ii1.I000oI1ioi(f4);
                }

                public static void I001i1lo1io(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return;
                    }
/* 4 */             OIiilo1Ool0o.I00000oIO();
                }

                public static void I001iOo1i0O(String str, String str2, String str3) {
/* 13 */            Log.e(str3, str + str2);
                }

                public static void I001l0I00(StringBuilder sb, String str, int i, String str2, int i2) {
/* 1 */             sb.append(str);
/* 4 */             sb.append(i);
/* 7 */             sb.append(str2);
/* 10 */            sb.append(i2);
                }

                public static int I001lIiIIo1O(int i) {
/* 1 */             if (i != 0) {
/* 3 */                 return i - 1;
                    }
/* 49 */            throw null;
                }

                public static String I001lllioOl(int i) {
                    return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "SYNTHESIZED" : "DELEGATION" : "FAKE_OVERRIDE" : "DECLARATION";
                }

                public static int[] I001lloI(int i) {
/* 1 */             int[] iArr = new int[i];
/* 6 */             System.arraycopy(I00000oIO, 0, iArr, 0, i);
/* 49 */            return iArr;
                }
            }
