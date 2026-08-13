            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iO0100loIol {
                public static final O1ooiI111i I00000oIO(O1ooiI111i o1ooiI111i, Function1 function1) {
/* 3 */             OIOlilo000 oIOlilo000 = new OIOlilo000();
/* 6 */             oIOlilo000.I00000oIO = function1;
/* 9 */             oIOlilo000.I00000oOI = true;
/* 11 */            VarHandle.storeStoreFence();
/* 14 */            return o1ooiI111i.I0000O(oIOlilo000);
                }

                public static final O1ooiI111i I00000oOI(O1ooiI111i o1ooiI111i, float f, float f2) {
/* 3 */             OIOlIoIo1lo oIOlIoIo1lo = new OIOlIoIo1lo();
/* 6 */             oIOlIoIo1lo.I00000oIO = f;
/* 8 */             oIOlIoIo1lo.I00000oOI = f2;
/* 11 */            oIOlIoIo1lo.I0000Il00O = true;
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            return o1ooiI111i.I0000O(oIOlIoIo1lo);
                }

                public static O1ooiI111i I0000Il00O(O1ooiI111i o1ooiI111i, float f, float f2, int i) {
/* 4 */             if ((i & 1) != 0) {
/* 6 */                 f = 0.0f;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                f2 = 0.0f;
                    }
/* 12 */            return I00000oOI(o1ooiI111i, f, f2);
                }
            }
