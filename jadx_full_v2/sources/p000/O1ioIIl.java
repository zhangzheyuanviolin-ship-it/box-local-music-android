            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.view.ActionProvider;
            import android.view.ContextMenu;
            import android.view.KeyEvent;
            import android.view.LayoutInflater;
            import android.view.MenuItem;
            import android.view.SubMenu;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.LinearLayout;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
/* 8 */     public final class O1ioIIl implements OliiollI {
                public int I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public CharSequence I0000oI00;
                public CharSequence I0001Ioi1lo;
                public Intent I000II;
                public char I000O01llI0;
                public int I000OOo1O;
                public char I000OiO;
                public int I000iOII;
                public Drawable I000l1;
                public int I000lI;
                public O1illlIiilIl I000o00OoI0I;
                public Oli1l1l0 I000oI1ioi;
                public MenuItem.OnMenuItemClickListener I00100l0;
                public CharSequence I00100o1O0lo;
                public CharSequence I0010I0i;
                public ColorStateList I0010o;
                public PorterDuff.Mode I00111O;
                public boolean I001IIilI0O;
                public boolean I001IO000;
                public boolean I001i1O0Ol;
                public int I001i1lo1io;
                public int I001iOo1i0O;
                public View I001l0I00;
                public O1ioO0 I001lIiIIo1O;
                public MenuItem.OnActionExpandListener I001lllioOl;
                public boolean I001lloI;

                public static void I00000oOI(int i, int i2, String str, StringBuilder sb) {
/* 2 */             if ((i & i2) == i2) {
/* 4 */                 sb.append(str);
                    }
                }

                @Override
                public final OliiollI I00000oIO(O1ioO0 o1ioO0) {
/* 2 */             this.I001l0I00 = null;
/* 4 */             this.I001lIiIIo1O = o1ioO0;
/* 9 */             this.I000o00OoI0I.I00100l0(true);
/* 12 */            O1ioO0 o1ioO02 = this.I001lIiIIo1O;
/* 14 */            if (o1ioO02 != null) {
/* 21 */                Oi1ol0llI oi1ol0llI = new Oi1ol0llI(13, false);
/* 24 */                oi1ol0llI.I00iiI = this;
/* 26 */                VarHandle.storeStoreFence();
/* 29 */                o1ioO02.I00000oIO = oi1ol0llI;
/* 33 */                o1ioO02.I00000oOI.setVisibilityListener(o1ioO02);
                    }
/* 77 */            return this;
                }

                @Override
                public final O1ioO0 I0000Il00O() {
/* 1 */             return this.I001lIiIIo1O;
                }

                public final Drawable I0000O(Drawable drawable) {
/* 1 */             if (drawable != null && this.I001i1O0Ol && (this.I001IIilI0O || this.I001IO000)) {
/* 15 */                drawable = drawable.mutate();
/* 21 */                if (this.I001IIilI0O) {
/* 25 */                    drawable.setTintList(this.I0010o);
                        }
/* 30 */                if (this.I001IO000) {
/* 34 */                    drawable.setTintMode(this.I00111O);
                        }
/* 38 */                this.I001i1O0Ol = false;
                    }
/* 77 */            return drawable;
                }

                public final boolean I0000oI00() {
                    O1ioO0 o1ioO0;
/* 6 */             if ((this.I001iOo1i0O & 8) != 0) {
/* 8 */                 View viewOnCreateActionView = this.I001l0I00;
/* 10 */                if (viewOnCreateActionView == null && (o1ioO0 = this.I001lIiIIo1O) != null) {
/* 18 */                    viewOnCreateActionView = o1ioO0.I00000oOI.onCreateActionView(this);
/* 22 */                    this.I001l0I00 = viewOnCreateActionView;
                        }
/* 24 */                if (viewOnCreateActionView != null) {
/* 26 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                public final void I0001Ioi1lo(boolean z) {
/* 1 */             int i = this.I001i1lo1io;
/* 3 */             if (z) {
/* 7 */                 this.I001i1lo1io = i | 32;
                    } else {
/* 12 */                this.I001i1lo1io = i & (-33);
                    }
                }

                @Override
                public final boolean collapseActionView() {
/* 5 */             if ((this.I001iOo1i0O & 8) == 0) {
/* 25 */                return false;
                    }
/* 10 */            if (this.I001l0I00 == null) {
/* 12 */                return true;
                    }
/* 14 */            MenuItem.OnActionExpandListener onActionExpandListener = this.I001lllioOl;
/* 16 */            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
/* 29 */                return this.I000o00OoI0I.I0000O(this);
                    }
/* 25 */            return false;
                }

                @Override
                public final boolean expandActionView() {
/* 5 */             if (!I0000oI00()) {
/* 19 */                return false;
                    }
/* 8 */             MenuItem.OnActionExpandListener onActionExpandListener = this.I001lllioOl;
/* 10 */            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
/* 23 */                return this.I000o00OoI0I.I0001Ioi1lo(this);
                    }
/* 19 */            return false;
                }

                @Override
                public final ActionProvider getActionProvider() {
/* 20 */            throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
                }

                @Override
                public final View getActionView() {
/* 1 */             View view = this.I001l0I00;
/* 3 */             if (view != null) {
/* 5 */                 return view;
                    }
/* 6 */             O1ioO0 o1ioO0 = this.I001lIiIIo1O;
/* 8 */             if (o1ioO0 == null) {
/* 19 */                return null;
                    }
/* 12 */            View viewOnCreateActionView = o1ioO0.I00000oOI.onCreateActionView(this);
/* 16 */            this.I001l0I00 = viewOnCreateActionView;
/* 18 */            return viewOnCreateActionView;
                }

                @Override
                public final int getAlphabeticModifiers() {
/* 1 */             return this.I000iOII;
                }

                @Override
                public final char getAlphabeticShortcut() {
/* 1 */             return this.I000OiO;
                }

                @Override
                public final CharSequence getContentDescription() {
/* 1 */             return this.I00100o1O0lo;
                }

                @Override
                public final int getGroupId() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final Drawable getIcon() {
/* 1 */             Drawable drawable = this.I000l1;
/* 3 */             if (drawable != null) {
/* 5 */                 return I0000O(drawable);
                    }
/* 10 */            int i = this.I000lI;
/* 12 */            if (i == 0) {
/* 32 */                return null;
                    }
/* 18 */            Drawable drawableI00000oIO = iOO0oOI1Ol.I00000oIO(this.I000o00OoI0I.I00000oIO, i);
/* 23 */            this.I000lI = 0;
/* 25 */            this.I000l1 = drawableI00000oIO;
/* 27 */            return I0000O(drawableI00000oIO);
                }

                @Override
                public final ColorStateList getIconTintList() {
/* 1 */             return this.I0010o;
                }

                @Override
                public final PorterDuff.Mode getIconTintMode() {
/* 1 */             return this.I00111O;
                }

                @Override
                public final Intent getIntent() {
/* 1 */             return this.I000II;
                }

                @Override
                public final int getItemId() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final ContextMenu.ContextMenuInfo getMenuInfo() {
/* 1 */             return null;
                }

                @Override
                public final int getNumericModifiers() {
/* 1 */             return this.I000OOo1O;
                }

                @Override
                public final char getNumericShortcut() {
/* 1 */             return this.I000O01llI0;
                }

                @Override
                public final int getOrder() {
/* 1 */             return this.I0000Il00O;
                }

                @Override
                public final SubMenu getSubMenu() {
/* 1 */             return this.I000oI1ioi;
                }

                @Override
                public final CharSequence getTitle() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final CharSequence getTitleCondensed() {
/* 1 */             CharSequence charSequence = this.I0001Ioi1lo;
                    return charSequence != null ? charSequence : this.I0000oI00;
                }

                @Override
                public final CharSequence getTooltipText() {
/* 1 */             return this.I0010I0i;
                }

                @Override
                public final boolean hasSubMenu() {
                    return this.I000oI1ioi != null;
                }

                @Override
                public final boolean isActionViewExpanded() {
/* 1 */             return this.I001lloI;
                }

                @Override
                public final boolean isCheckable() {
                    return (this.I001i1lo1io & 1) == 1;
                }

                @Override
                public final boolean isChecked() {
                    return (this.I001i1lo1io & 2) == 2;
                }

                @Override
                public final boolean isEnabled() {
                    return (this.I001i1lo1io & 16) != 0;
                }

                @Override
                public final boolean isVisible() {
/* 1 */             O1ioO0 o1ioO0 = this.I001lIiIIo1O;
                    return (o1ioO0 == null || !o1ioO0.I00000oOI.overridesItemVisibility()) ? (this.I001i1lo1io & 8) == 0 : (this.I001i1lo1io & 8) == 0 && this.I001lIiIIo1O.I00000oOI.isVisible();
                }

                @Override
                public final MenuItem setActionProvider(ActionProvider actionProvider) {
/* 29 */            throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
                }

                @Override
                public final MenuItem setActionView(int i) {
                    int i2;
/* 1 */             O1illlIiilIl o1illlIiilIl = this.I000o00OoI0I;
/* 3 */             Context context = o1illlIiilIl.I00000oIO;
/* 15 */            View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
/* 19 */            this.I001l0I00 = viewInflate;
/* 22 */            this.I001lIiIIo1O = null;
/* 24 */            if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.I00000oIO) > 0) {
/* 37 */                viewInflate.setId(i2);
                    }
