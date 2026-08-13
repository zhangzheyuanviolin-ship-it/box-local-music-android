            package p000;

            import android.content.Context;
            import android.os.Bundle;
            import java.lang.invoke.VarHandle;
            
            public final class OI1Oo1O {
                public o00io0IiOOo0 I00000oIO;

                public OI1Oo1O(Bundle bundle) {
/* 10 */            bundle.setClassLoader(OI1Oo1O.class.getClassLoader());
/* 16 */            o00io0IiOOo0 o00io0iiooo0 = new o00io0IiOOo0(3);
/* 21 */            String string = bundle.getString("nav-entry-state:id");
/* 26 */            if (string == null) {
/* 72 */                lO0iIII0.I00000oIO("nav-entry-state:id");
/* 77 */                throw null;
                    }
/* 28 */            o00io0iiooo0.I00iiO = string;
/* 36 */            o00io0iiooo0.I00iiI = lO0i1o0ii.I00000oIO("nav-entry-state:destination-id", bundle);
/* 40 */            Bundle bundle2 = bundle.getBundle("nav-entry-state:args");
/* 44 */            if (bundle2 == null) {
/* 68 */                lO0iIII0.I00000oIO("nav-entry-state:args");
/* 71 */                throw null;
                    }
/* 46 */            o00io0iiooo0.I00iio = bundle2;
/* 50 */            Bundle bundle3 = bundle.getBundle("nav-entry-state:saved-state");
/* 54 */            if (bundle3 == null) {
/* 64 */                lO0iIII0.I00000oIO("nav-entry-state:saved-state");
/* 67 */                throw null;
                    }
/* 56 */            o00io0iiooo0.I00ilI0I1 = bundle3;
/* 58 */            VarHandle.storeStoreFence();
/* 61 */            this.I00000oIO = o00io0iiooo0;
                }

                public final OI1OloOIO1O I00000oIO(I1O0ol i1O0ol, OI1ilOI1ioo0 oI1ilOI1ioo0, O0oOi0I o0oOi0I, OI1i0o1Ilo oI1i0o1Ilo) {
                    Bundle bundle;
/* 1 */             o00io0IiOOo0 o00io0iiooo0 = this.I00000oIO;
/* 5 */             Bundle bundle2 = (Bundle) o00io0iiooo0.I00iio;
/* 8 */             if (bundle2 != null) {
/* 10 */                Context context = i1O0ol.I00000oIO;
/* 18 */                bundle2.setClassLoader(context != null ? context.getClassLoader() : null);
/* 21 */                bundle = bundle2;
                    } else {
/* 23 */                bundle = null;
                    }
/* 40 */            return new OI1OloOIO1O(i1O0ol, oI1ilOI1ioo0, bundle, o0oOi0I, oI1i0o1Ilo, (String) o00io0iiooo0.I00iiO, (Bundle) o00io0iiooo0.I00ilI0I1);
                }
            }
