            package p000;

            import android.R;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.content.res.Configuration;
            import android.content.res.Resources;
            import android.os.Bundle;
            import android.view.ContextThemeWrapper;
            import android.view.KeyEvent;
            import android.view.MenuInflater;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.ViewGroup;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.util.ArrayList;
            
/* 10 */    public abstract class I11io0O0O1o1 extends Ill0oOi0 implements I11l0lol {
                public I11oi01ll I00oliIiO01i;

                public I11io0O0O1o1() {
/* 8 */             I1I0i0Ilo1Oi i1I0i0Ilo1Oi = (I1I0i0Ilo1Oi) this.I00iio.I00iiO;
/* 12 */            int i = 0;
/* 13 */            I11il0o0 i11il0o0 = new I11il0o0(i);
/* 16 */            i11il0o0.I00000oOI = this;
/* 18 */            VarHandle.storeStoreFence();
/* 23 */            i1I0i0Ilo1Oi.I00Ol00("androidx:appcompat", i11il0o0);
/* 28 */            I11ilOI01O i11ilOI01O = new I11ilOI01O(i);
/* 31 */            i11ilOI01O.I00000oOI = this;
/* 33 */            VarHandle.storeStoreFence();
/* 36 */            I000l1(i11ilOI01O);
                }

                public final I11lil0o I0010o() {
/* 1 */             I11oi01ll i11oi01ll = this.I00oliIiO01i;
/* 3 */             if (i11oi01ll != null) {
/* 20 */                return i11oi01ll;
                    }
/* 5 */             I11liO i11liO = I11lil0o.I00iOIl;
/* 10 */            I11oi01ll i11oi01ll2 = new I11oi01ll(this, null, this, this);
/* 13 */            this.I00oliIiO01i = i11oi01ll2;
/* 20 */            return i11oi01ll2;
                }

                public final i00IOoliil0i I00111O() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 5 */             I11oi01ll i11oi01ll = (I11oi01ll) I0010o();
/* 7 */             i11oi01ll.I001i1lo1io();
/* 10 */            return i11oi01ll.I00li1OI;
                }

                @Override
                public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 1 */             I000lI();
