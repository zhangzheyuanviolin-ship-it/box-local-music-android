            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public final class OIOi01I extends OoO00O1IiOl {
                public static final OIOi011lO I00000oOI;
                public int I00000oIO;

                static {
/* 3 */             OIOi01I oIOi01I = new OIOi01I();
/* 7 */             oIOi01I.I00000oIO = 2;
/* 9 */             VarHandle.storeStoreFence();
/* 15 */            OIOi011lO oIOi011lO = new OIOi011lO(0);
/* 18 */            oIOi011lO.I00iiI = oIOi01I;
/* 20 */            VarHandle.storeStoreFence();
/* 23 */            I00000oOI = oIOi011lO;
                }

                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
/* 1 */             int iPeek = o01loll1loll.peek();
/* 5 */             int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(iPeek);
/* 10 */            if (iI001lIiIIo1O == 5 || iI001lIiIIo1O == 6) {
/* 63 */                return Oi010OO0.I00000oOI(this.I00000oIO, o01loll1loll);
                    }
/* 17 */            if (iI001lIiIIo1O == 8) {
/* 19 */                o01loll1loll.I00ioIO();
/* 22 */                return null;
                    }
/* 60 */            throw new O01Oo001("Expecting number, got: " + IlIi0I0.I001IO000(iPeek) + "; at path " + o01loll1loll.I001l0I00(false));
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
/* 3 */             o01ooi1IIiiO.I00OOll1((Number) obj);
                }
            }
