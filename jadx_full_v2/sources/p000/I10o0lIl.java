            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorInflater;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.ColorFilter;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.graphics.drawable.Animatable;
            import android.graphics.drawable.AnimatedVectorDrawable;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import org.xmlpull.v1.XmlPullParser;
            import org.xmlpull.v1.XmlPullParserException;
            
/* 214 */   public final class I10o0lIl extends Ooo0l1I0I00 implements Animatable {
                public final I10o01li1i I00iiI;
                public final Context I00iiO;
                public I0I0oIi0oll I00iio = null;
                public ArrayList I00ilI0I1 = null;
                public final I10o01O0oo0I I00ilO0;

                public I10o0lIl(Context context) {
/* 12 */            I10o01O0oo0I i10o01O0oo0I = new I10o01O0oo0I(0);
/* 15 */            i10o01O0oo0I.I00iiI = this;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            this.I00ilO0 = i10o01O0oo0I;
/* 22 */            this.I00iiO = context;
/* 29 */            this.I00iiI = new I10o01li1i();
                }

                @Override
                public final void applyTheme(Resources.Theme theme) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.applyTheme(theme);
                    }
                }

                @Override
                public final boolean canApplyTheme() {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 return drawable.canApplyTheme();
                    }
/* 10 */            return false;
                }

                @Override
                public final void draw(Canvas canvas) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.draw(canvas);
/* 8 */                 return;
                    }
/* 9 */             I10o01li1i i10o01li1i = this.I00iiI;
/* 13 */            i10o01li1i.I00000oIO.draw(canvas);
/* 22 */            if (i10o01li1i.I00000oOI.isStarted()) {
/* 24 */                invalidateSelf();
                    }
                }

                @Override
                public final int getAlpha() {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.getAlpha() : this.I00iiI.I00000oIO.getAlpha();
                }

                @Override
                public final int getChangingConfigurations() {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 return drawable.getChangingConfigurations();
                    }
/* 10 */            int changingConfigurations = super.getChangingConfigurations();
/* 16 */            this.I00iiI.getClass();
/* 20 */            return changingConfigurations;
                }

                @Override
                public final ColorFilter getColorFilter() {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.getColorFilter() : this.I00iiI.I00000oIO.getColorFilter();
                }

                @Override
                public final Drawable.ConstantState getConstantState() {
/* 3 */             if (this.I00iOIl != null) {
/* 13 */                return new I10o0OiiO(this.I00iOIl.getConstantState());
                    }
/* 17 */            return null;
                }

                @Override
                public final int getIntrinsicHeight() {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.getIntrinsicHeight() : this.I00iiI.I00000oIO.getIntrinsicHeight();
                }

                @Override
                public final int getIntrinsicWidth() {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.getIntrinsicWidth() : this.I00iiI.I00000oIO.getIntrinsicWidth();
                }

                @Override
                public final int getOpacity() {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.getOpacity() : this.I00iiI.I00000oIO.getOpacity();
                }

                /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
                
                    r8 = r3.I00000oOI;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
                
                    if (r8 != null) goto L41;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
                
                    r8 = new android.animation.AnimatorSet();
                    r3.I00000oOI = r8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
                
                    r8.playTogether(r3.I0000Il00O);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x00d6, code lost:
                
                    return;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.inflate(resources, xmlPullParser, attributeSet, theme);
/* 8 */                 return;
                    }
/* 9 */             int eventType = xmlPullParser.getEventType();
/* 18 */            int depth = xmlPullParser.getDepth() + 1;
                    while (true) {
/* 19 */                I10o01li1i i10o01li1i = this.I00iiI;
/* 21 */                if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                            break;
                        }
