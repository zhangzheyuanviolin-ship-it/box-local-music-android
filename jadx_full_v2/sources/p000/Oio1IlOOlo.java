            package p000;

            import android.content.Context;
            
            public final class Oio1IlOOlo implements IllOOo00lI {
                public OI10i0Il I00iOIl;
                public float I00iiI;
                public Context I00iiO;
                public OI10i0Il I00iio;

                @Override
                public final Object invoke() {
/* 1 */             OI10i0Il oI10i0Il = this.I00iOIl;
/* 3 */             float f = this.I00iiI;
/* 5 */             Context context = this.I00iiO;
/* 7 */             OI10i0Il oI10i0Il2 = this.I00iio;
/* 13 */            oI10i0Il.setValue(Float.valueOf(f));
/* 33 */            context.getSharedPreferences("box_settings", 0).edit().putFloat("boxassist_speech_rate", f).apply();
/* 38 */            oI10i0Il2.setValue(Boolean.FALSE);
/* 41 */            return OoiIlOl1iI.I00000oIO;
                }
            }
