            package p000;

            import android.R;
            import android.app.Activity;
            import android.app.Dialog;
            import android.app.UiModeManager;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.content.pm.ActivityInfo;
            import android.content.pm.PackageManager;
            import android.content.res.Configuration;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.location.LocationManager;
            import android.media.AudioManager;
            import android.os.Build;
            import android.os.Bundle;
            import android.text.TextUtils;
            import android.util.AndroidRuntimeException;
            import android.util.AttributeSet;
            import android.util.Log;
            import android.util.TypedValue;
            import android.view.KeyCharacterMap;
            import android.view.KeyEvent;
            import android.view.LayoutInflater;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.view.Window;
            import android.view.WindowManager;
            import android.widget.ArrayAdapter;
            import android.widget.FrameLayout;
            import android.widget.ListAdapter;
            import android.widget.PopupWindow;
            import android.widget.SpinnerAdapter;
            import android.widget.TextView;
            import android.window.OnBackInvokedCallback;
            import android.window.OnBackInvokedDispatcher;
            import androidx.appcompat.view.menu.ExpandedMenuView;
            import androidx.appcompat.widget.ActionBarContextView;
            import androidx.appcompat.widget.ActionBarOverlayLayout;
            import androidx.appcompat.widget.ActionMenuView;
            import androidx.appcompat.widget.ContentFrameLayout;
            import androidx.appcompat.widget.Toolbar;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            
