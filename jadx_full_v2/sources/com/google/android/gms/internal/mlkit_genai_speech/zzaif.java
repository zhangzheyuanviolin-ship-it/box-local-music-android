            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Iterator;
            import java.util.Map;
            import java.util.Objects;
            import p000.I000II;
            
            final class zzaif implements Iterator {
                final zzaii zza;
                private int zzb;
                private boolean zzc;
                private Iterator zzd;

                public zzaif(zzaii zzaiiVar, zzaih zzaihVar) {
/* 1 */             Objects.requireNonNull(zzaiiVar);
/* 4 */             this.zza = zzaiiVar;
/* 10 */            this.zzb = -1;
                }

                private final Iterator zza() {
/* 1 */             Iterator it = this.zzd;
/* 3 */             if (it != null) {
/* 55 */                return it;
                    }
/* 15 */            Iterator it2 = this.zza.zzc.entrySet().iterator();
/* 19 */            this.zzd = it2;
/* 55 */            return it2;
                }

                @Override
                public final boolean hasNext() {
/* 4 */             int i = this.zzb + 1;
/* 5 */             zzaii zzaiiVar = this.zza;
/* 11 */            if (i >= zzaiiVar.zzb) {
                        return !zzaiiVar.zzc.isEmpty() && zza().hasNext();
                    }
/* 3 */             return true;
                }

                @Override
                public final Object next() {
/* 2 */             this.zzc = true;
/* 6 */             int i = this.zzb + 1;
/* 7 */             this.zzb = i;
/* 9 */             zzaii zzaiiVar = this.zza;
                    return i < zzaiiVar.zzb ? (zzaie) zzaiiVar.zza[i] : (Map.Entry) zza().next();
                }

                @Override
                public final void remove() {
/* 3 */             if (!this.zzc) {
/* 39 */                I000II.I001IO000("remove() was called before next()");
/* 55 */                return;
                    }
/* 6 */             this.zzc = false;
/* 8 */             zzaii zzaiiVar = this.zza;
/* 1 */             zzaiiVar.zzo();
/* 13 */            int i = this.zzb;
/* 19 */            if (i >= zzaiiVar.zzb) {
/* 33 */                zza().remove();
                    } else {
/* 23 */                this.zzb = i - 1;
/* 1 */                 zzaiiVar.zzm(i);
                    }
                }
            }
