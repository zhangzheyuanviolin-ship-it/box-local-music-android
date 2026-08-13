            package p000;

            import android.view.View;
            import java.util.Objects;
            
            public final class Iii01III0 implements OIOilII0IlO {
                public Iii01o00i I00iOIl;

                @Override
                public final void I00000oOI(Object obj) {
/* 1 */             O0oiOi o0oiOi = (O0oiOi) obj;
/* 3 */             Iii01o00i iii01o00i = this.I00iOIl;
/* 5 */             if (o0oiOi == null || !iii01o00i.I011Ol0) {
/* 77 */                return;
                    }
/* 11 */            View viewI00IlilI0i0i = iii01o00i.I00IlilI0i0i();
/* 19 */            if (viewI00IlilI0i0i.getParent() != null) {
/* 45 */                I000II.I001IO000("DialogFragment can not be attached to a container view");
                    } else if (iii01o00i.I011lIilI0lo != null) {
/* 30 */                if (Ill1OlOOl.I00IOO(3)) {
/* 34 */                    Objects.toString(iii01o00i.I011lIilI0lo);
                        }
/* 39 */                iii01o00i.I011lIilI0lo.setContentView(viewI00IlilI0i0i);
                    }
                }
            }
