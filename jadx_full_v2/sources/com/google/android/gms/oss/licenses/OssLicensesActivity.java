            package com.google.android.gms.oss.licenses;

            import android.content.res.Resources;
            import android.os.Bundle;
            import android.util.Log;
            import android.view.MenuItem;
            import android.widget.ScrollView;
            import android.widget.TextView;
            import androidx.appcompat.widget.Toolbar;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import p000.I0lil01;
            import p000.I11io0O0O1o1;
            import p000.IioOll;
            import p000.Oo1ilOl;
            import p000.OoIOol;
            import p000.OooiOl0ioo0i;
            import p000.i00IOoliil0i;
            import p000.i0OloII1;
            import p000.i0i01Ii0iII;
            import p000.iii1IIii;
            import p000.iloillOlIi1;
            import p000.liIIO0;
            import p000.ll1IoOi1l;
            import p000.lli100OOO0;
            import p000.o00i1olooO;
            import p000.o0IiOl;
            
            public final class OssLicensesActivity extends I11io0O0O1o1 {
                public o00i1olooO I00oo1iO0ll;
                public String I00ooIo0 = "";
                public ScrollView I00ooiO1I = null;
                public TextView I00oooO = null;
                public int I0100i = 0;
                public iii1IIii I0100o111I;
                public OoIOol I010101Oo1lO;

                @Override
                public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    String str;
/* 1 */             super.onCreate(bundle);
/* 4 */             IioOll.I00000oIO(this);
/* 12 */            liIIO0.I00000oIO(getWindow(), true);
/* 18 */            setContentView(R.layout.libraries_social_licenses_license_activity);
/* 28 */            TextView textView = (TextView) findViewById(R.id.license_activity_textview);
/* 30 */            this.I00oooO = textView;
/* 39 */            textView.setText(getString(R.string.license_is_loading));
/* 46 */            this.I0100o111I = iii1IIii.I00000oIO(this);
/* 60 */            this.I00oo1iO0ll = (o00i1olooO) getIntent().getParcelableExtra("license");
/* 66 */            if (I00111O() != null) {
/* 68 */                i00IOoliil0i i00iooliil0iI00111O = I00111O();
/* 74 */                String str2 = this.I00oo1iO0ll.I00iOIl;
/* 78 */                Oo1ilOl oo1ilOl = (Oo1ilOl) i00iooliil0iI00111O.I0000oI00;
/* 80 */                oo1ilOl.I000II = true;
/* 82 */                Toolbar toolbar = oo1ilOl.I00000oIO;
/* 84 */                oo1ilOl.I000O01llI0 = str2;
/* 90 */                if ((oo1ilOl.I00000oOI & 8) != 0) {
/* 92 */                    toolbar.setTitle(str2);
/* 97 */                    if (oo1ilOl.I000II) {
/* 103 */                       OooiOl0ioo0i.I0000Il00O(toolbar.getRootView(), str2);
                            }
                        }
/* 106 */               i00IOoliil0i i00iooliil0iI00111O2 = I00111O();
/* 110 */               i00iooliil0iI00111O2.getClass();
/* 115 */               Oo1ilOl oo1ilOl2 = (Oo1ilOl) i00iooliil0iI00111O2.I0000oI00;
/* 123 */               oo1ilOl2.I00000oIO((oo1ilOl2.I00000oOI & (-3)) | 2);
/* 126 */               i00IOoliil0i i00iooliil0iI00111O3 = I00111O();
/* 130 */               i00iooliil0iI00111O3.getClass();
/* 135 */               Oo1ilOl oo1ilOl3 = (Oo1ilOl) i00iooliil0iI00111O3.I0000oI00;
/* 137 */               int i = oo1ilOl3.I00000oOI;
/* 139 */               i00iooliil0iI00111O3.I000O01llI0 = true;
/* 145 */               oo1ilOl3.I00000oIO((i & (-5)) | 4);
/* 154 */               Oo1ilOl oo1ilOl4 = (Oo1ilOl) I00111O().I0000oI00;
/* 157 */               oo1ilOl4.I0000oI00 = null;
/* 159 */               oo1ilOl4.I0000O();
                    }
/* 172 */           OoIOol ooIOolI0000O = iii1IIii.I0000O(this, this.I0100o111I.I000II(getPackageName()));
/* 176 */           this.I010101Oo1lO = ooIOolI0000O;
/* 200 */           this.I00ooiO1I = (ScrollView) findViewById(((Resources) ooIOolI0000O.I00iiI).getIdentifier("license_activity_scrollview", "id", (String) ooIOolI0000O.I00iiO));
/* 202 */           OoIOol ooIOol = this.I010101Oo1lO;
/* 224 */           this.I00oooO = (TextView) findViewById(((Resources) ooIOol.I00iiI).getIdentifier("license_activity_textview", "id", (String) ooIOol.I00iiO));
/* 226 */           iii1IIii iii1iiii = this.I0100o111I;
/* 228 */           o00i1olooO o00i1olooo = this.I00oo1iO0ll;
/* 230 */           iii1iiii.getClass();
                    try {
/* 235 */               i0i01Ii0iII i0i01ii0iii = (i0i01Ii0iII) iii1iiii.I00iiI;
/* 243 */               o0IiOl o0iiolI00000oOI = i0i01ii0iii.I00000oOI(0, new i0OloII1(i0i01ii0iii, o00i1olooo));
/* 249 */               lli100OOO0 lli100ooo0 = new lli100OOO0();
/* 252 */               lli100ooo0.I00ioIO = o0iiolI00000oOI;
/* 254 */               iloillOlIi1 iloillolii1 = iloillOlIi1.I00iOIl;
/* 259 */               iii1IIii iii1iiii2 = new iii1IIii(6);
/* 262 */               iii1iiii2.I00iiI = lli100ooo0;
/* 264 */               VarHandle.storeStoreFence();
/* 267 */               o0iiolI00000oOI.I00000oOI(iloillolii1, iii1iiii2);
/* 278 */               str = (String) lli100ooo0.get(2L, TimeUnit.SECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e) {
/* 286 */               Log.w("OssLicenses", "Failed to get license detail from OssLicensesClient", e);
/* 289 */               str = "";
                    }
/* 291 */           this.I00ooIo0 = str;
/* 293 */           if (str == null || str.isEmpty()) {
/* 301 */               o00i1olooO o00i1olooo2 = this.I00oo1iO0ll;
/* 313 */               this.I00ooIo0 = ll1IoOi1l.I00000oOI(this, "third_party_licenses", o00i1olooo2.I00iiI, o00i1olooo2.I00iiO);
                    }
/* 315 */           String string = this.I00ooIo0;
/* 317 */           if (string == null) {
/* 322 */               string = getString(R.string.license_content_error);
/* 326 */               this.I00ooIo0 = string;
                    }
/* 330 */           this.I00oooO.setText(string);
/* 335 */           if (this.I0100i == 0) {
/* 337 */               return;
                    }
/* 338 */           ScrollView scrollView = this.I00ooiO1I;
/* 344 */           I0lil01 i0lil01 = new I0lil01(24);
/* 347 */           i0lil01.I00iiI = this;
/* 349 */           VarHandle.storeStoreFence();
/* 352 */           scrollView.post(i0lil01);
                }

                @Override
                public final boolean onOptionsItemSelected(MenuItem menuItem) {
/* 8 */             if (menuItem.getItemId() != 16908332) {
/* 15 */                return super.onOptionsItemSelected(menuItem);
                    }
/* 10 */            finish();
/* 13 */            return true;
                }

                @Override
                public final void onRestoreInstanceState(Bundle bundle) {
/* 1 */             super.onRestoreInstanceState(bundle);
/* 10 */            this.I0100i = bundle.getInt("scroll_pos");
                }

                @Override
                public final void onSaveInstanceState(Bundle bundle) {
/* 1 */             super.onSaveInstanceState(bundle);
/* 4 */             TextView textView = this.I00oooO;
/* 6 */             if (textView == null || this.I00ooiO1I == null) {
/* 77 */                return;
                    }
/* 39 */            bundle.putInt("scroll_pos", this.I00oooO.getLayout().getLineStart(textView.getLayout().getLineForVertical(this.I00ooiO1I.getScrollY())));
                }
            }
