            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Map;
            import p000.I000II;
            
            final class zzagt implements Map.Entry {
                private final Map.Entry zza;

                @Override
                public final Object getKey() {
/* 3 */             return this.zza.getKey();
                }

                @Override
                public final Object getValue() {
/* 7 */             zzagw zzagwVar = (zzagw) this.zza.getValue();
/* 10 */            if (zzagwVar == null) {
/* 9 */                 return null;
                    }
/* 13 */            zzagwVar.zzd(null);
/* 16 */            return zzagwVar.zza;
                }

                @Override
                public final Object setValue(Object obj) {
/* 3 */             if (obj instanceof zzahn) {
/* 15 */                return ((zzagw) this.zza.getValue()).zzc((zzahn) obj);
                    }
/* 22 */            I000II.I000iOII("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
/* 25 */            return null;
                }

                public final zzagw zza() {
/* 7 */             return (zzagw) this.zza.getValue();
                }
            }