/* 875 */   public final class I11oi01ll extends I11lil0o implements O1ilOII, LayoutInflater.Factory2 {
                public static final Ol0Ii10o1 I011iO = new Ol0Ii10o1(0);
                public static final int[] I011iiii0i = {R.attr.windowBackground};
                public static final boolean I011lIilI0lo = !"robolectric".equals(Build.FINGERPRINT);
                public final Object I00io1l;
                public final Context I00ioIO;
                public Window I00l0I0l0lO1;
                public I11o0o0I I00l0OO0IO;
                public i00IOoliil0i I00li1OI;
                public OliioiiiOo I00ll1;
                public CharSequence I00lli11;
                public ActionBarOverlayLayout I00lll10;
                public I0IIiO0iI I00o0iI0io1;
                public iiOlilo0IIIl I00o0l1o1o0;
                public I0I1liIO0ii I00o101lO;
                public ActionBarContextView I00oI0i;
                public PopupWindow I00oII;
                public I11lo00IoiIo I00oIiI10;
                public OoolOO I00oO101o = null;
                public final boolean I00oOio10iI1 = true;
                public boolean I00ol1;
                public ViewGroup I00olI;
                public TextView I00oli;
                public View I00oliIiO01i;
                public boolean I00oo1iO0ll;
                public boolean I00ooIo0;
                public boolean I00ooiO1I;
                public boolean I00oooO;
                public boolean I0100i;
                public boolean I0100o111I;
                public boolean I010101Oo1lO;
                public boolean I010I0;
                public I11oO10o1i[] I010II;
                public I11oO10o1i I010OIo1l;
                public boolean I010i10l;
                public boolean I010iIIOlo;
                public boolean I010ioo;
                public boolean I010l10O;
                public Configuration I010l1O;
                public final int I010l1ol111;
                public int I010lI0oi;
                public int I010o0o0oO;
                public boolean I010oio1OO0;
                public I11o0oiOlIl I01101IOlO;
                public I11o0oiOlIl I01101olii;
                public boolean I0110OiO;
                public int I0110o;
                public final I11lo00IoiIo I0111i;
                public boolean I011IO1I11OI;
                public Rect I011IOil;
                public Rect I011Ill;
                public I1IIIOIooo0 I011Io0I1ioi;
                public OnBackInvokedDispatcher I011Ol0;
                public OnBackInvokedCallback I011iIOio;

                public I11oi01ll(Context context, Window window, I11l0lol i11l0lol, Object obj) {
/* 4 */             I11io0O0O1o1 i11io0O0O1o1 = null;
/* 12 */            this.I010l1ol111 = -100;
/* 17 */            I11lo00IoiIo i11lo00IoiIo = new I11lo00IoiIo(0);
/* 20 */            i11lo00IoiIo.I00iiI = this;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            this.I0111i = i11lo00IoiIo;
/* 27 */            this.I00ioIO = context;
/* 29 */            this.I00io1l = obj;
/* 33 */            if (obj instanceof Dialog) {
                        while (true) {
/* 35 */                    if (context != null) {
/* 39 */                        if (!(context instanceof I11io0O0O1o1)) {
/* 47 */                            if (!(context instanceof ContextWrapper)) {
                                        break;
                                    } else {
/* 51 */                                context = ((ContextWrapper) context).getBaseContext();
                                    }
                                } else {
/* 42 */                            i11io0O0O1o1 = (I11io0O0O1o1) context;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
/* 56 */                if (i11io0O0O1o1 != null) {
/* 66 */                    this.I010l1ol111 = ((I11oi01ll) i11io0O0O1o1.I0010o()).I010l1ol111;
                        }
                    }
/* 70 */            if (this.I010l1ol111 == -100) {
/* 78 */                String name = this.I00io1l.getClass().getName();
/* 82 */                Ol0Ii10o1 ol0Ii10o1 = I011iO;
/* 88 */                Integer num = (Integer) ol0Ii10o1.get(name);
/* 90 */                if (num != null) {
/* 96 */                    this.I010l1ol111 = num.intValue();
/* 108 */                   ol0Ii10o1.remove(this.I00io1l.getClass().getName());
                        }
                    }
/* 111 */           if (window != null) {
/* 113 */               I000lI(window);
                    }
/* 116 */           I11oo00.I0000Il00O();
                }

                public static Configuration I00100o1O0lo(Context context, int i, Configuration configuration, boolean z) {
/* 31 */            int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
/* 35 */            Configuration configuration2 = new Configuration();
/* 39 */            configuration2.fontScale = 0.0f;
/* 41 */            if (configuration != null) {
/* 43 */                configuration2.setTo(configuration);
                    }
/* 51 */            configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
/* 204 */           return configuration2;
                }

                @Override
                public final void I00000oIO() {
/* 3 */             LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.I00ioIO);
/* 11 */            if (layoutInflaterFrom.getFactory() == null) {
/* 13 */                layoutInflaterFrom.setFactory2(this);
                    } else {
/* 23 */                if (layoutInflaterFrom.getFactory2() instanceof I11oi01ll) {
/* 55 */                    return;
                        }
/* 29 */                Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
                    }
                }

                @Override
                public final void I0000Il00O() throws PackageManager.NameNotFoundException {
                    String strI0000Il00O;
/* 2 */             this.I010iIIOlo = true;
/* 5 */             I000l1(false);
/* 8 */             I001IIilI0O();
/* 11 */            Object obj = this.I00io1l;
/* 15 */            if (obj instanceof Activity) {
                        try {
/* 17 */                    Activity activity = (Activity) obj;
                            try {
/* 23 */                        strI0000Il00O = l1iOloII.I0000Il00O(activity, activity.getComponentName());
                            } catch (PackageManager.NameNotFoundException e) {
/* 34 */                        throw new IllegalArgumentException(e);
                            }
                        } catch (IllegalArgumentException unused) {
/* 35 */                    strI0000Il00O = null;
                        }
/* 36 */                if (strI0000Il00O != null) {
/* 38 */                    i00IOoliil0i i00iooliil0i = this.I00li1OI;
/* 40 */                    if (i00iooliil0i == null) {
/* 42 */                        this.I011IO1I11OI = true;
                            } else if (!i00iooliil0i.I000O01llI0) {
/* 51 */                        Oo1ilOl oo1ilOl = (Oo1ilOl) i00iooliil0i.I0000oI00;
/* 53 */                        int i = oo1ilOl.I00000oOI;
/* 55 */                        i00iooliil0i.I000O01llI0 = true;
/* 61 */                        oo1ilOl.I00000oIO((i & (-5)) | 4);
                            }
                        }
                        synchronized (I11lil0o.I00ilO0) {
/* 67 */                    I11lil0o.I0001Ioi1lo(this);
/* 77 */                    I11lil0o.I00ilI0I1.add(new WeakReference(this));
                        }
                    }
/* 100 */           this.I010l1O = new Configuration(this.I00ioIO.getResources().getConfiguration());
/* 102 */           this.I010ioo = true;
                }

                @Override
                public final boolean I0000O(O1illlIiilIl o1illlIiilIl, MenuItem menuItem) {
                    I11oO10o1i i11oO10o1i;
/* 3 */             Window.Callback callback = this.I00l0I0l0lO1.getCallback();
/* 8 */             if (callback != null && !this.I010l10O) {
/* 14 */                O1illlIiilIl o1illlIiilIlI000iOII = o1illlIiilIl.I000iOII();
/* 18 */                I11oO10o1i[] i11oO10o1iArr = this.I010II;
/* 24 */                int length = i11oO10o1iArr != null ? i11oO10o1iArr.length : 0;
/* 25 */                int i = 0;
                        while (true) {
/* 26 */                    if (i < length) {
/* 28 */                        i11oO10o1i = i11oO10o1iArr[i];
/* 30 */                        if (i11oO10o1i != null && i11oO10o1i.I000O01llI0 == o1illlIiilIlI000iOII) {
                                    break;
                                }
/* 37 */                        i++;
                            } else {
/* 40 */                        i11oO10o1i = null;
                                break;
                            }
                        }
/* 41 */                if (i11oO10o1i != null) {
/* 45 */                    return callback.onMenuItemSelected(i11oO10o1i.I00000oIO, menuItem);
                        }
                    }
/* 7 */             return false;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000oI00() {
/* 5 */             if (this.I00io1l instanceof Activity) {
                        synchronized (I11lil0o.I00ilO0) {
/* 10 */                    I11lil0o.I0001Ioi1lo(this);
                        }
                    }
/* 20 */            if (this.I0110OiO) {
/* 30 */                this.I00l0I0l0lO1.getDecorView().removeCallbacks(this.I0111i);
                    }
/* 34 */            this.I010l10O = true;
/* 40 */            if (this.I010l1ol111 != -100) {
/* 42 */                Object obj = this.I00io1l;
/* 46 */                if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
/* 74 */                    I011iO.put(this.I00io1l.getClass().getName(), Integer.valueOf(this.I010l1ol111));
                        } else {
/* 90 */                    I011iO.remove(this.I00io1l.getClass().getName());
                        }
                    }
/* 93 */            I11o0oiOlIl i11o0oiOlIl = this.I01101IOlO;
/* 95 */            if (i11o0oiOlIl != null) {
/* 97 */                i11o0oiOlIl.I0000oI00();
                    }
/* 100 */           I11o0oiOlIl i11o0oiOlIl2 = this.I01101olii;
/* 102 */           if (i11o0oiOlIl2 != null) {
/* 104 */               i11o0oiOlIl2.I0000oI00();
                    }
                }

                @Override
                public final boolean I000II(int i) {
/* 9 */             if (i == 8) {
/* 13 */                Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
/* 16 */                i = 108;
                    } else if (i == 9) {
/* 24 */                Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
/* 27 */                i = 109;
                    }
/* 31 */            if (this.I010101Oo1lO && i == 108) {
/* 30 */                return false;
                    }
/* 39 */            if (this.I00ooiO1I && i == 1) {
/* 43 */                this.I00ooiO1I = false;
                    }
/* 45 */            if (i == 1) {
/* 98 */                I00II0oii1o();
/* 101 */               this.I010101Oo1lO = true;
/* 38 */                return true;
                    }
/* 48 */            if (i == 2) {
/* 92 */                I00II0oii1o();
/* 95 */                this.I00oo1iO0ll = true;
/* 38 */                return true;
                    }
/* 51 */            if (i == 5) {
/* 86 */                I00II0oii1o();
/* 89 */                this.I00ooIo0 = true;
/* 38 */                return true;
                    }
/* 55 */            if (i == 10) {
/* 80 */                I00II0oii1o();
/* 83 */                this.I0100i = true;
/* 38 */                return true;
                    }
/* 57 */            if (i == 108) {
/* 74 */                I00II0oii1o();
/* 77 */                this.I00ooiO1I = true;
/* 38 */                return true;
                    }
/* 59 */            if (i != 109) {
/* 63 */                return this.I00l0I0l0lO1.requestFeature(i);
                    }
/* 68 */            I00II0oii1o();
/* 71 */            this.I00oooO = true;
/* 38 */            return true;
                }

                @Override
                public final void I000O01llI0(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 1 */             I00111O();
/* 13 */            ViewGroup viewGroup = (ViewGroup) this.I00olI.findViewById(R.id.content);
/* 15 */            viewGroup.removeAllViews();
/* 24 */            LayoutInflater.from(this.I00ioIO).inflate(i, viewGroup);
/* 35 */            this.I00l0OO0IO.I00000oIO(this.I00l0I0l0lO1.getCallback());
                }

                @Override
                public final void I000OOo1O(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 1 */             I00111O();
/* 13 */            ViewGroup viewGroup = (ViewGroup) this.I00olI.findViewById(R.id.content);
/* 15 */            viewGroup.removeAllViews();
/* 18 */            viewGroup.addView(view);
/* 29 */            this.I00l0OO0IO.I00000oIO(this.I00l0I0l0lO1.getCallback());
                }

                @Override
                public final void I000OiO(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 1 */             I00111O();
/* 13 */            ViewGroup viewGroup = (ViewGroup) this.I00olI.findViewById(R.id.content);
/* 15 */            viewGroup.removeAllViews();
/* 18 */            viewGroup.addView(view, layoutParams);
/* 29 */            this.I00l0OO0IO.I00000oIO(this.I00l0I0l0lO1.getCallback());
                }

                @Override
                public final void I000iOII(CharSequence charSequence) {
/* 1 */             this.I00lli11 = charSequence;
/* 3 */             ActionBarOverlayLayout actionBarOverlayLayout = this.I00lll10;
/* 5 */             if (actionBarOverlayLayout != null) {
/* 7 */                 actionBarOverlayLayout.setWindowTitle(charSequence);
/* 10 */                return;
                    }
/* 11 */            i00IOoliil0i i00iooliil0i = this.I00li1OI;
/* 13 */            if (i00iooliil0i == null) {
/* 48 */                TextView textView = this.I00oli;
/* 50 */                if (textView != null) {
/* 52 */                    textView.setText(charSequence);
/* 77 */                    return;
                        }
/* 77 */                return;
                    }
/* 17 */            Oo1ilOl oo1ilOl = (Oo1ilOl) i00iooliil0i.I0000oI00;
/* 21 */            if (oo1ilOl.I000II) {
/* 77 */                return;
                    }
/* 23 */            Toolbar toolbar = oo1ilOl.I00000oIO;
/* 25 */            oo1ilOl.I000O01llI0 = charSequence;
/* 31 */            if ((oo1ilOl.I00000oOI & 8) != 0) {
/* 33 */                toolbar.setTitle(charSequence);
/* 38 */                if (oo1ilOl.I000II) {
/* 44 */                    OooiOl0ioo0i.I0000Il00O(toolbar.getRootView(), charSequence);
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I000l1(boolean z) throws PackageManager.NameNotFoundException {
                    int i;
                    boolean z2;
/* 4 */             if (this.I010l10O) {
/* 3 */                 return false;
                    }
/* 9 */             int i2 = this.I010l1ol111;
/* 11 */            if (i2 == -100) {
/* 14 */                i2 = I11lil0o.I00iiI;
                    }
/* 16 */            Context context = this.I00ioIO;
/* 23 */            Configuration configurationI00100o1O0lo = I00100o1O0lo(context, I001l0I00(context, i2), null, false);
/* 27 */            boolean z3 = this.I010oio1OO0;
/* 29 */            boolean z4 = true;
/* 30 */            Object obj = this.I00io1l;
/* 32 */            if (z3 || !(obj instanceof Activity)) {
/* 70 */                this.I010oio1OO0 = true;
/* 72 */                i = this.I010o0o0oO;
                    } else {
/* 38 */                PackageManager packageManager = context.getPackageManager();
/* 42 */                if (packageManager == null) {
/* 44 */                    i = 0;
                        } else {
                            try {
/* 57 */                        ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), 269221888);
/* 61 */                        if (activityInfo != null) {
/* 65 */                            this.I010o0o0oO = activityInfo.configChanges;
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
/* 68 */                        this.I010o0o0oO = 0;
                            }
/* 70 */                    this.I010oio1OO0 = true;
/* 72 */                    i = this.I010o0o0oO;
                        }
                    }
/* 74 */            Configuration configuration = this.I010l1O;
/* 76 */            if (configuration == null) {
/* 82 */                configuration = context.getResources().getConfiguration();
                    }
/* 88 */            int i3 = configuration.uiMode & 48;
/* 92 */            int i4 = configurationI00100o1O0lo.uiMode & 48;
/* 94 */            I11loolloI1.I00000oOI(configuration);
/* 102 */           int i5 = i3 != i4 ? Barcode.FORMAT_UPC_A : 0;
/* 105 */           if (((~i) & i5) != 0 && z && this.I010iIIOlo && ((I011lIilI0lo || this.I010ioo) && (obj instanceof Activity))) {
/* 126 */               Activity activity = (Activity) obj;
/* 132 */               if (!activity.isChild()) {
/* 134 */                   activity.recreate();
/* 137 */                   z2 = true;
                        }
                    } else {
/* 139 */               z2 = false;
                    }
/* 140 */           if (z2 || i5 == 0) {
/* 239 */               z4 = z2;
                    } else {
/* 146 */               boolean z5 = (i5 & i) == i5;
/* 149 */               Resources resources = context.getResources();
/* 159 */               Configuration configuration2 = new Configuration(resources.getConfiguration());
/* 171 */               configuration2.uiMode = i4 | (resources.getConfiguration().uiMode & (-49));
/* 173 */               resources.updateConfiguration(configuration2, null);
/* 176 */               int i6 = this.I010lI0oi;
/* 178 */               if (i6 != 0) {
/* 180 */                   context.setTheme(i6);
/* 189 */                   context.getTheme().applyStyle(this.I010lI0oi, true);
                        }
/* 192 */               if (z5 && (obj instanceof Activity)) {
/* 198 */                   Activity activity2 = (Activity) obj;
/* 202 */                   if (activity2 instanceof O0oiOi) {
/* 221 */                       if (((O0oiOi) activity2).I000iOII().I00ol1().I00000oIO(O0oOi0I.I00iiO)) {
/* 223 */                           activity2.onConfigurationChanged(configuration2);
                                }
                            } else if (this.I010ioo && !this.I010l10O) {
/* 235 */                       activity2.onConfigurationChanged(configuration2);
                            }
                        }
                    }
/* 240 */           if (i2 == 0) {
/* 246 */               I001IO000(context).I001iOo1i0O();
                    } else {
/* 250 */               I11o0oiOlIl i11o0oiOlIl = this.I01101IOlO;
/* 252 */               if (i11o0oiOlIl != null) {
/* 254 */                   i11o0oiOlIl.I0000oI00();
                        }
                    }
/* 257 */           I11o0oiOlIl i11o0oiOlIl2 = this.I01101olii;
/* 260 */           if (i2 == 3) {
/* 262 */               if (i11o0oiOlIl2 == null) {
/* 266 */                   i11o0oiOlIl2 = new I11o0oiOlIl(this, context);
/* 269 */                   this.I01101olii = i11o0oiOlIl2;
                        }
/* 271 */               i11o0oiOlIl2.I001iOo1i0O();
                    } else if (i11o0oiOlIl2 != null) {
/* 277 */               i11o0oiOlIl2.I0000oI00();
                    }
/* 437 */           return z4;
                }

                /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000lI(Window window) {
                    Drawable drawableI0000oI00;
                    OnBackInvokedCallback onBackInvokedCallback;
                    int resourceId;
/* 5 */             if (this.I00l0I0l0lO1 != null) {
/* 136 */               I000II.I001IO000("AppCompat has already installed itself into the Window");
/* 168 */               return;
                    }
/* 7 */             Window.Callback callback = window.getCallback();
/* 13 */            if (callback instanceof I11o0o0I) {
/* 132 */               I000II.I001IO000("AppCompat has already installed itself into the Window");
/* 135 */               return;
                    }
/* 17 */            I11o0o0I i11o0o0I = new I11o0o0I();
/* 20 */            i11o0o0I.I00ilI0I1 = this;
/* 22 */            if (callback == null) {
/* 128 */               I000II.I000iOII("Window callback may not be null");
/* 131 */               return;
                    }
/* 24 */            i11o0o0I.I00iOIl = callback;
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            this.I00l0OO0IO = i11o0o0I;
/* 31 */            window.setCallback(i11o0o0I);
/* 34 */            Context context = this.I00ioIO;
/* 39 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, I011iiii0i);
/* 48 */            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
/* 73 */                drawableI0000oI00 = null;
                    } else {
/* 56 */                I11oo00 i11oo00I00000oIO = I11oo00.I00000oIO();
                        synchronized (i11oo00I00000oIO) {
/* 64 */                    drawableI0000oI00 = i11oo00I00000oIO.I00000oIO.I0000oI00(context, resourceId, true);
                        }
                    }
/* 74 */            if (drawableI0000oI00 != null) {
/* 76 */                window.setBackgroundDrawable(drawableI0000oI00);
                    }
/* 79 */            typedArrayObtainStyledAttributes.recycle();
/* 82 */            this.I00l0I0l0lO1 = window;
/* 84 */            OnBackInvokedDispatcher onBackInvokedDispatcher = this.I011Ol0;
/* 86 */            if (onBackInvokedDispatcher == null) {
/* 88 */                Object obj = this.I00io1l;
/* 90 */                if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.I011iIOio) != null) {
/* 96 */                    I11o010IIIi.I0000Il00O(onBackInvokedDispatcher, onBackInvokedCallback);
/* 99 */                    this.I011iIOio = null;
                        }
/* 103 */               if (obj instanceof Activity) {
/* 105 */                   Activity activity = (Activity) obj;
/* 111 */                   if (activity.getWindow() != null) {
/* 117 */                       this.I011Ol0 = I11o010IIIi.I00000oIO(activity);
                            } else {
/* 120 */                       this.I011Ol0 = null;
                            }
                        }
/* 122 */               I00IO1();
                    }
                }

                public final void I000o00OoI0I(int i, I11oO10o1i i11oO10o1i, O1illlIiilIl o1illlIiilIl) {
/* 1 */             if (o1illlIiilIl == null) {
/* 3 */                 if (i11oO10o1i == null && i >= 0) {
/* 7 */                     I11oO10o1i[] i11oO10o1iArr = this.I010II;
/* 10 */                    if (i < i11oO10o1iArr.length) {
/* 12 */                        i11oO10o1i = i11oO10o1iArr[i];
                            }
                        }
/* 14 */                if (i11oO10o1i != null) {
/* 16 */                    o1illlIiilIl = i11oO10o1i.I000O01llI0;
                        }
                    }
/* 18 */            if ((i11oO10o1i == null || i11oO10o1i.I000lI) && !this.I010l10O) {
/* 29 */                I11o0o0I i11o0o0I = this.I00l0OO0IO;
/* 33 */                Window.Callback callback = this.I00l0I0l0lO1.getCallback();
/* 37 */                i11o0o0I.getClass();
                        try {
/* 42 */                    i11o0o0I.I00iio = true;
/* 44 */                    callback.onPanelClosed(i, o1illlIiilIl);
                        } finally {
/* 51 */                    i11o0o0I.I00iio = false;
                        }
                    }
                }

                public final void I000oI1ioi(O1illlIiilIl o1illlIiilIl) {
                    I0I1ii0i i0I1ii0i;
/* 3 */             if (this.I010I0) {
/* 5 */                 return;
                    }
/* 7 */             this.I010I0 = true;
/* 9 */             ActionBarOverlayLayout actionBarOverlayLayout = this.I00lll10;
/* 11 */            actionBarOverlayLayout.I000iOII();
/* 20 */            ActionMenuView actionMenuView = ((Oo1ilOl) actionBarOverlayLayout.I00ilI0I1).I00000oIO.I00iOIl;
/* 22 */            if (actionMenuView != null && (i0I1ii0i = actionMenuView.I00oIiI10) != null) {
/* 28 */                i0I1ii0i.I0001Ioi1lo();
/* 31 */                I0I1IlI1 i0I1IlI1 = i0I1ii0i.I00oIiI10;
/* 33 */                if (i0I1IlI1 != null && i0I1IlI1.I00000oOI()) {
/* 43 */                    i0I1IlI1.I000OOo1O.dismiss();
                        }
                    }
/* 48 */            Window.Callback callback = this.I00l0I0l0lO1.getCallback();
/* 52 */            if (callback != null && !this.I010l10O) {
/* 60 */                callback.onPanelClosed(108, o1illlIiilIl);
                    }
/* 64 */            this.I010I0 = false;
                }

                public final void I00100l0(I11oO10o1i i11oO10o1i, boolean z) {
                    I11oIo0oIIl1 i11oIo0oIIl1;
                    ActionBarOverlayLayout actionBarOverlayLayout;
                    I0I1ii0i i0I1ii0i;
/* 1 */             if (z && i11oO10o1i.I00000oIO == 0 && (actionBarOverlayLayout = this.I00lll10) != null) {
/* 11 */                actionBarOverlayLayout.I000iOII();
/* 20 */                ActionMenuView actionMenuView = ((Oo1ilOl) actionBarOverlayLayout.I00ilI0I1).I00000oIO.I00iOIl;
/* 22 */                if (actionMenuView != null && (i0I1ii0i = actionMenuView.I00oIiI10) != null && i0I1ii0i.I000OiO()) {
/* 36 */                    I000oI1ioi(i11oO10o1i.I000O01llI0);
/* 39 */                    return;
                        }
                    }
/* 48 */            WindowManager windowManager = (WindowManager) this.I00ioIO.getSystemService("window");
/* 51 */            if (windowManager != null && i11oO10o1i.I000lI && (i11oIo0oIIl1 = i11oO10o1i.I0000oI00) != null) {
/* 61 */                windowManager.removeView(i11oIo0oIIl1);
/* 64 */                if (z) {
/* 68 */                    I000o00OoI0I(i11oO10o1i.I00000oIO, i11oO10o1i, null);
                        }
                    }
/* 72 */            i11oO10o1i.I000iOII = false;
/* 74 */            i11oO10o1i.I000l1 = false;
/* 76 */            i11oO10o1i.I000lI = false;
/* 78 */            i11oO10o1i.I0001Ioi1lo = null;
/* 81 */            i11oO10o1i.I000o00OoI0I = true;
/* 85 */            if (this.I010OIo1l == i11oO10o1i) {
/* 87 */                this.I010OIo1l = null;
                    }
/* 91 */            if (i11oO10o1i.I00000oIO == 0) {
/* 93 */                I00IO1();
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x00f7  */
                /* JADX WARN: Removed duplicated region for block: B:89:0x0115  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I0010I0i(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    boolean z;
                    boolean zI00II0Ol1O0l;
                    ActionMenuView actionMenuView;
                    I0I1ii0i i0I1ii0i;
                    I0I1ii0i i0I1ii0i2;
                    I0I1ii0i i0I1ii0i3;
/* 1 */             Object obj = this.I00io1l;
/* 5 */             if (((obj instanceof O0O1l1) || (obj instanceof I0ilIO0oloO1)) && this.I00l0I0l0lO1.getDecorView() != null) {
/* 19 */                WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
                    }
/* 29 */            if (keyEvent.getKeyCode() == 82) {
/* 31 */                I11o0o0I i11o0o0I = this.I00l0OO0IO;
/* 35 */                Window.Callback callback = this.I00l0I0l0lO1.getCallback();
/* 39 */                i11o0o0I.getClass();
                        try {
/* 42 */                    i11o0o0I.I00iiO = true;
/* 50 */                    if (!callback.dispatchKeyEvent(keyEvent)) {
/* 58 */                        int keyCode = keyEvent.getKeyCode();
/* 67 */                        if (keyEvent.getAction() == 0) {
/* 69 */                            if (keyCode == 4) {
/* 103 */                               this.I010i10l = (keyEvent.getFlags() & Barcode.FORMAT_ITF) != 0;
/* 25 */                                return false;
                                    }
/* 71 */                            if (keyCode == 82) {
/* 79 */                                if (keyEvent.getRepeatCount() == 0) {
/* 81 */                                    I11oO10o1i i11oO10o1iI001i1O0Ol = I001i1O0Ol(0);
/* 87 */                                    if (!i11oO10o1iI001i1O0Ol.I000lI) {
/* 89 */                                        I00II0Ol1O0l(i11oO10o1iI001i1O0Ol, keyEvent);
/* 28 */                                        return true;
                                            }
                                        }
                                    }
/* 25 */                            return false;
                                }
/* 106 */                       if (keyCode != 4) {
/* 108 */                           if (keyCode == 82) {
/* 114 */                               if (this.I00o101lO == null) {
/* 118 */                                   I11oO10o1i i11oO10o1iI001i1O0Ol2 = I001i1O0Ol(0);
/* 122 */                                   ActionBarOverlayLayout actionBarOverlayLayout = this.I00lll10;
/* 124 */                                   Context context = this.I00ioIO;
/* 126 */                                   if (actionBarOverlayLayout != null) {
/* 128 */                                       actionBarOverlayLayout.I000iOII();
/* 135 */                                       Toolbar toolbar = ((Oo1ilOl) actionBarOverlayLayout.I00ilI0I1).I00000oIO;
/* 141 */                                       if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.I00iOIl) == null || !actionMenuView.I00oII || ViewConfiguration.get(context).hasPermanentMenuKey()) {
/* 248 */                                           boolean z2 = i11oO10o1iI001i1O0Ol2.I000lI;
/* 250 */                                           if (z2 || i11oO10o1iI001i1O0Ol2.I000l1) {
/* 282 */                                               I00100l0(i11oO10o1iI001i1O0Ol2, true);
/* 285 */                                               z = z2;
                                                    } else {
/* 259 */                                               if (i11oO10o1iI001i1O0Ol2.I000iOII) {
/* 263 */                                                   if (i11oO10o1iI001i1O0Ol2.I000oI1ioi) {
/* 265 */                                                       i11oO10o1iI001i1O0Ol2.I000iOII = false;
/* 267 */                                                       zI00II0Ol1O0l = I00II0Ol1O0l(i11oO10o1iI001i1O0Ol2, keyEvent);
                                                            } else {
/* 272 */                                                       zI00II0Ol1O0l = true;
                                                            }
/* 273 */                                                   if (zI00II0Ol1O0l) {
/* 275 */                                                       I001lllioOl(i11oO10o1iI001i1O0Ol2, keyEvent);
/* 278 */                                                       z = true;
                                                            }
                                                        }
/* 280 */                                               z = false;
                                                    }
                                                } else {
/* 161 */                                           ActionBarOverlayLayout actionBarOverlayLayout2 = this.I00lll10;
/* 163 */                                           actionBarOverlayLayout2.I000iOII();
/* 172 */                                           ActionMenuView actionMenuView2 = ((Oo1ilOl) actionBarOverlayLayout2.I00ilI0I1).I00000oIO.I00iOIl;
/* 174 */                                           if (actionMenuView2 == null || (i0I1ii0i2 = actionMenuView2.I00oIiI10) == null || !i0I1ii0i2.I000OiO()) {
/* 214 */                                               if (!this.I010l10O && I00II0Ol1O0l(i11oO10o1iI001i1O0Ol2, keyEvent)) {
/* 222 */                                                   ActionBarOverlayLayout actionBarOverlayLayout3 = this.I00lll10;
/* 224 */                                                   actionBarOverlayLayout3.I000iOII();
/* 233 */                                                   ActionMenuView actionMenuView3 = ((Oo1ilOl) actionBarOverlayLayout3.I00ilI0I1).I00000oIO.I00iOIl;
/* 235 */                                                   if (actionMenuView3 != null && (i0I1ii0i = actionMenuView3.I00oIiI10) != null && i0I1ii0i.I000l1()) {
/* 278 */                                                       z = true;
                                                            }
                                                        }
/* 280 */                                               z = false;
                                                    } else {
/* 186 */                                               ActionBarOverlayLayout actionBarOverlayLayout4 = this.I00lll10;
/* 188 */                                               actionBarOverlayLayout4.I000iOII();
/* 197 */                                               ActionMenuView actionMenuView4 = ((Oo1ilOl) actionBarOverlayLayout4.I00ilI0I1).I00000oIO.I00iOIl;
/* 199 */                                               if (actionMenuView4 == null || (i0I1ii0i3 = actionMenuView4.I00oIiI10) == null || !i0I1ii0i3.I0001Ioi1lo()) {
/* 280 */                                                   z = false;
                                                        }
                                                    }
                                                }
/* 286 */                                       if (z) {
/* 298 */                                           AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
/* 300 */                                           if (audioManager != null) {
/* 302 */                                               audioManager.playSoundEffect(0);
/* 28 */                                                return true;
                                                    }
/* 310 */                                           Log.w("AppCompatDelegate", "Couldn't get audio manager");
/* 28 */                                            return true;
                                                }
                                            }
                                        }
                                    }
/* 25 */                            return false;
                                }
/* 318 */                       if (!I001lIiIIo1O()) {
/* 25 */                            return false;
                                }
                            }
                        } finally {
/* 55 */                    i11o0o0I.I00iiO = false;
                        }
                    }
/* 28 */            return true;
                }

                public final void I0010o(int i) {
/* 1 */             I11oO10o1i i11oO10o1iI001i1O0Ol = I001i1O0Ol(i);
/* 7 */             if (i11oO10o1iI001i1O0Ol.I000O01llI0 != null) {
/* 11 */                Bundle bundle = new Bundle();
/* 16 */                i11oO10o1iI001i1O0Ol.I000O01llI0.I00111O(bundle);
/* 23 */                if (bundle.size() > 0) {
/* 25 */                    i11oO10o1iI001i1O0Ol.I00100l0 = bundle;
                        }
/* 29 */                i11oO10o1iI001i1O0Ol.I000O01llI0.I001i1O0Ol();
/* 34 */                i11oO10o1iI001i1O0Ol.I000O01llI0.clear();
                    }
/* 38 */            i11oO10o1iI001i1O0Ol.I000oI1ioi = true;
/* 40 */            i11oO10o1iI001i1O0Ol.I000o00OoI0I = true;
/* 44 */            if ((i == 108 || i == 0) && this.I00lll10 != null) {
/* 53 */                I11oO10o1i i11oO10o1iI001i1O0Ol2 = I001i1O0Ol(0);
/* 57 */                i11oO10o1iI001i1O0Ol2.I000iOII = false;
/* 60 */                I00II0Ol1O0l(i11oO10o1iI001i1O0Ol2, null);
                    }
                }

                public final void I00111O() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    ViewGroup viewGroup;
/* 3 */             if (this.I00ol1) {
/* 743 */               return;
                    }
/* 5 */             Context context = this.I00ioIO;
/* 7 */             int[] iArr = OOilOli0.I000OiO;
/* 9 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
/* 19 */            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
/* 648 */               typedArrayObtainStyledAttributes.recycle();
/* 653 */               I000II.I001IO000("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
/* 743 */               return;
                    }
/* 23 */            boolean z = false;
/* 31 */            if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
/* 33 */                I000II(1);
                    } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
