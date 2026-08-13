            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.drawable.Drawable;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.view.ContextThemeWrapper;
            import android.view.Gravity;
            import android.view.LayoutInflater;
            import android.view.Menu;
            import android.view.MenuInflater;
            import android.view.MenuItem;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.TextView;
            import android.window.OnBackInvokedCallback;
            import android.window.OnBackInvokedDispatcher;
            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.WeakHashMap;
            import java.util.concurrent.CopyOnWriteArrayList;
            import p000.I0I0o01l;
            import p000.I0I1101l0;
            import p000.I0I1ii0i;
            import p000.I0lil01;
            import p000.I1I0I0oii1;
            import p000.I1I0I11lo;
            import p000.I1II01I;
            import p000.IIOOoll;
            import p000.IOO000ilo;
            import p000.Ii1iOIIi;
            import p000.Ill111iO;
            import p000.O1OIll00i;
            import p000.O1illlIiilIl;
            import p000.O1ioIIl;
            import p000.OOilOli0;
            import p000.OiI1o01O0I;
            import p000.OliioiiiOo;
            import p000.OlilOlOiI;
            import p000.Oo1Oll01II1;
            import p000.Oo1Oo1lo1;
            import p000.Oo1OoiI;
            import p000.Oo1OolOI;
            import p000.Oo1i10lO1;
            import p000.Oo1i1OOOOI;
            import p000.Oo1iOI0;
            import p000.Oo1ilOl;
            import p000.Oo1l0oIiIllO;
            import p000.OooiO1oOi1;
            import p000.OooiOl0ioo0i;
            import p000.iOO0oOI1Ol;
            
/* 9 */     public class Toolbar extends ViewGroup {
                public ActionMenuView I00iOIl;
                public I1II01I I00iiI;
                public I1II01I I00iiO;
                public I1I0I0oii1 I00iio;
                public I1I0I11lo I00ilI0I1;
                public final Drawable I00ilO0;
                public final CharSequence I00io1l;
                public I1I0I0oii1 I00ioIO;
                public View I00l0I0l0lO1;
                public Context I00l0OO0IO;
                public int I00li1OI;
                public int I00ll1;
                public int I00lli11;
                public final int I00lll10;
                public final int I00o0iI0io1;
                public int I00o0l1o1o0;
                public int I00o101lO;
                public int I00oI0i;
                public int I00oII;
                public OiI1o01O0I I00oIiI10;
                public int I00oO101o;
                public int I00oOio10iI1;
                public final int I00ol1;
                public CharSequence I00olI;
                public CharSequence I00oli;
                public ColorStateList I00oliIiO01i;
                public ColorStateList I00oo1iO0ll;
                public boolean I00ooIo0;
                public boolean I00ooiO1I;
                public final ArrayList I00oooO;
                public final ArrayList I0100i;
                public final int[] I0100o111I;
                public final IOO000ilo I010101Oo1lO;
                public ArrayList I010I0;
                public final IIOOoll I010II;
                public Oo1ilOl I010OIo1l;
                public I0I1ii0i I010i10l;
                public Oo1OoiI I010iIIOlo;
                public boolean I010ioo;
                public OnBackInvokedCallback I010l10O;
                public OnBackInvokedDispatcher I010l1O;
                public boolean I010l1ol111;
                public final I0lil01 I010lI0oi;

                public Toolbar(Context context, AttributeSet attributeSet) {
/* 4 */             super(context, attributeSet, R.attr.toolbarStyle);
/* 10 */            this.I00ol1 = 8388627;
/* 17 */            this.I00oooO = new ArrayList();
/* 24 */            this.I0100i = new ArrayList();
/* 29 */            this.I0100o111I = new int[2];
/* 36 */            Oo1Oll01II1 oo1Oll01II1 = new Oo1Oll01II1(1);
/* 39 */            oo1Oll01II1.I00iiI = this;
/* 41 */            VarHandle.storeStoreFence();
/* 47 */            this.I010101Oo1lO = new IOO000ilo(oo1Oll01II1);
/* 54 */            this.I010I0 = new ArrayList();
/* 60 */            IIOOoll iIOOoll = new IIOOoll(27);
/* 63 */            iIOOoll.I00iiI = this;
/* 65 */            VarHandle.storeStoreFence();
/* 68 */            this.I010II = iIOOoll;
/* 74 */            I0lil01 i0lil01 = new I0lil01(14);
/* 77 */            i0lil01.I00iiI = this;
/* 79 */            VarHandle.storeStoreFence();
/* 82 */            this.I010lI0oi = i0lil01;
/* 84 */            Context context2 = getContext();
/* 88 */            int[] iArr = OOilOli0.I001i1O0Ol;
/* 90 */            OlilOlOiI olilOlOiII0010I0i = OlilOlOiI.I0010I0i(context2, attributeSet, iArr, R.attr.toolbarStyle);
/* 97 */            TypedArray typedArray = (TypedArray) olilOlOiII0010I0i.I00iiO;
/* 99 */            WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 105 */           OooiO1oOi1.I00000oOI(this, context, iArr, attributeSet, typedArray, R.attr.toolbarStyle, 0);
/* 110 */           TypedArray typedArray2 = (TypedArray) olilOlOiII0010I0i.I00iiO;
/* 119 */           this.I00ll1 = typedArray2.getResourceId(28, 0);
/* 127 */           this.I00lli11 = typedArray2.getResourceId(19, 0);
/* 133 */           this.I00ol1 = typedArray2.getInteger(0, 8388627);
/* 141 */           this.I00lll10 = typedArray2.getInteger(2, 48);
/* 145 */           int dimensionPixelOffset = typedArray2.getDimensionPixelOffset(22, 0);
/* 155 */           dimensionPixelOffset = typedArray2.hasValue(27) ? typedArray2.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
/* 159 */           this.I00oII = dimensionPixelOffset;
/* 161 */           this.I00oI0i = dimensionPixelOffset;
/* 163 */           this.I00o101lO = dimensionPixelOffset;
/* 165 */           this.I00o0l1o1o0 = dimensionPixelOffset;
/* 170 */           int dimensionPixelOffset2 = typedArray2.getDimensionPixelOffset(25, -1);
/* 174 */           if (dimensionPixelOffset2 >= 0) {
/* 176 */               this.I00o0l1o1o0 = dimensionPixelOffset2;
                    }
/* 180 */           int dimensionPixelOffset3 = typedArray2.getDimensionPixelOffset(24, -1);
/* 184 */           if (dimensionPixelOffset3 >= 0) {
/* 186 */               this.I00o101lO = dimensionPixelOffset3;
                    }
/* 190 */           int dimensionPixelOffset4 = typedArray2.getDimensionPixelOffset(26, -1);
/* 194 */           if (dimensionPixelOffset4 >= 0) {
/* 196 */               this.I00oI0i = dimensionPixelOffset4;
                    }
/* 200 */           int dimensionPixelOffset5 = typedArray2.getDimensionPixelOffset(23, -1);
/* 204 */           if (dimensionPixelOffset5 >= 0) {
/* 206 */               this.I00oII = dimensionPixelOffset5;
                    }
/* 214 */           this.I00o0iI0io1 = typedArray2.getDimensionPixelSize(13, -1);
/* 220 */           int dimensionPixelOffset6 = typedArray2.getDimensionPixelOffset(9, Integer.MIN_VALUE);
/* 225 */           int dimensionPixelOffset7 = typedArray2.getDimensionPixelOffset(5, Integer.MIN_VALUE);
/* 230 */           int dimensionPixelSize = typedArray2.getDimensionPixelSize(7, 0);
/* 236 */           int dimensionPixelSize2 = typedArray2.getDimensionPixelSize(8, 0);
/* 240 */           I0000O();
/* 243 */           OiI1o01O0I oiI1o01O0I = this.I00oIiI10;
/* 245 */           oiI1o01O0I.I000O01llI0 = false;
/* 247 */           if (dimensionPixelSize != Integer.MIN_VALUE) {
/* 249 */               oiI1o01O0I.I0000oI00 = dimensionPixelSize;
/* 251 */               oiI1o01O0I.I00000oIO = dimensionPixelSize;
                    }
/* 253 */           if (dimensionPixelSize2 != Integer.MIN_VALUE) {
/* 255 */               oiI1o01O0I.I0001Ioi1lo = dimensionPixelSize2;
/* 257 */               oiI1o01O0I.I00000oOI = dimensionPixelSize2;
                    }
/* 259 */           if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
/* 263 */               oiI1o01O0I.I00000oIO(dimensionPixelOffset6, dimensionPixelOffset7);
                    }
/* 272 */           this.I00oO101o = typedArray2.getDimensionPixelOffset(10, Integer.MIN_VALUE);
/* 279 */           this.I00oOio10iI1 = typedArray2.getDimensionPixelOffset(6, Integer.MIN_VALUE);
/* 286 */           this.I00ilO0 = olilOlOiII0010I0i.I000iOII(4);
/* 293 */           this.I00io1l = typedArray2.getText(3);
/* 297 */           CharSequence text = typedArray2.getText(21);
/* 305 */           if (!TextUtils.isEmpty(text)) {
/* 307 */               setTitle(text);
                    }
/* 312 */           CharSequence text2 = typedArray2.getText(18);
/* 320 */           if (!TextUtils.isEmpty(text2)) {
/* 322 */               setSubtitle(text2);
                    }
/* 329 */           this.I00l0OO0IO = getContext();
/* 337 */           setPopupTheme(typedArray2.getResourceId(17, 0));
/* 342 */           Drawable drawableI000iOII = olilOlOiII0010I0i.I000iOII(16);
/* 346 */           if (drawableI000iOII != null) {
/* 348 */               setNavigationIcon(drawableI000iOII);
                    }
/* 353 */           CharSequence text3 = typedArray2.getText(15);
/* 361 */           if (!TextUtils.isEmpty(text3)) {
/* 363 */               setNavigationContentDescription(text3);
                    }
/* 368 */           Drawable drawableI000iOII2 = olilOlOiII0010I0i.I000iOII(11);
/* 372 */           if (drawableI000iOII2 != null) {
/* 374 */               setLogo(drawableI000iOII2);
                    }
/* 379 */           CharSequence text4 = typedArray2.getText(12);
/* 387 */           if (!TextUtils.isEmpty(text4)) {
/* 389 */               setLogoDescription(text4);
                    }
/* 398 */           if (typedArray2.hasValue(29)) {
/* 404 */               setTitleTextColor(olilOlOiII0010I0i.I000OiO(29));
                    }
/* 413 */           if (typedArray2.hasValue(20)) {
/* 419 */               setSubtitleTextColor(olilOlOiII0010I0i.I000OiO(20));
                    }
/* 426 */           if (typedArray2.hasValue(14)) {
/* 440 */               getMenuInflater().inflate(typedArray2.getResourceId(14, 0), getMenu());
                    }
/* 443 */           olilOlOiII0010I0i.I0010o();
                }

                public static Oo1OolOI I000O01llI0() {
/* 4 */             Oo1OolOI oo1OolOI = new Oo1OolOI(-2, -2);
/* 8 */             oo1OolOI.I00000oOI = 0;
/* 13 */            oo1OolOI.I00000oIO = 8388627;
/* 20 */            return oo1OolOI;
                }

                public static Oo1OolOI I000OOo1O(ViewGroup.LayoutParams layoutParams) {
/* 1 */             boolean z = layoutParams instanceof Oo1OolOI;
/* 4 */             if (z) {
/* 8 */                 Oo1OolOI oo1OolOI = (Oo1OolOI) layoutParams;
/* 10 */                Oo1OolOI oo1OolOI2 = new Oo1OolOI(oo1OolOI);
/* 13 */                oo1OolOI2.I00000oOI = 0;
/* 17 */                oo1OolOI2.I00000oOI = oo1OolOI.I00000oOI;
/* 19 */                return oo1OolOI2;
                    }
/* 20 */            if (z) {
/* 26 */                Oo1OolOI oo1OolOI3 = new Oo1OolOI((Oo1OolOI) layoutParams);
/* 29 */                oo1OolOI3.I00000oOI = 0;
/* 31 */                return oo1OolOI3;
                    }
/* 34 */            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
/* 64 */                Oo1OolOI oo1OolOI4 = new Oo1OolOI(layoutParams);
/* 67 */                oo1OolOI4.I00000oOI = 0;
/* 77 */                return oo1OolOI4;
                    }