/* 8 */             I11oi01ll i11oi01ll = (I11oi01ll) I0010o();
/* 10 */            i11oi01ll.I00111O();
/* 24 */            ((ViewGroup) i11oi01ll.I00olI.findViewById(R.id.content)).addView(view, layoutParams);
/* 35 */            i11oi01ll.I00l0OO0IO.I00000oIO(i11oi01ll.I00l0I0l0lO1.getCallback());
                }

                @Override
                public final void attachBaseContext(Context context) {
/* 5 */             I11oi01ll i11oi01ll = (I11oi01ll) I0010o();
/* 8 */             i11oi01ll.I010iIIOlo = true;
/* 10 */            int i = i11oi01ll.I010l1ol111;
/* 14 */            if (i == -100) {
/* 17 */                i = I11lil0o.I00iiI;
                    }
/* 19 */            int iI001l0I00 = i11oi01ll.I001l0I00(context, i);
/* 27 */            int i2 = 0;
/* 28 */            if (I11lil0o.I00000oOI(context) && I11lil0o.I00000oOI(context) && !I11lil0o.I00iio) {
/* 41 */                I11liO i11liO = I11lil0o.I00iOIl;
/* 45 */                I11lIIO1ol0i i11lIIO1ol0i = new I11lIIO1ol0i(i2);
/* 48 */                i11lIIO1ol0i.I00iiI = context;
/* 50 */                VarHandle.storeStoreFence();
/* 53 */                i11liO.execute(i11lIIO1ol0i);
                    }
/* 58 */            Configuration configuration = null;
/* 59 */            if (context instanceof ContextThemeWrapper) {
                        try {
/* 68 */                    ((ContextThemeWrapper) context).applyOverrideConfiguration(I11oi01ll.I00100o1O0lo(context, iI001l0I00, null, false));
                        } catch (IllegalStateException unused) {
                        }
                    } else if (context instanceof IOoiOIIOOIi) {
                        try {
/* 84 */                    ((IOoiOIIOOIi) context).I00000oIO(I11oi01ll.I00100o1O0lo(context, iI001l0I00, null, false));
                        } catch (IllegalStateException unused2) {
                        }
                    } else if (I11oi01ll.I011lIilI0lo) {
/* 97 */                Configuration configuration2 = new Configuration();
/* 101 */               configuration2.uiMode = -1;
/* 104 */               configuration2.fontScale = 0.0f;
/* 114 */               Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
/* 122 */               Configuration configuration4 = context.getResources().getConfiguration();
/* 128 */               configuration3.uiMode = configuration4.uiMode;
/* 134 */               if (!configuration3.equals(configuration4)) {
/* 138 */                   configuration = new Configuration();
/* 141 */                   configuration.fontScale = 0.0f;
/* 147 */                   if (configuration3.diff(configuration4) != 0) {
/* 151 */                       float f = configuration3.fontScale;
/* 153 */                       float f2 = configuration4.fontScale;
/* 157 */                       if (f != f2) {
/* 159 */                           configuration.fontScale = f2;
                                }
/* 161 */                       int i3 = configuration3.mcc;
/* 163 */                       int i4 = configuration4.mcc;
/* 165 */                       if (i3 != i4) {
/* 167 */                           configuration.mcc = i4;
                                }
/* 169 */                       int i5 = configuration3.mnc;
/* 171 */                       int i6 = configuration4.mnc;
/* 173 */                       if (i5 != i6) {
/* 175 */                           configuration.mnc = i6;
                                }
/* 177 */                       I11loolloI1.I00000oIO(configuration3, configuration4, configuration);
/* 180 */                       int i7 = configuration3.touchscreen;
/* 182 */                       int i8 = configuration4.touchscreen;
/* 184 */                       if (i7 != i8) {
/* 186 */                           configuration.touchscreen = i8;
                                }
/* 188 */                       int i9 = configuration3.keyboard;
/* 190 */                       int i10 = configuration4.keyboard;
/* 192 */                       if (i9 != i10) {
/* 194 */                           configuration.keyboard = i10;
                                }
/* 196 */                       int i11 = configuration3.keyboardHidden;
/* 198 */                       int i12 = configuration4.keyboardHidden;
/* 200 */                       if (i11 != i12) {
/* 202 */                           configuration.keyboardHidden = i12;
                                }
/* 204 */                       int i13 = configuration3.navigation;
/* 206 */                       int i14 = configuration4.navigation;
/* 208 */                       if (i13 != i14) {
/* 210 */                           configuration.navigation = i14;
                                }
/* 212 */                       int i15 = configuration3.navigationHidden;
/* 214 */                       int i16 = configuration4.navigationHidden;
/* 216 */                       if (i15 != i16) {
/* 218 */                           configuration.navigationHidden = i16;
                                }
/* 220 */                       int i17 = configuration3.orientation;
/* 222 */                       int i18 = configuration4.orientation;
/* 224 */                       if (i17 != i18) {
/* 226 */                           configuration.orientation = i18;
                                }
/* 230 */                       int i19 = configuration3.screenLayout & 15;
/* 234 */                       int i20 = configuration4.screenLayout & 15;
/* 236 */                       if (i19 != i20) {
                                    configuration.screenLayout |= i20;
                                }
/* 245 */                       int i21 = configuration3.screenLayout & 192;
/* 249 */                       int i22 = configuration4.screenLayout & 192;
/* 251 */                       if (i21 != i22) {
                                    configuration.screenLayout |= i22;
                                }
/* 260 */                       int i23 = configuration3.screenLayout & 48;
/* 264 */                       int i24 = configuration4.screenLayout & 48;
/* 266 */                       if (i23 != i24) {
                                    configuration.screenLayout |= i24;
                                }
/* 275 */                       int i25 = configuration3.screenLayout & 768;
/* 279 */                       int i26 = configuration4.screenLayout & 768;
/* 281 */                       if (i25 != i26) {
                                    configuration.screenLayout |= i26;
                                }
/* 290 */                       int i27 = configuration3.colorMode & 3;
/* 294 */                       int i28 = configuration4.colorMode & 3;
/* 296 */                       if (i27 != i28) {
                                    configuration.colorMode |= i28;
                                }
/* 305 */                       int i29 = configuration3.colorMode & 12;
/* 309 */                       int i30 = configuration4.colorMode & 12;
/* 311 */                       if (i29 != i30) {
                                    configuration.colorMode |= i30;
                                }
/* 320 */                       int i31 = configuration3.uiMode & 15;
/* 324 */                       int i32 = configuration4.uiMode & 15;
/* 326 */                       if (i31 != i32) {
                                    configuration.uiMode |= i32;
                                }
/* 335 */                       int i33 = configuration3.uiMode & 48;
/* 339 */                       int i34 = configuration4.uiMode & 48;
/* 341 */                       if (i33 != i34) {
                                    configuration.uiMode |= i34;
                                }
/* 348 */                       int i35 = configuration3.screenWidthDp;
/* 350 */                       int i36 = configuration4.screenWidthDp;
/* 352 */                       if (i35 != i36) {
/* 354 */                           configuration.screenWidthDp = i36;
                                }
/* 356 */                       int i37 = configuration3.screenHeightDp;
/* 358 */                       int i38 = configuration4.screenHeightDp;
/* 360 */                       if (i37 != i38) {
/* 362 */                           configuration.screenHeightDp = i38;
                                }
/* 364 */                       int i39 = configuration3.smallestScreenWidthDp;
/* 366 */                       int i40 = configuration4.smallestScreenWidthDp;
/* 368 */                       if (i39 != i40) {
/* 370 */                           configuration.smallestScreenWidthDp = i40;
                                }
/* 372 */                       int i41 = configuration3.densityDpi;
/* 374 */                       int i42 = configuration4.densityDpi;
/* 376 */                       if (i41 != i42) {
/* 378 */                           configuration.densityDpi = i42;
                                }
                            }
                        }
/* 380 */               Configuration configurationI00100o1O0lo = I11oi01ll.I00100o1O0lo(context, iI001l0I00, configuration, true);
/* 389 */               IOoiOIIOOIi iOoiOIIOOIi = new IOoiOIIOOIi(context, com.box.gallery.R.style.Theme_AppCompat_Empty);
/* 392 */               iOoiOIIOOIi.I00000oIO(configurationI00100o1O0lo);
                        try {
/* 399 */                   if (context.getTheme() != null) {
/* 405 */                       iOoiOIIOOIi.getTheme().rebase();
                            }
                        } catch (NullPointerException unused3) {
                        }
/* 408 */               context = iOoiOIIOOIi;
                    }
/* 409 */           super.attachBaseContext(context);
                }

                @Override
                public final void closeOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 1 */             I00111O();
