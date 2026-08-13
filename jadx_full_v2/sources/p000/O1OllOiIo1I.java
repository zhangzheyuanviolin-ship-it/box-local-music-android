            package p000;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.RippleDrawable;
            import android.os.Parcelable;
            import android.text.Layout;
            import android.text.TextPaint;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.util.Log;
            import android.util.TypedValue;
            import android.util.Xml;
            import android.view.View;
            import android.view.ViewParent;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.widget.Button;
            import android.widget.Checkable;
            import android.widget.CompoundButton;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.Objects;
            import org.xmlpull.v1.XmlPullParserException;
            
/* 27 */    public class O1OllOiIo1I extends I11l0Ool implements Checkable, OioilII {
                public static final int[] I00oo1iO0ll = {R.attr.state_checkable};
                public static final int[] I00ooIo0 = {R.attr.state_checked};
                public final O1OlollilO I00iio;
                public final LinkedHashSet I00ilI0I1;
                public PorterDuff.Mode I00ilO0;
                public ColorStateList I00io1l;
                public Drawable I00ioIO;
                public String I00l0I0l0lO1;
                public int I00l0OO0IO;
                public int I00li1OI;
                public int I00ll1;
                public int I00lli11;
                public boolean I00lll10;
                public boolean I00o0iI0io1;
                public int I00o0l1o1o0;
                public int I00o101lO;
                public float I00oI0i;
                public int I00oII;
                public int I00oIiI10;
                public boolean I00oO101o;
                public int I00oOio10iI1;
                public int I00ol1;
                public int I00olI;
                public float I00oli;
                public float I00oliIiO01i;

                /* JADX WARN: Removed duplicated region for block: B:12:0x00a5  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public O1OllOiIo1I(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
                    OlO0lil1 olO0lil1;
                    XmlResourceParser xml;
                    int next;
                    int resourceId;
                    Drawable drawableI00000oIO;
/* 24 */            super(iIoiO1l.I00000oIO(context, attributeSet, com.box.gallery.R.attr.materialButtonStyle, com.box.gallery.R.style.Widget_MaterialComponents_Button, new int[]{com.box.gallery.R.attr.materialSizeOverlay}), attributeSet, com.box.gallery.R.attr.materialButtonStyle);
/* 32 */            this.I00ilI0I1 = new LinkedHashSet();
/* 35 */            this.I00lll10 = false;
/* 37 */            this.I00o0iI0io1 = false;
/* 40 */            this.I00o101lO = -1;
/* 44 */            this.I00oI0i = -1.0f;
/* 46 */            this.I00oII = -1;
/* 48 */            this.I00oIiI10 = -1;
/* 50 */            this.I00ol1 = -1;
/* 52 */            Context context2 = getContext();
/* 61 */            iO1I10lioi.I00000oIO(context2, attributeSet, com.box.gallery.R.attr.materialButtonStyle, com.box.gallery.R.style.Widget_MaterialComponents_Button);
/* 64 */            int[] iArr = OOilOii0o1I.I0001Ioi1lo;
/* 66 */            iO1I10lioi.I00000oOI(context2, attributeSet, iArr, com.box.gallery.R.attr.materialButtonStyle, com.box.gallery.R.style.Widget_MaterialComponents_Button, new int[0]);
/* 69 */            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.box.gallery.R.attr.materialButtonStyle, com.box.gallery.R.style.Widget_MaterialComponents_Button);
/* 79 */            this.I00lli11 = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
/* 83 */            int i = typedArrayObtainStyledAttributes.getInt(16, -1);
/* 87 */            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
/* 93 */            this.I00ilO0 = li1lliOI.I00000oIO(i);
/* 105 */           this.I00io1l = l1I11O1Iooi1.I00000oIO(getContext(), typedArrayObtainStyledAttributes, 15);
/* 136 */           this.I00ioIO = (!typedArrayObtainStyledAttributes.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(11, 0)) == 0 || (drawableI00000oIO = iOO0oOI1Ol.I00000oIO(getContext(), resourceId)) == null) ? typedArrayObtainStyledAttributes.getDrawable(11) : drawableI00000oIO;
/* 145 */           this.I00o0l1o1o0 = typedArrayObtainStyledAttributes.getInteger(12, 1);
/* 153 */           this.I00l0OO0IO = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, 0);
/* 157 */           int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(19, 0);
/* 161 */           int i2 = 7;
/* 164 */           if (resourceId2 != 0 && Objects.equals(context2.getResources().getResourceTypeName(resourceId2), "xml")) {
/* 188 */               o00io0IiOOo0 o00io0iiooo0 = new o00io0IiOOo0(i2);
/* 191 */               o00io0iiooo0.I0000O();
                        try {
/* 198 */                   xml = context2.getResources().getXml(resourceId2);
                        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
/* 263 */                   o00io0iiooo0.I0000O();
                        }
                        try {
/* 202 */                   AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
/* 212 */                   do {
/* 206 */                       next = xml.next();
/* 210 */                       if (next == 2) {
                                    break;
                                }
/* 212 */                   } while (next != 1);
/* 215 */                   if (next != 2) {
/* 251 */                       throw new XmlPullParserException("No start tag found");
                            }
/* 227 */                   if (xml.getName().equals("selector")) {
/* 233 */                       OlO0lil1.I00000oIO(o00io0iiooo0, context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                            }
/* 240 */                   xml.close();
/* 266 */                   int i3 = o00io0iiooo0.I00iiI;
/* 268 */                   if (i3 == 0) {
/* 166 */                       olO0lil1 = null;
                            } else {
/* 273 */                       olO0lil1 = new OlO0lil1();
/* 276 */                       olO0lil1.I00000oIO = i3;
/* 282 */                       olO0lil1.I00000oOI = (OioOlIlii1il) o00io0iiooo0.I00iiO;
/* 288 */                       olO0lil1.I0000Il00O = (int[][]) o00io0iiooo0.I00iio;
/* 294 */                       olO0lil1.I0000O = (OioOlIlii1il[]) o00io0iiooo0.I00ilI0I1;
/* 296 */                       VarHandle.storeStoreFence();
                            }
                        } finally {
                        }
                    }
/* 308 */           OioOlIlii1il oioOlIlii1ilI00000oIO = olO0lil1 != null ? olO0lil1.I00000oOI : OioOlIlii1il.I00000oOI(context2, attributeSet, com.box.gallery.R.attr.materialButtonStyle, com.box.gallery.R.style.Widget_MaterialComponents_Button).I00000oIO();
/* 314 */           boolean z = typedArrayObtainStyledAttributes.getBoolean(17, false);
/* 320 */           O1OlollilO o1OlollilO = new O1OlollilO();
/* 323 */           o1OlollilO.I00100o1O0lo = false;
/* 325 */           o1OlollilO.I0010I0i = false;
/* 327 */           o1OlollilO.I0010o = false;
/* 329 */           o1OlollilO.I001IIilI0O = true;
/* 331 */           o1OlollilO.I00000oIO = this;
/* 333 */           o1OlollilO.I00000oOI = oioOlIlii1ilI00000oIO;
/* 335 */           VarHandle.storeStoreFence();
/* 338 */           this.I00iio = o1OlollilO;
/* 344 */           o1OlollilO.I0001Ioi1lo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
/* 351 */           o1OlollilO.I000II = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
/* 358 */           o1OlollilO.I000O01llI0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0);
/* 365 */           o1OlollilO.I000OOo1O = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
/* 373 */           if (typedArrayObtainStyledAttributes.hasValue(9)) {
/* 375 */               int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1);
/* 379 */               o1OlollilO.I000OiO = dimensionPixelSize;
                        float f = dimensionPixelSize;
