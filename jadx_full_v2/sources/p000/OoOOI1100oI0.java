            package p000;

            import java.util.Map;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public abstract class OoOOI1100oI0 {
                public static final I1OoI00 I00000oIO = new I1OoI00();

                public static Map I00000oIO(Object obj) {
/* 3 */             if ((obj instanceof O0IlIoi) && !(obj instanceof O0IloOoIliOO)) {
/* 12 */                I0001Ioi1lo("kotlin.collections.MutableMap", obj);
/* 16 */                throw null;
                    }
                    try {
/* 17 */                return (Map) obj;
                    } catch (ClassCastException e) {
/* 27 */                O0000Ioio00.I000O01llI0(e, OoOOI1100oI0.class.getName());
/* 49 */                throw e;
                    }
                }

                public static Set I00000oOI(Object obj) {
/* 3 */             if ((obj instanceof O0IlIoi) && !(obj instanceof O0Io11IiO0l)) {
/* 12 */                I0001Ioi1lo("kotlin.collections.MutableSet", obj);
/* 16 */                throw null;
                    }
                    try {
/* 17 */                return (Set) obj;
                    } catch (ClassCastException e) {
/* 27 */                O0000Ioio00.I000O01llI0(e, OoOOI1100oI0.class.getName());
/* 49 */                throw e;
                    }
                }

                public static void I0000Il00O(int i, Object obj) {
/* 1 */             if (obj == null || I0000O(i, obj)) {
/* 89 */                return;
                    }
/* 24 */            I0001Ioi1lo("kotlin.jvm.functions.Function" + i, obj);
/* 28 */            throw null;
                }

                public static boolean I0000O(int i, Object obj) {
/* 4 */             if (obj instanceof IlliIlI) {
/* 183 */               if ((obj instanceof Illl0OO0l ? ((Illl0OO0l) obj).getArity() : obj instanceof IllOOo00lI ? 0 : obj instanceof Function1 ? 1 : obj instanceof IlliIl1l11O ? 2 : obj instanceof Function3 ? 3 : obj instanceof IlliOIilI ? 4 : obj instanceof IlliOIo0o10 ? 5 : obj instanceof IlliOll ? 6 : obj instanceof Illiioi1 ? 7 : obj instanceof Illil0Iio ? 8 : obj instanceof Illil0o1o ? 9 : obj instanceof IllOiOo ? 10 : obj instanceof IllOii1Oi0O0 ? 11 : obj instanceof IllOlI00O ? 12 : obj instanceof IllOlIollo ? 13 : obj instanceof IllOlO0oo ? 14 : obj instanceof IllOli ? 15 : obj instanceof IllOll1 ? 16 : obj instanceof IllOlo ? 17 : obj instanceof IllOlo0i10 ? 18 : obj instanceof IllOo0 ? 19 : obj instanceof Illi01O0 ? 20 : obj instanceof Illi11O0I ? 21 : obj instanceof Illi1lO0 ? 22 : -1) == i) {
/* 8 */                     return true;
                        }
                    }
/* 3 */             return false;
                }

                public static boolean I0000oI00(Object obj) {
/* 3 */             if (obj instanceof Map.Entry) {
                        return !(obj instanceof O0IlIoi) || (obj instanceof O0IloIo);
                    }
/* 15 */            return false;
                }

                public static void I0001Ioi1lo(String str, Object obj) {
/* 22 */            ClassCastException classCastException = new ClassCastException(IlIi0I0.I000lI(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
/* 31 */            O0000Ioio00.I000O01llI0(classCastException, OoOOI1100oI0.class.getName());
/* 89 */            throw classCastException;
                }

                public static void I000II(String str) {
/* 49 */            throw new IllegalArgumentException(IIl001iO0Io.I000oI1ioi("Unsupported type: ", str, ". ", IlIi0I0.I000lI("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
                }
            }