/* 43 */                I000II(108);
                    }
/* 54 */            if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
/* 56 */                I000II(109);
                    }
/* 65 */            if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
/* 69 */                I000II(10);
                    }
/* 76 */            this.I0100o111I = typedArrayObtainStyledAttributes.getBoolean(0, false);
/* 78 */            typedArrayObtainStyledAttributes.recycle();
/* 81 */            I001IIilI0O();
/* 86 */            this.I00l0I0l0lO1.getDecorView();
/* 89 */            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
/* 95 */            int i = 2;
/* 97 */            if (this.I010101Oo1lO) {
/* 235 */               viewGroup = this.I0100i ? (ViewGroup) layoutInflaterFrom.inflate(com.box.gallery.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.box.gallery.R.layout.abc_screen_simple, (ViewGroup) null);
                    } else if (this.I0100o111I) {
/* 110 */               viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.box.gallery.R.layout.abc_dialog_title_material, (ViewGroup) null);
/* 112 */               this.I00oooO = false;
/* 114 */               this.I00ooiO1I = false;
                    } else if (this.I00ooiO1I) {
/* 124 */               TypedValue typedValue = new TypedValue();
/* 134 */               context.getTheme().resolveAttribute(com.box.gallery.R.attr.actionBarTheme, typedValue, true);
/* 161 */               viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new IOoiOIIOOIi(context, typedValue.resourceId) : context).inflate(com.box.gallery.R.layout.abc_screen_toolbar, (ViewGroup) null);
/* 170 */               ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(com.box.gallery.R.id.decor_content_parent);
/* 172 */               this.I00lll10 = actionBarOverlayLayout;
/* 180 */               actionBarOverlayLayout.setWindowCallback(this.I00l0I0l0lO1.getCallback());
/* 185 */               if (this.I00oooO) {
/* 189 */                   this.I00lll10.I000OiO(109);
                        }
