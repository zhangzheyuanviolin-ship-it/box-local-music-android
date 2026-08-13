            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import android.view.animation.Animation;
            import java.lang.invoke.VarHandle;
            import java.util.Objects;
            
/* 27 */    public final class IiI1IIIlo1O0 implements Animation.AnimationListener {
                public OlIIlIO1O I00000oIO;
                public ViewGroup I00000oOI;
                public View I0000Il00O;
                public IiI1Iii I0000O;

                @Override
                public final void onAnimationEnd(Animation animation) {
/* 1 */             ViewGroup viewGroup = this.I00000oOI;
/* 6 */             I0lil01 i0lil01 = new I0lil01(3);
/* 9 */             i0lil01.I00iiI = this;
/* 11 */            VarHandle.storeStoreFence();
/* 14 */            viewGroup.post(i0lil01);
/* 22 */            if (Ill1OlOOl.I00IOO(2)) {
/* 26 */                Objects.toString(this.I00000oIO);
                    }
                }

                @Override
                public final void onAnimationStart(Animation animation) {
/* 6 */             if (Ill1OlOOl.I00IOO(2)) {
/* 10 */                Objects.toString(this.I00000oIO);
                    }
                }

                @Override
/* 28 */        public final void onAnimationRepeat(Animation animation) {
                }
            }
