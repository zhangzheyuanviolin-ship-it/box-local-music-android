            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.TypedValue;
            import android.view.ContextThemeWrapper;
            import android.view.KeyEvent;
            import android.view.View;
            import android.view.animation.AccelerateInterpolator;
            import android.view.animation.DecelerateInterpolator;
            import androidx.appcompat.widget.ActionBarContainer;
            import androidx.appcompat.widget.ActionBarContextView;
            import androidx.appcompat.widget.ActionBarOverlayLayout;
            import androidx.appcompat.widget.Toolbar;
            import com.box.gallery.R;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            
            public final class i00IOoliil0i implements I0I100oOIO0l {
                public static final AccelerateInterpolator I001l0I00 = new AccelerateInterpolator();
                public static final DecelerateInterpolator I001lIiIIo1O = new DecelerateInterpolator();
                public Context I00000oIO;
                public Context I00000oOI;
                public ActionBarOverlayLayout I0000Il00O;
                public ActionBarContainer I0000O;
                public Ii1iOIIi I0000oI00;
                public ActionBarContextView I0001Ioi1lo;
                public View I000II;
                public boolean I000O01llI0;
                public i00IOOoolO I000OOo1O;
                public i00IOOoolO I000OiO;
                public I1I0i0Ilo1Oi I000iOII;
                public boolean I000l1;
                public ArrayList I000lI;
                public int I000o00OoI0I;
                public boolean I000oI1ioi;
                public boolean I00100l0;
                public boolean I00100o1O0lo;
                public boolean I0010I0i;
                public boolean I0010o;
                public OoolOolooll I00111O;
                public boolean I001IIilI0O;
                public boolean I001IO000;
                public i00IO11o1Ili I001i1O0Ol;
                public i00IO11o1Ili I001i1lo1io;
                public iiOlilo0IIIl I001iOo1i0O;

                public final void I00000oIO(boolean z) {
                    OoolOO ooolOOI000OOo1O;
                    OoolOO ooolOOI000OOo1O2;
/* 1 */             boolean z2 = this.I0010I0i;
/* 4 */             if (z) {
/* 6 */                 if (!z2) {
/* 9 */                     this.I0010I0i = true;
/* 11 */                    ActionBarOverlayLayout actionBarOverlayLayout = this.I0000Il00O;
/* 13 */                    if (actionBarOverlayLayout != null) {
/* 15 */                        actionBarOverlayLayout.setShowingForActionMode(true);
                            }
/* 18 */                    I0000oI00(false);
                        }
                    } else if (z2) {
/* 24 */                this.I0010I0i = false;
/* 26 */                ActionBarOverlayLayout actionBarOverlayLayout2 = this.I0000Il00O;
/* 28 */                if (actionBarOverlayLayout2 != null) {
/* 30 */                    actionBarOverlayLayout2.setShowingForActionMode(false);
                        }
/* 33 */                I0000oI00(false);
                    }
/* 38 */            boolean zIsLaidOut = this.I0000O.isLaidOut();
/* 42 */            Ii1iOIIi ii1iOIIi = this.I0000oI00;
/* 47 */            if (!zIsLaidOut) {
/* 138 */               if (z) {
/* 144 */                   ((Oo1ilOl) ii1iOIIi).I00000oIO.setVisibility(4);
/* 149 */                   this.I0001Ioi1lo.setVisibility(0);
/* 152 */                   return;
                        } else {
/* 157 */                   ((Oo1ilOl) ii1iOIIi).I00000oIO.setVisibility(0);
/* 162 */                   this.I0001Ioi1lo.setVisibility(8);
/* 168 */                   return;
                        }
                    }
/* 53 */            if (z) {
/* 57 */                ooolOOI000OOo1O = ((Oo1ilOl) ii1iOIIi).I00000oOI(4, 100L);
/* 63 */                ooolOOI000OOo1O2 = this.I0001Ioi1lo.I000OOo1O(0, 200L);
                    } else {
/* 70 */                OoolOO ooolOOI00000oOI = ((Oo1ilOl) ii1iOIIi).I00000oOI(0, 200L);
/* 76 */                ooolOOI000OOo1O = this.I0001Ioi1lo.I000OOo1O(8, 100L);
/* 82 */                ooolOOI000OOo1O2 = ooolOOI00000oOI;
                    }
/* 85 */            OoolOolooll ooolOolooll = new OoolOolooll();
/* 88 */            ArrayList arrayList = ooolOolooll.I00000oIO;
/* 90 */            arrayList.add(ooolOOI000OOo1O);
/* 99 */            View view = (View) ooolOOI000OOo1O.I00000oIO.get();
/* 112 */           long duration = view != null ? view.animate().getDuration() : 0L;
/* 120 */           View view2 = (View) ooolOOI000OOo1O2.I00000oIO.get();
/* 122 */           if (view2 != null) {
/* 128 */               view2.animate().setStartDelay(duration);
                    }
/* 131 */           arrayList.add(ooolOOI000OOo1O2);
/* 134 */           ooolOolooll.I00000oOI();
                }

                public final Context I00000oOI() {
/* 1 */             Context context = this.I00000oOI;
/* 3 */             if (context != null) {
/* 55 */                return context;
                    }
/* 7 */             TypedValue typedValue = new TypedValue();
/* 20 */            this.I00000oIO.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
/* 23 */            int i = typedValue.resourceId;
/* 25 */            if (i != 0) {
/* 31 */                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.I00000oIO, i);
/* 34 */                this.I00000oOI = contextThemeWrapper;
/* 36 */                return contextThemeWrapper;
                    }
/* 37 */            Context context2 = this.I00000oIO;
/* 39 */            this.I00000oOI = context2;
/* 55 */            return context2;
                }

                public final void I0000Il00O(View view) {
                    Ii1iOIIi wrapper;
/* 8 */             ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
/* 10 */            this.I0000Il00O = actionBarOverlayLayout;
/* 12 */            if (actionBarOverlayLayout != null) {
/* 14 */                actionBarOverlayLayout.setActionBarVisibilityCallback(this);
                    }
/* 20 */            KeyEvent.Callback callbackFindViewById = view.findViewById(R.id.action_bar);
/* 26 */            if (callbackFindViewById instanceof Ii1iOIIi) {
/* 28 */                wrapper = (Ii1iOIIi) callbackFindViewById;
                    } else {
/* 33 */                if (!(callbackFindViewById instanceof Toolbar)) {
/* 437 */                   throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
                        }
/* 37 */                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
                    }
/* 41 */            this.I0000oI00 = wrapper;
/* 52 */            this.I0001Ioi1lo = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
/* 61 */            ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
/* 63 */            this.I0000O = actionBarContainer;
/* 65 */            Ii1iOIIi ii1iOIIi = this.I0000oI00;
/* 67 */            if (ii1iOIIi == null || this.I0001Ioi1lo == null || actionBarContainer == null) {
/* 198 */               I000II.I001IO000(i00IOoliil0i.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
/* 201 */               return;
                    }
/* 79 */            Context context = ((Oo1ilOl) ii1iOIIi).I00000oIO.getContext();
/* 83 */            this.I00000oIO = context;
/* 100 */           if ((((Oo1ilOl) this.I0000oI00).I00000oOI & 4) != 0) {
/* 102 */               this.I000O01llI0 = true;
                    }
/* 108 */           int i = context.getApplicationInfo().targetSdkVersion;
/* 114 */           this.I0000oI00.getClass();
/* 127 */           I0000O(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
/* 138 */           TypedArray typedArrayObtainStyledAttributes = this.I00000oIO.obtainStyledAttributes(null, OOilOli0.I00000oIO, R.attr.actionBarStyle, 0);
/* 146 */           if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
/* 148 */               ActionBarOverlayLayout actionBarOverlayLayout2 = this.I0000Il00O;
/* 152 */               if (!actionBarOverlayLayout2.I00io1l) {
/* 162 */                   I000II.I001IO000("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
/* 165 */                   return;
                        } else {
/* 154 */                   this.I001IO000 = true;
/* 156 */                   actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                        }
                    }
/* 168 */           int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
/* 172 */           if (dimensionPixelSize != 0) {
/* 175 */               ActionBarContainer actionBarContainer2 = this.I0000O;
/* 177 */               WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 179 */               actionBarContainer2.setElevation(dimensionPixelSize);
                    }
/* 182 */           typedArrayObtainStyledAttributes.recycle();
                }

                public final void I0000O(boolean z) {
/* 2 */             if (z) {
/* 19 */                this.I0000O.setTabContainer(null);
/* 26 */                ((Oo1ilOl) this.I0000oI00).getClass();
                    } else {
/* 8 */                 ((Oo1ilOl) this.I0000oI00).getClass();
/* 13 */                this.I0000O.setTabContainer(null);
                    }
/* 31 */            this.I0000oI00.getClass();
/* 41 */            ((Oo1ilOl) this.I0000oI00).I00000oIO.setCollapsible(false);
/* 46 */            this.I0000Il00O.setHasNonEmbeddedTabs(false);
                }

                public final void I0000oI00(boolean z) {
/* 1 */             iiOlilo0IIIl iiolilo0iiil = this.I001iOo1i0O;
/* 3 */             View view = this.I000II;
/* 23 */            boolean z2 = this.I0010I0i || !(this.I00100l0 || this.I00100o1O0lo);
/* 24 */            boolean z3 = this.I0010o;
/* 30 */            if (!z2) {
/* 197 */               if (z3) {
/* 199 */                   this.I0010o = false;
/* 201 */                   i00IO11o1Ili i00io11o1ili = this.I001i1O0Ol;
/* 203 */                   OoolOolooll ooolOolooll = this.I00111O;
/* 205 */                   if (ooolOolooll != null) {
/* 207 */                       ooolOolooll.I00000oIO();
                            }
/* 212 */                   if (this.I000o00OoI0I != 0 || (!this.I001IIilI0O && !z)) {
/* 321 */                       i00io11o1ili.I0000Il00O();
/* 437 */                       return;
                            }
/* 222 */                   this.I0000O.setAlpha(1.0f);
/* 227 */                   this.I0000O.setTransitioning(true);
/* 232 */                   OoolOolooll ooolOolooll2 = new OoolOolooll();
/* 241 */                   float f = -this.I0000O.getHeight();
/* 243 */                   if (z) {
/* 251 */                       this.I0000O.getLocationInWindow(new int[]{0, 0});
/* 257 */                       f -= r11[1];
                            }
/* 260 */                   OoolOO ooolOOI00000oIO = OooiOl0ioo0i.I00000oIO(this.I0000O);
/* 264 */                   ooolOOI00000oIO.I0001Ioi1lo(f);
/* 267 */                   ooolOOI00000oIO.I0000oI00(iiolilo0iiil);
/* 270 */                   boolean z4 = ooolOolooll2.I0000oI00;
/* 272 */                   ArrayList arrayList = ooolOolooll2.I00000oIO;
/* 274 */                   if (!z4) {
/* 276 */                       arrayList.add(ooolOOI00000oIO);
                            }
/* 281 */                   if (this.I000oI1ioi && view != null) {
/* 285 */                       OoolOO ooolOOI00000oIO2 = OooiOl0ioo0i.I00000oIO(view);
/* 289 */                       ooolOOI00000oIO2.I0001Ioi1lo(f);
/* 294 */                       if (!ooolOolooll2.I0000oI00) {
/* 296 */                           arrayList.add(ooolOOI00000oIO2);
                                }
                            }
/* 299 */                   boolean z5 = ooolOolooll2.I0000oI00;
/* 301 */                   if (!z5) {
/* 305 */                       ooolOolooll2.I0000Il00O = I001l0I00;
                            }
/* 307 */                   if (!z5) {
/* 309 */                       ooolOolooll2.I00000oOI = 250L;
                            }
/* 311 */                   if (!z5) {
/* 313 */                       ooolOolooll2.I0000O = i00io11o1ili;
                            }
/* 315 */                   this.I00111O = ooolOolooll2;
/* 317 */                   ooolOolooll2.I00000oOI();
/* 320 */                   return;
                        }
/* 437 */               return;
                    }
/* 32 */            if (z3) {
/* 437 */               return;
                    }
/* 34 */            this.I0010o = true;
/* 36 */            i00IO11o1Ili i00io11o1ili2 = this.I001i1lo1io;
/* 38 */            OoolOolooll ooolOolooll3 = this.I00111O;
/* 40 */            if (ooolOolooll3 != null) {
/* 42 */                ooolOolooll3.I00000oIO();
                    }
/* 47 */            this.I0000O.setVisibility(0);
/* 53 */            if (this.I000o00OoI0I == 0 && (this.I001IIilI0O || z)) {
/* 63 */                this.I0000O.setTranslationY(0.0f);
/* 72 */                float f2 = -this.I0000O.getHeight();
/* 74 */                if (z) {
/* 82 */                    this.I0000O.getLocationInWindow(new int[]{0, 0});
/* 88 */                    f2 -= r11[1];
                        }
/* 91 */                this.I0000O.setTranslationY(f2);
/* 96 */                OoolOolooll ooolOolooll4 = new OoolOolooll();
/* 101 */               OoolOO ooolOOI00000oIO3 = OooiOl0ioo0i.I00000oIO(this.I0000O);
/* 105 */               ooolOOI00000oIO3.I0001Ioi1lo(0.0f);
/* 108 */               ooolOOI00000oIO3.I0000oI00(iiolilo0iiil);
/* 111 */               boolean z6 = ooolOolooll4.I0000oI00;
/* 113 */               ArrayList arrayList2 = ooolOolooll4.I00000oIO;
/* 115 */               if (!z6) {
/* 117 */                   arrayList2.add(ooolOOI00000oIO3);
                        }
/* 122 */               if (this.I000oI1ioi && view != null) {
/* 126 */                   view.setTranslationY(f2);
/* 129 */                   OoolOO ooolOOI00000oIO4 = OooiOl0ioo0i.I00000oIO(view);
/* 133 */                   ooolOOI00000oIO4.I0001Ioi1lo(0.0f);
/* 138 */                   if (!ooolOolooll4.I0000oI00) {
/* 140 */                       arrayList2.add(ooolOOI00000oIO4);
                            }
                        }
/* 143 */               boolean z7 = ooolOolooll4.I0000oI00;
/* 145 */               if (!z7) {
/* 149 */                   ooolOolooll4.I0000Il00O = I001lIiIIo1O;
                        }
/* 151 */               if (!z7) {
/* 153 */                   ooolOolooll4.I00000oOI = 250L;
                        }
/* 155 */               if (!z7) {
/* 157 */                   ooolOolooll4.I0000O = i00io11o1ili2;
                        }
/* 159 */               this.I00111O = ooolOolooll4;
/* 161 */               ooolOolooll4.I00000oOI();
                    } else {
/* 167 */               this.I0000O.setAlpha(1.0f);
/* 172 */               this.I0000O.setTranslationY(0.0f);
/* 177 */               if (this.I000oI1ioi && view != null) {
/* 181 */                   view.setTranslationY(0.0f);
                        }
/* 184 */               i00io11o1ili2.I0000Il00O();
                    }
/* 187 */           ActionBarOverlayLayout actionBarOverlayLayout = this.I0000Il00O;
/* 189 */           if (actionBarOverlayLayout != null) {
/* 191 */               WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 193 */               actionBarOverlayLayout.requestApplyInsets();
                    }
                }
            }