/* 41 */            o1illlIiilIl.I000iOII = true;
/* 43 */            o1illlIiilIl.I00100l0(true);
/* 77 */            return this;
                }

                @Override
                public final MenuItem setAlphabeticShortcut(char c, int i) {
/* 3 */             if (this.I000OiO == c && this.I000iOII == i) {
/* 9 */                 return this;
                    }
/* 14 */            this.I000OiO = Character.toLowerCase(c);
/* 20 */            this.I000iOII = KeyEvent.normalizeMetaState(i);
/* 25 */            this.I000o00OoI0I.I00100l0(false);
/* 37 */            return this;
                }

                @Override
                public final MenuItem setCheckable(boolean z) {
/* 1 */             int i = this.I001i1lo1io;
/* 5 */             int i2 = (z ? 1 : 0) | (i & (-2));
/* 6 */             this.I001i1lo1io = i2;
/* 8 */             if (i != i2) {
/* 13 */                this.I000o00OoI0I.I00100l0(false);
                    }
/* 29 */            return this;
                }

                @Override
                public final MenuItem setChecked(boolean z) {
/* 1 */             O1illlIiilIl o1illlIiilIl = this.I000o00OoI0I;
/* 3 */             int i = this.I001i1lo1io;
/* 9 */             if ((i & 4) == 0) {
/* 85 */                int i2 = (i & (-3)) | (z ? 2 : 0);
/* 87 */                this.I001i1lo1io = i2;
/* 89 */                if (i != i2) {
/* 91 */                    o1illlIiilIl.I00100l0(false);
                        }
/* 168 */               return this;
                    }
/* 11 */            int i3 = this.I00000oOI;
/* 13 */            ArrayList arrayList = o1illlIiilIl.I0001Ioi1lo;
/* 15 */            int size = arrayList.size();
/* 19 */            o1illlIiilIl.I001i1O0Ol();
/* 23 */            for (int i4 = 0; i4 < size; i4++) {
/* 29 */                O1ioIIl o1ioIIl = (O1ioIIl) arrayList.get(i4);
/* 33 */                if (o1ioIIl.I00000oOI == i3 && (o1ioIIl.I001i1lo1io & 4) != 0 && o1ioIIl.isCheckable()) {
/* 52 */                    boolean z2 = o1ioIIl == this;
/* 53 */                    int i5 = o1ioIIl.I001i1lo1io;
/* 62 */                    int i6 = (z2 ? 2 : 0) | (i5 & (-3));
/* 63 */                    o1ioIIl.I001i1lo1io = i6;
/* 65 */                    if (i5 != i6) {
/* 69 */                        o1ioIIl.I000o00OoI0I.I00100l0(false);
                            }
                        }
                    }
/* 75 */            o1illlIiilIl.I001IO000();
/* 78 */            return this;
                }

                @Override
                public final OliiollI setContentDescription(CharSequence charSequence) {
/* 1 */             this.I00100o1O0lo = charSequence;
/* 6 */             this.I000o00OoI0I.I00100l0(false);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setEnabled(boolean z) {
/* 1 */             int i = this.I001i1lo1io;
/* 3 */             if (z) {
/* 7 */                 this.I001i1lo1io = i | 16;
                    } else {
/* 12 */                this.I001i1lo1io = i & (-17);
                    }
/* 17 */            this.I000o00OoI0I.I00100l0(false);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setIcon(int i) {
/* 2 */             this.I000l1 = null;
/* 4 */             this.I000lI = i;
/* 7 */             this.I001i1O0Ol = true;
/* 12 */            this.I000o00OoI0I.I00100l0(false);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setIconTintList(ColorStateList colorStateList) {
/* 1 */             this.I0010o = colorStateList;
/* 4 */             this.I001IIilI0O = true;
/* 6 */             this.I001i1O0Ol = true;
/* 11 */            this.I000o00OoI0I.I00100l0(false);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
/* 1 */             this.I00111O = mode;
/* 4 */             this.I001IO000 = true;
/* 6 */             this.I001i1O0Ol = true;
/* 11 */            this.I000o00OoI0I.I00100l0(false);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setIntent(Intent intent) {
/* 1 */             this.I000II = intent;
/* 29 */            return this;
                }

                @Override
                public final MenuItem setNumericShortcut(char c, int i) {
/* 3 */             if (this.I000O01llI0 == c && this.I000OOo1O == i) {
/* 9 */                 return this;
                    }
/* 10 */            this.I000O01llI0 = c;
/* 16 */            this.I000OOo1O = KeyEvent.normalizeMetaState(i);
/* 21 */            this.I000o00OoI0I.I00100l0(false);
/* 37 */            return this;
                }

                @Override
                public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
/* 1 */             this.I001lllioOl = onActionExpandListener;
/* 29 */            return this;
                }

                @Override
                public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
/* 1 */             this.I00100l0 = onMenuItemClickListener;
/* 29 */            return this;
                }

                @Override
                public final MenuItem setShortcut(char c, char c2, int i, int i2) {
/* 1 */             this.I000O01llI0 = c;
/* 7 */             this.I000OOo1O = KeyEvent.normalizeMetaState(i);
/* 13 */            this.I000OiO = Character.toLowerCase(c2);
/* 19 */            this.I000iOII = KeyEvent.normalizeMetaState(i2);
/* 24 */            this.I000o00OoI0I.I00100l0(false);
/* 204 */           return this;
                }

                @Override
                public final void setShowAsAction(int i) {
/* 1 */             int i2 = i & 3;
/* 4 */             if (i2 != 0 && i2 != 1 && i2 != 2) {
/* 14 */                I000II.I000iOII("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
/* 17 */                return;
                    }
/* 18 */            this.I001iOo1i0O = i;
/* 20 */            O1illlIiilIl o1illlIiilIl = this.I000o00OoI0I;
/* 22 */            o1illlIiilIl.I000iOII = true;
/* 24 */            o1illlIiilIl.I00100l0(true);
                }

                @Override
                public final MenuItem setShowAsActionFlags(int i) {
/* 1 */             setShowAsAction(i);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setTitle(CharSequence charSequence) {
/* 1 */             this.I0000oI00 = charSequence;
/* 6 */             this.I000o00OoI0I.I00100l0(false);
/* 9 */             Oli1l1l0 oli1l1l0 = this.I000oI1ioi;
/* 11 */            if (oli1l1l0 != null) {
/* 13 */                oli1l1l0.setHeaderTitle(charSequence);
                    }
/* 29 */            return this;
                }

                @Override
                public final MenuItem setTitleCondensed(CharSequence charSequence) {
/* 1 */             this.I0001Ioi1lo = charSequence;
/* 6 */             this.I000o00OoI0I.I00100l0(false);
/* 29 */            return this;
                }

                @Override
                public final OliiollI setTooltipText(CharSequence charSequence) {
/* 1 */             this.I0010I0i = charSequence;
/* 6 */             this.I000o00OoI0I.I00100l0(false);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setVisible(boolean z) {
/* 1 */             int i = this.I001i1lo1io;
/* 11 */            int i2 = (z ? 0 : 8) | (i & (-9));
/* 12 */            this.I001i1lo1io = i2;
/* 14 */            if (i != i2) {
/* 16 */                O1illlIiilIl o1illlIiilIl = this.I000o00OoI0I;
/* 19 */                o1illlIiilIl.I000O01llI0 = true;
/* 21 */                o1illlIiilIl.I00100l0(true);
                    }
/* 29 */            return this;
                }

                public final String toString() {
/* 1 */             CharSequence charSequence = this.I0000oI00;
/* 3 */             if (charSequence != null) {
/* 5 */                 return charSequence.toString();
                    }
/* 10 */            return null;
                }

                @Override
/* 9 */         public final MenuItem setContentDescription(CharSequence charSequence) {
/* 10 */            setContentDescription(charSequence);
                    return this;
                }

                @Override
/* 9 */         public final MenuItem setTooltipText(CharSequence charSequence) {
/* 10 */            setTooltipText(charSequence);
                    return this;
                }

                @Override
/* 15 */        public final MenuItem setIcon(Drawable drawable) {
/* 16 */            this.I000lI = 0;
/* 17 */            this.I000l1 = drawable;
/* 18 */            this.I001i1O0Ol = true;
/* 19 */            this.I000o00OoI0I.I00100l0(false);
                    return this;
                }

                @Override
/* 16 */        public final MenuItem setTitle(int i) {
/* 19 */            setTitle(this.I000o00OoI0I.I00000oIO.getString(i));
                    return this;
                }

                @Override
/* 24 */        public final MenuItem setNumericShortcut(char c) {
/* 25 */            if (this.I000O01llI0 == c) {
                        return this;
                    }
/* 26 */            this.I000O01llI0 = c;
/* 27 */            this.I000o00OoI0I.I00100l0(false);
                    return this;
                }

                @Override
/* 27 */        public final MenuItem setShortcut(char c, char c2) {
/* 28 */            this.I000O01llI0 = c;
/* 29 */            this.I000OiO = Character.toLowerCase(c2);
/* 30 */            this.I000o00OoI0I.I00100l0(false);
                    return this;
                }

                @Override
/* 28 */        public final MenuItem setAlphabeticShortcut(char c) {
/* 29 */            if (this.I000OiO == c) {
                        return this;
                    }
/* 30 */            this.I000OiO = Character.toLowerCase(c);
/* 31 */            this.I000o00OoI0I.I00100l0(false);
                    return this;
                }

                @Override
/* 46 */        public final MenuItem setActionView(View view) {
                    int i;
/* 47 */            this.I001l0I00 = view;
/* 48 */            this.I001lIiIIo1O = null;
/* 49 */            if (view != null && view.getId() == -1 && (i = this.I00000oIO) > 0) {
/* 50 */                view.setId(i);
                    }
/* 51 */            O1illlIiilIl o1illlIiilIl = this.I000o00OoI0I;
/* 52 */            o1illlIiilIl.I000iOII = true;
/* 53 */            o1illlIiilIl.I00100l0(true);
                    return this;
                }
            }