/* 38 */            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
/* 40 */            Oo1OolOI oo1OolOI5 = new Oo1OolOI(marginLayoutParams);
/* 43 */            oo1OolOI5.I00000oOI = 0;
/* 47 */            ((ViewGroup.MarginLayoutParams) oo1OolOI5).leftMargin = marginLayoutParams.leftMargin;
/* 51 */            ((ViewGroup.MarginLayoutParams) oo1OolOI5).topMargin = marginLayoutParams.topMargin;
/* 55 */            ((ViewGroup.MarginLayoutParams) oo1OolOI5).rightMargin = marginLayoutParams.rightMargin;
/* 59 */            ((ViewGroup.MarginLayoutParams) oo1OolOI5).bottomMargin = marginLayoutParams.bottomMargin;
/* 61 */            return oo1OolOI5;
                }

                public static int I000iOII(View view) {
/* 5 */             ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
/* 15 */            return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
                }

                public static int I000l1(View view) {
/* 5 */             ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
/* 11 */            return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                }

                private ArrayList<MenuItem> getCurrentMenuItems() {
/* 3 */             ArrayList<MenuItem> arrayList = new ArrayList<>();
/* 6 */             Menu menu = getMenu();
/* 15 */            for (int i = 0; i < menu.size(); i++) {
/* 21 */                arrayList.add(menu.getItem(i));
                    }
/* 55 */            return arrayList;
                }

                private MenuInflater getMenuInflater() {
/* 7 */             return new OliioiiiOo(getContext());
                }

                public final void I00000oIO(int i, ArrayList arrayList) {
/* 11 */            boolean z = getLayoutDirection() == 1;
/* 12 */            int childCount = getChildCount();
/* 20 */            int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
/* 24 */            arrayList.clear();
/* 29 */            if (!z) {
/* 85 */                for (int i2 = 0; i2 < childCount; i2++) {
/* 87 */                    View childAt = getChildAt(i2);
/* 95 */                    Oo1OolOI oo1OolOI = (Oo1OolOI) childAt.getLayoutParams();
/* 99 */                    if (oo1OolOI.I00000oOI == 0 && I0010o(childAt)) {
/* 107 */                       int i3 = oo1OolOI.I00000oIO;
/* 109 */                       int layoutDirection = getLayoutDirection();
/* 117 */                       int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
/* 119 */                       if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
/* 129 */                           absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                                }
/* 130 */                       if (absoluteGravity2 == absoluteGravity) {
/* 132 */                           arrayList.add(childAt);
                                }
                            }
                        }
/* 332 */               return;
                    }
/* 32 */            for (int i4 = childCount - 1; i4 >= 0; i4--) {
/* 34 */                View childAt2 = getChildAt(i4);
/* 42 */                Oo1OolOI oo1OolOI2 = (Oo1OolOI) childAt2.getLayoutParams();
/* 46 */                if (oo1OolOI2.I00000oOI == 0 && I0010o(childAt2)) {
/* 54 */                    int i5 = oo1OolOI2.I00000oIO;
/* 56 */                    int layoutDirection2 = getLayoutDirection();
/* 64 */                    int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
/* 66 */                    if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
/* 76 */                        absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                            }
/* 77 */                    if (absoluteGravity3 == absoluteGravity) {
/* 79 */                        arrayList.add(childAt2);
                            }
                        }
                    }
                }

                public final void I00000oOI(View view, boolean z) {
/* 1 */             ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
/* 23 */            Oo1OolOI oo1OolOII000O01llI0 = layoutParams == null ? I000O01llI0() : !checkLayoutParams(layoutParams) ? I000OOo1O(layoutParams) : (Oo1OolOI) layoutParams;
/* 26 */            oo1OolOII000O01llI0.I00000oOI = 1;
/* 28 */            if (!z || this.I00l0I0l0lO1 == null) {
/* 43 */                addView(view, oo1OolOII000O01llI0);
                    } else {
/* 34 */                view.setLayoutParams(oo1OolOII000O01llI0);
/* 39 */                this.I0100i.add(view);
                    }
                }

                public final void I0000Il00O() {
/* 3 */             if (this.I00ioIO == null) {
/* 15 */                I1I0I0oii1 i1I0I0oii1 = new I1I0I0oii1(getContext(), null, R.attr.toolbarNavigationButtonStyle);
/* 18 */                this.I00ioIO = i1I0I0oii1;
/* 22 */                i1I0I0oii1.setImageDrawable(this.I00ilO0);
/* 29 */                this.I00ioIO.setContentDescription(this.I00io1l);
/* 32 */                Oo1OolOI oo1OolOII000O01llI0 = I000O01llI0();
/* 44 */                oo1OolOII000O01llI0.I00000oIO = (this.I00lll10 & 112) | 8388611;
/* 47 */                oo1OolOII000O01llI0.I00000oOI = 2;
/* 51 */                this.I00ioIO.setLayoutParams(oo1OolOII000O01llI0);
/* 54 */                I1I0I0oii1 i1I0I0oii12 = this.I00ioIO;
/* 58 */                I0I0o01l i0I0o01l = new I0I0o01l(2);
/* 61 */                i0I0o01l.I00iiI = this;
/* 63 */                VarHandle.storeStoreFence();
/* 66 */                i1I0I0oii12.setOnClickListener(i0I0o01l);
                    }
                }

                public final void I0000O() {
/* 3 */             if (this.I00oIiI10 == null) {
/* 7 */                 OiI1o01O0I oiI1o01O0I = new OiI1o01O0I();
/* 11 */                oiI1o01O0I.I00000oIO = 0;
/* 13 */                oiI1o01O0I.I00000oOI = 0;
/* 17 */                oiI1o01O0I.I0000Il00O = Integer.MIN_VALUE;
/* 19 */                oiI1o01O0I.I0000O = Integer.MIN_VALUE;
/* 21 */                oiI1o01O0I.I0000oI00 = 0;
/* 23 */                oiI1o01O0I.I0001Ioi1lo = 0;
/* 25 */                oiI1o01O0I.I000II = false;
/* 27 */                oiI1o01O0I.I000O01llI0 = false;
/* 29 */                this.I00oIiI10 = oiI1o01O0I;
                    }
                }

                public final void I0000oI00() {
/* 1 */             I0001Ioi1lo();
/* 4 */             ActionMenuView actionMenuView = this.I00iOIl;
/* 8 */             if (actionMenuView.I00o0l1o1o0 == null) {
/* 14 */                O1illlIiilIl o1illlIiilIl = (O1illlIiilIl) actionMenuView.getMenu();
/* 18 */                if (this.I010iIIOlo == null) {
/* 25 */                    this.I010iIIOlo = new Oo1OoiI(this);
                        }
/* 30 */                this.I00iOIl.setExpandedActionViewsExclusive(true);
/* 37 */                o1illlIiilIl.I00000oOI(this.I010iIIOlo, this.I00l0OO0IO);
/* 40 */                I00111O();
                    }
                }

                public final void I0001Ioi1lo() {
/* 3 */             if (this.I00iOIl == null) {
/* 11 */                ActionMenuView actionMenuView = new ActionMenuView(getContext());
/* 14 */                this.I00iOIl = actionMenuView;
/* 18 */                actionMenuView.setPopupTheme(this.I00li1OI);
/* 25 */                this.I00iOIl.setOnMenuItemClickListener(this.I010II);
/* 28 */                ActionMenuView actionMenuView2 = this.I00iOIl;
/* 34 */                O1OIll00i o1OIll00i = new O1OIll00i(25);
/* 37 */                o1OIll00i.I00iiI = this;
/* 39 */                VarHandle.storeStoreFence();
/* 42 */                actionMenuView2.getClass();
/* 45 */                actionMenuView2.I00oO101o = o1OIll00i;
/* 47 */                Oo1OolOI oo1OolOII000O01llI0 = I000O01llI0();
/* 59 */                oo1OolOII000O01llI0.I00000oIO = (this.I00lll10 & 112) | 8388613;
/* 63 */                this.I00iOIl.setLayoutParams(oo1OolOII000O01llI0);
/* 69 */                I00000oOI(this.I00iOIl, false);
                    }
                }

                public final void I000II() {
/* 3 */             if (this.I00iio == null) {
/* 18 */                this.I00iio = new I1I0I0oii1(getContext(), null, R.attr.toolbarNavigationButtonStyle);
/* 20 */                Oo1OolOI oo1OolOII000O01llI0 = I000O01llI0();
/* 32 */                oo1OolOII000O01llI0.I00000oIO = (this.I00lll10 & 112) | 8388611;
/* 36 */                this.I00iio.setLayoutParams(oo1OolOII000O01llI0);
                    }
                }

                public final int I000OiO(View view, int i) {
/* 5 */             Oo1OolOI oo1OolOI = (Oo1OolOI) view.getLayoutParams();
/* 7 */             int measuredHeight = view.getMeasuredHeight();
/* 19 */            int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
/* 22 */            int i3 = oo1OolOI.I00000oIO & 112;
/* 30 */            if (i3 != 16 && i3 != 48 && i3 != 80) {
/* 38 */                i3 = this.I00ol1 & 112;
                    }
/* 40 */            if (i3 == 48) {
/* 103 */               return getPaddingTop() - i2;
                    }
/* 42 */            if (i3 == 80) {
/* 97 */                return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) oo1OolOI).bottomMargin) - i2;
                    }
