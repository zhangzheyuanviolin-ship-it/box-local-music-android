            package p000;

            import android.content.Context;
            import android.content.DialogInterface;
            import android.graphics.drawable.Drawable;
            import android.os.Bundle;
            import android.text.TextUtils;
            import android.util.TypedValue;
            import android.view.KeyEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import android.widget.Button;
            import android.widget.FrameLayout;
            import android.widget.ImageView;
            import android.widget.LinearLayout;
            import android.widget.ListAdapter;
            import android.widget.TextView;
            import androidx.appcompat.app.AlertController$RecycleListView;
            import androidx.core.widget.NestedScrollView;
            import com.box.gallery.R;
            import java.lang.reflect.InvocationTargetException;
            import java.util.WeakHashMap;
            
/* 10 */    public final class I0ilIO0oloO1 extends IOiOOll1 implements DialogInterface, I11l0lol {
                public I11oi01ll I00ilI0I1;
                public I11olO0Iloo I00ilO0;
                public I0ilI1OoOo I00io1l;

                public static int I000OOo1O(Context context, int i) {
/* 6 */             if (((i >>> 24) & 255) >= 1) {
/* 8 */                 return i;
                    }
/* 11 */            TypedValue typedValue = new TypedValue();
/* 21 */            context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
/* 24 */            return typedValue.resourceId;
                }

                public final I11lil0o I0001Ioi1lo() {
/* 1 */             I11oi01ll i11oi01ll = this.I00ilI0I1;
/* 3 */             if (i11oi01ll != null) {
/* 55 */                return i11oi01ll;
                    }
/* 5 */             I11liO i11liO = I11lil0o.I00iOIl;
/* 17 */            I11oi01ll i11oi01ll2 = new I11oi01ll(getContext(), getWindow(), this, this);
/* 20 */            this.I00ilI0I1 = i11oi01ll2;
/* 55 */            return i11oi01ll2;
                }

                public final void I000II(Bundle bundle) {
/* 5 */             I0001Ioi1lo().I00000oIO();
/* 8 */             super.onCreate(bundle);
/* 15 */            I0001Ioi1lo().I0000Il00O();
                }

                public final void I000OiO(CharSequence charSequence) {
/* 1 */             super.setTitle(charSequence);
/* 8 */             I0001Ioi1lo().I000iOII(charSequence);
                }

                @Override
                public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 1 */             I0000O();
/* 8 */             I11oi01ll i11oi01ll = (I11oi01ll) I0001Ioi1lo();
/* 10 */            i11oi01ll.I00111O();
/* 24 */            ((ViewGroup) i11oi01ll.I00olI.findViewById(android.R.id.content)).addView(view, layoutParams);
/* 35 */            i11oi01ll.I00l0OO0IO.I00000oIO(i11oi01ll.I00l0I0l0lO1.getCallback());
                }

                @Override
                public final void dismiss() {
/* 1 */             super.dismiss();
/* 8 */             I0001Ioi1lo().I0000oI00();
                }

                @Override
                public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
/* 5 */             getWindow().getDecorView();
/* 8 */             I11olO0Iloo i11olO0Iloo = this.I00ilO0;
/* 10 */            if (i11olO0Iloo == null) {
/* 12 */                return false;
                    }
/* 16 */            return super.dispatchKeyEvent(keyEvent);
                }

                @Override
                public final View findViewById(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 5 */             I11oi01ll i11oi01ll = (I11oi01ll) I0001Ioi1lo();
/* 7 */             i11oi01ll.I00111O();
/* 12 */            return i11oi01ll.I00l0I0l0lO1.findViewById(i);
                }

                @Override
                public final void invalidateOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 5 */             I11oi01ll i11oi01ll = (I11oi01ll) I0001Ioi1lo();