/* 384 */               OioOio1lI0 oioOio1lI0I0001Ioi1lo = o1OlollilO.I00000oOI.I0001Ioi1lo();
/* 393 */               oioOio1lI0I0001Ioi1lo.I0000oI00 = new I00iOIl(f);
/* 400 */               oioOio1lI0I0001Ioi1lo.I0001Ioi1lo = new I00iOIl(f);
/* 407 */               oioOio1lI0I0001Ioi1lo.I000II = new I00iOIl(f);
/* 414 */               oioOio1lI0I0001Ioi1lo.I000O01llI0 = new I00iOIl(f);
/* 420 */               o1OlollilO.I00000oOI = oioOio1lI0I0001Ioi1lo.I00000oIO();
/* 422 */               o1OlollilO.I0000Il00O = null;
/* 424 */               o1OlollilO.I0000O();
/* 427 */               o1OlollilO.I0010o = true;
                    }
/* 435 */           o1OlollilO.I000iOII = typedArrayObtainStyledAttributes.getDimensionPixelSize(22, 0);
/* 439 */           int i4 = typedArrayObtainStyledAttributes.getInt(8, -1);
/* 443 */           PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
/* 449 */           o1OlollilO.I000l1 = li1lliOI.I00000oIO(i4);
/* 460 */           o1OlollilO.I000lI = l1I11O1Iooi1.I00000oIO(getContext(), typedArrayObtainStyledAttributes, 7);
/* 472 */           o1OlollilO.I000o00OoI0I = l1I11O1Iooi1.I00000oIO(getContext(), typedArrayObtainStyledAttributes, 21);
/* 484 */           o1OlollilO.I000oI1ioi = l1I11O1Iooi1.I00000oIO(getContext(), typedArrayObtainStyledAttributes, 18);
/* 491 */           o1OlollilO.I00111O = typedArrayObtainStyledAttributes.getBoolean(6, false);
/* 499 */           o1OlollilO.I001i1O0Ol = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
/* 507 */           o1OlollilO.I001IIilI0O = typedArrayObtainStyledAttributes.getBoolean(23, true);
/* 509 */           int paddingStart = getPaddingStart();
/* 513 */           int paddingTop = getPaddingTop();
/* 517 */           int paddingEnd = getPaddingEnd();
/* 521 */           int paddingBottom = getPaddingBottom();
/* 529 */           if (typedArrayObtainStyledAttributes.hasValue(0)) {
/* 531 */               o1OlollilO.I0010I0i = true;
/* 535 */               setSupportBackgroundTintList(o1OlollilO.I000lI);
/* 540 */               setSupportBackgroundTintMode(o1OlollilO.I000l1);
                    } else {
/* 544 */               o1OlollilO.I0000Il00O();
                    }
/* 559 */           setPaddingRelative(paddingStart + o1OlollilO.I0001Ioi1lo, paddingTop + o1OlollilO.I000O01llI0, paddingEnd + o1OlollilO.I000II, paddingBottom + o1OlollilO.I000OOo1O);
/* 566 */           setCheckedInternal(typedArrayObtainStyledAttributes.getBoolean(1, false));
/* 569 */           if (olO0lil1 != null) {
/* 575 */               o1OlollilO.I0000O = I00000oIO();
/* 579 */               if (o1OlollilO.I0000Il00O != null) {
/* 581 */                   o1OlollilO.I0000O();
                        }
/* 584 */               o1OlollilO.I0000Il00O = olO0lil1;
/* 586 */               o1OlollilO.I0000O();
                    }
