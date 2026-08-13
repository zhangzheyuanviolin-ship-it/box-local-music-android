            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1lo10iOI {
                public final iOliil I00000oIO;
                public final OIOoO1IOIo I00000oOI;

                /* JADX WARN: Multi-variable type inference failed */
                public I1lo10iOI(iOliil ioliil, OIOoO1IOIo oIOoO1IOIo) {
/* 4 */             this.I00000oIO = ioliil;
/* 6 */             this.I00000oOI = oIOoO1IOIo;
/* 11 */            if ((ioliil == null ? oIOoO1IOIo : ioliil) != null) {
/* 13 */                return;
                    }
/* 16 */            I000II.I000iOII("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
/* 37 */            throw null;
                }

                public final void I00000oIO(I01loIooI i01loIooI) {
/* 1 */             iOliil ioliil = this.I00000oIO;
/* 3 */             if (ioliil != null) {
/* 9 */                 iOliil.I000O01llI0(ioliil, (I1lo0oO1O) i01loIooI.I00000oOI);
/* 12 */                return;
                    }
/* 13 */            OIOoO1IOIo oIOoO1IOIo = this.I00000oOI;
/* 15 */            if (oIOoO1IOIo == null) {
/* 60 */                I000II.I001IO000("Unreachable");
/* 77 */                return;
                    }
/* 19 */            I1lo101oIi1 i1lo101oIi1 = (I1lo101oIi1) i01loIooI.I00000oIO;
/* 32 */            OIOo01iloo oIOo01iloo = new OIOo01iloo(new OIOo1I10o(i1lo101oIi1, null), i1lo101oIi1.I00000oOI, 0);
/* 35 */            oIOo01iloo.I000O01llI0 = i1lo101oIi1;
/* 38 */            oIOo01iloo.I000OOo1O = true;
/* 40 */            VarHandle.storeStoreFence();
/* 45 */            i1lo101oIi1.I00000oIO.add(oIOo01iloo);
/* 54 */            iOliil.I000O01llI0(oIOoO1IOIo.I00000oOI().I0000Il00O, oIOo01iloo);
                }

                public final void I00000oOI(I01loIooI i01loIooI) throws Exception {
/* 3 */             if (this.I00000oIO != null) {
/* 9 */                 ((I1lo0oO1O) i01loIooI.I00000oOI).I0001Ioi1lo();
                    } else if (this.I00000oOI != null) {
/* 21 */                ((I1lo101oIi1) i01loIooI.I00000oIO).I0000O();
                    } else {
/* 27 */                I000II.I001IO000("Unreachable");
                    }
                }
            }
