            package p000;

            import android.graphics.Rect;
            import android.view.WindowInsets;
            import java.util.List;
            
/* 3 */     public final class i00i11O extends i00i11 {
                public i00i11O(i00iooo00li i00iooo00liVar, WindowInsets windowInsets) {
/* 1 */             super(i00iooo00liVar, windowInsets);
                }

                @Override
                public List<Rect> I0001Ioi1lo(int i) {
/* 1 */             return this.I0000Il00O.getBoundingRects(i00il0oII.I00000oIO(i));
                }

                @Override
                public List<Rect> I000II(int i) {
/* 1 */             return this.I0000Il00O.getBoundingRectsIgnoringVisibility(i00il0oII.I00000oIO(i));
                }

/* 4 */         public i00i11O(i00iooo00li i00iooo00liVar, i00i11O i00i11o) {
/* 5 */             super(i00iooo00liVar, i00i11o);
                }

                @Override
/* 19 */        public void I00100o1O0lo() {
                }
            }