/* 9 */             if (i11oi01ll.I00li1OI != null) {
/* 11 */                i11oi01ll.I001i1lo1io();
/* 16 */                i11oi01ll.I00li1OI.getClass();
/* 20 */                i11oi01ll.I001iOo1i0O(0);
                    }
                }

                @Override
                public final void onCreate(Bundle bundle) {
                    CharSequence charSequence;
                    int i;
                    ListAdapter listAdapter;
                    View viewFindViewById;
/* 1 */             I000II(bundle);
/* 6 */             I0ilI1OoOo i0ilI1OoOo = this.I00io1l;
/* 12 */            i0ilI1OoOo.I00000oOI.setContentView(i0ilI1OoOo.I001IIilI0O);
/* 15 */            Context context = i0ilI1OoOo.I00000oIO;
/* 17 */            Window window = i0ilI1OoOo.I0000Il00O;
/* 22 */            View viewFindViewById2 = window.findViewById(R.id.parentPanel);
/* 29 */            View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
/* 36 */            View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
/* 43 */            View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
/* 54 */            ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
/* 56 */            View view = i0ilI1OoOo.I0001Ioi1lo;
/* 58 */            if (view == null) {
/* 61 */                view = null;
                    }
/* 67 */            boolean z = view != null;
/* 68 */            if (!z || !I0ilI1OoOo.I00000oIO(view)) {
/* 78 */                window.setFlags(131072, 131072);
                    }
/* 84 */            if (z) {
/* 93 */                FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
/* 95 */                charSequence = null;
/* 102 */               frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
/* 107 */               if (i0ilI1OoOo.I000II) {
/* 109 */                   frameLayout.setPadding(0, 0, 0, 0);
                        }
/* 114 */               if (i0ilI1OoOo.I0000oI00 != null) {
/* 123 */                   ((LinearLayout.LayoutParams) ((O0ooII1) viewGroup.getLayoutParams())).weight = 0.0f;
                        }
                    } else {
/* 126 */               charSequence = null;
/* 128 */               viewGroup.setVisibility(8);
                    }
/* 131 */           View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
/* 135 */           View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
/* 139 */           View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
/* 143 */           ViewGroup viewGroupI00000oOI = I0ilI1OoOo.I00000oOI(viewFindViewById6, viewFindViewById3);
/* 147 */           ViewGroup viewGroupI00000oOI2 = I0ilI1OoOo.I00000oOI(viewFindViewById7, viewFindViewById4);
/* 151 */           ViewGroup viewGroupI00000oOI3 = I0ilI1OoOo.I00000oOI(viewFindViewById8, viewFindViewById5);
/* 162 */           NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
/* 164 */           i0ilI1OoOo.I000lI = nestedScrollView;
/* 166 */           nestedScrollView.setFocusable(false);
/* 171 */           i0ilI1OoOo.I000lI.setNestedScrollingEnabled(false);
/* 181 */           TextView textView = (TextView) viewGroupI00000oOI2.findViewById(android.R.id.message);
/* 183 */           i0ilI1OoOo.I00100o1O0lo = textView;
/* 185 */           if (textView != null) {
/* 188 */               textView.setVisibility(8);
/* 195 */               i0ilI1OoOo.I000lI.removeView(i0ilI1OoOo.I00100o1O0lo);
/* 200 */               if (i0ilI1OoOo.I0000oI00 != null) {
/* 208 */                   ViewGroup viewGroup2 = (ViewGroup) i0ilI1OoOo.I000lI.getParent();
/* 212 */                   int iIndexOfChild = viewGroup2.indexOfChild(i0ilI1OoOo.I000lI);
/* 216 */                   viewGroup2.removeViewAt(iIndexOfChild);
/* 226 */                   viewGroup2.addView(i0ilI1OoOo.I0000oI00, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                        } else {
/* 230 */                   viewGroupI00000oOI2.setVisibility(8);
                        }
                    }
/* 240 */           Button button = (Button) viewGroupI00000oOI3.findViewById(android.R.id.button1);
/* 242 */           i0ilI1OoOo.I000O01llI0 = button;
/* 244 */           I0I0o01l i0I0o01l = i0ilI1OoOo.I001i1lo1io;
/* 246 */           button.setOnClickListener(i0I0o01l);
/* 249 */           boolean zIsEmpty = TextUtils.isEmpty(charSequence);
/* 253 */           Button button2 = i0ilI1OoOo.I000O01llI0;
/* 255 */           if (zIsEmpty) {
/* 257 */               button2.setVisibility(8);
/* 260 */               i = 0;
                    } else {
/* 264 */               button2.setText(charSequence);
/* 269 */               i0ilI1OoOo.I000O01llI0.setVisibility(0);
/* 272 */               i = 1;
                    }
/* 280 */           Button button3 = (Button) viewGroupI00000oOI3.findViewById(android.R.id.button2);
/* 282 */           i0ilI1OoOo.I000OOo1O = button3;
/* 284 */           button3.setOnClickListener(i0I0o01l);
/* 289 */           boolean zIsEmpty2 = TextUtils.isEmpty(i0ilI1OoOo.I000OiO);
/* 293 */           Button button4 = i0ilI1OoOo.I000OOo1O;
/* 295 */           if (zIsEmpty2) {
/* 297 */               button4.setVisibility(8);
                    } else {
/* 303 */               button4.setText(i0ilI1OoOo.I000OiO);
/* 308 */               i0ilI1OoOo.I000OOo1O.setVisibility(0);
/* 311 */               i |= 2;
                    }
/* 320 */           Button button5 = (Button) viewGroupI00000oOI3.findViewById(android.R.id.button3);
/* 322 */           i0ilI1OoOo.I000l1 = button5;
/* 324 */           button5.setOnClickListener(i0I0o01l);
/* 328 */           boolean zIsEmpty3 = TextUtils.isEmpty(null);
/* 332 */           Button button6 = i0ilI1OoOo.I000l1;
/* 334 */           if (zIsEmpty3) {
/* 336 */               button6.setVisibility(8);
                    } else {
/* 340 */               button6.setText((CharSequence) null);
/* 345 */               i0ilI1OoOo.I000l1.setVisibility(0);
/* 348 */               i |= 4;
                    }
/* 352 */           TypedValue typedValue = new TypedValue();
/* 363 */           context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
/* 369 */           if (typedValue.data != 0) {
/* 373 */               if (i == 1) {
/* 375 */                   Button button7 = i0ilI1OoOo.I000O01llI0;
/* 381 */                   LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
/* 383 */                   layoutParams.gravity = 1;
/* 385 */                   layoutParams.weight = 0.5f;
/* 387 */                   button7.setLayoutParams(layoutParams);
                        } else if (i == 2) {
/* 393 */                   Button button8 = i0ilI1OoOo.I000OOo1O;
/* 399 */                   LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
/* 401 */                   layoutParams2.gravity = 1;
/* 403 */                   layoutParams2.weight = 0.5f;
/* 405 */                   button8.setLayoutParams(layoutParams2);
                        } else if (i == 4) {
/* 412 */                   Button button9 = i0ilI1OoOo.I000l1;
/* 418 */                   LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
/* 420 */                   layoutParams3.gravity = 1;
/* 422 */                   layoutParams3.weight = 0.5f;
/* 424 */                   button9.setLayoutParams(layoutParams3);
                        }
                    }
/* 427 */           if (i == 0) {
/* 430 */               viewGroupI00000oOI3.setVisibility(8);
                    }
/* 438 */           if (i0ilI1OoOo.I0010I0i != null) {
/* 448 */               viewGroupI00000oOI.addView(i0ilI1OoOo.I0010I0i, 0, new ViewGroup.LayoutParams(-1, -2));
/* 455 */               window.findViewById(R.id.title_template).setVisibility(8);
                    } else {
/* 468 */               i0ilI1OoOo.I000oI1ioi = (ImageView) window.findViewById(android.R.id.icon);
/* 476 */               if (TextUtils.isEmpty(i0ilI1OoOo.I0000O) || !i0ilI1OoOo.I001IO000) {
/* 547 */                   window.findViewById(R.id.title_template).setVisibility(8);
/* 552 */                   i0ilI1OoOo.I000oI1ioi.setVisibility(8);
/* 555 */                   viewGroupI00000oOI.setVisibility(8);
                        } else {
/* 489 */                   TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
/* 491 */                   i0ilI1OoOo.I00100l0 = textView2;
/* 495 */                   textView2.setText(i0ilI1OoOo.I0000O);
/* 498 */                   Drawable drawable = i0ilI1OoOo.I000o00OoI0I;
/* 500 */                   if (drawable != null) {
/* 504 */                       i0ilI1OoOo.I000oI1ioi.setImageDrawable(drawable);
                            } else {
/* 534 */                       i0ilI1OoOo.I00100l0.setPadding(i0ilI1OoOo.I000oI1ioi.getPaddingLeft(), i0ilI1OoOo.I000oI1ioi.getPaddingTop(), i0ilI1OoOo.I000oI1ioi.getPaddingRight(), i0ilI1OoOo.I000oI1ioi.getPaddingBottom());
/* 539 */                       i0ilI1OoOo.I000oI1ioi.setVisibility(8);
                            }
                        }
                    }
/* 566 */           boolean z2 = viewGroup.getVisibility() != 8;
/* 577 */           int i2 = (viewGroupI00000oOI == null || viewGroupI00000oOI.getVisibility() == 8) ? 0 : 1;
/* 586 */           boolean z3 = viewGroupI00000oOI3.getVisibility() != 8;
/* 587 */           if (!z3 && (viewFindViewById = viewGroupI00000oOI2.findViewById(R.id.textSpacerNoButtons)) != null) {
/* 598 */               viewFindViewById.setVisibility(0);
                    }
/* 601 */           if (i2 != 0) {
/* 603 */               NestedScrollView nestedScrollView2 = i0ilI1OoOo.I000lI;
/* 605 */               if (nestedScrollView2 != null) {
/* 608 */                   nestedScrollView2.setClipToPadding(true);
                        }
/* 623 */               View viewFindViewById9 = i0ilI1OoOo.I0000oI00 != null ? viewGroupI00000oOI.findViewById(R.id.titleDividerNoCustom) : null;
/* 624 */               if (viewFindViewById9 != null) {
/* 626 */                   viewFindViewById9.setVisibility(0);
                        }
                    } else {
/* 633 */               View viewFindViewById10 = viewGroupI00000oOI2.findViewById(R.id.textSpacerNoTitle);
/* 637 */               if (viewFindViewById10 != null) {
/* 639 */                   viewFindViewById10.setVisibility(0);
                        }
                    }
/* 642 */           AlertController$RecycleListView alertController$RecycleListView = i0ilI1OoOo.I0000oI00;
/* 644 */           if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
/* 676 */               alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.I00iOIl, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.I00iiI);
                    }
