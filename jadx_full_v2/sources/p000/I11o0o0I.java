            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import android.view.ActionMode;
            import android.view.KeyCharacterMap;
            import android.view.KeyEvent;
            import android.view.LayoutInflater;
            import android.view.Menu;
            import android.view.MenuItem;
            import android.view.MotionEvent;
            import android.view.SearchEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import android.view.WindowManager;
            import android.view.accessibility.AccessibilityEvent;
            import android.widget.PopupWindow;
            import androidx.appcompat.widget.ActionBarContextView;
            import androidx.appcompat.widget.ViewStubCompat;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.WeakHashMap;
            
/* 6 */     public final class I11o0o0I implements Window.Callback {
                public Window.Callback I00iOIl;
                public boolean I00iiI;
                public boolean I00iiO;
                public boolean I00iio;
                public I11oi01ll I00ilI0I1;

                public final void I00000oIO(Window.Callback callback) {
                    try {
/* 3 */                 this.I00iiI = true;
/* 5 */                 callback.onContentChanged();
                    } finally {
/* 12 */                this.I00iiI = false;
                    }
                }

                public final boolean I00000oOI(int i, Menu menu) {
/* 3 */             return this.I00iOIl.onMenuOpened(i, menu);
                }

                public final void I0000Il00O(int i, Menu menu) {
/* 3 */             this.I00iOIl.onPanelClosed(i, menu);
                }

                public final void I0000O(List list, Menu menu, int i) {
/* 3 */             i00IIiilIoOO.I00000oIO(this.I00iOIl, list, menu, i);
                }

                @Override
                public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
/* 3 */             return this.I00iOIl.dispatchGenericMotionEvent(motionEvent);
                }

                @Override
                public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
/* 1 */             Window.Callback callback = this.I00iOIl;
                    return this.I00iiO ? callback.dispatchKeyEvent(keyEvent) : this.I00ilI0I1.I0010I0i(keyEvent) || callback.dispatchKeyEvent(keyEvent);
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    O1illlIiilIl o1illlIiilIl;
                    boolean zPerformShortcut;
/* 8 */             if (!this.I00iOIl.dispatchKeyShortcutEvent(keyEvent)) {
/* 10 */                I11oi01ll i11oi01ll = this.I00ilI0I1;
/* 12 */                int keyCode = keyEvent.getKeyCode();
/* 16 */                i11oi01ll.I001i1lo1io();
/* 19 */                i00IOoliil0i i00iooliil0i = i11oi01ll.I00li1OI;
/* 22 */                if (i00iooliil0i == null) {
/* 61 */                    I11oO10o1i i11oO10o1i = i11oi01ll.I010OIo1l;
/* 63 */                    if (i11oO10o1i == null || !i11oi01ll.I001lloI(i11oO10o1i, keyEvent.getKeyCode(), keyEvent)) {
/* 84 */                        if (i11oi01ll.I010OIo1l == null) {
/* 86 */                            I11oO10o1i i11oO10o1iI001i1O0Ol = i11oi01ll.I001i1O0Ol(0);
/* 90 */                            i11oi01ll.I00II0Ol1O0l(i11oO10o1iI001i1O0Ol, keyEvent);
/* 97 */                            boolean zI001lloI = i11oi01ll.I001lloI(i11oO10o1iI001i1O0Ol, keyEvent.getKeyCode(), keyEvent);
/* 101 */                           i11oO10o1iI001i1O0Ol.I000iOII = false;
/* 103 */                           if (zI001lloI) {
                                    }
                                }
/* 21 */                        return false;
                            }
/* 75 */                    I11oO10o1i i11oO10o1i2 = i11oi01ll.I010OIo1l;
/* 77 */                    if (i11oO10o1i2 != null) {
/* 79 */                        i11oO10o1i2.I000l1 = true;
/* 7 */                         return true;
                            }
                        } else {
/* 24 */                    i00IOOoolO i00ioooolo = i00iooliil0i.I000OOo1O;
/* 26 */                    if (i00ioooolo == null || (o1illlIiilIl = i00ioooolo.I00ilI0I1) == null) {
/* 28 */                        zPerformShortcut = false;
                            } else {
/* 51 */                        o1illlIiilIl.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
/* 54 */                        zPerformShortcut = o1illlIiilIl.performShortcut(keyCode, keyEvent, 0);
                            }
/* 58 */                    if (!zPerformShortcut) {
                            }
                        }
                    }
