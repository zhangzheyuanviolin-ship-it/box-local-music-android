            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import kotlin.jvm.functions.Function1;
            
            public abstract class il00O1lo1oOi {
                public static final IOO000ilo I00000oIO(IllOOo00lI illOOo00lI, String str, Function1 function1) {
                    O0O01O0o o0O01O0oI00000oOI;
/* 4 */             IOO000ilo iOO000ilo = new IOO000ilo(0);
/* 7 */             iOO000ilo.I00iiI = illOOo00lI;
/* 9 */             iOO000ilo.I00iiO = function1;
/* 11 */            OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 15 */            O0IOli0o0 o0IOli0o0I00000oOI = oOoOl1001II.I00000oOI(IOO00I0Ol11.class);
                    try {
/* 19 */                O0O0o1io o0O0o1io = O0O0o1io.I0000Il00O;
/* 23 */                O0IOli0o0 o0IOli0o0I00000oOI2 = oOoOl1001II.I00000oOI(IOO000ilo.class);
/* 27 */                O0O10O o0o10o = O0O10O.I00iOIl;
/* 29 */                O0O0OIOO o0o0oiooI000o00OoI0I = oOoOl1001II.I000o00OoI0I(o0IOli0o0I00000oOI2);
/* 43 */                oOoOl1001II.I000l1(o0o0oiooI000o00OoI0I, Collections.singletonList(OOoOl0i.I00000oIO(Object.class)));
/* 56 */                o0O01O0oI00000oOI = OOoOl0i.I00000oOI(IOO00I0Ol11.class, l0iOII0lllIo.I00000oIO(oOoOl1001II.I000lI(o0o0oiooI000o00OoI0I, Collections.EMPTY_LIST, false)));
                    } catch (Throwable unused) {
/* 61 */                o0O01O0oI00000oOI = null;
                    }
/* 72 */            iOO000ilo.I00iio = new I1OoollI1Il1(str, new OoOO010(o0IOli0o0I00000oOI, o0O01O0oI00000oOI));
/* 74 */            VarHandle.storeStoreFence();
/* 215 */           return iOO000ilo;
                }
            }