/* 194 */               if (this.I00oo1iO0ll) {
/* 198 */                   this.I00lll10.I000OiO(2);
                        }
/* 203 */               if (this.I00ooIo0) {
/* 208 */                   this.I00lll10.I000OiO(5);
                        }
                    } else {
/* 212 */               viewGroup = null;
                    }
/* 237 */           if (viewGroup == null) {
/* 593 */               StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
/* 598 */               sb.append(this.I00ooiO1I);
/* 603 */               sb.append(", windowActionBarOverlay: ");
/* 608 */               sb.append(this.I00oooO);
/* 613 */               sb.append(", android:windowIsFloating: ");
/* 618 */               sb.append(this.I0100o111I);
/* 623 */               sb.append(", windowActionModeOverlay: ");
/* 628 */               sb.append(this.I0100i);
/* 633 */               sb.append(", windowNoTitle: ");
/* 644 */               I000II.I000iOII(IIlIOloOOO.I0010o(sb, this.I010101Oo1lO, " }"));
/* 647 */               return;
                    }
/* 241 */           Oi0Oooi oi0Oooi = new Oi0Oooi(i, z);
/* 244 */           oi0Oooi.I00iiI = this;
/* 246 */           VarHandle.storeStoreFence();
/* 249 */           WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 251 */           OooiIOIoi.I00000oOI(viewGroup, oi0Oooi);
/* 256 */           if (this.I00lll10 == null) {
/* 267 */               this.I00oli = (TextView) viewGroup.findViewById(com.box.gallery.R.id.title);
                    }
                    try {
/* 275 */               Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
/* 283 */               if (!method.isAccessible()) {
/* 285 */                   method.setAccessible(true);
                        }
/* 288 */               method.invoke(viewGroup, null);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
/* 298 */           ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.box.gallery.R.id.action_bar_activity_content);
/* 309 */           ViewGroup viewGroup2 = (ViewGroup) this.I00l0I0l0lO1.findViewById(R.id.content);
/* 311 */           if (viewGroup2 != null) {
/* 317 */               while (viewGroup2.getChildCount() > 0) {
/* 319 */                   View childAt = viewGroup2.getChildAt(0);
/* 323 */                   viewGroup2.removeViewAt(0);
/* 326 */                   contentFrameLayout.addView(childAt);
                        }
/* 331 */               viewGroup2.setId(-1);
/* 334 */               contentFrameLayout.setId(R.id.content);
/* 339 */               if (viewGroup2 instanceof FrameLayout) {
/* 343 */                   ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
/* 348 */           this.I00l0I0l0lO1.setContentView(viewGroup);
/* 353 */           Oi00IilOloo0 oi00IilOloo0 = new Oi00IilOloo0();
/* 356 */           oi00IilOloo0.I00iOIl = this;
/* 358 */           VarHandle.storeStoreFence();
/* 361 */           contentFrameLayout.setAttachListener(oi00IilOloo0);
/* 364 */           this.I00olI = viewGroup;
/* 366 */           Object obj = this.I00io1l;
/* 379 */           CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.I00lli11;
/* 385 */           if (!TextUtils.isEmpty(title)) {
/* 387 */               ActionBarOverlayLayout actionBarOverlayLayout2 = this.I00lll10;
/* 389 */               if (actionBarOverlayLayout2 != null) {
/* 391 */                   actionBarOverlayLayout2.setWindowTitle(title);
                        } else {
/* 395 */                   i00IOoliil0i i00iooliil0i = this.I00li1OI;
/* 397 */                   if (i00iooliil0i != null) {
/* 401 */                       Oo1ilOl oo1ilOl = (Oo1ilOl) i00iooliil0i.I0000oI00;
/* 405 */                       if (!oo1ilOl.I000II) {
/* 407 */                           Toolbar toolbar = oo1ilOl.I00000oIO;
/* 409 */                           oo1ilOl.I000O01llI0 = title;
/* 415 */                           if ((oo1ilOl.I00000oOI & 8) != 0) {
/* 417 */                               toolbar.setTitle(title);
/* 422 */                               if (oo1ilOl.I000II) {
/* 428 */                                   OooiOl0ioo0i.I0000Il00O(toolbar.getRootView(), title);
                                        }
                                    }
                                }
                            } else {
/* 432 */                       TextView textView = this.I00oli;
/* 434 */                       if (textView != null) {
/* 436 */                           textView.setText(title);
                                }
                            }
                        }
                    }
/* 445 */           ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.I00olI.findViewById(R.id.content);
/* 449 */           View decorView = this.I00l0I0l0lO1.getDecorView();
/* 471 */           contentFrameLayout2.I00io1l.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
/* 478 */           if (contentFrameLayout2.isLaidOut()) {
/* 480 */               contentFrameLayout2.requestLayout();
                    }
/* 483 */           TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
/* 493 */           typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
/* 502 */           typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
/* 511 */           if (typedArrayObtainStyledAttributes2.hasValue(122)) {
/* 517 */               typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
/* 526 */           if (typedArrayObtainStyledAttributes2.hasValue(123)) {
/* 532 */               typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
/* 541 */           if (typedArrayObtainStyledAttributes2.hasValue(120)) {
/* 547 */               typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
/* 556 */           if (typedArrayObtainStyledAttributes2.hasValue(121)) {
/* 562 */               typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
/* 565 */           typedArrayObtainStyledAttributes2.recycle();
/* 568 */           contentFrameLayout2.requestLayout();
/* 571 */           this.I00ol1 = true;
/* 573 */           I11oO10o1i i11oO10o1iI001i1O0Ol = I001i1O0Ol(0);
/* 579 */           if (this.I010l10O || i11oO10o1iI001i1O0Ol.I000O01llI0 != null) {
/* 743 */               return;
                    }
/* 585 */           I001iOo1i0O(108);
                }

                public final void I001IIilI0O() {
/* 3 */             if (this.I00l0I0l0lO1 == null) {
/* 5 */                 Object obj = this.I00io1l;
/* 9 */                 if (obj instanceof Activity) {
/* 17 */                    I000lI(((Activity) obj).getWindow());
                        }
                    }
/* 22 */            if (this.I00l0I0l0lO1 != null) {
/* 24 */                return;
                    }
/* 27 */            I000II.I001IO000("We have not been given a Window");
                }

                public final I01loIooI I001IO000(Context context) {
/* 1 */             I11o0oiOlIl i11o0oiOlIl = this.I01101IOlO;
/* 3 */             if (i11o0oiOlIl == null) {
/* 7 */                 OlilOlOiI olilOlOiI = OlilOlOiI.I00ilI0I1;
/* 9 */                 if (olilOlOiI == null) {
/* 11 */                    Context applicationContext = context.getApplicationContext();
/* 23 */                    LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
/* 26 */                    olilOlOiI = new OlilOlOiI(3);
/* 34 */                    olilOlOiI.I00iio = new I0oo0IlI01li();
/* 36 */                    olilOlOiI.I00iiI = applicationContext;
/* 38 */                    olilOlOiI.I00iiO = locationManager;
/* 40 */                    VarHandle.storeStoreFence();
/* 43 */                    OlilOlOiI.I00ilI0I1 = olilOlOiI;
                        }
/* 45 */                i11o0oiOlIl = new I11o0oiOlIl(this, olilOlOiI);
/* 48 */                this.I01101IOlO = i11o0oiOlIl;
                    }
/* 77 */            return i11o0oiOlIl;
                }

                public final I11oO10o1i I001i1O0Ol(int i) {
/* 1 */             I11oO10o1i[] i11oO10o1iArr = this.I010II;
/* 4 */             if (i11oO10o1iArr == null || i11oO10o1iArr.length <= i) {
/* 11 */                I11oO10o1i[] i11oO10o1iArr2 = new I11oO10o1i[i + 1];
/* 13 */                if (i11oO10o1iArr != null) {
/* 16 */                    System.arraycopy(i11oO10o1iArr, 0, i11oO10o1iArr2, 0, i11oO10o1iArr.length);
                        }
/* 19 */                this.I010II = i11oO10o1iArr2;
/* 21 */                i11oO10o1iArr = i11oO10o1iArr2;
                    }
/* 22 */            I11oO10o1i i11oO10o1i = i11oO10o1iArr[i];
/* 24 */            if (i11oO10o1i != null) {
/* 77 */                return i11oO10o1i;
                    }
/* 28 */            I11oO10o1i i11oO10o1i2 = new I11oO10o1i();
/* 31 */            i11oO10o1i2.I00000oIO = i;
/* 33 */            i11oO10o1i2.I000o00OoI0I = false;
/* 35 */            i11oO10o1iArr[i] = i11oO10o1i2;
/* 77 */            return i11oO10o1i2;
                }

                public final void I001i1lo1io() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    i00IOoliil0i i00iooliil0i;
/* 1 */             I00111O();
/* 6 */             if (this.I00ooiO1I && (i00iooliil0i = this.I00li1OI) == null) {
/* 14 */                Object obj = this.I00io1l;
/* 18 */                int i = 1;
/* 20 */                if (obj instanceof Activity) {
/* 26 */                    boolean z = this.I00oooO;
/* 28 */                    i00iooliil0i = new i00IOoliil0i();
/* 33 */                    new ArrayList();
/* 41 */                    i00iooliil0i.I000lI = new ArrayList();
/* 43 */                    i00iooliil0i.I000o00OoI0I = 0;
/* 45 */                    i00iooliil0i.I000oI1ioi = true;
/* 47 */                    i00iooliil0i.I0010o = true;
/* 54 */                    i00iooliil0i.I001i1O0Ol = new i00IO11o1Ili(i00iooliil0i, i);
/* 61 */                    i00iooliil0i.I001i1lo1io = new i00IO11o1Ili(i00iooliil0i, i);
/* 68 */                    i00iooliil0i.I001iOo1i0O = new iiOlilo0IIIl(i00iooliil0i);
/* 74 */                    View decorView = ((Activity) obj).getWindow().getDecorView();
/* 78 */                    i00iooliil0i.I0000Il00O(decorView);
/* 81 */                    if (!z) {
/* 90 */                        i00iooliil0i.I000II = decorView.findViewById(R.id.content);
                            }
/* 92 */                    VarHandle.storeStoreFence();
/* 95 */                    this.I00li1OI = i00iooliil0i;
                        } else if (obj instanceof Dialog) {
/* 106 */                   i00iooliil0i = new i00IOoliil0i();
/* 111 */                   new ArrayList();
/* 119 */                   i00iooliil0i.I000lI = new ArrayList();
/* 121 */                   i00iooliil0i.I000o00OoI0I = 0;
/* 123 */                   i00iooliil0i.I000oI1ioi = true;
/* 125 */                   i00iooliil0i.I0010o = true;
/* 132 */                   i00iooliil0i.I001i1O0Ol = new i00IO11o1Ili(i00iooliil0i, i);
/* 139 */                   i00iooliil0i.I001i1lo1io = new i00IO11o1Ili(i00iooliil0i, i);
/* 146 */                   i00iooliil0i.I001iOo1i0O = new iiOlilo0IIIl(i00iooliil0i);
/* 156 */                   i00iooliil0i.I0000Il00O(((Dialog) obj).getWindow().getDecorView());
/* 159 */                   VarHandle.storeStoreFence();
/* 162 */                   this.I00li1OI = i00iooliil0i;
                        }
/* 164 */               if (i00iooliil0i != null) {
/* 166 */                   boolean z2 = this.I011IO1I11OI;
/* 170 */                   if (i00iooliil0i.I000O01llI0) {
/* 245 */                       return;
                            }
/* 173 */                   i = z2 ? 4 : 0;
/* 178 */                   Oo1ilOl oo1ilOl = (Oo1ilOl) i00iooliil0i.I0000oI00;
/* 180 */                   int i2 = oo1ilOl.I00000oOI;
/* 182 */                   i00iooliil0i.I000O01llI0 = true;
/* 189 */                   oo1ilOl.I00000oIO((i & 4) | (i2 & (-5)));
                        }
                    }
                }

                public final void I001iOo1i0O(int i) {
/* 7 */             this.I0110o = (1 << i) | this.I0110o;
/* 11 */            if (this.I0110OiO) {
/* 29 */                return;
                    }
/* 15 */            View decorView = this.I00l0I0l0lO1.getDecorView();
/* 19 */            WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 23 */            decorView.postOnAnimation(this.I0111i);
/* 26 */            this.I0110OiO = true;
                }

                public final int I001l0I00(Context context, int i) {
/* 4 */             if (i != -100) {
/* 6 */                 if (i != -1) {
/* 8 */                     if (i != 0) {
/* 11 */                        if (i != 1 && i != 2) {
/* 17 */                            if (i != 3) {
/* 37 */                                I000II.I001IO000("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
/* 40 */                                return 0;
                                    }
/* 19 */                            I11o0oiOlIl i11o0oiOlIl = this.I01101olii;
/* 21 */                            if (i11o0oiOlIl == null) {
/* 25 */                                i11o0oiOlIl = new I11o0oiOlIl(this, context);
/* 28 */                                this.I01101olii = i11o0oiOlIl;
                                    }
/* 30 */                            return i11o0oiOlIl.I000l1();
                                }
                            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
/* 65 */                        return I001IO000(context).I000l1();
                            }
                        }
/* 70 */                return i;
                    }
/* 3 */             return -1;
                }

                public final boolean I001lIiIIo1O() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    Ii1iOIIi ii1iOIIi;
                    Oo1OoiI oo1OoiI;
/* 1 */             boolean z = this.I010i10l;
/* 4 */             this.I010i10l = false;
/* 6 */             I11oO10o1i i11oO10o1iI001i1O0Ol = I001i1O0Ol(0);
/* 13 */            if (!i11oO10o1iI001i1O0Ol.I000lI) {
/* 21 */                I0I1liIO0ii i0I1liIO0ii = this.I00o101lO;
/* 23 */                if (i0I1liIO0ii != null) {
/* 25 */                    i0I1liIO0ii.I00000oOI();
/* 12 */                    return true;
                        }
/* 29 */                I001i1lo1io();
/* 32 */                i00IOoliil0i i00iooliil0i = this.I00li1OI;
/* 34 */                if (i00iooliil0i == null || (ii1iOIIi = i00iooliil0i.I0000oI00) == null || (oo1OoiI = ((Oo1ilOl) ii1iOIIi).I00000oIO.I010iIIOlo) == null || oo1OoiI.I00iiI == null) {
/* 3 */                     return false;
                        }
/* 57 */                Oo1OoiI oo1OoiI2 = ((Oo1ilOl) ii1iOIIi).I00000oIO.I010iIIOlo;
/* 63 */                O1ioIIl o1ioIIl = oo1OoiI2 == null ? null : oo1OoiI2.I00iiI;
/* 65 */                if (o1ioIIl != null) {
/* 67 */                    o1ioIIl.collapseActionView();
                        }
                    } else if (!z) {
/* 17 */                I00100l0(i11oO10o1iI001i1O0Ol, true);
/* 12 */                return true;
                    }
/* 12 */            return true;
                }

                /* JADX WARN: Code restructure failed: missing block: B:87:0x0174, code lost:
                
                    if (r6.getCount() > 0) goto L88;
                 */
                /* JADX WARN: Removed duplicated region for block: B:100:0x01d1  */
                /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I001lllioOl(I11oO10o1i i11oO10o1i, KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    int i;
                    ViewGroup.LayoutParams layoutParams;
/* 5 */             boolean z = i11oO10o1i.I000lI;
/* 7 */             int i2 = i11oO10o1i.I00000oIO;
/* 9 */             if (z || this.I010l10O) {
/* 900 */               return;
                    }
/* 17 */            Context context = this.I00ioIO;
/* 19 */            if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
/* 900 */               return;
                    }
/* 40 */            Window.Callback callback = this.I00l0I0l0lO1.getCallback();
/* 45 */            if (callback != null && !callback.onMenuOpened(i2, i11oO10o1i.I000O01llI0)) {
/* 55 */                I00100l0(i11oO10o1i, true);
/* 58 */                return;
                    }
/* 65 */            WindowManager windowManager = (WindowManager) context.getSystemService("window");
/* 67 */            if (windowManager == null || !I00II0Ol1O0l(i11oO10o1i, keyEvent)) {
/* 900 */               return;
                    }
/* 79 */            I11oIo0oIIl1 i11oIo0oIIl1 = i11oO10o1i.I0000oI00;
/* 83 */            if (i11oIo0oIIl1 != null && !i11oO10o1i.I000o00OoI0I) {
/* 90 */                View view = i11oO10o1i.I000II;
/* 92 */                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
/* 105 */                   i = -1;
                        }
/* 433 */               i11oO10o1i.I000l1 = false;
/* 446 */               WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
/* 451 */               layoutParams2.gravity = i11oO10o1i.I0000Il00O;
/* 455 */               layoutParams2.windowAnimations = i11oO10o1i.I0000O;
/* 459 */               windowManager.addView(i11oO10o1i.I0000oI00, layoutParams2);
/* 462 */               i11oO10o1i.I000lI = true;
/* 464 */               if (i2 != 0) {
/* 466 */                   I00IO1();
/* 469 */                   return;
                        }
/* 900 */               return;
                    }
/* 108 */           if (i11oIo0oIIl1 == null) {
/* 110 */               I001i1lo1io();
/* 113 */               i00IOoliil0i i00iooliil0i = this.I00li1OI;
/* 122 */               Context contextI00000oOI = i00iooliil0i != null ? i00iooliil0i.I00000oOI() : null;
/* 123 */               if (contextI00000oOI != null) {
/* 126 */                   context = contextI00000oOI;
                        }
/* 129 */               TypedValue typedValue = new TypedValue();
/* 136 */               Resources.Theme themeNewTheme = context.getResources().newTheme();
/* 144 */               themeNewTheme.setTo(context.getTheme());
/* 150 */               themeNewTheme.resolveAttribute(com.box.gallery.R.attr.actionBarPopupTheme, typedValue, true);
/* 153 */               int i3 = typedValue.resourceId;
/* 155 */               if (i3 != 0) {
/* 157 */                   themeNewTheme.applyStyle(i3, true);
                        }
/* 163 */               themeNewTheme.resolveAttribute(com.box.gallery.R.attr.panelMenuListTheme, typedValue, true);
/* 166 */               int i4 = typedValue.resourceId;
/* 168 */               if (i4 != 0) {
/* 170 */                   themeNewTheme.applyStyle(i4, true);
                        } else {
/* 177 */                   themeNewTheme.applyStyle(com.box.gallery.R.style.Theme_AppCompat_CompactMenu, true);
                        }
/* 182 */               IOoiOIIOOIi iOoiOIIOOIi = new IOoiOIIOOIi(context, 0);
/* 189 */               iOoiOIIOOIi.getTheme().setTo(themeNewTheme);
/* 192 */               i11oO10o1i.I000OiO = iOoiOIIOOIi;
/* 196 */               TypedArray typedArrayObtainStyledAttributes = iOoiOIIOOIi.obtainStyledAttributes(OOilOli0.I000OiO);
/* 206 */               i11oO10o1i.I00000oOI = typedArrayObtainStyledAttributes.getResourceId(86, 0);
/* 212 */               i11oO10o1i.I0000O = typedArrayObtainStyledAttributes.getResourceId(1, 0);
/* 214 */               typedArrayObtainStyledAttributes.recycle();
/* 224 */               i11oO10o1i.I0000oI00 = new I11oIo0oIIl1(this, i11oO10o1i.I000OiO);
/* 228 */               i11oO10o1i.I0000Il00O = 81;
                    } else if (i11oO10o1i.I000o00OoI0I && i11oIo0oIIl1.getChildCount() > 0) {
/* 243 */               i11oO10o1i.I0000oI00.removeAllViews();
                    }
/* 246 */           View view2 = i11oO10o1i.I000II;
/* 248 */           if (view2 == null) {
/* 255 */               if (i11oO10o1i.I000O01llI0 != null) {
/* 259 */                   iiOlilo0IIIl iiolilo0iiil = this.I00o0l1o1o0;
/* 261 */                   if (iiolilo0iiil == null) {
/* 265 */                       iiolilo0iiil = new iiOlilo0IIIl();
/* 268 */                       iiolilo0iiil.I00iOIl = this;
/* 270 */                       VarHandle.storeStoreFence();
/* 273 */                       this.I00o0l1o1o0 = iiolilo0iiil;
                            }
/* 277 */                   if (i11oO10o1i.I000OOo1O == null) {
/* 283 */                       O10Ii1IIil o10Ii1IIil = new O10Ii1IIil(i11oO10o1i.I000OiO);
/* 286 */                       i11oO10o1i.I000OOo1O = o10Ii1IIil;
/* 288 */                       o10Ii1IIil.I00ilI0I1 = iiolilo0iiil;
/* 290 */                       O1illlIiilIl o1illlIiilIl = i11oO10o1i.I000O01llI0;
/* 294 */                       o1illlIiilIl.I00000oOI(o10Ii1IIil, o1illlIiilIl.I00000oIO);
                            }
/* 297 */                   O10Ii1IIil o10Ii1IIil2 = i11oO10o1i.I000OOo1O;
/* 299 */                   I11oIo0oIIl1 i11oIo0oIIl12 = i11oO10o1i.I0000oI00;
/* 303 */                   if (o10Ii1IIil2.I00iio == null) {
/* 316 */                       o10Ii1IIil2.I00iio = (ExpandedMenuView) o10Ii1IIil2.I00iiI.inflate(com.box.gallery.R.layout.abc_expanded_menu_layout, (ViewGroup) i11oIo0oIIl12, false);
/* 318 */                       O10Ii01i0 o10Ii01i0 = o10Ii1IIil2.I00ilO0;
/* 320 */                       if (o10Ii01i0 == null) {
/* 324 */                           o10Ii01i0 = new O10Ii01i0(o10Ii1IIil2);
/* 327 */                           o10Ii1IIil2.I00ilO0 = o10Ii01i0;
                                }
/* 331 */                       o10Ii1IIil2.I00iio.setAdapter((ListAdapter) o10Ii01i0);
/* 336 */                       o10Ii1IIil2.I00iio.setOnItemClickListener(o10Ii1IIil2);
                            }
/* 339 */                   ExpandedMenuView expandedMenuView = o10Ii1IIil2.I00iio;
/* 341 */                   i11oO10o1i.I0001Ioi1lo = expandedMenuView;
/* 343 */                   if (expandedMenuView != null) {
                            }
                        }
/* 470 */               i11oO10o1i.I000o00OoI0I = true;
/* 900 */               return;
                    }
/* 250 */           i11oO10o1i.I0001Ioi1lo = view2;
/* 347 */           if (i11oO10o1i.I0001Ioi1lo != null) {
/* 353 */               if (i11oO10o1i.I000II == null) {
/* 356 */                   O10Ii1IIil o10Ii1IIil3 = i11oO10o1i.I000OOo1O;
/* 358 */                   O10Ii01i0 o10Ii01i02 = o10Ii1IIil3.I00ilO0;
/* 360 */                   if (o10Ii01i02 == null) {
/* 364 */                       o10Ii01i02 = new O10Ii01i0(o10Ii1IIil3);
/* 367 */                       o10Ii1IIil3.I00ilO0 = o10Ii01i02;
                            }
                        }
/* 377 */               ViewGroup.LayoutParams layoutParams3 = i11oO10o1i.I0001Ioi1lo.getLayoutParams();
/* 381 */               if (layoutParams3 == null) {
/* 385 */                   layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                        }
/* 392 */               i11oO10o1i.I0000oI00.setBackgroundResource(i11oO10o1i.I00000oOI);
/* 397 */               ViewParent parent = i11oO10o1i.I0001Ioi1lo.getParent();
/* 403 */               if (parent instanceof ViewGroup) {
/* 409 */                   ((ViewGroup) parent).removeView(i11oO10o1i.I0001Ioi1lo);
                        }
/* 416 */               i11oO10o1i.I0000oI00.addView(i11oO10o1i.I0001Ioi1lo, layoutParams3);
/* 425 */               if (!i11oO10o1i.I0001Ioi1lo.hasFocus()) {
/* 429 */                   i11oO10o1i.I0001Ioi1lo.requestFocus();
                        }
                    }
/* 470 */           i11oO10o1i.I000o00OoI0I = true;
/* 900 */           return;
/* 432 */           i = -2;
/* 433 */           i11oO10o1i.I000l1 = false;
/* 446 */           WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
/* 451 */           layoutParams22.gravity = i11oO10o1i.I0000Il00O;
/* 455 */           layoutParams22.windowAnimations = i11oO10o1i.I0000O;
/* 459 */           windowManager.addView(i11oO10o1i.I0000oI00, layoutParams22);
/* 462 */           i11oO10o1i.I000lI = true;
/* 464 */           if (i2 != 0) {
                    }
                }

                public final boolean I001lloI(I11oO10o1i i11oO10o1i, int i, KeyEvent keyEvent) {
                    O1illlIiilIl o1illlIiilIl;
/* 6 */             if (keyEvent.isSystem()) {
/* 5 */                 return false;
                    }
/* 11 */            if ((i11oO10o1i.I000iOII || I00II0Ol1O0l(i11oO10o1i, keyEvent)) && (o1illlIiilIl = i11oO10o1i.I000O01llI0) != null) {
/* 24 */                return o1illlIiilIl.performShortcut(i, keyEvent, 1);
                    }
/* 5 */             return false;
                }

                /* JADX WARN: Removed duplicated region for block: B:59:0x00ce A[PHI: r6
                  0x00ce: PHI (r6v2 O1illlIiilIl) = (r6v1 O1illlIiilIl), (r6v8 O1illlIiilIl) binds: [B:31:0x004c, B:57:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00II0Ol1O0l(I11oO10o1i i11oO10o1i, KeyEvent keyEvent) {
                    ActionBarOverlayLayout actionBarOverlayLayout;
                    ActionBarOverlayLayout actionBarOverlayLayout2;
                    Resources.Theme themeNewTheme;
                    ActionBarOverlayLayout actionBarOverlayLayout3;
                    ActionBarOverlayLayout actionBarOverlayLayout4;
/* 4 */             if (!this.I010l10O) {
/* 8 */                 boolean z = i11oO10o1i.I000iOII;
/* 10 */                int i = i11oO10o1i.I00000oIO;
/* 12 */                int i2 = 1;
/* 13 */                if (z) {
/* 12 */                    return true;
                        }
/* 16 */                I11oO10o1i i11oO10o1i2 = this.I010OIo1l;
/* 18 */                if (i11oO10o1i2 != null && i11oO10o1i2 != i11oO10o1i) {
/* 22 */                    I00100l0(i11oO10o1i2, false);
                        }
/* 27 */                Window.Callback callback = this.I00l0I0l0lO1.getCallback();
/* 31 */                if (callback != null) {
/* 37 */                    i11oO10o1i.I000II = callback.onCreatePanelView(i);
                        }
/* 48 */                boolean z2 = i == 0 || i == 108;
/* 49 */                if (z2 && (actionBarOverlayLayout4 = this.I00lll10) != null) {
/* 55 */                    actionBarOverlayLayout4.I000iOII();
/* 62 */                    ((Oo1ilOl) actionBarOverlayLayout4.I00ilI0I1).I000l1 = true;
                        }
/* 66 */                if (i11oO10o1i.I000II == null) {
/* 68 */                    O1illlIiilIl o1illlIiilIl = i11oO10o1i.I000O01llI0;
/* 71 */                    if (o1illlIiilIl == null || i11oO10o1i.I000oI1ioi) {
/* 77 */                        if (o1illlIiilIl == null) {
/* 79 */                            Context context = this.I00ioIO;
/* 81 */                            if ((i == 0 || i == 108) && this.I00lll10 != null) {
/* 91 */                                TypedValue typedValue = new TypedValue();
/* 94 */                                Resources.Theme theme = context.getTheme();
/* 101 */                               theme.resolveAttribute(com.box.gallery.R.attr.actionBarTheme, typedValue, true);
/* 109 */                               if (typedValue.resourceId != 0) {
/* 115 */                                   themeNewTheme = context.getResources().newTheme();
/* 119 */                                   themeNewTheme.setTo(theme);
/* 124 */                                   themeNewTheme.applyStyle(typedValue.resourceId, true);
/* 127 */                                   themeNewTheme.resolveAttribute(com.box.gallery.R.attr.actionBarWidgetTheme, typedValue, true);
                                        } else {
/* 131 */                                   theme.resolveAttribute(com.box.gallery.R.attr.actionBarWidgetTheme, typedValue, true);
/* 134 */                                   themeNewTheme = null;
                                        }
/* 137 */                               if (typedValue.resourceId != 0) {
/* 139 */                                   if (themeNewTheme == null) {
/* 145 */                                       themeNewTheme = context.getResources().newTheme();
/* 149 */                                       themeNewTheme.setTo(theme);
                                            }
/* 154 */                                   themeNewTheme.applyStyle(typedValue.resourceId, true);
                                        }
/* 157 */                               if (themeNewTheme != null) {
/* 161 */                                   IOoiOIIOOIi iOoiOIIOOIi = new IOoiOIIOOIi(context, 0);
/* 168 */                                   iOoiOIIOOIi.getTheme().setTo(themeNewTheme);
/* 171 */                                   context = iOoiOIIOOIi;
                                        }
                                    }
/* 174 */                           O1illlIiilIl o1illlIiilIl2 = new O1illlIiilIl(context);
/* 177 */                           o1illlIiilIl2.I0000oI00 = this;
/* 179 */                           O1illlIiilIl o1illlIiilIl3 = i11oO10o1i.I000O01llI0;
/* 181 */                           if (o1illlIiilIl2 != o1illlIiilIl3) {
/* 184 */                               if (o1illlIiilIl3 != null) {
/* 188 */                                   o1illlIiilIl3.I0010I0i(i11oO10o1i.I000OOo1O);
                                        }
/* 191 */                               i11oO10o1i.I000O01llI0 = o1illlIiilIl2;
/* 193 */                               O10Ii1IIil o10Ii1IIil = i11oO10o1i.I000OOo1O;
/* 195 */                               if (o10Ii1IIil != null) {
/* 199 */                                   o1illlIiilIl2.I00000oOI(o10Ii1IIil, o1illlIiilIl2.I00000oIO);
                                        }
                                    }
/* 202 */                           o1illlIiilIl = i11oO10o1i.I000O01llI0;
/* 204 */                           if (o1illlIiilIl != null) {
/* 207 */                               if (z2 && (actionBarOverlayLayout2 = this.I00lll10) != null) {
/* 213 */                                   I0IIiO0iI i0IIiO0iI = this.I00o0iI0io1;
/* 215 */                                   if (i0IIiO0iI == null) {
/* 219 */                                       i0IIiO0iI = new I0IIiO0iI(i2);
/* 222 */                                       i0IIiO0iI.I00iiI = this;
/* 224 */                                       VarHandle.storeStoreFence();
/* 227 */                                       this.I00o0iI0io1 = i0IIiO0iI;
                                            }
/* 229 */                                   actionBarOverlayLayout2.I000l1(o1illlIiilIl, i0IIiO0iI);
                                        }
/* 234 */                               i11oO10o1i.I000O01llI0.I001i1O0Ol();
/* 243 */                               if (callback.onCreatePanelMenu(i, i11oO10o1i.I000O01llI0)) {
/* 271 */                                   i11oO10o1i.I000oI1ioi = false;
                                        } else {
/* 245 */                                   O1illlIiilIl o1illlIiilIl4 = i11oO10o1i.I000O01llI0;
/* 247 */                                   if (o1illlIiilIl4 != null) {
/* 250 */                                       if (o1illlIiilIl4 != null) {
/* 254 */                                           o1illlIiilIl4.I0010I0i(i11oO10o1i.I000OOo1O);
                                                }
/* 257 */                                       i11oO10o1i.I000O01llI0 = null;
                                            }
/* 259 */                                   if (z2 && (actionBarOverlayLayout = this.I00lll10) != null) {
/* 267 */                                       actionBarOverlayLayout.I000l1(null, this.I00o0iI0io1);
                                            }
                                        }
                                    }
                                }
                            }
/* 275 */                   i11oO10o1i.I000O01llI0.I001i1O0Ol();
/* 278 */                   Bundle bundle = i11oO10o1i.I00100l0;
/* 280 */                   if (bundle != null) {
/* 284 */                       i11oO10o1i.I000O01llI0.I0010o(bundle);
/* 287 */                       i11oO10o1i.I00100l0 = null;
                            }
/* 297 */                   if (!callback.onPreparePanel(0, i11oO10o1i.I000II, i11oO10o1i.I000O01llI0)) {
/* 299 */                       if (z2 && (actionBarOverlayLayout3 = this.I00lll10) != null) {
/* 307 */                           actionBarOverlayLayout3.I000l1(null, this.I00o0iI0io1);
                                }
/* 312 */                       i11oO10o1i.I000O01llI0.I001IO000();
/* 3 */                         return false;
                            }
/* 339 */                   i11oO10o1i.I000O01llI0.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
/* 344 */                   i11oO10o1i.I000O01llI0.I001IO000();
                        }
/* 347 */               i11oO10o1i.I000iOII = true;
/* 349 */               i11oO10o1i.I000l1 = false;
/* 351 */               this.I010OIo1l = i11oO10o1i;
/* 12 */                return true;
                    }
/* 3 */             return false;
                }

                public final void I00II0oii1o() {
/* 3 */             if (this.I00ol1) {
/* 20 */                throw new AndroidRuntimeException("Window feature must be requested before adding content");
                    }
                }

                public final void I00IO1() {
                    OnBackInvokedCallback onBackInvokedCallback;
/* 3 */             boolean z = false;
/* 4 */             if (this.I011Ol0 != null && (I001i1O0Ol(0).I000lI || this.I00o101lO != null)) {
/* 16 */                z = true;
                    }
/* 23 */            if (z && this.I011iIOio == null) {
/* 35 */                this.I011iIOio = I11o010IIIi.I00000oOI(this.I011Ol0, this);
                    } else {
/* 38 */                if (z || (onBackInvokedCallback = this.I011iIOio) == null) {
/* 55 */                    return;
                        }
/* 46 */                I11o010IIIi.I0000Il00O(this.I011Ol0, onBackInvokedCallback);
/* 50 */                this.I011iIOio = null;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
                
                    if (r6.I000OiO() != false) goto L20;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00IlilI0i0i(O1illlIiilIl o1illlIiilIl) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    ActionMenuView actionMenuView;
                    I0I1ii0i i0I1ii0i;
                    I0I1ii0i i0I1ii0i2;
                    I0I1ii0i i0I1ii0i3;
/* 1 */             ActionBarOverlayLayout actionBarOverlayLayout = this.I00lll10;
/* 5 */             if (actionBarOverlayLayout != null) {
/* 7 */                 actionBarOverlayLayout.I000iOII();
/* 14 */                Toolbar toolbar = ((Oo1ilOl) actionBarOverlayLayout.I00ilI0I1).I00000oIO;
/* 20 */                if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.I00iOIl) != null && actionMenuView.I00oII) {
/* 40 */                    if (ViewConfiguration.get(this.I00ioIO).hasPermanentMenuKey()) {
/* 42 */                        ActionBarOverlayLayout actionBarOverlayLayout2 = this.I00lll10;
/* 44 */                        actionBarOverlayLayout2.I000iOII();
/* 53 */                        ActionMenuView actionMenuView2 = ((Oo1ilOl) actionBarOverlayLayout2.I00ilI0I1).I00000oIO.I00iOIl;
/* 55 */                        if (actionMenuView2 != null) {
/* 57 */                            I0I1ii0i i0I1ii0i4 = actionMenuView2.I00oIiI10;
/* 59 */                            if (i0I1ii0i4 != null) {
/* 63 */                                if (i0I1ii0i4.I00oO101o == null) {
                                        }
                                    }
                                }
                            }
/* 73 */                    Window.Callback callback = this.I00l0I0l0lO1.getCallback();
/* 77 */                    ActionBarOverlayLayout actionBarOverlayLayout3 = this.I00lll10;
/* 79 */                    actionBarOverlayLayout3.I000iOII();
/* 88 */                    ActionMenuView actionMenuView3 = ((Oo1ilOl) actionBarOverlayLayout3.I00ilI0I1).I00000oIO.I00iOIl;
/* 92 */                    if (actionMenuView3 != null && (i0I1ii0i2 = actionMenuView3.I00oIiI10) != null && i0I1ii0i2.I000OiO()) {
/* 104 */                       ActionBarOverlayLayout actionBarOverlayLayout4 = this.I00lll10;
/* 106 */                       actionBarOverlayLayout4.I000iOII();
/* 115 */                       ActionMenuView actionMenuView4 = ((Oo1ilOl) actionBarOverlayLayout4.I00ilI0I1).I00000oIO.I00iOIl;
/* 117 */                       if (actionMenuView4 != null && (i0I1ii0i3 = actionMenuView4.I00oIiI10) != null) {
/* 123 */                           i0I1ii0i3.I0001Ioi1lo();
                                }
/* 129 */                       if (this.I010l10O) {
/* 217 */                           return;
                                }
/* 137 */                       callback.onPanelClosed(108, I001i1O0Ol(0).I000O01llI0);
/* 140 */                       return;
                            }
/* 141 */                   if (callback == null || this.I010l10O) {
/* 217 */                       return;
                            }
/* 149 */                   if (this.I0110OiO && (1 & this.I0110o) != 0) {
/* 158 */                       View decorView = this.I00l0I0l0lO1.getDecorView();
/* 162 */                       I11lo00IoiIo i11lo00IoiIo = this.I0111i;
/* 164 */                       decorView.removeCallbacks(i11lo00IoiIo);
/* 167 */                       i11lo00IoiIo.run();
                            }
/* 170 */                   I11oO10o1i i11oO10o1iI001i1O0Ol = I001i1O0Ol(0);
/* 174 */                   O1illlIiilIl o1illlIiilIl2 = i11oO10o1iI001i1O0Ol.I000O01llI0;
/* 176 */                   if (o1illlIiilIl2 == null || i11oO10o1iI001i1O0Ol.I000oI1ioi || !callback.onPreparePanel(0, i11oO10o1iI001i1O0Ol.I000II, o1illlIiilIl2)) {
/* 217 */                       return;
                            }
/* 192 */                   callback.onMenuOpened(108, i11oO10o1iI001i1O0Ol.I000O01llI0);
/* 195 */                   ActionBarOverlayLayout actionBarOverlayLayout5 = this.I00lll10;
/* 197 */                   actionBarOverlayLayout5.I000iOII();
/* 206 */                   ActionMenuView actionMenuView5 = ((Oo1ilOl) actionBarOverlayLayout5.I00ilI0I1).I00000oIO.I00iOIl;
/* 208 */                   if (actionMenuView5 == null || (i0I1ii0i = actionMenuView5.I00oIiI10) == null) {
/* 217 */                       return;
                            }
/* 214 */                   i0I1ii0i.I000l1();
/* 217 */                   return;
                        }
                    }
/* 218 */           I11oO10o1i i11oO10o1iI001i1O0Ol2 = I001i1O0Ol(0);
/* 222 */           i11oO10o1iI001i1O0Ol2.I000o00OoI0I = true;
/* 224 */           I00100l0(i11oO10o1iI001i1O0Ol2, false);
/* 228 */           I001lllioOl(i11oO10o1iI001i1O0Ol2, null);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:115:0x01e0  */
                /* JADX WARN: Removed duplicated region for block: B:118:0x0216  */
                /* JADX WARN: Removed duplicated region for block: B:121:0x022f  */
                /* JADX WARN: Removed duplicated region for block: B:124:0x0249  */
                /* JADX WARN: Removed duplicated region for block: B:139:0x02cf  */
                /* JADX WARN: Removed duplicated region for block: B:141:0x02d9  */
                /* JADX WARN: Removed duplicated region for block: B:146:0x02e8  */
                /* JADX WARN: Removed duplicated region for block: B:163:0x031e  */
                /* JADX WARN: Removed duplicated region for block: B:174:0x033c  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) throws Throwable {
                    I1IIIOIooo0 i1IIIOIooo0;
                    Context iOoiOIIOOIi;
                    TypedArray typedArrayObtainStyledAttributes;
                    int i;
                    CharSequence[] textArray;
                    SpinnerAdapter spinnerAdapter;
                    View i11l1ioo1IoI;
                    String attributeValue;
                    Object obj;
                    View viewI0001Ioi1lo;
                    char c;
/* 9 */             I1IIIOIooo0 i1IIIOIooo02 = this.I011Io0I1ioi;
/* 11 */            TypedArray typedArray = null;
/* 12 */            if (i1IIIOIooo02 == null) {
/* 14 */                int[] iArr = OOilOli0.I000OiO;
/* 16 */                Context context2 = this.I00ioIO;
/* 18 */                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
/* 24 */                String string = typedArrayObtainStyledAttributes2.getString(116);
/* 28 */                typedArrayObtainStyledAttributes2.recycle();
/* 31 */                if (string == null) {
/* 35 */                    i1IIIOIooo02 = new I1IIIOIooo0();
/* 38 */                    this.I011Io0I1ioi = i1IIIOIooo02;
                        } else {
                            try {
/* 58 */                        i1IIIOIooo02 = (I1IIIOIooo0) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
/* 60 */                        this.I011Io0I1ioi = i1IIIOIooo02;
                            } catch (Throwable th) {
/* 85 */                        Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
/* 90 */                        i1IIIOIooo02 = new I1IIIOIooo0();
/* 93 */                        this.I011Io0I1ioi = i1IIIOIooo02;
                            }
                        }
                    }
/* 40 */            i1IIIOIooo0 = i1IIIOIooo02;
/* 96 */            int i2 = Ooo1Ioil.I00000oIO;
/* 98 */            i1IIIOIooo0.getClass();
/* 104 */           TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, OOilOli0.I001i1lo1io, 0, 0);
/* 109 */           int resourceId = typedArrayObtainStyledAttributes3.getResourceId(4, 0);
/* 113 */           if (resourceId != 0) {
/* 119 */               Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
                    }