/* 44 */            int paddingTop = getPaddingTop();
/* 48 */            int paddingBottom = getPaddingBottom();
/* 52 */            int height = getHeight();
/* 60 */            int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
/* 62 */            int i4 = ((ViewGroup.MarginLayoutParams) oo1OolOI).topMargin;
/* 64 */            if (iMax < i4) {
/* 66 */                iMax = i4;
                    } else {
/* 71 */                int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
/* 72 */                int i6 = ((ViewGroup.MarginLayoutParams) oo1OolOI).bottomMargin;
/* 74 */                if (i5 < i6) {
/* 78 */                    iMax = Math.max(0, iMax - (i6 - i5));
                        }
                    }
/* 82 */            return paddingTop + iMax;
                }

                public final void I000lI() {
/* 3 */             Iterator it = this.I010I0.iterator();
/* 11 */            while (it.hasNext()) {
/* 27 */                getMenu().removeItem(((MenuItem) it.next()).getItemId());
                    }
/* 31 */            getMenu();
/* 34 */            ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
/* 38 */            getMenuInflater();
/* 47 */            Iterator it2 = ((CopyOnWriteArrayList) this.I010101Oo1lO.I00iiO).iterator();
/* 55 */            while (it2.hasNext()) {
/* 65 */                ((Ill111iO) it2.next()).I00000oIO.I000OiO();
                    }
/* 69 */            ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
/* 73 */            currentMenuItems2.removeAll(currentMenuItems);
/* 76 */            this.I010I0 = currentMenuItems2;
                }

                public final boolean I000o00OoI0I(View view) {
                    return view.getParent() == this || this.I0100i.contains(view);
                }

                public final int I000oI1ioi(View view, int i, int i2, int[] iArr) {
/* 5 */             Oo1OolOI oo1OolOI = (Oo1OolOI) view.getLayoutParams();
/* 12 */            int i3 = ((ViewGroup.MarginLayoutParams) oo1OolOI).leftMargin - iArr[0];
/* 17 */            int iMax = Math.max(0, i3) + i;
/* 23 */            iArr[0] = Math.max(0, -i3);
/* 25 */            int iI000OiO = I000OiO(view, i2);
/* 29 */            int measuredWidth = view.getMeasuredWidth();
/* 40 */            view.layout(iMax, iI000OiO, iMax + measuredWidth, view.getMeasuredHeight() + iI000OiO);
/* 46 */            return measuredWidth + ((ViewGroup.MarginLayoutParams) oo1OolOI).rightMargin + iMax;
                }

                public final int I00100l0(View view, int i, int i2, int[] iArr) {
/* 5 */             Oo1OolOI oo1OolOI = (Oo1OolOI) view.getLayoutParams();
/* 12 */            int i3 = ((ViewGroup.MarginLayoutParams) oo1OolOI).rightMargin - iArr[1];
/* 18 */            int iMax = i - Math.max(0, i3);
/* 24 */            iArr[1] = Math.max(0, -i3);
/* 26 */            int iI000OiO = I000OiO(view, i2);
/* 30 */            int measuredWidth = view.getMeasuredWidth();
/* 41 */            view.layout(iMax - measuredWidth, iI000OiO, iMax, view.getMeasuredHeight() + iI000OiO);
/* 47 */            return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) oo1OolOI).leftMargin);
                }

                public final int I00100o1O0lo(View view, int i, int i2, int i3, int i4, int[] iArr) {
/* 5 */             ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
/* 12 */            int i5 = marginLayoutParams.leftMargin - iArr[0];
/* 18 */            int i6 = marginLayoutParams.rightMargin - iArr[1];
/* 27 */            int iMax = Math.max(0, i6) + Math.max(0, i5);
/* 33 */            iArr[0] = Math.max(0, -i5);
/* 40 */            iArr[1] = Math.max(0, -i6);
/* 81 */            view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
/* 88 */            return view.getMeasuredWidth() + iMax;
                }

                public final void I0010I0i(View view, int i, int i2, int i3, int i4) {
/* 5 */             ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
/* 25 */            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
/* 46 */            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
/* 50 */            int mode = View.MeasureSpec.getMode(childMeasureSpec2);
/* 56 */            if (mode != 1073741824 && i4 >= 0) {
/* 60 */                if (mode != 0) {
/* 66 */                    i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
                        }
/* 70 */                childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    }
/* 74 */            view.measure(childMeasureSpec, childMeasureSpec2);
                }

                public final boolean I0010o(View view) {
                    return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
                }

                public final void I00111O() {
                    OnBackInvokedDispatcher onBackInvokedDispatcher;
/* 1 */             OnBackInvokedDispatcher onBackInvokedDispatcherI00000oIO = Oo1Oo1lo1.I00000oIO(this);
/* 5 */             Oo1OoiI oo1OoiI = this.I010iIIOlo;
/* 7 */             int i = 0;
/* 28 */            boolean z = (oo1OoiI == null || oo1OoiI.I00iiI == null || onBackInvokedDispatcherI00000oIO == null || !isAttachedToWindow() || !this.I010l1ol111) ? false : true;
/* 29 */            if (!z || this.I010l1O != null) {
/* 61 */                if (z || (onBackInvokedDispatcher = this.I010l1O) == null) {
/* 110 */                   return;
                        }
/* 69 */                Oo1Oo1lo1.I0000O(onBackInvokedDispatcher, this.I010l10O);
/* 73 */                this.I010l1O = null;
/* 110 */               return;
                    }
/* 35 */            OnBackInvokedCallback onBackInvokedCallbackI00000oOI = this.I010l10O;
/* 37 */            if (onBackInvokedCallbackI00000oOI == null) {
/* 41 */                Oo1Oll01II1 oo1Oll01II1 = new Oo1Oll01II1(i);
/* 44 */                oo1Oll01II1.I00iiI = this;
/* 46 */                VarHandle.storeStoreFence();
/* 49 */                onBackInvokedCallbackI00000oOI = Oo1Oo1lo1.I00000oOI(oo1Oll01II1);
/* 53 */                this.I010l10O = onBackInvokedCallbackI00000oOI;
                    }
/* 55 */            Oo1Oo1lo1.I0000Il00O(onBackInvokedDispatcherI00000oIO, onBackInvokedCallbackI00000oOI);
/* 58 */            this.I010l1O = onBackInvokedDispatcherI00000oIO;
                }

                @Override
                public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
                    return super.checkLayoutParams(layoutParams) && (layoutParams instanceof Oo1OolOI);
                }

                @Override
                public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 1 */             return I000O01llI0();
                }

                @Override
                public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 3 */             Context context = getContext();
