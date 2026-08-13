            package p000;

            import android.util.Log;
            import com.google.firebase.analytics.FirebaseAnalytics;
            
            public abstract class iOIii1ooOi0I {
                public static boolean I00000oIO;

                public static final FirebaseAnalytics I00000oIO() {
                    Object objI00000oIO;
                    try {
/* 3 */                 if (Ii11O1o111i.I00000oIO == null) {
                            synchronized (Ii11O1o111i.I00000oOI) {
/* 10 */                        if (Ii11O1o111i.I00000oIO == null) {
/* 12 */                            IlIoliIO ilIoliIOI00000oOI = IlIoliIO.I00000oOI();
/* 16 */                            ilIoliIOI00000oOI.I00000oIO();
/* 25 */                            Ii11O1o111i.I00000oIO = FirebaseAnalytics.getInstance(ilIoliIOI00000oOI.I00000oIO);
                                }
                            }
                        }
/* 34 */                objI00000oIO = Ii11O1o111i.I00000oIO;
                    } catch (Throwable th) {
/* 38 */                objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                    }
/* 42 */            Throwable thI00000oOI = Oi10ii.I00000oOI(objI00000oIO);
/* 46 */            if (thI00000oOI != null && !I00000oIO) {
/* 53 */                I00000oIO = true;
/* 59 */                Log.w("AGAnalyticsFirebase", "Firebase Analytics is not available", thI00000oOI);
                    }
/* 64 */            if (objI00000oIO instanceof Oi10Ii1i1lo) {
/* 66 */                objI00000oIO = null;
                    }
/* 67 */            return (FirebaseAnalytics) objI00000oIO;
                }
            }