/* 679 */           if (!z2) {
/* 681 */               View view2 = i0ilI1OoOo.I0000oI00;
/* 683 */               if (view2 == null) {
/* 686 */                   view2 = i0ilI1OoOo.I000lI;
                        }
/* 688 */               if (view2 != null) {
/* 690 */                   int i3 = z3 ? 2 : 0;
/* 697 */                   View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
/* 704 */                   View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
/* 708 */                   WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 711 */                   view2.setScrollIndicators(i2 | i3, 3);
/* 714 */                   if (viewFindViewById11 != null) {
/* 716 */                       viewGroupI00000oOI2.removeView(viewFindViewById11);
                            }
/* 719 */                   if (viewFindViewById12 != null) {
/* 721 */                       viewGroupI00000oOI2.removeView(viewFindViewById12);
                            }
                        }
                    }
/* 724 */           AlertController$RecycleListView alertController$RecycleListView2 = i0ilI1OoOo.I0000oI00;
/* 726 */           if (alertController$RecycleListView2 == null || (listAdapter = i0ilI1OoOo.I0010o) == null) {
/* 1261 */              return;
                    }
/* 732 */           alertController$RecycleListView2.setAdapter(listAdapter);
/* 735 */           int i4 = i0ilI1OoOo.I00111O;
/* 737 */           if (i4 > -1) {
/* 740 */               alertController$RecycleListView2.setItemChecked(i4, true);
/* 743 */               alertController$RecycleListView2.setSelection(i4);
                    }
                }

                @Override
                public final boolean onKeyDown(int i, KeyEvent keyEvent) {
/* 3 */             NestedScrollView nestedScrollView = this.I00io1l.I000lI;
/* 5 */             if (nestedScrollView == null || !nestedScrollView.I000OiO(keyEvent)) {
/* 15 */                return super.onKeyDown(i, keyEvent);
                    }
/* 13 */            return true;
                }

                @Override
                public final boolean onKeyUp(int i, KeyEvent keyEvent) {
/* 3 */             NestedScrollView nestedScrollView = this.I00io1l.I000lI;
/* 5 */             if (nestedScrollView == null || !nestedScrollView.I000OiO(keyEvent)) {
/* 15 */                return super.onKeyUp(i, keyEvent);
                    }
/* 13 */            return true;
                }

                @Override
                public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 1 */             super.onStop();
