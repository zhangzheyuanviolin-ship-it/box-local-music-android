            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.android.gms.internal.mlkit_genai_speech.zzaen;
            import com.google.android.gms.internal.mlkit_genai_speech.zzaeo;
            import p000.I000II;
            
            public abstract class zzaen<MessageType extends zzaeo<MessageType, BuilderType>, BuilderType extends zzaen<MessageType, BuilderType>> implements zzahm {
                @Override
                public abstract zzaen zzf();

                public abstract zzaen zzg(zzaeo zzaeoVar);

                @Override
                public final zzahm zzh(zzahn zzahnVar) {
/* 13 */            if (zzp().getClass().isInstance(zzahnVar)) {
/* 17 */                return zzg((zzaeo) zzahnVar);
                    }
/* 24 */            I000II.I000iOII("mergeFrom(MessageLite) can only merge messages of the same type.");
/* 27 */            return null;
                }

                @Override
                public zzahm zzi(zzafh zzafhVar, zzafr zzafrVar) {
/* 37 */            throw null;
                }
            }
