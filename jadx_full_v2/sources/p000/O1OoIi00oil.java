            package p000;

            import android.R;
            import android.content.res.ColorStateList;
            
            public final class O1OoIi00oil extends I1I0ii0 {
                public static final int[][] I00io1l = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
                public ColorStateList I00ilI0I1;
                public boolean I00ilO0;

                private ColorStateList getMaterialThemeColorsTintList() {
/* 1 */             ColorStateList colorStateList = this.I00ilI0I1;
/* 3 */             if (colorStateList != null) {
/* 113 */               return colorStateList;
                    }
/* 8 */             int iI00000oOI = l1I10i.I00000oOI(this, com.box.gallery.R.attr.colorControlActivated);
/* 15 */            int iI00000oOI2 = l1I10i.I00000oOI(this, com.box.gallery.R.attr.colorOnSurface);
/* 22 */            int iI00000oOI3 = l1I10i.I00000oOI(this, com.box.gallery.R.attr.colorSurface);
/* 58 */            ColorStateList colorStateList2 = new ColorStateList(I00io1l, new int[]{l1I10i.I0000Il00O(iI00000oOI3, iI00000oOI, 1.0f), l1I10i.I0000Il00O(iI00000oOI3, iI00000oOI2, 0.54f), l1I10i.I0000Il00O(iI00000oOI3, iI00000oOI2, 0.38f), l1I10i.I0000Il00O(iI00000oOI3, iI00000oOI2, 0.38f)});
/* 61 */            this.I00ilI0I1 = colorStateList2;
/* 63 */            return colorStateList2;
                }

                @Override
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 6 */             if (this.I00ilO0 && getButtonTintList() == null) {
/* 15 */                setUseMaterialThemeColors(true);
                    }
                }

                public void setUseMaterialThemeColors(boolean z) {
/* 1 */             this.I00ilO0 = z;
/* 3 */             if (z) {
/* 9 */                 setButtonTintList(getMaterialThemeColorsTintList());
                    } else {
/* 14 */                setButtonTintList(null);
                    }
                }
            }