/* 589 */           setOpticalCenterEnabled(z);
/* 592 */           typedArrayObtainStyledAttributes.recycle();
/* 597 */           setCompoundDrawablePadding(this.I00lli11);
/* 605 */           I0000oI00(this.I00ioIO != null);
                }

                private Layout.Alignment getActualTextAlignment() {
/* 1 */             int textAlignment = getTextAlignment();
                    return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
                }

                private float getDisplayedWidthIncrease() {
/* 1 */             return this.I00oli;
                }

                private Layout.Alignment getGravityTextAlignment() {
/* 8 */             int gravity = getGravity() & 8388615;
                    return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
                }

                private int getOpticalCenterShift() {
/* 1 */             return 0;
                }

                private int getTextHeight() {
/* 6 */             if (getLineCount() > 1) {
/* 12 */                return getLayout().getHeight();
                    }
/* 17 */            TextPaint paint = getPaint();
/* 25 */            String string = getText().toString();
/* 33 */            if (getTransformationMethod() != null) {
/* 43 */                string = getTransformationMethod().getTransformation(string, this).toString();
                    }
/* 49 */            Rect rect = new Rect();
/* 57 */            paint.getTextBounds(string, 0, string.length(), rect);
/* 72 */            return Math.min(rect.height(), getLayout().getHeight());
                }

                private int getTextLayoutWidth() {
/* 1 */             int lineCount = getLineCount();
/* 5 */             float fMax = 0.0f;
/* 7 */             for (int i = 0; i < lineCount; i++) {
/* 17 */                fMax = Math.max(fMax, getLayout().getLineWidth(i));
                    }
/* 29 */            return (int) Math.ceil(fMax);
                }

                private void setCheckedInternal(boolean z) {
/* 1 */             O1OlollilO o1OlollilO = this.I00iio;
/* 3 */             if (o1OlollilO == null || !o1OlollilO.I00111O || this.I00lll10 == z) {
/* 77 */                return;
                    }
/* 13 */            this.I00lll10 = z;
/* 15 */            refreshDrawableState();
/* 18 */            getParent();
/* 23 */            if (this.I00o0iI0io1) {
/* 77 */                return;
                    }
/* 27 */            this.I00o0iI0io1 = true;
/* 31 */            Iterator it = this.I00ilI0I1.iterator();
/* 39 */            if (it.hasNext()) {
/* 49 */                throw IIlIOloOOO.I000lI(it);
                    }
/* 42 */            this.I00o0iI0io1 = false;
                }

                private void setDisplayedWidthIncrease(float f) {
/* 5 */             if (this.I00oli != f) {
/* 7 */                 this.I00oli = f;
/* 9 */                 I000II();
/* 12 */                invalidate();
/* 15 */                getParent();
                    }
                }

                public final OlIOOlill1o I00000oIO() {
/* 1 */             Context context = getContext();
/* 8 */             TypedValue typedValueI00000oIO = l1I0O0OI0oO.I00000oIO(context, com.box.gallery.R.attr.motionSpringFastSpatial);
/* 13 */            int[] iArr = OOilOii0o1I.I000OiO;
/* 28 */            TypedArray typedArrayObtainStyledAttributes = typedValueI00000oIO == null ? context.obtainStyledAttributes(null, iArr, 0, com.box.gallery.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueI00000oIO.resourceId, iArr);
/* 34 */            OlIOOlill1o olIOOlill1o = new OlIOOlill1o();
                    try {
/* 39 */                float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
/* 45 */                if (f == Float.MIN_VALUE) {
/* 115 */                   throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
                        }
/* 47 */                float f2 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
/* 53 */                if (f2 == Float.MIN_VALUE) {
/* 105 */                   throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
                        }
/* 58 */                if (f <= 0.0f) {
/* 97 */                    throw new IllegalArgumentException("Spring stiffness constant must be positive.");
                        }
/* 65 */                olIOOlill1o.I00000oIO = Math.sqrt(f);
/* 67 */                olIOOlill1o.I0000Il00O = false;
/* 71 */                if (f2 < 0.0f) {
/* 89 */                    throw new IllegalArgumentException("Damping ratio must be non-negative");
                        }
/* 74 */                olIOOlill1o.I00000oOI = f2;
/* 76 */                olIOOlill1o.I0000Il00O = false;
/* 78 */                typedArrayObtainStyledAttributes.recycle();
/* 81 */                return olIOOlill1o;
                    } catch (Throwable th) {
/* 116 */               typedArrayObtainStyledAttributes.recycle();
/* 245 */               throw th;
                    }
                }

                public final boolean I00000oOI() {
/* 1 */             O1OlollilO o1OlollilO = this.I00iio;
                    return (o1OlollilO == null || o1OlollilO.I0010I0i) ? false : true;
                }

                public final void I0000Il00O() {
/* 5 */             this.I00oOio10iI1 = getOpticalCenterShift();
/* 7 */             I000II();
/* 10 */            invalidate();
                }

                public final void I0000O() {
/* 1 */             int i = this.I00o0l1o1o0;
/* 5 */             if (i == 1 || i == 2) {
/* 42 */                setCompoundDrawablesRelative(this.I00ioIO, null, null, null);
/* 55 */                return;
                    }
/* 12 */            if (i == 3 || i == 4) {
/* 36 */                setCompoundDrawablesRelative(null, null, this.I00ioIO, null);
                    } else if (i == 16 || i == 32) {
/* 30 */                setCompoundDrawablesRelative(null, this.I00ioIO, null, null);
                    }
                }

                public final void I0000oI00(boolean z) {
/* 1 */             Drawable drawable = this.I00ioIO;
/* 4 */             if (drawable != null) {
/* 6 */                 Drawable drawableMutate = drawable.mutate();
/* 10 */                this.I00ioIO = drawableMutate;
/* 14 */                drawableMutate.setTintList(this.I00io1l);
/* 17 */                PorterDuff.Mode mode = this.I00ilO0;
/* 19 */                if (mode != null) {
/* 23 */                    this.I00ioIO.setTintMode(mode);
                        }
/* 26 */                int intrinsicWidth = this.I00l0OO0IO;
/* 28 */                if (intrinsicWidth == 0) {
/* 33 */                    intrinsicWidth = this.I00ioIO.getIntrinsicWidth();
                        }
/* 37 */                int intrinsicHeight = this.I00l0OO0IO;
/* 39 */                if (intrinsicHeight == 0) {
/* 44 */                    intrinsicHeight = this.I00ioIO.getIntrinsicHeight();
                        }
/* 48 */                Drawable drawable2 = this.I00ioIO;
/* 50 */                int i = this.I00li1OI;
/* 52 */                int i2 = this.I00ll1;
/* 56 */                drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
/* 61 */                this.I00ioIO.setVisible(true, z);
                    }
/* 64 */            if (z) {
/* 66 */                I0000O();
/* 69 */                return;
                    }
/* 70 */            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
/* 75 */            Drawable drawable3 = compoundDrawablesRelative[0];
/* 77 */            Drawable drawable4 = compoundDrawablesRelative[1];
/* 80 */            Drawable drawable5 = compoundDrawablesRelative[2];
/* 82 */            int i3 = this.I00o0l1o1o0;
/* 84 */            if (((i3 == 1 || i3 == 2) && drawable3 != this.I00ioIO) || (((i3 == 3 || i3 == 4) && drawable5 != this.I00ioIO) || ((i3 == 16 || i3 == 32) && drawable4 != this.I00ioIO))) {
/* 118 */               I0000O();
                    }
                }

                public final void I0001Ioi1lo(int i, int i2) {
/* 3 */             if (this.I00ioIO == null || getLayout() == null) {
/* 332 */               return;
                    }
/* 13 */            int i3 = this.I00o0l1o1o0;
/* 20 */            if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
/* 32 */                if (i3 == 16 || i3 == 32) {
/* 40 */                    this.I00li1OI = 0;
/* 42 */                    if (i3 == 16) {
/* 44 */                        this.I00ll1 = 0;
/* 46 */                        I0000oI00(false);
/* 49 */                        return;
                            }
/* 50 */                    int intrinsicHeight = this.I00l0OO0IO;
/* 52 */                    if (intrinsicHeight == 0) {
/* 56 */                        intrinsicHeight = this.I00ioIO.getIntrinsicHeight();
                            }
/* 80 */                    int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.I00lli11) - getPaddingBottom()) / 2);
/* 86 */                    if (this.I00ll1 != iMax) {
/* 88 */                        this.I00ll1 = iMax;
/* 90 */                        I0000oI00(false);
/* 93 */                        return;
                            }
