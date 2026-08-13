            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import android.view.View;
            import android.view.ViewGroup;
            import java.util.Objects;
            
            public final class IiI1I1II extends AnimatorListenerAdapter {
                public final ViewGroup I00000oIO;
                public final View I00000oOI;
                public final boolean I0000Il00O;
                public final OlIIlIO1O I0000O;
                public final IiI1Iii I0000oI00;

                public IiI1I1II(ViewGroup viewGroup, View view, boolean z, OlIIlIO1O olIIlIO1O, IiI1Iii iiI1Iii) {
/* 1 */             this.I00000oIO = viewGroup;
/* 3 */             this.I00000oOI = view;
/* 5 */             this.I0000Il00O = z;
/* 7 */             this.I0000O = olIIlIO1O;
/* 9 */             this.I0000oI00 = iiI1Iii;
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
/* 1 */             ViewGroup viewGroup = this.I00000oIO;
/* 3 */             View view = this.I00000oOI;
/* 5 */             viewGroup.endViewTransition(view);
/* 8 */             boolean z = this.I0000Il00O;
/* 10 */            OlIIlIO1O olIIlIO1O = this.I0000O;
/* 12 */            if (z) {
/* 16 */                Oi010OO0.I00000oIO(view, olIIlIO1O.I00000oIO);
                    }
/* 21 */            this.I0000oI00.I0001Ioi1lo();
/* 29 */            if (Ill1OlOOl.I00IOO(2)) {
/* 31 */                Objects.toString(olIIlIO1O);
                    }
                }
            }