/* 7 */             return true;
                }

                @Override
                public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 3 */             return this.I00iOIl.dispatchPopulateAccessibilityEvent(accessibilityEvent);
                }

                @Override
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
/* 3 */             return this.I00iOIl.dispatchTouchEvent(motionEvent);
                }

                @Override
                public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
/* 3 */             return this.I00iOIl.dispatchTrackballEvent(motionEvent);
                }

                @Override
                public final void onActionModeFinished(ActionMode actionMode) {
/* 3 */             this.I00iOIl.onActionModeFinished(actionMode);
                }

                @Override
                public final void onActionModeStarted(ActionMode actionMode) {
/* 3 */             this.I00iOIl.onActionModeStarted(actionMode);
                }

                @Override
                public final void onAttachedToWindow() {
/* 3 */             this.I00iOIl.onAttachedToWindow();
                }

                @Override
                public final void onContentChanged() {
/* 3 */             if (this.I00iiI) {
/* 7 */                 this.I00iOIl.onContentChanged();
                    }
                }

                @Override
                public final boolean onCreatePanelMenu(int i, Menu menu) {
/* 1 */             if (i != 0 || (menu instanceof O1illlIiilIl)) {
/* 11 */                return this.I00iOIl.onCreatePanelMenu(i, menu);
                    }
/* 7 */             return false;
                }

                @Override
                public final View onCreatePanelView(int i) {
/* 3 */             return this.I00iOIl.onCreatePanelView(i);
                }

                @Override
                public final void onDetachedFromWindow() {
/* 3 */             this.I00iOIl.onDetachedFromWindow();
                }

                @Override
                public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
/* 3 */             return this.I00iOIl.onMenuItemSelected(i, menuItem);
                }

                @Override
                public final boolean onMenuOpened(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 1 */             I00000oOI(i, menu);
/* 4 */             I11oi01ll i11oi01ll = this.I00ilI0I1;
/* 9 */             if (i == 108) {
/* 11 */                i11oi01ll.I001i1lo1io();
/* 14 */                i00IOoliil0i i00iooliil0i = i11oi01ll.I00li1OI;
/* 16 */                if (i00iooliil0i != null) {
/* 18 */                    ArrayList arrayList = i00iooliil0i.I000lI;
/* 22 */                    if (true != i00iooliil0i.I000l1) {
/* 25 */                        i00iooliil0i.I000l1 = true;
/* 31 */                        if (arrayList.size() > 0) {
/* 39 */                            arrayList.get(0).getClass();
/* 42 */                            OIiilo1Ool0o.I00000oIO();
/* 34 */                            return false;
                                }
                            }
                        }
                    }
/* 8 */             return true;
                }

                @Override
                public final void onPanelClosed(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 3 */             if (this.I00iio) {
/* 7 */                 this.I00iOIl.onPanelClosed(i, menu);
/* 10 */                return;
                    }
/* 11 */            I0000Il00O(i, menu);
/* 14 */            I11oi01ll i11oi01ll = this.I00ilI0I1;
/* 19 */            if (i != 108) {
/* 55 */                if (i == 0) {
/* 57 */                    I11oO10o1i i11oO10o1iI001i1O0Ol = i11oi01ll.I001i1O0Ol(i);
/* 63 */                    if (i11oO10o1iI001i1O0Ol.I000lI) {
/* 65 */                        i11oi01ll.I00100l0(i11oO10o1iI001i1O0Ol, false);
/* 106 */                       return;
                            }
/* 106 */                   return;
                        }
/* 106 */               return;
                    }
/* 21 */            i11oi01ll.I001i1lo1io();
/* 24 */            i00IOoliil0i i00iooliil0i = i11oi01ll.I00li1OI;
/* 26 */            if (i00iooliil0i != null) {
/* 28 */                ArrayList arrayList = i00iooliil0i.I000lI;
/* 32 */                if (i00iooliil0i.I000l1) {
/* 35 */                    i00iooliil0i.I000l1 = false;
/* 41 */                    if (arrayList.size() <= 0) {
/* 106 */                       return;
                            }
/* 48 */                    arrayList.get(0).getClass();
/* 51 */                    OIiilo1Ool0o.I00000oIO();
                        }
                    }
                }

                @Override
                public final void onPointerCaptureChanged(boolean z) {
/* 3 */             i00IO00.I00000oIO(this.I00iOIl, z);
                }

                @Override
                public final boolean onPreparePanel(int i, View view, Menu menu) {
/* 9 */             O1illlIiilIl o1illlIiilIl = menu instanceof O1illlIiilIl ? (O1illlIiilIl) menu : null;
/* 11 */            if (i == 0 && o1illlIiilIl == null) {
/* 10 */                return false;
                    }
/* 16 */            if (o1illlIiilIl != null) {
/* 19 */                o1illlIiilIl.I001i1lo1io = true;
                    }
/* 23 */            boolean zOnPreparePanel = this.I00iOIl.onPreparePanel(i, view, menu);
/* 27 */            if (o1illlIiilIl != null) {
/* 29 */                o1illlIiilIl.I001i1lo1io = false;
                    }
/* 98 */            return zOnPreparePanel;
                }

                @Override
                public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
