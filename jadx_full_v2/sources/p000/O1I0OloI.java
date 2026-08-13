            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.locks.ReentrantLock;
            import kotlin.jvm.functions.Function1;
            
/* 19 */    public class O1I0OloI {
                public static final String I0000O;
                public static final O1I00II1 I0000oI00;
                public final Ol0IlIoIIIoO I00000oIO;
                public final iolOOiI I00000oOI;
                public final String I0000Il00O;

                static {
/* 3 */             String canonicalName = O1I0OloI.class.getCanonicalName();
/* 11 */            int iI001lloI = OlOoOIi0o.I001lloI(canonicalName, ".", 0, 6);
/* 25 */            I0000O = iI001lloI == -1 ? "" : canonicalName.substring(0, iI001lloI);
/* 36 */            I0000oI00 = new O1I00II1("NO_LOCKS", iOloo0O0O.I00iio);
                }

                public O1I0OloI(String str) {
/* 5 */             ReentrantLock reentrantLock = new ReentrantLock();
/* 9 */             I0IIiO0iI i0IIiO0iI = new I0IIiO0iI(7);
/* 12 */            i0IIiO0iI.I00iiI = reentrantLock;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            this(str, i0IIiO0iI);
                }

                public static void I0000oI00(AssertionError assertionError) {
/* 1 */             StackTraceElement[] stackTrace = assertionError.getStackTrace();
/* 5 */             int length = stackTrace.length;
/* 6 */             int i = 0;
                    while (true) {
/* 7 */                 if (i >= length) {
/* 27 */                    i = -1;
                            break;
                        } else if (!stackTrace[i].getClassName().startsWith(I0000O)) {
                            break;
                        } else {
/* 24 */                    i++;
                        }
                    }
/* 32 */            List listSubList = Arrays.asList(stackTrace).subList(i, length);
/* 48 */            assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
                }

                public final O1I0II11i I00000oIO(IllOOo00lI illOOo00lI) {
/* 3 */             return new O1I0II11i(this, illOOo00lI);
                }

                public final O1I00llOi I00000oOI(Function1 function1) {
/* 13 */            return new O1I00llOi(this, new ConcurrentHashMap(3, 1.0f, 2), function1, 1);
                }

                public final I1ooIoloo0 I0000Il00O(Function1 function1) {
/* 12 */            return new I1ooIoloo0(this, new ConcurrentHashMap(3, 1.0f, 2), function1);
                }

                public IIOo1i I0000O(String str, Object obj) {
                    String str2;
/* 7 */             StringBuilder sb = new StringBuilder("Recursion detected ");
/* 10 */            sb.append(str);
/* 13 */            if (obj == null) {
/* 15 */                str2 = "";
                    } else {
/* 28 */                str2 = "on input: " + obj;
                    }
/* 32 */            sb.append(str2);
/* 37 */            sb.append(" under ");
/* 40 */            sb.append(this);
/* 47 */            AssertionError assertionError = new AssertionError(sb.toString());
/* 50 */            I0000oI00(assertionError);
/* 89 */            throw assertionError;
                }

                public final String toString() {
/* 11 */            StringBuilder sb = new StringBuilder(getClass().getSimpleName());
/* 16 */            sb.append("@");
/* 27 */            sb.append(Integer.toHexString(hashCode()));
/* 32 */            sb.append(" (");
/* 39 */            return IIl001iO0Io.I00100l0(sb, this.I0000Il00O, ")");
                }

/* 20 */        public O1I0OloI(String str, Ol0IlIoIIIoO ol0IlIoIIIoO) {
                    iolOOiI iolooii = iolOOiI.I00iio;
/* 22 */            this.I00000oIO = ol0IlIoIIIoO;
/* 23 */            this.I00000oOI = iolooii;
/* 24 */            this.I0000Il00O = str;
                }
            }
