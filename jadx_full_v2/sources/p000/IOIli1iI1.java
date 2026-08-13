            package p000;

            import android.os.Bundle;
            import com.google.firebase.analytics.FirebaseAnalytics;
            
            public final class IOIli1iI1 {
                public I101liloIo1 I00000oIO;
                public String I00000oOI;

                public final void I00000oIO() {
/* 1 */             I101liloIo1 i101liloIo1 = this.I00000oIO;
/* 3 */             String str = this.I00000oOI;
/* 5 */             i101liloIo1.I00000oIO(str);
/* 8 */             FirebaseAnalytics firebaseAnalyticsI00000oIO = iOIii1ooOi0I.I00000oIO();
/* 12 */            if (firebaseAnalyticsI00000oIO != null) {
/* 16 */                Bundle bundle = new Bundle();
/* 21 */                bundle.putString("link_destination", str);
/* 26 */                firebaseAnalyticsI00000oIO.I00000oIO("resource_link_click", bundle);
                    }
                }
            }