/* 7 */             Oo1OolOI oo1OolOI = new Oo1OolOI(context, attributeSet);
/* 11 */            oo1OolOI.I00000oIO = 0;
/* 15 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OOilOli0.I00000oOI);
/* 23 */            oo1OolOI.I00000oIO = typedArrayObtainStyledAttributes.getInt(0, 0);
/* 25 */            typedArrayObtainStyledAttributes.recycle();
/* 28 */            oo1OolOI.I00000oOI = 0;
/* 77 */            return oo1OolOI;
                }

                public CharSequence getCollapseContentDescription() {
/* 1 */             I1I0I0oii1 i1I0I0oii1 = this.I00ioIO;
/* 3 */             if (i1I0I0oii1 != null) {
/* 5 */                 return i1I0I0oii1.getContentDescription();
                    }
/* 10 */            return null;
                }

                public Drawable getCollapseIcon() {
/* 1 */             I1I0I0oii1 i1I0I0oii1 = this.I00ioIO;
/* 3 */             if (i1I0I0oii1 != null) {
/* 5 */                 return i1I0I0oii1.getDrawable();
                    }
/* 10 */            return null;
                }

                public int getContentInsetEnd() {
/* 1 */             OiI1o01O0I oiI1o01O0I = this.I00oIiI10;
/* 3 */             if (oiI1o01O0I != null) {
                        return oiI1o01O0I.I000II ? oiI1o01O0I.I00000oIO : oiI1o01O0I.I00000oOI;
                    }
/* 15 */            return 0;
                }

                public int getContentInsetEndWithActions() {
/* 1 */             int i = this.I00oOio10iI1;
                    return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
                }

                public int getContentInsetLeft() {
/* 1 */             OiI1o01O0I oiI1o01O0I = this.I00oIiI10;
/* 3 */             if (oiI1o01O0I != null) {
/* 5 */                 return oiI1o01O0I.I00000oIO;
                    }
/* 8 */             return 0;
                }

                public int getContentInsetRight() {
/* 1 */             OiI1o01O0I oiI1o01O0I = this.I00oIiI10;
/* 3 */             if (oiI1o01O0I != null) {
/* 5 */                 return oiI1o01O0I.I00000oOI;
                    }
/* 8 */             return 0;
                }

                public int getContentInsetStart() {
/* 1 */             OiI1o01O0I oiI1o01O0I = this.I00oIiI10;
/* 3 */             if (oiI1o01O0I != null) {
                        return oiI1o01O0I.I000II ? oiI1o01O0I.I00000oOI : oiI1o01O0I.I00000oIO;
                    }
/* 15 */            return 0;
                }

                public int getContentInsetStartWithNavigation() {
/* 1 */             int i = this.I00oO101o;
                    return i != Integer.MIN_VALUE ? i : getContentInsetStart();
                }

                public int getCurrentContentInsetEnd() {
                    O1illlIiilIl o1illlIiilIl;
/* 1 */             ActionMenuView actionMenuView = this.I00iOIl;
                    return (actionMenuView == null || (o1illlIiilIl = actionMenuView.I00o0l1o1o0) == null || !o1illlIiilIl.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.I00oOio10iI1, 0));
                }

                public int getCurrentContentInsetLeft() {
                    return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
                }

                public int getCurrentContentInsetRight() {
                    return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
                }

                public int getCurrentContentInsetStart() {
                    return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.I00oO101o, 0)) : getContentInsetStart();
                }

                public Drawable getLogo() {
/* 1 */             I1I0I11lo i1I0I11lo = this.I00ilI0I1;
/* 3 */             if (i1I0I11lo != null) {
/* 5 */                 return i1I0I11lo.getDrawable();
                    }
/* 10 */            return null;
                }

                public CharSequence getLogoDescription() {
/* 1 */             I1I0I11lo i1I0I11lo = this.I00ilI0I1;
/* 3 */             if (i1I0I11lo != null) {
/* 5 */                 return i1I0I11lo.getContentDescription();
                    }
/* 10 */            return null;
                }

                public Menu getMenu() {
/* 1 */             I0000oI00();
/* 6 */             return this.I00iOIl.getMenu();
                }

                public View getNavButtonView() {
/* 1 */             return this.I00iio;
                }

                public CharSequence getNavigationContentDescription() {
/* 1 */             I1I0I0oii1 i1I0I0oii1 = this.I00iio;
/* 3 */             if (i1I0I0oii1 != null) {
/* 5 */                 return i1I0I0oii1.getContentDescription();
                    }
/* 10 */            return null;
                }

                public Drawable getNavigationIcon() {
/* 1 */             I1I0I0oii1 i1I0I0oii1 = this.I00iio;
/* 3 */             if (i1I0I0oii1 != null) {
/* 5 */                 return i1I0I0oii1.getDrawable();
                    }
/* 10 */            return null;
                }

                public I0I1ii0i getOuterActionMenuPresenter() {
/* 1 */             return this.I010i10l;
                }

                public Drawable getOverflowIcon() {
/* 1 */             I0000oI00();
/* 6 */             return this.I00iOIl.getOverflowIcon();
                }

                public Context getPopupContext() {
/* 1 */             return this.I00l0OO0IO;
                }

                public int getPopupTheme() {
/* 1 */             return this.I00li1OI;
                }

                public CharSequence getSubtitle() {
/* 1 */             return this.I00oli;
                }

                public final TextView getSubtitleTextView() {
/* 1 */             return this.I00iiO;
                }

                public CharSequence getTitle() {
/* 1 */             return this.I00olI;
                }

                public int getTitleMarginBottom() {
/* 1 */             return this.I00oII;
                }

                public int getTitleMarginEnd() {
/* 1 */             return this.I00o101lO;
                }

                public int getTitleMarginStart() {
/* 1 */             return this.I00o0l1o1o0;
                }

                public int getTitleMarginTop() {
/* 1 */             return this.I00oI0i;
                }

                public final TextView getTitleTextView() {
/* 1 */             return this.I00iiI;
                }

                public Ii1iOIIi getWrapper() {
                    Drawable drawable;
/* 1 */             Oo1ilOl oo1ilOl = this.I010OIo1l;
/* 3 */             if (oo1ilOl == null) {
/* 7 */                 oo1ilOl = new Oo1ilOl();
/* 11 */                oo1ilOl.I000o00OoI0I = 0;
/* 13 */                oo1ilOl.I00000oIO = this;
/* 19 */                oo1ilOl.I000O01llI0 = getTitle();
/* 25 */                oo1ilOl.I000OOo1O = getSubtitle();
/* 35 */                oo1ilOl.I000II = oo1ilOl.I000O01llI0 != null;
/* 41 */                oo1ilOl.I0001Ioi1lo = getNavigationIcon();
/* 53 */                OlilOlOiI olilOlOiII0010I0i = OlilOlOiI.I0010I0i(getContext(), null, OOilOli0.I00000oIO, R.attr.actionBarStyle);
/* 59 */                TypedArray typedArray = (TypedArray) olilOlOiII0010I0i.I00iiO;
/* 67 */                oo1ilOl.I000oI1ioi = olilOlOiII0010I0i.I000iOII(15);
/* 71 */                CharSequence text = typedArray.getText(27);
/* 79 */                if (!TextUtils.isEmpty(text)) {
/* 81 */                    oo1ilOl.I000II = true;
/* 83 */                    oo1ilOl.I000O01llI0 = text;
/* 89 */                    if ((oo1ilOl.I00000oOI & 8) != 0) {
/* 91 */                        setTitle(text);
/* 96 */                        if (oo1ilOl.I000II) {
/* 102 */                           OooiOl0ioo0i.I0000Il00O(getRootView(), text);
                                }
                            }
                        }
/* 107 */               CharSequence text2 = typedArray.getText(25);
/* 115 */               if (!TextUtils.isEmpty(text2)) {
/* 117 */                   oo1ilOl.I000OOo1O = text2;
/* 123 */                   if ((oo1ilOl.I00000oOI & 8) != 0) {
/* 125 */                       setSubtitle(text2);
                            }
                        }
/* 130 */               Drawable drawableI000iOII = olilOlOiII0010I0i.I000iOII(20);
/* 134 */               if (drawableI000iOII != null) {
/* 136 */                   oo1ilOl.I0000oI00 = drawableI000iOII;
/* 138 */                   oo1ilOl.I0000O();
                        }
/* 143 */               Drawable drawableI000iOII2 = olilOlOiII0010I0i.I000iOII(17);
/* 147 */               if (drawableI000iOII2 != null) {
/* 149 */                   oo1ilOl.I0000O = drawableI000iOII2;
/* 151 */                   oo1ilOl.I0000O();
                        }
/* 156 */               if (oo1ilOl.I0001Ioi1lo == null && (drawable = oo1ilOl.I000oI1ioi) != null) {
/* 162 */                   oo1ilOl.I0001Ioi1lo = drawable;
/* 168 */                   if ((oo1ilOl.I00000oOI & 4) != 0) {
/* 170 */                       setNavigationIcon(drawable);
                            } else {
/* 174 */                       setNavigationIcon((Drawable) null);
                            }
                        }
/* 183 */               oo1ilOl.I00000oIO(typedArray.getInt(10, 0));
/* 188 */               int resourceId = typedArray.getResourceId(9, 0);
/* 194 */               if (resourceId != 0) {
/* 204 */                   View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
/* 208 */                   View view = oo1ilOl.I0000Il00O;
/* 210 */                   if (view != null && (oo1ilOl.I00000oOI & 16) != 0) {
/* 217 */                       removeView(view);
                            }
/* 220 */                   oo1ilOl.I0000Il00O = viewInflate;
/* 222 */                   if (viewInflate != null && (oo1ilOl.I00000oOI & 16) != 0) {
/* 229 */                       addView(viewInflate);
                            }
/* 235 */                   oo1ilOl.I00000oIO(oo1ilOl.I00000oOI | 16);
                        }
/* 240 */               int layoutDimension = typedArray.getLayoutDimension(13, 0);
/* 244 */               if (layoutDimension > 0) {
/* 246 */                   ViewGroup.LayoutParams layoutParams = getLayoutParams();
/* 250 */                   layoutParams.height = layoutDimension;
/* 252 */                   setLayoutParams(layoutParams);
                        }
/* 257 */               int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
/* 262 */               int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
/* 266 */               if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
/* 270 */                   int iMax = Math.max(dimensionPixelOffset, 0);
/* 274 */                   int iMax2 = Math.max(dimensionPixelOffset2, 0);
/* 278 */                   I0000O();
/* 283 */                   this.I00oIiI10.I00000oIO(iMax, iMax2);
                        }
/* 288 */               int resourceId2 = typedArray.getResourceId(28, 0);
/* 292 */               if (resourceId2 != 0) {
/* 294 */                   Context context = getContext();
/* 298 */                   this.I00ll1 = resourceId2;
/* 300 */                   I1II01I i1ii01i = this.I00iiI;
/* 302 */                   if (i1ii01i != null) {
/* 304 */                       i1ii01i.setTextAppearance(context, resourceId2);
                            }
                        }
/* 309 */               int resourceId3 = typedArray.getResourceId(26, 0);
/* 313 */               if (resourceId3 != 0) {
/* 315 */                   Context context2 = getContext();
/* 319 */                   this.I00lli11 = resourceId3;
/* 321 */                   I1II01I i1ii01i2 = this.I00iiO;
/* 323 */                   if (i1ii01i2 != null) {
/* 325 */                       i1ii01i2.setTextAppearance(context2, resourceId3);
                            }
                        }
/* 330 */               int resourceId4 = typedArray.getResourceId(22, 0);
/* 334 */               if (resourceId4 != 0) {
/* 336 */                   setPopupTheme(resourceId4);
                        }
/* 339 */               olilOlOiII0010I0i.I0010o();
/* 347 */               if (R.string.abc_action_bar_up_description != oo1ilOl.I000o00OoI0I) {
/* 350 */                   oo1ilOl.I000o00OoI0I = R.string.abc_action_bar_up_description;
/* 360 */                   if (TextUtils.isEmpty(getNavigationContentDescription())) {
/* 362 */                       int i = oo1ilOl.I000o00OoI0I;
/* 376 */                       oo1ilOl.I000OiO = i == 0 ? null : getContext().getString(i);
/* 378 */                       oo1ilOl.I0000Il00O();
                            }
                        }
/* 385 */               oo1ilOl.I000OiO = getNavigationContentDescription();
/* 389 */               Oo1iOI0 oo1iOI0 = new Oo1iOI0();
/* 392 */               oo1iOI0.I00iiI = oo1ilOl;
/* 396 */               Context context3 = getContext();
/* 400 */               CharSequence charSequence = oo1ilOl.I000O01llI0;
/* 402 */               I0I1101l0 i0I1101l0 = new I0I1101l0();
/* 407 */               i0I1101l0.I0000oI00 = Barcode.FORMAT_AZTEC;
/* 409 */               i0I1101l0.I000II = Barcode.FORMAT_AZTEC;
/* 411 */               i0I1101l0.I000l1 = null;
/* 413 */               i0I1101l0.I000lI = null;
/* 415 */               i0I1101l0.I000o00OoI0I = false;
/* 417 */               i0I1101l0.I000oI1ioi = false;
/* 419 */               i0I1101l0.I00100l0 = 16;
/* 421 */               i0I1101l0.I000OOo1O = context3;
/* 423 */               i0I1101l0.I00000oIO = charSequence;
/* 425 */               VarHandle.storeStoreFence();
/* 428 */               oo1iOI0.I00iOIl = i0I1101l0;
/* 430 */               VarHandle.storeStoreFence();
/* 433 */               setNavigationOnClickListener(oo1iOI0);
/* 436 */               this.I010OIo1l = oo1ilOl;
                    }
