            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.IoOOl0iOl1io;
            
            final class zzhp extends zzib {
                private final Object zza;
                private boolean zzb;

                public zzhp(Object obj) {
/* 4 */             this.zza = obj;
                }

                @Override
                public final boolean hasNext() {
                    return !this.zzb;
                }

                @Override
                public final Object next() {
/* 3 */             if (this.zzb) {
/* 11 */                IoOOl0iOl1io.I00000oOI();
/* 14 */                return null;
                    }
/* 6 */             this.zzb = true;
/* 8 */             return this.zza;
                }
            }