/* 13 */            if (getWindow().hasFeature(0)) {
/* 15 */                super.closeOptionsMenu();
                    }
                }

                @Override
                public final boolean dispatchKeyEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 1 */             keyEvent.getKeyCode();
/* 4 */             I00111O();
/* 7 */             return super.dispatchKeyEvent(keyEvent);
                }

                @Override
                public final View findViewById(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 5 */             I11oi01ll i11oi01ll = (I11oi01ll) I0010o();
/* 7 */             i11oi01ll.I00111O();
/* 12 */            return i11oi01ll.I00l0I0l0lO1.findViewById(i);
                }

                @Override
                public final MenuInflater getMenuInflater() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 5 */             I11oi01ll i11oi01ll = (I11oi01ll) I0010o();
/* 7 */             OliioiiiOo oliioiiiOo = i11oi01ll.I00ll1;
/* 9 */             if (oliioiiiOo == null) {
/* 11 */                i11oi01ll.I001i1lo1io();
/* 16 */                i00IOoliil0i i00iooliil0i = i11oi01ll.I00li1OI;
/* 27 */                oliioiiiOo = new OliioiiiOo(i00iooliil0i != null ? i00iooliil0i.I00000oOI() : i11oi01ll.I00ioIO);
/* 30 */                i11oi01ll.I00ll1 = oliioiiiOo;
                    }
/* 55 */            return oliioiiiOo;
                }

                @Override
                public final Resources getResources() {
/* 1 */             int i = Ooo1Ioil.I00000oIO;
/* 3 */             return super.getResources();
                }

                @Override
                public final void invalidateOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 5 */             I11oi01ll i11oi01ll = (I11oi01ll) I0010o();
/* 9 */             if (i11oi01ll.I00li1OI != null) {
/* 11 */                i11oi01ll.I001i1lo1io();
/* 16 */                i11oi01ll.I00li1OI.getClass();
/* 20 */                i11oi01ll.I001iOo1i0O(0);
                    }
                }

                @Override
                public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 1 */             super.onConfigurationChanged(configuration);
/* 8 */             I11oi01ll i11oi01ll = (I11oi01ll) I0010o();
/* 12 */            if (i11oi01ll.I00ooiO1I && i11oi01ll.I00ol1) {
/* 18 */                i11oi01ll.I001i1lo1io();
/* 21 */                i00IOoliil0i i00iooliil0i = i11oi01ll.I00li1OI;
/* 23 */                if (i00iooliil0i != null) {
/* 37 */                    i00iooliil0i.I0000O(i00iooliil0i.I00000oIO.getResources().getBoolean(com.box.gallery.R.bool.abc_action_bar_embed_tabs));
                        }
                    }
/* 40 */            I11oo00 i11oo00I00000oIO = I11oo00.I00000oIO();
/* 44 */            Context context = i11oi01ll.I00ioIO;
                    synchronized (i11oo00I00000oIO) {
/* 47 */                Oi0loIIIoI oi0loIIIoI = i11oo00I00000oIO.I00000oIO;
                        synchronized (oi0loIIIoI) {
/* 56 */                    O1IOillioo0I o1IOillioo0I = (O1IOillioo0I) oi0loIIIoI.I00000oOI.get(context);
/* 58 */                    if (o1IOillioo0I != null) {
/* 60 */                        o1IOillioo0I.I00000oIO();
                            }
                        }
                    }
