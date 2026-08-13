            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import android.view.animation.AnimationSet;
            import android.view.animation.Transformation;
            
/* 24 */    public final class Ill0oi0I extends AnimationSet implements Runnable {
                public ViewGroup I00iOIl;
                public View I00iiI;
                public boolean I00iiO;
                public boolean I00iio;
                public boolean I00ilI0I1;

                @Override
                public final boolean getTransformation(long j, Transformation transformation) {
/* 2 */             this.I00ilI0I1 = true;
/* 6 */             if (this.I00iiO) {
/* 10 */                return !this.I00iio;
                    }
/* 16 */            if (!super.getTransformation(j, transformation)) {
/* 18 */                this.I00iiO = true;
/* 22 */                OIi0Ol01.I00000oIO(this.I00iOIl, this);
                    }
/* 1 */             return true;
                }

                @Override
                public final void run() {
/* 1 */             ViewGroup viewGroup = this.I00iOIl;
/* 5 */             if (this.I00iiO || !this.I00ilI0I1) {
/* 20 */                viewGroup.endViewTransition(this.I00iiI);
/* 24 */                this.I00iio = true;
                    } else {
/* 12 */                this.I00ilI0I1 = false;
/* 14 */                viewGroup.post(this);
                    }
                }

                @Override
/* 25 */        public final boolean getTransformation(long j, Transformation transformation, float f) {
/* 26 */            this.I00ilI0I1 = true;
/* 27 */            if (this.I00iiO) {
/* 28 */                return !this.I00iio;
                    }
/* 29 */            if (!super.getTransformation(j, transformation, f)) {
/* 30 */                this.I00iiO = true;
/* 31 */                OIi0Ol01.I00000oIO(this.I00iOIl, this);
                    }
                    return true;
                }
            }
