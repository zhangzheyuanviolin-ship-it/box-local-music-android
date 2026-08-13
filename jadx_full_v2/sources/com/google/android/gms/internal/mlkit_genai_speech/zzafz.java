            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.I000II;
            import p000.OIiilo1Ool0o;
            
            final class zzafz implements zzahl {
                private static final zzafz zza = new zzafz();

                private zzafz() {
                }

                public static zzafz zza() {
/* 1 */             return zza;
                }

                @Override
                public final zzahk zzb(Class cls) {
/* 8 */             if (!zzagg.class.isAssignableFrom(cls)) {
/* 51 */                I000II.I000iOII("Unsupported message type: ".concat(cls.getName()));
/* 7 */                 return null;
                    }
                    try {
/* 23 */                return (zzahk) zzagg.zzr(cls.asSubclass(zzagg.class)).zzb(3, null, null);
                    } catch (Exception e) {
/* 37 */                OIiilo1Ool0o.I000iOII("Unable to get message info for ".concat(cls.getName()), e);
/* 7 */                 return null;
                    }
                }

                @Override
                public final boolean zzc(Class cls) {
/* 3 */             return zzagg.class.isAssignableFrom(cls);
                }
            }