/* 332 */                   return;
                        }
/* 39 */                return;
                    }
/* 94 */            this.I00ll1 = 0;
/* 96 */            Layout.Alignment actualTextAlignment = getActualTextAlignment();
/* 100 */           int i4 = this.I00o0l1o1o0;
/* 102 */           if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
/* 182 */               this.I00li1OI = 0;
/* 184 */               I0000oI00(false);
/* 332 */               return;
                    }
/* 119 */           int intrinsicWidth = this.I00l0OO0IO;
/* 121 */           if (intrinsicWidth == 0) {
/* 125 */               intrinsicWidth = this.I00ioIO.getIntrinsicWidth();
                    }
/* 147 */           int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.I00lli11) - getPaddingStart();
/* 150 */           if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
/* 152 */               textLayoutWidth /= 2;
                    }
/* 169 */           if ((getLayoutDirection() == 1) != (this.I00o0l1o1o0 == 4)) {
/* 171 */               textLayoutWidth = -textLayoutWidth;
                    }
/* 174 */           if (this.I00li1OI != textLayoutWidth) {
/* 176 */               this.I00li1OI = textLayoutWidth;
/* 178 */               I0000oI00(false);
                    }
                }

                public final void I000II() {
/* 6 */             int i = (int) (this.I00oli - this.I00oliIiO01i);
/* 11 */            int i2 = (i / 2) + this.I00oOio10iI1;
/* 21 */            getLayoutParams().width = (int) (this.I00oI0i + i);
/* 38 */            setPaddingRelative(this.I00oII + i2, getPaddingTop(), (this.I00oIiI10 + i) - i2, getPaddingBottom());
                }

                public String getA11yClassName() {
/* 7 */             if (!TextUtils.isEmpty(this.I00l0I0l0lO1)) {
/* 9 */                 return this.I00l0I0l0lO1;
                    }
/* 12 */            O1OlollilO o1OlollilO = this.I00iio;
/* 25 */            return ((o1OlollilO == null || !o1OlollilO.I00111O) ? Button.class : CompoundButton.class).getName();
                }

                public int getAllowedWidthDecrease() {
/* 1 */             return this.I00ol1;
                }

                @Override
                public ColorStateList getBackgroundTintList() {
/* 1 */             return getSupportBackgroundTintList();
                }

                @Override
                public PorterDuff.Mode getBackgroundTintMode() {
/* 1 */             return getSupportBackgroundTintMode();
                }

                public int getCornerRadius() {
/* 5 */             if (I00000oOI()) {
/* 9 */                 return this.I00iio.I000OiO;
                    }
/* 12 */            return 0;
                }

                public OlIOOlill1o getCornerSpringForce() {
/* 3 */             return this.I00iio.I0000O;
                }

                public Drawable getIcon() {
/* 1 */             return this.I00ioIO;
                }

                public int getIconGravity() {
/* 1 */             return this.I00o0l1o1o0;
                }

                public int getIconPadding() {
/* 1 */             return this.I00lli11;
                }

                public int getIconSize() {
/* 1 */             return this.I00l0OO0IO;
                }

                public ColorStateList getIconTint() {
/* 1 */             return this.I00io1l;
                }

                public PorterDuff.Mode getIconTintMode() {
/* 1 */             return this.I00ilO0;
                }

                public int getInsetBottom() {
/* 3 */             return this.I00iio.I000OOo1O;
                }

                public int getInsetTop() {
/* 3 */             return this.I00iio.I000O01llI0;
                }

                public ColorStateList getRippleColor() {
/* 5 */             if (I00000oOI()) {
/* 9 */                 return this.I00iio.I000oI1ioi;
                    }
/* 12 */            return null;
                }

                public OioOlIlii1il getShapeAppearanceModel() {
/* 5 */             if (I00000oOI()) {
/* 9 */                 return this.I00iio.I00000oOI;
                    }
/* 14 */            I000II.I001IO000("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
/* 17 */            return null;
                }

                public OlO0lil1 getStateListShapeAppearanceModel() {
/* 5 */             if (I00000oOI()) {
/* 9 */                 return this.I00iio.I0000Il00O;
                    }
/* 14 */            I000II.I001IO000("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
/* 17 */            return null;
                }

                public ColorStateList getStrokeColor() {
/* 5 */             if (I00000oOI()) {
/* 9 */                 return this.I00iio.I000o00OoI0I;
                    }
/* 12 */            return null;
                }

                public int getStrokeWidth() {
/* 5 */             if (I00000oOI()) {
/* 9 */                 return this.I00iio.I000iOII;
                    }
/* 12 */            return 0;
                }

                @Override
                public ColorStateList getSupportBackgroundTintList() {
                    return I00000oOI() ? this.I00iio.I000lI : super.getSupportBackgroundTintList();
                }

                @Override
                public PorterDuff.Mode getSupportBackgroundTintMode() {
                    return I00000oOI() ? this.I00iio.I000l1 : super.getSupportBackgroundTintMode();
                }

                @Override
                public final boolean isChecked() {
/* 1 */             return this.I00lll10;
                }

                @Override
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 8 */             if (I00000oOI()) {
/* 13 */                O1Ooi0 o1Ooi0I00000oIO = this.I00iio.I00000oIO(false);
/* 19 */                IioiIIi00i iioiIIi00i = o1Ooi0I00000oIO.I00iiI.I0000Il00O;
/* 21 */                if (iioiIIi00i == null || !iioiIIi00i.I00000oIO) {
/* 110 */                   return;
                        }
/* 31 */                float elevation = 0.0f;
/* 34 */                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
/* 43 */                    elevation += ((View) parent).getElevation();
                        }
/* 49 */                O1OoOIoiiO1I o1OoOIoiiO1I = o1Ooi0I00000oIO.I00iiI;
/* 55 */                if (o1OoOIoiiO1I.I000lI != elevation) {
/* 57 */                    o1OoOIoiiO1I.I000lI = elevation;
/* 59 */                    o1Ooi0I00000oIO.I000lI();
                        }
                    }
                }

                @Override
                public final int[] onCreateDrawableState(int i) {
/* 3 */             int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
/* 7 */             O1OlollilO o1OlollilO = this.I00iio;
/* 9 */             if (o1OlollilO != null && o1OlollilO.I00111O) {
/* 17 */                View.mergeDrawableStates(iArrOnCreateDrawableState, I00oo1iO0ll);
                    }
/* 22 */            if (this.I00lll10) {
/* 26 */                View.mergeDrawableStates(iArrOnCreateDrawableState, I00ooIo0);
                    }
/* 29 */            return iArrOnCreateDrawableState;
                }

                @Override
                public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 1 */             super.onInitializeAccessibilityEvent(accessibilityEvent);