/* 8 */             O1illlIiilIl o1illlIiilIl = this.I00ilI0I1.I001i1O0Ol(0).I000O01llI0;
/* 10 */            if (o1illlIiilIl != null) {
/* 12 */                I0000O(list, o1illlIiilIl, i);
                    } else {
/* 16 */                I0000O(list, menu, i);
                    }
                }

                @Override
                public final boolean onSearchRequested(SearchEvent searchEvent) {
/* 3 */             return i00IIOoOoOI.I00000oIO(this.I00iOIl, searchEvent);
                }

                @Override
                public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
/* 3 */             this.I00iOIl.onWindowAttributesChanged(layoutParams);
                }

                @Override
                public final void onWindowFocusChanged(boolean z) {
/* 3 */             this.I00iOIl.onWindowFocusChanged(z);
                }

                @Override
                public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    ViewGroup viewGroup;
/* 1 */             I11oi01ll i11oi01ll = this.I00ilI0I1;
/* 3 */             Context context = i11oi01ll.I00ioIO;
/* 7 */             if (!i11oi01ll.I00oOio10iI1 || i != 0) {
/* 551 */               return i00IIOoOoOI.I00000oOI(this.I00iOIl, callback, i);
                    }
/* 15 */            o01l1ioOo0 o01l1iooo0 = new o01l1ioOo0();
/* 18 */            o01l1iooo0.I00iiI = context;
/* 20 */            o01l1iooo0.I00iOIl = callback;
/* 27 */            o01l1iooo0.I00iiO = new ArrayList();
/* 35 */            o01l1iooo0.I00iio = new Ol0Ii10o1(0);
/* 37 */            VarHandle.storeStoreFence();
/* 40 */            I0I1liIO0ii i0I1liIO0ii = i11oi01ll.I00o101lO;
/* 42 */            if (i0I1liIO0ii != null) {
/* 44 */                i0I1liIO0ii.I00000oOI();
                    }
/* 50 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(3);
/* 53 */            i1I0i0Ilo1Oi.I00iiO = i11oi01ll;
/* 55 */            i1I0i0Ilo1Oi.I00iiI = o01l1iooo0;
/* 57 */            VarHandle.storeStoreFence();
/* 60 */            i11oi01ll.I001i1lo1io();
/* 63 */            i00IOoliil0i i00iooliil0i = i11oi01ll.I00li1OI;
/* 65 */            int i2 = 1;
/* 67 */            if (i00iooliil0i != null) {
/* 69 */                i00IOOoolO i00ioooolo = i00iooliil0i.I000OOo1O;
/* 71 */                if (i00ioooolo != null) {
/* 73 */                    i00ioooolo.I00000oOI();
                        }
/* 78 */                i00iooliil0i.I0000Il00O.setHideOnContentScrollEnabled(false);
/* 83 */                i00iooliil0i.I0001Ioi1lo.I0000oI00();
/* 90 */                Context context2 = i00iooliil0i.I0001Ioi1lo.getContext();
/* 94 */                i00IOOoolO i00ioooolo2 = new i00IOOoolO();
/* 97 */                i00ioooolo2.I00ioIO = i00iooliil0i;
/* 99 */                i00ioooolo2.I00iio = context2;
/* 101 */               i00ioooolo2.I00ilO0 = i1I0i0Ilo1Oi;
/* 105 */               O1illlIiilIl o1illlIiilIl = new O1illlIiilIl(context2);
/* 108 */               o1illlIiilIl.I000l1 = 1;
/* 110 */               i00ioooolo2.I00ilI0I1 = o1illlIiilIl;
/* 112 */               o1illlIiilIl.I0000oI00 = i00ioooolo2;
/* 114 */               VarHandle.storeStoreFence();
/* 117 */               o1illlIiilIl.I001i1O0Ol();
                        try {
/* 133 */                   if (((o01l1ioOo0) i00ioooolo2.I00ilO0.I00iiI).I000lI(i00ioooolo2, o1illlIiilIl)) {
/* 135 */                       i00iooliil0i.I000OOo1O = i00ioooolo2;
/* 137 */                       i00ioooolo2.I000OiO();
/* 142 */                       i00iooliil0i.I0001Ioi1lo.I0000Il00O(i00ioooolo2);
/* 145 */                       i00iooliil0i.I00000oIO(true);
                            } else {
/* 149 */                       i00ioooolo2 = null;
                            }
/* 150 */                   i11oi01ll.I00o101lO = i00ioooolo2;
                        } finally {
/* 154 */                   o1illlIiilIl.I001IO000();
                        }
                    }
