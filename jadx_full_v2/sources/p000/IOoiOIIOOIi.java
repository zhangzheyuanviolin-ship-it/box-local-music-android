            package p000;

            import android.content.Context;
            import android.content.ContextWrapper;
            import android.content.res.AssetManager;
            import android.content.res.Configuration;
            import android.content.res.Resources;
            import android.view.LayoutInflater;
            import com.box.gallery.R;
            
            public final class IOoiOIIOOIi extends ContextWrapper {
                public static Configuration I0001Ioi1lo;
                public int I00000oIO;
                public Resources.Theme I00000oOI;
                public LayoutInflater I0000Il00O;
                public Configuration I0000O;
                public Resources I0000oI00;

                public IOoiOIIOOIi(Context context, int i) {
/* 1 */             super(context);
/* 4 */             this.I00000oIO = i;
                }

                public final void I00000oIO(Configuration configuration) {
/* 3 */             if (this.I0000oI00 != null) {
/* 25 */                I000II.I001IO000("getResources() or getAssets() has already been called");
                    } else if (this.I0000O == null) {
/* 14 */                this.I0000O = new Configuration(configuration);
                    } else {
/* 19 */                I000II.I001IO000("Override configuration has already been set");
                    }
                }

                public final void I00000oOI() {
/* 3 */             if (this.I00000oOI == null) {
/* 13 */                this.I00000oOI = getResources().newTheme();
/* 19 */                Resources.Theme theme = getBaseContext().getTheme();
/* 23 */                if (theme != null) {
/* 27 */                    this.I00000oOI.setTo(theme);
                        }
                    }
/* 35 */            this.I00000oOI.applyStyle(this.I00000oIO, true);
                }

                @Override
                public final void attachBaseContext(Context context) {
/* 1 */             super.attachBaseContext(context);
                }

                @Override
                public final AssetManager getAssets() {
/* 5 */             return getResources().getAssets();
                }

                @Override
                public final Resources getResources() {
/* 1 */             Resources resources = this.I0000oI00;
/* 3 */             if (resources != null) {
/* 55 */                return resources;
                    }
/* 5 */             Configuration configuration = this.I0000O;
/* 7 */             if (configuration != null) {
/* 9 */                 Configuration configuration2 = I0001Ioi1lo;
/* 11 */                if (configuration2 == null) {
/* 15 */                    configuration2 = new Configuration();
/* 19 */                    configuration2.fontScale = 0.0f;
/* 21 */                    I0001Ioi1lo = configuration2;
                        }
/* 27 */                if (!configuration.equals(configuration2)) {
/* 36 */                    Resources resources2 = createConfigurationContext(this.I0000O).getResources();
/* 40 */                    this.I0000oI00 = resources2;
/* 42 */                    return resources2;
                        }
                    }
/* 43 */            Resources resources3 = super.getResources();
/* 47 */            this.I0000oI00 = resources3;
/* 55 */            return resources3;
                }

                @Override
                public final Object getSystemService(String str) {
/* 7 */             if (!"layout_inflater".equals(str)) {
/* 32 */                return getBaseContext().getSystemService(str);
                    }
/* 9 */             LayoutInflater layoutInflater = this.I0000Il00O;
/* 11 */            if (layoutInflater != null) {
/* 27 */                return layoutInflater;
                    }
/* 21 */            LayoutInflater layoutInflaterCloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
/* 25 */            this.I0000Il00O = layoutInflaterCloneInContext;
/* 27 */            return layoutInflaterCloneInContext;
                }

                @Override
                public final Resources.Theme getTheme() {
/* 1 */             Resources.Theme theme = this.I00000oOI;
/* 3 */             if (theme != null) {
/* 5 */                 return theme;
                    }
/* 8 */             if (this.I00000oIO == 0) {
/* 13 */                this.I00000oIO = R.style.Theme_AppCompat_Light;
                    }
/* 15 */            I00000oOI();
/* 18 */            return this.I00000oOI;
                }

                @Override
                public final void setTheme(int i) {
/* 3 */             if (this.I00000oIO != i) {
/* 5 */                 this.I00000oIO = i;
/* 7 */                 I00000oOI();
                    }
                }
            }
