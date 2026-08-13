            package androidx.appcompat.view.menu;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.view.View;
            import android.widget.AdapterView;
            import android.widget.ListView;
            import p000.O1ilOO;
            import p000.O1illlIiilIl;
            import p000.O1ioIIl;
            import p000.O1l0lOll00;
            import p000.OlilOlOiI;
            
            public final class ExpandedMenuView extends ListView implements O1ilOO, O1l0lOll00, AdapterView.OnItemClickListener {
                public static final int[] I00iiI = {R.attr.background, R.attr.divider};
                public O1illlIiilIl I00iOIl;

                public ExpandedMenuView(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 4 */             setOnItemClickListener(this);
/* 12 */            OlilOlOiI olilOlOiII0010I0i = OlilOlOiI.I0010I0i(context, attributeSet, I00iiI, R.attr.listViewStyle);
/* 18 */            TypedArray typedArray = (TypedArray) olilOlOiII0010I0i.I00iiO;
/* 25 */            if (typedArray.hasValue(0)) {
/* 31 */                setBackgroundDrawable(olilOlOiII0010I0i.I000iOII(0));
                    }
/* 39 */            if (typedArray.hasValue(1)) {
/* 45 */                setDivider(olilOlOiII0010I0i.I000iOII(1));
                    }
/* 48 */            olilOlOiII0010I0i.I0010o();
                }

                @Override
                public final boolean I00000oIO(O1ioIIl o1ioIIl) {
/* 5 */             return this.I00iOIl.I00100o1O0lo(o1ioIIl, null, 0);
                }

                @Override
                public final void I00000oOI(O1illlIiilIl o1illlIiilIl) {
/* 1 */             this.I00iOIl = o1illlIiilIl;
                }

                public int getWindowAnimations() {
/* 1 */             return 0;
                }

                @Override
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 5 */             setChildrenDrawingCacheEnabled(false);
                }

                @Override
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
/* 11 */            I00000oIO((O1ioIIl) getAdapter().getItem(i));
                }
            }
