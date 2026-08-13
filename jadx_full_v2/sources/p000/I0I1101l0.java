            package p000;

            import android.R;
            import android.content.Context;
            import android.content.Intent;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.view.ActionProvider;
            import android.view.ContextMenu;
            import android.view.KeyEvent;
            import android.view.MenuItem;
            import android.view.SubMenu;
            import android.view.View;
            
/* 2 */     public final class I0I1101l0 implements OliiollI {
                public CharSequence I00000oIO;
                public CharSequence I00000oOI;
                public Intent I0000Il00O;
                public char I0000O;
                public int I0000oI00;
                public char I0001Ioi1lo;
                public int I000II;
                public Drawable I000O01llI0;
                public Context I000OOo1O;
                public CharSequence I000OiO;
                public CharSequence I000iOII;
                public ColorStateList I000l1;
                public PorterDuff.Mode I000lI;
                public boolean I000o00OoI0I;
                public boolean I000oI1ioi;
                public int I00100l0;

                @Override
                public final OliiollI I00000oIO(O1ioO0 o1ioO0) {
/* 29 */            throw new UnsupportedOperationException();
                }

                public final void I00000oOI() {
/* 1 */             Drawable drawable = this.I000O01llI0;
/* 3 */             if (drawable != null) {
/* 7 */                 if (this.I000o00OoI0I || this.I000oI1ioi) {
/* 13 */                    this.I000O01llI0 = drawable;
/* 15 */                    Drawable drawableMutate = drawable.mutate();
/* 19 */                    this.I000O01llI0 = drawableMutate;
/* 23 */                    if (this.I000o00OoI0I) {
/* 27 */                        drawableMutate.setTintList(this.I000l1);
                            }
/* 32 */                    if (this.I000oI1ioi) {
/* 38 */                        this.I000O01llI0.setTintMode(this.I000lI);
                            }
                        }
                    }
                }

                @Override
                public final O1ioO0 I0000Il00O() {
/* 1 */             return null;
                }

                @Override
                public final boolean collapseActionView() {
/* 1 */             return false;
                }

                @Override
                public final boolean expandActionView() {
/* 1 */             return false;
                }

                @Override
                public final ActionProvider getActionProvider() {
/* 20 */            throw new UnsupportedOperationException();
                }

                @Override
                public final View getActionView() {
/* 1 */             return null;
                }

                @Override
                public final int getAlphabeticModifiers() {
/* 1 */             return this.I000II;
                }

                @Override
                public final char getAlphabeticShortcut() {
/* 1 */             return this.I0001Ioi1lo;
                }

                @Override
                public final CharSequence getContentDescription() {
/* 1 */             return this.I000OiO;
                }

                @Override
                public final int getGroupId() {
/* 1 */             return 0;
                }

                @Override
                public final Drawable getIcon() {
/* 1 */             return this.I000O01llI0;
                }

                @Override
                public final ColorStateList getIconTintList() {
/* 1 */             return this.I000l1;
                }

                @Override
                public final PorterDuff.Mode getIconTintMode() {
/* 1 */             return this.I000lI;
                }

                @Override
                public final Intent getIntent() {
/* 1 */             return this.I0000Il00O;
                }

                @Override
                public final int getItemId() {
/* 1 */             return R.id.home;
                }

                @Override
                public final ContextMenu.ContextMenuInfo getMenuInfo() {
/* 1 */             return null;
                }

                @Override
                public final int getNumericModifiers() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final char getNumericShortcut() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final int getOrder() {
/* 1 */             return 0;
                }

                @Override
                public final SubMenu getSubMenu() {
/* 1 */             return null;
                }

                @Override
                public final CharSequence getTitle() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final CharSequence getTitleCondensed() {
/* 1 */             CharSequence charSequence = this.I00000oOI;
                    return charSequence != null ? charSequence : this.I00000oIO;
                }

                @Override
                public final CharSequence getTooltipText() {
/* 1 */             return this.I000iOII;
                }

                @Override
                public final boolean hasSubMenu() {
/* 1 */             return false;
                }

                @Override
                public final boolean isActionViewExpanded() {
/* 1 */             return false;
                }

                @Override
                public final boolean isCheckable() {
                    return (this.I00100l0 & 1) != 0;
                }

                @Override
                public final boolean isChecked() {
                    return (this.I00100l0 & 2) != 0;
                }

                @Override
                public final boolean isEnabled() {
                    return (this.I00100l0 & 16) != 0;
                }

                @Override
                public final boolean isVisible() {
                    return (this.I00100l0 & 8) == 0;
                }

                @Override
                public final MenuItem setActionProvider(ActionProvider actionProvider) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final MenuItem setActionView(View view) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final MenuItem setAlphabeticShortcut(char c, int i) {
/* 5 */             this.I0001Ioi1lo = Character.toLowerCase(c);
/* 11 */            this.I000II = KeyEvent.normalizeMetaState(i);
/* 37 */            return this;
                }

                @Override
                public final MenuItem setCheckable(boolean z) {
/* 6 */             this.I00100l0 = (z ? 1 : 0) | (this.I00100l0 & (-2));
/* 29 */            return this;
                }

                @Override
                public final MenuItem setChecked(boolean z) {
/* 11 */            this.I00100l0 = (z ? 2 : 0) | (this.I00100l0 & (-3));
/* 29 */            return this;
                }

                @Override
                public final OliiollI setContentDescription(CharSequence charSequence) {
/* 1 */             this.I000OiO = charSequence;
/* 29 */            return this;
                }

                @Override
                public final MenuItem setEnabled(boolean z) {
/* 12 */            this.I00100l0 = (z ? 16 : 0) | (this.I00100l0 & (-17));
/* 29 */            return this;
                }

                @Override
                public final MenuItem setIcon(int i) {
/* 7 */             this.I000O01llI0 = this.I000OOo1O.getDrawable(i);
/* 9 */             I00000oOI();
/* 29 */            return this;
                }

                @Override
                public final MenuItem setIconTintList(ColorStateList colorStateList) {
/* 1 */             this.I000l1 = colorStateList;
/* 4 */             this.I000o00OoI0I = true;
/* 6 */             I00000oOI();
/* 29 */            return this;
                }

                @Override
                public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
/* 1 */             this.I000lI = mode;
/* 4 */             this.I000oI1ioi = true;
/* 6 */             I00000oOI();
/* 29 */            return this;
                }

                @Override
                public final MenuItem setIntent(Intent intent) {
/* 1 */             this.I0000Il00O = intent;
/* 29 */            return this;
                }

                @Override
                public final MenuItem setNumericShortcut(char c, int i) {
/* 1 */             this.I0000O = c;
/* 7 */             this.I0000oI00 = KeyEvent.normalizeMetaState(i);
/* 37 */            return this;
                }

                @Override
                public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final MenuItem setShortcut(char c, char c2, int i, int i2) {
/* 1 */             this.I0000O = c;
/* 7 */             this.I0000oI00 = KeyEvent.normalizeMetaState(i);
/* 13 */            this.I0001Ioi1lo = Character.toLowerCase(c2);
/* 19 */            this.I000II = KeyEvent.normalizeMetaState(i2);
/* 204 */           return this;
                }

                @Override
                public final MenuItem setTitle(int i) {
/* 11 */            this.I00000oIO = this.I000OOo1O.getResources().getString(i);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setTitleCondensed(CharSequence charSequence) {
/* 1 */             this.I00000oOI = charSequence;
/* 29 */            return this;
                }

                @Override
                public final OliiollI setTooltipText(CharSequence charSequence) {
/* 1 */             this.I000iOII = charSequence;
/* 29 */            return this;
                }

                @Override
                public final MenuItem setVisible(boolean z) {
/* 11 */            this.I00100l0 = (this.I00100l0 & 8) | (z ? 0 : 8);
/* 29 */            return this;
                }

                @Override
/* 3 */         public final MenuItem setContentDescription(CharSequence charSequence) {
/* 4 */             this.I000OiO = charSequence;
                    return this;
                }

                @Override
/* 3 */         public final MenuItem setTooltipText(CharSequence charSequence) {
/* 4 */             this.I000iOII = charSequence;
                    return this;
                }

                @Override
/* 6 */         public final MenuItem setActionView(int i) {
/* 7 */             throw new UnsupportedOperationException();
                }

                @Override
/* 9 */         public final MenuItem setNumericShortcut(char c) {
/* 10 */            this.I0000O = c;
                    return this;
                }

                @Override
/* 12 */        public final MenuItem setIcon(Drawable drawable) {
/* 13 */            this.I000O01llI0 = drawable;
/* 14 */            I00000oOI();
                    return this;
                }

                @Override
/* 13 */        public final MenuItem setAlphabeticShortcut(char c) {
/* 14 */            this.I0001Ioi1lo = Character.toLowerCase(c);
                    return this;
                }

                @Override
/* 13 */        public final MenuItem setTitle(CharSequence charSequence) {
/* 14 */            this.I00000oIO = charSequence;
                    return this;
                }

                @Override
/* 21 */        public final MenuItem setShortcut(char c, char c2) {
/* 22 */            this.I0000O = c;
/* 23 */            this.I0001Ioi1lo = Character.toLowerCase(c2);
                    return this;
                }

                @Override
/* 28 */        public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
/* 29 */            return this;
                }

                @Override
/* 28 */        public final void setShowAsAction(int i) {
                }

                @Override
/* 28 */        public final MenuItem setShowAsActionFlags(int i) {
/* 29 */            return this;
                }
            }
