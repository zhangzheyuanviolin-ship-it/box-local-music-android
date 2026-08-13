            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.content.Intent;
            import android.os.UserHandle;
            
            public final class zzazo {
                Intent zza;
                UserHandle zzb;

                public final zzazo zza(Intent intent) {
/* 5 */             this.zza = intent.cloneFilter();
/* 29 */            return this;
                }

                public final zzazo zzb(UserHandle userHandle) {
/* 1 */             this.zzb = userHandle;
/* 29 */            return this;
                }

                public final zzazq zzc() {
/* 10 */            zzgo.zzn(this.zza != null, "Required property 'bindIntent' unset");
/* 20 */            return new zzazq(this.zza, this.zzb);
                }
            }
