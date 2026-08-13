            package p000;

            import android.window.OnBackInvokedDispatcher;
            import java.lang.invoke.VarHandle;
            
            public final class OIOoO1IOIo {
                public final Runnable I00000oIO;
                public final OllO00oiil I00000oOI;

                public OIOoO1IOIo(Runnable runnable) {
/* 4 */             this.I00000oIO = runnable;
/* 9 */             OIOo1iiI oIOo1iiI = new OIOo1iiI(0);
/* 12 */            oIOo1iiI.I00iiI = this;
/* 14 */            VarHandle.storeStoreFence();
/* 22 */            this.I00000oOI = new OllO00oiil(oIOo1iiI);
                }

                public final void I00000oIO(I1lo101oIi1 i1lo101oIi1, O0oiOi o0oiOi) {
/* 1 */             I01O1lIi i01O1lIiI000iOII = o0oiOi.I000iOII();
/* 11 */            if (i01O1lIiI000iOII.I00ol1() == O0oOi0I.I00iOIl) {
/* 13 */                return;
                    }
/* 24 */            OIOo01iloo oIOo01iloo = new OIOo01iloo(new OIOo1I10o(i1lo101oIi1, o0oiOi), i1lo101oIi1.I00000oOI, 0);
/* 27 */            oIOo01iloo.I000O01llI0 = i1lo101oIi1;
/* 30 */            oIOo01iloo.I000OOo1O = true;
/* 32 */            VarHandle.storeStoreFence();
/* 37 */            i1lo101oIi1.I00000oIO.add(oIOo01iloo);
/* 40 */            oIOo01iloo.I000O01llI0(false);
/* 49 */            iOliil.I000O01llI0(I00000oOI().I0000Il00O, oIOo01iloo);
/* 55 */            IiI01001l1I iiI01001l1I = new IiI01001l1I(2);
/* 58 */            iiI01001l1I.I00iiI = oIOo01iloo;
/* 60 */            iiI01001l1I.I00iiO = i01O1lIiI000iOII;
/* 62 */            VarHandle.storeStoreFence();
/* 65 */            i01O1lIiI000iOII.I00li1OI(iiI01001l1I);
/* 70 */            OIOo1l0o110 oIOo1l0o110 = new OIOo1l0o110();
/* 73 */            oIOo1l0o110.I00iOIl = i01O1lIiI000iOII;
/* 75 */            oIOo1l0o110.I00iiI = iiI01001l1I;
/* 77 */            VarHandle.storeStoreFence();
/* 82 */            i1lo101oIi1.I0000Il00O.add(oIOo1l0o110);
                }

                public final OIOo1olloli0 I00000oOI() {
/* 7 */             return (OIOo1olloli0) this.I00000oOI.getValue();
                }

                public final void I0000Il00O(OnBackInvokedDispatcher onBackInvokedDispatcher) {
/* 14 */            I00000oOI().I0000Il00O.I000iOII(new OIOo00o(onBackInvokedDispatcher, 0), 1);
/* 31 */            I00000oOI().I0000Il00O.I000iOII(new OIOo00o(onBackInvokedDispatcher, 1000000), 0);
                }
            }
