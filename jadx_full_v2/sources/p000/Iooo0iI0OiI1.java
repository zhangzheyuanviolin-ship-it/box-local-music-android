            package p000;

            import java.lang.reflect.Member;
            import java.lang.reflect.Method;
            import java.lang.reflect.Type;
            import java.util.List;
            
            public abstract class Iooo0iI0OiI1 implements IIiOlII {
                public final Method I00000oIO;
                public final List I00000oOI;
                public final Class I0000Il00O;

                public Iooo0iI0OiI1(Method method, List list) {
/* 4 */             this.I00000oIO = method;
/* 6 */             this.I00000oOI = list;
/* 12 */            this.I0000Il00O = method.getReturnType();
                }

                @Override
                public final List I00000oIO() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final Member I00000oOI() {
/* 1 */             return null;
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return false;
                }

                public final void I0000oI00(Object[] objArr) {
/* 6 */             if (iOil0li.I00000oIO(this) == objArr.length) {
/* 8 */                 return;
                    }
/* 13 */            StringBuilder sb = new StringBuilder("Callable expects ");
/* 20 */            sb.append(iOil0li.I00000oIO(this));
/* 25 */            sb.append(" arguments, but ");
/* 35 */            I000II.I000iOII(IIl001iO0Io.I000lI(objArr.length, " were provided.", sb));
                }

                @Override
                public final Type I0001Ioi1lo() {
/* 1 */             return this.I0000Il00O;
                }
            }
