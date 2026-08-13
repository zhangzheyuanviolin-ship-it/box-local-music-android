            package p000;

            import android.content.Context;
            import android.view.ActionMode;
            import android.view.Menu;
            import android.view.MenuInflater;
            import android.view.View;
            
/* 5 */     public final class OliilliIi extends ActionMode {
                public Context I00000oIO;
                public I0I1liIO0ii I00000oOI;

                @Override
                public final void finish() {
/* 3 */             this.I00000oOI.I00000oOI();
                }

                @Override
                public final View getCustomView() {
/* 3 */             return this.I00000oOI.I0000Il00O();
                }

                @Override
                public final Menu getMenu() {
/* 11 */            return new O1l0oO1I0iO(this.I00000oIO, this.I00000oOI.I0001Ioi1lo());
                }

                @Override
                public final MenuInflater getMenuInflater() {
/* 3 */             return this.I00000oOI.I000II();
                }

                @Override
                public final CharSequence getSubtitle() {
/* 3 */             return this.I00000oOI.I000O01llI0();
                }

                @Override
                public final Object getTag() {
/* 3 */             return this.I00000oOI.I00iiO;
                }

                @Override
                public final CharSequence getTitle() {
/* 3 */             return this.I00000oOI.I000OOo1O();
                }

                @Override
                public final boolean getTitleOptionalHint() {
/* 3 */             return this.I00000oOI.I00iiI;
                }

                @Override
                public final void invalidate() {
/* 3 */             this.I00000oOI.I000OiO();
                }

                @Override
                public final boolean isTitleOptional() {
/* 3 */             return this.I00000oOI.I000iOII();
                }

                @Override
                public final void setCustomView(View view) {
/* 3 */             this.I00000oOI.I000lI(view);
                }

                @Override
                public final void setSubtitle(CharSequence charSequence) {
/* 3 */             this.I00000oOI.I000oI1ioi(charSequence);
                }

                @Override
                public final void setTag(Object obj) {
/* 3 */             this.I00000oOI.I00iiO = obj;
                }

                @Override
                public final void setTitle(CharSequence charSequence) {
/* 3 */             this.I00000oOI.I00100o1O0lo(charSequence);
                }

                @Override
                public final void setTitleOptionalHint(boolean z) {
/* 3 */             this.I00000oOI.I0010I0i(z);
                }

                @Override
/* 6 */         public final void setSubtitle(int i) {
/* 7 */             this.I00000oOI.I000o00OoI0I(i);
                }

                @Override
/* 6 */         public final void setTitle(int i) {
/* 7 */             this.I00000oOI.I00100l0(i);
                }
            }