/* 743 */           return oo1ilOl;
                }

                @Override
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             I00111O();
                }

                @Override
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 6 */             removeCallbacks(this.I010lI0oi);
/* 9 */             I00111O();
                }

                @Override
                public final boolean onHoverEvent(MotionEvent motionEvent) {
/* 1 */             int actionMasked = motionEvent.getActionMasked();
/* 8 */             if (actionMasked == 9) {
/* 10 */                this.I00ooiO1I = false;
                    }
/* 15 */            if (!this.I00ooiO1I) {
/* 17 */                boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
/* 21 */                if (actionMasked == 9 && !zOnHoverEvent) {
/* 25 */                    this.I00ooiO1I = true;
                        }
                    }
/* 29 */            if (actionMasked != 10 && actionMasked != 3) {
/* 14 */                return true;
                    }
/* 36 */            this.I00ooiO1I = false;
/* 14 */            return true;
                }

                /* JADX WARN: Removed duplicated region for block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:118:0x0303  */
                /* JADX WARN: Removed duplicated region for block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x015a  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x01a0  */
                /* JADX WARN: Removed duplicated region for block: B:93:0x020e  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    int iI000oI1ioi;
                    int iI00100l0;
                    int iMax;
                    boolean zI0010o;
                    boolean zI0010o2;
                    boolean z2;
                    int measuredHeight;
                    int i5;
                    int paddingTop;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    int size;
                    int iI000oI1ioi2;
                    int i10;
                    int size2;
                    int i11;
                    int size3;
                    int i12;
                    int i13;
                    int i14;
                    int size4;
/* 13 */            boolean z3 = getLayoutDirection() == 1;
/* 14 */            int width = getWidth();
/* 18 */            int height = getHeight();
/* 22 */            int paddingLeft = getPaddingLeft();
/* 26 */            int paddingRight = getPaddingRight();
/* 30 */            int paddingTop2 = getPaddingTop();
/* 34 */            int paddingBottom = getPaddingBottom();
/* 38 */            int i15 = width - paddingRight;
/* 40 */            int[] iArr = this.I0100o111I;
/* 42 */            iArr[1] = 0;
/* 44 */            iArr[0] = 0;
/* 46 */            WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 48 */            int minimumHeight = getMinimumHeight();
/* 61 */            int iMin = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
/* 68 */            if (I0010o(this.I00iio)) {
/* 70 */                I1I0I0oii1 i1I0I0oii1 = this.I00iio;
/* 72 */                if (z3) {
/* 74 */                    iI00100l0 = I00100l0(i1I0I0oii1, i15, iMin, iArr);
/* 79 */                    iI000oI1ioi = paddingLeft;
/* 95 */                    if (I0010o(this.I00ioIO)) {
/* 97 */                        I1I0I0oii1 i1I0I0oii12 = this.I00ioIO;
/* 99 */                        if (z3) {
/* 101 */                           iI00100l0 = I00100l0(i1I0I0oii12, iI00100l0, iMin, iArr);
                                } else {
/* 106 */                           iI000oI1ioi = I000oI1ioi(i1I0I0oii12, iI000oI1ioi, iMin, iArr);
                                }
                            }
/* 116 */                   if (I0010o(this.I00iOIl)) {
/* 118 */                       ActionMenuView actionMenuView = this.I00iOIl;
/* 120 */                       if (z3) {
/* 122 */                           iI000oI1ioi = I000oI1ioi(actionMenuView, iI000oI1ioi, iMin, iArr);
                                } else {
/* 127 */                           iI00100l0 = I00100l0(actionMenuView, iI00100l0, iMin, iArr);
                                }
                            }
/* 131 */                   int currentContentInsetLeft = getCurrentContentInsetLeft();
/* 135 */                   int currentContentInsetRight = getCurrentContentInsetRight();
/* 147 */                   iArr[0] = Math.max(0, currentContentInsetLeft - iI000oI1ioi);
/* 157 */                   iArr[1] = Math.max(0, currentContentInsetRight - (i15 - iI00100l0));
/* 159 */                   iMax = Math.max(iI000oI1ioi, currentContentInsetLeft);
/* 165 */                   int iMin2 = Math.min(iI00100l0, i15 - currentContentInsetRight);
/* 175 */                   if (I0010o(this.I00l0I0l0lO1)) {
/* 177 */                       View view = this.I00l0I0l0lO1;
/* 179 */                       if (z3) {
/* 181 */                           iMin2 = I00100l0(view, iMin2, iMin, iArr);
                                } else {
/* 186 */                           iMax = I000oI1ioi(view, iMax, iMin, iArr);
                                }
                            }
/* 196 */                   if (I0010o(this.I00ilI0I1)) {
/* 198 */                       I1I0I11lo i1I0I11lo = this.I00ilI0I1;
/* 200 */                       if (z3) {
/* 202 */                           iMin2 = I00100l0(i1I0I11lo, iMin2, iMin, iArr);
                                } else {
/* 207 */                           iMax = I000oI1ioi(i1I0I11lo, iMax, iMin, iArr);
                                }
                            }
/* 213 */                   zI0010o = I0010o(this.I00iiI);
/* 219 */                   zI0010o2 = I0010o(this.I00iiO);
/* 223 */                   if (zI0010o) {
/* 248 */                       z2 = z3;
/* 250 */                       measuredHeight = 0;
                            } else {
/* 231 */                       Oo1OolOI oo1OolOI = (Oo1OolOI) this.I00iiI.getLayoutParams();
/* 235 */                       z2 = z3;
/* 246 */                       measuredHeight = this.I00iiI.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) oo1OolOI).topMargin + ((ViewGroup.MarginLayoutParams) oo1OolOI).bottomMargin;
                            }
/* 251 */                   if (!zI0010o2) {
/* 259 */                       Oo1OolOI oo1OolOI2 = (Oo1OolOI) this.I00iiO.getLayoutParams();
/* 275 */                       measuredHeight = this.I00iiO.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) oo1OolOI2).topMargin + ((ViewGroup.MarginLayoutParams) oo1OolOI2).bottomMargin + measuredHeight;
                            }
/* 280 */                   if (!zI0010o || zI0010o2) {
/* 289 */                       I1II01I i1ii01i = !zI0010o ? this.I00iiI : this.I00iiO;
/* 296 */                       I1II01I i1ii01i2 = !zI0010o2 ? this.I00iiO : this.I00iiI;
/* 302 */                       Oo1OolOI oo1OolOI3 = (Oo1OolOI) i1ii01i.getLayoutParams();
/* 308 */                       Oo1OolOI oo1OolOI4 = (Oo1OolOI) i1ii01i2.getLayoutParams();
/* 310 */                       int i16 = measuredHeight;
/* 335 */                       boolean z4 = (zI0010o && this.I00iiI.getMeasuredWidth() > 0) || (zI0010o2 && this.I00iiO.getMeasuredWidth() > 0);
/* 339 */                       i5 = this.I00ol1 & 112;
/* 341 */                       int i17 = iMax;
/* 345 */                       if (i5 == 48) {
/* 413 */                           paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) oo1OolOI3).topMargin + this.I00oI0i;
                                } else if (i5 != 80) {
/* 356 */                           int iMax2 = (((height - paddingTop2) - paddingBottom) - i16) / 2;
/* 364 */                           int i18 = ((ViewGroup.MarginLayoutParams) oo1OolOI3).topMargin + this.I00oI0i;
/* 366 */                           if (iMax2 < i18) {
/* 368 */                               iMax2 = i18;
                                    } else {
/* 374 */                               int i19 = (((height - paddingBottom) - i16) - iMax2) - paddingTop2;
/* 375 */                               int i20 = ((ViewGroup.MarginLayoutParams) oo1OolOI3).bottomMargin;
/* 377 */                               int i21 = this.I00oII;
/* 380 */                               if (i19 < i20 + i21) {
/* 388 */                                   iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) oo1OolOI4).bottomMargin + i21) - i19));
                                        }
                                    }
/* 392 */                           paddingTop = paddingTop2 + iMax2;
                                } else {
/* 401 */                           paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) oo1OolOI4).bottomMargin) - this.I00oII) - i16;
                                }
/* 415 */                       if (z2) {
/* 425 */                           int i22 = (z4 ? this.I00o0l1o1o0 : 0) - iArr[1];
/* 431 */                           iMin2 -= Math.max(0, i22);
/* 437 */                           iArr[1] = Math.max(0, -i22);
/* 439 */                           if (zI0010o) {
/* 447 */                               Oo1OolOI oo1OolOI5 = (Oo1OolOI) this.I00iiI.getLayoutParams();
/* 455 */                               int measuredWidth = iMin2 - this.I00iiI.getMeasuredWidth();
/* 463 */                               int measuredHeight2 = this.I00iiI.getMeasuredHeight() + paddingTop;
/* 466 */                               this.I00iiI.layout(measuredWidth, paddingTop, iMin2, measuredHeight2);
/* 471 */                               i8 = measuredWidth - this.I00o101lO;
/* 474 */                               paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) oo1OolOI5).bottomMargin;
                                    } else {
/* 477 */                               i8 = iMin2;
                                    }
/* 478 */                           if (zI0010o2) {
/* 490 */                               int i23 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Oo1OolOI) this.I00iiO.getLayoutParams())).topMargin;
/* 508 */                               this.I00iiO.layout(iMin2 - this.I00iiO.getMeasuredWidth(), i23, iMin2, this.I00iiO.getMeasuredHeight() + i23);
/* 513 */                               i9 = iMin2 - this.I00o101lO;
                                    } else {
/* 516 */                               i9 = iMin2;
                                    }
/* 517 */                           if (z4) {
/* 519 */                               iMin2 = Math.min(i8, i9);
                                    }
