            package com.google.android.gms.oss.licenses;

            import android.content.Intent;
            import android.content.res.Resources;
            import android.os.Bundle;
            import android.util.Log;
            import android.view.MenuItem;
            import com.box.gallery.R;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.reflect.InvocationTargetException;
            import p000.I000II;
            import p000.I11io0O0O1o1;
            import p000.I1loiIo;
            import p000.IioOll;
            import p000.Ill1OlOOl;
            import p000.Oo1ilOl;
            import p000.OoIOol;
            import p000.i00IOoliil0i;
            import p000.iii1IIii;
            import p000.iil0olO1o;
            import p000.liIIO0;
            import p000.liii0ioI;
            
            public final class OssLicensesMenuActivity extends I11io0O0O1o1 {
                public static String I00ooiO1I;
                public boolean I00oo1iO0ll;
                public iii1IIii I00ooIo0;

                public static boolean I001IIilI0O(OssLicensesMenuActivity ossLicensesMenuActivity, String str) throws IOException {
/* 1 */             InputStream inputStreamOpenRawResource = null;
                    try {
/* 3 */                 Resources resources = ossLicensesMenuActivity.getResources();
/* 20 */                inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.license_list)));
/* 28 */                boolean z = inputStreamOpenRawResource.available() > 0;
                        try {
/* 31 */                    inputStreamOpenRawResource.close();
                        } catch (IOException unused) {
                        }
/* 34 */                return z;
                    } catch (Resources.NotFoundException | IOException unused2) {
/* 42 */                if (inputStreamOpenRawResource != null) {
                            try {
/* 44 */                        inputStreamOpenRawResource.close();
                            } catch (IOException unused3) {
                            }
                        }
/* 2 */                 return false;
                    } catch (Throwable th) {
/* 36 */                if (inputStreamOpenRawResource != null) {
                            try {
/* 38 */                        inputStreamOpenRawResource.close();
                            } catch (IOException unused4) {
                            }
                        }
/* 41 */                throw th;
                    }
                }

                @Override
                public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 1 */             super.onCreate(bundle);
/* 8 */             this.I00ooIo0 = iii1IIii.I00000oIO(this);
/* 10 */            IioOll.I00000oIO(this);
/* 18 */            liIIO0.I00000oIO(getWindow(), true);
/* 24 */            setContentView(R.layout.libraries_social_licenses_license_menu_activity);
/* 47 */            this.I00oo1iO0ll = I001IIilI0O(this, "third_party_licenses") && I001IIilI0O(this, "third_party_license_metadata");
/* 51 */            if (I00ooiO1I == null) {
/* 53 */                Intent intent = getIntent();
/* 63 */                if (intent.hasExtra("title")) {
/* 69 */                    I00ooiO1I = intent.getStringExtra("title");
/* 75 */                    Log.w("OssLicensesMenuActivity", "The intent based title is deprecated. Use OssLicensesMenuActivity.setActivityTitle(title) instead.");
                        }
                    }
/* 78 */            String str = I00ooiO1I;
/* 80 */            if (str != null) {
/* 82 */                setTitle(str);
                    }
/* 89 */            if (I00111O() != null) {
/* 91 */                i00IOoliil0i i00iooliil0iI00111O = I00111O();
/* 95 */                i00iooliil0iI00111O.getClass();
/* 100 */               Oo1ilOl oo1ilOl = (Oo1ilOl) i00iooliil0iI00111O.I0000oI00;
/* 102 */               int i = oo1ilOl.I00000oOI;
/* 104 */               i00iooliil0iI00111O.I000O01llI0 = true;
/* 110 */               oo1ilOl.I00000oIO((i & (-5)) | 4);
                    }
/* 119 */           String strI000II = this.I00ooIo0.I000II(getPackageName());
/* 123 */           OoIOol ooIOolI0000O = iii1IIii.I0000O(this, strI000II);
/* 129 */           String str2 = (String) ooIOolI0000O.I00iiO;
/* 133 */           Resources resources = (Resources) ooIOolI0000O.I00iiI;
/* 144 */           if (!this.I00oo1iO0ll) {
/* 216 */               if (bundle == null) {
/* 218 */                   iii1IIii.I00000oIO(this);
/* 221 */                   int identifier = resources.getIdentifier("license_fragment_container", "id", str2);
/* 235 */                   if (((iil0olO1o) I00100o1O0lo().I001lllioOl(identifier)) == null) {
/* 239 */                       iil0olO1o iil0olo1o = new iil0olO1o();
/* 242 */                       Ill1OlOOl ill1OlOOlI00100o1O0lo = I00100o1O0lo();
/* 246 */                       ill1OlOOlI00100o1O0lo.getClass();
/* 251 */                       I1loiIo i1loiIo = new I1loiIo(ill1OlOOlI00100o1O0lo);
/* 254 */                       i1loiIo.I0000oI00(identifier, iil0olo1o, null);
/* 259 */                       if (i1loiIo.I000II) {
/* 267 */                           I000II.I001IO000("This transaction is already being added to the back stack");
/* 437 */                           return;
                                } else {
/* 263 */                           i1loiIo.I00100l0.I001l0I00(i1loiIo, false);
/* 266 */                           return;
                                }
                            }
/* 437 */                   return;
                        }
/* 437 */               return;
                    }
/* 146 */           if (bundle == null) {
/* 148 */               iii1IIii.I00000oIO(this);
/* 151 */               int identifier2 = resources.getIdentifier("license_fragment_container", "id", str2);
/* 165 */               if (((liii0ioI) I00100o1O0lo().I001lllioOl(identifier2)) == null) {
/* 169 */                   liii0ioI liii0ioi = new liii0ioI();
/* 172 */                   if (strI000II != null) {
/* 176 */                       Bundle bundle2 = new Bundle();
/* 181 */                       bundle2.putString("license_activity_package_name", strI000II);
/* 184 */                       liii0ioi.I00Io1o110i(bundle2);
                            }
/* 187 */                   Ill1OlOOl ill1OlOOlI00100o1O0lo2 = I00100o1O0lo();
/* 191 */                   ill1OlOOlI00100o1O0lo2.getClass();
/* 196 */                   I1loiIo i1loiIo2 = new I1loiIo(ill1OlOOlI00100o1O0lo2);
/* 199 */                   i1loiIo2.I0000oI00(identifier2, liii0ioi, null);
/* 204 */                   if (i1loiIo2.I000II) {
/* 212 */                       I000II.I001IO000("This transaction is already being added to the back stack");
                            } else {
/* 208 */                       i1loiIo2.I00100l0.I001l0I00(i1loiIo2, false);
                            }
                        }
                    }
                }

                @Override
                public final boolean onOptionsItemSelected(MenuItem menuItem) {
/* 8 */             if (menuItem.getItemId() != 16908332) {
/* 15 */                return super.onOptionsItemSelected(menuItem);
                    }
/* 10 */            finish();
/* 13 */            return true;
                }
            }