/* 122 */           typedArrayObtainStyledAttributes3.recycle();
/* 145 */           iOoiOIIOOIi = (resourceId == 0 || ((context instanceof IOoiOIIOOIi) && ((IOoiOIIOOIi) context).I00000oIO == resourceId)) ? context : new IOoiOIIOOIi(context, resourceId);
/* 146 */           str.getClass();
                    switch (str) {
                        case "RatingBar":
/* 683 */                   I1I0ii1oI0lO i1I0ii1oI0lO = new I1I0ii1oI0lO(iOoiOIIOOIi, attributeSet, com.box.gallery.R.attr.ratingBarStyle);
/* 690 */                   Oo0oil0li0I.I00000oIO(i1I0ii1oI0lO, i1I0ii1oI0lO.getContext());
/* 695 */                   I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(i1I0ii1oI0lO);
/* 698 */                   i1I0ii1oI0lO.I00iOIl = i1I0i0Ilo1Oi;
/* 700 */                   i1I0i0Ilo1Oi.I00OIl(attributeSet, com.box.gallery.R.attr.ratingBarStyle);
/* 703 */                   VarHandle.storeStoreFence();
                            i11l1ioo1IoI = i1I0ii1oI0lO;
                            break;
                        case "CheckedTextView":
/* 674 */                   i11l1ioo1IoI = new I11l1ioo1IoI(iOoiOIIOOIi, attributeSet);
                            break;
                        case "MultiAutoCompleteTextView":
/* 668 */                   i11l1ioo1IoI = new I1I0O1(iOoiOIIOOIi, attributeSet);
                            break;
                        case "TextView":
/* 661 */                   i11l1ioo1IoI = i1IIIOIooo0.I0000oI00(iOoiOIIOOIi, attributeSet);
                            break;
                        case "ImageButton":
/* 657 */                   i11l1ioo1IoI = new I1I0I0oii1(iOoiOIIOOIi, attributeSet, com.box.gallery.R.attr.imageButtonStyle);
                            break;
                        case "SeekBar":
/* 613 */                   I1I0iilo i1I0iilo = new I1I0iilo(iOoiOIIOOIi, attributeSet, com.box.gallery.R.attr.seekBarStyle);
/* 620 */                   Oo0oil0li0I.I00000oIO(i1I0iilo, i1I0iilo.getContext());
/* 625 */                   I1I0l1lo0oo i1I0l1lo0oo = new I1I0l1lo0oo(i1I0iilo);
/* 629 */                   i1I0l1lo0oo.I00io1l = null;
/* 631 */                   i1I0l1lo0oo.I00ioIO = null;
/* 634 */                   i1I0l1lo0oo.I00l0I0l0lO1 = false;
/* 636 */                   i1I0l1lo0oo.I00l0OO0IO = false;
/* 638 */                   i1I0l1lo0oo.I00ilI0I1 = i1I0iilo;
/* 640 */                   VarHandle.storeStoreFence();
/* 643 */                   i1I0iilo.I00iOIl = i1I0l1lo0oo;
/* 645 */                   i1I0l1lo0oo.I00OIl(attributeSet, com.box.gallery.R.attr.seekBarStyle);
/* 648 */                   VarHandle.storeStoreFence();
                            i11l1ioo1IoI = i1I0iilo;
                            break;
                        case "Spinner":
/* 387 */                   I1I1OI00IOo i1I1OI00IOo = new I1I1OI00IOo(iOoiOIIOOIi, attributeSet, com.box.gallery.R.attr.spinnerStyle);
/* 395 */                   i1I1OI00IOo.I00ioIO = new Rect();
/* 401 */                   Oo0oil0li0I.I00000oIO(i1I1OI00IOo, i1I1OI00IOo.getContext());
/* 404 */                   int[] iArr2 = OOilOli0.I001IIilI0O;
/* 406 */                   TypedArray typedArrayObtainStyledAttributes4 = iOoiOIIOOIi.obtainStyledAttributes(attributeSet, iArr2, com.box.gallery.R.attr.spinnerStyle, 0);
/* 415 */                   i1I1OI00IOo.I00iOIl = new I11l01l(i1I1OI00IOo);
/* 417 */                   int resourceId2 = typedArrayObtainStyledAttributes4.getResourceId(4, 0);
/* 421 */                   if (resourceId2 != 0) {
/* 428 */                       i1I1OI00IOo.I00iiI = new IOoiOIIOOIi(iOoiOIIOOIi, resourceId2);
                            } else {
/* 431 */                       i1I1OI00IOo.I00iiI = iOoiOIIOOIi;
                            }
                            try {
/* 435 */                       typedArrayObtainStyledAttributes = iOoiOIIOOIi.obtainStyledAttributes(attributeSet, I1I1OI00IOo.I00l0I0l0lO1, com.box.gallery.R.attr.spinnerStyle, 0);
                                try {
                                    try {
/* 456 */                               i = typedArrayObtainStyledAttributes.hasValue(0) ? typedArrayObtainStyledAttributes.getInt(0, 0) : -1;
/* 457 */                               typedArrayObtainStyledAttributes.recycle();
                                    } catch (Throwable th2) {
/* 450 */                               th = th2;
/* 451 */                               typedArray = typedArrayObtainStyledAttributes;
/* 602 */                               if (typedArray != null) {
/* 604 */                                   typedArray.recycle();
                                        }
/* 607 */                               throw th;
                                    }
                                } catch (Exception e) {
/* 454 */                           e = e;
/* 470 */                           Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
/* 473 */                           if (typedArrayObtainStyledAttributes != null) {
/* 475 */                               typedArrayObtainStyledAttributes.recycle();
                                    }
/* 478 */                           i = -1;
/* 479 */                           if (i != 0) {
                                    }
/* 554 */                           textArray = typedArrayObtainStyledAttributes4.getTextArray(0);
/* 558 */                           if (textArray != null) {
                                    }
/* 577 */                           typedArrayObtainStyledAttributes4.recycle();
/* 580 */                           i1I1OI00IOo.I00ilI0I1 = true;
/* 582 */                           spinnerAdapter = i1I1OI00IOo.I00iio;
/* 584 */                           if (spinnerAdapter != null) {
                                    }
/* 594 */                           i1I1OI00IOo.I00iOIl.I001lIiIIo1O(attributeSet, com.box.gallery.R.attr.spinnerStyle);
/* 597 */                           VarHandle.storeStoreFence();
/* 600 */                           i11l1ioo1IoI = i1I1OI00IOo;
/* 706 */                           if (i11l1ioo1IoI == null) {
/* 710 */                               Object[] objArr = i1IIIOIooo0.I00000oIO;
/* 730 */                               if (!str.equals("view")) {
                                        }
/* 727 */                               char c2 = 0;
                                        try {
                                            try {
/* 732 */                                       objArr[0] = iOoiOIIOOIi;
                                                try {
/* 734 */                                           objArr[1] = attributeSet;
/* 743 */                                           if (-1 != attributeValue.indexOf(46)) {
                                                    }
                                                } catch (Exception unused) {
/* 776 */                                           viewI0001Ioi1lo = null;
                                                    break;
                                                }
                                            } catch (Exception unused2) {
                                                break;
                                            }
/* 826 */                                   i11l1ioo1IoI = viewI0001Ioi1lo;
                                        } catch (Throwable th3) {
/* 812 */                                   th = th3;
/* 813 */                                   obj = null;
                                            break;
                                        }
                                    }
/* 827 */                           if (i11l1ioo1IoI != null) {
                                    }
/* 875 */                           return i11l1ioo1IoI;
                                }
                            } catch (Exception e2) {
/* 464 */                       e = e2;
/* 465 */                       typedArrayObtainStyledAttributes = null;
                            } catch (Throwable th4) {
/* 461 */                       th = th4;
                            }
/* 479 */                   if (i != 0) {
/* 537 */                       I1I0o1I i1I0o1I = new I1I0o1I();
/* 540 */                       i1I0o1I.I00iio = i1I1OI00IOo;
/* 542 */                       VarHandle.storeStoreFence();
/* 545 */                       i1I1OI00IOo.I00ilO0 = i1I0o1I;
/* 551 */                       i1I0o1I.I00iiO = typedArrayObtainStyledAttributes4.getString(2);
                            } else if (i == 1) {
/* 489 */                       I1I1Io i1I1Io = new I1I1Io(i1I1OI00IOo, i1I1OI00IOo.I00iiI, attributeSet);
/* 494 */                       OlilOlOiI olilOlOiII0010I0i = OlilOlOiI.I0010I0i(i1I1OI00IOo.I00iiI, attributeSet, iArr2, com.box.gallery.R.attr.spinnerStyle);
/* 507 */                       i1I1OI00IOo.I00io1l = ((TypedArray) olilOlOiII0010I0i.I00iiO).getLayoutDimension(3, -2);
/* 513 */                       i1I1Io.I000OOo1O(olilOlOiII0010I0i.I000iOII(1));
/* 520 */                       i1I1Io.I00oo1iO0ll = typedArrayObtainStyledAttributes4.getString(2);
/* 522 */                       olilOlOiII0010I0i.I0010o();
/* 525 */                       i1I1OI00IOo.I00ilO0 = i1I1Io;
/* 532 */                       i1I1OI00IOo.I00iiO = new I1I0lO1IIO(i1I1OI00IOo, i1I1OI00IOo, i1I1Io);
                            }
/* 554 */                   textArray = typedArrayObtainStyledAttributes4.getTextArray(0);
/* 558 */                   if (textArray != null) {
/* 565 */                       ArrayAdapter arrayAdapter = new ArrayAdapter(iOoiOIIOOIi, R.layout.simple_spinner_item, textArray);
/* 571 */                       arrayAdapter.setDropDownViewResource(com.box.gallery.R.layout.support_simple_spinner_dropdown_item);
/* 574 */                       i1I1OI00IOo.setAdapter((SpinnerAdapter) arrayAdapter);
                            }
/* 577 */                   typedArrayObtainStyledAttributes4.recycle();
/* 580 */                   i1I1OI00IOo.I00ilI0I1 = true;
/* 582 */                   spinnerAdapter = i1I1OI00IOo.I00iio;
/* 584 */                   if (spinnerAdapter != null) {
/* 586 */                       i1I1OI00IOo.setAdapter(spinnerAdapter);
/* 590 */                       i1I1OI00IOo.I00iio = null;
                            }
/* 594 */                   i1I1OI00IOo.I00iOIl.I001lIiIIo1O(attributeSet, com.box.gallery.R.attr.spinnerStyle);
/* 597 */                   VarHandle.storeStoreFence();
/* 600 */                   i11l1ioo1IoI = i1I1OI00IOo;
                            break;
                        case "RadioButton":
/* 376 */                   i11l1ioo1IoI = i1IIIOIooo0.I0000O(iOoiOIIOOIi, attributeSet);
                            break;
                        case "ToggleButton":
/* 371 */                   i11l1ioo1IoI = new I1II1i(iOoiOIIOOIi, attributeSet);
                            break;
                        case "ImageView":
/* 364 */                   i11l1ioo1IoI = new I1I0I11lo(iOoiOIIOOIi, attributeSet, 0);
                            break;
                        case "AutoCompleteTextView":
/* 356 */                   i11l1ioo1IoI = i1IIIOIooo0.I00000oIO(iOoiOIIOOIi, attributeSet);
                            break;
                        case "CheckBox":
/* 350 */                   i11l1ioo1IoI = i1IIIOIooo0.I0000Il00O(iOoiOIIOOIi, attributeSet);
                            break;
                        case "EditText":
/* 345 */                   i11l1ioo1IoI = new I1I00Ii(iOoiOIIOOIi, attributeSet);
                            break;
                        case "Button":
/* 337 */                   i11l1ioo1IoI = i1IIIOIooo0.I00000oOI(iOoiOIIOOIi, attributeSet);
                            break;
                        default:
/* 334 */                   i11l1ioo1IoI = null;
                            break;
                    }