/* 524 */                           iMax = i17;
                                } else {
/* 537 */                           int i24 = (z4 ? this.I00o0l1o1o0 : 0) - iArr[0];
/* 542 */                           iMax = Math.max(0, i24) + i17;
/* 549 */                           iArr[0] = Math.max(0, -i24);
/* 551 */                           if (zI0010o) {
/* 559 */                               Oo1OolOI oo1OolOI6 = (Oo1OolOI) this.I00iiI.getLayoutParams();
/* 567 */                               int measuredWidth2 = this.I00iiI.getMeasuredWidth() + iMax;
/* 574 */                               int measuredHeight3 = this.I00iiI.getMeasuredHeight() + paddingTop;
/* 577 */                               this.I00iiI.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
/* 582 */                               i6 = measuredWidth2 + this.I00o101lO;
/* 585 */                               paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) oo1OolOI6).bottomMargin;
                                    } else {
/* 588 */                               i6 = iMax;
                                    }
/* 589 */                           if (zI0010o2) {
/* 601 */                               int i25 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Oo1OolOI) this.I00iiO.getLayoutParams())).topMargin;
/* 608 */                               int measuredWidth3 = this.I00iiO.getMeasuredWidth() + iMax;
/* 618 */                               this.I00iiO.layout(iMax, i25, measuredWidth3, this.I00iiO.getMeasuredHeight() + i25);
/* 623 */                               i7 = measuredWidth3 + this.I00o101lO;
                                    } else {
/* 625 */                               i7 = iMax;
                                    }
/* 626 */                           if (z4) {
/* 628 */                               iMax = Math.max(i6, i7);
                                    }
                                }
                            }
/* 633 */                   ArrayList arrayList = this.I00oooO;
/* 635 */                   I00000oIO(3, arrayList);
/* 638 */                   size = arrayList.size();
/* 642 */                   iI000oI1ioi2 = iMax;
/* 644 */                   for (i10 = 0; i10 < size; i10++) {
/* 652 */                       iI000oI1ioi2 = I000oI1ioi((View) arrayList.get(i10), iI000oI1ioi2, iMin, iArr);
                            }
/* 660 */                   I00000oIO(5, arrayList);
/* 663 */                   size2 = arrayList.size();
/* 668 */                   for (i11 = 0; i11 < size2; i11++) {
/* 676 */                       iMin2 = I00100l0((View) arrayList.get(i11), iMin2, iMin, iArr);
                            }
/* 685 */                   I00000oIO(1, arrayList);
/* 689 */                   int i26 = iArr[0];
/* 691 */                   int i27 = iArr[1];
/* 693 */                   size3 = arrayList.size();
/* 697 */                   int i28 = i26;
/* 698 */                   i12 = 0;
/* 699 */                   int measuredWidth4 = 0;
/* 700 */                   while (i12 < size3) {
/* 706 */                       View view2 = (View) arrayList.get(i12);
/* 712 */                       Oo1OolOI oo1OolOI7 = (Oo1OolOI) view2.getLayoutParams();
/* 714 */                       int i29 = i27;
/* 718 */                       int i30 = ((ViewGroup.MarginLayoutParams) oo1OolOI7).leftMargin - i28;
/* 721 */                       int i31 = ((ViewGroup.MarginLayoutParams) oo1OolOI7).rightMargin - i29;
/* 724 */                       int iMax3 = Math.max(0, i30);
/* 728 */                       int iMax4 = Math.max(0, i31);
/* 733 */                       int iMax5 = Math.max(0, -i30);
/* 738 */                       int iMax6 = Math.max(0, -i31);
/* 750 */                       measuredWidth4 += view2.getMeasuredWidth() + iMax3 + iMax4;
/* 751 */                       i12++;
/* 755 */                       i28 = iMax5;
/* 756 */                       i27 = iMax6;
                            }
/* 767 */                   i14 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth4 / 2);
/* 768 */                   int i32 = measuredWidth4 + i14;
/* 769 */                   if (i14 >= iI000oI1ioi2) {
/* 778 */                       iI000oI1ioi2 = i32 > iMin2 ? i14 - (i32 - iMin2) : i14;
                            }
/* 779 */                   size4 = arrayList.size();
/* 783 */                   for (i13 = 0; i13 < size4; i13++) {
/* 791 */                       iI000oI1ioi2 = I000oI1ioi((View) arrayList.get(i13), iI000oI1ioi2, iMin, iArr);
                            }
/* 798 */                   arrayList.clear();
                        }
/* 81 */                iI000oI1ioi = I000oI1ioi(i1I0I0oii1, paddingLeft, iMin, iArr);
                    } else {
/* 87 */                iI000oI1ioi = paddingLeft;
                    }
/* 85 */            iI00100l0 = i15;
/* 95 */            if (I0010o(this.I00ioIO)) {
                    }
/* 116 */           if (I0010o(this.I00iOIl)) {
                    }
/* 131 */           int currentContentInsetLeft2 = getCurrentContentInsetLeft();
/* 135 */           int currentContentInsetRight2 = getCurrentContentInsetRight();
/* 147 */           iArr[0] = Math.max(0, currentContentInsetLeft2 - iI000oI1ioi);
/* 157 */           iArr[1] = Math.max(0, currentContentInsetRight2 - (i15 - iI00100l0));
/* 159 */           iMax = Math.max(iI000oI1ioi, currentContentInsetLeft2);
/* 165 */           int iMin22 = Math.min(iI00100l0, i15 - currentContentInsetRight2);
/* 175 */           if (I0010o(this.I00l0I0l0lO1)) {
                    }
/* 196 */           if (I0010o(this.I00ilI0I1)) {
                    }
/* 213 */           zI0010o = I0010o(this.I00iiI);
/* 219 */           zI0010o2 = I0010o(this.I00iiO);
/* 223 */           if (zI0010o) {
                    }
/* 251 */           if (!zI0010o2) {
                    }
/* 280 */           if (!zI0010o) {
/* 289 */               if (!zI0010o) {
                        }
/* 296 */               if (!zI0010o2) {
                        }
/* 302 */               Oo1OolOI oo1OolOI32 = (Oo1OolOI) i1ii01i.getLayoutParams();
/* 308 */               Oo1OolOI oo1OolOI42 = (Oo1OolOI) i1ii01i2.getLayoutParams();
/* 310 */               int i162 = measuredHeight;
/* 335 */               if (zI0010o) {
/* 339 */                   i5 = this.I00ol1 & 112;
/* 341 */                   int i172 = iMax;
/* 345 */                   if (i5 == 48) {
                            }
/* 415 */                   if (z2) {
                            }
                        } else {
/* 339 */                   i5 = this.I00ol1 & 112;
/* 341 */                   int i1722 = iMax;
/* 345 */                   if (i5 == 48) {
                            }
/* 415 */                   if (z2) {
                            }
                        }
                    }
/* 633 */           ArrayList arrayList2 = this.I00oooO;
/* 635 */           I00000oIO(3, arrayList2);
/* 638 */           size = arrayList2.size();
/* 642 */           iI000oI1ioi2 = iMax;
/* 644 */           while (i10 < size) {
                    }
/* 660 */           I00000oIO(5, arrayList2);
/* 663 */           size2 = arrayList2.size();
/* 668 */           while (i11 < size2) {
                    }
/* 685 */           I00000oIO(1, arrayList2);
/* 689 */           int i262 = iArr[0];
/* 691 */           int i272 = iArr[1];
/* 693 */           size3 = arrayList2.size();
/* 697 */           int i282 = i262;
/* 698 */           i12 = 0;
/* 699 */           int measuredWidth42 = 0;
/* 700 */           while (i12 < size3) {
                    }
/* 767 */           i14 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth42 / 2);
/* 768 */           int i322 = measuredWidth42 + i14;
/* 769 */           if (i14 >= iI000oI1ioi2) {
                    }
/* 779 */           size4 = arrayList2.size();
/* 783 */           while (i13 < size4) {
                    }
/* 798 */           arrayList2.clear();
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final void onMeasure(int i, int i2) {
                    char c;
                    Object[] objArr;
                    int iI000iOII;
                    int iMax;
                    int iCombineMeasuredStates;
                    int iI000iOII2;
                    int iI000l1;
                    int iCombineMeasuredStates2;
                    int iMax2;
/* 5 */             int i3 = 0;
/* 7 */             if (getLayoutDirection() == 1) {
/* 9 */                 objArr = true;
/* 10 */                c = 0;
                    } else {
/* 12 */                c = 1;
/* 13 */                objArr = false;
                    }
/* 21 */            if (I0010o(this.I00iio)) {
/* 31 */                I0010I0i(this.I00iio, i, 0, i2, this.I00o0iI0io1);
/* 46 */                iI000iOII = I000iOII(this.I00iio) + this.I00iio.getMeasuredWidth();
/* 60 */                iMax = Math.max(0, I000l1(this.I00iio) + this.I00iio.getMeasuredHeight());
/* 70 */                iCombineMeasuredStates = View.combineMeasuredStates(0, this.I00iio.getMeasuredState());
                    } else {
/* 77 */                iI000iOII = 0;
/* 78 */                iMax = 0;
/* 79 */                iCombineMeasuredStates = 0;
                    }
/* 86 */            if (I0010o(this.I00ioIO)) {
/* 96 */                I0010I0i(this.I00ioIO, i, 0, i2, this.I00o0iI0io1);
/* 111 */               iI000iOII = I000iOII(this.I00ioIO) + this.I00ioIO.getMeasuredWidth();
/* 125 */               iMax = Math.max(iMax, I000l1(this.I00ioIO) + this.I00ioIO.getMeasuredHeight());
/* 135 */               iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.I00ioIO.getMeasuredState());
                    }
/* 139 */           int currentContentInsetStart = getCurrentContentInsetStart();
/* 143 */           int iMax3 = Math.max(currentContentInsetStart, iI000iOII);
/* 148 */           int iMax4 = Math.max(0, currentContentInsetStart - iI000iOII);
/* 152 */           Object[] objArr2 = objArr;
/* 153 */           int[] iArr = this.I0100o111I;
/* 155 */           iArr[objArr2 == true ? 1 : 0] = iMax4;
/* 163 */           if (I0010o(this.I00iOIl)) {
/* 173 */               I0010I0i(this.I00iOIl, i, iMax3, i2, this.I00o0iI0io1);
/* 188 */               iI000iOII2 = I000iOII(this.I00iOIl) + this.I00iOIl.getMeasuredWidth();
/* 202 */               iMax = Math.max(iMax, I000l1(this.I00iOIl) + this.I00iOIl.getMeasuredHeight());
/* 212 */               iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.I00iOIl.getMeasuredState());
                    } else {
/* 217 */               iI000iOII2 = 0;
                    }
