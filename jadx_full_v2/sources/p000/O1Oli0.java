            package p000;

            import android.accessibilityservice.AccessibilityServiceInfo;
            import android.content.res.ColorStateList;
            import android.graphics.drawable.Drawable;
            import android.view.View;
            import android.view.ViewParent;
            import android.view.accessibility.AccessibilityManager;
            import android.widget.AdapterView;
            import android.widget.Filterable;
            import android.widget.ListAdapter;
            import java.util.List;
            
/* 14 */    public final class O1Oli0 extends I11ioI1IlOI {
                public O10O00o I00ilI0I1;
                public AccessibilityManager I00ilO0;
                public int I00io1l;
                public float I00ioIO;
                public ColorStateList I00l0I0l0lO1;
                public int I00l0OO0IO;
                public ColorStateList I00li1OI;

                public final boolean I00000oOI() {
                    List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
/* 1 */             AccessibilityManager accessibilityManager = this.I00ilO0;
/* 3 */             if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
/* 63 */                return true;
                    }
/* 12 */            if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
/* 65 */                return false;
                    }
/* 37 */            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
/* 49 */                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
/* 63 */                    return true;
                        }
                    }
/* 65 */            return false;
                }

                @Override
                public final void dismissDropDown() {
/* 5 */             if (I00000oOI()) {
/* 9 */                 this.I00ilI0I1.dismiss();
                    } else {
/* 13 */                super.dismissDropDown();
                    }
                }

                public ColorStateList getDropDownBackgroundTintList() {
/* 1 */             return this.I00l0I0l0lO1;
                }

                @Override
                public CharSequence getHint() {
/* 5 */             for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                    }
/* 12 */            return super.getHint();
                }

                public float getPopupElevation() {
/* 1 */             return this.I00ioIO;
                }

                public int getSimpleItemSelectedColor() {
/* 1 */             return this.I00l0OO0IO;
                }

                public ColorStateList getSimpleItemSelectedRippleColor() {
/* 1 */             return this.I00li1OI;
                }

                @Override
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 8 */             for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                    }
                }

                @Override
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 6 */             this.I00ilI0I1.dismiss();
                }

                @Override
                public final void onMeasure(int i, int i2) {
/* 1 */             super.onMeasure(i, i2);
/* 10 */            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
/* 12 */                int measuredWidth = getMeasuredWidth();
/* 16 */                getAdapter();
/* 23 */                for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                        }
/* 47 */                setMeasuredDimension(Math.min(Math.max(measuredWidth, 0), View.MeasureSpec.getSize(i)), getMeasuredHeight());
                    }
                }

                @Override
                public final void onWindowFocusChanged(boolean z) {
/* 5 */             if (I00000oOI()) {
/* 7 */                 return;
                    }
/* 8 */             super.onWindowFocusChanged(z);
                }

                @Override
                public <T extends ListAdapter & Filterable> void setAdapter(T t) {
/* 1 */             super.setAdapter(t);
/* 10 */            this.I00ilI0I1.I00100l0(getAdapter());
                }

                @Override
                public void setDropDownBackgroundDrawable(Drawable drawable) {
/* 1 */             super.setDropDownBackgroundDrawable(drawable);
/* 4 */             O10O00o o10O00o = this.I00ilI0I1;
/* 6 */             if (o10O00o != null) {
/* 8 */                 o10O00o.I000OOo1O(drawable);
                    }
                }

                public void setDropDownBackgroundTint(int i) {
/* 5 */             setDropDownBackgroundTintList(ColorStateList.valueOf(i));
                }

                public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
/* 1 */             this.I00l0I0l0lO1 = colorStateList;
/* 3 */             Drawable dropDownBackground = getDropDownBackground();
/* 9 */             if (dropDownBackground instanceof O1Ooi0) {
/* 11 */                O1Ooi0 o1Ooi0 = (O1Ooi0) dropDownBackground;
/* 13 */                ColorStateList colorStateList2 = this.I00l0I0l0lO1;
/* 15 */                O1OoOIoiiO1I o1OoOIoiiO1I = o1Ooi0.I00iiI;
/* 19 */                if (o1OoOIoiiO1I.I0000O != colorStateList2) {
/* 21 */                    o1OoOIoiiO1I.I0000O = colorStateList2;
/* 27 */                    o1Ooi0.onStateChange(o1Ooi0.getState());
                        }
                    }
                }

                @Override
                public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
/* 1 */             super.setOnItemSelectedListener(onItemSelectedListener);
/* 10 */            this.I00ilI0I1.I00o101lO = getOnItemSelectedListener();
                }

                @Override
                public void setRawInputType(int i) {
/* 1 */             super.setRawInputType(i);
/* 8 */             for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                    }
                }

                public void setSimpleItemSelectedColor(int i) {
/* 1 */             this.I00l0OO0IO = i;
/* 9 */             if (getAdapter() instanceof O1OlOlo) {
/* 17 */                ((O1OlOlo) getAdapter()).I00000oIO();
                    }
                }

                public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
/* 1 */             this.I00li1OI = colorStateList;
/* 9 */             if (getAdapter() instanceof O1OlOlo) {
/* 17 */                ((O1OlOlo) getAdapter()).I00000oIO();
                    }
                }

                public void setSimpleItems(String[] strArr) {
/* 12 */            setAdapter(new O1OlOlo(this, getContext(), this.I00io1l, strArr));
                }

                @Override
                public final void showDropDown() {
/* 5 */             if (I00000oOI()) {
/* 9 */                 this.I00ilI0I1.I0001Ioi1lo();
                    } else {
/* 13 */                super.showDropDown();
                    }
                }

/* 15 */        public void setSimpleItems(int i) {
/* 16 */            setSimpleItems(getResources().getStringArray(i));
                }
            }
