            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.text.TextUtils;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public final class IlO0oiiii0IO {
                public String I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public String I0000O;
                public String I0000oI00;
                public String I0001Ioi1lo;
                public String I000II;
                public String I000O01llI0;

                public static IlO0oiiii0IO I00000oIO(Context context) {
/* 5 */             IIlio101Io iIlio101Io = new IIlio101Io(26);
/* 8 */             lII0I0I000I.I000II(context);
/* 11 */            Resources resources = context.getResources();
/* 15 */            iIlio101Io.I00iiI = resources;
/* 24 */            iIlio101Io.I00iiO = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
/* 26 */            VarHandle.storeStoreFence();
/* 31 */            String strI00oO101o = iIlio101Io.I00oO101o("google_app_id");
/* 39 */            if (TextUtils.isEmpty(strI00oO101o)) {
/* 41 */                return null;
                    }
/* 47 */            String strI00oO101o2 = iIlio101Io.I00oO101o("google_api_key");
/* 53 */            String strI00oO101o3 = iIlio101Io.I00oO101o("firebase_database_url");
/* 59 */            String strI00oO101o4 = iIlio101Io.I00oO101o("ga_trackingId");
/* 65 */            String strI00oO101o5 = iIlio101Io.I00oO101o("gcm_defaultSenderId");
/* 71 */            String strI00oO101o6 = iIlio101Io.I00oO101o("google_storage_bucket");
/* 77 */            String strI00oO101o7 = iIlio101Io.I00oO101o("recaptcha_site_key");
/* 83 */            String strI00oO101o8 = iIlio101Io.I00oO101o("project_id");
/* 87 */            IlO0oiiii0IO ilO0oiiii0IO = new IlO0oiiii0IO();
/* 90 */            int i = OlOoO1.I00000oIO;
/* 112 */           lII0I0I000I.I000OOo1O("ApplicationId must be set.", true ^ (strI00oO101o == null || strI00oO101o.trim().isEmpty()));
/* 115 */           ilO0oiiii0IO.I00000oOI = strI00oO101o;
/* 117 */           ilO0oiiii0IO.I00000oIO = strI00oO101o2;
/* 119 */           ilO0oiiii0IO.I0000Il00O = strI00oO101o3;
/* 121 */           ilO0oiiii0IO.I0000O = strI00oO101o4;
/* 123 */           ilO0oiiii0IO.I0000oI00 = strI00oO101o5;
/* 125 */           ilO0oiiii0IO.I0001Ioi1lo = strI00oO101o6;
/* 127 */           ilO0oiiii0IO.I000II = strI00oO101o7;
/* 129 */           ilO0oiiii0IO.I000O01llI0 = strI00oO101o8;
/* 131 */           VarHandle.storeStoreFence();
/* 168 */           return ilO0oiiii0IO;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof IlO0oiiii0IO)) {
/* 3 */                 return false;
                    }
/* 7 */             IlO0oiiii0IO ilO0oiiii0IO = (IlO0oiiii0IO) obj;
                    return l1ioii1I10Io.I00000oIO(this.I00000oOI, ilO0oiiii0IO.I00000oOI) && l1ioii1I10Io.I00000oIO(this.I00000oIO, ilO0oiiii0IO.I00000oIO) && l1ioii1I10Io.I00000oIO(this.I0000Il00O, ilO0oiiii0IO.I0000Il00O) && l1ioii1I10Io.I00000oIO(this.I0000O, ilO0oiiii0IO.I0000O) && l1ioii1I10Io.I00000oIO(this.I0000oI00, ilO0oiiii0IO.I0000oI00) && l1ioii1I10Io.I00000oIO(this.I0001Ioi1lo, ilO0oiiii0IO.I0001Ioi1lo) && l1ioii1I10Io.I00000oIO(this.I000II, ilO0oiiii0IO.I000II) && l1ioii1I10Io.I00000oIO(this.I000O01llI0, ilO0oiiii0IO.I000O01llI0);
                }

                public final int hashCode() {
/* 21 */            return Arrays.hashCode(new Object[]{this.I00000oOI, this.I00000oIO, this.I0000Il00O, this.I0000O, this.I0000oI00, this.I0001Ioi1lo, this.I000II, this.I000O01llI0});
                }

                public final String toString() {
/* 1 */             Iol01110 iol01110I00000oOI = l1ioii1I10Io.I00000oOI(this);
/* 9 */             iol01110I00000oOI.I0000Il00O("applicationId", this.I00000oOI);
/* 16 */            iol01110I00000oOI.I0000Il00O("apiKey", this.I00000oIO);
/* 23 */            iol01110I00000oOI.I0000Il00O("databaseUrl", this.I0000Il00O);
/* 30 */            iol01110I00000oOI.I0000Il00O("gcmSenderId", this.I0000oI00);
/* 37 */            iol01110I00000oOI.I0000Il00O("storageBucket", this.I0001Ioi1lo);
/* 44 */            iol01110I00000oOI.I0000Il00O("recaptchaSiteKey", this.I000II);
/* 51 */            iol01110I00000oOI.I0000Il00O("projectId", this.I000O01llI0);
/* 54 */            return iol01110I00000oOI.toString();
                }
            }
