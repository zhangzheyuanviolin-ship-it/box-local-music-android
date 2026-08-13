            package p000;

            import android.content.Context;
            import android.graphics.drawable.Drawable;
            import android.view.MenuItem;
            import android.view.SubMenu;
            import android.view.View;
            
/* 5 */     public final class Oli1l1l0 extends O1illlIiilIl implements SubMenu {
                public final O1illlIiilIl I001l0I00;
                public final O1ioIIl I001lIiIIo1O;

                public Oli1l1l0(Context context, O1illlIiilIl o1illlIiilIl, O1ioIIl o1ioIIl) {
/* 1 */             super(context);
/* 4 */             this.I001l0I00 = o1illlIiilIl;
/* 6 */             this.I001lIiIIo1O = o1ioIIl;
                }

                @Override
                public final boolean I0000O(O1ioIIl o1ioIIl) {
/* 3 */             return this.I001l0I00.I0000O(o1ioIIl);
                }

                @Override
                public final boolean I0000oI00(O1illlIiilIl o1illlIiilIl, MenuItem menuItem) {
                    return super.I0000oI00(o1illlIiilIl, menuItem) || this.I001l0I00.I0000oI00(o1illlIiilIl, menuItem);
                }

                @Override
                public final boolean I0001Ioi1lo(O1ioIIl o1ioIIl) {
/* 3 */             return this.I001l0I00.I0001Ioi1lo(o1ioIIl);
                }

                @Override
                public final String I000OiO() {
/* 3 */             int i = this.I001lIiIIo1O.I00000oIO;
/* 5 */             if (i == 0) {
/* 7 */                 return null;
                    }
/* 11 */            return Oi010OO0.I000oI1ioi(i, "android:menu:actionviewstates:");
                }

                @Override
                public final O1illlIiilIl I000iOII() {
/* 3 */             return this.I001l0I00.I000iOII();
                }

                @Override
                public final boolean I000lI() {
/* 3 */             return this.I001l0I00.I000lI();
                }

                @Override
                public final boolean I000o00OoI0I() {
/* 3 */             return this.I001l0I00.I000o00OoI0I();
                }

                @Override
                public final boolean I000oI1ioi() {
/* 3 */             return this.I001l0I00.I000oI1ioi();
                }

                @Override
                public final MenuItem getItem() {
/* 1 */             return this.I001lIiIIo1O;
                }

                @Override
                public final void setGroupDividerEnabled(boolean z) {
/* 3 */             this.I001l0I00.setGroupDividerEnabled(z);
                }

                @Override
                public final SubMenu setHeaderIcon(Drawable drawable) {
/* 7 */             I001IIilI0O(0, null, 0, drawable, null);
/* 5 */             return this;
                }

                @Override
                public final SubMenu setHeaderTitle(CharSequence charSequence) {
/* 7 */             I001IIilI0O(0, charSequence, 0, null, null);
/* 5 */             return this;
                }

                @Override
                public final SubMenu setHeaderView(View view) {
/* 7 */             I001IIilI0O(0, null, 0, null, view);
/* 5 */             return this;
                }

                @Override
                public final SubMenu setIcon(Drawable drawable) {
/* 3 */             this.I001lIiIIo1O.setIcon(drawable);
/* 29 */            return this;
                }

                @Override
                public final void setQwertyMode(boolean z) {
/* 3 */             this.I001l0I00.setQwertyMode(z);
                }

                @Override
/* 6 */         public final SubMenu setIcon(int i) {
/* 7 */             this.I001lIiIIo1O.setIcon(i);
                    return this;
                }

                @Override
/* 10 */        public final SubMenu setHeaderIcon(int i) {
/* 11 */            I001IIilI0O(0, null, i, null, null);
                    return this;
                }

                @Override
/* 10 */        public final SubMenu setHeaderTitle(int i) {
/* 11 */            I001IIilI0O(i, null, 0, null, null);
                    return this;
                }
            }
