            package p000;

            import android.media.MediaCodec;
            import java.util.Comparator;
            import kotlin.jvm.functions.Function1;
            
            public final class IOi10O11O implements Comparator {
                public final int I00iOIl;
                public Object I00iiI;

                public IOi10O11O(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final int compare(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             int i2 = 0;
/* 4 */             Object obj3 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 101 */                   for (Function1 function1 : (Function1[]) obj3) {
/* 117 */                       int iI00000oIO = iii1OiiIi.I00000oIO((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
/* 121 */                       if (iI00000oIO != 0) {
/* 123 */                           return iI00000oIO;
                                }
                            }
/* 3 */                     return 0;
                        case 1:
/* 92 */                    return ((Number) ((Ilo0lI) obj3).invoke(obj, obj2)).intValue();
                        case 2:
/* 79 */                    return ((Number) ((I0Iooi0i1l0l) obj3).invoke(obj, obj2)).intValue();
                        case 3:
/* 66 */                    return ((Number) ((O1IIii) obj3).invoke(obj, obj2)).intValue();
                        default:
/* 13 */                    I1lIlOi1OI0 i1lIlOi1OI0 = (I1lIlOi1OI0) obj2;
/* 15 */                    ((O1ilIl1l0I) obj3).getClass();
/* 20 */                    Class cls = ((I1lIlOi1OI0) obj).I00000oIO.I000OiO;
/* 41 */                    int i3 = cls == MediaCodec.class ? 2 : (cls == OOIIOiolI.class || cls == OlOO1Io010o.class) ? 0 : 1;
/* 44 */                    Class cls2 = i1lIlOi1OI0.I00000oIO.I000OiO;
/* 46 */                    if (cls2 == MediaCodec.class) {
/* 48 */                        i2 = 2;
                            } else if (cls2 != OOIIOiolI.class && cls2 != OlOO1Io010o.class) {
/* 55 */                        i2 = 1;
                            }
/* 56 */                    return i3 - i2;
                    }
                }
            }
