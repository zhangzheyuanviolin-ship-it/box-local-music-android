            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.graphics.PorterDuff;
            import android.graphics.PorterDuffColorFilter;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.LayerDrawable;
            import android.util.TypedValue;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.Arrays;
            import java.util.WeakHashMap;
            
            public final class Oi0loIIIoI {
                public static Oi0loIIIoI I000II;
                public WeakHashMap I00000oIO;
                public WeakHashMap I00000oOI;
                public TypedValue I0000Il00O;
                public boolean I0000O;
                public I0Oi111ii I0000oI00;
                public static final PorterDuff.Mode I0001Ioi1lo = PorterDuff.Mode.SRC_IN;
                public static final II0lOOiol I000O01llI0 = new II0lOOiol(6, 1);

                public static synchronized Oi0loIIIoI I0000Il00O() {
                    Oi0loIIIoI oi0loIIIoI;
/* 4 */             oi0loIIIoI = I000II;
/* 6 */             if (oi0loIIIoI == null) {
/* 10 */                oi0loIIIoI = new Oi0loIIIoI();
/* 19 */                oi0loIIIoI.I00000oOI = new WeakHashMap(0);
/* 21 */                VarHandle.storeStoreFence();
/* 24 */                I000II = oi0loIIIoI;
                    }
/* 30 */            return oi0loIIIoI;
                }

                public static synchronized PorterDuffColorFilter I0001Ioi1lo(int i, PorterDuff.Mode mode) {
                    PorterDuffColorFilter porterDuffColorFilter;
/* 4 */             II0lOOiol iI0lOOiol = I000O01llI0;
/* 6 */             iI0lOOiol.getClass();
/* 13 */            int i2 = (31 + i) * 31;
/* 27 */            porterDuffColorFilter = (PorterDuffColorFilter) iI0lOOiol.I0000Il00O(Integer.valueOf(mode.hashCode() + i2));
/* 29 */            if (porterDuffColorFilter == null) {
/* 33 */                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                    }
/* 55 */            return porterDuffColorFilter;
                }

                public static void I000OOo1O(Drawable drawable, IOloIIl1 iOloIIl1, int[] iArr) {
/* 1 */             int[] state = drawable.getState();
/* 9 */             if (drawable.mutate() == drawable) {
/* 14 */                if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
/* 24 */                    drawable.setState(new int[0]);
/* 27 */                    drawable.setState(state);
                        }
/* 30 */                boolean z = iOloIIl1.I00000oOI;
/* 32 */                if (!z && !iOloIIl1.I00000oIO) {
/* 39 */                    drawable.clearColorFilter();
/* 42 */                    return;
                        }
/* 43 */                PorterDuffColorFilter porterDuffColorFilterI0001Ioi1lo = null;
/* 51 */                ColorStateList colorStateList = z ? (ColorStateList) iOloIIl1.I0000Il00O : null;
/* 61 */                PorterDuff.Mode mode = iOloIIl1.I00000oIO ? (PorterDuff.Mode) iOloIIl1.I0000O : I0001Ioi1lo;
/* 63 */                if (colorStateList != null && mode != null) {
/* 72 */                    porterDuffColorFilterI0001Ioi1lo = I0001Ioi1lo(colorStateList.getColorForState(iArr, 0), mode);
                        }
/* 76 */                drawable.setColorFilter(porterDuffColorFilterI0001Ioi1lo);
                    }
                }

                public final void I00000oIO(Context context, int i, ColorStateList colorStateList) {
/* 1 */             WeakHashMap weakHashMap = this.I00000oIO;
/* 3 */             if (weakHashMap == null) {
/* 7 */                 weakHashMap = new WeakHashMap();
/* 10 */                this.I00000oIO = weakHashMap;
                    }
/* 16 */            OlIIioolI olIIioolI = (OlIIioolI) weakHashMap.get(context);
/* 18 */            if (olIIioolI == null) {
/* 23 */                olIIioolI = new OlIIioolI(0);
/* 28 */                this.I00000oIO.put(context, olIIioolI);
                    }
/* 31 */            int i2 = olIIioolI.I00iio;
/* 33 */            if (i2 != 0 && i <= olIIioolI.I00iiI[i2 - 1]) {
/* 43 */                olIIioolI.I0000Il00O(i, colorStateList);
/* 46 */                return;
                    }
/* 49 */            if (olIIioolI.I00iOIl && i2 >= olIIioolI.I00iiI.length) {
/* 56 */                iO10Oii01l.I00000oOI(olIIioolI);
                    }
/* 59 */            int i3 = olIIioolI.I00iio;
/* 65 */            if (i3 >= olIIioolI.I00iiI.length) {
/* 70 */                int i4 = (i3 + 1) * 4;
/* 71 */                int i5 = 4;
                        while (true) {
/* 74 */                    if (i5 >= 32) {
                                break;
                            }
                            int i6 = (1 << i5) - 12;
/* 80 */                    if (i4 <= i6) {
/* 82 */                        i4 = i6;
                                break;
                            }
/* 84 */                    i5++;
                        }
/* 87 */                int i7 = i4 / 4;
/* 94 */                olIIioolI.I00iiI = Arrays.copyOf(olIIioolI.I00iiI, i7);
/* 102 */               olIIioolI.I00iiO = Arrays.copyOf(olIIioolI.I00iiO, i7);
                    }
/* 106 */           olIIioolI.I00iiI[i3] = i;
/* 110 */           olIIioolI.I00iiO[i3] = colorStateList;
/* 113 */           olIIioolI.I00iio = i3 + 1;
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Drawable I00000oOI(Context context, int i) throws Resources.NotFoundException {
                    Object obj;
                    WeakReference weakReference;
                    Drawable drawableNewDrawable;
                    LayerDrawable layerDrawable;
/* 1 */             TypedValue typedValue = this.I0000Il00O;
/* 3 */             if (typedValue == null) {
/* 7 */                 typedValue = new TypedValue();
/* 10 */                this.I0000Il00O = typedValue;
                    }
/* 17 */            context.getResources().getValue(i, typedValue, true);
/* 29 */            long j = (typedValue.assetCookie << 32) | typedValue.data;
                    synchronized (this) {
/* 37 */                O1IOillioo0I o1IOillioo0I = (O1IOillioo0I) this.I00000oOI.get(context);
/* 39 */                obj = null;
/* 40 */                if (o1IOillioo0I != null && (weakReference = (WeakReference) o1IOillioo0I.I00000oOI(j)) != null) {
/* 57 */                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
/* 59 */                    if (constantState != null) {
/* 65 */                        drawableNewDrawable = constantState.newDrawable(context.getResources());
                            } else {
/* 74 */                        o1IOillioo0I.I0000oI00(j);
                            }
                        }
/* 43 */                drawableNewDrawable = null;
                    }
/* 79 */            if (drawableNewDrawable != null) {
/* 81 */                return drawableNewDrawable;
                    }
/* 84 */            if (this.I0000oI00 != null) {
/* 151 */               layerDrawable = i == R.drawable.abc_cab_background_top_material ? new LayerDrawable(new Drawable[]{I0000O(context, R.drawable.abc_cab_background_internal_bg), I0000O(context, R.drawable.abc_cab_background_top_mtrl_alpha)}) : i == R.drawable.abc_ratingbar_material ? I0Oi111ii.I001lllioOl(this, context, R.dimen.abc_star_big) : i == R.drawable.abc_ratingbar_indicator_material ? I0Oi111ii.I001lllioOl(this, context, R.dimen.abc_star_medium) : i == R.drawable.abc_ratingbar_small_material ? I0Oi111ii.I001lllioOl(this, context, R.dimen.abc_star_small) : null;
                    }
/* 155 */           if (layerDrawable == null) {
/* 206 */               return layerDrawable;
                    }
/* 159 */           layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
                    synchronized (this) {
                        try {
/* 163 */                   Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
/* 167 */                   if (constantState2 == null) {
/* 203 */                       return layerDrawable;
                            }
/* 175 */                   O1IOillioo0I o1IOillioo0I2 = (O1IOillioo0I) this.I00000oOI.get(context);
/* 177 */                   if (o1IOillioo0I2 == null) {
/* 181 */                       o1IOillioo0I2 = new O1IOillioo0I(obj);
/* 186 */                       this.I00000oOI.put(context, o1IOillioo0I2);
                            }
/* 197 */                   o1IOillioo0I2.I0000O(j, new WeakReference(constantState2));
/* 201 */                   return layerDrawable;
                        } catch (Throwable th) {
/* 205 */                   throw th;
                        }
                    }
                }

                public final synchronized Drawable I0000O(Context context, int i) {
/* 3 */             return I0000oI00(context, i, false);
                }

                public final synchronized Drawable I0000oI00(Context context, int i, boolean z) {
                    Drawable drawableI00000oOI;
                    try {
/* 4 */                 if (!this.I0000O) {
/* 8 */                     this.I0000O = true;
/* 13 */                    Drawable drawableI0000O = I0000O(context, R.drawable.abc_vector_test);
/* 17 */                    if (drawableI0000O == null || (!(drawableI0000O instanceof Ooo1IlOO) && !"android.graphics.drawable.VectorDrawable".equals(drawableI0000O.getClass().getName()))) {
/* 65 */                        this.I0000O = false;
/* 74 */                        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                            }
                        }
/* 39 */                drawableI00000oOI = I00000oOI(context, i);
/* 43 */                if (drawableI00000oOI == null) {
/* 45 */                    drawableI00000oOI = context.getDrawable(i);
                        }
/* 52 */                if (drawableI00000oOI != null) {
/* 54 */                    drawableI00000oOI = I000O01llI0(context, i, z, drawableI00000oOI);
                        }
/* 58 */                if (drawableI00000oOI != null) {
/* 60 */                    int i2 = IiloO11l.I00000oIO;
                        }
                    } catch (Throwable th) {
/* 98 */                throw th;
                    }
/* 63 */            return drawableI00000oOI;
                }

                public final synchronized ColorStateList I000II(Context context, int i) {
                    ColorStateList colorStateList;
                    OlIIioolI olIIioolI;
/* 2 */             WeakHashMap weakHashMap = this.I00000oIO;
/* 4 */             ColorStateList colorStateListI001lloI = null;
/* 22 */            colorStateList = (weakHashMap == null || (olIIioolI = (OlIIioolI) weakHashMap.get(context)) == null) ? null : (ColorStateList) iO10Oii01l.I00000oIO(olIIioolI, i);
/* 23 */            if (colorStateList == null) {
/* 25 */                I0Oi111ii i0Oi111ii = this.I0000oI00;
/* 27 */                if (i0Oi111ii != null) {
/* 30 */                    colorStateListI001lloI = i0Oi111ii.I001lloI(context, i);
                        }
/* 34 */                if (colorStateListI001lloI != null) {
/* 36 */                    I00000oIO(context, i, colorStateListI001lloI);
                        }
/* 42 */                colorStateList = colorStateListI001lloI;
                    }
/* 44 */            return colorStateList;
                }

                /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Drawable I000O01llI0(Context context, int i, boolean z, Drawable drawable) {
                    boolean z2;
                    int iRound;
                    PorterDuffColorFilter porterDuffColorFilterI0001Ioi1lo;
/* 1 */             ColorStateList colorStateListI000II = I000II(context, i);
/* 5 */             PorterDuff.Mode mode = null;
/* 6 */             if (colorStateListI000II != null) {
/* 8 */                 Drawable drawableMutate = drawable.mutate();
/* 12 */                drawableMutate.setTintList(colorStateListI000II);
/* 17 */                if (this.I0000oI00 != null && i == R.drawable.abc_switch_thumb_material) {
/* 25 */                    mode = PorterDuff.Mode.MULTIPLY;
                        }
/* 27 */                if (mode != null) {
/* 29 */                    drawableMutate.setTintMode(mode);
                        }
/* 32 */                return drawableMutate;
                    }
/* 33 */            I0Oi111ii i0Oi111ii = this.I0000oI00;
/* 35 */            int i2 = R.attr.colorControlNormal;
/* 41 */            if (i0Oi111ii != null) {
/* 54 */                if (i == R.drawable.abc_seekbar_track_material) {
/* 57 */                    LayerDrawable layerDrawable = (LayerDrawable) drawable;
/* 59 */                    Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
/* 63 */                    int iI0000Il00O = Oo0oil0li0I.I0000Il00O(context, R.attr.colorControlNormal);
/* 67 */                    PorterDuff.Mode mode2 = I11oo00.I00000oOI;
/* 69 */                    I0Oi111ii.I00IoiI(drawableFindDrawableByLayerId, iI0000Il00O, mode2);
/* 80 */                    I0Oi111ii.I00IoiI(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), Oo0oil0li0I.I0000Il00O(context, R.attr.colorControlNormal), mode2);
/* 91 */                    I0Oi111ii.I00IoiI(layerDrawable.findDrawableByLayerId(android.R.id.progress), Oo0oil0li0I.I0000Il00O(context, R.attr.colorControlActivated), mode2);
/* 94 */                    return drawable;
                        }
/* 98 */                if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
/* 111 */                   LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
/* 113 */                   Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
/* 117 */                   int iI00000oOI = Oo0oil0li0I.I00000oOI(context, R.attr.colorControlNormal);
/* 121 */                   PorterDuff.Mode mode3 = I11oo00.I00000oOI;
/* 123 */                   I0Oi111ii.I00IoiI(drawableFindDrawableByLayerId2, iI00000oOI, mode3);
/* 134 */                   I0Oi111ii.I00IoiI(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), Oo0oil0li0I.I0000Il00O(context, R.attr.colorControlActivated), mode3);
/* 145 */                   I0Oi111ii.I00IoiI(layerDrawable2.findDrawableByLayerId(android.R.id.progress), Oo0oil0li0I.I0000Il00O(context, R.attr.colorControlActivated), mode3);
/* 148 */                   return drawable;
                        }
                    }