/* 33 */                if (eventType == 2) {
/* 35 */                    String name = xmlPullParser.getName();
/* 46 */                    if ("animated-vector".equals(name)) {
/* 50 */                        TypedArray typedArrayI0000O = lOollIIio1O.I0000O(resources, theme, attributeSet, Ii1Oo1l.I0000oI00);
/* 54 */                        int resourceId = typedArrayI0000O.getResourceId(0, 0);
/* 58 */                        if (resourceId != 0) {
/* 62 */                            Ooo1IlOO ooo1IlOO = new Ooo1IlOO();
/* 65 */                            ThreadLocal threadLocal = Oi0oolOI.I00000oIO;
/* 71 */                            ooo1IlOO.I00iOIl = resources.getDrawable(resourceId, theme);
/* 81 */                            new Ooo11iOooII(ooo1IlOO.I00iOIl.getConstantState());
/* 84 */                            ooo1IlOO.I00ilO0 = false;
/* 88 */                            ooo1IlOO.setCallback(this.I00ilO0);
/* 91 */                            Ooo1IlOO ooo1IlOO2 = i10o01li1i.I00000oIO;
/* 93 */                            if (ooo1IlOO2 != null) {
/* 96 */                                ooo1IlOO2.setCallback(null);
                                    }
/* 99 */                            i10o01li1i.I00000oIO = ooo1IlOO;
                                }
/* 101 */                       typedArrayI0000O.recycle();
                            } else if ("target".equals(name)) {
/* 115 */                       TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, Ii1Oo1l.I0001Ioi1lo);
/* 119 */                       String string = typedArrayObtainAttributes.getString(0);
/* 123 */                       int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
/* 127 */                       if (resourceId2 != 0) {
/* 129 */                           Context context = this.I00iiO;
/* 131 */                           if (context == null) {
/* 181 */                               typedArrayObtainAttributes.recycle();
/* 186 */                               I000II.I001IO000("Context can't be null when inflating animators");
/* 189 */                               return;
                                    }
/* 133 */                           Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
/* 149 */                           animatorLoadAnimator.setTarget(i10o01li1i.I00000oIO.I00iiI.I00000oOI.I000oI1ioi.get(string));
/* 154 */                           if (i10o01li1i.I0000Il00O == null) {
/* 161 */                               i10o01li1i.I0000Il00O = new ArrayList();
/* 168 */                               i10o01li1i.I0000O = new I1Io0i0II(0);
                                    }
/* 172 */                           i10o01li1i.I0000Il00O.add(animatorLoadAnimator);
/* 177 */                           i10o01li1i.I0000O.put(animatorLoadAnimator, string);
                                }
/* 190 */                       typedArrayObtainAttributes.recycle();
                            } else {
                                continue;
                            }
                        }
/* 193 */               eventType = xmlPullParser.next();
                    }
                }

                @Override
                public final boolean isAutoMirrored() {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.isAutoMirrored() : this.I00iiI.I00000oIO.isAutoMirrored();
                }

                @Override
                public final boolean isRunning() {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.I00iiI.I00000oOI.isRunning();
                }

                @Override
                public final boolean isStateful() {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.isStateful() : this.I00iiI.I00000oIO.isStateful();
                }

                @Override
                public final Drawable mutate() {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.mutate();
                    }
/* 20 */            return this;
                }

                @Override
                public final void onBoundsChange(Rect rect) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setBounds(rect);
                    } else {
/* 13 */                this.I00iiI.I00000oIO.setBounds(rect);
                    }
                }

                @Override
                public final boolean onLevelChange(int i) {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.setLevel(i) : this.I00iiI.I00000oIO.setLevel(i);
                }

                @Override
                public final boolean onStateChange(int[] iArr) {
/* 1 */             Drawable drawable = this.I00iOIl;
                    return drawable != null ? drawable.setState(iArr) : this.I00iiI.I00000oIO.setState(iArr);
                }

                @Override
                public final void setAlpha(int i) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setAlpha(i);
                    } else {
/* 13 */                this.I00iiI.I00000oIO.setAlpha(i);
                    }
                }

                @Override
                public final void setAutoMirrored(boolean z) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setAutoMirrored(z);
                    } else {
/* 13 */                this.I00iiI.I00000oIO.setAutoMirrored(z);
                    }
                }

                @Override
                public final void setColorFilter(ColorFilter colorFilter) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setColorFilter(colorFilter);
                    } else {
/* 13 */                this.I00iiI.I00000oIO.setColorFilter(colorFilter);
                    }
                }

                @Override
                public final void setTint(int i) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setTint(i);
                    } else {
/* 13 */                this.I00iiI.I00000oIO.setTint(i);
                    }
                }

                @Override
                public final void setTintList(ColorStateList colorStateList) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setTintList(colorStateList);
                    } else {
/* 13 */                this.I00iiI.I00000oIO.setTintList(colorStateList);
                    }
                }

                @Override
                public final void setTintMode(PorterDuff.Mode mode) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 drawable.setTintMode(mode);
                    } else {
/* 13 */                this.I00iiI.I00000oIO.setTintMode(mode);
                    }
                }

                @Override
                public final boolean setVisible(boolean z, boolean z2) {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 5 */                 return drawable.setVisible(z, z2);
                    }
/* 14 */            this.I00iiI.I00000oIO.setVisible(z, z2);
/* 17 */            return super.setVisible(z, z2);
                }

                @Override
                public final void start() {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 7 */                 ((AnimatedVectorDrawable) drawable).start();
/* 10 */                return;
                    }
/* 11 */            I10o01li1i i10o01li1i = this.I00iiI;
/* 19 */            if (i10o01li1i.I00000oOI.isStarted()) {
/* 21 */                return;
                    }
/* 24 */            i10o01li1i.I00000oOI.start();
/* 27 */            invalidateSelf();
                }

                @Override
                public final void stop() {
/* 1 */             Drawable drawable = this.I00iOIl;
/* 3 */             if (drawable != null) {
/* 7 */                 ((AnimatedVectorDrawable) drawable).stop();
                    } else {
/* 15 */                this.I00iiI.I00000oOI.end();
                    }
                }

                @Override
/* 215 */       public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
/* 216 */           inflate(resources, xmlPullParser, attributeSet, null);
                }
            }