/* 8 */             accessibilityEvent.setClassName(getA11yClassName());
/* 13 */            accessibilityEvent.setChecked(this.I00lll10);
                }

                @Override
                public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
/* 8 */             accessibilityNodeInfo.setClassName(getA11yClassName());
/* 11 */            O1OlollilO o1OlollilO = this.I00iio;
/* 22 */            accessibilityNodeInfo.setCheckable(o1OlollilO != null && o1OlollilO.I00111O);
/* 27 */            accessibilityNodeInfo.setChecked(this.I00lll10);
/* 34 */            accessibilityNodeInfo.setClickable(isClickable());
                }

                @Override
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    int i5;
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 12 */            I0001Ioi1lo(getMeasuredWidth(), getMeasuredHeight());
/* 23 */            int i6 = getResources().getConfiguration().orientation;
/* 29 */            if (this.I00o101lO != i6) {
/* 31 */                this.I00o101lO = i6;
/* 33 */                this.I00oI0i = -1.0f;
                    }
/* 39 */            if (this.I00oI0i == -1.0f) {
/* 46 */                this.I00oI0i = getMeasuredWidth();
/* 48 */                getParent();
                    }
/* 54 */            if (this.I00ol1 == -1) {
/* 58 */                if (this.I00ioIO == null) {
/* 60 */                    i5 = 0;
                        } else {
/* 62 */                    int iconPadding = getIconPadding();
/* 66 */                    int intrinsicWidth = this.I00l0OO0IO;
/* 68 */                    if (intrinsicWidth == 0) {
/* 72 */                        intrinsicWidth = this.I00ioIO.getIntrinsicWidth();
                            }
/* 76 */                    i5 = iconPadding + intrinsicWidth;
                        }
/* 87 */                this.I00ol1 = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
                    }
/* 91 */            if (this.I00oII == -1) {
/* 97 */                this.I00oII = getPaddingStart();
                    }
