            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iO1OO0i0i {
                public static final IlO10l I00000oIO;

                static {
/* 3 */             IlO10l ilO10l = new IlO10l();
/* 6 */             VarHandle.storeStoreFence();
/* 9 */             I00000oIO = ilO10l;
                }

                public static final O0ol1iO1 I00000oIO(i00O0OOIlOO i00o0ooiloo, int i) {
/* 3 */             O0ol1iO1 o0ol1iO1 = new O0ol1iO1();
/* 6 */             o0ol1iO1.I00000oIO = i00o0ooiloo;
/* 8 */             o0ol1iO1.I00000oOI = i;
/* 10 */            VarHandle.storeStoreFence();
/* 37 */            return o0ol1iO1;
                }

                public static final OoiIOi11I I00000oOI(i00O0OOIlOO i00o0ooiloo, i00O0OOIlOO i00o0ooiloo2) {
/* 3 */             OoiIOi11I ooiIOi11I = new OoiIOi11I();
/* 6 */             ooiIOi11I.I00000oIO = i00o0ooiloo;
/* 8 */             ooiIOi11I.I00000oOI = i00o0ooiloo2;
/* 10 */            VarHandle.storeStoreFence();
/* 37 */            return ooiIOi11I;
                }
            }
