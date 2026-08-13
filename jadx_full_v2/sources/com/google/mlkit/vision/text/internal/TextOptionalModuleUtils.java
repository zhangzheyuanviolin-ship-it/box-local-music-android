            package com.google.mlkit.vision.text.internal;

            import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;
            import p000.IlIII1l;
            import p000.OIiil10iiO;
            
            public final class TextOptionalModuleUtils {
                private TextOptionalModuleUtils() {
                }

                public static IlIII1l[] zza(TextRecognizerOptionsInterface textRecognizerOptionsInterface) {
/* 5 */             if (textRecognizerOptionsInterface.getIsThickClient()) {
/* 7 */                 return OIiil10iiO.I00000oIO;
                    }
                    switch (textRecognizerOptionsInterface.getLoggingLanguageOption()) {
                        case 2:
/* 54 */                    return new IlIII1l[]{OIiil10iiO.I0000oI00};
                        case 3:
/* 47 */                    return new IlIII1l[]{OIiil10iiO.I000II};
                        case 4:
/* 40 */                    return new IlIII1l[]{OIiil10iiO.I000O01llI0};
                        case 5:
/* 33 */                    return new IlIII1l[]{OIiil10iiO.I000OOo1O};
                        case 6:
                        case 7:
                        case 8:
/* 26 */                    return new IlIII1l[]{OIiil10iiO.I0001Ioi1lo};
                        default:
/* 19 */                    return new IlIII1l[]{OIiil10iiO.I0000O};
                    }
                }
            }
