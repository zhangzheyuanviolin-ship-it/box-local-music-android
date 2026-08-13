            package p000;

            import android.content.Context;
            
            public final class Oio1Iol10 implements IllOOo00lI {
                public final int I00iOIl;
                public OI10i0Il I00iiI;
                public Context I00iiO;
                public OI10i0Il I00iio;

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 120 */                   OI10i0Il oI10i0Il = this.I00iiI;
/* 122 */                   Context context = this.I00iiO;
/* 124 */                   OI10i0Il oI10i0Il2 = this.I00iio;
/* 126 */                   oI10i0Il.setValue(null);
/* 131 */                   Oo0oii.I000OOo1O.setValue(null);
/* 148 */                   context.getSharedPreferences("box_settings", 0).edit().putString("chat_font", "").apply();
/* 153 */                   oI10i0Il2.setValue(Boolean.FALSE);
                            break;
                        case 1:
/* 83 */                    OI10i0Il oI10i0Il3 = this.I00iiI;
/* 85 */                    Context context2 = this.I00iiO;
/* 87 */                    OI10i0Il oI10i0Il4 = this.I00iio;
/* 89 */                    oI10i0Il3.setValue(null);
/* 94 */                    Oo0oii.I000OiO.setValue(null);
/* 111 */                   context2.getSharedPreferences("box_settings", 0).edit().putString("quick_actions_font", "").apply();
/* 116 */                   oI10i0Il4.setValue(Boolean.FALSE);
                            break;
                        case 2:
/* 46 */                    OI10i0Il oI10i0Il5 = this.I00iiI;
/* 48 */                    Context context3 = this.I00iiO;
/* 50 */                    OI10i0Il oI10i0Il6 = this.I00iio;
/* 52 */                    oI10i0Il5.setValue(null);
/* 57 */                    Oo0oii.I000iOII.setValue(null);
/* 74 */                    context3.getSharedPreferences("box_settings", 0).edit().putString("category_tabs_font", "").apply();
/* 79 */                    oI10i0Il6.setValue(Boolean.FALSE);
                            break;
                        default:
/* 14 */                    Context context4 = this.I00iiO;
/* 16 */                    OI10i0Il oI10i0Il7 = this.I00iiI;
/* 18 */                    OI10i0Il oI10i0Il8 = this.I00iio;
/* 34 */                    context4.getSharedPreferences("box_settings", 0).edit().remove("tts_voice_name").apply();
/* 37 */                    oI10i0Il7.setValue(null);
/* 42 */                    oI10i0Il8.setValue(Boolean.FALSE);
                            break;
                    }
/* 45 */            return ooiIlOl1iI;
                }
            }
