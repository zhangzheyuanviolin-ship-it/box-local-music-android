            package p000;

            import android.content.Context;
            import android.text.TextUtils;
            import androidx.work.multiprocess.RemoteWorkManagerClient;
            
            public abstract class Oi00O10io {
                public static Oi00O10io I00000oIO(Context context) {
/* 1 */             i01IlOO i01ilooI00000oOI = i01IlOO.I00000oOI(context);
/* 7 */             if (i01ilooI00000oOI.I000OiO == null) {
                        synchronized (i01IlOO.I000o00OoI0I) {
                            try {
/* 14 */                        if (i01ilooI00000oOI.I000OiO == null) {
                                    try {
/* 18 */                                String str = RemoteWorkManagerClient.I000OOo1O;
/* 44 */                                i01ilooI00000oOI.I000OiO = (Oi00O10io) RemoteWorkManagerClient.class.getConstructor(Context.class, i01IlOO.class).newInstance(i01ilooI00000oOI.I00000oIO, i01ilooI00000oOI);
                                    } catch (Throwable unused) {
/* 51 */                                IIi0oIl.I000II().getClass();
                                    }
/* 56 */                            if (i01ilooI00000oOI.I000OiO == null && !TextUtils.isEmpty(i01ilooI00000oOI.I00000oOI.I000O01llI0)) {
/* 76 */                                throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
/* 83 */            Oi00O10io oi00O10io = i01ilooI00000oOI.I000OiO;
/* 85 */            if (oi00O10io != null) {
/* 87 */                return oi00O10io;
                    }
/* 90 */            I000II.I001IO000("Unable to initialize RemoteWorkManager");
/* 93 */            return null;
                }
            }
