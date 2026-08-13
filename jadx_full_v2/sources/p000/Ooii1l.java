            package p000;

            import android.graphics.Rect;
            import android.graphics.drawable.RippleDrawable;
            
            public final class Ooii1l extends RippleDrawable {
                public boolean I00iOIl;
                public IOOiio0i I00iiI;
                public boolean I00iiO;

                @Override
                public final Rect getDirtyBounds() {
/* 3 */             if (!this.I00iOIl) {
/* 6 */                 this.I00iiO = true;
                    }
/* 8 */             Rect dirtyBounds = super.getDirtyBounds();
/* 13 */            this.I00iiO = false;
/* 20 */            return dirtyBounds;
                }

                @Override
                public final boolean isProjected() {
/* 1 */             return this.I00iiO;
                }
            }
