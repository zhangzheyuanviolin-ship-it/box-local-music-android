            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class IlII00i10OII {
                public final int I00000oIO;
                public Object I00000oOI;
                public OooO0Io1i I0000Il00O;
                public Object I0000O;

                public IlII00i10OII(int i) {
/* 1 */             this.I00000oIO = i;
                }

                public final IlII00i10OII I00000oIO(String str, Function1 function1) {
                    switch (this.I00000oIO) {
                        case 0:
/* 85 */                    return this;
                        default:
/* 6 */                     Object obj = this.I00000oOI;
/* 18 */                    if (((Boolean) function1.invoke(obj)).booleanValue()) {
/* 85 */                        return this;
                            }
/* 23 */                    OooO0Io1i oooO0Io1i = this.I0000Il00O;
/* 26 */                    IlII00i10OII ilII00i10OII = new IlII00i10OII(0);
/* 29 */                    ilII00i10OII.I00000oOI = obj;
/* 31 */                    ilII00i10OII.I0000Il00O = oooO0Io1i;
/* 54 */                    I1o1lOlooI1 i1o1lOlooI1 = new I1o1lOlooI1(str + " value: " + obj, 10);
/* 76 */                    i1o1lOlooI1.setStackTrace((StackTraceElement[]) I1IoiO1l.I0010I0i(2, i1o1lOlooI1.getStackTrace()).toArray(new StackTraceElement[0]));
/* 79 */                    ilII00i10OII.I0000O = i1o1lOlooI1;
/* 81 */                    VarHandle.storeStoreFence();
/* 84 */                    return ilII00i10OII;
                    }
                }
            }