/* 218 */           int currentContentInsetEnd = getCurrentContentInsetEnd();
/* 226 */           int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iI000iOII2);
/* 232 */           iArr[c] = Math.max(0, currentContentInsetEnd - iI000iOII2);
/* 240 */           if (I0010o(this.I00l0I0l0lO1)) {
/* 253 */               iMax5 += I00100o1O0lo(this.I00l0I0l0lO1, i, iMax5, i2, 0, iArr);
/* 267 */               iMax = Math.max(iMax, I000l1(this.I00l0I0l0lO1) + this.I00l0I0l0lO1.getMeasuredHeight());
/* 277 */               iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.I00l0I0l0lO1.getMeasuredState());
                    }
/* 287 */           if (I0010o(this.I00ilI0I1)) {
/* 300 */               iMax5 += I00100o1O0lo(this.I00ilI0I1, i, iMax5, i2, 0, iArr);
/* 314 */               iMax = Math.max(iMax, I000l1(this.I00ilI0I1) + this.I00ilI0I1.getMeasuredHeight());
/* 324 */               iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.I00ilI0I1.getMeasuredState());
                    }
/* 328 */           int childCount = getChildCount();
/* 333 */           for (int i4 = 0; i4 < childCount; i4++) {
/* 335 */               View childAt = getChildAt(i4);
/* 347 */               if (((Oo1OolOI) childAt.getLayoutParams()).I00000oOI == 0 && I0010o(childAt)) {
/* 367 */                   iMax5 += I00100o1O0lo(childAt, i, iMax5, i2, 0, iArr);
/* 378 */                   int iMax6 = Math.max(iMax, I000l1(childAt) + childAt.getMeasuredHeight());
/* 386 */                   iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
/* 391 */                   iMax = iMax6;
                        } else {
/* 393 */                   iMax5 = iMax5;
                        }
                    }
/* 397 */           int i5 = iMax5;
/* 402 */           int i6 = this.I00oI0i + this.I00oII;
/* 408 */           int i7 = this.I00o0l1o1o0 + this.I00o101lO;
/* 416 */           if (I0010o(this.I00iiI)) {
/* 426 */               I00100o1O0lo(this.I00iiI, i, i5 + i7, i2, i6, iArr);
/* 441 */               int iI000iOII3 = I000iOII(this.I00iiI) + this.I00iiI.getMeasuredWidth();
/* 454 */               iI000l1 = I000l1(this.I00iiI) + this.I00iiI.getMeasuredHeight();
/* 461 */               iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.I00iiI.getMeasuredState());
/* 467 */               iMax2 = iI000iOII3;
                    } else {
/* 469 */               iI000l1 = 0;
/* 470 */               iCombineMeasuredStates2 = iCombineMeasuredStates;
/* 471 */               iMax2 = 0;
                    }
/* 478 */           if (I0010o(this.I00iiO)) {
/* 493 */               iMax2 = Math.max(iMax2, I00100o1O0lo(this.I00iiO, i, i5 + i7, i2, i6 + iI000l1, iArr));
/* 510 */               iI000l1 += I000l1(this.I00iiO) + this.I00iiO.getMeasuredHeight();
/* 517 */               iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.I00iiO.getMeasuredState());
                    }
/* 523 */           int iMax7 = Math.max(iMax, iI000l1);
/* 536 */           int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
/* 546 */           int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
/* 558 */           int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
/* 574 */           int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
/* 580 */           if (!this.I010ioo) {
/* 612 */               i3 = iResolveSizeAndState2;
                        break;
                    }
