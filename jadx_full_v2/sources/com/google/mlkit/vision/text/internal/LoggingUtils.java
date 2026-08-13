            package com.google.mlkit.vision.text.internal;

            import java.lang.invoke.VarHandle;
            import p000.I00Ol00;
            import p000.I0Oi111ii;
            import p000.liOi0IoI0i;
            import p000.liOiOolii;
            import p000.liOll1O;
            import p000.lloiiiOi10;
            import p000.lo0I10I;
            import p000.loioOil;
            import p000.lolloooO;
            import p000.loloOlli1l0;
            
            public final class LoggingUtils {
                private LoggingUtils() {
                }

                public static lo0I10I zza(int i) {
                    switch (i) {
                        case 1:
/* 28 */                    return lo0I10I.LATIN;
                        case 2:
/* 25 */                    return lo0I10I.LATIN_AND_CHINESE;
                        case 3:
/* 22 */                    return lo0I10I.LATIN_AND_DEVANAGARI;
                        case 4:
/* 19 */                    return lo0I10I.LATIN_AND_JAPANESE;
                        case 5:
/* 16 */                    return lo0I10I.LATIN_AND_KOREAN;
                        case 6:
/* 13 */                    return lo0I10I.CREDIT_CARD;
                        case 7:
/* 10 */                    return lo0I10I.DOCUMENT;
                        case 8:
/* 7 */                     return lo0I10I.PIXEL_AI;
                        default:
/* 4 */                     return lo0I10I.TYPE_UNKNOWN;
                    }
                }

                public static void zzb(loloOlli1l0 loloolli1l0, final boolean z, final liOiOolii lioioolii) {
/* 8 */             loloolli1l0.I0000Il00O(new lolloooO() {
                        @Override
                        public final loioOil zza() {
/* 5 */                     I0Oi111ii i0Oi111ii = new I0Oi111ii(17);
/* 15 */                    liOi0IoI0i lioi0ioi0i = z ? liOi0IoI0i.TYPE_THICK : liOi0IoI0i.TYPE_THIN;
/* 17 */                    liOiOolii lioioolii2 = lioioolii;
/* 19 */                    i0Oi111ii.I00iio = lioi0ioi0i;
/* 23 */                    lloiiiOi10 lloiiioi10 = new lloiiiOi10();
/* 26 */                    lloiiioi10.I00000oIO = lioioolii2;
/* 28 */                    VarHandle.storeStoreFence();
/* 31 */                    i0Oi111ii.I00ilO0 = lloiiioi10;
/* 36 */                    return new I00Ol00(i0Oi111ii, 0, (char) 0);
                        }
                    }, liOll1O.ON_DEVICE_TEXT_LOAD);
                }
            }
