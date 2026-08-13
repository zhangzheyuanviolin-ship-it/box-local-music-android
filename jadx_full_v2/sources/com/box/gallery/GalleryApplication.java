            package com.box.gallery;

            import android.app.Application;
            import android.content.SharedPreferences;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import p000.I1IOI1olooi;
            import p000.IO0l1oi1O1;
            import p000.IO0ll0;
            import p000.Ii110ilOil;
            import p000.Ii1l100;
            import p000.Ii1liIllli0;
            import p000.Iil1l0lo1lOo;
            import p000.Iil1liO0;
            import p000.Il00o11;
            import p000.IlIoliIO;
            import p000.Ilo0lOOo;
            import p000.IloolIii1o;
            import p000.O0000Ioio00;
            import p000.O1i1oIi1il;
            import p000.OIOlIOlO1;
            import p000.OIooliIO0;
            import p000.Oi0Oooi;
            import p000.Oii0IoIiOO;
            import p000.OlO0OIIl1;
            import p000.Oo0oOoIo0ol;
            import p000.Oo0oii;
            import p000.iOi1IOoIO0l;
            import p000.l1lioOO00;
            import p000.lOlioilIOoi;
            
            public final class GalleryApplication extends Application implements IloolIii1o {
                public boolean I00iOIl = false;
                public final I1IOI1olooi I00iiI;
                public Ii1liIllli0 I00iiO;

                public GalleryApplication() {
/* 13 */            Oi0Oooi oi0Oooi = new Oi0Oooi(11, false);
/* 16 */            oi0Oooi.I00iiI = this;
/* 18 */            VarHandle.storeStoreFence();
/* 21 */            I1IOI1olooi i1IOI1olooi = new I1IOI1olooi();
/* 29 */            i1IOI1olooi.I00iiI = new Object();
/* 31 */            i1IOI1olooi.I00iiO = oi0Oooi;
/* 33 */            VarHandle.storeStoreFence();
/* 36 */            this.I00iiI = i1IOI1olooi;
                }

                public final void I00000oIO() {
/* 3 */             if (!this.I00iOIl) {
/* 6 */                 this.I00iOIl = true;
/* 26 */                this.I00iiO = (Ii1liIllli0) ((Ii110ilOil) ((Ilo0lOOo) this.I00iiI.I0000Il00O())).I000lI.get();
                    }
/* 28 */            super.onCreate();
                }

                @Override
                public final Object I0000Il00O() {
/* 3 */             return this.I00iiI.I0000Il00O();
                }

                @Override
                public final void onCreate() throws IOException {
/* 1 */             I00000oIO();
/* 16 */            l1lioOO00.I00000oIO = getApplicationContext().getApplicationContext().getAssets();
/* 18 */            OIooliIO0 oIooliIO0 = Oo0oii.I00000oIO;
/* 20 */            Ii1liIllli0 ii1liIllli0 = this.I00iiO;
/* 23 */            if (ii1liIllli0 == null) {
/* 184 */               O0000Ioio00.I000OOo1O("dataStoreRepository");
/* 245 */               throw null;
                    }
/* 40 */            oIooliIO0.setValue((Oo0oOoIo0ol) iOi1IOoIO0l.I00000oIO(Il00o11.I00iOIl, new Ii1l100(ii1liIllli0, null, 15)));
/* 46 */            SharedPreferences sharedPreferences = getSharedPreferences("box_settings", 0);
/* 50 */            OIooliIO0 oIooliIO02 = Oo0oii.I00000oOI;
/* 56 */            String string = sharedPreferences.getString("custom_theme", "system");
/* 68 */            oIooliIO02.setValue(lOlioilIOoi.I00000oIO(string != null ? string : "system"));
/* 71 */            OIooliIO0 oIooliIO03 = Oo0oii.I0000O;
/* 73 */            IO0l1oi1O1 iO0l1oi1O1 = IO0l1oi1O1.I00iiO;
/* 79 */            String string2 = sharedPreferences.getString("catppuccin_accent", "mauve");
/* 91 */            oIooliIO03.setValue(IO0ll0.I00000oOI(string2 != null ? string2 : "mauve"));
/* 94 */            OIooliIO0 oIooliIO04 = Oo0oii.I0000oI00;
/* 96 */            Iil1l0lo1lOo iil1l0lo1lOo = Iil1l0lo1lOo.I00iiO;
/* 102 */           String string3 = sharedPreferences.getString("dracula_accent", "purple");
/* 114 */           oIooliIO04.setValue(Iil1liO0.I00000oOI(string3 != null ? string3 : "purple"));
/* 117 */           IlIoliIO.I0000oI00(this);
/* 120 */           OlO0OIIl1 olO0OIIl1 = OIOlIOlO1.I00000oIO;
/* 122 */           SharedPreferences sharedPreferences2 = getSharedPreferences("box_settings", 0);
/* 126 */           OlO0OIIl1 olO0OIIl12 = OIOlIOlO1.I00000oIO;
/* 134 */           Boolean boolValueOf = Boolean.valueOf(sharedPreferences2.getBoolean("offline_mode_enabled", false));
/* 138 */           olO0OIIl12.getClass();
/* 141 */           olO0OIIl12.I000lI(null, boolValueOf);
/* 144 */           OlO0OIIl1 olO0OIIl13 = O1i1oIi1il.I00000oIO;
/* 146 */           SharedPreferences sharedPreferences3 = getSharedPreferences("box_settings", 0);
/* 150 */           OlO0OIIl1 olO0OIIl14 = O1i1oIi1il.I00000oIO;
/* 158 */           Boolean boolValueOf2 = Boolean.valueOf(sharedPreferences3.getBoolean("mcp_enabled", false));
/* 162 */           olO0OIIl14.getClass();
/* 165 */           olO0OIIl14.I000lI(null, boolValueOf2);
/* 174 */           O1i1oIi1il.I0000Il00O = sharedPreferences3.getBoolean("mcp_disclaimer_shown", false);
/* 178 */           Oii0IoIiOO.I00000oIO(this, "APPLICATION_CREATED");
                }
            }
