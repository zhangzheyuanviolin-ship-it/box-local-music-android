            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class Io0IooIoI10 implements Function1 {
                public final int I00iOIl;
                public Function1 I00iiI;

                public Io0IooIoI10(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    long j;
                    switch (this.I00iOIl) {
                        case 0:
/* 40 */                    Ol1l0OoOo ol1l0OoOo = (Ol1l0OoOo) obj;
                            synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 45 */                        j = Ol1l1lI1Ili.I0000oI00;
/* 50 */                        Ol1l1lI1Ili.I0000oI00 = 1 + j;
                            }
/* 53 */                    Function1 function1 = this.I00iiI;
/* 57 */                    OOli00i0ooIi oOli00i0ooIi = new OOli00i0ooIi(j, ol1l0OoOo);
/* 60 */                    oOli00i0ooIi.I0000oI00 = function1;
/* 63 */                    oOli00i0ooIi.I0001Ioi1lo = 1;
/* 65 */                    VarHandle.storeStoreFence();
/* 68 */                    return oOli00i0ooIi;
                        case 1:
/* 35 */                    return this.I00iiI.invoke((O0iIl1) obj).toString();
                        default:
/* 22 */                    return this.I00iiI.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
                    }
                }
            }
