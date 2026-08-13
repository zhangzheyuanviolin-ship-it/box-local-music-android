            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class II1oo0l11IOI {
                public boolean I00000oIO;
                public boolean I00000oOI = true;
                public boolean I0000Il00O = false;
                public Object I0000O;
                public Object I0000oI00;
                public Object I0001Ioi1lo;
                public Object I000II;
                public Object I000O01llI0;

                public II1oo0l11IOI(OloOO10o oloOO10o, IIOOoI iIOOoI, IIOOoI iIOOoI2, II1oo0l11IOI iI1oo0l11IOI, IiIoiiOoIi iiIoiiOoIi, boolean z) {
/* 10 */            this.I0000O = oloOO10o;
/* 12 */            this.I0000oI00 = iIOOoI;
/* 14 */            this.I0001Ioi1lo = iIOOoI2;
/* 16 */            this.I00000oIO = z;
/* 18 */            this.I000II = iI1oo0l11IOI;
/* 20 */            this.I000O01llI0 = iiIoiiOoIi;
                }

                public void I00000oIO() {
/* 3 */             OiIoOoIi01 oiIoOoIi01 = (OiIoOoIi01) this.I0000O;
/* 15 */            if (oiIoOoIi01.I000iOII().I00ol1() != O0oOi0I.I00iiI) {
/* 58 */                I000II.I001IO000("Restarter must be created only during owner's initialization stage");
/* 110 */               return;
                    }
/* 19 */            if (this.I00000oIO) {
/* 52 */                I000II.I001IO000("SavedStateRegistry was already attached.");
/* 55 */                return;
                    }
/* 25 */            ((OIOo1iiI) this.I0000oI00).invoke();
/* 28 */            I01O1lIi i01O1lIiI000iOII = oiIoOoIi01.I000iOII();
/* 35 */            I01oi1lO0O1o i01oi1lO0O1o = new I01oi1lO0O1o(4);
/* 38 */            i01oi1lO0O1o.I00iiI = this;
/* 40 */            VarHandle.storeStoreFence();
/* 43 */            i01O1lIiI000iOII.I00li1OI(i01oi1lO0O1o);
/* 47 */            this.I00000oIO = true;
                }
            }