/* 583 */           int childCount2 = getChildCount();
/* 588 */           for (int i8 = 0; i8 < childCount2; i8++) {
/* 590 */               View childAt2 = getChildAt(i8);
/* 598 */               if (I0010o(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
/* 612 */                   i3 = iResolveSizeAndState2;
                            break;
                        }
                    }
/* 617 */           setMeasuredDimension(iResolveSizeAndState, i3);
                }

                @Override
                public final void onRestoreInstanceState(Parcelable parcelable) {
                    MenuItem menuItemFindItem;
/* 3 */             if (!(parcelable instanceof Oo1i1OOOOI)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             Oo1i1OOOOI oo1i1OOOOI = (Oo1i1OOOOI) parcelable;
/* 13 */            super.onRestoreInstanceState(oo1i1OOOOI.I00iOIl);
/* 16 */            ActionMenuView actionMenuView = this.I00iOIl;
/* 23 */            O1illlIiilIl o1illlIiilIl = actionMenuView != null ? actionMenuView.I00o0l1o1o0 : null;
/* 24 */            int i = oo1i1OOOOI.I00iiO;
/* 26 */            if (i != 0 && this.I010iIIOlo != null && o1illlIiilIl != null && (menuItemFindItem = o1illlIiilIl.findItem(i)) != null) {
/* 40 */                menuItemFindItem.expandActionView();
                    }
/* 45 */            if (oo1i1OOOOI.I00iio) {
/* 47 */                I0lil01 i0lil01 = this.I010lI0oi;
/* 49 */                removeCallbacks(i0lil01);
/* 52 */                post(i0lil01);
                    }
                }

                @Override
                public final void onRtlPropertiesChanged(int i) {
/* 1 */             super.onRtlPropertiesChanged(i);
/* 4 */             I0000O();
/* 7 */             OiI1o01O0I oiI1o01O0I = this.I00oIiI10;
/* 10 */            boolean z = i == 1;
/* 16 */            if (z == oiI1o01O0I.I000II) {
/* 18 */                return;
                    }
/* 19 */            oiI1o01O0I.I000II = z;
/* 23 */            if (!oiI1o01O0I.I000O01llI0) {
/* 69 */                oiI1o01O0I.I00000oIO = oiI1o01O0I.I0000oI00;
/* 73 */                oiI1o01O0I.I00000oOI = oiI1o01O0I.I0001Ioi1lo;
/* 77 */                return;
                    }
/* 27 */            if (z) {
/* 29 */                int i2 = oiI1o01O0I.I0000O;
/* 31 */                if (i2 == Integer.MIN_VALUE) {
/* 34 */                    i2 = oiI1o01O0I.I0000oI00;
                        }
/* 36 */                oiI1o01O0I.I00000oIO = i2;
/* 38 */                int i3 = oiI1o01O0I.I0000Il00O;
/* 40 */                if (i3 == Integer.MIN_VALUE) {
/* 43 */                    i3 = oiI1o01O0I.I0001Ioi1lo;
                        }
/* 45 */                oiI1o01O0I.I00000oOI = i3;
/* 47 */                return;
                    }
/* 48 */            int i4 = oiI1o01O0I.I0000Il00O;
/* 50 */            if (i4 == Integer.MIN_VALUE) {
/* 53 */                i4 = oiI1o01O0I.I0000oI00;
                    }
/* 55 */            oiI1o01O0I.I00000oIO = i4;
/* 57 */            int i5 = oiI1o01O0I.I0000O;
/* 59 */            if (i5 == Integer.MIN_VALUE) {
/* 62 */                i5 = oiI1o01O0I.I0001Ioi1lo;
                    }
/* 64 */            oiI1o01O0I.I00000oOI = i5;
                }

                @Override
                public final Parcelable onSaveInstanceState() {
                    I0I1ii0i i0I1ii0i;
                    O1ioIIl o1ioIIl;
/* 7 */             Oo1i1OOOOI oo1i1OOOOI = new Oo1i1OOOOI(super.onSaveInstanceState());
/* 10 */            Oo1OoiI oo1OoiI = this.I010iIIOlo;
/* 12 */            if (oo1OoiI != null && (o1ioIIl = oo1OoiI.I00iiI) != null) {
/* 20 */                oo1i1OOOOI.I00iiO = o1ioIIl.I00000oIO;
                    }
/* 22 */            ActionMenuView actionMenuView = this.I00iOIl;
/* 39 */            oo1i1OOOOI.I00iio = (actionMenuView == null || (i0I1ii0i = actionMenuView.I00oIiI10) == null || !i0I1ii0i.I000OiO()) ? false : true;
/* 55 */            return oo1i1OOOOI;
                }

                @Override
                public final boolean onTouchEvent(MotionEvent motionEvent) {
/* 1 */             int actionMasked = motionEvent.getActionMasked();
/* 6 */             if (actionMasked == 0) {
/* 8 */                 this.I00ooIo0 = false;
                    }
/* 13 */            if (!this.I00ooIo0) {
/* 15 */                boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
/* 19 */                if (actionMasked == 0 && !zOnTouchEvent) {
/* 23 */                    this.I00ooIo0 = true;
                        }
                    }
/* 25 */            if (actionMasked != 1 && actionMasked != 3) {
/* 12 */                return true;
                    }
/* 32 */            this.I00ooIo0 = false;
/* 12 */            return true;
                }

                public void setBackInvokedCallbackEnabled(boolean z) {
/* 3 */             if (this.I010l1ol111 != z) {
/* 5 */                 this.I010l1ol111 = z;
/* 7 */                 I00111O();
                    }
                }

                public void setCollapseContentDescription(CharSequence charSequence) {
/* 5 */             if (!TextUtils.isEmpty(charSequence)) {
/* 7 */                 I0000Il00O();
                    }
/* 10 */            I1I0I0oii1 i1I0I0oii1 = this.I00ioIO;
/* 12 */            if (i1I0I0oii1 != null) {
/* 14 */                i1I0I0oii1.setContentDescription(charSequence);
                    }
                }

                public void setCollapseIcon(Drawable drawable) {
/* 1 */             if (drawable != null) {
/* 3 */                 I0000Il00O();
/* 8 */                 this.I00ioIO.setImageDrawable(drawable);
                    } else {
/* 12 */                I1I0I0oii1 i1I0I0oii1 = this.I00ioIO;
/* 14 */                if (i1I0I0oii1 != null) {
/* 18 */                    i1I0I0oii1.setImageDrawable(this.I00ilO0);
                        }
                    }
                }

                public void setCollapsible(boolean z) {
/* 1 */             this.I010ioo = z;
/* 3 */             requestLayout();
                }

                public void setContentInsetEndWithActions(int i) {
/* 1 */             if (i < 0) {
/* 3 */                 i = Integer.MIN_VALUE;
                    }
/* 7 */             if (i != this.I00oOio10iI1) {
/* 9 */                 this.I00oOio10iI1 = i;
/* 15 */                if (getNavigationIcon() != null) {
/* 17 */                    requestLayout();
                        }
                    }
                }

                public void setContentInsetStartWithNavigation(int i) {
/* 1 */             if (i < 0) {
/* 3 */                 i = Integer.MIN_VALUE;
                    }
/* 7 */             if (i != this.I00oO101o) {
/* 9 */                 this.I00oO101o = i;
/* 15 */                if (getNavigationIcon() != null) {
/* 17 */                    requestLayout();
                        }
                    }
                }

                public void setLogo(Drawable drawable) {
/* 1 */             I1I0I11lo i1I0I11lo = this.I00ilI0I1;
/* 3 */             if (drawable != null) {
/* 5 */                 if (i1I0I11lo == null) {
/* 15 */                    i1I0I11lo = new I1I0I11lo(getContext(), null, 0);
/* 18 */                    this.I00ilI0I1 = i1I0I11lo;
                        }
/* 24 */                if (!I000o00OoI0I(i1I0I11lo)) {
/* 29 */                    I00000oOI(this.I00ilI0I1, true);
                        }
                    } else if (i1I0I11lo != null && I000o00OoI0I(i1I0I11lo)) {
/* 43 */                removeView(this.I00ilI0I1);
/* 50 */                this.I0100i.remove(this.I00ilI0I1);
                    }
/* 53 */            I1I0I11lo i1I0I11lo2 = this.I00ilI0I1;
/* 55 */            if (i1I0I11lo2 != null) {
/* 57 */                i1I0I11lo2.setImageDrawable(drawable);
                    }
                }

                public void setLogoDescription(CharSequence charSequence) {
/* 5 */             if (!TextUtils.isEmpty(charSequence) && this.I00ilI0I1 == null) {
/* 22 */                this.I00ilI0I1 = new I1I0I11lo(getContext(), null, 0);
                    }
/* 24 */            I1I0I11lo i1I0I11lo = this.I00ilI0I1;
/* 26 */            if (i1I0I11lo != null) {
/* 28 */                i1I0I11lo.setContentDescription(charSequence);
                    }
                }

                public void setNavigationContentDescription(CharSequence charSequence) {
/* 5 */             if (!TextUtils.isEmpty(charSequence)) {
/* 7 */                 I000II();
                    }
/* 10 */            I1I0I0oii1 i1I0I0oii1 = this.I00iio;
/* 12 */            if (i1I0I0oii1 != null) {
/* 14 */                i1I0I0oii1.setContentDescription(charSequence);
/* 19 */                Oo1l0oIiIllO.I00000oIO(this.I00iio, charSequence);
                    }
                }

                public void setNavigationIcon(Drawable drawable) {
/* 1 */             if (drawable != null) {
/* 3 */                 I000II();
/* 12 */                if (!I000o00OoI0I(this.I00iio)) {
/* 17 */                    I00000oOI(this.I00iio, true);
                        }
                    } else {
/* 21 */                I1I0I0oii1 i1I0I0oii1 = this.I00iio;
/* 23 */                if (i1I0I0oii1 != null && I000o00OoI0I(i1I0I0oii1)) {
/* 33 */                    removeView(this.I00iio);
/* 40 */                    this.I0100i.remove(this.I00iio);
                        }
                    }
/* 43 */            I1I0I0oii1 i1I0I0oii12 = this.I00iio;
/* 45 */            if (i1I0I0oii12 != null) {
/* 47 */                i1I0I0oii12.setImageDrawable(drawable);
                    }
                }

                public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
/* 1 */             I000II();
/* 6 */             this.I00iio.setOnClickListener(onClickListener);
                }

                public void setOverflowIcon(Drawable drawable) {
/* 1 */             I0000oI00();
/* 6 */             this.I00iOIl.setOverflowIcon(drawable);
                }

                public void setPopupTheme(int i) {
/* 3 */             if (this.I00li1OI != i) {
/* 5 */                 this.I00li1OI = i;
/* 7 */                 if (i == 0) {
/* 13 */                    this.I00l0OO0IO = getContext();
                        } else {
/* 25 */                    this.I00l0OO0IO = new ContextThemeWrapper(getContext(), i);
                        }
                    }
                }

                public void setSubtitle(CharSequence charSequence) {
/* 1 */             boolean zIsEmpty = TextUtils.isEmpty(charSequence);
/* 5 */             I1II01I i1ii01i = this.I00iiO;
/* 7 */             if (!zIsEmpty) {
/* 9 */                 if (i1ii01i == null) {
/* 11 */                    Context context = getContext();
/* 18 */                    I1II01I i1ii01i2 = new I1II01I(context, null);
/* 21 */                    this.I00iiO = i1ii01i2;
/* 23 */                    i1ii01i2.setSingleLine();
/* 30 */                    this.I00iiO.setEllipsize(TextUtils.TruncateAt.END);
/* 33 */                    int i = this.I00lli11;
/* 35 */                    if (i != 0) {
/* 39 */                        this.I00iiO.setTextAppearance(context, i);
                            }
/* 42 */                    ColorStateList colorStateList = this.I00oo1iO0ll;
/* 44 */                    if (colorStateList != null) {
/* 48 */                        this.I00iiO.setTextColor(colorStateList);
                            }
                        }
/* 57 */                if (!I000o00OoI0I(this.I00iiO)) {
/* 62 */                    I00000oOI(this.I00iiO, true);
                        }
                    } else if (i1ii01i != null && I000o00OoI0I(i1ii01i)) {
/* 76 */                removeView(this.I00iiO);
/* 83 */                this.I0100i.remove(this.I00iiO);
                    }
/* 86 */            I1II01I i1ii01i3 = this.I00iiO;
/* 88 */            if (i1ii01i3 != null) {
/* 90 */                i1ii01i3.setText(charSequence);
                    }
/* 93 */            this.I00oli = charSequence;
                }

                public void setSubtitleTextColor(ColorStateList colorStateList) {
/* 1 */             this.I00oo1iO0ll = colorStateList;
/* 3 */             I1II01I i1ii01i = this.I00iiO;
/* 5 */             if (i1ii01i != null) {
/* 7 */                 i1ii01i.setTextColor(colorStateList);
                    }
                }

                public void setTitle(CharSequence charSequence) {
/* 1 */             boolean zIsEmpty = TextUtils.isEmpty(charSequence);
/* 5 */             I1II01I i1ii01i = this.I00iiI;
/* 7 */             if (!zIsEmpty) {
/* 9 */                 if (i1ii01i == null) {
/* 11 */                    Context context = getContext();
/* 18 */                    I1II01I i1ii01i2 = new I1II01I(context, null);
/* 21 */                    this.I00iiI = i1ii01i2;
/* 23 */                    i1ii01i2.setSingleLine();
/* 30 */                    this.I00iiI.setEllipsize(TextUtils.TruncateAt.END);
/* 33 */                    int i = this.I00ll1;
/* 35 */                    if (i != 0) {
/* 39 */                        this.I00iiI.setTextAppearance(context, i);
                            }
/* 42 */                    ColorStateList colorStateList = this.I00oliIiO01i;
/* 44 */                    if (colorStateList != null) {
/* 48 */                        this.I00iiI.setTextColor(colorStateList);
                            }
                        }
/* 57 */                if (!I000o00OoI0I(this.I00iiI)) {
/* 62 */                    I00000oOI(this.I00iiI, true);
                        }
                    } else if (i1ii01i != null && I000o00OoI0I(i1ii01i)) {
/* 76 */                removeView(this.I00iiI);
/* 83 */                this.I0100i.remove(this.I00iiI);
                    }
/* 86 */            I1II01I i1ii01i3 = this.I00iiI;
/* 88 */            if (i1ii01i3 != null) {
/* 90 */                i1ii01i3.setText(charSequence);
                    }
/* 93 */            this.I00olI = charSequence;
                }

                public void setTitleMarginBottom(int i) {
/* 1 */             this.I00oII = i;
/* 3 */             requestLayout();
                }

                public void setTitleMarginEnd(int i) {
/* 1 */             this.I00o101lO = i;
/* 3 */             requestLayout();
                }

                public void setTitleMarginStart(int i) {
/* 1 */             this.I00o0l1o1o0 = i;
/* 3 */             requestLayout();
                }

                public void setTitleMarginTop(int i) {
/* 1 */             this.I00oI0i = i;
/* 3 */             requestLayout();
                }

                public void setTitleTextColor(ColorStateList colorStateList) {
/* 1 */             this.I00oliIiO01i = colorStateList;
/* 3 */             I1II01I i1ii01i = this.I00iiI;
/* 5 */             if (i1ii01i != null) {
/* 7 */                 i1ii01i.setTextColor(colorStateList);
                    }
                }

/* 10 */        public void setSubtitleTextColor(int i) {
/* 11 */            setSubtitleTextColor(ColorStateList.valueOf(i));
                }

/* 10 */        public void setTitleTextColor(int i) {
/* 11 */            setTitleTextColor(ColorStateList.valueOf(i));
                }

/* 17 */        public void setCollapseContentDescription(int i) {
/* 18 */            setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
                }

/* 21 */        public void setCollapseIcon(int i) {
/* 22 */            setCollapseIcon(iOO0oOI1Ol.I00000oIO(getContext(), i));
                }

/* 22 */        public void setNavigationContentDescription(int i) {
/* 23 */            setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
                }

/* 28 */        public void setOnMenuItemClickListener(Oo1i10lO1 oo1i10lO1) {
                }

                @Override
/* 30 */        public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 31 */            return I000OOo1O(layoutParams);
                }

/* 31 */        public void setLogoDescription(int i) {
/* 32 */            setLogoDescription(getContext().getText(i));
                }

/* 50 */        public void setNavigationIcon(int i) {
/* 51 */            setNavigationIcon(iOO0oOI1Ol.I00000oIO(getContext(), i));
                }

/* 60 */        public void setLogo(int i) {
/* 61 */            setLogo(iOO0oOI1Ol.I00000oIO(getContext(), i));
                }

/* 95 */        public void setSubtitle(int i) {
/* 96 */            setSubtitle(getContext().getText(i));
                }

/* 95 */        public void setTitle(int i) {
/* 96 */            setTitle(getContext().getText(i));
                }

/* 446 */       public Toolbar(Context context) {
/* 447 */           this(context, null);
                }
            }
