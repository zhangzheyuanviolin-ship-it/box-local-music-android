            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Collections;
            import kotlin.jvm.functions.Function1;
            
            public final class O0I0IOo implements IOIOIoI {
                public static final OI1Iio0ii1 I000II;
                public static final IOIOill I000O01llI0;
                public final OI0011 I00000oIO;
                public final Function1 I00000oOI;
                public final O1I0II11i I0000Il00O;
                public static final O0O00I1Ili[] I0000oI00 = {OOoOl0i.I00000oIO.I000O01llI0(new OOOOIO0i(O0I0IOo.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};
                public static final o0iOli I0000O = new o0iOli(12);
                public static final Ill0IO I0001Ioi1lo = OlIlllOI1.I000l1;

                static {
/* 39 */            Ill0OI0lo ill0OI0lo = OlIllOO11lOl.I0000Il00O;
/* 45 */            I000II = ill0OI0lo.I000II();
/* 47 */            Ill0IO ill0IOI000OOo1O = ill0OI0lo.I000OOo1O();
/* 66 */            I000O01llI0 = new IOIOill(ill0IOI000OOo1O.I00000oOI(), ill0IOI000OOo1O.I00000oIO.I000II());
                }

                public O0I0IOo(O1I0OloI o1I0OloI, OI0011 oi0011) {
/* 1 */             IiOi0I1 iiOi0I1 = IiOi0I1.I00li1OI;
/* 6 */             this.I00000oIO = oi0011;
/* 8 */             this.I00000oOI = iiOi0I1;
/* 14 */            I01illiil1Oo i01illiil1Oo = new I01illiil1Oo(16);
/* 17 */            i01illiil1Oo.I00iiI = this;
/* 19 */            i01illiil1Oo.I00iiO = o1I0OloI;
/* 21 */            VarHandle.storeStoreFence();
/* 29 */            this.I0000Il00O = new O1I0II11i(o1I0OloI, i01illiil1Oo);
                }

                @Override
                public final OI000ilOol I00000oIO(IOIOill iOIOill) {
/* 7 */             if (!iOIOill.equals(I000O01llI0)) {
/* 23 */                return null;
                    }
/* 12 */            O0O00I1Ili o0O00I1Ili = I0000oI00[0];
/* 20 */            return (IOIOO0IO) this.I0000Il00O.invoke();
                }

                @Override
                public final Collection I00000oOI(Ill0IO ill0IO) {
/* 7 */             if (!ill0IO.equals(I0001Ioi1lo)) {
/* 29 */                return Il01llIol0.I00iOIl;
                    }
/* 12 */            O0O00I1Ili o0O00I1Ili = I0000oI00[0];
/* 22 */            return Collections.singleton((IOIOO0IO) this.I0000Il00O.invoke());
                }

                @Override
                public final boolean I0000Il00O(Ill0IO ill0IO, OI1Iio0ii1 oI1Iio0ii1) {
                    return oI1Iio0ii1.equals(I000II) && ill0IO.equals(I0001Ioi1lo);
                }
            }
