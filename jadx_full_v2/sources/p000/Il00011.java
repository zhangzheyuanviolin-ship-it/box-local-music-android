            package p000;

            import android.graphics.Rect;
            import android.text.method.TransformationMethod;
            import android.view.View;
            
            public final class Il00011 implements TransformationMethod {
                public TransformationMethod I00iOIl;

                @Override
                public final CharSequence getTransformation(CharSequence charSequence, View view) {
/* 5 */             if (view.isInEditMode()) {
/* 7 */                 return charSequence;
                    }
/* 8 */             TransformationMethod transformationMethod = this.I00iOIl;
/* 10 */            if (transformationMethod != null) {
/* 12 */                charSequence = transformationMethod.getTransformation(charSequence, view);
                    }
/* 16 */            if (charSequence == null || IiollO1llli.I00000oIO().I0000Il00O() != 1) {
/* 106 */               return charSequence;
                    }
/* 30 */            IiollO1llli iiollO1llliI00000oIO = IiollO1llli.I00000oIO();
/* 34 */            iiollO1llliI00000oIO.getClass();
/* 42 */            return iiollO1llliI00000oIO.I000II(0, charSequence.length(), 0, charSequence);
                }

                @Override
                public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
/* 1 */             TransformationMethod transformationMethod = this.I00iOIl;
/* 3 */             if (transformationMethod != null) {
/* 5 */                 transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
                    }
                }
            }
