            package p000;

            import android.os.Bundle;
            import java.util.Arrays;
            import java.util.Map;
            
            public final class OiIoIll1i0ii implements OiIoOil {
                public I1I0i0Ilo1Oi I00000oIO;
                public boolean I00000oOI;
                public Bundle I0000Il00O;
                public OllO00oiil I0000O;

                @Override
                public final Bundle I00000oIO() {
/* 10 */            Bundle bundleI00000oIO = iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(new OIoi0IIoi[0], 0));
/* 14 */            Bundle bundle = this.I0000Il00O;
/* 16 */            if (bundle != null) {
/* 18 */                bundleI00000oIO.putAll(bundle);
                    }
/* 43 */            for (Map.Entry entry : ((OiIoO1o1i) this.I0000O.getValue()).I00000oOI.entrySet()) {
/* 55 */                String str = (String) entry.getKey();
/* 69 */                Bundle bundleI00000oIO2 = ((Iiii00iIoO) ((OiIloOOiiOii) entry.getValue()).I00000oOI.I00ilO0).I00000oIO();
/* 77 */                if (!bundleI00000oIO2.isEmpty()) {
/* 79 */                    bundleI00000oIO.putBundle(str, bundleI00000oIO2);
                        }
                    }
/* 83 */            this.I00000oOI = false;
/* 110 */           return bundleI00000oIO;
                }

                public final void I00000oOI() {
/* 3 */             if (this.I00000oOI) {
/* 55 */                return;
                    }
/* 9 */             Bundle bundleI00IO1oi11O = this.I00000oIO.I00IO1oi11O("androidx.lifecycle.internal.SavedStateHandlesProvider");
/* 22 */            Bundle bundleI00000oIO = iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(new OIoi0IIoi[0], 0));
/* 26 */            Bundle bundle = this.I0000Il00O;
/* 28 */            if (bundle != null) {
/* 30 */                bundleI00000oIO.putAll(bundle);
                    }
/* 33 */            if (bundleI00IO1oi11O != null) {
/* 35 */                bundleI00000oIO.putAll(bundleI00IO1oi11O);
                    }
/* 38 */            this.I0000Il00O = bundleI00000oIO;
/* 41 */            this.I00000oOI = true;
                }
            }
