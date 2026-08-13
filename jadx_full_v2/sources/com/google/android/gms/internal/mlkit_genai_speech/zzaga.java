            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.android.gms.internal.mlkit_genai_speech.zzaga;
            import com.google.android.gms.internal.mlkit_genai_speech.zzagg;
            import java.io.IOException;
            import p000.I000II;
            
            public class zzaga<MessageType extends zzagg<MessageType, BuilderType>, BuilderType extends zzaga<MessageType, BuilderType>> extends zzaen<MessageType, BuilderType> {
                protected zzagg zza;
                private final zzagg zzb;

                public zzaga(MessageType messagetype) {
/* 4 */             this.zzb = messagetype;
/* 10 */            if (messagetype.zzG()) {
/* 21 */                I000II.I000iOII("Default instance must be immutable.");
/* 29 */                throw null;
                    }
/* 16 */            this.zza = messagetype.zzt();
                }

                private static void zza(Object obj, Object obj2) {
/* 13 */            zzahw.zza().zzb(obj.getClass()).zze(obj, obj2);
                }

                @Override
                public final zzaen zzg(zzaeo zzaeoVar) {
/* 3 */             zzk((zzagg) zzaeoVar);
/* 29 */            return this;
                }

                @Override
                public final zzahm zzi(zzafh zzafhVar, zzafr zzafrVar) throws IOException {
/* 7 */             if (!this.zza.zzG()) {
/* 9 */                 zzr();
                    }
                    try {
/* 32 */                zzahw.zza().zzb(this.zza.getClass()).zzf(this.zza, zzafi.zzq(zzafhVar), zzafrVar);
/* 35 */                return this;
                    } catch (RuntimeException e) {
/* 43 */                if (e.getCause() instanceof IOException) {
/* 51 */                    throw ((IOException) e.getCause());
                        }
/* 106 */               throw e;
                    }
                }

                @Override
                public final zzaga zzf() {
/* 9 */             zzaga zzagaVar = (zzaga) this.zzb.zzb(5, null, null);
/* 15 */            zzagaVar.zza = zzo();
/* 20 */            return zzagaVar;
                }

                public final zzaga zzk(zzagg zzaggVar) {
/* 7 */             if (!this.zzb.equals(zzaggVar)) {
/* 15 */                if (!this.zza.zzG()) {
/* 17 */                    zzr();
                        }
/* 22 */                zza(this.zza, zzaggVar);
                    }
/* 29 */            return this;
                }

                @Override
                public final MessageType zzn() {
/* 1 */             MessageType messagetype = (MessageType) zzo();
/* 9 */             if (messagetype.zzs()) {
/* 11 */                return messagetype;
                    }
/* 20 */            throw new zzail(messagetype);
                }

                @Override
                public MessageType zzo() {
/* 3 */             boolean zZzG = this.zza.zzG();
/* 7 */             MessageType messagetype = (MessageType) this.zza;
/* 9 */             if (!zZzG) {
/* 11 */                return messagetype;
                    }
/* 12 */            messagetype.zzB();
/* 15 */            return (MessageType) this.zza;
                }

                @Override
                public final zzahn zzp() {
/* 1 */             return this.zzb;
                }

                public final void zzq() {
/* 7 */             if (this.zza.zzG()) {
/* 20 */                return;
                    }
/* 9 */             zzr();
                }

                public void zzr() {
/* 3 */             zzagg zzaggVarZzt = this.zzb.zzt();
/* 9 */             zza(zzaggVarZzt, this.zza);
/* 12 */            this.zza = zzaggVarZzt;
                }

                @Override
                public final boolean zzs() {
/* 2 */             return zzagg.zze(this.zza, false);
                }
            }