/* 160 */           if (i11oi01ll.I00o101lO == null) {
/* 162 */               OoolOO ooolOO = i11oi01ll.I00oO101o;
/* 164 */               if (ooolOO != null) {
/* 166 */                   ooolOO.I00000oOI();
                        }
/* 169 */               I0I1liIO0ii i0I1liIO0ii2 = i11oi01ll.I00o101lO;
/* 171 */               if (i0I1liIO0ii2 != null) {
/* 173 */                   i0I1liIO0ii2.I00000oOI();
                        }
/* 178 */               if (i11oi01ll.I00oI0i == null) {
/* 182 */                   if (i11oi01ll.I0100o111I) {
/* 186 */                       TypedValue typedValue = new TypedValue();
/* 189 */                       Resources.Theme theme = context.getTheme();
/* 196 */                       theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
/* 201 */                       if (typedValue.resourceId != 0) {
/* 207 */                           Resources.Theme themeNewTheme = context.getResources().newTheme();
/* 211 */                           themeNewTheme.setTo(theme);
/* 216 */                           themeNewTheme.applyStyle(typedValue.resourceId, true);
/* 221 */                           IOoiOIIOOIi iOoiOIIOOIi = new IOoiOIIOOIi(context, 0);
/* 228 */                           iOoiOIIOOIi.getTheme().setTo(themeNewTheme);
/* 231 */                           context = iOoiOIIOOIi;
                                }
/* 237 */                       i11oi01ll.I00oI0i = new ActionBarContextView(context);
/* 244 */                       PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
/* 247 */                       i11oi01ll.I00oII = popupWindow;
/* 250 */                       popupWindow.setWindowLayoutType(2);
/* 257 */                       i11oi01ll.I00oII.setContentView(i11oi01ll.I00oI0i);
/* 263 */                       i11oi01ll.I00oII.setWidth(-1);
/* 273 */                       context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
/* 292 */                       i11oi01ll.I00oI0i.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
/* 298 */                       i11oi01ll.I00oII.setHeight(-2);
/* 303 */                       I11lo00IoiIo i11lo00IoiIo = new I11lo00IoiIo(i2);
/* 306 */                       i11lo00IoiIo.I00iiI = i11oi01ll;
/* 308 */                       VarHandle.storeStoreFence();
/* 311 */                       i11oi01ll.I00oIiI10 = i11lo00IoiIo;
                            } else {
/* 323 */                       ViewStubCompat viewStubCompat = (ViewStubCompat) i11oi01ll.I00olI.findViewById(R.id.action_mode_bar_stub);
/* 325 */                       if (viewStubCompat != null) {
/* 327 */                           i11oi01ll.I001i1lo1io();
/* 330 */                           i00IOoliil0i i00iooliil0i2 = i11oi01ll.I00li1OI;
/* 339 */                           Context contextI00000oOI = i00iooliil0i2 != null ? i00iooliil0i2.I00000oOI() : null;
/* 340 */                           if (contextI00000oOI != null) {
/* 343 */                               context = contextI00000oOI;
                                    }
/* 348 */                           viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
/* 357 */                           i11oi01ll.I00oI0i = (ActionBarContextView) viewStubCompat.I00000oIO();
                                }
                            }
                        }
/* 361 */               if (i11oi01ll.I00oI0i != null) {
/* 363 */                   OoolOO ooolOO2 = i11oi01ll.I00oO101o;
/* 365 */                   if (ooolOO2 != null) {
/* 367 */                       ooolOO2.I00000oOI();
                            }
/* 372 */                   i11oi01ll.I00oI0i.I0000oI00();
/* 379 */                   Context context3 = i11oi01ll.I00oI0i.getContext();
/* 383 */                   ActionBarContextView actionBarContextView = i11oi01ll.I00oI0i;
/* 385 */                   OlIl0I1Il olIl0I1Il = new OlIl0I1Il();
/* 388 */                   olIl0I1Il.I00iio = context3;
/* 390 */                   olIl0I1Il.I00ilI0I1 = actionBarContextView;
/* 392 */                   olIl0I1Il.I00ilO0 = i1I0i0Ilo1Oi;
/* 400 */                   O1illlIiilIl o1illlIiilIl2 = new O1illlIiilIl(actionBarContextView.getContext());
/* 403 */                   o1illlIiilIl2.I000l1 = 1;
/* 405 */                   olIl0I1Il.I00l0I0l0lO1 = o1illlIiilIl2;
/* 407 */                   o1illlIiilIl2.I0000oI00 = olIl0I1Il;
/* 417 */                   if (((o01l1ioOo0) i1I0i0Ilo1Oi.I00iiI).I000lI(olIl0I1Il, o1illlIiilIl2)) {
/* 419 */                       olIl0I1Il.I000OiO();
/* 424 */                       i11oi01ll.I00oI0i.I0000Il00O(olIl0I1Il);
/* 427 */                       i11oi01ll.I00o101lO = olIl0I1Il;
/* 445 */                       boolean z = i11oi01ll.I00ol1 && (viewGroup = i11oi01ll.I00olI) != null && viewGroup.isLaidOut();
/* 446 */                       ActionBarContextView actionBarContextView2 = i11oi01ll.I00oI0i;
/* 450 */                       if (z) {
/* 453 */                           actionBarContextView2.setAlpha(0.0f);
/* 458 */                           OoolOO ooolOOI00000oIO = OooiOl0ioo0i.I00000oIO(i11oi01ll.I00oI0i);
/* 462 */                           ooolOOI00000oIO.I00000oIO(1.0f);
/* 465 */                           i11oi01ll.I00oO101o = ooolOOI00000oIO;
/* 469 */                           I11loI10l1IO i11loI10l1IO = new I11loI10l1IO(i2);
/* 472 */                           i11loI10l1IO.I00000oOI = i11oi01ll;
/* 474 */                           VarHandle.storeStoreFence();
/* 477 */                           ooolOOI00000oIO.I0000O(i11loI10l1IO);
                                } else {
/* 481 */                           actionBarContextView2.setAlpha(1.0f);
/* 486 */                           i11oi01ll.I00oI0i.setVisibility(0);
/* 497 */                           if (i11oi01ll.I00oI0i.getParent() instanceof View) {
/* 505 */                               View view = (View) i11oi01ll.I00oI0i.getParent();
/* 507 */                               WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 509 */                               view.requestApplyInsets();
                                    }
                                }
/* 514 */                       if (i11oi01ll.I00oII != null) {
/* 524 */                           i11oi01ll.I00l0I0l0lO1.getDecorView().post(i11oi01ll.I00oIiI10);
                                }
                            } else {
/* 528 */                       i11oi01ll.I00o101lO = null;
                            }
                        }
/* 530 */               i11oi01ll.I00IO1();
/* 535 */               i11oi01ll.I00o101lO = i11oi01ll.I00o101lO;
                    }
/* 537 */           i11oi01ll.I00IO1();
/* 540 */           I0I1liIO0ii i0I1liIO0ii3 = i11oi01ll.I00o101lO;
/* 542 */           if (i0I1liIO0ii3 != null) {
/* 544 */               return o01l1iooo0.I000OiO(i0I1liIO0ii3);
                    }
/* 66 */            return null;
                }

                @Override
/* 7 */         public final boolean onSearchRequested() {
/* 8 */             return this.I00iOIl.onSearchRequested();
                }

                @Override
/* 555 */       public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
/* 556 */           return null;
                }
            }
