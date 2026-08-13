            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.view.ActionProvider;
            import android.view.CollapsibleActionView;
            import android.view.ContextMenu;
            import android.view.MenuItem;
            import android.view.SubMenu;
            import android.view.View;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Method;
            
/* 5 */     public final class O1ioi1oo0Ol extends I01loIooI implements MenuItem {
                public final OliiollI I0000Il00O;
                public Method I0000O;

                public O1ioi1oo0Ol(Context context, OliiollI oliiollI) {
/* 1 */             super(context);
/* 4 */             if (oliiollI != null) {
/* 6 */                 this.I0000Il00O = oliiollI;
                    } else {
/* 11 */                I000II.I000iOII("Wrapped Object can not be null.");
/* 37 */                throw null;
                    }
                }

                @Override
                public final boolean collapseActionView() {
/* 3 */             return this.I0000Il00O.collapseActionView();
                }

                @Override
                public final boolean expandActionView() {
/* 3 */             return this.I0000Il00O.expandActionView();
                }

                @Override
                public final ActionProvider getActionProvider() {
/* 3 */             O1ioO0 o1ioO0I0000Il00O = this.I0000Il00O.I0000Il00O();
/* 7 */             if (o1ioO0I0000Il00O != null) {
/* 9 */                 return o1ioO0I0000Il00O.I00000oOI;
                    }
/* 12 */            return null;
                }

                @Override
                public final View getActionView() {
/* 3 */             View actionView = this.I0000Il00O.getActionView();
                    return actionView instanceof O1ioOOOillO ? (View) ((O1ioOOOillO) actionView).I00iOIl : actionView;
                }

                @Override
                public final int getAlphabeticModifiers() {
/* 3 */             return this.I0000Il00O.getAlphabeticModifiers();
                }

                @Override
                public final char getAlphabeticShortcut() {
/* 3 */             return this.I0000Il00O.getAlphabeticShortcut();
                }

                @Override
                public final CharSequence getContentDescription() {
/* 3 */             return this.I0000Il00O.getContentDescription();
                }

                @Override
                public final int getGroupId() {
/* 3 */             return this.I0000Il00O.getGroupId();
                }

                @Override
                public final Drawable getIcon() {
/* 3 */             return this.I0000Il00O.getIcon();
                }

                @Override
                public final ColorStateList getIconTintList() {
/* 3 */             return this.I0000Il00O.getIconTintList();
                }

                @Override
                public final PorterDuff.Mode getIconTintMode() {
/* 3 */             return this.I0000Il00O.getIconTintMode();
                }

                @Override
                public final Intent getIntent() {
/* 3 */             return this.I0000Il00O.getIntent();
                }

                @Override
                public final int getItemId() {
/* 3 */             return this.I0000Il00O.getItemId();
                }

                @Override
                public final ContextMenu.ContextMenuInfo getMenuInfo() {
/* 3 */             return this.I0000Il00O.getMenuInfo();
                }

                @Override
                public final int getNumericModifiers() {
/* 3 */             return this.I0000Il00O.getNumericModifiers();
                }

                @Override
                public final char getNumericShortcut() {
/* 3 */             return this.I0000Il00O.getNumericShortcut();
                }

                @Override
                public final int getOrder() {
/* 3 */             return this.I0000Il00O.getOrder();
                }

                @Override
                public final SubMenu getSubMenu() {
/* 3 */             return this.I0000Il00O.getSubMenu();
                }

                @Override
                public final CharSequence getTitle() {
/* 3 */             return this.I0000Il00O.getTitle();
                }

                @Override
                public final CharSequence getTitleCondensed() {
/* 3 */             return this.I0000Il00O.getTitleCondensed();
                }

                @Override
                public final CharSequence getTooltipText() {
/* 3 */             return this.I0000Il00O.getTooltipText();
                }

                @Override
                public final boolean hasSubMenu() {
/* 3 */             return this.I0000Il00O.hasSubMenu();
                }

                @Override
                public final boolean isActionViewExpanded() {
/* 3 */             return this.I0000Il00O.isActionViewExpanded();
                }

                @Override
                public final boolean isCheckable() {
/* 3 */             return this.I0000Il00O.isCheckable();
                }

                @Override
                public final boolean isChecked() {
/* 3 */             return this.I0000Il00O.isChecked();
                }

                @Override
                public final boolean isEnabled() {
/* 3 */             return this.I0000Il00O.isEnabled();
                }

                @Override
                public final boolean isVisible() {
/* 3 */             return this.I0000Il00O.isVisible();
                }

                @Override
                public final MenuItem setActionProvider(ActionProvider actionProvider) {
/* 3 */             O1ioO0 o1ioO0 = new O1ioO0();
/* 6 */             o1ioO0.I00000oOI = actionProvider;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            if (actionProvider == null) {
/* 14 */                o1ioO0 = null;
                    }
/* 17 */            this.I0000Il00O.I00000oIO(o1ioO0);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setActionView(int i) {
/* 1 */             OliiollI oliiollI = this.I0000Il00O;
/* 3 */             oliiollI.setActionView(i);
/* 6 */             View actionView = oliiollI.getActionView();
/* 12 */            if (actionView instanceof CollapsibleActionView) {
/* 19 */                oliiollI.setActionView(new O1ioOOOillO(actionView));
                    }
/* 29 */            return this;
                }

                @Override
                public final MenuItem setAlphabeticShortcut(char c) {
/* 3 */             this.I0000Il00O.setAlphabeticShortcut(c);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setCheckable(boolean z) {
/* 3 */             this.I0000Il00O.setCheckable(z);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setChecked(boolean z) {
/* 3 */             this.I0000Il00O.setChecked(z);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setContentDescription(CharSequence charSequence) {
/* 3 */             this.I0000Il00O.setContentDescription(charSequence);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setEnabled(boolean z) {
/* 3 */             this.I0000Il00O.setEnabled(z);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setIcon(Drawable drawable) {
/* 3 */             this.I0000Il00O.setIcon(drawable);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setIconTintList(ColorStateList colorStateList) {
/* 3 */             this.I0000Il00O.setIconTintList(colorStateList);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
/* 3 */             this.I0000Il00O.setIconTintMode(mode);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setIntent(Intent intent) {
/* 3 */             this.I0000Il00O.setIntent(intent);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setNumericShortcut(char c) {
/* 3 */             this.I0000Il00O.setNumericShortcut(c);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
                    O1ioOo1 o1ioOo1;
/* 1 */             if (onActionExpandListener != null) {
/* 5 */                 o1ioOo1 = new O1ioOo1();
/* 8 */                 o1ioOo1.I00000oOI = this;
/* 10 */                o1ioOo1.I00000oIO = onActionExpandListener;
/* 12 */                VarHandle.storeStoreFence();
                    } else {
/* 16 */                o1ioOo1 = null;
                    }
/* 19 */            this.I0000Il00O.setOnActionExpandListener(o1ioOo1);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
                    Oliio001lill oliio001lill;
/* 1 */             if (onMenuItemClickListener != null) {
/* 6 */                 oliio001lill = new Oliio001lill(1);
/* 9 */                 oliio001lill.I0000Il00O = this;
/* 11 */                oliio001lill.I00000oOI = onMenuItemClickListener;
/* 13 */                VarHandle.storeStoreFence();
                    } else {
/* 17 */                oliio001lill = null;
                    }
/* 20 */            this.I0000Il00O.setOnMenuItemClickListener(oliio001lill);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setShortcut(char c, char c2) {
/* 3 */             this.I0000Il00O.setShortcut(c, c2);
/* 37 */            return this;
                }

                @Override
                public final void setShowAsAction(int i) {
/* 3 */             this.I0000Il00O.setShowAsAction(i);
                }

                @Override
                public final MenuItem setShowAsActionFlags(int i) {
/* 3 */             this.I0000Il00O.setShowAsActionFlags(i);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setTitle(CharSequence charSequence) {
/* 3 */             this.I0000Il00O.setTitle(charSequence);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setTitleCondensed(CharSequence charSequence) {
/* 3 */             this.I0000Il00O.setTitleCondensed(charSequence);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setTooltipText(CharSequence charSequence) {
/* 3 */             this.I0000Il00O.setTooltipText(charSequence);
/* 29 */            return this;
                }

                @Override
                public final MenuItem setVisible(boolean z) {
/* 3 */             return this.I0000Il00O.setVisible(z);
                }

                @Override
/* 6 */         public final MenuItem setAlphabeticShortcut(char c, int i) {
/* 7 */             this.I0000Il00O.setAlphabeticShortcut(c, i);
                    return this;
                }

                @Override
/* 6 */         public final MenuItem setIcon(int i) {
/* 7 */             this.I0000Il00O.setIcon(i);
                    return this;
                }

                @Override
/* 6 */         public final MenuItem setNumericShortcut(char c, int i) {
/* 7 */             this.I0000Il00O.setNumericShortcut(c, i);
                    return this;
                }

                @Override
/* 6 */         public final MenuItem setShortcut(char c, char c2, int i, int i2) {
/* 7 */             this.I0000Il00O.setShortcut(c, c2, i, i2);
                    return this;
                }

                @Override
/* 6 */         public final MenuItem setTitle(int i) {
/* 7 */             this.I0000Il00O.setTitle(i);
                    return this;
                }

                @Override
/* 22 */        public final MenuItem setActionView(View view) {
/* 23 */            if (view instanceof CollapsibleActionView) {
/* 24 */                view = new O1ioOOOillO(view);
                    }
/* 25 */            this.I0000Il00O.setActionView(view);
                    return this;
                }
            }
