            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.content.Context;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class zzadx implements zzadu {
                final List zza;

                public zzadx(Context context, zzadw zzadwVar) {
/* 6 */             ArrayList arrayList = new ArrayList();
/* 9 */             this.zza = arrayList;
/* 15 */            if (zzadwVar.zzc()) {
/* 22 */                arrayList.add(new zzaeh(context, zzadwVar));
                    }
                }

                @Override
                public final void zza(zzadt zzadtVar) {
/* 3 */             Iterator it = this.zza.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                ((zzadu) it.next()).zza(zzadtVar);
                    }
                }
            }
