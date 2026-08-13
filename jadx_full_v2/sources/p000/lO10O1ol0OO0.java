            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class lO10O1ol0OO0 {
                public static final IiI11iIOlOo1 I00000oIO(Function1 function1) {
/* 3 */             IiI11iIOlOo1 iiI11iIOlOo1 = new IiI11iIOlOo1();
/* 6 */             iiI11iIOlOo1.I00000oIO = function1;
/* 10 */            IiI11O11oO iiI11O11oO = new IiI11O11oO();
/* 13 */            iiI11O11oO.I00000oIO = iiI11iIOlOo1;
/* 15 */            VarHandle.storeStoreFence();
/* 18 */            iiI11iIOlOo1.I00000oOI = iiI11O11oO;
/* 25 */            iiI11iIOlOo1.I0000Il00O = new OI11IlOoi();
/* 27 */            Boolean bool = Boolean.FALSE;
/* 33 */            iiI11iIOlOo1.I0000O = lOO00IiI0li.I00000oIO(bool);
/* 39 */            iiI11iIOlOo1.I0000oI00 = lOO00IiI0li.I00000oIO(bool);
/* 45 */            iiI11iIOlOo1.I0001Ioi1lo = lOO00IiI0li.I00000oIO(bool);
/* 47 */            VarHandle.storeStoreFence();
/* 77 */            return iiI11iIOlOo1;
                }
            }