/* 83 */            i11oi01ll.I010l1O = new Configuration(i11oi01ll.I00ioIO.getResources().getConfiguration());
/* 86 */            i11oi01ll.I000l1(false);
                }

                @Override
                public final void onDestroy() {
/* 1 */             super.onDestroy();
/* 8 */             I0010o().I0000oI00();
                }

                @Override
                public final boolean onMenuItemSelected(int i, MenuItem menuItem) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    Intent intentI00000oIO;
/* 6 */             if (!super.onMenuItemSelected(i, menuItem)) {
/* 9 */                 i00IOoliil0i i00iooliil0iI00111O = I00111O();
/* 20 */                if (menuItem.getItemId() != 16908332 || i00iooliil0iI00111O == null || (((Oo1ilOl) i00iooliil0iI00111O.I0000oI00).I00000oOI & 4) == 0 || (intentI00000oIO = l1iOloII.I00000oIO(this)) == null) {
/* 105 */                   return false;
                        }
/* 44 */                if (!shouldUpRecreateTask(intentI00000oIO)) {
/* 101 */                   navigateUpTo(intentI00000oIO);
/* 5 */                     return true;
                        }
/* 46 */                OlIOI10i1 olIOI10i1I0000O = OlIOI10i1.I0000O(this);
/* 50 */                Intent intentI00000oIO2 = l1iOloII.I00000oIO(this);
/* 54 */                if (intentI00000oIO2 == null) {
/* 56 */                    intentI00000oIO2 = l1iOloII.I00000oIO(this);
                        }
/* 60 */                if (intentI00000oIO2 != null) {
/* 62 */                    ComponentName component = intentI00000oIO2.getComponent();
/* 66 */                    if (component == null) {
/* 76 */                        component = intentI00000oIO2.resolveActivity(((Context) olIOI10i1I0000O.I00iiO).getPackageManager());
                            }
/* 80 */                    olIOI10i1I0000O.I00000oOI(component);
/* 87 */                    ((ArrayList) olIOI10i1I0000O.I00iiI).add(intentI00000oIO2);
                        }
/* 90 */                olIOI10i1I0000O.I0000oI00();
                        try {
/* 93 */                    finishAffinity();
                        } catch (IllegalStateException unused) {
/* 97 */                    finish();
                        }
                    }
/* 5 */             return true;
                }

                @Override
                public final void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 1 */             super.onPostCreate(bundle);
/* 10 */            ((I11oi01ll) I0010o()).I00111O();
                }

                @Override
                public final void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 1 */             super.onPostResume();
/* 8 */             I11oi01ll i11oi01ll = (I11oi01ll) I0010o();
/* 10 */            i11oi01ll.I001i1lo1io();
/* 13 */            i00IOoliil0i i00iooliil0i = i11oi01ll.I00li1OI;
/* 15 */            if (i00iooliil0i != null) {
/* 18 */                i00iooliil0i.I001IIilI0O = true;
                    }
                }

                @Override
                public final void onStart() throws PackageManager.NameNotFoundException {
/* 1 */             super.onStart();
/* 11 */            ((I11oi01ll) I0010o()).I000l1(true);
                }

                @Override
                public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 1 */             super.onStop();
/* 8 */             I11oi01ll i11oi01ll = (I11oi01ll) I0010o();
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
                public final void onTitleChanged(CharSequence charSequence, int i) {
/* 1 */             super.onTitleChanged(charSequence, i);
/* 8 */             I0010o().I000iOII(charSequence);
                }

                @Override
                public final void openOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 1 */             I00111O();
/* 13 */            if (getWindow().hasFeature(0)) {
/* 15 */                super.openOptionsMenu();
                    }
                }

                @Override
                public final void setContentView(int i) {
/* 1 */             I000lI();
/* 8 */             I0010o().I000O01llI0(i);
                }

                @Override
                public final void setTheme(int i) {
/* 1 */             super.setTheme(i);
/* 10 */            ((I11oi01ll) I0010o()).I010lI0oi = i;
                }

                @Override
/* 11 */        public void setContentView(View view) {
/* 12 */            I000lI();
/* 13 */            I0010o().I000OOo1O(view);
                }

                @Override
/* 13 */        public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
/* 14 */            I000lI();
/* 15 */            I0010o().I000OiO(view, layoutParams);
                }

                @Override
/* 19 */        public final void onContentChanged() {
                }
            }