/* 706 */           if (i11l1ioo1IoI == null && context != iOoiOIIOOIi) {
/* 710 */               Object[] objArr2 = i1IIIOIooo0.I00000oIO;
/* 730 */               attributeValue = !str.equals("view") ? attributeSet.getAttributeValue(null, "class") : str;
/* 727 */               char c22 = 0;
/* 732 */               objArr2[0] = iOoiOIIOOIi;
/* 734 */               objArr2[1] = attributeSet;
/* 743 */               if (-1 != attributeValue.indexOf(46)) {
/* 745 */                   int i3 = 0;
                            while (true) {
                                try {
/* 746 */                           String[] strArr = I1IIIOIooo0.I0000O;
/* 748 */                           if (i3 < 3) {
                                        try {
/* 752 */                                   viewI0001Ioi1lo = i1IIIOIooo0.I0001Ioi1lo(iOoiOIIOOIi, attributeValue, strArr[i3]);
/* 756 */                                   if (viewI0001Ioi1lo != null) {
/* 761 */                                       objArr2[0] = null;
/* 763 */                                       objArr2[1] = null;
                                            } else {
/* 767 */                                       i3++;
                                            }
                                        } catch (Throwable th5) {
/* 770 */                                   th = th5;
/* 772 */                                   obj = null;
/* 773 */                                   c = 0;
/* 817 */                                   objArr2[c] = obj;
/* 819 */                                   objArr2[1] = obj;
/* 821 */                                   throw th;
                                        }
                                    } else {
/* 783 */                               objArr2[0] = null;
/* 785 */                               objArr2[1] = null;
/* 787 */                               viewI0001Ioi1lo = null;
                                    }
                                } catch (Exception unused3) {
/* 795 */                           c22 = 0;
/* 797 */                           viewI0001Ioi1lo = null;
/* 822 */                           objArr2[c22] = viewI0001Ioi1lo;
/* 824 */                           objArr2[1] = viewI0001Ioi1lo;
/* 826 */                           i11l1ioo1IoI = viewI0001Ioi1lo;
/* 827 */                           if (i11l1ioo1IoI != null) {
                                    }
/* 875 */                           return i11l1ioo1IoI;
                                } catch (Throwable th6) {
/* 789 */                           th = th6;
/* 791 */                           c = 0;
/* 793 */                           obj = null;
/* 817 */                           objArr2[c] = obj;
/* 819 */                           objArr2[1] = obj;
/* 821 */                           throw th;
                                }
                            }
                        } else {
                            try {
/* 802 */                       View viewI0001Ioi1lo2 = i1IIIOIooo0.I0001Ioi1lo(iOoiOIIOOIi, attributeValue, null);
/* 806 */                       objArr2[0] = null;
/* 808 */                       objArr2[1] = null;
/* 810 */                       viewI0001Ioi1lo = viewI0001Ioi1lo2;
                            } catch (Exception unused4) {
/* 815 */                       viewI0001Ioi1lo = null;
/* 777 */                       c22 = 0;
/* 822 */                       objArr2[c22] = viewI0001Ioi1lo;
/* 824 */                       objArr2[1] = viewI0001Ioi1lo;
/* 826 */                       i11l1ioo1IoI = viewI0001Ioi1lo;
/* 827 */                       if (i11l1ioo1IoI != null) {
                                }
/* 875 */                       return i11l1ioo1IoI;
                            }
                        }
/* 826 */               i11l1ioo1IoI = viewI0001Ioi1lo;
                    }
/* 827 */           if (i11l1ioo1IoI != null) {
/* 829 */               Context context3 = i11l1ioo1IoI.getContext();
/* 835 */               if ((context3 instanceof ContextWrapper) && i11l1ioo1IoI.hasOnClickListeners()) {
/* 846 */                   TypedArray typedArrayObtainStyledAttributes5 = context3.obtainStyledAttributes(attributeSet, I1IIIOIooo0.I0000Il00O);
/* 851 */                   String string2 = typedArrayObtainStyledAttributes5.getString(0);
/* 855 */                   if (string2 != null) {
/* 859 */                       I1II1lO i1II1lO = new I1II1lO();
/* 862 */                       i1II1lO.I00iOIl = i11l1ioo1IoI;
/* 864 */                       i1II1lO.I00iiI = string2;
/* 866 */                       VarHandle.storeStoreFence();
/* 869 */                       i11l1ioo1IoI.setOnClickListener(i1II1lO);
                            }
/* 872 */                   typedArrayObtainStyledAttributes5.recycle();
                        }
                    }
/* 875 */           return i11l1ioo1IoI;
                }

                @Override
/* 876 */       public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
/* 877 */           return onCreateView(null, str, context, attributeSet);
                }
            }