/* 149 */           I0Oi111ii i0Oi111ii2 = this.I0000oI00;
/* 151 */           boolean z3 = false;
/* 152 */           if (i0Oi111ii2 != null) {
/* 154 */               PorterDuff.Mode mode4 = I11oo00.I00000oOI;
/* 166 */               if (I0Oi111ii.I000l1((int[]) i0Oi111ii2.I00iiI, i)) {
/* 168 */                   z2 = true;
/* 169 */                   iRound = -1;
/* 225 */                   if (z2) {
                            }
                        } else {
/* 179 */                   if (I0Oi111ii.I000l1((int[]) i0Oi111ii2.I00iio, i)) {
/* 181 */                       i2 = R.attr.colorControlActivated;
                            } else {
/* 187 */                       boolean zI000l1 = I0Oi111ii.I000l1((int[]) i0Oi111ii2.I00ilI0I1, i);
/* 191 */                       i2 = android.R.attr.colorBackground;
/* 194 */                       if (zI000l1) {
/* 196 */                           mode4 = PorterDuff.Mode.MULTIPLY;
                                } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
/* 207 */                           iRound = Math.round(40.8f);
/* 211 */                           i2 = android.R.attr.colorForeground;
/* 214 */                           z2 = true;
/* 225 */                           if (z2) {
/* 227 */                               Drawable drawableMutate2 = drawable.mutate();
/* 231 */                               int iI0000Il00O2 = Oo0oil0li0I.I0000Il00O(context, i2);
                                        synchronized (I11oo00.class) {
/* 238 */                                   porterDuffColorFilterI0001Ioi1lo = I0001Ioi1lo(iI0000Il00O2, mode4);
                                        }
/* 243 */                               drawableMutate2.setColorFilter(porterDuffColorFilterI0001Ioi1lo);
/* 246 */                               if (iRound != -1) {
/* 248 */                                   drawableMutate2.setAlpha(iRound);
                                        }
/* 251 */                               z3 = true;
                                    }
                                } else {
/* 219 */                           if (i != R.drawable.abc_dialog_material_background) {
/* 222 */                               z2 = false;
/* 223 */                               i2 = 0;
                                    }
/* 169 */                           iRound = -1;
/* 225 */                           if (z2) {
                                    }
                                }
                            }
/* 168 */                   z2 = true;
/* 169 */                   iRound = -1;
/* 225 */                   if (z2) {
                            }
                        }
                    }
/* 256 */           if (z3 || !z) {
/* 1182 */              return drawable;
                    }
/* 5 */             return null;
                }
            }
