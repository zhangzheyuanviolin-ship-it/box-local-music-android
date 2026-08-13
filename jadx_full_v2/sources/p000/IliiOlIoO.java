            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.graphics.Typeface;
            import android.os.Trace;
            import java.util.List;
            import java.util.concurrent.LinkedBlockingDeque;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
            public abstract class IliiOlIoO {
                public static final O1Il00 I00000oIO = new O1Il00(16);
                public static final ThreadPoolExecutor I00000oOI;
                public static final Object I0000Il00O;
                public static final Ol0Ii10o1 I0000O;

                static {
/* 29 */            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new Io1iO1I(1));
/* 32 */            threadPoolExecutor.allowCoreThreadTimeOut(true);
/* 35 */            I00000oOI = threadPoolExecutor;
/* 42 */            I0000Il00O = new Object();
/* 50 */            I0000O = new Ol0Ii10o1(0);
                }

                public static String I00000oIO(int i, List list) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 11 */            for (int i2 = 0; i2 < list.size(); i2++) {
/* 21 */                sb.append(((IliiOI0I0) list.get(i2)).I000II);
/* 26 */                sb.append("-");
/* 29 */                sb.append(i);
/* 38 */                if (i2 < list.size() - 1) {
/* 42 */                    sb.append(";");
                        }
                    }
/* 48 */            return sb.toString();
                }

                /* JADX WARN: Code restructure failed: missing block: B:52:0x009e, code lost:
                
                    r8 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x00a2, code lost:
                
                    throw r8;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static IliiOioI1l1I I00000oOI(String str, Context context, List list, int i) {
                    int i2;
                    Typeface typefaceI00000oIO;
/* 1 */             O1Il00 o1Il00 = I00000oIO;
/* 5 */             lOo0I0iOi11O.I00000oIO("getFontSync");
                    try {
/* 12 */                Typeface typeface = (Typeface) o1Il00.I0000Il00O(str);
/* 14 */                if (typeface != null) {
/* 18 */                    return new IliiOioI1l1I(typeface);
                        }
/* 25 */                IlilOiIoo ililOiIooI00000oIO = IliiO10OiIOl.I00000oIO(context, list);
/* 29 */                List list2 = ililOiIooI00000oIO.I00000oOI;
/* 31 */                int i3 = ililOiIooI00000oIO.I00000oIO;
/* 36 */                if (i3 != 0) {
/* 42 */                    i2 = i3 != 1 ? -3 : -2;
                        } else {
/* 48 */                    Ilili1O1io[] ilili1O1ioArr = (Ilili1O1io[]) list2.get(0);
/* 50 */                    if (ilili1O1ioArr == null || ilili1O1ioArr.length == 0) {
/* 76 */                        i2 = 1;
                            } else {
/* 56 */                        int length = ilili1O1ioArr.length;
/* 57 */                        int i4 = 0;
                                while (true) {
/* 58 */                            if (i4 >= length) {
/* 74 */                                i2 = 0;
                                        break;
                                    }
/* 62 */                            int i5 = ilili1O1ioArr[i4].I0001Ioi1lo;
/* 64 */                            if (i5 == 0) {
/* 71 */                                i4++;
                                    } else if (i5 >= 0) {
/* 69 */                                i2 = i5;
                                    }
                                }
                            }
                        }
/* 77 */                if (i2 != 0) {
/* 81 */                    return new IliiOioI1l1I(i2);
                        }
/* 92 */                if (list2.size() > 1) {
/* 94 */                    i1i0olI i1i0oli = OoOl10O1o.I00000oIO;
/* 98 */                    lOo0I0iOi11O.I00000oIO("TypefaceCompat.createFromFontInfoWithFallback");
/* 103 */                   typefaceI00000oIO = OoOl10O1o.I00000oIO.I000iOII(context, list2, i);
/* 107 */                   Trace.endSection();
                        } else {
/* 122 */                   typefaceI00000oIO = OoOl10O1o.I00000oIO(context, (Ilili1O1io[]) list2.get(0), i);
                        }
/* 126 */               if (typefaceI00000oIO == null) {
/* 142 */                   return new IliiOioI1l1I(-3);
                        }
/* 128 */               o1Il00.I0000O(str, typefaceI00000oIO);
/* 133 */               return new IliiOioI1l1I(typefaceI00000oIO);
                    } catch (PackageManager.NameNotFoundException unused) {
/* 152 */               return new IliiOioI1l1I(-1);
                    } finally {
                    }
                }
            }