/* 101 */           if (this.I00oIiI10 == -1) {
/* 107 */               this.I00oIiI10 = getPaddingEnd();
                    }
/* 109 */           getParent();
                }

                @Override
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 3 */             if (!(parcelable instanceof O1Olilo0i1)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             O1Olilo0i1 o1Olilo0i1 = (O1Olilo0i1) parcelable;
/* 13 */            super.onRestoreInstanceState(o1Olilo0i1.I00iOIl);
/* 18 */            setChecked(o1Olilo0i1.I00iiO);
                }

                @Override
                public final Parcelable onSaveInstanceState() {
/* 7 */             O1Olilo0i1 o1Olilo0i1 = new O1Olilo0i1(super.onSaveInstanceState());
/* 12 */            o1Olilo0i1.I00iiO = this.I00lll10;
/* 20 */            return o1Olilo0i1;
                }

                @Override
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
/* 1 */             super.onTextChanged(charSequence, i, i2, i3);
/* 12 */            I0001Ioi1lo(getMeasuredWidth(), getMeasuredHeight());
                }

                @Override
                public final boolean performClick() {
/* 5 */             if (isEnabled() && this.I00iio.I001IIilI0O) {
/* 13 */                toggle();
                    }
/* 16 */            return super.performClick();
                }

                @Override
                public final void refreshDrawableState() {
/* 1 */             super.refreshDrawableState();
/* 6 */             if (this.I00ioIO != null) {
/* 18 */                if (this.I00ioIO.setState(getDrawableState())) {
/* 20 */                    invalidate();
                        }
                    }
                }

                public void setA11yClassName(String str) {
/* 1 */             this.I00l0I0l0lO1 = str;
                }

                @Override
                public void setBackground(Drawable drawable) {
/* 1 */             setBackgroundDrawable(drawable);
                }

                @Override
                public void setBackgroundColor(int i) {
/* 5 */             if (!I00000oOI()) {
/* 24 */                super.setBackgroundColor(i);
/* 29 */                return;
                    }
/* 7 */             O1OlollilO o1OlollilO = this.I00iio;
/* 14 */            if (o1OlollilO.I00000oIO(false) != null) {
/* 20 */                o1OlollilO.I00000oIO(false).setTint(i);
                    }
                }

                @Override
                public void setBackgroundDrawable(Drawable drawable) {
/* 5 */             if (!I00000oOI()) {
/* 53 */                super.setBackgroundDrawable(drawable);
/* 77 */                return;
                    }
/* 11 */            if (drawable == getBackground()) {
/* 49 */                getBackground().setState(drawable.getState());
/* 52 */                return;
                    }
/* 17 */            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
/* 21 */            O1OlollilO o1OlollilO = this.I00iio;
/* 23 */            o1OlollilO.I0010I0i = true;
/* 25 */            O1OllOiIo1I o1OllOiIo1I = o1OlollilO.I00000oIO;
/* 29 */            o1OllOiIo1I.setSupportBackgroundTintList(o1OlollilO.I000lI);
/* 34 */            o1OllOiIo1I.setSupportBackgroundTintMode(o1OlollilO.I000l1);
/* 37 */            super.setBackgroundDrawable(drawable);
                }

                @Override
                public void setBackgroundResource(int i) {
/* 13 */            setBackgroundDrawable(i != 0 ? iOO0oOI1Ol.I00000oIO(getContext(), i) : null);
                }

                @Override
                public void setBackgroundTintList(ColorStateList colorStateList) {
/* 1 */             setSupportBackgroundTintList(colorStateList);
                }

                @Override
                public void setBackgroundTintMode(PorterDuff.Mode mode) {
/* 1 */             setSupportBackgroundTintMode(mode);
                }

                public void setCheckable(boolean z) {
/* 5 */             if (I00000oOI()) {
/* 9 */                 this.I00iio.I00111O = z;
                    }
                }

                @Override
                public void setChecked(boolean z) {
/* 1 */             setCheckedInternal(z);
                }

                public void setCornerRadius(int i) {
/* 5 */             if (I00000oOI()) {
/* 7 */                 O1OlollilO o1OlollilO = this.I00iio;
/* 11 */                if (o1OlollilO.I0010o && o1OlollilO.I000OiO == i) {
/* 77 */                    return;
                        }
/* 17 */                o1OlollilO.I000OiO = i;
/* 20 */                o1OlollilO.I0010o = true;
                        float f = i;
/* 25 */                OioOio1lI0 oioOio1lI0I0001Ioi1lo = o1OlollilO.I00000oOI.I0001Ioi1lo();
/* 34 */                oioOio1lI0I0001Ioi1lo.I0000oI00 = new I00iOIl(f);
/* 41 */                oioOio1lI0I0001Ioi1lo.I0001Ioi1lo = new I00iOIl(f);
/* 48 */                oioOio1lI0I0001Ioi1lo.I000II = new I00iOIl(f);
/* 55 */                oioOio1lI0I0001Ioi1lo.I000O01llI0 = new I00iOIl(f);
/* 61 */                o1OlollilO.I00000oOI = oioOio1lI0I0001Ioi1lo.I00000oIO();
/* 64 */                o1OlollilO.I0000Il00O = null;
/* 66 */                o1OlollilO.I0000O();
                    }
                }

                public void setCornerRadiusResource(int i) {
/* 5 */             if (I00000oOI()) {
/* 15 */                setCornerRadius(getResources().getDimensionPixelSize(i));
                    }
                }

                public void setCornerSpringForce(OlIOOlill1o olIOOlill1o) {
/* 1 */             O1OlollilO o1OlollilO = this.I00iio;
/* 3 */             o1OlollilO.I0000O = olIOOlill1o;
/* 7 */             if (o1OlollilO.I0000Il00O != null) {
/* 9 */                 o1OlollilO.I0000O();
                    }
                }

                public void setDisplayedWidthDecrease(int i) {
/* 8 */             this.I00oliIiO01i = Math.min(i, this.I00ol1);
/* 10 */            I000II();
/* 13 */            invalidate();
                }

                @Override
                public void setElevation(float f) {
/* 1 */             super.setElevation(f);
/* 8 */             if (I00000oOI()) {
/* 13 */                O1Ooi0 o1Ooi0I00000oIO = this.I00iio.I00000oIO(false);
/* 17 */                O1OoOIoiiO1I o1OoOIoiiO1I = o1Ooi0I00000oIO.I00iiI;
/* 23 */                if (o1OoOIoiiO1I.I000o00OoI0I != f) {
/* 25 */                    o1OoOIoiiO1I.I000o00OoI0I = f;
/* 27 */                    o1Ooi0I00000oIO.I000lI();
                        }
                    }
                }

                public void setIcon(Drawable drawable) {
/* 3 */             if (this.I00ioIO != drawable) {
/* 5 */                 this.I00ioIO = drawable;
/* 8 */                 I0000oI00(true);
/* 19 */                I0001Ioi1lo(getMeasuredWidth(), getMeasuredHeight());
                    }
                }

                public void setIconGravity(int i) {
/* 3 */             if (this.I00o0l1o1o0 != i) {
/* 5 */                 this.I00o0l1o1o0 = i;
/* 15 */                I0001Ioi1lo(getMeasuredWidth(), getMeasuredHeight());
                    }
                }

                public void setIconPadding(int i) {
/* 3 */             if (this.I00lli11 != i) {
/* 5 */                 this.I00lli11 = i;
/* 7 */                 setCompoundDrawablePadding(i);
                    }
                }

                public void setIconResource(int i) {
/* 13 */            setIcon(i != 0 ? iOO0oOI1Ol.I00000oIO(getContext(), i) : null);
                }

                public void setIconSize(int i) {
/* 1 */             if (i < 0) {
/* 16 */                I000II.I000iOII("iconSize cannot be less than 0");
                    } else if (this.I00l0OO0IO != i) {
/* 7 */                 this.I00l0OO0IO = i;
/* 10 */                I0000oI00(true);
                    }
                }

                public void setIconTint(ColorStateList colorStateList) {
/* 3 */             if (this.I00io1l != colorStateList) {
/* 5 */                 this.I00io1l = colorStateList;
/* 8 */                 I0000oI00(false);
                    }
                }

                public void setIconTintMode(PorterDuff.Mode mode) {
/* 3 */             if (this.I00ilO0 != mode) {
/* 5 */                 this.I00ilO0 = mode;
/* 8 */                 I0000oI00(false);
                    }
                }

                public void setIconTintResource(int i) {
/* 9 */             setIconTint(iOI10i0I11.I00000oOI(getContext(), i));
                }

                public void setInsetBottom(int i) {
/* 1 */             O1OlollilO o1OlollilO = this.I00iio;
/* 5 */             o1OlollilO.I00000oOI(o1OlollilO.I000O01llI0, i);
                }

                public void setInsetTop(int i) {
/* 1 */             O1OlollilO o1OlollilO = this.I00iio;
/* 5 */             o1OlollilO.I00000oOI(i, o1OlollilO.I000OOo1O);
                }

                public void setInternalBackground(Drawable drawable) {
/* 1 */             super.setBackgroundDrawable(drawable);
                }

                public void setOpticalCenterEnabled(boolean z) {
/* 3 */             if (this.I00oO101o != z) {
/* 5 */                 this.I00oO101o = z;
/* 8 */                 O1OlollilO o1OlollilO = this.I00iio;
/* 10 */                if (z) {
/* 16 */                    I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(20);
/* 19 */                    i0IOIlIOIII.I00iiI = this;
/* 21 */                    VarHandle.storeStoreFence();
/* 24 */                    o1OlollilO.I0000oI00 = i0IOIlIOIII;
/* 26 */                    O1Ooi0 o1Ooi0I00000oIO = o1OlollilO.I00000oIO(false);
/* 30 */                    if (o1Ooi0I00000oIO != null) {
/* 32 */                        o1Ooi0I00000oIO.I00ooIo0 = i0IOIlIOIII;
                            }
                        } else {
/* 36 */                    o1OlollilO.I0000oI00 = null;
/* 38 */                    O1Ooi0 o1Ooi0I00000oIO2 = o1OlollilO.I00000oIO(false);
/* 42 */                    if (o1Ooi0I00000oIO2 != null) {
/* 44 */                        o1Ooi0I00000oIO2.I00ooIo0 = null;
                            }
                        }
/* 50 */                I0100i i0100i = new I0100i(28);
/* 53 */                i0100i.I00iiI = this;
/* 55 */                VarHandle.storeStoreFence();
/* 58 */                post(i0100i);
                    }
                }

                @Override
                public void setPressed(boolean z) {
/* 1 */             super.setPressed(z);
                }

                public void setRippleColor(ColorStateList colorStateList) {
/* 5 */             if (I00000oOI()) {
/* 7 */                 O1OlollilO o1OlollilO = this.I00iio;
/* 9 */                 O1OllOiIo1I o1OllOiIo1I = o1OlollilO.I00000oIO;
/* 13 */                if (o1OlollilO.I000oI1ioi != colorStateList) {
/* 15 */                    o1OlollilO.I000oI1ioi = colorStateList;
/* 23 */                    if (o1OllOiIo1I.getBackground() instanceof RippleDrawable) {
/* 29 */                        RippleDrawable rippleDrawable = (RippleDrawable) o1OllOiIo1I.getBackground();
/* 31 */                        if (colorStateList == null) {
/* 35 */                            colorStateList = ColorStateList.valueOf(0);
                                }
/* 39 */                        rippleDrawable.setColor(colorStateList);
                            }
                        }
                    }
                }

                public void setRippleColorResource(int i) {
/* 5 */             if (I00000oOI()) {
/* 15 */                setRippleColor(iOI10i0I11.I00000oOI(getContext(), i));
                    }
                }

                @Override
                public void setShapeAppearanceModel(OioOlIlii1il oioOlIlii1il) {
/* 5 */             if (!I00000oOI()) {
/* 20 */                I000II.I001IO000("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
/* 29 */                return;
                    }
/* 7 */             O1OlollilO o1OlollilO = this.I00iio;
/* 9 */             o1OlollilO.I00000oOI = oioOlIlii1il;
/* 12 */            o1OlollilO.I0000Il00O = null;
/* 14 */            o1OlollilO.I0000O();
                }

                public void setShouldDrawSurfaceColorStroke(boolean z) {
/* 5 */             if (I00000oOI()) {
/* 7 */                 O1OlollilO o1OlollilO = this.I00iio;
/* 9 */                 o1OlollilO.I00100o1O0lo = z;
/* 11 */                o1OlollilO.I0000oI00();
                    }
                }

                public void setStateListShapeAppearanceModel(OlO0lil1 olO0lil1) {
/* 5 */             if (!I00000oOI()) {
/* 40 */                I000II.I001IO000("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
/* 77 */                return;
                    }
/* 7 */             O1OlollilO o1OlollilO = this.I00iio;
/* 11 */            if (o1OlollilO.I0000O == null && olO0lil1.I00000oIO > 1) {
/* 23 */                o1OlollilO.I0000O = I00000oIO();
/* 27 */                if (o1OlollilO.I0000Il00O != null) {
/* 29 */                    o1OlollilO.I0000O();
                        }
                    }
/* 32 */            o1OlollilO.I0000Il00O = olO0lil1;
/* 34 */            o1OlollilO.I0000O();
                }

                public void setStrokeColor(ColorStateList colorStateList) {
/* 5 */             if (I00000oOI()) {
/* 7 */                 O1OlollilO o1OlollilO = this.I00iio;
/* 11 */                if (o1OlollilO.I000o00OoI0I != colorStateList) {
/* 13 */                    o1OlollilO.I000o00OoI0I = colorStateList;
/* 15 */                    o1OlollilO.I0000oI00();
                        }
                    }
                }

                public void setStrokeColorResource(int i) {
/* 5 */             if (I00000oOI()) {
/* 15 */                setStrokeColor(iOI10i0I11.I00000oOI(getContext(), i));
                    }
                }

                public void setStrokeWidth(int i) {
/* 5 */             if (I00000oOI()) {
/* 7 */                 O1OlollilO o1OlollilO = this.I00iio;
/* 11 */                if (o1OlollilO.I000iOII != i) {
/* 13 */                    o1OlollilO.I000iOII = i;
/* 15 */                    o1OlollilO.I0000oI00();
                        }
                    }
                }

                public void setStrokeWidthResource(int i) {
/* 5 */             if (I00000oOI()) {
/* 15 */                setStrokeWidth(getResources().getDimensionPixelSize(i));
                    }
                }

                @Override
                public void setSupportBackgroundTintList(ColorStateList colorStateList) {
/* 5 */             if (!I00000oOI()) {
/* 32 */                super.setSupportBackgroundTintList(colorStateList);
/* 77 */                return;
                    }
/* 7 */             O1OlollilO o1OlollilO = this.I00iio;
/* 11 */            if (o1OlollilO.I000lI != colorStateList) {
/* 13 */                o1OlollilO.I000lI = colorStateList;
/* 20 */                if (o1OlollilO.I00000oIO(false) != null) {
/* 28 */                    o1OlollilO.I00000oIO(false).setTintList(o1OlollilO.I000lI);
                        }
                    }
                }

                @Override
                public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
/* 5 */             if (!I00000oOI()) {
/* 36 */                super.setSupportBackgroundTintMode(mode);
/* 77 */                return;
                    }
/* 7 */             O1OlollilO o1OlollilO = this.I00iio;
/* 11 */            if (o1OlollilO.I000l1 != mode) {
/* 13 */                o1OlollilO.I000l1 = mode;
/* 20 */                if (o1OlollilO.I00000oIO(false) == null || o1OlollilO.I000l1 == null) {
/* 35 */                    return;
                        }
/* 32 */                o1OlollilO.I00000oIO(false).setTintMode(o1OlollilO.I000l1);
                    }
                }

                @Override
                public void setTextAlignment(int i) {
/* 1 */             super.setTextAlignment(i);
/* 12 */            I0001Ioi1lo(getMeasuredWidth(), getMeasuredHeight());
                }

                public void setToggleCheckedStateOnClick(boolean z) {
/* 3 */             this.I00iio.I001IIilI0O = z;
                }

                @Override
                public void setWidth(int i) {
/* 3 */             this.I00oI0i = -1.0f;
/* 5 */             super.setWidth(i);
                }

                public void setWidthChangeMax(int i) {
/* 3 */             if (this.I00olI != i) {
/* 5 */                 this.I00olI = i;
                    }
                }

                @Override
                public final void toggle() {
/* 5 */             setChecked(!this.I00lll10);
                }

/* 28 */        public void setOnPressedChangeListenerInternal(O1Oliil1ooio o1Oliil1ooio) {
                }

/* 28 */        public void setSizeChange(OlO0lloio0Ii olO0lloio0Ii) {
                }
            }