/* 8 */             I11oi01ll i11oi01ll = (I11oi01ll) I0001Ioi1lo();
/* 10 */            i11oi01ll.I001i1lo1io();
/* 13 */            i00IOoliil0i i00iooliil0i = i11oi01ll.I00li1OI;
/* 15 */            if (i00iooliil0i != null) {
/* 18 */                i00iooliil0i.I001IIilI0O = false;
/* 20 */                OoolOolooll ooolOolooll = i00iooliil0i.I00111O;
/* 22 */                if (ooolOolooll != null) {
/* 24 */                    ooolOolooll.I00000oIO();
                        }
                    }
                }

                @Override
                public final void setContentView(int i) {
/* 1 */             I0000O();
/* 8 */             I0001Ioi1lo().I000O01llI0(i);
                }

                @Override
                public final void setTitle(int i) {
/* 1 */             super.setTitle(i);
/* 16 */            I0001Ioi1lo().I000iOII(getContext().getString(i));
                }

                @Override
/* 11 */        public final void setContentView(View view) {
/* 12 */            I0000O();
/* 13 */            I0001Ioi1lo().I000OOo1O(view);
                }

                @Override
/* 13 */        public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
/* 14 */            I0000O();
/* 15 */            I0001Ioi1lo().I000OiO(view, layoutParams);
                }

                @Override
/* 19 */        public final void setTitle(CharSequence charSequence) {
/* 20 */            I000OiO(charSequence);
/* 21 */            I0ilI1OoOo i0ilI1OoOo = this.I00io1l;
/* 22 */            i0ilI1OoOo.I0000O = charSequence;
/* 23 */            TextView textView = i0ilI1OoOo.I00100l0;
                    if (textView != null) {
/* 24 */                textView.setText(charSequence);
                    }
                }
            }
