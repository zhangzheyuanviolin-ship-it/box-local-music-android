            package p000;

            import android.os.Bundle;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.LinkedHashMap;
            
            public abstract class OiIoII10il0 {
                public static final Iioi0lilII I00000oIO;
                public static final Io1Oioii1111 I00000oOI;
                public static final O1oO0lOoI1 I0000Il00O;

                static {
/* 3 */             int i = 15;
/* 8 */             I00000oIO = new Iioi0lilII(i);
/* 15 */            I00000oOI = new Io1Oioii1111(i);
/* 22 */            I0000Il00O = new O1oO0lOoI1(i);
                }

                public static final OiIloOOiiOii I00000oIO(Ii0OO1I1iOo ii0OO1I1iOo) {
/* 7 */             OiIoOoIi01 oiIoOoIi01 = (OiIoOoIi01) ii0OO1I1iOo.I00000oIO(I00000oIO);
/* 9 */             Bundle bundle = null;
/* 10 */            if (oiIoOoIi01 == null) {
/* 149 */               I000II.I000iOII("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
/* 9 */                 return null;
                    }
/* 18 */            Oool1Ii0I oool1Ii0I = (Oool1Ii0I) ii0OO1I1iOo.I00000oIO(I00000oOI);
/* 20 */            if (oool1Ii0I == null) {
/* 143 */               I000II.I000iOII("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
/* 9 */                 return null;
                    }
/* 28 */            Bundle bundle2 = (Bundle) ii0OO1I1iOo.I00000oIO(I0000Il00O);
/* 36 */            String str = (String) ii0OO1I1iOo.I00000oIO(Oool0iOoooIo.I00000oOI);
/* 38 */            if (str == null) {
/* 137 */               I000II.I000iOII("CreationExtras must have a value by `VIEW_MODEL_KEY`");
/* 9 */                 return null;
                    }
/* 46 */            OiIoOil oiIoOilI00O10llo = oiIoOoIi01.I000O01llI0().I00O10llo("androidx.lifecycle.internal.SavedStateHandlesProvider");
/* 57 */            OiIoIll1i0ii oiIoIll1i0ii = oiIoOilI00O10llo instanceof OiIoIll1i0ii ? (OiIoIll1i0ii) oiIoOilI00O10llo : null;
/* 58 */            if (oiIoIll1i0ii == null) {
/* 131 */               I000II.I001IO000("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
/* 9 */                 return null;
                    }
/* 64 */            LinkedHashMap linkedHashMap = I0000Il00O(oool1Ii0I).I00000oOI;
/* 70 */            OiIloOOiiOii oiIloOOiiOii = (OiIloOOiiOii) linkedHashMap.get(str);
/* 72 */            if (oiIloOOiiOii != null) {
/* 128 */               return oiIloOOiiOii;
                    }
/* 74 */            oiIoIll1i0ii.I00000oOI();
/* 77 */            Bundle bundle3 = oiIoIll1i0ii.I0000Il00O;
/* 79 */            if (bundle3 != null && bundle3.containsKey(str)) {
/* 89 */                Bundle bundle4 = bundle3.getBundle(str);
/* 93 */                if (bundle4 == null) {
/* 104 */                   bundle4 = iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(new OIoi0IIoi[0], 0));
                        }
/* 108 */               bundle3.remove(str);
/* 115 */               if (bundle3.isEmpty()) {
/* 117 */                   oiIoIll1i0ii.I0000Il00O = null;
                        }
/* 119 */               bundle = bundle4;
                    }
/* 120 */           OiIloOOiiOii oiIloOOiiOiiI00000oIO = lO0i0I.I00000oIO(bundle, bundle2);
/* 124 */           linkedHashMap.put(str, oiIloOOiiOiiI00000oIO);
/* 127 */           return oiIloOOiiOiiI00000oIO;
                }

                public static final void I00000oOI(OiIoOoIi01 oiIoOoIi01) {
/* 5 */             O0oOi0I o0oOi0II00ol1 = oiIoOoIi01.I000iOII().I00ol1();
/* 11 */            if (o0oOi0II00ol1 != O0oOi0I.I00iiI && o0oOi0II00ol1 != O0oOi0I.I00iiO) {
/* 24 */                OIiilo1Ool0o.I000OiO("Failed to enable `SavedStateHandle` for `", oiIoOoIi01, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", o0oOi0II00ol1, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
/* 27 */                return;
                    }
/* 38 */            if (oiIoOoIi01.I000O01llI0().I00O10llo("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
/* 42 */                I1I0i0Ilo1Oi i1I0i0Ilo1OiI000O01llI0 = oiIoOoIi01.I000O01llI0();
/* 49 */                OiIoIll1i0ii oiIoIll1i0ii = new OiIoIll1i0ii();
/* 52 */                oiIoIll1i0ii.I00000oIO = i1I0i0Ilo1OiI000O01llI0;
/* 58 */                OIOo1iiI oIOo1iiI = new OIOo1iiI(20);
/* 61 */                oIOo1iiI.I00iiI = (Oool1Ii0I) oiIoOoIi01;
/* 63 */                VarHandle.storeStoreFence();
/* 71 */                oiIoIll1i0ii.I0000O = new OllO00oiil(oIOo1iiI);
/* 73 */                VarHandle.storeStoreFence();
/* 80 */                oiIoOoIi01.I000O01llI0().I00Ol00("androidx.lifecycle.internal.SavedStateHandlesProvider", oiIoIll1i0ii);
/* 83 */                I01O1lIi i01O1lIiI000iOII = oiIoOoIi01.I000iOII();
/* 90 */                OOo01Ilo oOo01Ilo = new OOo01Ilo(4);
/* 93 */                oOo01Ilo.I00iiI = oiIoIll1i0ii;
/* 95 */                VarHandle.storeStoreFence();
/* 98 */                i01O1lIiI000iOII.I00li1OI(oOo01Ilo);
                    }
                }

                public static final OiIoO1o1i I0000Il00O(Oool1Ii0I oool1Ii0I) {
/* 16 */            Oool0iOoooIo oool0iOoooIo = new Oool0iOoooIo(oool1Ii0I.I000II(), new OiIoI1II1(), li1iolIo.I00000oIO(oool1Ii0I));
/* 35 */            return (OiIoO1o1i) oool0iOoooIo.I00000oIO.I001i1O0Ol(OOoOl0i.I00000oIO.I00000oOI(OiIoO1o1i.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
                }
            }
