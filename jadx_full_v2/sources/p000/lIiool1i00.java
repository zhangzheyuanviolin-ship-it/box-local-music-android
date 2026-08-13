            package p000;

            import android.graphics.Rect;
            import android.graphics.RectF;
            
            public abstract class lIiool1i00 {
                public static final Rect I00000oIO(IooO1IOlo iooO1IOlo) {
/* 11 */            return new Rect(iooO1IOlo.I00000oIO, iooO1IOlo.I00000oOI, iooO1IOlo.I0000Il00O, iooO1IOlo.I0000O);
                }

                public static final RectF I00000oOI(OOo0IO oOo0IO) {
/* 11 */            return new RectF(oOo0IO.I00000oIO, oOo0IO.I00000oOI, oOo0IO.I0000Il00O, oOo0IO.I0000O);
                }

                public static final OOo0IO I0000Il00O(Rect rect) {
/* 15 */            return new OOo0IO(rect.left, rect.top, rect.right, rect.bottom);
                }

                public static final OOo0IO I0000O(RectF rectF) {
/* 11 */            return new OOo0IO(rectF.left, rectF.top, rectF.right, rectF.bottom);
                }
            }
