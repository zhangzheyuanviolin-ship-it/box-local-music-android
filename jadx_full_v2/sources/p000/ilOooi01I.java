            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import kotlin.jvm.functions.Function1;
            
            public abstract class ilOooi01I {
                public static final IlOooIIilo I00000oIO(Oi1oIiOiIi0 oi1oIiOiIi0, boolean z, String[] strArr, Function1 function1) {
/* 1 */             O00IOI11 o00ioi11I0001Ioi1lo = oi1oIiOiIi0.I0001Ioi1lo();
/* 10 */            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
/* 12 */            OoIlIoo1oiOo ooIlIoo1oiOo = o00ioi11I0001Ioi1lo.I00000oOI;
/* 14 */            OIoi0IIoi oIoi0IIoiI00100l0 = ooIlIoo1oiOo.I00100l0(strArr2);
/* 41 */            IlOil1ii ilOil1iiI00000oIO = ilOlOoO1lO.I00000oIO(ilOl0O00Il0i.I00000oOI(new O1o1iI(ooIlIoo1oiOo, (int[]) oIoi0IIoiI00100l0.I00iiI, (String[]) oIoi0IIoiI00100l0.I00iOIl, (IOoil1iiIilo) null, 19)), -1);
/* 47 */            IlOooIIilo ilOooIIilo = new IlOooIIilo();
/* 50 */            ilOooIIilo.I00iOIl = ilOil1iiI00000oIO;
/* 52 */            ilOooIIilo.I00iiI = oi1oIiOiIi0;
/* 54 */            ilOooIIilo.I00iiO = z;
/* 56 */            ilOooIIilo.I00iio = function1;
/* 58 */            VarHandle.storeStoreFence();
/* 204 */           return ilOooIIilo;
                }
            }
